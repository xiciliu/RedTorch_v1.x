/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcQryBrokerTradingAlgosField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerTradingAlgosField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcQryBrokerTradingAlgosField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_reserve1_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryBrokerTradingAlgosField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerTradingAlgosField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcQryBrokerTradingAlgosField(), true);
  }

}
