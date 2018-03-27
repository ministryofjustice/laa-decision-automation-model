
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proceedings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proceedings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proceeding" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ProceedingElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proceedings", propOrder = {
    "proceeding"
})
public class Proceedings {

    @XmlElement(name = "Proceeding", required = true)
    protected List<ProceedingElementType> proceeding;

    /**
     * Gets the value of the proceeding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceeding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProceeding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedingElementType }
     * 
     * 
     */
    public List<ProceedingElementType> getProceeding() {
        if (proceeding == null) {
            proceeding = new ArrayList<ProceedingElementType>();
        }
        return this.proceeding;
    }

}
