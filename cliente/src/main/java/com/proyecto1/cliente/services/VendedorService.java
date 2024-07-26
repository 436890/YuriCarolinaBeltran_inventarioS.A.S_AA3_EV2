
package com.proyecto1.cliente.services;

//  Generar componentes para crear eliminar actualizar y consultar   

import com.proyecto1.cliente.model.Vendedor;


public interface VendedorService {
    Vendedor newvendedor (Vendedor newvendedor);
    Iterable<Vendedor> getAll();
    Vendedor modifyvendedor (Vendedor vendedor);
    Boolean deletevendedor (Long iduser); 
    
}
