package com.example.my_dodo.service;

import com.example.my_dodo.model.requests.AuthRequest;
import com.example.my_dodo.model.requests.ValidateEmailReq;

public interface AuthService {

    String auth(AuthRequest request, int lang);

    String validate(ValidateEmailReq request);

    Long getUserIdByToken(String token);

}
