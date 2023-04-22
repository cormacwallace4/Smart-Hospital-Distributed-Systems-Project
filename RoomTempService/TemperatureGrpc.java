package cw.RoomTempService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: RoomTemperatureService.proto")
public final class TemperatureGrpc {

  private TemperatureGrpc() {}

  public static final String SERVICE_NAME = "RoomTempService.Temperature";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest,
      cw.RoomTempService.TempReply> getGiveTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiveTemp",
      requestType = cw.RoomTempService.TempRequest.class,
      responseType = cw.RoomTempService.TempReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest,
      cw.RoomTempService.TempReply> getGiveTempMethod() {
    io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest, cw.RoomTempService.TempReply> getGiveTempMethod;
    if ((getGiveTempMethod = TemperatureGrpc.getGiveTempMethod) == null) {
      synchronized (TemperatureGrpc.class) {
        if ((getGiveTempMethod = TemperatureGrpc.getGiveTempMethod) == null) {
          TemperatureGrpc.getGiveTempMethod = getGiveTempMethod = 
              io.grpc.MethodDescriptor.<cw.RoomTempService.TempRequest, cw.RoomTempService.TempReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoomTempService.Temperature", "GiveTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.TempReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureMethodDescriptorSupplier("GiveTemp"))
                  .build();
          }
        }
     }
     return getGiveTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.RoomTempService.SetTempRequest,
      cw.RoomTempService.TempReply> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemp",
      requestType = cw.RoomTempService.SetTempRequest.class,
      responseType = cw.RoomTempService.TempReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.RoomTempService.SetTempRequest,
      cw.RoomTempService.TempReply> getSetTempMethod() {
    io.grpc.MethodDescriptor<cw.RoomTempService.SetTempRequest, cw.RoomTempService.TempReply> getSetTempMethod;
    if ((getSetTempMethod = TemperatureGrpc.getSetTempMethod) == null) {
      synchronized (TemperatureGrpc.class) {
        if ((getSetTempMethod = TemperatureGrpc.getSetTempMethod) == null) {
          TemperatureGrpc.getSetTempMethod = getSetTempMethod = 
              io.grpc.MethodDescriptor.<cw.RoomTempService.SetTempRequest, cw.RoomTempService.TempReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoomTempService.Temperature", "SetTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.SetTempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.TempReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureMethodDescriptorSupplier("SetTemp"))
                  .build();
          }
        }
     }
     return getSetTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest,
      cw.RoomTempService.AllRoomsReply> getGetAllRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRooms",
      requestType = cw.RoomTempService.TempRequest.class,
      responseType = cw.RoomTempService.AllRoomsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest,
      cw.RoomTempService.AllRoomsReply> getGetAllRoomsMethod() {
    io.grpc.MethodDescriptor<cw.RoomTempService.TempRequest, cw.RoomTempService.AllRoomsReply> getGetAllRoomsMethod;
    if ((getGetAllRoomsMethod = TemperatureGrpc.getGetAllRoomsMethod) == null) {
      synchronized (TemperatureGrpc.class) {
        if ((getGetAllRoomsMethod = TemperatureGrpc.getGetAllRoomsMethod) == null) {
          TemperatureGrpc.getGetAllRoomsMethod = getGetAllRoomsMethod = 
              io.grpc.MethodDescriptor.<cw.RoomTempService.TempRequest, cw.RoomTempService.AllRoomsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoomTempService.Temperature", "GetAllRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.RoomTempService.AllRoomsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureMethodDescriptorSupplier("GetAllRooms"))
                  .build();
          }
        }
     }
     return getGetAllRoomsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureStub newStub(io.grpc.Channel channel) {
    return new TemperatureStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemperatureBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemperatureFutureStub(channel);
  }

  /**
   */
  public static abstract class TemperatureImplBase implements io.grpc.BindableService {

    /**
     */
    public void giveTemp(cw.RoomTempService.TempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveTempMethod(), responseObserver);
    }

    /**
     */
    public void setTemp(cw.RoomTempService.SetTempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    /**
     */
    public void getAllRooms(cw.RoomTempService.TempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.AllRoomsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRoomsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGiveTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.RoomTempService.TempRequest,
                cw.RoomTempService.TempReply>(
                  this, METHODID_GIVE_TEMP)))
          .addMethod(
            getSetTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.RoomTempService.SetTempRequest,
                cw.RoomTempService.TempReply>(
                  this, METHODID_SET_TEMP)))
          .addMethod(
            getGetAllRoomsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.RoomTempService.TempRequest,
                cw.RoomTempService.AllRoomsReply>(
                  this, METHODID_GET_ALL_ROOMS)))
          .build();
    }
  }

  /**
   */
  public static final class TemperatureStub extends io.grpc.stub.AbstractStub<TemperatureStub> {
    private TemperatureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureStub(channel, callOptions);
    }

    /**
     */
    public void giveTemp(cw.RoomTempService.TempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemp(cw.RoomTempService.SetTempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRooms(cw.RoomTempService.TempRequest request,
        io.grpc.stub.StreamObserver<cw.RoomTempService.AllRoomsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRoomsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TemperatureBlockingStub extends io.grpc.stub.AbstractStub<TemperatureBlockingStub> {
    private TemperatureBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureBlockingStub(channel, callOptions);
    }

    /**
     */
    public cw.RoomTempService.TempReply giveTemp(cw.RoomTempService.TempRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public cw.RoomTempService.TempReply setTemp(cw.RoomTempService.SetTempRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public cw.RoomTempService.AllRoomsReply getAllRooms(cw.RoomTempService.TempRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRoomsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TemperatureFutureStub extends io.grpc.stub.AbstractStub<TemperatureFutureStub> {
    private TemperatureFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.RoomTempService.TempReply> giveTemp(
        cw.RoomTempService.TempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.RoomTempService.TempReply> setTemp(
        cw.RoomTempService.SetTempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.RoomTempService.AllRoomsReply> getAllRooms(
        cw.RoomTempService.TempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRoomsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_TEMP = 0;
  private static final int METHODID_SET_TEMP = 1;
  private static final int METHODID_GET_ALL_ROOMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemperatureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemperatureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_TEMP:
          serviceImpl.giveTemp((cw.RoomTempService.TempRequest) request,
              (io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply>) responseObserver);
          break;
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((cw.RoomTempService.SetTempRequest) request,
              (io.grpc.stub.StreamObserver<cw.RoomTempService.TempReply>) responseObserver);
          break;
        case METHODID_GET_ALL_ROOMS:
          serviceImpl.getAllRooms((cw.RoomTempService.TempRequest) request,
              (io.grpc.stub.StreamObserver<cw.RoomTempService.AllRoomsReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TemperatureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cw.RoomTempService.TemperatureProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Temperature");
    }
  }

  private static final class TemperatureFileDescriptorSupplier
      extends TemperatureBaseDescriptorSupplier {
    TemperatureFileDescriptorSupplier() {}
  }

  private static final class TemperatureMethodDescriptorSupplier
      extends TemperatureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemperatureMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TemperatureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureFileDescriptorSupplier())
              .addMethod(getGiveTempMethod())
              .addMethod(getSetTempMethod())
              .addMethod(getGetAllRoomsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
