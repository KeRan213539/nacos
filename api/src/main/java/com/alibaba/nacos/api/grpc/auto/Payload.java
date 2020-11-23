/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nacos_grpc_service.proto

package com.alibaba.nacos.api.grpc.auto;

/**
 * Protobuf type {@code Payload}
 */
public final class Payload extends com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:Payload)
        PayloadOrBuilder {
    
    // Use Payload.newBuilder() to construct.
    private Payload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    
    private Payload() {
    }
    
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    
    private Payload(com.google.protobuf.CodedInputStream input,
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
                    case 18: {
                        com.alibaba.nacos.api.grpc.auto.Metadata.Builder subBuilder = null;
                        if (metadata_ != null) {
                            subBuilder = metadata_.toBuilder();
                        }
                        metadata_ = input
                                .readMessage(com.alibaba.nacos.api.grpc.auto.Metadata.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(metadata_);
                            metadata_ = subBuilder.buildPartial();
                        }
                        
                        break;
                    }
                    case 26: {
                        com.google.protobuf.Any.Builder subBuilder = null;
                        if (body_ != null) {
                            subBuilder = body_.toBuilder();
                        }
                        body_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(body_);
                            body_ = subBuilder.buildPartial();
                        }
                        
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        } finally {
            makeExtensionsImmutable();
        }
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Payload_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Payload_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alibaba.nacos.api.grpc.auto.Payload.class,
                        com.alibaba.nacos.api.grpc.auto.Payload.Builder.class);
    }
    
    public static final int METADATA_FIELD_NUMBER = 2;
    
    private com.alibaba.nacos.api.grpc.auto.Metadata metadata_;
    
    /**
     * <code>.Metadata metadata = 2;</code>
     */
    public boolean hasMetadata() {
        return metadata_ != null;
    }
    
    /**
     * <code>.Metadata metadata = 2;</code>
     */
    public com.alibaba.nacos.api.grpc.auto.Metadata getMetadata() {
        return metadata_ == null ? com.alibaba.nacos.api.grpc.auto.Metadata.getDefaultInstance() : metadata_;
    }
    
    /**
     * <code>.Metadata metadata = 2;</code>
     */
    public com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder getMetadataOrBuilder() {
        return getMetadata();
    }
    
    public static final int BODY_FIELD_NUMBER = 3;
    
    private com.google.protobuf.Any body_;
    
    /**
     * <code>.google.protobuf.Any body = 3;</code>
     */
    public boolean hasBody() {
        return body_ != null;
    }
    
    /**
     * <code>.google.protobuf.Any body = 3;</code>
     */
    public com.google.protobuf.Any getBody() {
        return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
    }
    
    /**
     * <code>.google.protobuf.Any body = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getBodyOrBuilder() {
        return getBody();
    }
    
    private byte memoizedIsInitialized = -1;
    
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        
        memoizedIsInitialized = 1;
        return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (metadata_ != null) {
            output.writeMessage(2, getMetadata());
        }
        if (body_ != null) {
            output.writeMessage(3, getBody());
        }
    }
    
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) {
            return size;
        }
        
        size = 0;
        if (metadata_ != null) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadata());
        }
        if (body_ != null) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getBody());
        }
        memoizedSize = size;
        return size;
    }
    
    private static final long serialVersionUID = 0L;
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.alibaba.nacos.api.grpc.auto.Payload)) {
            return super.equals(obj);
        }
        com.alibaba.nacos.api.grpc.auto.Payload other = (com.alibaba.nacos.api.grpc.auto.Payload) obj;
        
        boolean result = true;
        result = result && (hasMetadata() == other.hasMetadata());
        if (hasMetadata()) {
            result = result && getMetadata().equals(other.getMetadata());
        }
        result = result && (hasBody() == other.hasBody());
        if (hasBody()) {
            result = result && getBody().equals(other.getBody());
        }
        return result;
    }
    
    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasMetadata()) {
            hash = (37 * hash) + METADATA_FIELD_NUMBER;
            hash = (53 * hash) + getMetadata().hashCode();
        }
        if (hasBody()) {
            hash = (37 * hash) + BODY_FIELD_NUMBER;
            hash = (53 * hash) + getBody().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload parseFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }
    
    public Builder newBuilderForType() {
        return newBuilder();
    }
    
    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }
    
    public static Builder newBuilder(com.alibaba.nacos.api.grpc.auto.Payload prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }
    
    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }
    
    /**
     * Protobuf type {@code Payload}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Payload)
            com.alibaba.nacos.api.grpc.auto.PayloadOrBuilder {
        
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Payload_descriptor;
        }
        
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Payload_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.alibaba.nacos.api.grpc.auto.Payload.class,
                            com.alibaba.nacos.api.grpc.auto.Payload.Builder.class);
        }
        
        // Construct using com.alibaba.nacos.api.grpc.auto.Payload.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }
        
        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }
        
        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }
        
        public Builder clear() {
            super.clear();
            if (metadataBuilder_ == null) {
                metadata_ = null;
            } else {
                metadata_ = null;
                metadataBuilder_ = null;
            }
            if (bodyBuilder_ == null) {
                body_ = null;
            } else {
                body_ = null;
                bodyBuilder_ = null;
            }
            return this;
        }
        
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Payload_descriptor;
        }
        
        public com.alibaba.nacos.api.grpc.auto.Payload getDefaultInstanceForType() {
            return com.alibaba.nacos.api.grpc.auto.Payload.getDefaultInstance();
        }
        
        public com.alibaba.nacos.api.grpc.auto.Payload build() {
            com.alibaba.nacos.api.grpc.auto.Payload result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }
        
        public com.alibaba.nacos.api.grpc.auto.Payload buildPartial() {
            com.alibaba.nacos.api.grpc.auto.Payload result = new com.alibaba.nacos.api.grpc.auto.Payload(this);
            if (metadataBuilder_ == null) {
                result.metadata_ = metadata_;
            } else {
                result.metadata_ = metadataBuilder_.build();
            }
            if (bodyBuilder_ == null) {
                result.body_ = body_;
            } else {
                result.body_ = bodyBuilder_.build();
            }
            onBuilt();
            return result;
        }
        
        public Builder clone() {
            return (Builder) super.clone();
        }
        
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.setField(field, value);
        }
        
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }
        
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }
        
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }
        
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.alibaba.nacos.api.grpc.auto.Payload) {
                return mergeFrom((com.alibaba.nacos.api.grpc.auto.Payload) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }
        
        public Builder mergeFrom(com.alibaba.nacos.api.grpc.auto.Payload other) {
            if (other == com.alibaba.nacos.api.grpc.auto.Payload.getDefaultInstance()) {
                return this;
            }
            if (other.hasMetadata()) {
                mergeMetadata(other.getMetadata());
            }
            if (other.hasBody()) {
                mergeBody(other.getBody());
            }
            onChanged();
            return this;
        }
        
        public final boolean isInitialized() {
            return true;
        }
        
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            com.alibaba.nacos.api.grpc.auto.Payload parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.alibaba.nacos.api.grpc.auto.Payload) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        
        private com.alibaba.nacos.api.grpc.auto.Metadata metadata_ = null;
        
        private com.google.protobuf.SingleFieldBuilderV3<com.alibaba.nacos.api.grpc.auto.Metadata, com.alibaba.nacos.api.grpc.auto.Metadata.Builder, com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder> metadataBuilder_;
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public boolean hasMetadata() {
            return metadataBuilder_ != null || metadata_ != null;
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public com.alibaba.nacos.api.grpc.auto.Metadata getMetadata() {
            if (metadataBuilder_ == null) {
                return metadata_ == null ? com.alibaba.nacos.api.grpc.auto.Metadata.getDefaultInstance() : metadata_;
            } else {
                return metadataBuilder_.getMessage();
            }
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public Builder setMetadata(com.alibaba.nacos.api.grpc.auto.Metadata value) {
            if (metadataBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                metadata_ = value;
                onChanged();
            } else {
                metadataBuilder_.setMessage(value);
            }
            
            return this;
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public Builder setMetadata(com.alibaba.nacos.api.grpc.auto.Metadata.Builder builderForValue) {
            if (metadataBuilder_ == null) {
                metadata_ = builderForValue.build();
                onChanged();
            } else {
                metadataBuilder_.setMessage(builderForValue.build());
            }
            
            return this;
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public Builder mergeMetadata(com.alibaba.nacos.api.grpc.auto.Metadata value) {
            if (metadataBuilder_ == null) {
                if (metadata_ != null) {
                    metadata_ = com.alibaba.nacos.api.grpc.auto.Metadata.newBuilder(metadata_).mergeFrom(value)
                            .buildPartial();
                } else {
                    metadata_ = value;
                }
                onChanged();
            } else {
                metadataBuilder_.mergeFrom(value);
            }
            
            return this;
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public Builder clearMetadata() {
            if (metadataBuilder_ == null) {
                metadata_ = null;
                onChanged();
            } else {
                metadata_ = null;
                metadataBuilder_ = null;
            }
            
            return this;
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public com.alibaba.nacos.api.grpc.auto.Metadata.Builder getMetadataBuilder() {
            
            onChanged();
            return getMetadataFieldBuilder().getBuilder();
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        public com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder getMetadataOrBuilder() {
            if (metadataBuilder_ != null) {
                return metadataBuilder_.getMessageOrBuilder();
            } else {
                return metadata_ == null ? com.alibaba.nacos.api.grpc.auto.Metadata.getDefaultInstance() : metadata_;
            }
        }
        
        /**
         * <code>.Metadata metadata = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<com.alibaba.nacos.api.grpc.auto.Metadata, com.alibaba.nacos.api.grpc.auto.Metadata.Builder, com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder> getMetadataFieldBuilder() {
            if (metadataBuilder_ == null) {
                metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alibaba.nacos.api.grpc.auto.Metadata, com.alibaba.nacos.api.grpc.auto.Metadata.Builder, com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder>(
                        getMetadata(), getParentForChildren(), isClean());
                metadata_ = null;
            }
            return metadataBuilder_;
        }
        
        private com.google.protobuf.Any body_ = null;
        
        private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> bodyBuilder_;
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public boolean hasBody() {
            return bodyBuilder_ != null || body_ != null;
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public com.google.protobuf.Any getBody() {
            if (bodyBuilder_ == null) {
                return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
            } else {
                return bodyBuilder_.getMessage();
            }
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public Builder setBody(com.google.protobuf.Any value) {
            if (bodyBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                body_ = value;
                onChanged();
            } else {
                bodyBuilder_.setMessage(value);
            }
            
            return this;
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public Builder setBody(com.google.protobuf.Any.Builder builderForValue) {
            if (bodyBuilder_ == null) {
                body_ = builderForValue.build();
                onChanged();
            } else {
                bodyBuilder_.setMessage(builderForValue.build());
            }
            
            return this;
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public Builder mergeBody(com.google.protobuf.Any value) {
            if (bodyBuilder_ == null) {
                if (body_ != null) {
                    body_ = com.google.protobuf.Any.newBuilder(body_).mergeFrom(value).buildPartial();
                } else {
                    body_ = value;
                }
                onChanged();
            } else {
                bodyBuilder_.mergeFrom(value);
            }
            
            return this;
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public Builder clearBody() {
            if (bodyBuilder_ == null) {
                body_ = null;
                onChanged();
            } else {
                body_ = null;
                bodyBuilder_ = null;
            }
            
            return this;
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public com.google.protobuf.Any.Builder getBodyBuilder() {
            
            onChanged();
            return getBodyFieldBuilder().getBuilder();
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        public com.google.protobuf.AnyOrBuilder getBodyOrBuilder() {
            if (bodyBuilder_ != null) {
                return bodyBuilder_.getMessageOrBuilder();
            } else {
                return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
            }
        }
        
        /**
         * <code>.google.protobuf.Any body = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> getBodyFieldBuilder() {
            if (bodyBuilder_ == null) {
                bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                        getBody(), getParentForChildren(), isClean());
                body_ = null;
            }
            return bodyBuilder_;
        }
        
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }
        
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }
        
        // @@protoc_insertion_point(builder_scope:Payload)
    }
    
    // @@protoc_insertion_point(class_scope:Payload)
    private static final com.alibaba.nacos.api.grpc.auto.Payload DEFAULT_INSTANCE;
    
    static {
        DEFAULT_INSTANCE = new com.alibaba.nacos.api.grpc.auto.Payload();
    }
    
    public static com.alibaba.nacos.api.grpc.auto.Payload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }
    
    private static final com.google.protobuf.Parser<Payload> PARSER = new com.google.protobuf.AbstractParser<Payload>() {
        public Payload parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Payload(input, extensionRegistry);
        }
    };
    
    public static com.google.protobuf.Parser<Payload> parser() {
        return PARSER;
    }
    
    @java.lang.Override
    public com.google.protobuf.Parser<Payload> getParserForType() {
        return PARSER;
    }
    
    public com.alibaba.nacos.api.grpc.auto.Payload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
    
}

