package com.example.demo;

import javax.validation.constraints.*;
import java.util.Date;

public class DatosPersonales
{
    //Nombre
    @NotNull(message = "Debes especificar el nombre")
    @Size(min = 1, max = 20, message = "El nombre debe medir entre 1 y 20")
    private String nombre;

    //Primer apellido
    @NotNull(message = "Debes especificar el primer apellido")
    @Size(min = 1, max = 30, message = "El apellido debe medir entre 1 y 30")
    private String primerApellido;

    //Segundo apellido
    @Size(min = 1, max = 30, message = "El apellido debe medir entre 1 y 30")
    private String segundoApellido;

    //Fecha de nacimiento
    @NotNull(message = "Debes especificar la fecha de nacimiento")
    private Date fecha;

    //Nacionalidad
    @NotNull(message = "Debes especificar la nacionalidad")
    @Size(min = 1, max = 30)
    private String nacionalidad;


    public DatosPersonales(String nombre, String primerApellido, String segundoApellido, Date fecha, String nacionalidad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosPersonales)) return false;

        DatosPersonales that = (DatosPersonales) o;

        if (getNombre() != null ? !getNombre().equals(that.getNombre()) : that.getNombre() != null) return false;
        if (getPrimerApellido() != null ? !getPrimerApellido().equals(that.getPrimerApellido()) : that.getPrimerApellido() != null)
            return false;
        if (!getSegundoApellido().equals(that.getSegundoApellido())) return false;
        if (getFecha() != null ? !getFecha().equals(that.getFecha()) : that.getFecha() != null) return false;
        return getNacionalidad() != null ? getNacionalidad().equals(that.getNacionalidad()) : that.getNacionalidad() == null;
    }

}

