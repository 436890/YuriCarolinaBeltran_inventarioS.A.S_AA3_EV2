
package com.proyecto1.cliente.repository;

// vamos a llamr conexiones con la clase generada 

import com.proyecto1.cliente.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> { 
    
}
