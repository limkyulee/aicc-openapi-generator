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
 * FotaScheduleTargetTerminal
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FotaScheduleTargetTerminal {

  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  private @Nullable Integer id;

  
  @Schema(name = "scheduleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleId")
  private @Nullable Integer scheduleId;

  
  @Schema(name = "entityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "ctn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "mac", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mac")
  private @Nullable String mac;

  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  private @Nullable String status;

  
  @Schema(name = "registered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registered")
  private @Nullable String registered;

  
  @Schema(name = "firmwareName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firmwareName")
  private @Nullable String firmwareName;

  
  @Schema(name = "firmwareVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firmwareVersion")
  private @Nullable String firmwareVersion;

  
  @Schema(name = "firmwareCurrentVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firmwareCurrentVersion")
  private @Nullable String firmwareCurrentVersion;

}

