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
 * RetrieveStatisticsListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveStatisticsList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveStatisticsListRequest {

  
  @Schema(name = "searchType", example = "D", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchType")
  private @Nullable String searchType;

  
  @Schema(name = "serverType", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverType")
  private @Nullable String serverType;

  
  @Schema(name = "resType", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resType")
  private @Nullable String resType;

  
  @Schema(name = "searchDate", example = "2025-09-10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchDate")
  private @Nullable String searchDate;

  
  @Schema(name = "keyword", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword")
  private @Nullable String keyword;

  
  @Schema(name = "standard", example = "TOTAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standard")
  private @Nullable String standard;

  
  @Schema(name = "value", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  private @Nullable String value;

  
  @Schema(name = "valueType", example = "GT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueType")
  private @Nullable String valueType;

  
  @Schema(name = "orderType", example = "ASC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderType")
  private @Nullable String orderType;

  
  @Schema(name = "currentPage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable String currentPage;

  
  @Schema(name = "limit", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable String limit;

}

