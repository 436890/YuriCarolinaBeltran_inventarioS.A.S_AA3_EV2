
package com.proyecto1.cliente.services;

//  Generar componentes para crear eliminar actualizar y consultar   

import com.proyecto1.cliente.model.usuario;

public interface UsuarioService {
    usuario newusuario (usuario newusuario);
    Iterable<usuario> getAll();
    usuario modifyusuario (usuario Usuario);
    Boolean deleteusuario (Long iduser); 
    
}
