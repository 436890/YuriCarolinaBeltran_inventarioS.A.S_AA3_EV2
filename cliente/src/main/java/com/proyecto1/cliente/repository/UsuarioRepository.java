
package com.proyecto1.cliente.repository;

// vamos a llamr conexiones con la clase generada 

import com.proyecto1.cliente.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<usuario, Long> { 
    
}

