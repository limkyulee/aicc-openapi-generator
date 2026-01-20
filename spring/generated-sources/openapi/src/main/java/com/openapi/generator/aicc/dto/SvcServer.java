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
 * SvcServer
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class SvcServer {

  
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
  @Schema(name = "svcSvrCd", description = "서비스 서버 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcSvrCd")
  private String svcSvrCd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "svcSvrNm", description = "서버 명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcSvrNm")
  private String svcSvrNm;

  @NotNull @Size(min = 0, max = 4) 
  @Schema(name = "svcCd", example = "TEST", description = "서비스 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcCd")
  private String svcCd;

  @NotNull @Size(min = 0, max = 10) 
  @Schema(name = "svcSvrType", description = "서비스 서버 타입", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcSvrType")
  private String svcSvrType;

  @NotNull @Pattern(regexp = "^[0-9]+$") 
  @Schema(name = "expireDuration", description = "만료 기간", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expireDuration")
  private String expireDuration;

  @NotNull @Size(min = 0, max = 7) 
  @Schema(name = "expireUnit", description = "만료 단위", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expireUnit")
  private String expireUnit;

  
  @Schema(name = "svcSvrNum", description = "서비스 서버 번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrNum")
  private Integer svcSvrNum = 1;

  
  @Schema(name = "poa", example = "192.168.1.0", description = "POA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poa")
  private @Nullable String poa;

  
  @Schema(name = "contentType", example = "json", description = "TYPE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  private @Nullable String contentType;

  @Size(min = 0, max = 1) 
  @Schema(name = "uplusYn", description = "UPLUS 서버 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uplusYn")
  private String uplusYn = "Y";

  
  @Schema(name = "svcNm", example = "테스트 서비스", description = "서비스 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  
  @Schema(name = "svcSvrEntityId", example = "MN_CSE-S-51f72f5d94-NAMI", description = "서비스 서버 인증번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcSvrEntityId")
  private @Nullable String svcSvrEntityId;

  
  @Schema(name = "uuid", example = "51f72b7f-dd71-3373-8a82-b2b97d8f5d94", description = "UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  private @Nullable String uuid;

  public SvcServer() {
    super();
  }

}

