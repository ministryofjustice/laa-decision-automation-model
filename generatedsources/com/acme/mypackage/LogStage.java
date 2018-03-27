
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogStage"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="Intermediate"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogStage", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common")
@XmlEnum
public enum LogStage {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    LogStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogStage fromValue(String v) {
        for (LogStage c: LogStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
