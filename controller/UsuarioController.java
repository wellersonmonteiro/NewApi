package dio.web.api.controller;


import dio.web.api.Repository.UserController;
import dio.web.api.model.Usuario;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UserController usuarioRepository;

    @GetMapping("/users")
    public List<Usuario> getUser(){
        return usuarioRepository.findAll();
    };
    @GetMapping("/users/{userName}")
    public Usuario getOne(@PathVariable ("userName") String userName){
        return usuarioRepository.findByUsername(userName);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id){
        usuarioRepository.deleteById(id);
    }
}
