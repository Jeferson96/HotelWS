package com.jd.hotelws.ws;

import com.jd.hotelws.logica.LogicaHotel;
import com.jd.hotelws.responseWs.ResponseHotel;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jeferson
 */
@WebService(serviceName = "HotelWs")
public class HotelWs {

    @WebMethod(operationName = "ResponseHotel")
    public List<ResponseHotel> ResponseHotel(@WebParam(name = "fechaIngreso") String fechaIngreso, @WebParam(name = "fechaSalida") String fechaSalida, @WebParam(name = "tipoHabitacion") String tipoHabitacion) {
        List<ResponseHotel> lista = new ArrayList<>();
        Boolean bandera = Boolean.FALSE;
        LogicaHotel logica = new LogicaHotel();

        if (logica.validaFecha(fechaIngreso)) {
            bandera = Boolean.TRUE;
        } else {
            ResponseHotel objeto = new ResponseHotel();
            objeto.setEstado("Error, fecha Inicio.");
            lista.add(objeto);
            bandera = Boolean.FALSE;
        }

        if (logica.validaFecha(fechaSalida)) {
            bandera = Boolean.TRUE;
        } else {
            ResponseHotel objeto = new ResponseHotel();
            objeto.setEstado("Error, fecha Fin.");
            lista.add(objeto);
            bandera = Boolean.FALSE;
        }
        if (logica.validaTipo(tipoHabitacion)) {
            bandera = Boolean.TRUE;
        } else {
            ResponseHotel objeto = new ResponseHotel();
            objeto.setEstado("Error, tipo de habitacion no valida.");
            lista.add(objeto);
            bandera = Boolean.FALSE;
        }

        if (bandera) {

            lista = logica.consultaInfoHotel(fechaIngreso, fechaSalida, tipoHabitacion);
        }

        return lista;
    }

}
