

package com.rashi.userservice.service;

import com.rashi.userservice.dto.UserDTO;
import com.rashi.userservice.util.RoleType;

import java.util.List;

public interface UserService {
    void userSave(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    UserDTO userFindByEmail(String userId);
    void deleteUser(String userEmail);
    List<UserDTO> getAllUsers();

    int countByRoleType(RoleType roleType);

    String getLastIndex();
    boolean existByEmail(String email);

    boolean existsById(String id);

}
