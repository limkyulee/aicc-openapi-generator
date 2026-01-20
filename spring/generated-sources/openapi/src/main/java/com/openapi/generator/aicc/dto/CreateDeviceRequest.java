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
 * CreateDeviceRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createDevice_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateDeviceRequest {

  
  @Schema(name = "cmpCd", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpCd")
  private @Nullable String cmpCd;

  
  @Schema(name = "deviceNm", example = "테스트 디바이스 모델", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceNm")
  private @Nullable String deviceNm;

  
  @Schema(name = "deviceManu", example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceManu")
  private @Nullable String deviceManu;

  
  @Schema(name = "deviceEmail", example = "test@test.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceEmail")
  private @Nullable String deviceEmail;

  
  @Schema(name = "modemCd", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemCd")
  private @Nullable String modemCd;

  
  @Schema(name = "deviceType", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceType")
  private @Nullable String deviceType;

  
  @Schema(name = "anTypeList", example = "[\"10\",\"10000000\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anTypeList")
  private @Nullable String anTypeList;

}

