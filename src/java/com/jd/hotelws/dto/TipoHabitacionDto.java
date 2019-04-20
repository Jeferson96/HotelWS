package com.jd.hotelws.dto;

/**
 *
 * @author Jeferson
 */
public class TipoHabitacionDto {

    private Integer idTipoHab;
    private String nombreTipoHab;

    public TipoHabitacionDto() {
    }

    public Integer getIdTipoHab() {
        return idTipoHab;
    }

    public void setIdTipoHab(Integer idTipoHab) {
        this.idTipoHab = idTipoHab;
    }

    public String getNombreTipoHab() {
        return nombreTipoHab;
    }

    public void setNombreTipoHab(String nombreTipoHab) {
        this.nombreTipoHab = nombreTipoHab;
    }

}
