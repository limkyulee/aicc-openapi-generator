package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FotaSetting
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FotaSetting {

  @NotNull 
  @Schema(name = "networkTypeCode", example = "10", description = "네트웤 타입", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("networkTypeCode")
  private String networkTypeCode;

  
  @Schema(name = "networkTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("networkTypeName")
  private @Nullable String networkTypeName;

  
  @Schema(name = "redisKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redisKey")
  private @Nullable String redisKey;

  /**
   * 설정 키
   */
  public enum SettingKeyEnum {
    CELL_LIMIT("CELL_LIMIT"),
    
    SIZE("SIZE"),
    
    EXTENSION("EXTENSION"),
    
    EMPTY("EMPTY");

    private final String value;

    SettingKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SettingKeyEnum fromValue(String value) {
      for (SettingKeyEnum b : SettingKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @NotNull 
  @Schema(name = "settingKey", example = "CELL_LIMIT", description = "설정 키", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("settingKey")
  private SettingKeyEnum settingKey;

  @NotNull @Size(min = 0, max = 255) 
  @Schema(name = "value", example = "0", description = "설정 값", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  private String value;

  public FotaSetting() {
    super();
  }

}

