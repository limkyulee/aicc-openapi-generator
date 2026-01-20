package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RetrieveMenuAuthorityListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveMenuAuthorityList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveMenuAuthorityListRequest {

  @Valid 
  @Schema(name = "currentPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable BigDecimal currentPage;

  @Valid 
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable BigDecimal limit;

  
  @Schema(name = "sidx", example = "rolNm", description = "정렬 기준 필드명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sidx")
  private @Nullable String sidx;

  
  @Schema(name = "sord", example = "desc", description = "정렬 방향", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sord")
  private @Nullable String sord;

  
  @Schema(name = "menuId", example = "DM001", description = "메뉴 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("menuId")
  private @Nullable String menuId;

}

