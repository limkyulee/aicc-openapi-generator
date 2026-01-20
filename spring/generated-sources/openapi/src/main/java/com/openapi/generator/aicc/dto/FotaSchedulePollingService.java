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
 * FotaSchedulePollingService
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FotaSchedulePollingService {

  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  private @Nullable Integer id;

  
  @Schema(name = "scheduleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleId")
  private @Nullable Integer scheduleId;

  
  @Schema(name = "svcCdSeq", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCdSeq")
  private @Nullable String svcCdSeq;

  
  @Schema(name = "svcNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  
  @Schema(name = "anPref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anPref")
  private @Nullable String anPref;

}

