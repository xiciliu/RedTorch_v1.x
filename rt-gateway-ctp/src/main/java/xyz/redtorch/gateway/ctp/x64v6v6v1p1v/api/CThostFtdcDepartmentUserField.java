/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcDepartmentUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDepartmentUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepartmentUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcDepartmentUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_UserID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcDepartmentUserField_InvestorID_get(swigCPtr, this);
  }

  public CThostFtdcDepartmentUserField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcDepartmentUserField(), true);
  }

}
