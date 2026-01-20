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
 * UpdateFirmwareRequestRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("updateFirmwareRequest_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class UpdateFirmwareRequestRequest {

  
  @Schema(name = "fwCd", example = "9600", description = "펌웨어 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwCd")
  private @Nullable String fwCd;

  
  @Schema(name = "entityIds", example = "ASN_CSE-D-2edaf69c73-LK01,ASN_CSE-D-2edaf69c39-LK01", description = "entityId 목록", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityIds")
  private @Nullable String entityIds;

  
  @Schema(name = "fwVer", example = "1.0.0", description = "업데이트 펌웨어 버전", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwVer")
  private @Nullable String fwVer;

}

