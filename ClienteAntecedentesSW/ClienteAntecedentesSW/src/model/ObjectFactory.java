
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DarAntecedentePorId_QNAME = new QName("http://model/", "darAntecedentePorId");
    private final static QName _DarCiudadanosResponse_QNAME = new QName("http://model/", "darCiudadanosResponse");
    private final static QName _DarTipoDocumentos_QNAME = new QName("http://model/", "darTipoDocumentos");
    private final static QName _DarDelitos_QNAME = new QName("http://model/", "darDelitos");
    private final static QName _DarAntecedentesPorDelitoResponse_QNAME =
        new QName("http://model/", "darAntecedentesPorDelitoResponse");
    private final static QName _AgregarAntecedente_QNAME = new QName("http://model/", "agregarAntecedente");
    private final static QName _DarAntecedentesPorDelito_QNAME = new QName("http://model/", "darAntecedentesPorDelito");
    private final static QName _DarAntecedentesPorCiudadanoResponse_QNAME =
        new QName("http://model/", "darAntecedentesPorCiudadanoResponse");
    private final static QName _DarCiudadanoPorCedulaResponse_QNAME =
        new QName("http://model/", "darCiudadanoPorCedulaResponse");
    private final static QName _EliminarCiudadano_QNAME = new QName("http://model/", "eliminarCiudadano");
    private final static QName _DarAntecedentesPorCiudadanoYDelito_QNAME =
        new QName("http://model/", "darAntecedentesPorCiudadanoYDelito");
    private final static QName _DarAntecedentesResponse_QNAME = new QName("http://model/", "darAntecedentesResponse");
    private final static QName _DarCiudadanoPorCedula_QNAME = new QName("http://model/", "darCiudadanoPorCedula");
    private final static QName _DarSentenciaTotalPorCiudadano_QNAME =
        new QName("http://model/", "darSentenciaTotalPorCiudadano");
    private final static QName _DarTipoDocumentosResponse_QNAME =
        new QName("http://model/", "darTipoDocumentosResponse");
    private final static QName _DarSentenciaTotalPorCiudadanoResponse_QNAME =
        new QName("http://model/", "darSentenciaTotalPorCiudadanoResponse");
    private final static QName _EliminarCiudadanoResponse_QNAME =
        new QName("http://model/", "eliminarCiudadanoResponse");
    private final static QName _ActualizarCiudadanoResponse_QNAME =
        new QName("http://model/", "actualizarCiudadanoResponse");
    private final static QName _DarDelitoPorCodigo_QNAME = new QName("http://model/", "darDelitoPorCodigo");
    private final static QName _EliminarAntecedenteResponse_QNAME =
        new QName("http://model/", "eliminarAntecedenteResponse");
    private final static QName _ActualizarAntecedenteResponse_QNAME =
        new QName("http://model/", "actualizarAntecedenteResponse");
    private final static QName _DarAntecedentesPorCiudadanoYDelitoResponse_QNAME =
        new QName("http://model/", "darAntecedentesPorCiudadanoYDelitoResponse");
    private final static QName _DarDelitosResponse_QNAME = new QName("http://model/", "darDelitosResponse");
    private final static QName _EliminarAntecedente_QNAME = new QName("http://model/", "eliminarAntecedente");
    private final static QName _AgregarCiudadanoResponse_QNAME = new QName("http://model/", "agregarCiudadanoResponse");
    private final static QName _DarDelitoPorCodigoResponse_QNAME =
        new QName("http://model/", "darDelitoPorCodigoResponse");
    private final static QName _AgregarAntecedenteResponse_QNAME =
        new QName("http://model/", "agregarAntecedenteResponse");
    private final static QName _ActualizarAntecedente_QNAME = new QName("http://model/", "actualizarAntecedente");
    private final static QName _DarAntecedentePorIdResponse_QNAME =
        new QName("http://model/", "darAntecedentePorIdResponse");
    private final static QName _DarAntecedentesPorCiudadano_QNAME =
        new QName("http://model/", "darAntecedentesPorCiudadano");
    private final static QName _AgregarCiudadano_QNAME = new QName("http://model/", "agregarCiudadano");
    private final static QName _ActualizarCiudadano_QNAME = new QName("http://model/", "actualizarCiudadano");
    private final static QName _DarCiudadanos_QNAME = new QName("http://model/", "darCiudadanos");
    private final static QName _DarAntecedentes_QNAME = new QName("http://model/", "darAntecedentes");
    private final static QName _DarTipoDocumentoPorCodigoResponse_QNAME =
        new QName("http://model/", "darTipoDocumentoPorCodigoResponse");
    private final static QName _DarTipoDocumentoPorCodigo_QNAME =
        new QName("http://model/", "darTipoDocumentoPorCodigo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DarAntecedentesPorCiudadanoYDelitoResponse }
     *
     */
    public DarAntecedentesPorCiudadanoYDelitoResponse createDarAntecedentesPorCiudadanoYDelitoResponse() {
        return new DarAntecedentesPorCiudadanoYDelitoResponse();
    }

    /**
     * Create an instance of {@link DarDelitosResponse }
     *
     */
    public DarDelitosResponse createDarDelitosResponse() {
        return new DarDelitosResponse();
    }

    /**
     * Create an instance of {@link EliminarAntecedente }
     *
     */
    public EliminarAntecedente createEliminarAntecedente() {
        return new EliminarAntecedente();
    }

    /**
     * Create an instance of {@link DarDelitoPorCodigoResponse }
     *
     */
    public DarDelitoPorCodigoResponse createDarDelitoPorCodigoResponse() {
        return new DarDelitoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link AgregarCiudadanoResponse }
     *
     */
    public AgregarCiudadanoResponse createAgregarCiudadanoResponse() {
        return new AgregarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link AgregarAntecedenteResponse }
     *
     */
    public AgregarAntecedenteResponse createAgregarAntecedenteResponse() {
        return new AgregarAntecedenteResponse();
    }

    /**
     * Create an instance of {@link ActualizarAntecedente }
     *
     */
    public ActualizarAntecedente createActualizarAntecedente() {
        return new ActualizarAntecedente();
    }

    /**
     * Create an instance of {@link DarAntecedentePorIdResponse }
     *
     */
    public DarAntecedentePorIdResponse createDarAntecedentePorIdResponse() {
        return new DarAntecedentePorIdResponse();
    }

    /**
     * Create an instance of {@link DarAntecedentesPorCiudadano }
     *
     */
    public DarAntecedentesPorCiudadano createDarAntecedentesPorCiudadano() {
        return new DarAntecedentesPorCiudadano();
    }

    /**
     * Create an instance of {@link ActualizarCiudadano }
     *
     */
    public ActualizarCiudadano createActualizarCiudadano() {
        return new ActualizarCiudadano();
    }

    /**
     * Create an instance of {@link AgregarCiudadano }
     *
     */
    public AgregarCiudadano createAgregarCiudadano() {
        return new AgregarCiudadano();
    }

    /**
     * Create an instance of {@link DarCiudadanos }
     *
     */
    public DarCiudadanos createDarCiudadanos() {
        return new DarCiudadanos();
    }

    /**
     * Create an instance of {@link DarTipoDocumentoPorCodigoResponse }
     *
     */
    public DarTipoDocumentoPorCodigoResponse createDarTipoDocumentoPorCodigoResponse() {
        return new DarTipoDocumentoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link DarAntecedentes }
     *
     */
    public DarAntecedentes createDarAntecedentes() {
        return new DarAntecedentes();
    }

    /**
     * Create an instance of {@link DarTipoDocumentoPorCodigo }
     *
     */
    public DarTipoDocumentoPorCodigo createDarTipoDocumentoPorCodigo() {
        return new DarTipoDocumentoPorCodigo();
    }

    /**
     * Create an instance of {@link DarCiudadanosResponse }
     *
     */
    public DarCiudadanosResponse createDarCiudadanosResponse() {
        return new DarCiudadanosResponse();
    }

    /**
     * Create an instance of {@link DarAntecedentePorId }
     *
     */
    public DarAntecedentePorId createDarAntecedentePorId() {
        return new DarAntecedentePorId();
    }

    /**
     * Create an instance of {@link DarTipoDocumentos }
     *
     */
    public DarTipoDocumentos createDarTipoDocumentos() {
        return new DarTipoDocumentos();
    }

    /**
     * Create an instance of {@link DarDelitos }
     *
     */
    public DarDelitos createDarDelitos() {
        return new DarDelitos();
    }

    /**
     * Create an instance of {@link DarAntecedentesPorDelitoResponse }
     *
     */
    public DarAntecedentesPorDelitoResponse createDarAntecedentesPorDelitoResponse() {
        return new DarAntecedentesPorDelitoResponse();
    }

    /**
     * Create an instance of {@link AgregarAntecedente }
     *
     */
    public AgregarAntecedente createAgregarAntecedente() {
        return new AgregarAntecedente();
    }

    /**
     * Create an instance of {@link DarAntecedentesPorDelito }
     *
     */
    public DarAntecedentesPorDelito createDarAntecedentesPorDelito() {
        return new DarAntecedentesPorDelito();
    }

    /**
     * Create an instance of {@link EliminarCiudadano }
     *
     */
    public EliminarCiudadano createEliminarCiudadano() {
        return new EliminarCiudadano();
    }

    /**
     * Create an instance of {@link DarCiudadanoPorCedulaResponse }
     *
     */
    public DarCiudadanoPorCedulaResponse createDarCiudadanoPorCedulaResponse() {
        return new DarCiudadanoPorCedulaResponse();
    }

    /**
     * Create an instance of {@link DarAntecedentesPorCiudadanoResponse }
     *
     */
    public DarAntecedentesPorCiudadanoResponse createDarAntecedentesPorCiudadanoResponse() {
        return new DarAntecedentesPorCiudadanoResponse();
    }

    /**
     * Create an instance of {@link DarAntecedentesPorCiudadanoYDelito }
     *
     */
    public DarAntecedentesPorCiudadanoYDelito createDarAntecedentesPorCiudadanoYDelito() {
        return new DarAntecedentesPorCiudadanoYDelito();
    }

    /**
     * Create an instance of {@link DarAntecedentesResponse }
     *
     */
    public DarAntecedentesResponse createDarAntecedentesResponse() {
        return new DarAntecedentesResponse();
    }

    /**
     * Create an instance of {@link DarCiudadanoPorCedula }
     *
     */
    public DarCiudadanoPorCedula createDarCiudadanoPorCedula() {
        return new DarCiudadanoPorCedula();
    }

    /**
     * Create an instance of {@link DarSentenciaTotalPorCiudadanoResponse }
     *
     */
    public DarSentenciaTotalPorCiudadanoResponse createDarSentenciaTotalPorCiudadanoResponse() {
        return new DarSentenciaTotalPorCiudadanoResponse();
    }

    /**
     * Create an instance of {@link DarTipoDocumentosResponse }
     *
     */
    public DarTipoDocumentosResponse createDarTipoDocumentosResponse() {
        return new DarTipoDocumentosResponse();
    }

    /**
     * Create an instance of {@link DarSentenciaTotalPorCiudadano }
     *
     */
    public DarSentenciaTotalPorCiudadano createDarSentenciaTotalPorCiudadano() {
        return new DarSentenciaTotalPorCiudadano();
    }

    /**
     * Create an instance of {@link EliminarAntecedenteResponse }
     *
     */
    public EliminarAntecedenteResponse createEliminarAntecedenteResponse() {
        return new EliminarAntecedenteResponse();
    }

    /**
     * Create an instance of {@link DarDelitoPorCodigo }
     *
     */
    public DarDelitoPorCodigo createDarDelitoPorCodigo() {
        return new DarDelitoPorCodigo();
    }

    /**
     * Create an instance of {@link ActualizarCiudadanoResponse }
     *
     */
    public ActualizarCiudadanoResponse createActualizarCiudadanoResponse() {
        return new ActualizarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link EliminarCiudadanoResponse }
     *
     */
    public EliminarCiudadanoResponse createEliminarCiudadanoResponse() {
        return new EliminarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link ActualizarAntecedenteResponse }
     *
     */
    public ActualizarAntecedenteResponse createActualizarAntecedenteResponse() {
        return new ActualizarAntecedenteResponse();
    }

    /**
     * Create an instance of {@link Antecedente }
     *
     */
    public Antecedente createAntecedente() {
        return new Antecedente();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     *
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link Ciudadano }
     *
     */
    public Ciudadano createCiudadano() {
        return new Ciudadano();
    }

    /**
     * Create an instance of {@link Delito }
     *
     */
    public Delito createDelito() {
        return new Delito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentePorId }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentePorId")
    public JAXBElement<DarAntecedentePorId> createDarAntecedentePorId(DarAntecedentePorId value) {
        return new JAXBElement<DarAntecedentePorId>(_DarAntecedentePorId_QNAME, DarAntecedentePorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarCiudadanosResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darCiudadanosResponse")
    public JAXBElement<DarCiudadanosResponse> createDarCiudadanosResponse(DarCiudadanosResponse value) {
        return new JAXBElement<DarCiudadanosResponse>(_DarCiudadanosResponse_QNAME, DarCiudadanosResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarTipoDocumentos }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darTipoDocumentos")
    public JAXBElement<DarTipoDocumentos> createDarTipoDocumentos(DarTipoDocumentos value) {
        return new JAXBElement<DarTipoDocumentos>(_DarTipoDocumentos_QNAME, DarTipoDocumentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarDelitos }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darDelitos")
    public JAXBElement<DarDelitos> createDarDelitos(DarDelitos value) {
        return new JAXBElement<DarDelitos>(_DarDelitos_QNAME, DarDelitos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorDelitoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorDelitoResponse")
    public JAXBElement<DarAntecedentesPorDelitoResponse> createDarAntecedentesPorDelitoResponse(DarAntecedentesPorDelitoResponse value) {
        return new JAXBElement<DarAntecedentesPorDelitoResponse>(_DarAntecedentesPorDelitoResponse_QNAME,
                                                                 DarAntecedentesPorDelitoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAntecedente }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "agregarAntecedente")
    public JAXBElement<AgregarAntecedente> createAgregarAntecedente(AgregarAntecedente value) {
        return new JAXBElement<AgregarAntecedente>(_AgregarAntecedente_QNAME, AgregarAntecedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorDelito }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorDelito")
    public JAXBElement<DarAntecedentesPorDelito> createDarAntecedentesPorDelito(DarAntecedentesPorDelito value) {
        return new JAXBElement<DarAntecedentesPorDelito>(_DarAntecedentesPorDelito_QNAME,
                                                         DarAntecedentesPorDelito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorCiudadanoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorCiudadanoResponse")
    public JAXBElement<DarAntecedentesPorCiudadanoResponse> createDarAntecedentesPorCiudadanoResponse(DarAntecedentesPorCiudadanoResponse value) {
        return new JAXBElement<DarAntecedentesPorCiudadanoResponse>(_DarAntecedentesPorCiudadanoResponse_QNAME,
                                                                    DarAntecedentesPorCiudadanoResponse.class, null,
                                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarCiudadanoPorCedulaResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darCiudadanoPorCedulaResponse")
    public JAXBElement<DarCiudadanoPorCedulaResponse> createDarCiudadanoPorCedulaResponse(DarCiudadanoPorCedulaResponse value) {
        return new JAXBElement<DarCiudadanoPorCedulaResponse>(_DarCiudadanoPorCedulaResponse_QNAME,
                                                              DarCiudadanoPorCedulaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadano }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarCiudadano")
    public JAXBElement<EliminarCiudadano> createEliminarCiudadano(EliminarCiudadano value) {
        return new JAXBElement<EliminarCiudadano>(_EliminarCiudadano_QNAME, EliminarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorCiudadanoYDelito }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorCiudadanoYDelito")
    public JAXBElement<DarAntecedentesPorCiudadanoYDelito> createDarAntecedentesPorCiudadanoYDelito(DarAntecedentesPorCiudadanoYDelito value) {
        return new JAXBElement<DarAntecedentesPorCiudadanoYDelito>(_DarAntecedentesPorCiudadanoYDelito_QNAME,
                                                                   DarAntecedentesPorCiudadanoYDelito.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesResponse")
    public JAXBElement<DarAntecedentesResponse> createDarAntecedentesResponse(DarAntecedentesResponse value) {
        return new JAXBElement<DarAntecedentesResponse>(_DarAntecedentesResponse_QNAME, DarAntecedentesResponse.class,
                                                        null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarCiudadanoPorCedula }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darCiudadanoPorCedula")
    public JAXBElement<DarCiudadanoPorCedula> createDarCiudadanoPorCedula(DarCiudadanoPorCedula value) {
        return new JAXBElement<DarCiudadanoPorCedula>(_DarCiudadanoPorCedula_QNAME, DarCiudadanoPorCedula.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarSentenciaTotalPorCiudadano }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darSentenciaTotalPorCiudadano")
    public JAXBElement<DarSentenciaTotalPorCiudadano> createDarSentenciaTotalPorCiudadano(DarSentenciaTotalPorCiudadano value) {
        return new JAXBElement<DarSentenciaTotalPorCiudadano>(_DarSentenciaTotalPorCiudadano_QNAME,
                                                              DarSentenciaTotalPorCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarTipoDocumentosResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darTipoDocumentosResponse")
    public JAXBElement<DarTipoDocumentosResponse> createDarTipoDocumentosResponse(DarTipoDocumentosResponse value) {
        return new JAXBElement<DarTipoDocumentosResponse>(_DarTipoDocumentosResponse_QNAME,
                                                          DarTipoDocumentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarSentenciaTotalPorCiudadanoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darSentenciaTotalPorCiudadanoResponse")
    public JAXBElement<DarSentenciaTotalPorCiudadanoResponse> createDarSentenciaTotalPorCiudadanoResponse(DarSentenciaTotalPorCiudadanoResponse value) {
        return new JAXBElement<DarSentenciaTotalPorCiudadanoResponse>(_DarSentenciaTotalPorCiudadanoResponse_QNAME,
                                                                      DarSentenciaTotalPorCiudadanoResponse.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadanoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarCiudadanoResponse")
    public JAXBElement<EliminarCiudadanoResponse> createEliminarCiudadanoResponse(EliminarCiudadanoResponse value) {
        return new JAXBElement<EliminarCiudadanoResponse>(_EliminarCiudadanoResponse_QNAME,
                                                          EliminarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadanoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarCiudadanoResponse")
    public JAXBElement<ActualizarCiudadanoResponse> createActualizarCiudadanoResponse(ActualizarCiudadanoResponse value) {
        return new JAXBElement<ActualizarCiudadanoResponse>(_ActualizarCiudadanoResponse_QNAME,
                                                            ActualizarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarDelitoPorCodigo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darDelitoPorCodigo")
    public JAXBElement<DarDelitoPorCodigo> createDarDelitoPorCodigo(DarDelitoPorCodigo value) {
        return new JAXBElement<DarDelitoPorCodigo>(_DarDelitoPorCodigo_QNAME, DarDelitoPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAntecedenteResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarAntecedenteResponse")
    public JAXBElement<EliminarAntecedenteResponse> createEliminarAntecedenteResponse(EliminarAntecedenteResponse value) {
        return new JAXBElement<EliminarAntecedenteResponse>(_EliminarAntecedenteResponse_QNAME,
                                                            EliminarAntecedenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAntecedenteResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarAntecedenteResponse")
    public JAXBElement<ActualizarAntecedenteResponse> createActualizarAntecedenteResponse(ActualizarAntecedenteResponse value) {
        return new JAXBElement<ActualizarAntecedenteResponse>(_ActualizarAntecedenteResponse_QNAME,
                                                              ActualizarAntecedenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorCiudadanoYDelitoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorCiudadanoYDelitoResponse")
    public JAXBElement<DarAntecedentesPorCiudadanoYDelitoResponse> createDarAntecedentesPorCiudadanoYDelitoResponse(DarAntecedentesPorCiudadanoYDelitoResponse value) {
        return new JAXBElement<DarAntecedentesPorCiudadanoYDelitoResponse>(_DarAntecedentesPorCiudadanoYDelitoResponse_QNAME,
                                                                           DarAntecedentesPorCiudadanoYDelitoResponse.class,
                                                                           null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarDelitosResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darDelitosResponse")
    public JAXBElement<DarDelitosResponse> createDarDelitosResponse(DarDelitosResponse value) {
        return new JAXBElement<DarDelitosResponse>(_DarDelitosResponse_QNAME, DarDelitosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAntecedente }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarAntecedente")
    public JAXBElement<EliminarAntecedente> createEliminarAntecedente(EliminarAntecedente value) {
        return new JAXBElement<EliminarAntecedente>(_EliminarAntecedente_QNAME, EliminarAntecedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCiudadanoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "agregarCiudadanoResponse")
    public JAXBElement<AgregarCiudadanoResponse> createAgregarCiudadanoResponse(AgregarCiudadanoResponse value) {
        return new JAXBElement<AgregarCiudadanoResponse>(_AgregarCiudadanoResponse_QNAME,
                                                         AgregarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarDelitoPorCodigoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darDelitoPorCodigoResponse")
    public JAXBElement<DarDelitoPorCodigoResponse> createDarDelitoPorCodigoResponse(DarDelitoPorCodigoResponse value) {
        return new JAXBElement<DarDelitoPorCodigoResponse>(_DarDelitoPorCodigoResponse_QNAME,
                                                           DarDelitoPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAntecedenteResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "agregarAntecedenteResponse")
    public JAXBElement<AgregarAntecedenteResponse> createAgregarAntecedenteResponse(AgregarAntecedenteResponse value) {
        return new JAXBElement<AgregarAntecedenteResponse>(_AgregarAntecedenteResponse_QNAME,
                                                           AgregarAntecedenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAntecedente }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarAntecedente")
    public JAXBElement<ActualizarAntecedente> createActualizarAntecedente(ActualizarAntecedente value) {
        return new JAXBElement<ActualizarAntecedente>(_ActualizarAntecedente_QNAME, ActualizarAntecedente.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentePorIdResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentePorIdResponse")
    public JAXBElement<DarAntecedentePorIdResponse> createDarAntecedentePorIdResponse(DarAntecedentePorIdResponse value) {
        return new JAXBElement<DarAntecedentePorIdResponse>(_DarAntecedentePorIdResponse_QNAME,
                                                            DarAntecedentePorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentesPorCiudadano }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentesPorCiudadano")
    public JAXBElement<DarAntecedentesPorCiudadano> createDarAntecedentesPorCiudadano(DarAntecedentesPorCiudadano value) {
        return new JAXBElement<DarAntecedentesPorCiudadano>(_DarAntecedentesPorCiudadano_QNAME,
                                                            DarAntecedentesPorCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCiudadano }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "agregarCiudadano")
    public JAXBElement<AgregarCiudadano> createAgregarCiudadano(AgregarCiudadano value) {
        return new JAXBElement<AgregarCiudadano>(_AgregarCiudadano_QNAME, AgregarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadano }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarCiudadano")
    public JAXBElement<ActualizarCiudadano> createActualizarCiudadano(ActualizarCiudadano value) {
        return new JAXBElement<ActualizarCiudadano>(_ActualizarCiudadano_QNAME, ActualizarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarCiudadanos }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darCiudadanos")
    public JAXBElement<DarCiudadanos> createDarCiudadanos(DarCiudadanos value) {
        return new JAXBElement<DarCiudadanos>(_DarCiudadanos_QNAME, DarCiudadanos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarAntecedentes }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darAntecedentes")
    public JAXBElement<DarAntecedentes> createDarAntecedentes(DarAntecedentes value) {
        return new JAXBElement<DarAntecedentes>(_DarAntecedentes_QNAME, DarAntecedentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarTipoDocumentoPorCodigoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darTipoDocumentoPorCodigoResponse")
    public JAXBElement<DarTipoDocumentoPorCodigoResponse> createDarTipoDocumentoPorCodigoResponse(DarTipoDocumentoPorCodigoResponse value) {
        return new JAXBElement<DarTipoDocumentoPorCodigoResponse>(_DarTipoDocumentoPorCodigoResponse_QNAME,
                                                                  DarTipoDocumentoPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarTipoDocumentoPorCodigo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://model/", name = "darTipoDocumentoPorCodigo")
    public JAXBElement<DarTipoDocumentoPorCodigo> createDarTipoDocumentoPorCodigo(DarTipoDocumentoPorCodigo value) {
        return new JAXBElement<DarTipoDocumentoPorCodigo>(_DarTipoDocumentoPorCodigo_QNAME,
                                                          DarTipoDocumentoPorCodigo.class, null, value);
    }

}
