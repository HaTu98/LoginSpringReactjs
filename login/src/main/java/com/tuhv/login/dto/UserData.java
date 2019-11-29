package com.tuhv.login.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserData {
    private String username;
    private String password;
}
