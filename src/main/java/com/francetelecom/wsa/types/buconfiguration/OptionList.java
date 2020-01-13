
package com.francetelecom.wsa.types.buconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OptionList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://WSA.francetelecom.com/types/BuConfiguration}ArrayOfOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionList", propOrder = {
    "list"
})
public class OptionList {

    protected ArrayOfOption list;

    /**
     * Obtient la valeur de la propriété list.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOption }
     *     
     */
    public ArrayOfOption getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOption }
     *     
     */
    public void setList(ArrayOfOption value) {
        this.list = value;
    }

}
