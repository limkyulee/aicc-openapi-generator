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
 * RetrieveStatisticsChartRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveStatisticsChart_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveStatisticsChartRequest {

  
  @Schema(name = "serverType", example = "MEF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverType")
  private @Nullable String serverType;

  
  @Schema(name = "resType", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resType")
  private @Nullable String resType;

  
  @Schema(name = "searchDate", example = "2025-09-08", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchDate")
  private @Nullable String searchDate;

  
  @Schema(name = "serviceCd", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceCd")
  private @Nullable String serviceCd;

  
  @Schema(name = "entityId", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "ctn", example = "01278978989", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "chartType", example = "recentlyTenDaySuccessCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chartType")
  private @Nullable String chartType;

}

