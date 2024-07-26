
  package com.proyecto1.cliente.services;
  
// implementación de sevicios

import com.proyecto1.cliente.model.usuario;
import com.proyecto1.cliente.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Definir elementos 
  

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository UsuarioRepository;
    
    @Override
    public usuario newusuario(usuario newusuario) {
        return UsuarioRepository.save(newusuario);
                  
    }

    @Override
    public Iterable<usuario> getAll() {
         return this.UsuarioRepository.findAll() ;  
    }

    @Override
    public usuario modifyusuario(usuario Usuario) {
        
        Optional<usuario>  usuarioEncontrado= this.UsuarioRepository.findById(Usuario.getIduser());
        if(usuarioEncontrado.get()!=null) {
           usuarioEncontrado.get().setNomuser(Usuario.getNomuser());
           usuarioEncontrado.get().setApellido(Usuario.getApellido());
           usuarioEncontrado.get().setEmail(Usuario.getEmail());
           return this.newusuario(usuarioEncontrado.get());
           
         }
        
        return null;  
    }

    @Override
    public Boolean deleteusuario(Long iduser) {
          this.UsuarioRepository.deleteById(iduser);  
          return true;
    }
    
}
