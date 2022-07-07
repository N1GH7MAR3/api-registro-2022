
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    @Query("select cl from Cliente cl where cl.estado='1'")
    List<Cliente> findAllCustom();
    
    @Query("select cl from Cliente cl where upper(cl.nombre) like upper(:nombre) and cl.estado='1'")
    List<Cliente> findByName(@Param("nombre") String nombre);
    
}
