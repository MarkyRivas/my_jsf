package com.devpredator.projectjsf.services;

import com.devpredator.projectjsf.entity.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
    public  List<Empleado> consultarEmpleados(){
        //Generar la lista de empleados a consultar.
    List<Empleado> empleados= new ArrayList<Empleado>();

    // Generar algunos empleados
        Empleado empleadoIBM = new Empleado();
        Empleado empleadoMicrosoft = new Empleado();
        Empleado empleadoApple = new Empleado();

        empleadoIBM.setEstatus(true);
        empleadoIBM.setNombre("Markus");
        empleadoIBM.setPrimerApellido("Dantus");
        empleadoIBM.setSegundoApellido("Marquez");
        empleadoIBM.setPuesto("Guardameta");

        empleadoMicrosoft.setEstatus(true);
        empleadoMicrosoft.setNombre("Rodrigo");
        empleadoMicrosoft.setPrimerApellido("Gonzales");
        empleadoMicrosoft.setSegundoApellido("Rodriguez");
        empleadoMicrosoft.setPuesto("Defensa");

        empleadoApple.setEstatus(true);
        empleadoApple.setNombre("Miguel");
        empleadoApple.setPrimerApellido("Asuncion");
        empleadoApple.setSegundoApellido("Detostenes");
        empleadoApple.setPuesto("Medio");

        empleados.add(empleadoIBM);
        empleados.add(empleadoMicrosoft);
        empleados.add(empleadoApple);

        return empleados;
    }
}
