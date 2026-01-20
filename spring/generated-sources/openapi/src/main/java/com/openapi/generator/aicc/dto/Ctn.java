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
 * Ctn
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Ctn {

  
  @Schema(name = "ctn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctn")
  private @Nullable String ctn;

  
  @Schema(name = "entityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "fwVer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwVer")
  private @Nullable String fwVer;

  
  @Schema(name = "swVer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swVer")
  private @Nullable String swVer;

  
  @Schema(name = "svcCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "deviceCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCd")
  private @Nullable String deviceCd;

  
  @Schema(name = "fwStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwStatus")
  private @Nullable String fwStatus;

  
  @Schema(name = "swInstStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swInstStatus")
  private @Nullable String swInstStatus;

  
  @Schema(name = "swActStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swActStatus")
  private @Nullable String swActStatus;

  
  @Schema(name = "useYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useYn")
  private @Nullable String useYn;

  
  @Schema(name = "creDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creDt")
  private @Nullable String creDt;

  
  @Schema(name = "creUsr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creUsr")
  private @Nullable String creUsr;

  
  @Schema(name = "updDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updDt")
  private @Nullable String updDt;

  
  @Schema(name = "updUsr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updUsr")
  private @Nullable String updUsr;

  
  @Schema(name = "mac", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mac")
  private @Nullable String mac;

  
  @Schema(name = "swInst", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swInst")
  private @Nullable String swInst;

  
  @Schema(name = "swUninst", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swUninst")
  private @Nullable String swUninst;

  
  @Schema(name = "registered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registered")
  private @Nullable String registered;

}

