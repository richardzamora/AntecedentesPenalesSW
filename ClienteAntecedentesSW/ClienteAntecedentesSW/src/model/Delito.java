
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delito complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="delito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaMaxima" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="penaMinima" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delito", propOrder = { "codigo", "nombre", "penaMaxima", "penaMinima" })
public class Delito {

    protected int codigo;
    protected String nombre;
    protected int penaMaxima;
    protected int penaMinima;

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
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the penaMaxima property.
     *
     */
    public int getPenaMaxima() {
        return penaMaxima;
    }

    /**
     * Sets the value of the penaMaxima property.
     *
     */
    public void setPenaMaxima(int value) {
        this.penaMaxima = value;
    }

    /**
     * Gets the value of the penaMinima property.
     *
     */
    public int getPenaMinima() {
        return penaMinima;
    }

    /**
     * Sets the value of the penaMinima property.
     *
     */
    public void setPenaMinima(int value) {
        this.penaMinima = value;
    }

}
