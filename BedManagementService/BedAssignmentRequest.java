// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BedManagementService.proto

package cw.BedManagementService;

/**
 * Protobuf type {@code BedManagementService.BedAssignmentRequest}
 */
public  final class BedAssignmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BedManagementService.BedAssignmentRequest)
    BedAssignmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BedAssignmentRequest.newBuilder() to construct.
  private BedAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BedAssignmentRequest() {
    bedId_ = 0;
    patientName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BedAssignmentRequest(
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
          case 8: {

            bedId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            patientName_ = s;
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
    return cw.BedManagementService.BedProto.internal_static_BedManagementService_BedAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cw.BedManagementService.BedProto.internal_static_BedManagementService_BedAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cw.BedManagementService.BedAssignmentRequest.class, cw.BedManagementService.BedAssignmentRequest.Builder.class);
  }

  public static final int BED_ID_FIELD_NUMBER = 1;
  private int bedId_;
  /**
   * <code>int32 bed_id = 1;</code>
   */
  public int getBedId() {
    return bedId_;
  }

  public static final int PATIENT_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object patientName_;
  /**
   * <code>string patient_name = 2;</code>
   */
  public java.lang.String getPatientName() {
    java.lang.Object ref = patientName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientName_ = s;
      return s;
    }
  }
  /**
   * <code>string patient_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPatientNameBytes() {
    java.lang.Object ref = patientName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientName_ = b;
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
    if (bedId_ != 0) {
      output.writeInt32(1, bedId_);
    }
    if (!getPatientNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, patientName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bedId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bedId_);
    }
    if (!getPatientNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, patientName_);
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
    if (!(obj instanceof cw.BedManagementService.BedAssignmentRequest)) {
      return super.equals(obj);
    }
    cw.BedManagementService.BedAssignmentRequest other = (cw.BedManagementService.BedAssignmentRequest) obj;

    boolean result = true;
    result = result && (getBedId()
        == other.getBedId());
    result = result && getPatientName()
        .equals(other.getPatientName());
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
    hash = (37 * hash) + BED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBedId();
    hash = (37 * hash) + PATIENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPatientName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.BedAssignmentRequest parseFrom(
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
  public static Builder newBuilder(cw.BedManagementService.BedAssignmentRequest prototype) {
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
   * Protobuf type {@code BedManagementService.BedAssignmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BedManagementService.BedAssignmentRequest)
      cw.BedManagementService.BedAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_BedAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_BedAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cw.BedManagementService.BedAssignmentRequest.class, cw.BedManagementService.BedAssignmentRequest.Builder.class);
    }

    // Construct using BedManagementService.BedAssignmentRequest.newBuilder()
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
      bedId_ = 0;

      patientName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_BedAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public cw.BedManagementService.BedAssignmentRequest getDefaultInstanceForType() {
      return cw.BedManagementService.BedAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cw.BedManagementService.BedAssignmentRequest build() {
      cw.BedManagementService.BedAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cw.BedManagementService.BedAssignmentRequest buildPartial() {
      cw.BedManagementService.BedAssignmentRequest result = new cw.BedManagementService.BedAssignmentRequest(this);
      result.bedId_ = bedId_;
      result.patientName_ = patientName_;
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
      if (other instanceof cw.BedManagementService.BedAssignmentRequest) {
        return mergeFrom((cw.BedManagementService.BedAssignmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cw.BedManagementService.BedAssignmentRequest other) {
      if (other == cw.BedManagementService.BedAssignmentRequest.getDefaultInstance()) return this;
      if (other.getBedId() != 0) {
        setBedId(other.getBedId());
      }
      if (!other.getPatientName().isEmpty()) {
        patientName_ = other.patientName_;
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
      cw.BedManagementService.BedAssignmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cw.BedManagementService.BedAssignmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bedId_ ;
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public int getBedId() {
      return bedId_;
    }
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public Builder setBedId(int value) {
      
      bedId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public Builder clearBedId() {
      
      bedId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object patientName_ = "";
    /**
     * <code>string patient_name = 2;</code>
     */
    public java.lang.String getPatientName() {
      java.lang.Object ref = patientName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string patient_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPatientNameBytes() {
      java.lang.Object ref = patientName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string patient_name = 2;</code>
     */
    public Builder setPatientName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string patient_name = 2;</code>
     */
    public Builder clearPatientName() {
      
      patientName_ = getDefaultInstance().getPatientName();
      onChanged();
      return this;
    }
    /**
     * <code>string patient_name = 2;</code>
     */
    public Builder setPatientNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientName_ = value;
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


    // @@protoc_insertion_point(builder_scope:BedManagementService.BedAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:BedManagementService.BedAssignmentRequest)
  private static final cw.BedManagementService.BedAssignmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cw.BedManagementService.BedAssignmentRequest();
  }

  public static cw.BedManagementService.BedAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BedAssignmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<BedAssignmentRequest>() {
    @java.lang.Override
    public BedAssignmentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BedAssignmentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BedAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BedAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cw.BedManagementService.BedAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
