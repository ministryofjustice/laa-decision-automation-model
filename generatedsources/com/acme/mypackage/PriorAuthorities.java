
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorAuthorities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorAuthorities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriorAuthority" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}PriorAuthorityElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorAuthorities", propOrder = {
    "priorAuthority"
})
public class PriorAuthorities {

    @XmlElement(name = "PriorAuthority", required = true)
    protected List<PriorAuthorityElementType> priorAuthority;

    /**
     * Gets the value of the priorAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorAuthorityElementType }
     * 
     * 
     */
    public List<PriorAuthorityElementType> getPriorAuthority() {
        if (priorAuthority == null) {
            priorAuthority = new ArrayList<PriorAuthorityElementType>();
        }
        return this.priorAuthority;
    }

}
