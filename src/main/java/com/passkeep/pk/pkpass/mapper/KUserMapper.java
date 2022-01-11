package com.passkeep.pk.pkpass.mapper;

import com.passkeep.pk.pkpass.dto.UserDTO;
import com.passkeep.pk.pkpass.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface KUserMapper {

  User getEntityFromDto(UserDTO source);

  UserDTO getDtoFromEntity(User source);

}
