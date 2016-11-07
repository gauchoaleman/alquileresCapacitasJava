package edu.capacitas.test.helper;

import edu.capacitas.domain.Alquiler;
import edu.capacitas.domain.Recurso;
import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.TipoRecurso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 24/10/2016.
 */
public class AlquilerHelper {
    public static void crearAlquiler() {
        List<Recurso> listRecurso = new ArrayList<>();
        System.out.println("Test crearAlquiler()");

        Recurso recurso = RecursoHelper.obtenerRecurso(new Long(1),TipoRecurso.ALOJAMIENTO,"Recurso 1, ALOJAMIENTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(2),TipoRecurso.AUTO,"Recurso 2, AUTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(3),TipoRecurso.HERRAMIENTA,"Recurso 3, HERRAMIENTA"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        Alquiler alquiler = new Alquiler();
        Cliente cliente = ClienteHelper.obtenerCliente();

        alquiler.setId(new Long("1"));

        alquiler.setCliente(cliente);
        alquiler.setRecursoList(listRecurso);

        Calendar fechaDesde = Calendar.getInstance();
        fechaDesde.set(2016,11,29,12,20);

        Calendar fechaHasta = Calendar.getInstance();
        fechaHasta.set(Calendar.MINUTE, 30);
        fechaHasta.set(Calendar.HOUR, 15);
        fechaHasta.set(Calendar.DAY_OF_MONTH, 29);
        fechaHasta.set(Calendar.MONTH, 12);
        fechaHasta.set(Calendar.YEAR, 2016);

        alquiler.setFechaDesde(fechaDesde);
        alquiler.setFechaHasta(fechaHasta );
        alquiler.setCosto(new Float("20"));
        alquiler.setPagado(true);

        System.out.println("Println alquiler()");
        System.out.println(alquiler);
    }

    public static Alquiler obtenerAlquiler() {
        System.out.println("Arranca Obtener Alquiler");

        List<Recurso> listRecurso = new ArrayList<>();
        System.out.println("Test crearAlquiler()");

        Recurso recurso = RecursoHelper.obtenerRecurso(new Long(1),TipoRecurso.ALOJAMIENTO,"Recurso 1, ALOJAMIENTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(2),TipoRecurso.AUTO,"Recurso 2, AUTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(3),TipoRecurso.HERRAMIENTA,"Recurso 3, HERRAMIENTA"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        Alquiler alquiler = new Alquiler();
        Cliente cliente = ClienteHelper.obtenerCliente();


        alquiler.setId(new Long("1"));

        alquiler.setCliente(cliente);
        alquiler.setRecursoList(listRecurso);


        alquiler.setId(new Long("1"));

        Calendar fechaDesde = Calendar.getInstance();
        fechaDesde.set(2016,Calendar.NOVEMBER,29,12,30);
        Calendar fechaHasta = Calendar.getInstance();
        fechaHasta.set(2016,Calendar.MAY,29,15,20);

        alquiler.setFechaDesde(fechaDesde);
        alquiler.setFechaHasta(fechaHasta );
        alquiler.setCosto(new Float("25"));
        alquiler.setPagado(true);

        alquiler.setCosto(new Float("20"));
        alquiler.setPagado(true);


        System.out.println(alquiler);
        return alquiler;
    }

    public static void listarAlquileres() {
        System.out.println("Test listarAlquileres()");
        Alquiler alquiler1 = new Alquiler();
        List<Recurso> listRecurso = new ArrayList<>();

        Recurso recurso = RecursoHelper.obtenerRecurso(new Long(1),TipoRecurso.ALOJAMIENTO,"Recurso 1, ALOJAMIENTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(2),TipoRecurso.AUTO,"Recurso 2, AUTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(3),TipoRecurso.HERRAMIENTA,"Recurso 3, HERRAMIENTA"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        alquiler1.setId(new Long("1"));
        Cliente cliente = ClienteHelper.obtenerCliente();
        alquiler1.setCliente(cliente);
        alquiler1.setRecursoList(listRecurso);
        //FIXME (no muestra bien las fechas en el println
        Calendar fechaDesde = Calendar.getInstance();
        fechaDesde.set(2016,Calendar.NOVEMBER,29,12,30);
        Calendar fechaHasta = Calendar.getInstance();
        fechaHasta.set(2016,Calendar.MAY,29,15,20);

        alquiler1.setFechaDesde(fechaDesde);
        alquiler1.setFechaHasta(fechaHasta );
        alquiler1.setCosto(new Float("25"));
        alquiler1.setPagado(true);
        /**************************************************************************************/
        Alquiler alquiler2 = new Alquiler();
        listRecurso = new ArrayList<>();

        recurso = RecursoHelper.obtenerRecurso(new Long(1),TipoRecurso.ALOJAMIENTO,"Recurso 1, ALOJAMIENTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(2),TipoRecurso.AUTO,"Recurso 2, AUTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(3),TipoRecurso.HERRAMIENTA,"Recurso 3, HERRAMIENTA"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        alquiler2.setId(new Long("1"));
        cliente = ClienteHelper.obtenerCliente();
        alquiler2.setCliente(cliente);
        alquiler2.setRecursoList(listRecurso);

        fechaDesde = Calendar.getInstance();
        fechaDesde.set(2016,8,27,12,45);
        fechaHasta = Calendar.getInstance();
        fechaHasta.set(2016,10,30,12,00);

        alquiler2.setFechaDesde(fechaDesde);
        alquiler2.setFechaHasta(fechaHasta );
        alquiler2.setCosto(new Float("80"));
        alquiler2.setPagado(false);
        /**************************************************************************************/
        Alquiler alquiler3 = new Alquiler();
        listRecurso = new ArrayList<>();

        recurso = RecursoHelper.obtenerRecurso(new Long(1),TipoRecurso.ALOJAMIENTO,"Recurso 1, ALOJAMIENTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(2),TipoRecurso.AUTO,"Recurso 2, AUTO"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        recurso = RecursoHelper.obtenerRecurso(new Long(3),TipoRecurso.HERRAMIENTA,"Recurso 3, HERRAMIENTA"); //obtener elemento
        listRecurso.add(recurso);   //añadir elemento

        alquiler3.setId(new Long("1"));
        cliente = ClienteHelper.obtenerCliente();
        alquiler3.setCliente(cliente);
        alquiler3.setRecursoList(listRecurso);

        fechaDesde = Calendar.getInstance();
        fechaDesde.set(2016,7,27,8,30);
        fechaHasta = Calendar.getInstance();
        fechaHasta.set(2016,9,30,9,45);

        alquiler3.setFechaDesde(fechaDesde);
        alquiler3.setFechaHasta(fechaHasta );
        alquiler3.setCosto(new Float("10"));
        alquiler3.setPagado(false);

        Alquiler[] alquilerArray = {alquiler1,alquiler2,alquiler3};
        System.out.println("Imprimiendo listarAlquileres()");
        for(int i=0; i<alquilerArray.length; i++){
            System.out.println(alquilerArray[i]);
        }
    }

    public static void mostrarFacturaAlquiler(Alquiler alquiler) {
        Double total=new Double(0);
        System.out.println("**************************************");
        System.out.println("*             Factura                *");
        System.out.println("**************************************");
        System.out.println("Nombre: "+alquiler.getCliente().getNombre());
        System.out.println("Apellido: "+alquiler.getCliente().getApellido());
        System.out.println("Dni: "+alquiler.getCliente().getDni());
        System.out.println("Email: "+alquiler.getCliente().getEmail());
        System.out.println("Sexo: "+alquiler.getCliente().getSexo());
        for (Recurso r: alquiler.getRecursoList()){
            System.out.println(r.getDescripcion()+"____"+r.getCostoxdia());
            total=total+r.getCostoxdia();
        }
        System.out.println("El total es: "+total);

    }
}
