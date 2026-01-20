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
 * User
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class User {

  @NotNull @Size(min = 1, max = 20) 
  @Schema(name = "usrId", example = "admin", description = "ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usrId")
  private String usrId;

  @NotNull @Pattern(regexp = "^(?!.*--)(?!.*[%\"'`()])[A-Za-z0-9~!@$^_]{8,15}$") @Size(min = 8, max = 15) 
  @Schema(name = "usrPwd", example = "abc123!@", description = "비밀번호", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usrPwd")
  private String usrPwd;

  
  @Schema(name = "oldUsrPwd", example = "abc123!@", description = "이전 비밀번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldUsrPwd")
  private @Nullable String oldUsrPwd;

  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "usrNm", example = "관리자 계정", description = "이름", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usrNm")
  private String usrNm;

  @NotNull @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$") @Size(min = 0, max = 50) 
  @Schema(name = "email", example = "example@example.com", description = "이메일", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  private String email;

  @NotNull @Pattern(regexp = "^[0-9]+$") @Size(min = 0, max = 50) 
  @Schema(name = "usrPhone", example = "01099999999", description = "사용자 전화번호", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usrPhone")
  private String usrPhone;

  @Size(min = 0, max = 256) 
  @Schema(name = "serviceList", example = "T003,T002,T006", description = "서비스명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceList")
  private @Nullable String serviceList;

  
  @Schema(name = "prfLangCd", example = "en", description = "사용 언어 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prfLangCd")
  private @Nullable String prfLangCd;

  
  @Schema(name = "loginCnt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginCnt")
  private @Nullable Integer loginCnt;

  
  @Schema(name = "pwdSetTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pwdSetTime")
  private @Nullable String pwdSetTime;

  @NotNull @Size(min = 0, max = 200) 
  @Schema(name = "description", example = "설명", description = "설명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  private String description;

  @NotNull 
  @Schema(name = "cmpCd", example = "1", description = "회사코드", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cmpCd")
  private String cmpCd;

  
  @Schema(name = "cmpNm", example = "LG UPLUS", description = "회사명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpNm")
  private @Nullable String cmpNm;

  
  @Schema(name = "cmpType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpType")
  private @Nullable String cmpType;

  @NotNull @Size(min = 0, max = 200) 
  @Schema(name = "rolNm", example = "ROLE_PROJECT", description = "권한명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rolNm")
  private String rolNm;

  
  @Schema(name = "smsNum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smsNum")
  private @Nullable String smsNum;

  @NotNull @Size(min = 0, max = 1) 
  @Schema(name = "useYn", example = "Y", description = "사용여부", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useYn")
  private String useYn;

  
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

  @NotNull @Size(min = 0, max = 300) 
  @Schema(name = "privateKey", example = "bD98e5GiiCienMsnzl8POWnvChH2Zd2mIscJpMBvyc0", description = "암호화 값", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("privateKey")
  private String privateKey;

  
  @Schema(name = "isAdmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAdmin")
  private @Nullable Boolean isAdmin;

  
  @Schema(name = "rols", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rols")
  @Valid
  private List<String> rols = new ArrayList<>();

  
  @Schema(name = "changeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeLog")
  private @Nullable String changeLog;

  
  @Schema(name = "opPasswd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opPasswd")
  private @Nullable String opPasswd;

  
  @Schema(name = "passedDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passedDays")
  private @Nullable Integer passedDays;

  
  @Schema(name = "passedYn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passedYn")
  private @Nullable String passedYn;

  public User() {
    super();
  }

}

