
package com.francetelecom.wsa.wsdl.buconfiguration.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.francetelecom.wsa.types.buconfiguration.BuConfigurationReturn;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setBuConfigurationReturn" type="{http://WSA.francetelecom.com/types/BuConfiguration}BuConfigurationReturn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setBuConfigurationReturn"
})
@XmlRootElement(name = "setBuConfigurationResponse")
public class SetBuConfigurationResponse {

    @XmlElement(required = true)
    protected BuConfigurationReturn setBuConfigurationReturn;

    /**
     * Obtient la valeur de la propriété setBuConfigurationReturn.
     * 
     * @return
     *     possible object is
     *     {@link BuConfigurationReturn }
     *     
     */
    public BuConfigurationReturn getSetBuConfigurationReturn() {
        return setBuConfigurationReturn;
    }

    /**
     * Définit la valeur de la propriété setBuConfigurationReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link BuConfigurationReturn }
     *     
     */
    public void setSetBuConfigurationReturn(BuConfigurationReturn value) {
        this.setBuConfigurationReturn = value;
    }

}
