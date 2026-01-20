package com.openapi.generator.aicc.api;

import com.openapi.generator.aicc.dto.ComResponseAction;
import com.openapi.generator.aicc.dto.ComResponseActionAuthority;
import com.openapi.generator.aicc.dto.ComResponseActionAuthorityList;
import com.openapi.generator.aicc.dto.ComResponseActionList;
import com.openapi.generator.aicc.dto.ComResponseCommonCode;
import com.openapi.generator.aicc.dto.ComResponseCommonCodeGroup;
import com.openapi.generator.aicc.dto.ComResponseCommonCodeGroupList;
import com.openapi.generator.aicc.dto.ComResponseCommonCodeList;
import com.openapi.generator.aicc.dto.ComResponseListMenuTree;
import com.openapi.generator.aicc.dto.ComResponseMenu;
import com.openapi.generator.aicc.dto.ComResponseMenuAuthority;
import com.openapi.generator.aicc.dto.ComResponseMenuAuthorityList;
import com.openapi.generator.aicc.dto.ComResponseMenuList;
import com.openapi.generator.aicc.dto.ComResponseRole;
import com.openapi.generator.aicc.dto.ComResponseRoleList;
import com.openapi.generator.aicc.dto.DeleteActionRequest;
import com.openapi.generator.aicc.dto.DeleteCommonCodeGroupRequest;
import com.openapi.generator.aicc.dto.DeleteCommonCodeRequest;
import com.openapi.generator.aicc.dto.DeleteMenuRequest;
import com.openapi.generator.aicc.dto.DeleteRoleRequest;
import com.openapi.generator.aicc.dto.RetrieveActionAuthorityListRequest;
import com.openapi.generator.aicc.dto.RetrieveActionAuthorityRequest;
import com.openapi.generator.aicc.dto.RetrieveActionListRequest;
import com.openapi.generator.aicc.dto.RetrieveActionRequest;
import com.openapi.generator.aicc.dto.RetrieveCommonCodeGroupListRequest;
import com.openapi.generator.aicc.dto.RetrieveCommonCodeGroupRequest;
import com.openapi.generator.aicc.dto.RetrieveCommonCodeListRequest;
import com.openapi.generator.aicc.dto.RetrieveCommonCodeRequest;
import com.openapi.generator.aicc.dto.RetrieveMenuAuthorityListRequest;
import com.openapi.generator.aicc.dto.RetrieveMenuAuthorityRequest;
import com.openapi.generator.aicc.dto.RetrieveMenuListRequest;
import com.openapi.generator.aicc.dto.RetrieveMenuRequest;
import com.openapi.generator.aicc.dto.RetrieveRoleListRequest;
import com.openapi.generator.aicc.dto.RetrieveRoleRequest;
import com.openapi.generator.aicc.dto.UpdateActionAuthorityRequest;
import com.openapi.generator.aicc.dto.UpdateActionRequest;
import com.openapi.generator.aicc.dto.UpdateCommonCodeGroupRequest;
import com.openapi.generator.aicc.dto.UpdateCommonCodeRequest;
import com.openapi.generator.aicc.dto.UpdateMenuAuthorityRequest;
import com.openapi.generator.aicc.dto.UpdateMenuRequest;
import com.openapi.generator.aicc.dto.UpdateRoleRequest;


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
public class AdminApiController implements AdminApi {

    private final NativeWebRequest request;

    @Autowired
    public AdminApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
