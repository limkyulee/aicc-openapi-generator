package com.openapi.generator.aicc.api;

import com.openapi.generator.aicc.dto.ComResponsePoaHistory;
import com.openapi.generator.aicc.dto.ComResponsePoaHistoryList;
import com.openapi.generator.aicc.dto.ComResponseString;
import com.openapi.generator.aicc.dto.ComResponseSvcServer;
import com.openapi.generator.aicc.dto.ComResponseSvcServerList;
import com.openapi.generator.aicc.dto.CreatePoaRequest;
import com.openapi.generator.aicc.dto.CreateServiceServerRequest;
import com.openapi.generator.aicc.dto.DeletePoaRequest;
import com.openapi.generator.aicc.dto.DownloadSvcServerListRequest;
import com.openapi.generator.aicc.dto.HealthCheckRequest;
import com.openapi.generator.aicc.dto.RetrievePoaRequest;
import com.openapi.generator.aicc.dto.RetrieveServiceServerListRequest;
import com.openapi.generator.aicc.dto.RetrieveServiceServerRequest;
import com.openapi.generator.aicc.dto.UpdatePoaRequest;
import com.openapi.generator.aicc.dto.UpdateServiceServerRequest;


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
public class ServiceServerApiController implements ServiceServerApi {

    private final NativeWebRequest request;

    @Autowired
    public ServiceServerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
