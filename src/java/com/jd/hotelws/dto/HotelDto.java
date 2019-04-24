/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.hotelws.dto;

/**
 *
 * @author Jeferson
 */
public class HotelDto {

    private Integer idHotel;
    private String nombreHotel;
    private String direccionHotel;
    private Integer telefonoHotel;
    private String mailHotel;

    public HotelDto() {
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

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

    public Integer getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(Integer telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public String getMailHotel() {
        return mailHotel;
    }

    public void setMailHotel(String mailHotel) {
        this.mailHotel = mailHotel;
    }

}
