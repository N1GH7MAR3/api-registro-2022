
package com.apiregistro2022.serrvice.impl;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.repository.EmpleadoRepository;
import com.apiregistro2022.serrvice.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return empleadoRepository.findAllCustom();
    }

    @Override
    public List<Empleado> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return empleadoRepository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objempleado=empleadoRepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objempleado);
        return empleadoRepository.save(objempleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objempleado=empleadoRepository.getById(e.getCodigo());
        objempleado.setEstado(false);
        return empleadoRepository.save(objempleado);
    }
    
}
