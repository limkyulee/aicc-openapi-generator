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
 * UnregisterTerminal
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UnregisterTerminal {

  
  @Schema(name = "decryptCtn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decryptCtn")
  private @Nullable String decryptCtn;

  
  @Schema(name = "deviceSerialNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSerialNo")
  private @Nullable String deviceSerialNo;

  
  @Schema(name = "serviceCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceCode")
  private @Nullable String serviceCode;

  
  @Schema(name = "deviceModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceModel")
  private @Nullable String deviceModel;

  
  @Schema(name = "expireTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireTime")
  private @Nullable String expireTime;

  
  @Schema(name = "creDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creDt")
  private @Nullable String creDt;

}

