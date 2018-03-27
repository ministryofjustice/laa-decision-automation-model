
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BasicAssessmentData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnDataType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO")
@XmlEnum
public enum ReturnDataType {

    @XmlEnumValue("BasicAssessmentData")
    BASIC_ASSESSMENT_DATA("BasicAssessmentData");
    private final String value;

    ReturnDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnDataType fromValue(String v) {
        for (ReturnDataType c: ReturnDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
