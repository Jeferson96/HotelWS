package com.jd.hotelws.dto;

import java.util.Date;

/**
 *
 * @author Jeferson
 */
public class AlquilerHabitacionDto {

    private Integer idAlqHab;
    private Integer precioAlqHab;
    private Date fechaEntrada;
    private Date fechaSalida;
    private String estadoAlqHab;
    private String observacionAlqHab;
    private Integer fkDocumentoCli;
    private Integer fkIdHab;

    public AlquilerHabitacionDto() {
    }

    public Integer getIdAlqHab() {
        return idAlqHab;
    }

    public void setIdAlqHab(Integer idAlqHab) {
        this.idAlqHab = idAlqHab;
    }

    public Integer getPrecioAlqHab() {
        return precioAlqHab;
    }

    public void setPrecioAlqHab(Integer precioAlqHab) {
        this.precioAlqHab = precioAlqHab;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstadoAlqHab() {
        return estadoAlqHab;
    }

    public void setEstadoAlqHab(String estadoAlqHab) {
        this.estadoAlqHab = estadoAlqHab;
    }

    public String getObservacionAlqHab() {
        return observacionAlqHab;
    }

    public void setObservacionAlqHab(String observacionAlqHab) {
        this.observacionAlqHab = observacionAlqHab;
    }

    public Integer getFkDocumentoCli() {
        return fkDocumentoCli;
    }

    public void setFkDocumentoCli(Integer fkDocumentoCli) {
        this.fkDocumentoCli = fkDocumentoCli;
    }

    public Integer getFkIdHab() {
        return fkIdHab;
    }

    public void setFkIdHab(Integer fkIdHab) {
        this.fkIdHab = fkIdHab;
    }

}
