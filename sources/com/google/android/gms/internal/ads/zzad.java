package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzad implements Comparator<zzac>, Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzaa();
    public final String zza;
    public final int zzb;
    private final zzac[] zzc;
    private int zzd;

    zzad(Parcel parcel) {
        this.zza = parcel.readString();
        zzac[] zzacArr = (zzac[]) parcel.createTypedArray(zzac.CREATOR);
        int i10 = zzfk.zza;
        this.zzc = zzacArr;
        this.zzb = zzacArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzac zzac = (zzac) obj;
        zzac zzac2 = (zzac) obj2;
        UUID uuid = zzo.zza;
        if (uuid.equals(zzac.zza)) {
            return !uuid.equals(zzac2.zza) ? 1 : 0;
        }
        return zzac.zza.compareTo(zzac2.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzad = (zzad) obj;
            return zzfk.zzE(this.zza, zzad.zza) && Arrays.equals(this.zzc, zzad.zzc);
        }
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            return i11;
        }
        String str = this.zza;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (i10 * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzac zza(int i10) {
        return this.zzc[i10];
    }

    public final zzad zzb(String str) {
        if (zzfk.zzE(this.zza, str)) {
            return this;
        }
        return new zzad(str, false, this.zzc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzac[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzad(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzac... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzac[] r3 = (com.google.android.gms.internal.ads.zzac[]) r3
        L_0x000e:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzad.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzac[]):void");
    }

    public zzad(String str, zzac... zzacArr) {
        this((String) null, true, zzacArr);
    }

    public zzad(List list) {
        this((String) null, false, (zzac[]) list.toArray(new zzac[0]));
    }
}
