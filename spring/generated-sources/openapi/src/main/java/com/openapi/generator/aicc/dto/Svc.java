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
 * Svc
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Svc {

  
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

  @NotNull @Pattern(regexp = "^$|^[0-9]+$") 
  @Schema(name = "cmpCd", description = "회사 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cmpCd")
  private String cmpCd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "svcNm", description = "서비스명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcNm")
  private String svcNm;

  @NotNull @Pattern(regexp = "^$|^[A-Za-z0-9]{4}$") @Size(min = 4, max = 4) 
  @Schema(name = "svcCd", description = "서비스 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcCd")
  private String svcCd;

  @Size(min = 0, max = 150) 
  @Schema(name = "svcDesc", description = "서비스 설명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcDesc")
  private @Nullable String svcDesc;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "anPref", description = "망 우선순위", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anPref")
  private String anPref;

  @NotNull @Pattern(regexp = "^[0-9]+$") 
  @Schema(name = "expireDuration", description = "만료 기간", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expireDuration")
  private String expireDuration;

  @NotNull @Size(min = 0, max = 7) 
  @Schema(name = "expireUnit", description = "만료 단위", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expireUnit")
  private String expireUnit;

  
  @Schema(name = "authYn", description = "인증 허용/해제 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authYn")
  private @Nullable String authYn;

  
  @Schema(name = "cmpNm", example = "abacus", description = "회사명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpNm")
  private @Nullable String cmpNm;

  public Svc() {
    super();
  }

}

