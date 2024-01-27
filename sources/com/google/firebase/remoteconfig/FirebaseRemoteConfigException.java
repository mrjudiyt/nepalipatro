package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {
    private final Code code;

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int value;

        private Code(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = Code.UNKNOWN;
    }

    public Code getCode() {
        return this.code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code2) {
        super(str);
        this.code = code2;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, Code code2) {
        super(str, th);
        this.code = code2;
    }
}
