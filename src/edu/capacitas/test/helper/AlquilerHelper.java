package edu.capacitas.test.helper;

import edu.capacitas.domain.Recurso;
import edu.capacitas.domain.TipoRecurso;

import java.util.ArrayList;
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

        int i = listRecurso.size(); //Muestro cantidad ahora
        System.out.println(i);
        listRecurso.clear();        //Limpia la lista.  La pone en ZERO
        i = listRecurso.size(); //Muestro cantidad ahora
        System.out.println(i);
    }

}
