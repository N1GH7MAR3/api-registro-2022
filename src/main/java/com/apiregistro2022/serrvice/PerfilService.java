
package com.apiregistro2022.serrvice;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;


public interface PerfilService {
    
     //Mostrar todo
    List<Perfil> findAll();

    //Mostrar todos los habilitados
    List<Perfil> findAllCustom();

    //Buscar por nombre
    List<Perfil> findbyName();

    //Buscar por codigo
    Optional<Perfil> findById(Long id);

    //Agregar
    Perfil add(Perfil pe);

    //Actualizar
    Perfil update(Perfil pe);

    //Eliminar
    Perfil delete(Perfil pe);

    
}
