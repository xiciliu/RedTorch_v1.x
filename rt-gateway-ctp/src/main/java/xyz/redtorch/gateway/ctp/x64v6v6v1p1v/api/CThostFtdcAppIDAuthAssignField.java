/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcAppIDAuthAssignField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAppIDAuthAssignField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAppIDAuthAssignField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcAppIDAuthAssignField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_BrokerID_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_AppID_get(swigCPtr, this);
  }

  public void setDRIdentityID(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcAppIDAuthAssignField_DRIdentityID_get(swigCPtr, this);
  }

  public CThostFtdcAppIDAuthAssignField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcAppIDAuthAssignField(), true);
  }

}
