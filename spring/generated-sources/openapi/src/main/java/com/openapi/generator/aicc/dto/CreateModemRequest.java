package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateModemRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createModem_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateModemRequest {

  
  @Schema(name = "cmpCd", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpCd")
  private @Nullable String cmpCd;

  
  @Schema(name = "modemNm", example = "테스트 모듈 모델", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemNm")
  private @Nullable String modemNm;

  
  @Schema(name = "modemManu", example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemManu")
  private @Nullable String modemManu;

  
  @Schema(name = "modemEmail", example = "test@test.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemEmail")
  private @Nullable String modemEmail;

  
  @Schema(name = "anTypeList", example = "[\"10\",\"10000000\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anTypeList")
  @Valid
  private List<String> anTypeList = new ArrayList<>();

}

