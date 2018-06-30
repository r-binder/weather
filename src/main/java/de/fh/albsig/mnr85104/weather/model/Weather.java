//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.30 um 09:22:38 AM CEST 
//

package de.fh.albsig.mnr85104.weather.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <p>
 * Java-Klasse für Weather complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Weather"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temp" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather", propOrder = { "uuid", "temp", "location" })
public class Weather {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected BigDecimal temp;
    protected String location;

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUuid(final String value) {
        this.uuid = value;
    }

    /**
     * Ruft den Wert der temp-Eigenschaft ab.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTemp() {
        return temp;
    }

    /**
     * Legt den Wert der temp-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTemp(final BigDecimal value) {
        this.temp = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLocation(final String value) {
        this.location = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
