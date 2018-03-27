
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostLimitations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostLimitations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostLimitation" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CostLimitationElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostLimitations", propOrder = {
    "costLimitation"
})
public class CostLimitations {

    @XmlElement(name = "CostLimitation", required = true)
    protected List<CostLimitationElementType> costLimitation;

    /**
     * Gets the value of the costLimitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costLimitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostLimitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostLimitationElementType }
     * 
     * 
     */
    public List<CostLimitationElementType> getCostLimitation() {
        if (costLimitation == null) {
            costLimitation = new ArrayList<CostLimitationElementType>();
        }
        return this.costLimitation;
    }

}
