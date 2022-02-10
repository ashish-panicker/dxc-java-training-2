package com.dxc.learning.demoapp1.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotBlank(message = "User name is mandatory")
    private String name;
    
    @NotBlank(message = "User email is mandatory")
    private String email;

    @NotBlank(message = "User password is mandatory")
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
    private String password;    
}
