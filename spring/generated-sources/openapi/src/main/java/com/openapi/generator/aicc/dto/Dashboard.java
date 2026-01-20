package com.openapi.generator.aicc.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.generator.aicc.dto.Chart;
import com.openapi.generator.aicc.dto.DeviceDetail;
import com.openapi.generator.aicc.dto.ServiceDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dashboard
 */
@lombok.Data @lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
public class Dashboard {

  @Valid 
  @Schema(name = "deviceStackBarData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceStackBarData")
  private @Nullable Chart deviceStackBarData;

  @Valid 
  @Schema(name = "serviceStackBarData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceStackBarData")
  private @Nullable Chart serviceStackBarData;

  @Valid 
  @Schema(name = "deviceSuccessData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSuccessData")
  private @Nullable Chart deviceSuccessData;

  @Valid 
  @Schema(name = "deviceFailData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceFailData")
  private @Nullable Chart deviceFailData;

  
  @Schema(name = "deviceSuccessDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSuccessDetailList")
  @Valid
  private Map<String, List<@Valid DeviceDetail>> deviceSuccessDetailList = new HashMap<>();

  
  @Schema(name = "deviceFailDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceFailDetailList")
  @Valid
  private Map<String, List<@Valid DeviceDetail>> deviceFailDetailList = new HashMap<>();

  @Valid 
  @Schema(name = "serviceSuccessData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSuccessData")
  private @Nullable Chart serviceSuccessData;

  @Valid 
  @Schema(name = "serviceFailData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceFailData")
  private @Nullable Chart serviceFailData;

  
  @Schema(name = "serviceSuccessDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSuccessDetailList")
  @Valid
  private Map<String, List<@Valid ServiceDetail>> serviceSuccessDetailList = new HashMap<>();

  
  @Schema(name = "serviceFailDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceFailDetailList")
  @Valid
  private Map<String, List<@Valid ServiceDetail>> serviceFailDetailList = new HashMap<>();

  @Valid 
  @Schema(name = "deviceSuccessLineData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSuccessLineData")
  private @Nullable Chart deviceSuccessLineData;

  @Valid 
  @Schema(name = "deviceFailLineData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceFailLineData")
  private @Nullable Chart deviceFailLineData;

  @Valid 
  @Schema(name = "serviceSuccessLineData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSuccessLineData")
  private @Nullable Chart serviceSuccessLineData;

  @Valid 
  @Schema(name = "serviceFailLineData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceFailLineData")
  private @Nullable Chart serviceFailLineData;

}

