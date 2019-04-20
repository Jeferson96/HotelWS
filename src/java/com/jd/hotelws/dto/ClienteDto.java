package com.jd.hotelws.dto;

import java.util.Date;

/**
 *
 * @author Jeferson
 */
public class ClienteDto {

    private Integer documentoCli;
    private String nombreCli;
    private String apellidoCli;
    private Date fehcaNacimiento;
    private Integer telefonoCli;
    private String mailCli;

    public ClienteDto() {
    }

    public Integer getDocumentoCli() {
        return documentoCli;
    }

    public void setDocumentoCli(Integer documentoCli) {
        this.documentoCli = documentoCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public Date getFehcaNacimiento() {
        return fehcaNacimiento;
    }

    public void setFehcaNacimiento(Date fehcaNacimiento) {
        this.fehcaNacimiento = fehcaNacimiento;
    }

    public Integer getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(Integer telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getMailCli() {
        return mailCli;
    }

    public void setMailCli(String mailCli) {
        this.mailCli = mailCli;
    }

}
