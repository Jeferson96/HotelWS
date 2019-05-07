package com.jd.hotelws.ws;

import com.jd.hotelws.responseWs.ResponseHotel;
import java.util.ArrayList;
import java.util.Date;
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
    public List<ResponseHotel> ResponseHotel(@WebParam(name = "fechaIngreso") Date fechaIngreso, @WebParam(name = "fechaSalida") Date fechaSalida, @WebParam(name = "tipoHabitacion") String tipoHabitacion) {
        List<ResponseHotel> lista = new ArrayList<>();

        return lista;
    }

}
