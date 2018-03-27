
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusTextType"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusTextType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header")
@XmlEnum
public enum StatusTextType {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    StatusTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusTextType fromValue(String v) {
        for (StatusTextType c: StatusTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
