package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* compiled from: SessionEvent.kt */
public enum DataCollectionState implements NumberedEnum {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    
    private final int number;

    private DataCollectionState(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
