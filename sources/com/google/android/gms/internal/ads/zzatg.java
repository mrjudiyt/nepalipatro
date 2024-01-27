package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatg extends zzaud {
    private final long zzi;

    public zzatg(zzasp zzasp, String str, String str2, zzaom zzaom, long j10, int i10, int i11) {
        super(zzasp, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzaom, i10, 25);
        this.zzi = j10;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzT(longValue - j10);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
