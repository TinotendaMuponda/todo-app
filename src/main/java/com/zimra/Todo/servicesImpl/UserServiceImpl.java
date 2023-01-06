package com.zimra.Todo.servicesImpl;

import com.zimra.Todo.dtos.UserDTO;
import com.zimra.Todo.mapper.UserDTOMapper;
import com.zimra.Todo.models.User;
import com.zimra.Todo.repositories.UserRepository;
import com.zimra.Todo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDTOMapper userDTOMapper;


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userRepository.save(userDTOMapper.dtoToUser(userDTO));
        return userDTOMapper.userToDTO(user);
    }
}
