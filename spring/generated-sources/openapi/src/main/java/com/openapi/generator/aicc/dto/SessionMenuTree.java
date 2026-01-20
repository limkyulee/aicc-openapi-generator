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
 * SessionMenuTree
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class SessionMenuTree {

  
  @Schema(name = "menuId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuId")
  private @Nullable String menuId;

  
  @Schema(name = "menuNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuNm")
  private @Nullable String menuNm;

  
  @Schema(name = "menuUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuUrl")
  private @Nullable String menuUrl;

  
  @Schema(name = "headerMenuYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headerMenuYn")
  private @Nullable String headerMenuYn;

  
  @Schema(name = "menuOrd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuOrd")
  private @Nullable String menuOrd;

}

