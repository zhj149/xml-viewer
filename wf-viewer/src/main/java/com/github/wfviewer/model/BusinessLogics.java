//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.27 at 10:06:37 PM EEST 
//


package com.github.wfviewer.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}BusinessLogic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessLogic"
})
@XmlRootElement(name = "BusinessLogics")
public class BusinessLogics {

    @XmlElement(name = "BusinessLogic", required = true)
    protected BusinessLogic businessLogic;

    /**
     * Gets the value of the businessLogic property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLogic }
     *     
     */
    public BusinessLogic getBusinessLogic() {
        return businessLogic;
    }

    /**
     * Sets the value of the businessLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLogic }
     *     
     */
    public void setBusinessLogic(BusinessLogic value) {
        this.businessLogic = value;
    }

}
