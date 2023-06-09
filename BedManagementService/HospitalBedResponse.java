// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BedManagementService.proto

package cw.BedManagementService;

/**
 * Protobuf type {@code BedManagementService.HospitalBedResponse}
 */
public  final class HospitalBedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BedManagementService.HospitalBedResponse)
    HospitalBedResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HospitalBedResponse.newBuilder() to construct.
  private HospitalBedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HospitalBedResponse() {
    available_ = false;
    bedId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HospitalBedResponse(
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

            available_ = input.readBool();
            break;
          }
          case 16: {

            bedId_ = input.readInt32();
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
    return cw.BedManagementService.BedProto.internal_static_BedManagementService_HospitalBedResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cw.BedManagementService.BedProto.internal_static_BedManagementService_HospitalBedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cw.BedManagementService.HospitalBedResponse.class, cw.BedManagementService.HospitalBedResponse.Builder.class);
  }

  public static final int AVAILABLE_FIELD_NUMBER = 1;
  private boolean available_;
  /**
   * <code>bool available = 1;</code>
   */
  public boolean getAvailable() {
    return available_;
  }

  public static final int BED_ID_FIELD_NUMBER = 2;
  private int bedId_;
  /**
   * <code>int32 bed_id = 2;</code>
   */
  public int getBedId() {
    return bedId_;
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
    if (available_ != false) {
      output.writeBool(1, available_);
    }
    if (bedId_ != 0) {
      output.writeInt32(2, bedId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (available_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, available_);
    }
    if (bedId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, bedId_);
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
    if (!(obj instanceof cw.BedManagementService.HospitalBedResponse)) {
      return super.equals(obj);
    }
    cw.BedManagementService.HospitalBedResponse other = (cw.BedManagementService.HospitalBedResponse) obj;

    boolean result = true;
    result = result && (getAvailable()
        == other.getAvailable());
    result = result && (getBedId()
        == other.getBedId());
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
    hash = (37 * hash) + AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAvailable());
    hash = (37 * hash) + BED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBedId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.BedManagementService.HospitalBedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.HospitalBedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cw.BedManagementService.HospitalBedResponse parseFrom(
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
  public static Builder newBuilder(cw.BedManagementService.HospitalBedResponse prototype) {
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
   * Protobuf type {@code BedManagementService.HospitalBedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BedManagementService.HospitalBedResponse)
      cw.BedManagementService.HospitalBedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_HospitalBedResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_HospitalBedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cw.BedManagementService.HospitalBedResponse.class, cw.BedManagementService.HospitalBedResponse.Builder.class);
    }

    // Construct using BedManagementService.HospitalBedResponse.newBuilder()
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
      available_ = false;

      bedId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cw.BedManagementService.BedProto.internal_static_BedManagementService_HospitalBedResponse_descriptor;
    }

    @java.lang.Override
    public cw.BedManagementService.HospitalBedResponse getDefaultInstanceForType() {
      return cw.BedManagementService.HospitalBedResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cw.BedManagementService.HospitalBedResponse build() {
      cw.BedManagementService.HospitalBedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cw.BedManagementService.HospitalBedResponse buildPartial() {
      cw.BedManagementService.HospitalBedResponse result = new cw.BedManagementService.HospitalBedResponse(this);
      result.available_ = available_;
      result.bedId_ = bedId_;
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
      if (other instanceof cw.BedManagementService.HospitalBedResponse) {
        return mergeFrom((cw.BedManagementService.HospitalBedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cw.BedManagementService.HospitalBedResponse other) {
      if (other == cw.BedManagementService.HospitalBedResponse.getDefaultInstance()) return this;
      if (other.getAvailable() != false) {
        setAvailable(other.getAvailable());
      }
      if (other.getBedId() != 0) {
        setBedId(other.getBedId());
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
      cw.BedManagementService.HospitalBedResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cw.BedManagementService.HospitalBedResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean available_ ;
    /**
     * <code>bool available = 1;</code>
     */
    public boolean getAvailable() {
      return available_;
    }
    /**
     * <code>bool available = 1;</code>
     */
    public Builder setAvailable(boolean value) {
      
      available_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool available = 1;</code>
     */
    public Builder clearAvailable() {
      
      available_ = false;
      onChanged();
      return this;
    }

    private int bedId_ ;
    /**
     * <code>int32 bed_id = 2;</code>
     */
    public int getBedId() {
      return bedId_;
    }
    /**
     * <code>int32 bed_id = 2;</code>
     */
    public Builder setBedId(int value) {
      
      bedId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bed_id = 2;</code>
     */
    public Builder clearBedId() {
      
      bedId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BedManagementService.HospitalBedResponse)
  }

  // @@protoc_insertion_point(class_scope:BedManagementService.HospitalBedResponse)
  private static final cw.BedManagementService.HospitalBedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cw.BedManagementService.HospitalBedResponse();
  }

  public static cw.BedManagementService.HospitalBedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HospitalBedResponse>
      PARSER = new com.google.protobuf.AbstractParser<HospitalBedResponse>() {
    @java.lang.Override
    public HospitalBedResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HospitalBedResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HospitalBedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HospitalBedResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cw.BedManagementService.HospitalBedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

