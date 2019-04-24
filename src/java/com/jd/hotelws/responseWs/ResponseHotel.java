/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.hotelws.responseWs;

/**
 *
 * @author Jeferson
 */
public class ResponseHotel {

    private String nombreHotel;
    private String direccionHotel;
    private String tipoHab;
    private Integer numeroCamas;
    private String descripcionHab;
    private Integer precioAlqHab;

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
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

    public Integer getPrecioAlqHab() {
        return precioAlqHab;
    }

    public void setPrecioAlqHab(Integer precioAlqHab) {
        this.precioAlqHab = precioAlqHab;
    }

}
