package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;

import java.util.Scanner;

/**
 * Created by luks on 17/10/16.
 */
public class ClienteHelper {

    Scanner tecladoCliente;

    public ClienteHelper() {

        this.tecladoCliente = new Scanner(System.in);
    }

    public static void crearCliente() {
        System.out.println("Arranca Crear Cliente");
        Cliente cliente = new Cliente();
        cliente.setNombre("Stefan");

        System.out.println(cliente);
    }


}
