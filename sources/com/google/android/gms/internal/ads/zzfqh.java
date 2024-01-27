package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqh extends zzfra {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* synthetic */ zzfqh(IBinder iBinder, boolean z10, String str, int i10, float f10, int i11, String str2, int i12, String str3, String str4, String str5, zzfqg zzfqg) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfra) {
            zzfra zzfra = (zzfra) obj;
            if (this.zza.equals(zzfra.zze())) {
                zzfra.zzk();
                String str = this.zzb;
                if (str != null ? str.equals(zzfra.zzg()) : zzfra.zzg() == null) {
                    if (this.zzc == zzfra.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfra.zza())) {
                        zzfra.zzb();
                        zzfra.zzi();
                        if (this.zze == zzfra.zzd()) {
                            zzfra.zzh();
                            String str2 = this.zzf;
                            if (str2 != null ? str2.equals(zzfra.zzf()) : zzfra.zzf() == null) {
                                zzfra.zzj();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int floatToIntBits = (((((((hashCode * 1000003) ^ 1237) * 1000003) ^ i10) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i12 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((((floatToIntBits * 583896283) ^ i12) * -721379959) ^ i11) * 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    public final float zza() {
        return this.zzd;
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zze;
    }

    public final IBinder zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzb;
    }

    public final String zzh() {
        return null;
    }

    public final String zzi() {
        return null;
    }

    public final String zzj() {
        return null;
    }

    public final boolean zzk() {
        return false;
    }
}
