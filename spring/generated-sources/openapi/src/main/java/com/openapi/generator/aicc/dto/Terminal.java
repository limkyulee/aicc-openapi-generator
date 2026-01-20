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
 * Terminal
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Terminal {

  
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

  @NotNull @Size(min = 0, max = 36) 
  @Schema(name = "uuid", example = "05256a91-cfcb-37a1-92ff-3ca5d0875ef2", description = "식별자", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uuid")
  private String uuid;

  
  @Schema(name = "entityId", example = "ASN_CSE", description = "엔티티ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  private @Nullable String entityId;

  @NotNull @Size(min = 0, max = 1) 
  @Schema(name = "terminalType", example = "M", description = "터미널 타입 단말의 유선/무선 구분 C:유선 M:무선", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("terminalType")
  private String terminalType;

  
  @Schema(name = "mdn", example = "01014785236", description = "mdn 무선 필수 값, 유선 값 없음", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdn")
  private @Nullable String mdn;

  
  @Schema(name = "mac", description = "유선 일 시만 사용, 없을 수 있음", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mac")
  private @Nullable String mac;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "deviceSerialNo", example = "00212000331", description = "단말의 serial number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceSerialNo")
  private String deviceSerialNo;

  @NotNull @Size(min = 0, max = 4) 
  @Schema(name = "svcCd", example = "A001", description = "서비스코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("svcCd")
  private String svcCd;

  @NotNull @Size(min = 0, max = 10) 
  @Schema(name = "posCd", example = "4312069379", description = "Pos코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("posCd")
  private String posCd;

  @Size(min = 0, max = 10) 
  @Schema(name = "subPos", description = "sub Pos코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subPos")
  private @Nullable String subPos;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "modemModel", description = "모뎀 모델 명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modemModel")
  private String modemModel;

  
  @Schema(name = "modemAnType", description = "모뎀 AN 타입 / lte, wifi, ip 인 경우 8자, 아닌 경우 4자 0:미사용 1:사용 배치 순서(EVOD, MDM_1X, SO7010, SMS, LTE, WIFI, IP)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemAnType")
  private @Nullable String modemAnType;

  
  @Schema(name = "modemManu", description = "모뎀 담당자", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemManu")
  private @Nullable String modemManu;

  
  @Schema(name = "modemNm", description = "모뎀 제조사", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemNm")
  private @Nullable String modemNm;

  
  @Schema(name = "serviceName", description = "서비스명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  private @Nullable String serviceName;

  
  @Schema(name = "serviceCmp", description = "회사 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceCmp")
  private @Nullable String serviceCmp;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "deviceModel", description = "디바이스 모델명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceModel")
  private String deviceModel;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "deviceManu", description = "디바이스 담당자", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceManu")
  private String deviceManu;

  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "deviceNm", description = "디바이스 제조사", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceNm")
  private String deviceNm;

  @NotNull @Size(min = 6, max = 50) 
  @Schema(name = "esn", description = "LTE 싱글밴드 : uiccid LTE 더블밴드 : ruimid LTE제외 : ESN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("esn")
  private String esn;

  @Size(min = 0, max = 32) 
  @Schema(name = "encryptKey", description = "암호화 키", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encryptKey")
  private @Nullable String encryptKey;

  @Size(min = 0, max = 1) 
  @Schema(name = "exceptionType", example = "C", description = "가입정보 유지된 정보에 따라 필요한 상황 시 사용(R:일시정지해제, M:명의변경, C:기기변경, N:번호변경, NULL:신규등록)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptionType")
  private @Nullable String exceptionType;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "m2mmType", example = "30", description = "m2mm type, GRP_CD = CD3301 인 코드 값", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("m2mmType")
  private String m2mmType;

  @NotNull @Size(min = 0, max = 18) 
  @Schema(name = "messageId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageId")
  private String messageId;

  @Size(min = 0, max = 1) 
  @Schema(name = "creType", example = "M", description = "생성 구분(A:자동등록, M:수동등록)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creType")
  private @Nullable String creType;

  
  @Schema(name = "authYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authYn")
  private @Nullable String authYn;

  
  @Schema(name = "customUuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customUuid")
  private @Nullable String customUuid;

  
  @Schema(name = "anPref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anPref")
  private @Nullable String anPref;

  
  @Schema(name = "registered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registered")
  private @Nullable String registered;

  
  @Schema(name = "serviceAuthYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceAuthYn")
  private @Nullable String serviceAuthYn;

  
  @Schema(name = "anTypeList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anTypeList")
  @Valid
  private List<String> anTypeList = new ArrayList<>();

  public Terminal() {
    super();
  }

}

