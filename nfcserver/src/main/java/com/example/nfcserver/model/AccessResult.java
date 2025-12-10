package com.example.nfcserver.model;

public class AccessResult {
    private boolean allowed;
    private String message;

    public AccessResult(boolean allowed, String message) {
        this.allowed = allowed;
        this.message = message;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public String getMessage() {
        return message;
    }
}
