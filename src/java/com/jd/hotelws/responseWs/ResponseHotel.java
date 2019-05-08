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
    private Integer precioAlqHabXDia;
    private Integer precioTotalAlquiler;
    private String estado;

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

    public Integer getPrecioAlqHabXDia() {
        return precioAlqHabXDia;
    }

    public void setPrecioAlqHabXDia(Integer precioAlqHabXDia) {
        this.precioAlqHabXDia = precioAlqHabXDia;
    }

    public Integer getPrecioTotalAlquiler() {
        return precioTotalAlquiler;
    }

    public void setPrecioTotalAlquiler(Integer precioTotalAlquiler) {
        this.precioTotalAlquiler = precioTotalAlquiler;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
