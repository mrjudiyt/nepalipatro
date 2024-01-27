package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzann extends ThreadLocal {
    zzann(zzano zzano) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
