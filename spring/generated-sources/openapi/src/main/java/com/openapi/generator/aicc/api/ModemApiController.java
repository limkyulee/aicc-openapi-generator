package com.openapi.generator.aicc.api;

import com.openapi.generator.aicc.dto.ComResponseModem;
import com.openapi.generator.aicc.dto.ComResponseModemList;
import com.openapi.generator.aicc.dto.CreateModemRequest;
import com.openapi.generator.aicc.dto.DownloadModemListRequest;
import com.openapi.generator.aicc.dto.RetrieveModemListRequest;
import com.openapi.generator.aicc.dto.RetrieveModemRequest;
import com.openapi.generator.aicc.dto.UpdateModemRequest;


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
public class ModemApiController implements ModemApi {

    private final NativeWebRequest request;

    @Autowired
    public ModemApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
