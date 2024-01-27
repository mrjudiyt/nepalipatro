package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqf extends zzfqz {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    zzfqf() {
    }

    public final zzfqz zza(String str) {
        this.zzf = str;
        return this;
    }

    public final zzfqz zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfqz zzc(int i10) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    public final zzfqz zzd(int i10) {
        this.zzc = i10;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    public final zzfqz zze(float f10) {
        this.zzd = f10;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    public final zzfqz zzf(boolean z10) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    public final zzfqz zzg(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.zza = iBinder;
        return this;
    }

    public final zzfqz zzh(int i10) {
        this.zze = i10;
        this.zzg = (byte) (this.zzg | 16);
        return this;
    }

    public final zzfra zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfqh(iBinder, false, this.zzb, this.zzc, this.zzd, 0, (String) null, this.zze, (String) null, this.zzf, (String) null, (zzfqg) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
