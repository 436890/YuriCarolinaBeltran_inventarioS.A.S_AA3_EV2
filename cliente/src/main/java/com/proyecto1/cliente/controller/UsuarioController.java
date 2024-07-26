
package com.proyecto1.cliente.controller;

//vamos a llamar los metodos de cara a la comunicación a travez de la web

import com.proyecto1.cliente.model.usuario;
import com.proyecto1.cliente.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
   
    @Autowired
    private UsuarioService usuarioService; 
   
    @PostMapping("/nuevo")
    public usuario newusuario(@RequestBody usuario newusuario){
        return this.usuarioService.newusuario (newusuario);
        
    }
    
    @GetMapping("/mostrar")
    public Iterable<usuario> getALL(){
        return usuarioService.getAll();    
    
    }
    
    @PostMapping("/modificar")
    public usuario updateusuario(@RequestBody usuario usuario){
        return this.usuarioService.modifyusuario(usuario);

    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteusuario(@PathVariable(value="id")Long id) {
        return this.usuarioService.deleteusuario(id); 
    
    }
 }
