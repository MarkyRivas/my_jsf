package com.devpredator.projectjsf.controllers;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;


@ManagedBean
@ViewScoped
public class PrincipalController {
    /**
     * Lista de empleados para la tabla
     */
    private List<Empleado> empleados;

    private EmpleadoService empleadoService = new EmpleadoService();

    @PostConstruct
    public void init() {
    this.consultarEmpleados();
    }

    /**
     * Metodo que consulta lista de empleados .
     */
    public void consultarEmpleados() {
    this.empleados = this.empleadoService.consultarEmpleados();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}

