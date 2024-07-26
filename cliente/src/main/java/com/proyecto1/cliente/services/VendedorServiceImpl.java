
package com.proyecto1.cliente.services;

import com.proyecto1.cliente.model.Vendedor;
import com.proyecto1.cliente.repository.VendedorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// Definir elementos 
  

@Service
public class VendedorServiceImpl implements VendedorService{

    
    @Autowired
    private VendedorRepository VendedorRepository;
    
    @Override
    public Vendedor newvendedor(Vendedor newvendedor) {
        return VendedorRepository.save(newvendedor);
                  
    }

    @Override
    public Iterable<Vendedor> getAll() {
         return this.VendedorRepository.findAll() ;  
    }
 
    
     @Override 
    public Vendedor modifyvendedor(Vendedor vendedor) {
        
        Optional<Vendedor>  vendedorEncontrado= this.VendedorRepository.findById(vendedor.getIduser());
        if(vendedorEncontrado.get()!=null) {
           vendedorEncontrado.get().setNomuser(vendedor.getNomuser());
           vendedorEncontrado.get().setApellido(vendedor.getApellido());
           vendedorEncontrado.get().setEmail(vendedor.getEmail());
           return this.newvendedor(vendedorEncontrado.get());
           
         }
        
        return null;  
    }

    @Override
    public Boolean deletevendedor(Long iduser) {
          this.VendedorRepository.deleteById(iduser);  
          return true;
    }
    
}
