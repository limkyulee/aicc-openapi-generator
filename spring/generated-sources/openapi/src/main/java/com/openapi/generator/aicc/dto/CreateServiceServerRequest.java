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
 * CreateServiceServerRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createServiceServer_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateServiceServerRequest {

  
  @Schema(name = "svcSvrNm", example = "테스트 서비스 서버", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrNm")
  private @Nullable String svcSvrNm;

  
  @Schema(name = "svcSvrType", example = "asn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrType")
  private @Nullable String svcSvrType;

  
  @Schema(name = "svcCd", example = "TEST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "expireDuration", example = "999", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireDuration")
  private @Nullable String expireDuration;

  
  @Schema(name = "expireUnit", example = "YR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireUnit")
  private @Nullable String expireUnit;

}

