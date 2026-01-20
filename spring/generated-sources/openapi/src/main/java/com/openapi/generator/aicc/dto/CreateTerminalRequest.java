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
 * CreateTerminalRequest
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("createTerminal_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class CreateTerminalRequest {

  
  @Schema(name = "mdn", example = "01014785236", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mdn")
  private @Nullable String mdn;

  
  @Schema(name = "mac", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mac")
  private @Nullable String mac;

  
  @Schema(name = "deviceSerialNo", example = "00000000000000000454", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSerialNo")
  private @Nullable String deviceSerialNo;

  
  @Schema(name = "esn", example = "8982067512001136000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("esn")
  private @Nullable String esn;

  
  @Schema(name = "deviceModel", example = "P999-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceModel")
  private @Nullable String deviceModel;

  
  @Schema(name = "svcCd", example = "1828", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCd")
  private @Nullable String svcCd;

  
  @Schema(name = "m2mmType", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("m2mmType")
  private @Nullable String m2mmType;

  
  @Schema(name = "terminalType", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terminalType")
  private @Nullable String terminalType;

  
  @Schema(name = "deviceNm", example = "JW_COMPANY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceNm")
  private @Nullable String deviceNm;

  
  @Schema(name = "deviceManu", example = "KJW", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceManu")
  private @Nullable String deviceManu;

  
  @Schema(name = "modemModel", example = "211", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modemModel")
  private @Nullable String modemModel;

  
  @Schema(name = "posCd", example = "4312069379", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posCd")
  private @Nullable String posCd;

  
  @Schema(name = "subPos", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subPos")
  private @Nullable String subPos;

  
  @Schema(name = "encryptKey", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encryptKey")
  private @Nullable String encryptKey;

  
  @Schema(name = "messageId", example = "messageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageId")
  private @Nullable String messageId;

}

