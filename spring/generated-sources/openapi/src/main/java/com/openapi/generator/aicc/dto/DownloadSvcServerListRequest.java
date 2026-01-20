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
 * DownloadSvcServerListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("downloadSvcServerList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class DownloadSvcServerListRequest {

  
  @Schema(name = "svcSvrNm", example = "TEST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrNm")
  private @Nullable String svcSvrNm;

  
  @Schema(name = "svcCd", example = "TEST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "startDate", example = "2025-12-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  private @Nullable String startDate;

  
  @Schema(name = "endDate", example = "2025-12-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  private @Nullable String endDate;

  
  @Schema(name = "sidx", example = "creDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sidx")
  private @Nullable String sidx;

  
  @Schema(name = "sord", example = "desc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sord")
  private @Nullable String sord;

}

