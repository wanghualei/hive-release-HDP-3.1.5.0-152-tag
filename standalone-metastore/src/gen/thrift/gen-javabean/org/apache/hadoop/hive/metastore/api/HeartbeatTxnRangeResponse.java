/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class HeartbeatTxnRangeResponse implements org.apache.thrift.TBase<HeartbeatTxnRangeResponse, HeartbeatTxnRangeResponse._Fields>, java.io.Serializable, Cloneable, Comparable<HeartbeatTxnRangeResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatTxnRangeResponse");

  private static final org.apache.thrift.protocol.TField ABORTED_FIELD_DESC = new org.apache.thrift.protocol.TField("aborted", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField NOSUCH_FIELD_DESC = new org.apache.thrift.protocol.TField("nosuch", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartbeatTxnRangeResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartbeatTxnRangeResponseTupleSchemeFactory());
  }

  private Set<Long> aborted; // required
  private Set<Long> nosuch; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ABORTED((short)1, "aborted"),
    NOSUCH((short)2, "nosuch");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ABORTED
          return ABORTED;
        case 2: // NOSUCH
          return NOSUCH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ABORTED, new org.apache.thrift.meta_data.FieldMetaData("aborted", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.NOSUCH, new org.apache.thrift.meta_data.FieldMetaData("nosuch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatTxnRangeResponse.class, metaDataMap);
  }

  public HeartbeatTxnRangeResponse() {
  }

  public HeartbeatTxnRangeResponse(
    Set<Long> aborted,
    Set<Long> nosuch)
  {
    this();
    this.aborted = aborted;
    this.nosuch = nosuch;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatTxnRangeResponse(HeartbeatTxnRangeResponse other) {
    if (other.isSetAborted()) {
      Set<Long> __this__aborted = new HashSet<Long>(other.aborted);
      this.aborted = __this__aborted;
    }
    if (other.isSetNosuch()) {
      Set<Long> __this__nosuch = new HashSet<Long>(other.nosuch);
      this.nosuch = __this__nosuch;
    }
  }

  public HeartbeatTxnRangeResponse deepCopy() {
    return new HeartbeatTxnRangeResponse(this);
  }

  @Override
  public void clear() {
    this.aborted = null;
    this.nosuch = null;
  }

  public int getAbortedSize() {
    return (this.aborted == null) ? 0 : this.aborted.size();
  }

  public java.util.Iterator<Long> getAbortedIterator() {
    return (this.aborted == null) ? null : this.aborted.iterator();
  }

  public void addToAborted(long elem) {
    if (this.aborted == null) {
      this.aborted = new HashSet<Long>();
    }
    this.aborted.add(elem);
  }

  public Set<Long> getAborted() {
    return this.aborted;
  }

  public void setAborted(Set<Long> aborted) {
    this.aborted = aborted;
  }

  public void unsetAborted() {
    this.aborted = null;
  }

  /** Returns true if field aborted is set (has been assigned a value) and false otherwise */
  public boolean isSetAborted() {
    return this.aborted != null;
  }

  public void setAbortedIsSet(boolean value) {
    if (!value) {
      this.aborted = null;
    }
  }

  public int getNosuchSize() {
    return (this.nosuch == null) ? 0 : this.nosuch.size();
  }

  public java.util.Iterator<Long> getNosuchIterator() {
    return (this.nosuch == null) ? null : this.nosuch.iterator();
  }

  public void addToNosuch(long elem) {
    if (this.nosuch == null) {
      this.nosuch = new HashSet<Long>();
    }
    this.nosuch.add(elem);
  }

  public Set<Long> getNosuch() {
    return this.nosuch;
  }

  public void setNosuch(Set<Long> nosuch) {
    this.nosuch = nosuch;
  }

  public void unsetNosuch() {
    this.nosuch = null;
  }

  /** Returns true if field nosuch is set (has been assigned a value) and false otherwise */
  public boolean isSetNosuch() {
    return this.nosuch != null;
  }

  public void setNosuchIsSet(boolean value) {
    if (!value) {
      this.nosuch = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ABORTED:
      if (value == null) {
        unsetAborted();
      } else {
        setAborted((Set<Long>)value);
      }
      break;

    case NOSUCH:
      if (value == null) {
        unsetNosuch();
      } else {
        setNosuch((Set<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ABORTED:
      return getAborted();

    case NOSUCH:
      return getNosuch();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ABORTED:
      return isSetAborted();
    case NOSUCH:
      return isSetNosuch();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartbeatTxnRangeResponse)
      return this.equals((HeartbeatTxnRangeResponse)that);
    return false;
  }

  public boolean equals(HeartbeatTxnRangeResponse that) {
    if (that == null)
      return false;

    boolean this_present_aborted = true && this.isSetAborted();
    boolean that_present_aborted = true && that.isSetAborted();
    if (this_present_aborted || that_present_aborted) {
      if (!(this_present_aborted && that_present_aborted))
        return false;
      if (!this.aborted.equals(that.aborted))
        return false;
    }

    boolean this_present_nosuch = true && this.isSetNosuch();
    boolean that_present_nosuch = true && that.isSetNosuch();
    if (this_present_nosuch || that_present_nosuch) {
      if (!(this_present_nosuch && that_present_nosuch))
        return false;
      if (!this.nosuch.equals(that.nosuch))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_aborted = true && (isSetAborted());
    list.add(present_aborted);
    if (present_aborted)
      list.add(aborted);

    boolean present_nosuch = true && (isSetNosuch());
    list.add(present_nosuch);
    if (present_nosuch)
      list.add(nosuch);

    return list.hashCode();
  }

  @Override
  public int compareTo(HeartbeatTxnRangeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAborted()).compareTo(other.isSetAborted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAborted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aborted, other.aborted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNosuch()).compareTo(other.isSetNosuch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNosuch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nosuch, other.nosuch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HeartbeatTxnRangeResponse(");
    boolean first = true;

    sb.append("aborted:");
    if (this.aborted == null) {
      sb.append("null");
    } else {
      sb.append(this.aborted);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nosuch:");
    if (this.nosuch == null) {
      sb.append("null");
    } else {
      sb.append(this.nosuch);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAborted()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'aborted' is unset! Struct:" + toString());
    }

    if (!isSetNosuch()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nosuch' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartbeatTxnRangeResponseStandardSchemeFactory implements SchemeFactory {
    public HeartbeatTxnRangeResponseStandardScheme getScheme() {
      return new HeartbeatTxnRangeResponseStandardScheme();
    }
  }

  private static class HeartbeatTxnRangeResponseStandardScheme extends StandardScheme<HeartbeatTxnRangeResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ABORTED
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set730 = iprot.readSetBegin();
                struct.aborted = new HashSet<Long>(2*_set730.size);
                long _elem731;
                for (int _i732 = 0; _i732 < _set730.size; ++_i732)
                {
                  _elem731 = iprot.readI64();
                  struct.aborted.add(_elem731);
                }
                iprot.readSetEnd();
              }
              struct.setAbortedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOSUCH
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set733 = iprot.readSetBegin();
                struct.nosuch = new HashSet<Long>(2*_set733.size);
                long _elem734;
                for (int _i735 = 0; _i735 < _set733.size; ++_i735)
                {
                  _elem734 = iprot.readI64();
                  struct.nosuch.add(_elem734);
                }
                iprot.readSetEnd();
              }
              struct.setNosuchIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aborted != null) {
        oprot.writeFieldBegin(ABORTED_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.aborted.size()));
          for (long _iter736 : struct.aborted)
          {
            oprot.writeI64(_iter736);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nosuch != null) {
        oprot.writeFieldBegin(NOSUCH_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.nosuch.size()));
          for (long _iter737 : struct.nosuch)
          {
            oprot.writeI64(_iter737);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartbeatTxnRangeResponseTupleSchemeFactory implements SchemeFactory {
    public HeartbeatTxnRangeResponseTupleScheme getScheme() {
      return new HeartbeatTxnRangeResponseTupleScheme();
    }
  }

  private static class HeartbeatTxnRangeResponseTupleScheme extends TupleScheme<HeartbeatTxnRangeResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.aborted.size());
        for (long _iter738 : struct.aborted)
        {
          oprot.writeI64(_iter738);
        }
      }
      {
        oprot.writeI32(struct.nosuch.size());
        for (long _iter739 : struct.nosuch)
        {
          oprot.writeI64(_iter739);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TSet _set740 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.aborted = new HashSet<Long>(2*_set740.size);
        long _elem741;
        for (int _i742 = 0; _i742 < _set740.size; ++_i742)
        {
          _elem741 = iprot.readI64();
          struct.aborted.add(_elem741);
        }
      }
      struct.setAbortedIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set743 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.nosuch = new HashSet<Long>(2*_set743.size);
        long _elem744;
        for (int _i745 = 0; _i745 < _set743.size; ++_i745)
        {
          _elem744 = iprot.readI64();
          struct.nosuch.add(_elem744);
        }
      }
      struct.setNosuchIsSet(true);
    }
  }

}

