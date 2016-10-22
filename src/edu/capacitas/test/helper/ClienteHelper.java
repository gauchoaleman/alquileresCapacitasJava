package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Sexo;

/**
 * Created by luks on 17/10/16.
 */
public class ClienteHelper {
    public static void crearCliente() {
        System.out.println("Arranca Crear Cliente");
        Cliente cliente = new Cliente();
        cliente.setId(new Long("1"));
        cliente.setNombre("Stefan");
        cliente.setApellido("Ronacher");
        cliente.setEmail("gauchoaleman@yahoo.com");
        cliente.setDni("92844240");
        // FIXME
        /*Sexo sexo = new Sexo;
        Sexo =Sexo.MASCULINO;
        cliente.setSexo(Sexo);
        */
        System.out.println(cliente);
    }

    public static void modificarCliente() {
        System.out.println("Test modificarCliente()");
        // La idea es mostrar cambios en una misma instancia
        Cliente cliente = new Cliente();
        cliente.setId(new Long("1"));
        cliente.setNombre("Un Cliente");

        Cliente otroCliente = new Cliente();
        otroCliente.setId(new Long("2"));
        otroCliente.setNombre("Otro Cliente");
        otroCliente.setEmail("gauchoaleman@yahoo.com");
        System.out.println(cliente);

        System.out.println(otroCliente);

        cliente.setNombre("Cliente 1");
        System.out.println(cliente);
        System.out.println(otroCliente);
    }

    public static void listarClientes() {
        System.out.println("Test listarCliente()");

        Cliente cliente1 = new Cliente();
        cliente1.setId(new Long("1"));
        cliente1.setNombre("Stefan");
        cliente1.setApellido("Ronacher");
        cliente1.setEmail("gauchoaleman@yahoo.com");
        cliente1.setDni("92844240");

        Cliente cliente2 = new Cliente();
        cliente2.setId(new Long("2"));
        cliente2.setNombre("Lucas");
        cliente2.setApellido("Passalaqua");
        cliente2.setEmail("lucas@yahoo.com");

        Cliente cliente3 = new Cliente();
        cliente3.setId(new Long("3"));
        cliente3.setNombre("Federico");
        cliente3.setApellido("Bordini");
        cliente3.setEmail("federico@yahoo.com");
        cliente3.setDni("3232323232");

        Cliente[] clienteArray = {cliente1,cliente2,cliente3};

        for(int i=0; i<clienteArray.length; i++){
            System.out.println(clienteArray[i]);
        }
    }

    
}
