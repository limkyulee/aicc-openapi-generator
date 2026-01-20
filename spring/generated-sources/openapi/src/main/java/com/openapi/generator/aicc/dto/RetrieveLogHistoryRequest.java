package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.openapi.generator.aicc.dto.RetrieveLogHistoryRequestStartDateTime;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RetrieveLogHistoryRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveLogHistory_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveLogHistoryRequest {

  
  @Schema(name = "serverType", example = "lbk", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverType")
  private @Nullable String serverType;

  
  @Schema(name = "searchType", example = "ctn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchType")
  private @Nullable String searchType;

  
  @Schema(name = "keyword", example = "01012341234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword")
  private @Nullable String keyword;

  @Valid 
  @Schema(name = "startDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateTime")
  private @Nullable RetrieveLogHistoryRequestStartDateTime startDateTime;

  @Valid 
  @Schema(name = "endDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateTime")
  private @Nullable RetrieveLogHistoryRequestStartDateTime endDateTime;

  
  @Schema(name = "currentPage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private String currentPage = null;

  
  @Schema(name = "limit", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private String limit = null;

  
  @Schema(name = "filePath", example = "merged/4222a5e2-442c-4da4-8a16-b3f8af38d8f9.csv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filePath")
  private @Nullable String filePath;

}

