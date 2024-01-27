package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaly {
    private final String zza;
    private final String zzb;

    public zzaly(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaly.class == obj.getClass()) {
            zzaly zzaly = (zzaly) obj;
            return TextUtils.equals(this.zza, zzaly.zza) && TextUtils.equals(this.zzb, zzaly.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + "]";
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
