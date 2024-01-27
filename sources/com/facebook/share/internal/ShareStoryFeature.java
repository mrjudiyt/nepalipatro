package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.facebook.internal.NativeProtocol;

/* compiled from: ShareStoryFeature.kt */
public enum ShareStoryFeature implements DialogFeature {
    SHARE_STORY_ASSET(NativeProtocol.PROTOCOL_VERSION_20170417);
    
    private final int minVersion;

    private ShareStoryFeature(int i10) {
        this.minVersion = i10;
    }

    public String getAction() {
        return NativeProtocol.ACTION_SHARE_STORY;
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
