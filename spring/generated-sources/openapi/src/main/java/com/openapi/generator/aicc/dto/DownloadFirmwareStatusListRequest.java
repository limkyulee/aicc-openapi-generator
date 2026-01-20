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
 * DownloadFirmwareStatusListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("downloadFirmwareStatusList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class DownloadFirmwareStatusListRequest {

  
  @Schema(name = "svcCd", example = "LK01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "deviceCd", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCd")
  private @Nullable String deviceCd;

  
  @Schema(name = "systemType", example = "D", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemType")
  private @Nullable String systemType;

  
  @Schema(name = "fwVer", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwVer")
  private @Nullable String fwVer;

  
  @Schema(name = "ctn", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "deviceSerialNo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSerialNo")
  private @Nullable String deviceSerialNo;

  
  @Schema(name = "currentPage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable String currentPage;

  
  @Schema(name = "limit", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable String limit;

}

