/**
 * Created By Isuru Prabhath
 * Date : 10/22/2023
 * Time : 2:27 AM
 * Project Name : userService
 */

package com.rashi.userservice.util;

import com.rashi.userservice.dto.UserDTO;
import com.rashi.userservice.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Convertor {
    @Autowired
    ModelMapper  modelMapper;
    public User userDtoToUserEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
    public UserDTO userEntityToUserDto(User user) {
        return modelMapper.map(user,UserDTO.class);
    }
    public List<UserDTO> userEntityListToUserDTOList(List<User> users){
        return modelMapper.map(users,new TypeToken<List<UserDTO>>(){}.getType());
    }

}
