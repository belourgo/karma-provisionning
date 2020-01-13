
package com.francetelecom.wsa.wsdl.buconfiguration.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.francetelecom.wsa.types.buconfiguration.IdentifierList;
import com.francetelecom.wsa.types.buconfiguration.InformationList;
import com.francetelecom.wsa.types.buconfiguration.OptionList;
import com.francetelecom.wsa.types.buconfiguration.ServiceList;


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
 *         &lt;element name="identifierList" type="{http://WSA.francetelecom.com/types/BuConfiguration}IdentifierList"/&gt;
 *         &lt;element name="serviceList" type="{http://WSA.francetelecom.com/types/BuConfiguration}ServiceList"/&gt;
 *         &lt;element name="optionList" type="{http://WSA.francetelecom.com/types/BuConfiguration}OptionList"/&gt;
 *         &lt;element name="informationList" type="{http://WSA.francetelecom.com/types/BuConfiguration}InformationList"/&gt;
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
    "identifierList",
    "serviceList",
    "optionList",
    "informationList"
})
@XmlRootElement(name = "setBuConfiguration")
public class SetBuConfiguration {

    @XmlElement(required = true)
    protected IdentifierList identifierList;
    @XmlElement(required = true)
    protected ServiceList serviceList;
    @XmlElement(required = true)
    protected OptionList optionList;
    @XmlElement(required = true)
    protected InformationList informationList;

    /**
     * Obtient la valeur de la propriété identifierList.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierList }
     *     
     */
    public IdentifierList getIdentifierList() {
        return identifierList;
    }

    /**
     * Définit la valeur de la propriété identifierList.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierList }
     *     
     */
    public void setIdentifierList(IdentifierList value) {
        this.identifierList = value;
    }

    /**
     * Obtient la valeur de la propriété serviceList.
     * 
     * @return
     *     possible object is
     *     {@link ServiceList }
     *     
     */
    public ServiceList getServiceList() {
        return serviceList;
    }

    /**
     * Définit la valeur de la propriété serviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceList }
     *     
     */
    public void setServiceList(ServiceList value) {
        this.serviceList = value;
    }

    /**
     * Obtient la valeur de la propriété optionList.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getOptionList() {
        return optionList;
    }

    /**
     * Définit la valeur de la propriété optionList.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setOptionList(OptionList value) {
        this.optionList = value;
    }

    /**
     * Obtient la valeur de la propriété informationList.
     * 
     * @return
     *     possible object is
     *     {@link InformationList }
     *     
     */
    public InformationList getInformationList() {
        return informationList;
    }

    /**
     * Définit la valeur de la propriété informationList.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationList }
     *     
     */
    public void setInformationList(InformationList value) {
        this.informationList = value;
    }

}
