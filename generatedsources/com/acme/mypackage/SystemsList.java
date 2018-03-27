
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemsList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemsList"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="Oracle EBusiness"/&gt;
 *     &lt;enumeration value="PUI"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemsList", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common")
@XmlEnum
public enum SystemsList {

    @XmlEnumValue("Oracle EBusiness")
    ORACLE_E_BUSINESS("Oracle EBusiness"),
    PUI("PUI"),
    SMS("SMS");
    private final String value;

    SystemsList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemsList fromValue(String v) {
        for (SystemsList c: SystemsList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
