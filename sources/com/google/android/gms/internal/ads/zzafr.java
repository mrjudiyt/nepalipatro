package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafr extends zzafh {
    public static final Parcelable.Creator<zzafr> CREATOR = new zzafq();
    public final String zza;
    public final String zzb;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzafr(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzfk.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafr = (zzafr) obj;
            return this.zzf.equals(zzafr.zzf) && zzfk.zzE(this.zza, zzafr.zza) && zzfk.zzE(this.zzb, zzafr.zzb);
        }
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i11 = hashCode * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((i11 + hashCode2) * 31) + i10;
    }

    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzafr(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
