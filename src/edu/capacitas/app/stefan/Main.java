package edu.capacitas.app.stefan;

import java.io.IOException;

import static edu.capacitas.app.stefan.FuncionesVariadas.*;

/**
 * Created by Stefan on 07/11/2016.
 */
public class Main {

    //private List<Cliente> listadoClientes;

   /*public Main(List<Cliente> listadoClientes) {
        this.listadoClientes = new ArrayList<>();
    }*/

    public static void main(String[] args) throws IOException {
        App app = new App();
        char operacion;
        String operacionString;

        FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        do {


            Menues.mostrarMenuPpal();
            //operacion = LeeCaracter();
            operacionString = funcionesVariadas.pedirEntrada();
            clearConsole();
            switch (operacionString) {
                case "C":
                    app.agregarCliente();
                    app.getListadoClientes();
                    break;
                case "NC":
                    //gestionarRecursos();
                    //app. Clientes();
                    app.getListadoClientes();
                    break;
                case "A":
                    //gestionarAlquileres();
                    break;
                case "S":
                default:
                    break;
            }
        } while (!("S".equals(operacionString)));
    }


}

