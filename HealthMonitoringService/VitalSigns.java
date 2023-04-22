// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthMonitoringService.proto

package cw.HealthMonitoringService;

/**
 * Protobuf type {@code HealthMonitoringService.VitalSigns}
 */
public  final class VitalSigns extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HealthMonitoringService.VitalSigns)
    VitalSignsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VitalSigns.newBuilder() to construct.
  private VitalSigns(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VitalSigns() {
    vitalSignName_ = "";
    safeRange_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VitalSigns(
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

            vitalSignName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            safeRange_ = s;
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
    return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_VitalSigns_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_VitalSigns_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cw.HealthMonitoringService.VitalSigns.class, cw.HealthMonitoringService.VitalSigns.Builder.class);
  }

  public static final int VITALSIGNNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object vitalSignName_;
  /**
   * <code>string VitalSignName = 1;</code>
   */
  public java.lang.String getVitalSignName() {
    java.lang.Object ref = vitalSignName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vitalSignName_ = s;
      return s;
    }
  }
  /**
   * <code>string VitalSignName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVitalSignNameBytes() {
    java.lang.Object ref = vitalSignName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vitalSignName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAFERANGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object safeRange_;
  /**
   * <code>string SafeRange = 2;</code>
   */
  public java.lang.String getSafeRange() {
    java.lang.Object ref = safeRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      safeRange_ = s;
      return s;
    }
  }
  /**
   * <code>string SafeRange = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSafeRangeBytes() {
    java.lang.Object ref = safeRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      safeRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getVitalSignNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vitalSignName_);
    }
    if (!getSafeRangeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, safeRange_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVitalSignNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vitalSignName_);
    }
    if (!getSafeRangeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, safeRange_);
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
    if (!(obj instanceof cw.HealthMonitoringService.VitalSigns)) {
      return super.equals(obj);
    }
    cw.HealthMonitoringService.VitalSigns other = (cw.HealthMonitoringService.VitalSigns) obj;

    boolean result = true;
    result = result && getVitalSignName()
        .equals(other.getVitalSignName());
    result = result && getSafeRange()
        .equals(other.getSafeRange());
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
    hash = (37 * hash) + VITALSIGNNAME_FIELD_NUMBER;
    hash = (53 * hash) + getVitalSignName().hashCode();
    hash = (37 * hash) + SAFERANGE_FIELD_NUMBER;
    hash = (53 * hash) + getSafeRange().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.HealthMonitoringService.VitalSigns parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.VitalSigns parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.HealthMonitoringService.VitalSigns parseFrom(
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
  public static Builder newBuilder(cw.HealthMonitoringService.VitalSigns prototype) {
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
   * Protobuf type {@code HealthMonitoringService.VitalSigns}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HealthMonitoringService.VitalSigns)
      cw.HealthMonitoringService.VitalSignsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_VitalSigns_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_VitalSigns_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cw.HealthMonitoringService.VitalSigns.class, cw.HealthMonitoringService.VitalSigns.Builder.class);
    }

    // Construct using HealthMonitoringService.VitalSigns.newBuilder()
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
      vitalSignName_ = "";

      safeRange_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cw.HealthMonitoringService.MonitoringProto.internal_static_HealthMonitoringService_VitalSigns_descriptor;
    }

    @java.lang.Override
    public cw.HealthMonitoringService.VitalSigns getDefaultInstanceForType() {
      return cw.HealthMonitoringService.VitalSigns.getDefaultInstance();
    }

    @java.lang.Override
    public cw.HealthMonitoringService.VitalSigns build() {
      cw.HealthMonitoringService.VitalSigns result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cw.HealthMonitoringService.VitalSigns buildPartial() {
      cw.HealthMonitoringService.VitalSigns result = new cw.HealthMonitoringService.VitalSigns(this);
      result.vitalSignName_ = vitalSignName_;
      result.safeRange_ = safeRange_;
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
      if (other instanceof cw.HealthMonitoringService.VitalSigns) {
        return mergeFrom((cw.HealthMonitoringService.VitalSigns)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cw.HealthMonitoringService.VitalSigns other) {
      if (other == cw.HealthMonitoringService.VitalSigns.getDefaultInstance()) return this;
      if (!other.getVitalSignName().isEmpty()) {
        vitalSignName_ = other.vitalSignName_;
        onChanged();
      }
      if (!other.getSafeRange().isEmpty()) {
        safeRange_ = other.safeRange_;
        onChanged();
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
      cw.HealthMonitoringService.VitalSigns parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cw.HealthMonitoringService.VitalSigns) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vitalSignName_ = "";
    /**
     * <code>string VitalSignName = 1;</code>
     */
    public java.lang.String getVitalSignName() {
      java.lang.Object ref = vitalSignName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vitalSignName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string VitalSignName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVitalSignNameBytes() {
      java.lang.Object ref = vitalSignName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vitalSignName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string VitalSignName = 1;</code>
     */
    public Builder setVitalSignName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vitalSignName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string VitalSignName = 1;</code>
     */
    public Builder clearVitalSignName() {
      
      vitalSignName_ = getDefaultInstance().getVitalSignName();
      onChanged();
      return this;
    }
    /**
     * <code>string VitalSignName = 1;</code>
     */
    public Builder setVitalSignNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vitalSignName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object safeRange_ = "";
    /**
     * <code>string SafeRange = 2;</code>
     */
    public java.lang.String getSafeRange() {
      java.lang.Object ref = safeRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        safeRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SafeRange = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSafeRangeBytes() {
      java.lang.Object ref = safeRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        safeRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SafeRange = 2;</code>
     */
    public Builder setSafeRange(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      safeRange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SafeRange = 2;</code>
     */
    public Builder clearSafeRange() {
      
      safeRange_ = getDefaultInstance().getSafeRange();
      onChanged();
      return this;
    }
    /**
     * <code>string SafeRange = 2;</code>
     */
    public Builder setSafeRangeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      safeRange_ = value;
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


    // @@protoc_insertion_point(builder_scope:HealthMonitoringService.VitalSigns)
  }

  // @@protoc_insertion_point(class_scope:HealthMonitoringService.VitalSigns)
  private static final cw.HealthMonitoringService.VitalSigns DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cw.HealthMonitoringService.VitalSigns();
  }

  public static cw.HealthMonitoringService.VitalSigns getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VitalSigns>
      PARSER = new com.google.protobuf.AbstractParser<VitalSigns>() {
    @java.lang.Override
    public VitalSigns parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VitalSigns(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VitalSigns> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VitalSigns> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cw.HealthMonitoringService.VitalSigns getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

