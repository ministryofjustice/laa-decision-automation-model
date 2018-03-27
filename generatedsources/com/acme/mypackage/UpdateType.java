
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateType"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="Amendment"/&gt;
 *     &lt;enumeration value="Outcome"/&gt;
 *     &lt;enumeration value="Undertaking"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateType", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
@XmlEnum
public enum UpdateType {

    @XmlEnumValue("Amendment")
    AMENDMENT("Amendment"),
    @XmlEnumValue("Outcome")
    OUTCOME("Outcome"),
    @XmlEnumValue("Undertaking")
    UNDERTAKING("Undertaking");
    private final String value;

    UpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateType fromValue(String v) {
        for (UpdateType c: UpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
