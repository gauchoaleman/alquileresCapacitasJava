package edu.capacitas.test;

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

        System.out.println("** Test de Recursos");
        RecursoHelper.crearRecurso();

    }
}
