package model;

import estructural.Antecedente;
import estructural.Ciudadano;
import estructural.Delito;
import estructural.TipoDocumento;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("model")
public class ServicioAntecedentesPenalesREST {
    ServicioCiudadano servicioCiudadano;
    ServicioAntecedente servicioAntecedente;
    ServicioDelito servicioDelito;
    ServicioTipoDocumento servicioTipoDocumento;
    
    public ServicioAntecedentesPenalesREST() {
        servicioAntecedente = new ServicioAntecedente();
        servicioCiudadano = new ServicioCiudadano();
        servicioDelito = new ServicioDelito();
        servicioTipoDocumento = new ServicioTipoDocumento();
    }

    @DELETE
    @Consumes("application/json")
    @Produces("application/json")
    @Path("eliminarCiudadano")
    public  boolean eliminarCiudadano(@QueryParam("cedula") String cedula)  {
        return servicioCiudadano.eliminarCiudadano(cedula);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("agregarCiudadano")
    public boolean agregarCiudadano(Ciudadano ciudadano)  {
        return servicioCiudadano.agregarCiudadano(ciudadano);
    }

    @GET
    @Produces("application/json")
    @Path("darCiudadano")
    public Ciudadano darCiudadanoPorCedula(@QueryParam("cedula") String cedula)  {
        return servicioCiudadano.darCiudadanoPorCedula(cedula);
    }

    @GET
    @Produces("application/json")
    @Path("darCiudadanos")
    public ArrayList<Ciudadano> darCiudadanos()  {
        return servicioCiudadano.darCiudadanos();
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("actualizarCiudadano")
    public boolean actualizarCiudadano(Ciudadano ciudadano)  {
        return servicioCiudadano.actualizarCiudadano(ciudadano);
    }

    @GET
    @Produces("application/json")
    @Path("darDelito")
    public Delito darDelitoPorCodigo(@QueryParam("codigo") int codigo)  {
        return servicioDelito.darDelitoPorCodigo(codigo);
    }

    @GET
    @Produces("application/json")
    @Path("darDelitos")
    public ArrayList<Delito> darDelitos()  {
        return servicioDelito.darDelitos();
    }

    @GET
    @Produces("application/json")
    @Path("darAntecedentes")
    public ArrayList<Antecedente> darAntecedentes()  {
        return servicioAntecedente.darAntecedentes();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("AgregarAntecedente")
    public boolean agregarAntecedente(Antecedente antecedente)  {
        return servicioAntecedente.agregarAntecedente(antecedente);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("actualizarAntecedente")
    public boolean actualizarAntecedente(Antecedente antecedente)  {
        return servicioAntecedente.actualizarAntecedente(antecedente);
    }

    @DELETE
    @Consumes("application/json")
    @Produces("application/json")
    @Path("eliminarAntecedente")
    public boolean eliminarAntecedente(@QueryParam("id") int id)  {
        return servicioAntecedente.eliminarAntecedente(id);
    }

    @GET
    @Produces("application/json")
    @Path("darTipoDocumento")
    public TipoDocumento darTipoDocumentoPorCodigo(@QueryParam("codigo") int codigo)  {
        return servicioTipoDocumento.darTipoDocumentoPorCodigo(codigo);
    }

    @GET
    @Produces("application/json")
    @Path("darTipoDocumentos")
    public ArrayList<TipoDocumento> darTipoDocumentos()  {
        return servicioTipoDocumento.darTipoDocumentos();
    }

    @GET
    @Produces("application/json")
    @Path("darAntecedente")
    public Antecedente darAntecedentePorId(@QueryParam("id") int id)  {
        return servicioAntecedente.darAntecedentePorId(id);
    }

    @GET
    @Produces("application/json")
    @Path("darSentenciaTotal")
    public int darSentenciaTotalPorCiudadano(@QueryParam("ciudadanoDi") String ciudadanoDi)  {
        return servicioAntecedente.darSentenciaTotalPorCiudadano(ciudadanoDi);
    }

    @GET
    @Produces("application/json")
    @Path("darAntecedentesCiudadano")
    public ArrayList<Antecedente> darAntecedentesPorCiudadano(@QueryParam("ciudadanoDi") String ciudadanoDi)  {
        return servicioAntecedente.darAntecedentesPorCiudadano(ciudadanoDi);
    }

    @GET
    @Produces("application/json")
    @Path("darAntecedentesDelito")
    public ArrayList<Antecedente> darAntecedentesPorDelito(@QueryParam("delitoCodigo") int delitoCodigo)  {
        return servicioAntecedente.darAntecedentesPorDelito(delitoCodigo);
    }

    @GET
    @Produces("application/json")
    @Path("darAntecedentesCiudadanoDelito")
    public ArrayList<Antecedente> darAntecedentesPorCiudadanoYDelito(@QueryParam("ciudadanoDi") String ciudadanoDi,
                                                                     @QueryParam("delitoCodigo") int delitoCodigo)  {
        return servicioAntecedente.darAntecedentesPorCiudadanoYDelito(ciudadanoDi, delitoCodigo);
    }

}
