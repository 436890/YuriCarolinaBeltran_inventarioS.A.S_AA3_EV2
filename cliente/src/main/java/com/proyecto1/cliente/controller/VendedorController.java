
package com.proyecto1.cliente.controller;

import com.proyecto1.cliente.model.Vendedor;
import com.proyecto1.cliente.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Vendedor")
public class VendedorController {
  
    

    @Autowired
    private VendedorService VendedorService; 
   
    @PostMapping("/nuevo")
    public Vendedor newvendedor(@RequestBody Vendedor newvendedor){
        return this.VendedorService.newvendedor(newvendedor);
        
    }
    
    @GetMapping("/mostrar")
    public Iterable<Vendedor> getALL(){
        return VendedorService.getAll();    
    
    }
    
    @PostMapping("/modificar")
    public Vendedor updatevendedor(@RequestBody Vendedor vendedor){
        return this.VendedorService.modifyvendedor(vendedor);

    }
    
    @PostMapping (value="/{id}")
    public Boolean deletevendedor(@PathVariable(value="id")Long id) {
        return this.VendedorService.deletevendedor(id); 
    
    }
 }



