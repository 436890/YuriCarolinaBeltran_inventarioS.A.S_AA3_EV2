
package com.proyecto1.cliente.model;

// clases para elaborar la entidad de la aplicación 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

 
 @Entity
 @Data
 
public class usuario {
   @Id
   @Column(name="idusuario")
   private Long iduser;
   
   @Column(name="Nombres", nullable=false, length=10)
   private String nomuser;
   
   @Column(nullable=false)
   private String apellido;
   
   @Column(unique=true, nullable=false)
   private String email;
   


    
}

