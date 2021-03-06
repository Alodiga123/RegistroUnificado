/**
 * ResultEntityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ResultEntityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResultEntityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Business = "Business";
    public static final java.lang.String _Individual = "Individual";
    public static final java.lang.String _Text = "Text";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Unstructured = "Unstructured";
    public static final ResultEntityType None = new ResultEntityType(_None);
    public static final ResultEntityType Business = new ResultEntityType(_Business);
    public static final ResultEntityType Individual = new ResultEntityType(_Individual);
    public static final ResultEntityType Text = new ResultEntityType(_Text);
    public static final ResultEntityType Unknown = new ResultEntityType(_Unknown);
    public static final ResultEntityType Unstructured = new ResultEntityType(_Unstructured);
    public java.lang.String getValue() { return _value_;}
    public static ResultEntityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResultEntityType enumeration = (ResultEntityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResultEntityType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultEntityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultEntityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
