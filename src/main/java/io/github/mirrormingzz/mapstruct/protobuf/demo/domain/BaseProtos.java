// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

package io.github.mirrormingzz.mapstruct.protobuf.demo.domain;

public final class BaseProtos {
  private BaseProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestAnyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestAny)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string message = 1;</code>
     */
    String getMessage();
    /**
     * <code>optional string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    java.util.List<com.google.protobuf.Any>
        getDetailsList();
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    com.google.protobuf.Any getDetails(int index);
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    int getDetailsCount();
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    java.util.List<? extends com.google.protobuf.AnyOrBuilder>
        getDetailsOrBuilderList();
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TestAny}
   */
  public  static final class TestAny extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TestAny)
      TestAnyOrBuilder {
    // Use TestAny.newBuilder() to construct.
    private TestAny(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestAny() {
      message_ = "";
      details_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private TestAny(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                details_ = new java.util.ArrayList<com.google.protobuf.Any>();
                mutable_bitField0_ |= 0x00000002;
              }
              details_.add(
                  input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          details_ = java.util.Collections.unmodifiableList(details_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BaseProtos.internal_static_TestAny_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BaseProtos.internal_static_TestAny_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TestAny.class, Builder.class);
    }

    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private volatile Object message_;
    /**
     * <code>optional string message = 1;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DETAILS_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.Any> details_;
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    public java.util.List<com.google.protobuf.Any> getDetailsList() {
      return details_;
    }
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder>
        getDetailsOrBuilderList() {
      return details_;
    }
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    public int getDetailsCount() {
      return details_.size();
    }
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    public com.google.protobuf.Any getDetails(int index) {
      return details_.get(index);
    }
    /**
     * <code>repeated .google.protobuf.Any details = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
        int index) {
      return details_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      for (int i = 0; i < details_.size(); i++) {
        output.writeMessage(2, details_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
      }
      for (int i = 0; i < details_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, details_.get(i));
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TestAny)) {
        return super.equals(obj);
      }
      TestAny other = (TestAny) obj;

      boolean result = true;
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && getDetailsList()
          .equals(other.getDetailsList());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      if (getDetailsCount() > 0) {
        hash = (37 * hash) + DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getDetailsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TestAny parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestAny parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestAny parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestAny parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestAny parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestAny parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestAny parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TestAny parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestAny parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestAny parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TestAny prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestAny}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestAny)
        TestAnyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BaseProtos.internal_static_TestAny_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BaseProtos.internal_static_TestAny_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TestAny.class, Builder.class);
      }

      // Construct using io.github.mirrormingzz.mapstruct.protobuf.demo.domain.BaseProtos.TestAny.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDetailsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        message_ = "";

        if (detailsBuilder_ == null) {
          details_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          detailsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BaseProtos.internal_static_TestAny_descriptor;
      }

      public TestAny getDefaultInstanceForType() {
        return TestAny.getDefaultInstance();
      }

      public TestAny build() {
        TestAny result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public TestAny buildPartial() {
        TestAny result = new TestAny(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.message_ = message_;
        if (detailsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            details_ = java.util.Collections.unmodifiableList(details_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.details_ = details_;
        } else {
          result.details_ = detailsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TestAny) {
          return mergeFrom((TestAny)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TestAny other) {
        if (other == TestAny.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (detailsBuilder_ == null) {
          if (!other.details_.isEmpty()) {
            if (details_.isEmpty()) {
              details_ = other.details_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDetailsIsMutable();
              details_.addAll(other.details_);
            }
            onChanged();
          }
        } else {
          if (!other.details_.isEmpty()) {
            if (detailsBuilder_.isEmpty()) {
              detailsBuilder_.dispose();
              detailsBuilder_ = null;
              details_ = other.details_;
              bitField0_ = (bitField0_ & ~0x00000002);
              detailsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDetailsFieldBuilder() : null;
            } else {
              detailsBuilder_.addAllMessages(other.details_);
            }
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TestAny parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TestAny) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object message_ = "";
      /**
       * <code>optional string message = 1;</code>
       */
      public String getMessage() {
        Object ref = message_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder setMessage(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder clearMessage() {

        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        message_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.Any> details_ =
        java.util.Collections.emptyList();
      private void ensureDetailsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          details_ = new java.util.ArrayList<com.google.protobuf.Any>(details_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> detailsBuilder_;

      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public java.util.List<com.google.protobuf.Any> getDetailsList() {
        if (detailsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(details_);
        } else {
          return detailsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public int getDetailsCount() {
        if (detailsBuilder_ == null) {
          return details_.size();
        } else {
          return detailsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public com.google.protobuf.Any getDetails(int index) {
        if (detailsBuilder_ == null) {
          return details_.get(index);
        } else {
          return detailsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder setDetails(
          int index, com.google.protobuf.Any value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.set(index, value);
          onChanged();
        } else {
          detailsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder setDetails(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.set(index, builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder addDetails(com.google.protobuf.Any value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.add(value);
          onChanged();
        } else {
          detailsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder addDetails(
          int index, com.google.protobuf.Any value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.add(index, value);
          onChanged();
        } else {
          detailsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder addDetails(
          com.google.protobuf.Any.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.add(builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder addDetails(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.add(index, builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder addAllDetails(
          Iterable<? extends com.google.protobuf.Any> values) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, details_);
          onChanged();
        } else {
          detailsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder clearDetails() {
        if (detailsBuilder_ == null) {
          details_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          detailsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public Builder removeDetails(int index) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.remove(index);
          onChanged();
        } else {
          detailsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public com.google.protobuf.Any.Builder getDetailsBuilder(
          int index) {
        return getDetailsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
          int index) {
        if (detailsBuilder_ == null) {
          return details_.get(index);  } else {
          return detailsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public java.util.List<? extends com.google.protobuf.AnyOrBuilder>
           getDetailsOrBuilderList() {
        if (detailsBuilder_ != null) {
          return detailsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(details_);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public com.google.protobuf.Any.Builder addDetailsBuilder() {
        return getDetailsFieldBuilder().addBuilder(
            com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public com.google.protobuf.Any.Builder addDetailsBuilder(
          int index) {
        return getDetailsFieldBuilder().addBuilder(
            index, com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <code>repeated .google.protobuf.Any details = 2;</code>
       */
      public java.util.List<com.google.protobuf.Any.Builder>
           getDetailsBuilderList() {
        return getDetailsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>
          getDetailsFieldBuilder() {
        if (detailsBuilder_ == null) {
          detailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  details_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          details_ = null;
        }
        return detailsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:TestAny)
    }

    // @@protoc_insertion_point(class_scope:TestAny)
    private static final TestAny DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TestAny();
    }

    public static TestAny getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TestAny>
        PARSER = new com.google.protobuf.AbstractParser<TestAny>() {
      public TestAny parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestAny(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestAny> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TestAny> getParserForType() {
      return PARSER;
    }

    public TestAny getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestAny_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestAny_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nbase.proto\032\031google/protobuf/any.proto\"" +
      "A\n\007TestAny\022\017\n\007message\030\001 \001(\t\022%\n\007details\030\002" +
      " \003(\0132\024.google.protobuf.AnyBC\n5io.github." +
      "mirrormingzz.mapstruct.protobuf.demo.dom" +
      "ainB\nBaseProtosb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_TestAny_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestAny_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestAny_descriptor,
        new String[] { "Message", "Details", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
