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
 * CommonCode
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CommonCode {

  
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

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "grpCd", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grpCd")
  private String grpCd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "cmmCd", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cmmCd")
  private String cmmCd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "cmmNm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cmmNm")
  private String cmmNm;

  @NotNull @Size(min = 0, max = 100) 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comment")
  private String comment;

  public CommonCode() {
    super();
  }

}

