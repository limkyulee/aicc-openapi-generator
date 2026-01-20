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
 * RetrieveFwApplyTargetList1Request
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("retrieveFwApplyTargetList_1_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class RetrieveFwApplyTargetList1Request {

  
  @Schema(name = "svcCd", example = "T001", description = "서비스 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "deviceCd", example = "1", description = "디바이스 모델 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCd")
  private @Nullable String deviceCd;

  
  @Schema(name = "fwCd", example = "7", description = "펌웨어 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwCd")
  private @Nullable String fwCd;

}

