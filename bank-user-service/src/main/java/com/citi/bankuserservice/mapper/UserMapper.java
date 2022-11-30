package com.citi.bankuserservice.mapper;

import com.citi.bankuserservice.model.dto.User;
import com.citi.bankuserservice.model.entity.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserMapper extends BaseMapper<UserEntity, User> {
    @Override
    public UserEntity convertToEntity(User dto) {
        UserEntity entity = new UserEntity();
        if(dto != null){
            BeanUtils.copyProperties(dto,entity);
        }
        return entity;
    }

    @Override
    public User convertToDto(UserEntity entity) {
        User dto = new User();
        if(entity != null){
            BeanUtils.copyProperties(entity,dto);
        }
        return dto;
    }
}
