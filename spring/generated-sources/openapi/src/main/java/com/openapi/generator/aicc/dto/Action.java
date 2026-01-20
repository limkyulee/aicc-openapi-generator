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
 * Action
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Action {

  
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
  @Schema(name = "actionId", description = "액션 ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actionId")
  private String actionId;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "actionNm", description = "액션 명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actionNm")
  private String actionNm;

  @NotNull @Size(min = 0, max = 150) 
  @Schema(name = "actionUrl", description = "액션 URL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actionUrl")
  private String actionUrl;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "menuId", description = "메뉴 ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("menuId")
  private String menuId;

  public Action() {
    super();
  }

}

