package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatx extends zzaud {
    private final zzasw zzi;
    private long zzj;

    public zzatx(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, zzasw zzasw) {
        super(zzasp, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzaom, i10, 53);
        this.zzi = zzasw;
        if (zzasw != null) {
            this.zzj = zzasw.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzj)})).longValue());
        }
    }
}
