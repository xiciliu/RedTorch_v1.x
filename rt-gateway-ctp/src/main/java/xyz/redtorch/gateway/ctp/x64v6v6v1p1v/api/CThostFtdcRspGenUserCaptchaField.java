/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcRspGenUserCaptchaField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspGenUserCaptchaField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspGenUserCaptchaField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcRspGenUserCaptchaField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_UserID_get(swigCPtr, this);
  }

  public void setCaptchaInfoLen(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfoLen_set(swigCPtr, this, value);
  }

  public int getCaptchaInfoLen() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfoLen_get(swigCPtr, this);
  }

  public void setCaptchaInfo(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfo_set(swigCPtr, this, value);
  }

  public String getCaptchaInfo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfo_get(swigCPtr, this);
  }

  public CThostFtdcRspGenUserCaptchaField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcRspGenUserCaptchaField(), true);
  }

}
