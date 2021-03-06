package edu.capacitas.domain;

/**
 * Created by luks on 07/10/16.
 */
public class Recurso {
    private Long id;
    private TipoRecurso tipoRecurso;
    private String descripcion;
    private Boolean ocupado;
    private Float costoxdia;
    private Float costoxhora;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enum getTipoRecursod() {
        return tipoRecurso;
    }

    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Float getCostoxdia() {
        return costoxdia;
    }

    public void setCostoxdia(Float costoxdia) {
        this.costoxdia = costoxdia;
    }

    public Float getcostoxhora(Float costoxhora) { return costoxhora; }

    public void setcostoxhora(Float costoxhora) {this.costoxhora = costoxhora; }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", tipo ='" + tipoRecurso + '\'' +
                ", ocupado=" + ocupado +
                ", costoxdia=" + costoxdia +
                ", costoxhora=" + costoxhora +
                '}';
    }
}
