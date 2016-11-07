package edu.capacitas.test;

import edu.capacitas.domain.Alquiler;
import edu.capacitas.test.helper.AlquilerHelper;
import edu.capacitas.test.helper.ClienteHelper;
import edu.capacitas.test.helper.RecursoHelper;

/**
 * Created by luks on 17/10/16.
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("*  TEST Aplicacion - Alquileres Capacitas     *");
        System.out.println("***********************************************");

        System.out.println("** Test de Clientes");
        ClienteHelper.crearCliente();
        ClienteHelper.modificarCliente();
        ClienteHelper.listarClientes();


        System.out.println("** Test de Recursos");
        RecursoHelper.crearRecurso();
        RecursoHelper.modificarRecurso();
        RecursoHelper.listarRecurso();
        // TODO listarRecursos();

        System.out.println("** Test de Alquiler");
        AlquilerHelper.crearAlquiler();
        AlquilerHelper.listarAlquileres();
        AlquilerHelper.mostrarFacturaAlquiler(AlquilerHelper.obtenerAlquiler());


    }
}
