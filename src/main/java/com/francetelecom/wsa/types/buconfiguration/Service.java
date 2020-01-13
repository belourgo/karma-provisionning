
package com.francetelecom.wsa.types.buconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Service complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPEIdentifier" type="{http://WSA.francetelecom.com/types/BuConfiguration}IdentifierList" minOccurs="0"/&gt;
 *         &lt;element name="CPEType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complexValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://WSA.francetelecom.com/types/BuConfiguration}ConstraintList" minOccurs="0"/&gt;
 *         &lt;element name="parentServRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentServType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="servRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simpleValue" type="{http://WSA.francetelecom.com/types/BuConfiguration}SimpleValueList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "cpeIdentifier",
    "cpeType",
    "action",
    "complexValue",
    "constraints",
    "parentServRef",
    "parentServType",
    "servPriority",
    "servRef",
    "servType",
    "simpleValue"
})
public class Service {

    @XmlElement(name = "CPEIdentifier")
    protected IdentifierList cpeIdentifier;
    @XmlElement(name = "CPEType")
    protected String cpeType;
    protected String action;
    protected String complexValue;
    protected ConstraintList constraints;
    protected String parentServRef;
    protected String parentServType;
    protected Integer servPriority;
    protected String servRef;
    protected String servType;
    protected SimpleValueList simpleValue;

    /**
     * Obtient la valeur de la propriété cpeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierList }
     *     
     */
    public IdentifierList getCPEIdentifier() {
        return cpeIdentifier;
    }

    /**
     * Définit la valeur de la propriété cpeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierList }
     *     
     */
    public void setCPEIdentifier(IdentifierList value) {
        this.cpeIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété cpeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPEType() {
        return cpeType;
    }

    /**
     * Définit la valeur de la propriété cpeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPEType(String value) {
        this.cpeType = value;
    }

    /**
     * Obtient la valeur de la propriété action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Définit la valeur de la propriété action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtient la valeur de la propriété complexValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexValue() {
        return complexValue;
    }

    /**
     * Définit la valeur de la propriété complexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexValue(String value) {
        this.complexValue = value;
    }

    /**
     * Obtient la valeur de la propriété constraints.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintList }
     *     
     */
    public ConstraintList getConstraints() {
        return constraints;
    }

    /**
     * Définit la valeur de la propriété constraints.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintList }
     *     
     */
    public void setConstraints(ConstraintList value) {
        this.constraints = value;
    }

    /**
     * Obtient la valeur de la propriété parentServRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentServRef() {
        return parentServRef;
    }

    /**
     * Définit la valeur de la propriété parentServRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentServRef(String value) {
        this.parentServRef = value;
    }

    /**
     * Obtient la valeur de la propriété parentServType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentServType() {
        return parentServType;
    }

    /**
     * Définit la valeur de la propriété parentServType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentServType(String value) {
        this.parentServType = value;
    }

    /**
     * Obtient la valeur de la propriété servPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServPriority() {
        return servPriority;
    }

    /**
     * Définit la valeur de la propriété servPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServPriority(Integer value) {
        this.servPriority = value;
    }

    /**
     * Obtient la valeur de la propriété servRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef() {
        return servRef;
    }

    /**
     * Définit la valeur de la propriété servRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef(String value) {
        this.servRef = value;
    }

    /**
     * Obtient la valeur de la propriété servType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServType() {
        return servType;
    }

    /**
     * Définit la valeur de la propriété servType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServType(String value) {
        this.servType = value;
    }

    /**
     * Obtient la valeur de la propriété simpleValue.
     * 
     * @return
     *     possible object is
     *     {@link SimpleValueList }
     *     
     */
    public SimpleValueList getSimpleValue() {
        return simpleValue;
    }

    /**
     * Définit la valeur de la propriété simpleValue.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleValueList }
     *     
     */
    public void setSimpleValue(SimpleValueList value) {
        this.simpleValue = value;
    }

}
