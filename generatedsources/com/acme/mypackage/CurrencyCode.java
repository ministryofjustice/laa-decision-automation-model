
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AON"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BEF"/&gt;
 *     &lt;enumeration value="BGL"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CSK"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ESB"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="FRF"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEK"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GWP"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRD"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IEP"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="ITL"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LUC"/&gt;
 *     &lt;enumeration value="LUF"/&gt;
 *     &lt;enumeration value="LUL"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LVR"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NLG"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PTE"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RUR"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TMM"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TPE"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAK"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="UYP"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="YDD"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="YUD"/&gt;
 *     &lt;enumeration value="ZAL"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZRN"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="ECV"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="TJR"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="YUM"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCode", namespace = "http://legalservices.gov.uk/Schema/Enterprise/External/ISO/Currency/4217/2001/Currency")
@XmlEnum
public enum CurrencyCode {

    ADP,
    AED,
    AFA,
    ALL,
    AMD,
    ANG,
    AON,
    ARS,
    AUD,
    AWG,
    AZM,
    BBD,
    BDT,
    BEF,
    BGL,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BRL,
    BSD,
    BTN,
    BWP,
    BZD,
    CAD,
    CHF,
    CLF,
    CLP,
    CNY,
    COP,
    CRC,
    CSK,
    CUP,
    CVE,
    CYP,
    CZK,
    DEM,
    DJF,
    DKK,
    DOP,
    DZD,
    ECS,
    EEK,
    EGP,
    ESB,
    ESP,
    ETB,
    FJD,
    FKP,
    FRF,
    GBP,
    GEK,
    GIP,
    GMD,
    GNF,
    GTQ,
    GWP,
    GYD,
    HKD,
    HNL,
    HRD,
    HRK,
    HTG,
    HUF,
    IDR,
    IEP,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    ITL,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KHR,
    KMF,
    KPW,
    KRW,
    KWD,
    KYD,
    KZT,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LTL,
    LUC,
    LUF,
    LUL,
    LVL,
    LVR,
    LYD,
    MAD,
    MDL,
    MGF,
    MKD,
    MMK,
    MNT,
    MOP,
    MRO,
    MTL,
    MUR,
    MVR,
    MWK,
    MXN,
    MYR,
    MZM,
    NAD,
    NGN,
    NIO,
    NLG,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEN,
    PGK,
    PHP,
    PKR,
    PTE,
    PYG,
    QAR,
    ROL,
    RUR,
    RWF,
    SAR,
    SBD,
    SCR,
    SDD,
    SDP,
    SEK,
    SGD,
    SHP,
    SKK,
    SLL,
    SOS,
    SRG,
    STD,
    SUR,
    SVC,
    SYP,
    SZL,
    THB,
    TMM,
    TND,
    TPE,
    TRL,
    TTD,
    TWD,
    TZS,
    UAK,
    UGX,
    USD,
    UYP,
    UYU,
    UZS,
    VEB,
    VND,
    VUV,
    WST,
    XCD,
    YDD,
    YER,
    YUD,
    ZAL,
    ZAR,
    ZMK,
    ZRN,
    ZWD,
    EUR,
    RON,
    TRY,
    BOV,
    ECV,
    PLN,
    TJR,
    BYR,
    MXV,
    GEL,
    CDF,
    ERN,
    AOA,
    BGN,
    RUB,
    UAH,
    YUM,
    TJS;

    public String value() {
        return name();
    }

    public static CurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
