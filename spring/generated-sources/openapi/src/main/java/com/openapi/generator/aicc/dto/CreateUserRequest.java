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
 * CreateUserRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateUserRequest {

  
  @Schema(name = "usrId", example = "", description = "ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrId")
  private @Nullable String usrId;

  
  @Schema(name = "usrPwd", example = "Abacus01!", description = "비밀번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrPwd")
  private @Nullable String usrPwd;

  
  @Schema(name = "usrNm", example = "test user", description = "이름", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrNm")
  private @Nullable String usrNm;

  
  @Schema(name = "cmpCd", example = "1", description = "회사코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpCd")
  private @Nullable String cmpCd;

  
  @Schema(name = "rolNm", example = "ROLE_DEVICE_MANUFACTURER,ROLE_MODULE", description = "권한명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolNm")
  private @Nullable String rolNm;

  
  @Schema(name = "serviceList", example = "T003,T002,T006", description = "서비스명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceList")
  private @Nullable String serviceList;

  
  @Schema(name = "email", example = "example@example.com", description = "이메일", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  private @Nullable String email;

  
  @Schema(name = "usrPhone", example = "01099999999", description = "전화번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usrPhone")
  private @Nullable String usrPhone;

  
  @Schema(name = "useYn", example = "Y", description = "사용여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useYn")
  private @Nullable String useYn;

  
  @Schema(name = "description", example = "설명입니다.", description = "설명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  private @Nullable String description;

}

