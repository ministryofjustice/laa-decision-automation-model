
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSourceType"&gt;
 *   &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ClosedEnum"&gt;
 *     &lt;enumeration value="PLSQL"/&gt;
 *     &lt;enumeration value="BPEL"/&gt;
 *     &lt;enumeration value="Mediator"/&gt;
 *     &lt;enumeration value="OSB"/&gt;
 *     &lt;enumeration value="PUI"/&gt;
 *     &lt;enumeration value="Legacy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageSourceType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common")
@XmlEnum
public enum MessageSourceType {

    PLSQL("PLSQL"),
    BPEL("BPEL"),
    @XmlEnumValue("Mediator")
    MEDIATOR("Mediator"),
    OSB("OSB"),
    PUI("PUI"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy");
    private final String value;

    MessageSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageSourceType fromValue(String v) {
        for (MessageSourceType c: MessageSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
