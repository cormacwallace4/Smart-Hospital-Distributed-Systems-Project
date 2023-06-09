// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthMonitoringService.proto

package cw.HealthMonitoringService;

/**
 * Protobuf type {@code HealthMonitoringService.PatientVitals}
 */
public  final class PatientVitals extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HealthMonitoringService.PatientVitals)
    PatientVitalsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PatientVitals.newBuilder() to construct.
  private PatientVitals(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatientVitals() {
    patientId_ = "";
    heartRate_ = 0D;
    bloodPressure_ = 0D;
    temperature_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PatientVitals(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            patientId_ = s;
            break;
          }
          case 17: {

            heartRate_ = input.readDouble();
            break;
          }
          case 25: {

            bloodPressure_ = input.readDouble();
            break;
          }
          case 33: {

            temperature_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_PatientVitals_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_PatientVitals_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cw.HealthMonitoringService.PatientVitals.class, cw.HealthMonitoringService.PatientVitals.Builder.class);
  }

  public static final int PATIENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object patientId_;
  /**
   * <code>string patient_id = 1;</code>
   */
  public java.lang.String getPatientId() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientId_ = s;
      return s;
    }
  }
  /**
   * <code>string patient_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPatientIdBytes() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEART_RATE_FIELD_NUMBER = 2;
  private double heartRate_;
  /**
   * <code>double heart_rate = 2;</code>
   */
  public double getHeartRate() {
    return heartRate_;
  }

  public static final int BLOOD_PRESSURE_FIELD_NUMBER = 3;
  private double bloodPressure_;
  /**
   * <code>double blood_pressure = 3;</code>
   */
  public double getBloodPressure() {
    return bloodPressure_;
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 4;
  private double temperature_;
  /**
   * <code>double temperature = 4;</code>
   */
  public double getTemperature() {
    return temperature_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPatientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, patientId_);
    }
    if (heartRate_ != 0D) {
      output.writeDouble(2, heartRate_);
    }
    if (bloodPressure_ != 0D) {
      output.writeDouble(3, bloodPressure_);
    }
    if (temperature_ != 0D) {
      output.writeDouble(4, temperature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPatientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, patientId_);
    }
    if (heartRate_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, heartRate_);
    }
    if (bloodPressure_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, bloodPressure_);
    }
    if (temperature_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, temperature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cw.HealthMonitoringService.PatientVitals)) {
      return super.equals(obj);
    }
    cw.HealthMonitoringService.PatientVitals other = (cw.HealthMonitoringService.PatientVitals) obj;

    boolean result = true;
    result = result && getPatientId()
        .equals(other.getPatientId());
    result = result && (
        java.lang.Double.doubleToLongBits(getHeartRate())
        == java.lang.Double.doubleToLongBits(
            other.getHeartRate()));
    result = result && (
        java.lang.Double.doubleToLongBits(getBloodPressure())
        == java.lang.Double.doubleToLongBits(
            other.getBloodPressure()));
    result = result && (
        java.lang.Double.doubleToLongBits(getTemperature())
        == java.lang.Double.doubleToLongBits(
            other.getTemperature()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPatientId().hashCode();
    hash = (37 * hash) + HEART_RATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHeartRate()));
    hash = (37 * hash) + BLOOD_PRESSURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBloodPressure()));
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTemperature()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.HealthMonitoringService.PatientVitals parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.PatientVitals parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.PatientVitals parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cw.HealthMonitoringService.PatientVitals prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HealthMonitoringService.PatientVitals}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HealthMonitoringService.PatientVitals)
      cw.HealthMonitoringService.PatientVitalsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_PatientVitals_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_PatientVitals_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cw.HealthMonitoringService.PatientVitals.class, cw.HealthMonitoringService.PatientVitals.Builder.class);
    }

    // Construct using HealthMonitoringService.PatientVitals.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      patientId_ = "";

      heartRate_ = 0D;

      bloodPressure_ = 0D;

      temperature_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_PatientVitals_descriptor;
    }

    @java.lang.Override
    public cw.HealthMonitoringService.PatientVitals getDefaultInstanceForType() {
      return cw.HealthMonitoringService.PatientVitals.getDefaultInstance();
    }

    @java.lang.Override
    public cw.HealthMonitoringService.PatientVitals build() {
      cw.HealthMonitoringService.PatientVitals result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cw.HealthMonitoringService.PatientVitals buildPartial() {
      cw.HealthMonitoringService.PatientVitals result = new cw.HealthMonitoringService.PatientVitals(this);
      result.patientId_ = patientId_;
      result.heartRate_ = heartRate_;
      result.bloodPressure_ = bloodPressure_;
      result.temperature_ = temperature_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cw.HealthMonitoringService.PatientVitals) {
        return mergeFrom((cw.HealthMonitoringService.PatientVitals)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cw.HealthMonitoringService.PatientVitals other) {
      if (other == cw.HealthMonitoringService.PatientVitals.getDefaultInstance()) return this;
      if (!other.getPatientId().isEmpty()) {
        patientId_ = other.patientId_;
        onChanged();
      }
      if (other.getHeartRate() != 0D) {
        setHeartRate(other.getHeartRate());
      }
      if (other.getBloodPressure() != 0D) {
        setBloodPressure(other.getBloodPressure());
      }
      if (other.getTemperature() != 0D) {
        setTemperature(other.getTemperature());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cw.HealthMonitoringService.PatientVitals parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cw.HealthMonitoringService.PatientVitals) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object patientId_ = "";
    /**
     * <code>string patient_id = 1;</code>
     */
    public java.lang.String getPatientId() {
      java.lang.Object ref = patientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPatientIdBytes() {
      java.lang.Object ref = patientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder setPatientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder clearPatientId() {
      
      patientId_ = getDefaultInstance().getPatientId();
      onChanged();
      return this;
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder setPatientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientId_ = value;
      onChanged();
      return this;
    }

    private double heartRate_ ;
    /**
     * <code>double heart_rate = 2;</code>
     */
    public double getHeartRate() {
      return heartRate_;
    }
    /**
     * <code>double heart_rate = 2;</code>
     */
    public Builder setHeartRate(double value) {
      
      heartRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double heart_rate = 2;</code>
     */
    public Builder clearHeartRate() {
      
      heartRate_ = 0D;
      onChanged();
      return this;
    }

    private double bloodPressure_ ;
    /**
     * <code>double blood_pressure = 3;</code>
     */
    public double getBloodPressure() {
      return bloodPressure_;
    }
    /**
     * <code>double blood_pressure = 3;</code>
     */
    public Builder setBloodPressure(double value) {
      
      bloodPressure_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double blood_pressure = 3;</code>
     */
    public Builder clearBloodPressure() {
      
      bloodPressure_ = 0D;
      onChanged();
      return this;
    }

    private double temperature_ ;
    /**
     * <code>double temperature = 4;</code>
     */
    public double getTemperature() {
      return temperature_;
    }
    /**
     * <code>double temperature = 4;</code>
     */
    public Builder setTemperature(double value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double temperature = 4;</code>
     */
    public Builder clearTemperature() {
      
      temperature_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HealthMonitoringService.PatientVitals)
  }

  // @@protoc_insertion_point(class_scope:HealthMonitoringService.PatientVitals)
  private static final cw.HealthMonitoringService.PatientVitals DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cw.HealthMonitoringService.PatientVitals();
  }

  public static cw.HealthMonitoringService.PatientVitals getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatientVitals>
      PARSER = new com.google.protobuf.AbstractParser<PatientVitals>() {
    @java.lang.Override
    public PatientVitals parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PatientVitals(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PatientVitals> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatientVitals> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cw.HealthMonitoringService.PatientVitals getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

