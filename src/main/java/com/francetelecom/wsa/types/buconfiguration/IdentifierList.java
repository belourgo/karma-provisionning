
package com.francetelecom.wsa.types.buconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IdentifierList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentifierList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://WSA.francetelecom.com/types/BuConfiguration}ArrayOfIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierList", propOrder = {
    "list"
})
public class IdentifierList {

    protected ArrayOfIdentifier list;

    /**
     * Obtient la valeur de la propriété list.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIdentifier }
     *     
     */
    public ArrayOfIdentifier getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIdentifier }
     *     
     */
    public void setList(ArrayOfIdentifier value) {
        this.list = value;
    }

}
