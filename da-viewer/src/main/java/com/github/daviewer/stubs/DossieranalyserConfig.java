//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.23 at 11:26:13 PM EEST 
//


package com.github.daviewer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}checkers"/>
 *         &lt;element ref="{}actions"/>
 *         &lt;element ref="{}rules"/>
 *         &lt;element ref="{}commands"/>
 *         &lt;element ref="{}command-sets"/>
 *         &lt;element ref="{}profiles"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkers",
    "actions",
    "rules",
    "commands",
    "commandSets",
    "profiles"
})
@XmlRootElement(name = "dossieranalyser-config")
public class DossieranalyserConfig {

    @XmlElement(required = true)
    protected Checkers checkers;
    @XmlElement(required = true)
    protected Actions actions;
    @XmlElement(required = true)
    protected Rules rules;
    @XmlElement(required = true)
    protected Commands commands;
    @XmlElement(name = "command-sets", required = true)
    protected CommandSets commandSets;
    @XmlElement(required = true)
    protected Profiles profiles;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Gets the value of the checkers property.
     * 
     * @return
     *     possible object is
     *     {@link Checkers }
     *     
     */
    public Checkers getCheckers() {
        return checkers;
    }

    /**
     * Sets the value of the checkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Checkers }
     *     
     */
    public void setCheckers(Checkers value) {
        this.checkers = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setActions(Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link Rules }
     *     
     */
    public Rules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rules }
     *     
     */
    public void setRules(Rules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the commands property.
     * 
     * @return
     *     possible object is
     *     {@link Commands }
     *     
     */
    public Commands getCommands() {
        return commands;
    }

    /**
     * Sets the value of the commands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commands }
     *     
     */
    public void setCommands(Commands value) {
        this.commands = value;
    }

    /**
     * Gets the value of the commandSets property.
     * 
     * @return
     *     possible object is
     *     {@link CommandSets }
     *     
     */
    public CommandSets getCommandSets() {
        return commandSets;
    }

    /**
     * Sets the value of the commandSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandSets }
     *     
     */
    public void setCommandSets(CommandSets value) {
        this.commandSets = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link Profiles }
     *     
     */
    public Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profiles }
     *     
     */
    public void setProfiles(Profiles value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
