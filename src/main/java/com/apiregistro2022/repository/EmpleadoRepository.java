
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    @Query("select e from Empleado e where e.estado='1'")
    List<Empleado> findAllCustom();
    
    @Query("select e from Empleado e where upper(e.nombre) like upper(:nombre) and e.estado='1'")
    List<Empleado> findByName(@Param("nombre") String nombre);

    
}
