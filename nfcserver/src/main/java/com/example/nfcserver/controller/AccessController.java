package com.example.nfcserver.controller;

import com.example.nfcserver.model.UIDRequest;
import com.example.nfcserver.model.AccessResult;
import com.example.nfcserver.service.AccessService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/access")
public class AccessController {

    private final AccessService accessService;

    public AccessController(AccessService accessService) {
        this.accessService = accessService;
    }

    @PostMapping("/check")
    public AccessResult checkAccess(@RequestBody UIDRequest request) {
        return accessService.checkAccess(request.getUid());
    }

    // 서버 테스트용 GET
    @GetMapping("/test")
    public String test() {
        return "서버 돌아가는 중";
    }
}
