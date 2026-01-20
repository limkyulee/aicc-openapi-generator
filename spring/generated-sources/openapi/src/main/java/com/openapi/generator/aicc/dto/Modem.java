package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Modem
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Modem {

  
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

  @NotNull @Pattern(regexp = "^[0-9]+$") 
  @Schema(name = "modemCd", description = "모듈 모델 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modemCd")
  private String modemCd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "modemNm", description = "모듈 모델명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modemNm")
  private String modemNm;

  @NotNull @Pattern(regexp = "^$|^[0-9]+$") 
  @Schema(name = "cmpCd", description = "회사 코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cmpCd")
  private String cmpCd;

  
  @Schema(name = "cmpNm", description = "회사명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpNm")
  private @Nullable String cmpNm;

  
  @Schema(name = "anTypeList", example = "[10,10000000]", description = "사용망 리스트 (화면표시를위한가공데이터)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anTypeList")
  @Valid
  private List<String> anTypeList = new ArrayList<>();

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "modemManu", example = "manager", description = "담당자", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modemManu")
  private String modemManu;

  @NotNull @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$") @Size(min = 0, max = 50) 
  @Schema(name = "modemEmail", example = "manager@abacus.com", description = "담당자 이메일", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modemEmail")
  private String modemEmail;

  
  @Schema(name = "anType", example = "10000010", description = "사용망", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anType")
  private @Nullable String anType;

  public Modem() {
    super();
  }

}

