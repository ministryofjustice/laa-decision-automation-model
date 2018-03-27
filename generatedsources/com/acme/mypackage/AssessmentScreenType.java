
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentScreenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentScreenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScreenName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C255"/&gt;
 *         &lt;element name="Caption" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="Entity" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}OPAEntityType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentScreenType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "screenName",
    "caption",
    "entity"
})
public class AssessmentScreenType {

    @XmlElement(name = "ScreenName", required = true)
    protected String screenName;
    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "Entity", required = true)
    protected List<OPAEntityType3> entity;

    /**
     * Gets the value of the screenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * Sets the value of the screenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenName(String value) {
        this.screenName = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPAEntityType3 }
     * 
     * 
     */
    public List<OPAEntityType3> getEntity() {
        if (entity == null) {
            entity = new ArrayList<OPAEntityType3>();
        }
        return this.entity;
    }

}
