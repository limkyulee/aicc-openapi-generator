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
 * ResetPwdRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("resetPwd_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class ResetPwdRequest {

  
  @Schema(name = "userId", example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  private @Nullable String userId;

  
  @Schema(name = "newPwd", example = "roqkf00!", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newPwd")
  private @Nullable String newPwd;

}

