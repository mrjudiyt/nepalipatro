package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzhal extends zzhaj {
    private int zza;

    protected zzhal(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzanr.zzc(byteBuffer.get());
        zzanr.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
