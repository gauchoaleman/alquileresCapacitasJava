package edu.capacitas.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by luks on 07/10/16.
 */
public class Alquiler {
    private Long id;
    private Cliente cliente;
    private List<Recurso> recursoList;
    private Calendar fechaDesde;
    private Calendar fechaHasta;
    private Float costo;
    private Boolean pagado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Recurso> getRecursoList() {
        return recursoList;
    }

    public void setRecursoList(List<Recurso> recursoList) {
        this.recursoList = recursoList;
    }

    public Calendar getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Calendar fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Calendar getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Calendar fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        return "Alquiler{" +
                "id=" + id +
                ", cliente='" + cliente+ '\'' +

                ", FechaDesde=" + df.format(fechaDesde.getTime())  +
                ", FechaHasta=" + df.format(fechaHasta.getTime()) +
                ", costo=" + costo +
                ", pagado=" + pagado +
                '}';
    }
}
