package edu.capacitas.app.stefan;
import edu.capacitas.app.stefan.FuncionesVariadas;
import edu.capacitas.domain.Alquiler;
import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Recurso;
import edu.capacitas.domain.Sexo;



import java.util.ArrayList;
import java.util.List;

import static edu.capacitas.app.stefan.FuncionesVariadas.*;

/**
 * Created by Stefan on 08/11/2016.
 */
public class App {

    private List<Cliente> listadoClientes;
    private List<Recurso>  recursoList;
    private List<Alquiler> alquilerList;

    public App() {
        this.listadoClientes = new ArrayList<>();
    }

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void listarClientes(){
        System.out.println("Imprimiendo listado clientes");
        if (listadoClientes.size() > 0) {
            for(int i=0; i<listadoClientes.size(); i++){
                System.out.println(listadoClientes.get(i));
            }
        }
        else {
            System.out.println("NO hay clientes para listar");
        }

}

    public Cliente agregarCliente(){

        int id;
        Cliente cliente = new Cliente();
        FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("Arranca agregar Cliente");

        System.out.println("Id: ");
        id = funcionesVariadas.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = funcionesVariadas.pedirNumeroPositivo();
        }
        System.out.println("Nombre:");
        cliente.setNombre(funcionesVariadas.pedirEntrada());
        System.out.println("Apellido: ");
        cliente.setApellido(funcionesVariadas.pedirEntrada());
        System.out.println("Email: ");
        cliente.setEmail(funcionesVariadas.pedirEntrada());
        System.out.println("Dni: ");
        cliente.setDni(funcionesVariadas.pedirEntrada());
        //TODO, agregar sexo
        //System.out.println("Sexo: ");
        //cliente.setSexo(funcionesVariadas.pedirSexo());

        return cliente;
    }
    private void buscarCliente(List<Cliente>listadoClientes){
        FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("Ingrese criterio de búsqueda: ");
        String aguja = funcionesVariadas.pedirEntrada();
        System.out.println("Buscando " + aguja +"...");
        for(int i=0; i<listadoClientes.size(); i++){
            if( buscarEnCliente(listadoClientes.get(i),aguja) ) {
                System.out.println(listadoClientes.get(i));
            }
        }
    }

    private boolean buscarEnCliente(Cliente cliente,String aguja) {
        boolean found;
        found = cliente.getNombre().contains(aguja);
        found = found || cliente.getApellido().contains(aguja);
        found = found || cliente.getEmail().contains(aguja);
        found = found || cliente.getDni().contains(aguja);
        return found;
    }

    /*public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(List<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }
    */
}
