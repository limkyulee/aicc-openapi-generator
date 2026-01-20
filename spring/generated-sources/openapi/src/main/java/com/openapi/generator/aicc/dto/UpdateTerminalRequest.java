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
 * UpdateTerminalRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("updateTerminal_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UpdateTerminalRequest {

  
  @Schema(name = "uuid", example = "1e96b6d6-5139-3400-9583-a4d7c2c18bd4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  private @Nullable String uuid;

  
  @Schema(name = "exceptionType", example = "C", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptionType")
  private @Nullable String exceptionType;

  
  @Schema(name = "posCd", example = "4312069379", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posCd")
  private @Nullable String posCd;

  
  @Schema(name = "subPos", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subPos")
  private @Nullable String subPos;

  
  @Schema(name = "svcCd", example = "1OTA,8383", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "serviceAuthYn", example = "Y,Y", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceAuthYn")
  private @Nullable String serviceAuthYn;

  
  @Schema(name = "esn", example = "8982067512001136000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("esn")
  private @Nullable String esn;

}

