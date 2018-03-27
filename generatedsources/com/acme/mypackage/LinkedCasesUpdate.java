
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedCasesUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedCasesUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedCase" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LinkedCaseUpdateType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCasesUpdate", propOrder = {
    "linkedCase"
})
public class LinkedCasesUpdate {

    @XmlElement(name = "LinkedCase", required = true)
    protected List<LinkedCaseUpdateType> linkedCase;

    /**
     * Gets the value of the linkedCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedCaseUpdateType }
     * 
     * 
     */
    public List<LinkedCaseUpdateType> getLinkedCase() {
        if (linkedCase == null) {
            linkedCase = new ArrayList<LinkedCaseUpdateType>();
        }
        return this.linkedCase;
    }

}
