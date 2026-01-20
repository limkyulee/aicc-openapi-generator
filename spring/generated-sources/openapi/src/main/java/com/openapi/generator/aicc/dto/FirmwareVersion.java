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
 * FirmwareVersion
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FirmwareVersion {

  
  @Schema(name = "useYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useYn")
  private @Nullable String useYn;

  
  @Schema(name = "creDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creDt")
  private @Nullable String creDt;

  
  @Schema(name = "creUsr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creUsr")
  private @Nullable String creUsr;

  
  @Schema(name = "updDt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updDt")
  private @Nullable String updDt;

  
  @Schema(name = "updUsr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updUsr")
  private @Nullable String updUsr;

  
  @Schema(name = "rolNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolNm")
  private @Nullable String rolNm;

  
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

  
  @Schema(name = "lastFwVer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastFwVer")
  private @Nullable String lastFwVer;

  
  @Schema(name = "fwFilePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwFilePath")
  private @Nullable String fwFilePath;

  
  @Schema(name = "fwSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwSize")
  private @Nullable String fwSize;

  
  @Schema(name = "fwApplyTarget", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwApplyTarget")
  private @Nullable String fwApplyTarget;

  
  @Schema(name = "fwDesc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwDesc")
  private @Nullable String fwDesc;

  
  @Schema(name = "betaVerYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaVerYn")
  private @Nullable String betaVerYn;

  
  @Schema(name = "reqYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reqYn")
  private @Nullable String reqYn;

  
  @Schema(name = "ctnList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctnList")
  private @Nullable String ctnList;

  
  @Schema(name = "successCnt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successCnt")
  private @Nullable Integer successCnt;

  
  @Schema(name = "failCnt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failCnt")
  private @Nullable Integer failCnt;

  
  @Schema(name = "inprogressCnt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inprogressCnt")
  private @Nullable Integer inprogressCnt;

  
  @Schema(name = "fwChecksum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwChecksum")
  private @Nullable String fwChecksum;

}

