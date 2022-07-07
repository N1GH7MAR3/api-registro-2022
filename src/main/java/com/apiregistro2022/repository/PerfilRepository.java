
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    @Query("select pe from Perfil pe where pe.estado='1'")
    List<Perfil> findAllCustom();
    
    @Query("select pe from Perfil pe where upper(pe.nombre) like upper(:nombre) and pe.estado='1'")
    List<Perfil> findByName(@Param("nombre") String nombre);
    
}
