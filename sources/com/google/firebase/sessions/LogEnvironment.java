package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* compiled from: ApplicationInfo.kt */
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    private final int number;

    private LogEnvironment(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
