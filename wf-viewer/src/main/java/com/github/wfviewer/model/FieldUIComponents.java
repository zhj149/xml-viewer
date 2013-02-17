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
 *       &lt;choice>
 *         &lt;element ref="{}UI_RO_Component"/>
 *         &lt;element ref="{}UI_RW_Component"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uiroComponent",
    "uirwComponent"
})
@XmlRootElement(name = "FieldUIComponents")
public class FieldUIComponents {

    @XmlElement(name = "UI_RO_Component")
    protected UIROComponent uiroComponent;
    @XmlElement(name = "UI_RW_Component")
    protected UIRWComponent uirwComponent;

    /**
     * Gets the value of the uiroComponent property.
     * 
     * @return
     *     possible object is
     *     {@link UIROComponent }
     *     
     */
    public UIROComponent getUIROComponent() {
        return uiroComponent;
    }

    /**
     * Sets the value of the uiroComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UIROComponent }
     *     
     */
    public void setUIROComponent(UIROComponent value) {
        this.uiroComponent = value;
    }

    /**
     * Gets the value of the uirwComponent property.
     * 
     * @return
     *     possible object is
     *     {@link UIRWComponent }
     *     
     */
    public UIRWComponent getUIRWComponent() {
        return uirwComponent;
    }

    /**
     * Sets the value of the uirwComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UIRWComponent }
     *     
     */
    public void setUIRWComponent(UIRWComponent value) {
        this.uirwComponent = value;
    }

}