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
 * RetrieveUserListRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveUserList_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveUserListRequest {

  @Valid 
  @Schema(name = "currentPage", example = "1", description = "현재 페이지", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  private @Nullable BigDecimal currentPage;

  @Valid 
  @Schema(name = "limit", example = "10", description = "제한", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  private @Nullable BigDecimal limit;

  
  @Schema(name = "startDate", example = "", description = "시작일", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  private @Nullable String startDate;

  
  @Schema(name = "endDate", example = "", description = "종료일", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  private @Nullable String endDate;

  
  @Schema(name = "cmpNm", example = "", description = "회사명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpNm")
  private @Nullable String cmpNm;

  
  @Schema(name = "usrNm", example = "", description = "이름", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrNm")
  private @Nullable String usrNm;

  
  @Schema(name = "usrId", example = "", description = "ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrId")
  private @Nullable String usrId;

}

