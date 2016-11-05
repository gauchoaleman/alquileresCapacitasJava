package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;
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
        recurso.setCostoxdia(new Float("37.5"));
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
        recurso.setTipoRecurso(tipo);

        System.out.println(recurso);
        return recurso;
    }

    public static void listarRecurso() {
        System.out.println("Test listarRecurso()");

        Recurso recurso1 = new Recurso();
        recurso1.setId(new Long("1"));
        recurso1.setDescripcion("Fiat Idea");
        recurso1.setcostoxhora(new Float("25"));
        recurso1.setCostoxdia(new Float("50"));
        recurso1.setOcupado(Boolean.FALSE);
        recurso1.setTipoRecurso(TipoRecurso.HERRAMIENTA);


        Recurso recurso2 = new Recurso();
        recurso2.setId(new Long("2"));
        recurso2.setDescripcion("");
        recurso2.setcostoxhora(new Float("30"));
        recurso2.setCostoxdia(new Float("55"));
        recurso2.setOcupado(Boolean.FALSE);
        recurso2.setTipoRecurso(TipoRecurso.AUTO);

        Recurso recurso3 = new Recurso();
        recurso3.setId(new Long("3"));
        recurso3.setDescripcion("");
        recurso3.setcostoxhora(new Float("35"));
        recurso3.setCostoxdia(new Float("60"));
        recurso3.setOcupado(Boolean.FALSE);
        recurso3.setTipoRecurso(TipoRecurso.ALOJAMIENTO);

        Recurso[] recursoArray = {recurso1, recurso2, recurso3};

        for (int i = 0; i < recursoArray.length; i++) {
            System.out.println(recursoArray[i]);
        }
    }}