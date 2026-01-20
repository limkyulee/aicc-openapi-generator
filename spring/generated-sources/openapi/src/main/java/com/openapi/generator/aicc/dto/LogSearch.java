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
 * LogSearch
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class LogSearch {

  
  @Schema(name = "logs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs")
  private @Nullable String logs;

  
  @Schema(name = "filePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filePath")
  private @Nullable String filePath;

  
  @Schema(name = "currentPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable Integer currentPage;

  
  @Schema(name = "totalPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPage")
  private @Nullable Integer totalPage;

}

