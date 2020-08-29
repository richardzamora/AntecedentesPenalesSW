
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agregarAntecedente complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="agregarAntecedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://model/}antecedente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarAntecedente", propOrder = { "arg0" })
public class AgregarAntecedente {

    protected Antecedente arg0;

    /**
     * Gets the value of the arg0 property.
     *
     * @return
     *     possible object is
     *     {@link Antecedente }
     *
     */
    public Antecedente getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     * @param value
     *     allowed object is
     *     {@link Antecedente }
     *
     */
    public void setArg0(Antecedente value) {
        this.arg0 = value;
    }

}
