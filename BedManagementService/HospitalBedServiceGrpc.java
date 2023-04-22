package cw.BedManagementService;

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
    comments = "Source: BedManagementService.proto")
public final class HospitalBedServiceGrpc {

  private HospitalBedServiceGrpc() {}

  public static final String SERVICE_NAME = "BedManagementService.HospitalBedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cw.BedManagementService.HospitalBedRequest,
      cw.BedManagementService.HospitalBedResponse> getCheckBedAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkBedAvailability",
      requestType = cw.BedManagementService.HospitalBedRequest.class,
      responseType = cw.BedManagementService.HospitalBedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<cw.BedManagementService.HospitalBedRequest,
      cw.BedManagementService.HospitalBedResponse> getCheckBedAvailabilityMethod() {
    io.grpc.MethodDescriptor<cw.BedManagementService.HospitalBedRequest, cw.BedManagementService.HospitalBedResponse> getCheckBedAvailabilityMethod;
    if ((getCheckBedAvailabilityMethod = HospitalBedServiceGrpc.getCheckBedAvailabilityMethod) == null) {
      synchronized (HospitalBedServiceGrpc.class) {
        if ((getCheckBedAvailabilityMethod = HospitalBedServiceGrpc.getCheckBedAvailabilityMethod) == null) {
          HospitalBedServiceGrpc.getCheckBedAvailabilityMethod = getCheckBedAvailabilityMethod = 
              io.grpc.MethodDescriptor.<cw.BedManagementService.HospitalBedRequest, cw.BedManagementService.HospitalBedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BedManagementService.HospitalBedService", "checkBedAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.HospitalBedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.HospitalBedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HospitalBedServiceMethodDescriptorSupplier("checkBedAvailability"))
                  .build();
          }
        }
     }
     return getCheckBedAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.BedManagementService.BedAssignmentRequest,
      cw.BedManagementService.BedAssignmentResponse> getAssignBedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignBed",
      requestType = cw.BedManagementService.BedAssignmentRequest.class,
      responseType = cw.BedManagementService.BedAssignmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cw.BedManagementService.BedAssignmentRequest,
      cw.BedManagementService.BedAssignmentResponse> getAssignBedMethod() {
    io.grpc.MethodDescriptor<cw.BedManagementService.BedAssignmentRequest, cw.BedManagementService.BedAssignmentResponse> getAssignBedMethod;
    if ((getAssignBedMethod = HospitalBedServiceGrpc.getAssignBedMethod) == null) {
      synchronized (HospitalBedServiceGrpc.class) {
        if ((getAssignBedMethod = HospitalBedServiceGrpc.getAssignBedMethod) == null) {
          HospitalBedServiceGrpc.getAssignBedMethod = getAssignBedMethod = 
              io.grpc.MethodDescriptor.<cw.BedManagementService.BedAssignmentRequest, cw.BedManagementService.BedAssignmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BedManagementService.HospitalBedService", "assignBed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.BedAssignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.BedAssignmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HospitalBedServiceMethodDescriptorSupplier("assignBed"))
                  .build();
          }
        }
     }
     return getAssignBedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.BedManagementService.CleanerRequest,
      cw.BedManagementService.CleanerResponse> getGiveCleanerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "giveCleaner",
      requestType = cw.BedManagementService.CleanerRequest.class,
      responseType = cw.BedManagementService.CleanerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.BedManagementService.CleanerRequest,
      cw.BedManagementService.CleanerResponse> getGiveCleanerMethod() {
    io.grpc.MethodDescriptor<cw.BedManagementService.CleanerRequest, cw.BedManagementService.CleanerResponse> getGiveCleanerMethod;
    if ((getGiveCleanerMethod = HospitalBedServiceGrpc.getGiveCleanerMethod) == null) {
      synchronized (HospitalBedServiceGrpc.class) {
        if ((getGiveCleanerMethod = HospitalBedServiceGrpc.getGiveCleanerMethod) == null) {
          HospitalBedServiceGrpc.getGiveCleanerMethod = getGiveCleanerMethod = 
              io.grpc.MethodDescriptor.<cw.BedManagementService.CleanerRequest, cw.BedManagementService.CleanerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BedManagementService.HospitalBedService", "giveCleaner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.CleanerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.BedManagementService.CleanerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HospitalBedServiceMethodDescriptorSupplier("giveCleaner"))
                  .build();
          }
        }
     }
     return getGiveCleanerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalBedServiceStub newStub(io.grpc.Channel channel) {
    return new HospitalBedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalBedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HospitalBedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalBedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HospitalBedServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HospitalBedServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<cw.BedManagementService.HospitalBedRequest> checkBedAvailability(
        io.grpc.stub.StreamObserver<cw.BedManagementService.HospitalBedResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckBedAvailabilityMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cw.BedManagementService.BedAssignmentRequest> assignBed(
        io.grpc.stub.StreamObserver<cw.BedManagementService.BedAssignmentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAssignBedMethod(), responseObserver);
    }

    /**
     */
    public void giveCleaner(cw.BedManagementService.CleanerRequest request,
        io.grpc.stub.StreamObserver<cw.BedManagementService.CleanerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveCleanerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckBedAvailabilityMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                cw.BedManagementService.HospitalBedRequest,
                cw.BedManagementService.HospitalBedResponse>(
                  this, METHODID_CHECK_BED_AVAILABILITY)))
          .addMethod(
            getAssignBedMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                cw.BedManagementService.BedAssignmentRequest,
                cw.BedManagementService.BedAssignmentResponse>(
                  this, METHODID_ASSIGN_BED)))
          .addMethod(
            getGiveCleanerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.BedManagementService.CleanerRequest,
                cw.BedManagementService.CleanerResponse>(
                  this, METHODID_GIVE_CLEANER)))
          .build();
    }
  }

  /**
   */
  public static final class HospitalBedServiceStub extends io.grpc.stub.AbstractStub<HospitalBedServiceStub> {
    private HospitalBedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HospitalBedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalBedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HospitalBedServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cw.BedManagementService.HospitalBedRequest> checkBedAvailability(
        io.grpc.stub.StreamObserver<cw.BedManagementService.HospitalBedResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckBedAvailabilityMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cw.BedManagementService.BedAssignmentRequest> assignBed(
        io.grpc.stub.StreamObserver<cw.BedManagementService.BedAssignmentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAssignBedMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void giveCleaner(cw.BedManagementService.CleanerRequest request,
        io.grpc.stub.StreamObserver<cw.BedManagementService.CleanerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveCleanerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HospitalBedServiceBlockingStub extends io.grpc.stub.AbstractStub<HospitalBedServiceBlockingStub> {
    private HospitalBedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HospitalBedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalBedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HospitalBedServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cw.BedManagementService.CleanerResponse giveCleaner(cw.BedManagementService.CleanerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveCleanerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HospitalBedServiceFutureStub extends io.grpc.stub.AbstractStub<HospitalBedServiceFutureStub> {
    private HospitalBedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HospitalBedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalBedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HospitalBedServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.BedManagementService.CleanerResponse> giveCleaner(
        cw.BedManagementService.CleanerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveCleanerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_CLEANER = 0;
  private static final int METHODID_CHECK_BED_AVAILABILITY = 1;
  private static final int METHODID_ASSIGN_BED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HospitalBedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HospitalBedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_CLEANER:
          serviceImpl.giveCleaner((cw.BedManagementService.CleanerRequest) request,
              (io.grpc.stub.StreamObserver<cw.BedManagementService.CleanerResponse>) responseObserver);
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
        case METHODID_CHECK_BED_AVAILABILITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkBedAvailability(
              (io.grpc.stub.StreamObserver<cw.BedManagementService.HospitalBedResponse>) responseObserver);
        case METHODID_ASSIGN_BED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.assignBed(
              (io.grpc.stub.StreamObserver<cw.BedManagementService.BedAssignmentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HospitalBedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalBedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cw.BedManagementService.BedProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalBedService");
    }
  }

  private static final class HospitalBedServiceFileDescriptorSupplier
      extends HospitalBedServiceBaseDescriptorSupplier {
    HospitalBedServiceFileDescriptorSupplier() {}
  }

  private static final class HospitalBedServiceMethodDescriptorSupplier
      extends HospitalBedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HospitalBedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HospitalBedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalBedServiceFileDescriptorSupplier())
              .addMethod(getCheckBedAvailabilityMethod())
              .addMethod(getAssignBedMethod())
              .addMethod(getGiveCleanerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
