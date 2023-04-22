package cw.HealthMonitoringService;

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
    comments = "Source: HealthMonitoringService.proto")
public final class HealthMonitoringServiceGrpc {

  private HealthMonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "HealthMonitoringService.HealthMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientID,
      cw.HealthMonitoringService.PatientVitals> getGetPatientVitalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatientVitals",
      requestType = cw.HealthMonitoringService.PatientID.class,
      responseType = cw.HealthMonitoringService.PatientVitals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientID,
      cw.HealthMonitoringService.PatientVitals> getGetPatientVitalsMethod() {
    io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientID, cw.HealthMonitoringService.PatientVitals> getGetPatientVitalsMethod;
    if ((getGetPatientVitalsMethod = HealthMonitoringServiceGrpc.getGetPatientVitalsMethod) == null) {
      synchronized (HealthMonitoringServiceGrpc.class) {
        if ((getGetPatientVitalsMethod = HealthMonitoringServiceGrpc.getGetPatientVitalsMethod) == null) {
          HealthMonitoringServiceGrpc.getGetPatientVitalsMethod = getGetPatientVitalsMethod = 
              io.grpc.MethodDescriptor.<cw.HealthMonitoringService.PatientID, cw.HealthMonitoringService.PatientVitals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HealthMonitoringService.HealthMonitoringService", "GetPatientVitals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.PatientID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.PatientVitals.getDefaultInstance()))
                  .setSchemaDescriptor(new HealthMonitoringServiceMethodDescriptorSupplier("GetPatientVitals"))
                  .build();
          }
        }
     }
     return getGetPatientVitalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientVitals,
      cw.HealthMonitoringService.AlertConfirmation> getAlertDoctorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlertDoctors",
      requestType = cw.HealthMonitoringService.PatientVitals.class,
      responseType = cw.HealthMonitoringService.AlertConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientVitals,
      cw.HealthMonitoringService.AlertConfirmation> getAlertDoctorsMethod() {
    io.grpc.MethodDescriptor<cw.HealthMonitoringService.PatientVitals, cw.HealthMonitoringService.AlertConfirmation> getAlertDoctorsMethod;
    if ((getAlertDoctorsMethod = HealthMonitoringServiceGrpc.getAlertDoctorsMethod) == null) {
      synchronized (HealthMonitoringServiceGrpc.class) {
        if ((getAlertDoctorsMethod = HealthMonitoringServiceGrpc.getAlertDoctorsMethod) == null) {
          HealthMonitoringServiceGrpc.getAlertDoctorsMethod = getAlertDoctorsMethod = 
              io.grpc.MethodDescriptor.<cw.HealthMonitoringService.PatientVitals, cw.HealthMonitoringService.AlertConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HealthMonitoringService.HealthMonitoringService", "AlertDoctors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.PatientVitals.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.AlertConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new HealthMonitoringServiceMethodDescriptorSupplier("AlertDoctors"))
                  .build();
          }
        }
     }
     return getAlertDoctorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cw.HealthMonitoringService.SafeVitalsRequest,
      cw.HealthMonitoringService.AllVitalsReply> getGetSafeVitalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSafeVitals",
      requestType = cw.HealthMonitoringService.SafeVitalsRequest.class,
      responseType = cw.HealthMonitoringService.AllVitalsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cw.HealthMonitoringService.SafeVitalsRequest,
      cw.HealthMonitoringService.AllVitalsReply> getGetSafeVitalsMethod() {
    io.grpc.MethodDescriptor<cw.HealthMonitoringService.SafeVitalsRequest, cw.HealthMonitoringService.AllVitalsReply> getGetSafeVitalsMethod;
    if ((getGetSafeVitalsMethod = HealthMonitoringServiceGrpc.getGetSafeVitalsMethod) == null) {
      synchronized (HealthMonitoringServiceGrpc.class) {
        if ((getGetSafeVitalsMethod = HealthMonitoringServiceGrpc.getGetSafeVitalsMethod) == null) {
          HealthMonitoringServiceGrpc.getGetSafeVitalsMethod = getGetSafeVitalsMethod = 
              io.grpc.MethodDescriptor.<cw.HealthMonitoringService.SafeVitalsRequest, cw.HealthMonitoringService.AllVitalsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HealthMonitoringService.HealthMonitoringService", "GetSafeVitals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.SafeVitalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cw.HealthMonitoringService.AllVitalsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HealthMonitoringServiceMethodDescriptorSupplier("GetSafeVitals"))
                  .build();
          }
        }
     }
     return getGetSafeVitalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthMonitoringServiceStub newStub(io.grpc.Channel channel) {
    return new HealthMonitoringServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthMonitoringServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthMonitoringServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HealthMonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPatientVitals(cw.HealthMonitoringService.PatientID request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.PatientVitals> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientVitalsMethod(), responseObserver);
    }

    /**
     */
    public void alertDoctors(cw.HealthMonitoringService.PatientVitals request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AlertConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertDoctorsMethod(), responseObserver);
    }

    /**
     */
    public void getSafeVitals(cw.HealthMonitoringService.SafeVitalsRequest request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AllVitalsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSafeVitalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPatientVitalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.HealthMonitoringService.PatientID,
                cw.HealthMonitoringService.PatientVitals>(
                  this, METHODID_GET_PATIENT_VITALS)))
          .addMethod(
            getAlertDoctorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.HealthMonitoringService.PatientVitals,
                cw.HealthMonitoringService.AlertConfirmation>(
                  this, METHODID_ALERT_DOCTORS)))
          .addMethod(
            getGetSafeVitalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cw.HealthMonitoringService.SafeVitalsRequest,
                cw.HealthMonitoringService.AllVitalsReply>(
                  this, METHODID_GET_SAFE_VITALS)))
          .build();
    }
  }

  /**
   */
  public static final class HealthMonitoringServiceStub extends io.grpc.stub.AbstractStub<HealthMonitoringServiceStub> {
    private HealthMonitoringServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthMonitoringServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthMonitoringServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPatientVitals(cw.HealthMonitoringService.PatientID request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.PatientVitals> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientVitalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alertDoctors(cw.HealthMonitoringService.PatientVitals request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AlertConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertDoctorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSafeVitals(cw.HealthMonitoringService.SafeVitalsRequest request,
        io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AllVitalsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSafeVitalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthMonitoringServiceBlockingStub extends io.grpc.stub.AbstractStub<HealthMonitoringServiceBlockingStub> {
    private HealthMonitoringServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthMonitoringServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthMonitoringServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cw.HealthMonitoringService.PatientVitals getPatientVitals(cw.HealthMonitoringService.PatientID request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientVitalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cw.HealthMonitoringService.AlertConfirmation alertDoctors(cw.HealthMonitoringService.PatientVitals request) {
      return blockingUnaryCall(
          getChannel(), getAlertDoctorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cw.HealthMonitoringService.AllVitalsReply getSafeVitals(cw.HealthMonitoringService.SafeVitalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSafeVitalsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthMonitoringServiceFutureStub extends io.grpc.stub.AbstractStub<HealthMonitoringServiceFutureStub> {
    private HealthMonitoringServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthMonitoringServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthMonitoringServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthMonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.HealthMonitoringService.PatientVitals> getPatientVitals(
        cw.HealthMonitoringService.PatientID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientVitalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.HealthMonitoringService.AlertConfirmation> alertDoctors(
        cw.HealthMonitoringService.PatientVitals request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertDoctorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cw.HealthMonitoringService.AllVitalsReply> getSafeVitals(
        cw.HealthMonitoringService.SafeVitalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSafeVitalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PATIENT_VITALS = 0;
  private static final int METHODID_ALERT_DOCTORS = 1;
  private static final int METHODID_GET_SAFE_VITALS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthMonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthMonitoringServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PATIENT_VITALS:
          serviceImpl.getPatientVitals((cw.HealthMonitoringService.PatientID) request,
              (io.grpc.stub.StreamObserver<cw.HealthMonitoringService.PatientVitals>) responseObserver);
          break;
        case METHODID_ALERT_DOCTORS:
          serviceImpl.alertDoctors((cw.HealthMonitoringService.PatientVitals) request,
              (io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AlertConfirmation>) responseObserver);
          break;
        case METHODID_GET_SAFE_VITALS:
          serviceImpl.getSafeVitals((cw.HealthMonitoringService.SafeVitalsRequest) request,
              (io.grpc.stub.StreamObserver<cw.HealthMonitoringService.AllVitalsReply>) responseObserver);
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

  private static abstract class HealthMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cw.HealthMonitoringService.MonitoringProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthMonitoringService");
    }
  }

  private static final class HealthMonitoringServiceFileDescriptorSupplier
      extends HealthMonitoringServiceBaseDescriptorSupplier {
    HealthMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class HealthMonitoringServiceMethodDescriptorSupplier
      extends HealthMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthMonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthMonitoringServiceFileDescriptorSupplier())
              .addMethod(getGetPatientVitalsMethod())
              .addMethod(getAlertDoctorsMethod())
              .addMethod(getGetSafeVitalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
