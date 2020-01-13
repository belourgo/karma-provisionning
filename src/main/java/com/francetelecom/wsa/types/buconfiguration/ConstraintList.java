
package com.francetelecom.wsa.types.buconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConstraintList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConstraintList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://WSA.francetelecom.com/types/BuConfiguration}ArrayOfConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintList", propOrder = {
    "list"
})
public class ConstraintList {

    protected ArrayOfConstraint list;

    /**
     * Obtient la valeur de la propriété list.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConstraint }
     *     
     */
    public ArrayOfConstraint getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConstraint }
     *     
     */
    public void setList(ArrayOfConstraint value) {
        this.list = value;
    }

}
