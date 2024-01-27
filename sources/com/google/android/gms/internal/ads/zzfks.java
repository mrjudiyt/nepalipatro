package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfks implements zzfkv {
    private static final zzfks zzb = new zzfks(new zzfkw());
    protected final zzflr zza = new zzflr();
    private Date zzc;
    private boolean zzd;
    private final zzfkw zze;
    private boolean zzf;

    private zzfks(zzfkw zzfkw) {
        this.zze = zzfkw;
    }

    public static zzfks zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(boolean z10) {
        if (!this.zzf && z10) {
            Date date = new Date();
            Date date2 = this.zzc;
            if (date2 == null || date.after(date2)) {
                this.zzc = date;
                if (this.zzd) {
                    for (zzfkg zzg : zzfku.zza().zzb()) {
                        zzg.zzg().zze(zzb());
                    }
                }
            }
        }
        this.zzf = z10;
    }

    public final void zzd(Context context) {
        if (!this.zzd) {
            this.zze.zzd(context);
            this.zze.zze(this);
            this.zze.zzf();
            this.zzf = this.zze.zza;
            this.zzd = true;
        }
    }
}
