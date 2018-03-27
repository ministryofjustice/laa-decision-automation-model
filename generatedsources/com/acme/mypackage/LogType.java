
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogType"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common")
@XmlEnum
public enum LogType {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    LogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogType fromValue(String v) {
        for (LogType c: LogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
