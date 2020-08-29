
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for antecedente complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="antecedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadanoDi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delitoCodigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDelito" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sentencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antecedente", propOrder = {
         "ciudad", "ciudadanoDi", "delitoCodigo", "estado", "fechaDelito", "id", "sentencia" })
public class Antecedente {

    protected String ciudad;
    protected String ciudadanoDi;
    protected int delitoCodigo;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDelito;
    protected int id;
    protected int sentencia;

    /**
     * Gets the value of the ciudad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the ciudadanoDi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCiudadanoDi() {
        return ciudadanoDi;
    }

    /**
     * Sets the value of the ciudadanoDi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCiudadanoDi(String value) {
        this.ciudadanoDi = value;
    }

    /**
     * Gets the value of the delitoCodigo property.
     *
     */
    public int getDelitoCodigo() {
        return delitoCodigo;
    }

    /**
     * Sets the value of the delitoCodigo property.
     *
     */
    public void setDelitoCodigo(int value) {
        this.delitoCodigo = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaDelito property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaDelito() {
        return fechaDelito;
    }

    /**
     * Sets the value of the fechaDelito property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaDelito(XMLGregorianCalendar value) {
        this.fechaDelito = value;
    }

    /**
     * Gets the value of the id property.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the sentencia property.
     *
     */
    public int getSentencia() {
        return sentencia;
    }

    /**
     * Sets the value of the sentencia property.
     *
     */
    public void setSentencia(int value) {
        this.sentencia = value;
    }

}
