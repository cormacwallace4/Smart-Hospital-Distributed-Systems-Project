// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BedManagementService.proto

package cw.BedManagementService;

public interface BedAssignmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BedManagementService.BedAssignmentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>string assigned_patient_name = 2;</code>
   */
  java.lang.String getAssignedPatientName();
  /**
   * <code>string assigned_patient_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssignedPatientNameBytes();

  /**
   * <code>int32 bed_id = 3;</code>
   */
  int getBedId();
}
