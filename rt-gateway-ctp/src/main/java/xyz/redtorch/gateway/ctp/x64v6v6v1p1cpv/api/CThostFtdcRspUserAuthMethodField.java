/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcRspUserAuthMethodField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserAuthMethodField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserAuthMethodField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcRspUserAuthMethodField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUsableAuthMethod(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcRspUserAuthMethodField_UsableAuthMethod_set(swigCPtr, this, value);
  }

  public int getUsableAuthMethod() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcRspUserAuthMethodField_UsableAuthMethod_get(swigCPtr, this);
  }

  public CThostFtdcRspUserAuthMethodField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcRspUserAuthMethodField(), true);
  }

}
