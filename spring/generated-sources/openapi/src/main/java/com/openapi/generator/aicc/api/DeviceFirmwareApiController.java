package com.openapi.generator.aicc.api;

import com.openapi.generator.aicc.dto.ComResponseCtnList;
import com.openapi.generator.aicc.dto.ComResponseFirmware;
import com.openapi.generator.aicc.dto.ComResponseFirmwareList;
import com.openapi.generator.aicc.dto.ComResponseFirmwareVersionList;
import com.openapi.generator.aicc.dto.DeleteFirmwareRequest;
import com.openapi.generator.aicc.dto.DownloadFirmwareRequest;
import org.springframework.lang.Nullable;
import com.openapi.generator.aicc.dto.RetrieveCtnListRequest;
import com.openapi.generator.aicc.dto.RetrieveDeviceFirmwareRequest;
import com.openapi.generator.aicc.dto.RetrieveFirmwareVersionListRequest;
import com.openapi.generator.aicc.dto.RetrieveFwApplyTargetList1Request;
import com.openapi.generator.aicc.dto.RetrieveModuleFirmwareListRequest;
import com.openapi.generator.aicc.dto.UpdateFirmwareRequestRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-19T16:30:08.398412+09:00[Asia/Seoul]", comments = "Generator version: 7.18.0")
@Controller
@RequestMapping("${openapi.abacusWEBSample.base-path:/api}")
public class DeviceFirmwareApiController implements DeviceFirmwareApi {

    private final NativeWebRequest request;

    @Autowired
    public DeviceFirmwareApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
