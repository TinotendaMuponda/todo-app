package com.zimra.Todo.dtos;


import com.zimra.Todo.models.Todo;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String name;
    private String password;
    private String email;
}
