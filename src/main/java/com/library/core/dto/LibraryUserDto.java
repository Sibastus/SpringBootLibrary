package com.library.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryUserDto {

    private String login;

    private String password;

    private String email;

    private boolean active;
}
