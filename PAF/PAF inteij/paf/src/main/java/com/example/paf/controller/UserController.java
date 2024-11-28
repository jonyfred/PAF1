package com.example.paf.controller;


import com.example.paf.dto.UserRegistrarDto;
import com.example.paf.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utilizador")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/registrar")
    public String registrarUsuario(@RequestBody UserRegistrarDto userRegistrarDto) {
        userService.registrarUsuario(userRegistrarDto);
        return "Utilizador registrado com sucesso!";
    }
}
