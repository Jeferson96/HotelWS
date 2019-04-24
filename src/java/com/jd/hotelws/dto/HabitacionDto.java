package com.jd.hotelws.dto;

/**
 *
 * @author Jeferson
 */
public class HabitacionDto {

    private Integer idHab;
    private String nombreHab;
    private Integer numeroCamas;
    private String descripcionHab;
    private Integer fkIdHotel;
    private Integer fkIdTipoHab;

    public HabitacionDto() {
    }

    public Integer getIdHab() {
        return idHab;
    }

    public void setIdHab(Integer idHab) {
        this.idHab = idHab;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getDescripcionHab() {
        return descripcionHab;
    }

    public void setDescripcionHab(String descripcionHab) {
        this.descripcionHab = descripcionHab;
    }

    public Integer getFkIdHotel() {
        return fkIdHotel;
    }

    public void setFkIdHotel(Integer fkIdHotel) {
        this.fkIdHotel = fkIdHotel;
    }

    public Integer getFkIdTipoHab() {
        return fkIdTipoHab;
    }

    public void setFkIdTipoHab(Integer fkIdTipoHab) {
        this.fkIdTipoHab = fkIdTipoHab;
    }

}
