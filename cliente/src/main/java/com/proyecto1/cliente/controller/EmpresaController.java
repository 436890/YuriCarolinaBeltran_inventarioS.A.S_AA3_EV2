
package com.proyecto1.cliente.controller;

import com.proyecto1.cliente.model.Empresa;
import com.proyecto1.cliente.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Empresa")
public class EmpresaController {
   
    @Autowired
    private EmpresaService EmpresaService; 
   
    @PostMapping("/nuevo")
    public Empresa newempresa(@RequestBody Empresa newempresa){
        return this.EmpresaService.newempresa(newempresa);
        
    }
    
    @GetMapping("/mostrar")
    public Iterable<Empresa> getALL(){
        return EmpresaService.getAll();    
    
    }
    
    @PostMapping("/modificar")
    public Empresa updateempresa(@RequestBody Empresa empresa){
        return this.EmpresaService.modifyempresa(empresa);

    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteempresa(@PathVariable(value="id")Long id) {
        return this.EmpresaService.deleteempresa(id); 
    
    }
 }


    

