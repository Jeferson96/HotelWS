package com.jd.hotelws.logica;

import com.jd.hotelws.responseWs.ResponseHotel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeferson
 */
public class LogicaHotel {

    private String fechaI;
    private String fechaF;
    private String tipo;

    /**
     * Metodo que se encarga de validar que tipo de habitacion es requerida para
     * luego ingresar al metodo correspondiente y ingresar la informacion.
     *
     * @param fechaIngreso
     * @param fechaSalida
     * @param tipoHab
     * @return
     */
    public List<ResponseHotel> consultaInfoHotel(String fechaIngreso, String fechaSalida, String tipoHab) {
        List<ResponseHotel> listaInfo = new ArrayList<>();
        setFechaI(fechaIngreso);
        setFechaF(fechaSalida);
        setTipo(tipoHab);
        switch (getTipo()) {
            case "1":
                listaInfo = tipoUno();
                break;
            case "2":
                listaInfo = tipoDos();
                break;
            case "3":
                listaInfo = tipoTres();
                break;
            case "4":
                listaInfo = tipoCuatro();
                break;
            default:

        }

        return listaInfo;
    }

    /**
     * Metodo que se encargara de indicar las habitaciones que estan disponibles
     * cuando el tipo de habitacion sea 1
     *
     * @return
     */
    public List<ResponseHotel> tipoUno() {
        List<ResponseHotel> listaInfo = null;
        listaInfo = new ArrayList<>();
        ResponseHotel objeto = new ResponseHotel();
        objeto.setNombreHotel("Hotel la Fontana");
        objeto.setDireccionHotel("calle falsa 123");
        objeto.setDescripcionHab("la habitacion cuenta con sala comedor, cocina, nevera y dos baños");
        objeto.setNumeroCamas(2);
        objeto.setPrecioAlqHabXDia(1000000);
        objeto.setPrecioTotalAlquiler((diferenciaDias() * objeto.getPrecioAlqHabXDia()));
        objeto.setTipoHab("Doble");
        objeto.setEstado("OK");
        listaInfo.add(objeto);
        return listaInfo;
    }

    /**
     * Metodo que se encargara de indicar las habitaciones que estan disponibles
     * cuando el tipo de habitacion sea 2
     *
     * @return
     */
    public List<ResponseHotel> tipoDos() {
        List<ResponseHotel> listaInfo = null;
        listaInfo = new ArrayList<>();
        ResponseHotel objeto = new ResponseHotel();
        objeto.setNombreHotel("Hotel El gran Caballo");
        objeto.setDireccionHotel("calle falsa 45");
        objeto.setDescripcionHab("la habitacion tiene una mesa para planchar y un estudio junto cono dos baños");
        objeto.setNumeroCamas(1);
        objeto.setPrecioAlqHabXDia(500000);
        objeto.setPrecioTotalAlquiler((diferenciaDias() * objeto.getPrecioAlqHabXDia()));
        objeto.setTipoHab("Sencilla");
        objeto.setEstado("OK");
        listaInfo.add(objeto);
        return listaInfo;
    }

    /**
     * Metodo que se encargara de indicar las habitaciones que estan disponibles
     * cuando el tipo de habitacion sea 3
     *
     * @return
     */
    public List<ResponseHotel> tipoTres() {
        List<ResponseHotel> listaInfo = null;
        listaInfo = new ArrayList<>();
        ResponseHotel objeto = new ResponseHotel();
        objeto.setNombreHotel("Hotel la Posada");
        objeto.setDireccionHotel("calle falsa 12");
        objeto.setDescripcionHab("la habitacion cuenta con televisor, estufa, nevera y dos baños");
        objeto.setNumeroCamas(2);
        objeto.setPrecioAlqHabXDia(1000000);
        objeto.setPrecioTotalAlquiler((diferenciaDias() * objeto.getPrecioAlqHabXDia()));
        objeto.setTipoHab("Doble");
        objeto.setEstado("OK");
        listaInfo.add(objeto);
        return listaInfo;
    }

    /**
     * Metodo que se encargara de indicar las habitaciones que estan disponibles
     * cuando el tipo de habitacion sea 4
     *
     * @return
     */
    public List<ResponseHotel> tipoCuatro() {
        List<ResponseHotel> listaInfo = null;
        listaInfo = new ArrayList<>();
        ResponseHotel objeto = new ResponseHotel();
        objeto.setNombreHotel("Hotel El gran Rey");
        objeto.setDireccionHotel("calle falsa 456");
        objeto.setDescripcionHab("la habitacion tiene una mesa y un estudio junto cono dos baños");
        objeto.setNumeroCamas(1);
        objeto.setPrecioAlqHabXDia(500000);
        objeto.setTipoHab("Sencilla");
        objeto.setPrecioTotalAlquiler((diferenciaDias() * objeto.getPrecioAlqHabXDia()));
        objeto.setEstado("OK");
        listaInfo.add(objeto);
        return listaInfo;
    }

    /**
     * Metodo que se encarga de validar cuantos dias de diferencias hay entre la
     * fecha inicio y la fecha fin.
     *
     * @return
     */
    public Integer diferenciaDias() {
        Integer diferenciaDias = 0;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date fechaInicial = dateFormat.parse(getFechaI());
            Date fechaFinal = dateFormat.parse(getFechaF());

            diferenciaDias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diferenciaDias;
    }

    /**
     * Metodo que se encarga de validar que la fecha sea valida y tenga el
     * formato correcto.
     *
     * @param fecha
     * @return
     */
    public Boolean validaFecha(String fecha) {
        Boolean estado = Boolean.FALSE;

        System.out.println("Esta es la fecha a validar: ".concat(fecha));

        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            estado = Boolean.TRUE;
        } catch (Exception e) {
            estado = Boolean.FALSE;
            System.out.println("Error formato fecha, error: ".concat(e.getMessage()));

        }

        return estado;
    }

    /**
     * Metodo que se encarga de validar si el tipo de habitacion que envian al
     * servicio es correcto o no.
     *
     * @param tipo
     * @return
     */
    public Boolean validaTipo(String tipo) {
        Boolean estado = Boolean.FALSE;

        switch (tipo) {
            case "1":
                estado = Boolean.TRUE;
                break;
            case "2":
                estado = Boolean.TRUE;
                break;
            case "3":
                estado = Boolean.TRUE;
                break;
            case "4":
                estado = Boolean.TRUE;
                break;
            default:
                estado = Boolean.FALSE;
        }

        return estado;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
