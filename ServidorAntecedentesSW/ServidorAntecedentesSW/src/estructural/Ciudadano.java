/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Richard
 */
@XmlRootElement(name = "Ciudadano")
public class Ciudadano implements Serializable, CRUD{
   
    private String di;
    private Integer tipoDocumento;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private boolean genero;
    //True posee cromosoma Y. False de lo contrario. XD 

    public Ciudadano() {
    }

    public Ciudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) {
        this.di = cedula;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public String getCedula() {
        return di;
    }

    public void setCedula(String cedula) {
        this.di = cedula;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public boolean isGenero() {
        return genero;
    }

    public boolean equals(Object objeto)
    {
        if(objeto==null)
            return false;
        Ciudadano ciudadano = (Ciudadano)objeto;
        if(this.getCedula().equals(ciudadano.getCedula()))
            return true;
        else
            return false;
    }
    
    public int hashCode(){
        return this.getCedula().hashCode();
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "di=" + di + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

    
    
    @Override
    public String crear() {
        return "INSERT INTO public.ciudadanos(\n" +
"	di, tipo_documento, nombre, apellido, fecha_nacimiento, genero)\n" +
"	VALUES ('"+ di +"', "+ tipoDocumento +", '"+ nombre +"', '"+ apellido +"', '"+ fechaNacimiento +"', "+ genero +");";
    }

    @Override
    public String leer() {
        return "SELECT di, tipo_documento, nombre, apellido, fecha_nacimiento, genero\n" +
"	FROM public.ciudadanos WHERE di='"+ di +"';";
    }

    @Override
    public String leerTodos() {
        return "SELECT di, tipo_documento, nombre, apellido, fecha_nacimiento, genero\n" +
"	FROM public.ciudadanos;";
    }

    @Override
    public String actualizar() {
        return "UPDATE public.ciudadanos\n" +
"	SET di='"+ di +"', tipo_documento="+ tipoDocumento +", nombre='"+ nombre +"', apellido='"+ apellido +"', fecha_nacimiento='"+ fechaNacimiento +"', genero="+ genero +"\n" +
"	WHERE di='"+ di +"';";
    }

    @Override
    public String eliminar() {
       return "DELETE FROM public.ciudadanos\n" +
"	WHERE di='"+ di +"';";
    }
}
