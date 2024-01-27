package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaeu extends zzafh {
    public static final Parcelable.Creator<zzaeu> CREATOR = new zzaet();
    public final byte[] zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaeu(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzfk.zza
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeu.class == obj.getClass()) {
            zzaeu zzaeu = (zzaeu) obj;
            return this.zzf.equals(zzaeu.zzf) && Arrays.equals(this.zza, zzaeu.zza);
        }
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzaeu(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
