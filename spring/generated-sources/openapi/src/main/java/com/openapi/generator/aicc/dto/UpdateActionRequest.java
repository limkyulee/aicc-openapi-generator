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
 * UpdateActionRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("updateAction_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UpdateActionRequest {

  
  @Schema(name = "menuId", example = "", description = "메뉴 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuId")
  private @Nullable String menuId;

  
  @Schema(name = "actionId", example = "", description = "액션 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actionId")
  private @Nullable String actionId;

  
  @Schema(name = "actionNm", example = "", description = "액션명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actionNm")
  private @Nullable String actionNm;

  
  @Schema(name = "actionUrl", example = "", description = "액션 URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actionUrl")
  private @Nullable String actionUrl;

}

