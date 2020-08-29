
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for darDelitoPorCodigoResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="darDelitoPorCodigoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://model/}delito" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "darDelitoPorCodigoResponse", propOrder = { "_return" })
public class DarDelitoPorCodigoResponse {

    @XmlElement(name = "return")
    protected Delito _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link Delito }
     *
     */
    public Delito getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link Delito }
     *
     */
    public void setReturn(Delito value) {
        this._return = value;
    }

}
