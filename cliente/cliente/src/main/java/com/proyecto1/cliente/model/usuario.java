/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto1.cliente.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

 
 @Entity
 @Data
 
public class usuario {
   @Id
   @Column
   private Long iduser;
   @Column
   
   private String nomuser;
   @Column
     
   private String apellido;
   @Column
       
   private String email;
   


    
}

