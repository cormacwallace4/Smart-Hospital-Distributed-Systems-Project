// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthMonitoringService.proto

package cw.HealthMonitoringService;

public interface PatientVitalsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HealthMonitoringService.PatientVitals)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string patient_id = 1;</code>
   */
  java.lang.String getPatientId();
  /**
   * <code>string patient_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getPatientIdBytes();

  /**
   * <code>double heart_rate = 2;</code>
   */
  double getHeartRate();

  /**
   * <code>double blood_pressure = 3;</code>
   */
  double getBloodPressure();

  /**
   * <code>double temperature = 4;</code>
   */
  double getTemperature();
}
