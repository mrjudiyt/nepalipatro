package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public abstract class zzbs extends zzbr {
    private boolean zza;

    protected zzbs(zzbv zzbv) {
        super(zzbv);
    }

    /* access modifiers changed from: protected */
    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        zzd();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public abstract void zzd();
}
