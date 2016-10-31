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
        fechaDesde.set(2016,11,29);

        Calendar fechaHasta = Calendar.getInstance();
        fechaHasta.set(Calendar.DAY_OF_MONTH, 29);
        fechaHasta.set(Calendar.MONTH, 12);
        fechaHasta.set(Calendar.YEAR, 2016);

        alquiler.setFechaDesde(fechaDesde);
        alquiler.setFechaHasta(fechaHasta );
        alquiler.setCosto(new Float("20"));
        alquiler.setPagado(true);


        System.out.println(alquiler);
    }

    public static Alquiler obtenerAlquiler() {
        System.out.println("Arranca Crear Alquiler");
        Alquiler alquiler = new Alquiler();
        Cliente cliente = new Cliente();

        alquiler.setId(new Long("1"));

        alquiler.setCliente(cliente);


        /*alquiler.setFechadesde(new Date("2016-10-29"));
        alquiler.setFechahasta(new Date("2016-10-30"));*/
        alquiler.setCosto(new Float("20"));
        alquiler.setPagado(true);


        System.out.println(alquiler);
        return alquiler;
    }

}
