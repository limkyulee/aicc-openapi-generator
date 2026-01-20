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
 * DownloadTerminalListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("downloadTerminalList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class DownloadTerminalListRequest {

  
  @Schema(name = "esn", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("esn")
  private @Nullable String esn;

  
  @Schema(name = "entityId", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "ctn", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "serviceNm", example = "8383", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceNm")
  private @Nullable String serviceNm;

  
  @Schema(name = "deviceModel", example = "1-김혜빈제조사-디바이스모델1-2-3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceModel")
  private @Nullable String deviceModel;

  
  @Schema(name = "startDate", example = "2025-05-07", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  private @Nullable String startDate;

  
  @Schema(name = "endDate", example = "2025-05-08", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  private @Nullable String endDate;

}

