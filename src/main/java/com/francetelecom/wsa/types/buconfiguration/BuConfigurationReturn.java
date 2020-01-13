
package com.francetelecom.wsa.types.buconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour BuConfigurationReturn complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BuConfigurationReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identifierList" type="{http://WSA.francetelecom.com/types/BuConfiguration}IdentifierList" minOccurs="0"/&gt;
 *         &lt;element name="informationList" type="{http://WSA.francetelecom.com/types/BuConfiguration}InformationList" minOccurs="0"/&gt;
 *         &lt;element name="registered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="responseList" type="{http://WSA.francetelecom.com/types/BuConfiguration}ResponseList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuConfigurationReturn", propOrder = {
    "date",
    "identifierList",
    "informationList",
    "registered",
    "responseList"
})
public class BuConfigurationReturn {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected IdentifierList identifierList;
    protected InformationList informationList;
    protected Boolean registered;
    protected ResponseList responseList;

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

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

    /**
     * Obtient la valeur de la propriété registered.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistered() {
        return registered;
    }

    /**
     * Définit la valeur de la propriété registered.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistered(Boolean value) {
        this.registered = value;
    }

    /**
     * Obtient la valeur de la propriété responseList.
     * 
     * @return
     *     possible object is
     *     {@link ResponseList }
     *     
     */
    public ResponseList getResponseList() {
        return responseList;
    }

    /**
     * Définit la valeur de la propriété responseList.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseList }
     *     
     */
    public void setResponseList(ResponseList value) {
        this.responseList = value;
    }

}
