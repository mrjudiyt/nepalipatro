package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* compiled from: SessionEvent.kt */
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    private final int number;

    private EventType(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
