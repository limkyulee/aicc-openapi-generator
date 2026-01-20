package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Statistics
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Statistics {

  
  @Schema(name = "serviceCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceCd")
  private @Nullable String serviceCd;

  
  @Schema(name = "entityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "ctn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "dailyTotalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailyTotalCount")
  private @Nullable String dailyTotalCount;

  
  @Schema(name = "dailySuccessCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailySuccessCount")
  private @Nullable String dailySuccessCount;

  
  @Schema(name = "dailyFailCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailyFailCount")
  private @Nullable String dailyFailCount;

  
  @Schema(name = "dailySuccessRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailySuccessRate")
  private @Nullable String dailySuccessRate;

  
  @Schema(name = "recentlyTenDayTotalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDayTotalCount")
  private @Nullable String recentlyTenDayTotalCount;

  
  @Schema(name = "recentlyTenDayTotalRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDayTotalRate")
  private @Nullable String recentlyTenDayTotalRate;

  
  @Schema(name = "recentlyTenDaySuccessCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDaySuccessCount")
  private @Nullable String recentlyTenDaySuccessCount;

  
  @Schema(name = "recentlyTenDaySuccessRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDaySuccessRate")
  private @Nullable String recentlyTenDaySuccessRate;

  
  @Schema(name = "recentlyTenDayFailCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDayFailCount")
  private @Nullable String recentlyTenDayFailCount;

  
  @Schema(name = "recentlyTenDayFailRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recentlyTenDayFailRate")
  private @Nullable String recentlyTenDayFailRate;

}

