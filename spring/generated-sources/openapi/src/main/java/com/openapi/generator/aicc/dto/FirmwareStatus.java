package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FirmwareStatus
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FirmwareStatus {

  
  @Schema(name = "entityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  
  @Schema(name = "fwCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwCd")
  private @Nullable String fwCd;

  
  @Schema(name = "fwNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwNm")
  private @Nullable String fwNm;

  
  @Schema(name = "svcCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "svcNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  
  @Schema(name = "deviceCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCd")
  private @Nullable String deviceCd;

  
  @Schema(name = "deviceNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceNm")
  private @Nullable String deviceNm;

  
  @Schema(name = "fwVer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwVer")
  private @Nullable String fwVer;

  
  @Schema(name = "betaVerYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaVerYn")
  private @Nullable String betaVerYn;

  
  @Schema(name = "mdn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdn")
  private @Nullable String mdn;

  
  @Schema(name = "updDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updDt")
  private @Nullable String updDt;

  
  @Schema(name = "systemType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemType")
  private @Nullable String systemType;

  
  @Schema(name = "fwAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwAction")
  private @Nullable String fwAction;

  
  @Schema(name = "fwStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwStatus")
  private @Nullable String fwStatus;

  
  @Schema(name = "mac", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mac")
  private @Nullable String mac;

}

