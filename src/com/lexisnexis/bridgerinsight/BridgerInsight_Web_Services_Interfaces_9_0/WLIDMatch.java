/**
 * WLIDMatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WLIDMatch  implements java.io.Serializable {
    private java.lang.String inputValue;

    private java.lang.String listValue;

    private java.lang.Integer score;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType type;

    public WLIDMatch() {
    }

    public WLIDMatch(
           java.lang.String inputValue,
           java.lang.String listValue,
           java.lang.Integer score,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType type) {
           this.inputValue = inputValue;
           this.listValue = listValue;
           this.score = score;
           this.type = type;
    }


    /**
     * Gets the inputValue value for this WLIDMatch.
     * 
     * @return inputValue
     */
    public java.lang.String getInputValue() {
        return inputValue;
    }


    /**
     * Sets the inputValue value for this WLIDMatch.
     * 
     * @param inputValue
     */
    public void setInputValue(java.lang.String inputValue) {
        this.inputValue = inputValue;
    }


    /**
     * Gets the listValue value for this WLIDMatch.
     * 
     * @return listValue
     */
    public java.lang.String getListValue() {
        return listValue;
    }


    /**
     * Sets the listValue value for this WLIDMatch.
     * 
     * @param listValue
     */
    public void setListValue(java.lang.String listValue) {
        this.listValue = listValue;
    }


    /**
     * Gets the score value for this WLIDMatch.
     * 
     * @return score
     */
    public java.lang.Integer getScore() {
        return score;
    }


    /**
     * Sets the score value for this WLIDMatch.
     * 
     * @param score
     */
    public void setScore(java.lang.Integer score) {
        this.score = score;
    }


    /**
     * Gets the type value for this WLIDMatch.
     * 
     * @return type
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType getType() {
        return type;
    }


    /**
     * Sets the type value for this WLIDMatch.
     * 
     * @param type
     */
    public void setType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WLIDMatch)) return false;
        WLIDMatch other = (WLIDMatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputValue==null && other.getInputValue()==null) || 
             (this.inputValue!=null &&
              this.inputValue.equals(other.getInputValue()))) &&
            ((this.listValue==null && other.getListValue()==null) || 
             (this.listValue!=null &&
              this.listValue.equals(other.getListValue()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInputValue() != null) {
            _hashCode += getInputValue().hashCode();
        }
        if (getListValue() != null) {
            _hashCode += getListValue().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WLIDMatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLIDMatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
