package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatv extends zzaud {
    private final StackTraceElement[] zzi;

    public zzatv(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzasp, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", zzaom, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        Object obj = this.zzi;
        if (obj != null) {
            int i10 = 1;
            zzasg zzasg = new zzasg((String) this.zzf.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zze) {
                this.zze.zzF(zzasg.zza.longValue());
                if (zzasg.zzb.booleanValue()) {
                    zzaom zzaom = this.zze;
                    if (true != zzasg.zzc.booleanValue()) {
                        i10 = 2;
                    }
                    zzaom.zzac(i10);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
