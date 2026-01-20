package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateMenuRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("updateMenu_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UpdateMenuRequest {

  
  @Schema(name = "menuId", example = "", description = "메뉴 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuId")
  private @Nullable String menuId;

  
  @Schema(name = "menuNm", example = "", description = "메뉴명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuNm")
  private @Nullable String menuNm;

  
  @Schema(name = "menuUrl", example = "", description = "메뉴 URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuUrl")
  private @Nullable String menuUrl;

  
  @Schema(name = "mdlCd", example = "", description = "모듈 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdlCd")
  private @Nullable String mdlCd;

  
  @Schema(name = "headerMenuYn", example = "Y", description = "헤더 메뉴 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headerMenuYn")
  private @Nullable String headerMenuYn;

  
  @Schema(name = "menuOrd", example = "100", description = "메뉴 순서", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuOrd")
  private @Nullable String menuOrd;

}

