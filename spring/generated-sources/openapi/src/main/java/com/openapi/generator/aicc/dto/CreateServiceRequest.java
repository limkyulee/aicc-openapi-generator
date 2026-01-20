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
 * CreateServiceRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createService_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateServiceRequest {

  
  @Schema(name = "cmpCd", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpCd")
  private @Nullable String cmpCd;

  
  @Schema(name = "svcNm", example = "테스트 서비스", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  
  @Schema(name = "svcCd", example = "ABC1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "svcDesc", example = "테스트 서비스 입니다.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcDesc")
  private @Nullable String svcDesc;

  
  @Schema(name = "anPref", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anPref")
  private @Nullable String anPref;

  
  @Schema(name = "expireDuration", example = "999", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireDuration")
  private @Nullable String expireDuration;

  
  @Schema(name = "expireUnit", example = "YR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireUnit")
  private @Nullable String expireUnit;

}

