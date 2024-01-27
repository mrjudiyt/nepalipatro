package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.facebook.internal.NativeProtocol;

/* compiled from: ShareDialogFeature.kt */
public enum ShareDialogFeature implements DialogFeature {
    SHARE_DIALOG(NativeProtocol.PROTOCOL_VERSION_20130618),
    PHOTOS(NativeProtocol.PROTOCOL_VERSION_20140204),
    VIDEO(NativeProtocol.PROTOCOL_VERSION_20141028),
    MULTIMEDIA(NativeProtocol.PROTOCOL_VERSION_20160327),
    HASHTAG(NativeProtocol.PROTOCOL_VERSION_20160327),
    LINK_SHARE_QUOTES(NativeProtocol.PROTOCOL_VERSION_20160327);
    
    private final int minVersion;

    private ShareDialogFeature(int i10) {
        this.minVersion = i10;
    }

    public String getAction() {
        return NativeProtocol.ACTION_FEED_DIALOG;
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
