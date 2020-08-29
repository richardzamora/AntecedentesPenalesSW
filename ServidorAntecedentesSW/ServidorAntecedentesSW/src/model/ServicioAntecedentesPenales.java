/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estructural.Antecedente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import estructural.Ciudadano;
import estructural.Delito;
import estructural.TipoDocumento;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author richa
 */
@WebService(serviceName = "ServicioAntecedentesPenalesSW")
public class ServicioAntecedentesPenales{

    ServicioCiudadano servicioCiudadano;
    ServicioAntecedente servicioAntecedente;
    ServicioDelito servicioDelito;
    ServicioTipoDocumento servicioTipoDocumento;
    
    public ServicioAntecedentesPenales() {
        servicioAntecedente = new ServicioAntecedente();
        servicioCiudadano = new ServicioCiudadano();
        servicioDelito = new ServicioDelito();
        servicioTipoDocumento = new ServicioTipoDocumento();
    }

    @WebMethod
    public boolean eliminarCiudadano(@WebParam(name = "arg0") String cedula)  {
       return servicioCiudadano.eliminarCiudadano(cedula);
    }

    @WebMethod
    public boolean agregarCiudadano(@WebParam(name = "arg0") Ciudadano ciudadano)  {
        return servicioCiudadano.agregarCiudadano(ciudadano);
    }

    @WebMethod
    public Ciudadano darCiudadanoPorCedula(@WebParam(name = "arg0") String cedula)  {
        return servicioCiudadano.darCiudadanoPorCedula(cedula);
    }

    @WebMethod
    public ArrayList<Ciudadano> darCiudadanos()  {
        return servicioCiudadano.darCiudadanos();
    }

    @WebMethod
    public boolean actualizarCiudadano(@WebParam(name = "arg0") Ciudadano ciudadano)  {
        return servicioCiudadano.actualizarCiudadano(ciudadano);
    }

    @WebMethod
    public Delito darDelitoPorCodigo(@WebParam(name = "arg0") int codigo)  {
        return servicioDelito.darDelitoPorCodigo(codigo);
    }

    @WebMethod
    public ArrayList<Delito> darDelitos()  {
        return servicioDelito.darDelitos();
    }

    @WebMethod
    public ArrayList<Antecedente> darAntecedentes()  {
        return servicioAntecedente.darAntecedentes();
    }

    @WebMethod
    public boolean agregarAntecedente(@WebParam(name = "arg0") Antecedente antecedente)  {
        return servicioAntecedente.agregarAntecedente(antecedente);
    }

    @WebMethod
    public boolean actualizarAntecedente(@WebParam(name = "arg0") Antecedente antecedente)  {
        return servicioAntecedente.actualizarAntecedente(antecedente);
    }

    @WebMethod
    public boolean eliminarAntecedente(@WebParam(name = "arg0") int id)  {
        return servicioAntecedente.eliminarAntecedente(id);
    }

    @WebMethod
    public TipoDocumento darTipoDocumentoPorCodigo(@WebParam(name = "arg0") int codigo)  {
        return servicioTipoDocumento.darTipoDocumentoPorCodigo(codigo);
    }

    @WebMethod
    public ArrayList<TipoDocumento> darTipoDocumentos()  {
        return servicioTipoDocumento.darTipoDocumentos();
    }

    @WebMethod
    public Antecedente darAntecedentePorId(@WebParam(name = "arg0") int id)  {
        return servicioAntecedente.darAntecedentePorId(id);
    }

    @WebMethod
    public int darSentenciaTotalPorCiudadano(@WebParam(name = "arg0") String ciudadanoDi)  {
        return servicioAntecedente.darSentenciaTotalPorCiudadano(ciudadanoDi);
    }

    @WebMethod
    public ArrayList<Antecedente> darAntecedentesPorCiudadano(@WebParam(name = "arg0") String ciudadanoDi)  {
        return servicioAntecedente.darAntecedentesPorCiudadano(ciudadanoDi);
    }

    @WebMethod
    public ArrayList<Antecedente> darAntecedentesPorDelito(@WebParam(name = "arg0") int delitoCodigo)  {
        return servicioAntecedente.darAntecedentesPorDelito(delitoCodigo);
    }

    @WebMethod
    public ArrayList<Antecedente> darAntecedentesPorCiudadanoYDelito(@WebParam(name = "arg0") String ciudadanoDi,
                                                                     @WebParam(name = "arg1") int delitoCodigo)  {
        return servicioAntecedente.darAntecedentesPorCiudadanoYDelito(ciudadanoDi, delitoCodigo);
    }

}
