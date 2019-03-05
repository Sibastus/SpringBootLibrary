package com.library.core.mappers;

import com.library.core.dto.LibraryUserDto;
import com.library.core.entities.LibraryUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
public class LibraryUserMapperTest {

    @Test
    public void convertLibraryUserToDto () {

        LibraryUser user = new LibraryUser(1, "login", "pass", "email", true);

        LibraryUserDto userDto = LibraryUserMapper.MAPPER.convertLibraryUserToLibraryUserDto(user);

        assertThat(userDto).isNotNull();
        assertThat(userDto.getLogin()).isEqualTo("login");
        assertThat(userDto.getPassword()).isEqualTo("pass");
        assertThat(userDto.getEmail()).isEqualTo("email");
        assertThat(userDto.isActive()).isEqualTo(true);
    }

    @Test
    public void convertLibraryUserDtoToEntity () {

        LibraryUserDto userDto = new LibraryUserDto("login", "pass", "email", true);

        LibraryUser user = LibraryUserMapper.MAPPER.convertLibraryUserDtoToLibraryUser(userDto);

        assertThat(user).isNotNull();
        assertThat(user.getLogin()).isEqualTo("login");
        assertThat(user.getPassword()).isEqualTo("pass");
        assertThat(user.getEmail()).isEqualTo("email");
        assertThat(user.isActive()).isEqualTo(true);
    }

}
