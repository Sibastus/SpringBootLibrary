package com.library.core.mappers;


import com.library.core.dto.LibraryUserDto;
import com.library.core.entities.LibraryUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface LibraryUserMapper {

    LibraryUserMapper MAPPER = Mappers.getMapper(LibraryUserMapper.class);


    LibraryUserDto convertLibraryUserToLibraryUserDto (LibraryUser user);

    @Mapping(target = "id", ignore = true)
    LibraryUser convertLibraryUserDtoToLibraryUser (LibraryUserDto libraryUserDto);

}
