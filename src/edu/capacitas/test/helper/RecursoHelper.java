package edu.capacitas.test.helper;

import edu.capacitas.domain.Recurso;
import edu.capacitas.domain.TipoRecurso;

/**
 * Created by luks on 17/10/16.
 */
public class RecursoHelper {

    public static void crearRecurso() {
        System.out.println("Test crearRecurso()");
        Recurso recurso = new Recurso();
        recurso.setId(new Long("1"));
        recurso.setDescripcion("Fiat Idea");
        recurso.setcostoxhora(new Float("25"));
        recurso.setCostoxdia(new Float("50"));
        recurso.setOcupado(Boolean.FALSE);
        recurso.setTipoRecurso(TipoRecurso.ALOJAMIENTO);

        System.out.println(recurso);

    }

    public static void modificarRecurso() {
        System.out.println("Test modificarRecurso()");
        // La idea es mostrar cambios en una misma instancia
        Recurso recurso = new Recurso();
        recurso.setId(new Long("1"));
        recurso.setDescripcion("Corsa 4 puertas");
        recurso.setCostoxdia(new Float("37,5"));
        recurso.setCostoxdia(new Float("900"));
        recurso.setOcupado(Boolean.TRUE);
        recurso.setTipoRecurso(TipoRecurso.AUTO);



        Recurso otroRecurso = new Recurso();
        otroRecurso.setId(new Long("2"));
        otroRecurso.setDescripcion("Otro Recurso");
        otroRecurso.setcostoxhora(new Float("12.10"));

        System.out.println(recurso);
        System.out.println(otroRecurso);

        recurso.setDescripcion("Recurso 1");
        System.out.println(recurso);
        System.out.println(otroRecurso);
    }

    public static Recurso obtenerRecurso(Long id, TipoRecurso tipo, String descripcion) {
        System.out.println("Test obtenerRecurso()");
        Recurso recurso = new Recurso();
        recurso.setId(id);
        recurso.setDescripcion(descripcion);
        recurso.setcostoxhora(new Float("25"));
        recurso.setCostoxdia(new Float("50"));
        recurso.setOcupado(Boolean.FALSE);
        //recurso.setTipoRecurso(TipoRecurso.ALOJAMIENTO);
        recurso.setTipoRecurso(tipo);

        System.out.println(recurso);
        return recurso;

    }
}
