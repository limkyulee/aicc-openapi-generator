package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.generator.aicc.dto.MenuAuthority;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MenuAuthorityList
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class MenuAuthorityList {

  
  @Schema(name = "currentPage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable Integer currentPage;

  
  @Schema(name = "limit", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable Integer limit;

  @NotNull @Valid 
  @Schema(name = "startDate", example = "2025-05-05", description = "검색 시작일", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @NotNull @Valid 
  @Schema(name = "endDate", example = "2025-05-08", description = "검색 종료일", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  
  @Schema(name = "list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("list")
  @Valid
  private List<@Valid MenuAuthority> _list = new ArrayList<>();

  
  @Schema(name = "totalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCount")
  private @Nullable Integer totalCount;

  public MenuAuthorityList() {
    super();
  }

}

