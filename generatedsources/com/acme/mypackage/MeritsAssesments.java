
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeritsAssesments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeritsAssesments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssesmentResults" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}AssesmentResultType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeritsAssesments", propOrder = {
    "assesmentResults"
})
public class MeritsAssesments {

    @XmlElement(name = "AssesmentResults", required = true)
    protected List<AssesmentResultType> assesmentResults;

    /**
     * Gets the value of the assesmentResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assesmentResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssesmentResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssesmentResultType }
     * 
     * 
     */
    public List<AssesmentResultType> getAssesmentResults() {
        if (assesmentResults == null) {
            assesmentResults = new ArrayList<AssesmentResultType>();
        }
        return this.assesmentResults;
    }

}
