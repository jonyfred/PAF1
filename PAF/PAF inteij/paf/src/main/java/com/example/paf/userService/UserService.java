package com.example.paf.userService;

import com.example.paf.dto.UserRegistrarDto;
import com.example.paf.model.UserModel;
import com.example.paf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registrarUsuario(UserRegistrarDto userRegistrarDto) {
        UserModel userModel = new UserModel();
        userModel.setNome(userRegistrarDto.nome());
        userModel.setEmail(userRegistrarDto.email()); // Mapear o email
        userModel.setValor(userRegistrarDto.valor());

        userRepository.save(userModel);
    }
}