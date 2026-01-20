package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.generator.aicc.dto.GrantedAuthority;
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
 * CustomUserDetails
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CustomUserDetails {

  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  private @Nullable String userId;

  
  @Schema(name = "userNm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userNm")
  private @Nullable String userNm;

  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  private @Nullable String email;

  
  @Schema(name = "cmpCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpCd")
  private @Nullable String cmpCd;

  
  @Schema(name = "secondCmpCd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondCmpCd")
  private @Nullable String secondCmpCd;

  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  @Valid
  private List<String> roles = new ArrayList<>();

  
  @Schema(name = "serviceList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceList")
  @Valid
  private List<String> serviceList = new ArrayList<>();

  
  @Schema(name = "cmpType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmpType")
  private @Nullable String cmpType;

  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  private @Nullable String password;

  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  private @Nullable String username;

  
  @Schema(name = "authorities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorities")
  @Valid
  private List<@Valid GrantedAuthority> authorities = new ArrayList<>();

  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  private @Nullable Boolean enabled;

  
  @Schema(name = "accountNonExpired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNonExpired")
  private @Nullable Boolean accountNonExpired;

  
  @Schema(name = "accountNonLocked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNonLocked")
  private @Nullable Boolean accountNonLocked;

  
  @Schema(name = "credentialsNonExpired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentialsNonExpired")
  private @Nullable Boolean credentialsNonExpired;

}

