package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LogLevel
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class LogLevel {

  
  @Schema(name = "server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("server")
  private @Nullable String server;

  
  @Schema(name = "currentTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentTypes")
  @Valid
  private List<String> currentTypes = new ArrayList<>();

  
  @Schema(name = "applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applied")
  private @Nullable Boolean applied;

}

