package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.generator.aicc.dto.FotaSchedulePollingService;
import com.openapi.generator.aicc.dto.FotaScheduleTargetTerminal;
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
 * FotaSchedule
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class FotaSchedule {

  
  @Schema(name = "useYn", example = "Y", description = "사용 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  @Schema(name = "id", example = "730", description = "스케줄 ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  private Integer id;

  @NotNull @Size(min = 0, max = 64) 
  @Schema(name = "nm", example = "abacus-schedule", description = "스케줄 명", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nm")
  private String nm;

  @Pattern(regexp = "^$|^[A-Za-z0-9]{4}$") 
  @Schema(name = "svcCdSeq", example = "1OTA", description = "서비스 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcCdSeq")
  private @Nullable String svcCdSeq;

  
  @Schema(name = "svcNm", example = "1OTA_수정금지", description = "서비스 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("svcNm")
  private @Nullable String svcNm;

  
  @Schema(name = "fwCdSeq", example = "6317", description = "펌웨어 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwCdSeq")
  private @Nullable Integer fwCdSeq;

  
  @Schema(name = "fwNm", example = "helloV.2.0.mp3", description = "펌웨어 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwNm")
  private @Nullable String fwNm;

  
  @Schema(name = "deviceCdSeq", example = "176", description = "디바이스 모델 코드", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceCdSeq")
  private @Nullable Integer deviceCdSeq;

  
  @Schema(name = "deviceNm", example = "(device)abacus", description = "디바이스 모델 명", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceNm")
  private @Nullable String deviceNm;

  @Size(min = 0, max = 1) 
  @Schema(name = "fwType", example = "M", description = "펌웨어 타입", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwType")
  private @Nullable String fwType;

  
  @Schema(name = "firmwareVersion", example = "2.0.0", description = "펌웨어 버전", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firmwareVersion")
  private @Nullable String firmwareVersion;

  
  @Schema(name = "targetFirmware", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetFirmware")
  private @Nullable String targetFirmware;

  @NotNull 
  @Schema(name = "scheduleType", example = "PUSH", description = "스케줄 타입", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheduleType")
  private String scheduleType;

  
  @Schema(name = "pollingTarget", example = "DEVICE", description = "폴링 타입", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pollingTarget")
  private @Nullable String pollingTarget;

  
  @Schema(name = "status", example = "READY", description = "상태", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  private @Nullable String status;

  @NotNull 
  @Schema(name = "startDt", example = "2025-07-01", description = "시작 일자", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDt")
  private String startDt;

  @NotNull 
  @Schema(name = "endDt", example = "2025-07-01", description = "종료 일자", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDt")
  private String endDt;

  @NotNull @Pattern(regexp = "^([0-9]|1[0-9]|2[0-3])$") 
  @Schema(name = "startTime", example = "0", description = "시작 시간", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
  private String startTime;

  @NotNull @Pattern(regexp = "^([0-9]|1[0-9]|2[0-3])$") 
  @Schema(name = "endTime", example = "12", description = "종료 시간", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endTime")
  private String endTime;

  
  @Schema(name = "deviceList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceList")
  @Valid
  private List<@Valid FotaScheduleTargetTerminal> deviceList = new ArrayList<>();

  
  @Schema(name = "serviceList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceList")
  @Valid
  private List<@Valid FotaSchedulePollingService> serviceList = new ArrayList<>();

  public FotaSchedule() {
    super();
  }

}

