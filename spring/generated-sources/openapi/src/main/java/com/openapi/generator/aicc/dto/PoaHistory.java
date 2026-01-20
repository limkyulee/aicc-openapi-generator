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
 * PoaHistory
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class PoaHistory {

  
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

  
  @Schema(name = "rolNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolNm")
  private @Nullable String rolNm;

  
  @Schema(name = "seq", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seq")
  private @Nullable String seq;

  @NotNull 
  @Schema(name = "entityId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entityId")
  private String entityId;

  
  @Schema(name = "poa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poa")
  private @Nullable String poa;

  
  @Schema(name = "svcCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "poaStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poaStatus")
  private @Nullable String poaStatus;

  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  private @Nullable String contentType;

  
  @Schema(name = "creType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creType")
  private @Nullable String creType;

  
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("origin")
  private @Nullable String origin;

  
  @Schema(name = "resourceNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceNm")
  private @Nullable String resourceNm;

  public PoaHistory() {
    super();
  }

}

