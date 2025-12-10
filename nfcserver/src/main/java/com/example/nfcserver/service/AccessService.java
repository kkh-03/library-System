package com.example.nfcserver.service;

import com.example.nfcserver.model.AccessResult;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AccessService {

    // 허용 UID 목록 (예시)
    private final Set<String> allowedUids = Set.of(
            "UID123", "UID456", "UID789" , "234re"
    );

    public AccessResult checkAccess(String uid) {
        boolean allowed = allowedUids.contains(uid);
        String message = allowed ? "출입 허용" : "출입 거부";
        return new AccessResult(allowed, message);
    }
}
