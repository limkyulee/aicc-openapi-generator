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
 * CreatePoaRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createPoa_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreatePoaRequest {

  
  @Schema(name = "svcSvrCd", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrCd")
  private @Nullable String svcSvrCd;

  
  @Schema(name = "entityId", example = "ASN_CSE-S-bfc7601bb7-V040", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "resourceNm", example = "ASN_CSE-S-bfc7601bb7-V040", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceNm")
  private @Nullable String resourceNm;

  
  @Schema(name = "poa", example = "http://192.168.2.131:8280", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poa")
  private @Nullable String poa;

  
  @Schema(name = "contentType", example = "JSON", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  private @Nullable String contentType;

}

