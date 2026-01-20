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
 * RetrieveFotaScheduleListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveFotaScheduleList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveFotaScheduleListRequest {

  
  @Schema(name = "svcCdSeq", example = "0OTA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCdSeq")
  private @Nullable String svcCdSeq;

  
  @Schema(name = "deviceCdSeq", example = "176", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCdSeq")
  private @Nullable String deviceCdSeq;

  
  @Schema(name = "fwType", example = "D", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwType")
  private @Nullable String fwType;

  
  @Schema(name = "scheduleType", example = "PUSH", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleType")
  private @Nullable String scheduleType;

  
  @Schema(name = "startDate", example = "2025-05-07", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  private @Nullable String startDate;

  
  @Schema(name = "endDate", example = "2025-05-08", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  private @Nullable String endDate;

  
  @Schema(name = "sidx", example = "creDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sidx")
  private @Nullable String sidx;

  
  @Schema(name = "sord", example = "desc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sord")
  private @Nullable String sord;

  
  @Schema(name = "currentPage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable String currentPage;

  
  @Schema(name = "limit", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable String limit;

}

