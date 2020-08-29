
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ciudadano complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ciudadano">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ciudadano", propOrder = { "apellido", "cedula", "fechaNacimiento", "nombre", "tipoDocumento" })
public class Ciudadano {

    protected String apellido;
    protected String cedula;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String nombre;
    protected Integer tipoDocumento;

    /**
     * Gets the value of the apellido property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the cedula property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Sets the value of the cedula property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
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
     * Gets the value of the tipoDocumento property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTipoDocumento(Integer value) {
        this.tipoDocumento = value;
    }

}
