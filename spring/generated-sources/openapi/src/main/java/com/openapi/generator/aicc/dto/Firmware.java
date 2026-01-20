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
 * Firmware
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Firmware {

  
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

  @NotNull 
  @Schema(name = "fwCd", example = "9600", description = "펌웨어 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fwCd")
  private String fwCd;

  @Size(min = 0, max = 50) 
  @Schema(name = "fwNm", example = "merged.xml", description = "펌웨어 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwNm")
  private @Nullable String fwNm;

  @NotNull @Size(min = 0, max = 4) 
  @Schema(name = "svcCd", example = "0078", description = "서비스 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcCd")
  private String svcCd;

  
  @Schema(name = "svcNm", example = "0078", description = "서비스 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  @NotNull 
  @Schema(name = "deviceCd", example = "561", description = "디바이스 모델 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceCd")
  private String deviceCd;

  
  @Schema(name = "deviceNm", example = "CG-GW100", description = "디바이스 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceNm")
  private @Nullable String deviceNm;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "fwVer", example = "1.0.0", description = "펌웨어 버전", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fwVer")
  private String fwVer;

  
  @Schema(name = "lastFwVer", example = "2.0.0", description = "최상위 펌웨어 버전 - 상세 조회를 위한 값", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastFwVer")
  private @Nullable String lastFwVer;

  
  @Schema(name = "fwFilePath", example = "/mawp/firmware/0078/56/1.0.0", description = "펌웨어 파일 경로", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwFilePath")
  private @Nullable String fwFilePath;

  
  @Schema(name = "fwSize", example = "3297862", description = "펌웨어 파일 크기", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwSize")
  private @Nullable String fwSize;

  @Size(min = 0, max = 100) 
  @Schema(name = "fwApplyTarget", description = "펌웨어 적용 대상", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwApplyTarget")
  private @Nullable String fwApplyTarget;

  @NotNull @Size(min = 0, max = 150) 
  @Schema(name = "fwDesc", description = "펌웨어 설명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fwDesc")
  private String fwDesc;

  @NotNull @Size(min = 0, max = 1) 
  @Schema(name = "betaVerYn", description = "베타버전여부", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("betaVerYn")
  private String betaVerYn;

  
  @Schema(name = "reqYn", description = "업데이트 요청 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reqYn")
  private @Nullable String reqYn;

  
  @Schema(name = "ctnList", description = "ctn목록", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctnList")
  private @Nullable String ctnList;

  
  @Schema(name = "ctnCount", description = "ctn 수", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctnCount")
  private @Nullable Integer ctnCount;

  
  @Schema(name = "fwChecksum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwChecksum")
  private @Nullable String fwChecksum;

  public Firmware() {
    super();
  }

}

