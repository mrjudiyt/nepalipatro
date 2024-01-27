package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatj extends zzaud {
    private final zzasq zzi;

    public zzatj(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, zzasq zzasq) {
        super(zzasp, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", zzaom, i10, 85);
        this.zzi = zzasq;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        long[] jArr = (long[]) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf())});
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
