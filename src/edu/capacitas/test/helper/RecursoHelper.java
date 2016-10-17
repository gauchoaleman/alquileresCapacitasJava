package edu.capacitas.test.helper;

import edu.capacitas.domain.Recurso;

/**
 * Created by luks on 17/10/16.
 */
public class RecursoHelper {

    public static void crearRecurso() {
        System.out.println("Arranca Crear Recurso");
        Recurso recurso = new Recurso();
        recurso.setDescripcion("lala");

        System.out.println(recurso);
    }
}
