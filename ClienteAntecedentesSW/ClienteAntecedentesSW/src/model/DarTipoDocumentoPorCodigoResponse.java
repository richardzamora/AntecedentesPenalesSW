
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for darTipoDocumentoPorCodigoResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="darTipoDocumentoPorCodigoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://model/}tipoDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "darTipoDocumentoPorCodigoResponse", propOrder = { "_return" })
public class DarTipoDocumentoPorCodigoResponse {

    @XmlElement(name = "return")
    protected TipoDocumento _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *
     */
    public TipoDocumento getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *
     */
    public void setReturn(TipoDocumento value) {
        this._return = value;
    }

}
