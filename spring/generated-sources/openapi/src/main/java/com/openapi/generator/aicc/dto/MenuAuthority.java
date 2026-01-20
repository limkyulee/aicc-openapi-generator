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
 * MenuAuthority
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class MenuAuthority {

  
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

  @NotNull 
  @Schema(name = "rolNm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rolNm")
  private String rolNm;

  @NotNull 
  @Schema(name = "menuId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("menuId")
  private String menuId;

  
  @Schema(name = "menuNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuNm")
  private @Nullable String menuNm;

  
  @Schema(name = "menuUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuUrl")
  private @Nullable String menuUrl;

  
  @Schema(name = "menuOrd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuOrd")
  private @Nullable String menuOrd;

  
  @Schema(name = "mdlCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdlCd")
  private @Nullable String mdlCd;

  
  @Schema(name = "mdlNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdlNm")
  private @Nullable String mdlNm;

  @NotNull 
  @Schema(name = "authYn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("authYn")
  private String authYn;

  public MenuAuthority() {
    super();
  }

}

