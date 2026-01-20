package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateFotaScheduleRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("updateFotaSchedule_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UpdateFotaScheduleRequest {

  
  @Schema(name = "id", example = "730", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  private @Nullable String id;

  
  @Schema(name = "nm", example = "abacus-schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nm")
  private @Nullable String nm;

  
  @Schema(name = "svcCdSeq", example = "1OTA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCdSeq")
  private @Nullable String svcCdSeq;

  
  @Schema(name = "deviceCdSeq", example = "176", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCdSeq")
  private @Nullable String deviceCdSeq;

  
  @Schema(name = "fwCdSeq", example = "6317", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwCdSeq")
  private @Nullable String fwCdSeq;

  
  @Schema(name = "startDt", example = "2025-07-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDt")
  private @Nullable String startDt;

  
  @Schema(name = "endDt", example = "2025-07-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDt")
  private @Nullable String endDt;

  
  @Schema(name = "startTime", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  private @Nullable String startTime;

  
  @Schema(name = "endTime", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  private @Nullable String endTime;

  
  @Schema(name = "deviceList", example = "[{\"entityId\":\"ASN_CSE-D-e44d89f038-1OTA\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceList")
  private @Nullable String deviceList;

  
  @Schema(name = "serviceList", example = "[{\"svcCdSeq\":\"1OTA\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceList")
  private @Nullable String serviceList;

}

