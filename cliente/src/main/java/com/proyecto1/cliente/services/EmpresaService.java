
package com.proyecto1.cliente.services;

import com.proyecto1.cliente.model.Empresa;


    //  Generar componentes para crear eliminar actualizar y consultar   

public interface EmpresaService {
    Empresa newempresa (Empresa newempresa);
    Iterable<Empresa> getAll();
    Empresa modifyempresa (Empresa empresa);
    Boolean deleteempresa (Long iduser); 
    
    
    }
