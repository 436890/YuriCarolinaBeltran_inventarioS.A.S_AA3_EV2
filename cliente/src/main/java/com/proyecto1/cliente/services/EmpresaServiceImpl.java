
package com.proyecto1.cliente.services;


import com.proyecto1.cliente.model.Empresa;
import com.proyecto1.cliente.repository.EmpresaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class EmpresaServiceImpl implements EmpresaService{
     
     @Autowired
    private EmpresaRepository EmpresaRepository;

    @Override
    public Empresa newempresa(Empresa newEmpresa) {
        return EmpresaRepository.save(newEmpresa);
                  
    }

    @Override
    public Iterable<Empresa> getAll() {
        return this.EmpresaRepository.findAll() ;  
    }

    @Override
    public Empresa modifyempresa(Empresa empresa) {
        
        Optional<Empresa>  empresaEncontrado= this.EmpresaRepository.findById(empresa.getIduser());
        if(empresaEncontrado.get()!=null) {
           empresaEncontrado.get().setNomuser(empresa.getNomuser());
           empresaEncontrado.get().setApellido(empresa.getApellido());
           empresaEncontrado.get().setEmail(empresa.getEmail());
           return this.newempresa(empresaEncontrado.get());
           
         }
        
        return null;  
    }

    @Override
    public Boolean deleteempresa(Long iduser) {
          this.EmpresaRepository.deleteById(iduser);  
          return true;
 

    }
 }