/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcInputExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputExecOrderField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcInputExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_reserve1_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInputExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputExecOrderField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcInputExecOrderField(), true);
  }

}
