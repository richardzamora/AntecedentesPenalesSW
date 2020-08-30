/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import model.Antecedente;
import model.Ciudadano;
import model.Delito;
import model.ServicioAntecedentesPenales;
import model.ServicioAntecedentesPenalesSW;
import model.TipoDocumento;


/**
 *
 * @author Richard
 */
public class ControllerAntecedentesPenales{

    private static ControllerAntecedentesPenales controller;
    private ServicioAntecedentesPenales servicioAntecedentesPenales;
    
    private ControllerAntecedentesPenales() {
        ServicioAntecedentesPenalesSW servicioAntecedentesPenalesSW = new ServicioAntecedentesPenalesSW();
        servicioAntecedentesPenales = servicioAntecedentesPenalesSW.getServicioAntecedentesPenalesPort();
    }
    
    public static ControllerAntecedentesPenales getInstance() {
        if(controller==null)
            controller = new ControllerAntecedentesPenales();
        return controller;
    }
    //----------------------------Ciudadano----------------------------
    public boolean eliminarCiudadano(String cedula) {
        return servicioAntecedentesPenales.eliminarCiudadano(cedula);
    }
    
    public boolean agregarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) {
        
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setCedula(cedula);
        ciudadano.setTipoDocumento(tipoDocumento);
        ciudadano.setNombre(nombre);
        ciudadano.setApellido(apellido);
        ciudadano.setGenero(genero);
        try {
            ciudadano.setFechaNacimiento(getXmlGregorianCalendarFromDate(fechaNacimiento));
        } catch (DatatypeConfigurationException e) {
            System.out.println(e);
        }
        //Falta el genero
        return servicioAntecedentesPenales.agregarCiudadano(ciudadano);
    }
    
    public Ciudadano darCiudadanoPorCedula(String cedula){
        return servicioAntecedentesPenales.darCiudadanoPorCedula(cedula);
    }
    
    public ArrayList<Ciudadano> darCiudadanos() {
        List<Ciudadano> ciudadanosList = servicioAntecedentesPenales.darCiudadanos();
        ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
        for(int i = 0; i<ciudadanosList.size();i++) {
            ciudadanos.add(ciudadanosList.get(i));
        }
        return ciudadanos;
    }
    
    public boolean actualizarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero){
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setCedula(cedula);
        ciudadano.setTipoDocumento(tipoDocumento);
        ciudadano.setNombre(nombre);
        ciudadano.setApellido(apellido);
        ciudadano.setGenero(genero);
        try {
            ciudadano.setFechaNacimiento(getXmlGregorianCalendarFromDate(fechaNacimiento));
        } catch (DatatypeConfigurationException e) {
            System.out.println(e);
        }
        //Falta el genero
        return servicioAntecedentesPenales.actualizarCiudadano(ciudadano);
    }
    
    //----------------------------Delito----------------------------
    public Delito darDelitoPorCodigo(int codigo){
        return servicioAntecedentesPenales.darDelitoPorCodigo(codigo);
    }
    
    public ArrayList<Delito> darDelitos(){
        List<Delito> delitosList = servicioAntecedentesPenales.darDelitos();
        ArrayList<Delito> delitos = new ArrayList<Delito>();
        for(int i = 0; i<delitosList.size();i++) {
            delitos.add(delitosList.get(i));
        }
        return delitos;
    }
    //----------------------------Antecedente----------------------------
    public ArrayList<Antecedente> darAntecedentes() {
        List<Antecedente> antecedentesList = servicioAntecedentesPenales.darAntecedentes();
        ArrayList<Antecedente> antecedentes = new ArrayList<Antecedente>();
        for(int i = 0; i<antecedentesList.size();i++) {
            antecedentes.add(antecedentesList.get(i));
        }
        return antecedentes;
    }
    
    public boolean agregarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado){
        Antecedente antecedente = new Antecedente();
        antecedente.setCiudadanoDi(ciudadanoDi);
        antecedente.setDelitoCodigo(delitoCodigo);
        antecedente.setCiudad(ciudad);
        try {
            antecedente.setFechaDelito(this.getXmlGregorianCalendarFromDate(fechaDelito));
        } catch (DatatypeConfigurationException e) {
            System.out.println(e);
        }
        antecedente.setSentencia(sentencia);
        antecedente.setEstado(estado);
        return servicioAntecedentesPenales.agregarAntecedente(antecedente);
    }
    
    public Antecedente darAntecedentePorId(int id){
        return servicioAntecedentesPenales.darAntecedentePorId(id);
    }
    
    public boolean actualizarAntecedente(int id, String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado){
        Antecedente antecedente = new Antecedente();
        antecedente.setCiudadanoDi(ciudadanoDi);
        antecedente.setDelitoCodigo(delitoCodigo);
        antecedente.setCiudad(ciudad);
        try {
            antecedente.setFechaDelito(this.getXmlGregorianCalendarFromDate(fechaDelito));
        } catch (DatatypeConfigurationException e) {
            System.out.println(e);
        }
        antecedente.setSentencia(sentencia);
        antecedente.setEstado(estado);
        return servicioAntecedentesPenales.actualizarAntecedente(antecedente);
    }

    public boolean eliminarAntecedente(int id){
        return servicioAntecedentesPenales.eliminarAntecedente(id);
    }
    
    public int darSentenciaTotalPorCiudadano(String ciudadanoDi){
        return servicioAntecedentesPenales.darSentenciaTotalPorCiudadano(ciudadanoDi);
    }
    
    ////--------------------------Filtros------------------------------////
    
    public ArrayList<Antecedente> darAntecedentesPorCiudadano(String ciudadanoDi){
        List<Antecedente> antecedentesList = servicioAntecedentesPenales.darAntecedentesPorCiudadano(ciudadanoDi);
        ArrayList<Antecedente> antecedentes = new ArrayList<Antecedente>();
        for(int i = 0; i<antecedentesList.size();i++) {
            antecedentes.add(antecedentesList.get(i));
        }
        return antecedentes;
    }
    
    public ArrayList<Antecedente> darAntecedentesPorDelito(int delitoCodigo){
        List<Antecedente> antecedentesList = servicioAntecedentesPenales.darAntecedentesPorDelito(delitoCodigo);
        ArrayList<Antecedente> antecedentes = new ArrayList<Antecedente>();
        for(int i = 0; i<antecedentesList.size();i++) {
            antecedentes.add(antecedentesList.get(i));
        }
        return antecedentes;
    }
    
    public ArrayList<Antecedente> darAntecedentesPorCiudadanoYDelito(String ciudadanoDi, int delitoCodigo){
        List<Antecedente> antecedentesList = servicioAntecedentesPenales.darAntecedentesPorCiudadanoYDelito(ciudadanoDi, delitoCodigo);
        ArrayList<Antecedente> antecedentes = new ArrayList<Antecedente>();
        for(int i = 0; i<antecedentesList.size();i++) {
            antecedentes.add(antecedentesList.get(i));
        }
        return antecedentes;
    }
    //----------------------------TipoDocumento----------------------------
    public TipoDocumento darTipoDocumentoPorCodigo(int codigo){
        return servicioAntecedentesPenales.darTipoDocumentoPorCodigo(codigo);
    }
    
    public ArrayList<TipoDocumento> darTipoDocumentos(){
        List<TipoDocumento> tipoDocumentosList = servicioAntecedentesPenales.darTipoDocumentos();
        ArrayList<TipoDocumento> tipoDocumentos = new ArrayList<TipoDocumento>();
        for(int i = 0; i<tipoDocumentosList.size();i++) {
            tipoDocumentos.add(tipoDocumentosList.get(i));
        }
        return tipoDocumentos;
    }
    ////-------------------------Otros------------------------------/////
    public XMLGregorianCalendar getXmlGregorianCalendarFromDate(final Date date) throws DatatypeConfigurationException
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);     
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);   
    }
    
    public Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
    
}
