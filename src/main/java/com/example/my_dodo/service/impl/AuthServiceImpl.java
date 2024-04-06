package com.example.my_dodo.service.impl;


import com.example.my_dodo.model.dto.AccountDTO;
import com.example.my_dodo.model.dto.UserDTO;
import com.example.my_dodo.model.requests.AuthRequest;
import com.example.my_dodo.model.requests.ValidateEmailReq;
import com.example.my_dodo.service.AccountService;
import com.example.my_dodo.service.AuthService;
import com.example.my_dodo.service.MailService;
import com.example.my_dodo.service.UserService;
import com.example.my_dodo.util.JwtProvider;
import com.example.my_dodo.util.Language;
import com.example.my_dodo.util.ResourceBundleLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final JwtProvider jwtProvider;
    private final AccountService accountService;
    private final UserService userService;
    private final MailService mailService;

    @Override
    public String auth(AuthRequest request, int lang) {

        AccountDTO accountDTO = accountService.findByEmail(request.getEmail());

        Random random = new Random();
        int tempPsw = 100000 + random.nextInt(900000);
        String messageToSend = "your temporary password is " + String.valueOf(tempPsw);

        if (accountDTO == null) {
            mailService.send(request.getEmail(), messageToSend);

            AccountDTO newAccount = new AccountDTO();
            newAccount.setEmail(request.getEmail());
            newAccount.setApproved(false);
            newAccount.setDateTimeOfPassword(LocalDateTime.now());
            newAccount.setTempPassword(tempPsw);

            accountService.save(newAccount);

            UserDTO newUser = new UserDTO();

            newUser.setName(request.getName());
            newUser.setPhone(request.getPhone());
            newUser.setAccount(newAccount);
            newUser.setDodoCoins(0.0);

            userService.save(newUser);

        }

        else {
            mailService.send(request.getEmail(), messageToSend);
            accountDTO.setTempPassword(tempPsw);
            accountDTO.setApproved(false);
            accountDTO.setDateTimeOfPassword(LocalDateTime.now());
            accountService.update(accountDTO);

        }

        return ResourceBundleLanguage.periodMessage(Language.getLanguage(lang), "ready");

    }

    @Override
    public String validate(ValidateEmailReq request) {
        AccountDTO accountDTO = accountService.findByEmail(request.getEmail());
        if (request.getPassword().equals(accountDTO.getTempPassword()) && !accountDTO.isApproved()) {
            if (Duration.between(accountDTO.getDateTimeOfPassword(), LocalDateTime.now()).toMinutes() <= 5) {

                accountDTO.setApproved(true);
                accountService.update(accountDTO);
                UserDTO userDTO = userService.getByAccountId(accountDTO.getId());

                return jwtProvider.generateAccessToken(userDTO.getId());

            } else throw new RuntimeException("your password has expired");
        } else throw new RuntimeException("Incorrect password");


    }

    @Override
    public Long getUserIdByToken(String token) {
        return jwtProvider.validateToken(token);
    }


}
