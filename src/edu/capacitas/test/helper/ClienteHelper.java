package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;

/**
 * Created by luks on 17/10/16.
 */
public class ClienteHelper {
    public static void crearCliente() {
        System.out.println("Arranca Crear Cliente");
        Cliente cliente = new Cliente();
        cliente.setNombre("Stefan");
        cliente.setApellido("Ronacher");
        cliente.setEmail("gauchoaleman@yahoo.com");
        cliente.setDni("92844240");
        cliente.setSexo("MASCULINO");

        System.out.println(cliente);
    }


}
