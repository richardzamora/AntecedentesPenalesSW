
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumento complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = { "codigo", "descripcion", "siglas" })
public class TipoDocumento {

    protected int codigo;
    protected String descripcion;
    protected String siglas;

    /**
     * Gets the value of the codigo property.
     *
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the siglas property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * Sets the value of the siglas property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSiglas(String value) {
        this.siglas = value;
    }

}
