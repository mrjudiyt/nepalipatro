package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzedg extends zzeeb {
    private final Activity zza;
    private final zzl zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzedg(Activity activity, zzl zzl, String str, String str2, zzedf zzedf) {
        this.zza = activity;
        this.zzb = zzl;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzeeb
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzeeb r5 = (com.google.android.gms.internal.ads.zzeeb) r5
            android.app.Activity r1 = r4.zza
            android.app.Activity r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.ads.internal.overlay.zzl r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.zzl r1 = r5.zzb()
            if (r1 != 0) goto L_0x0058
            goto L_0x002c
        L_0x0022:
            com.google.android.gms.ads.internal.overlay.zzl r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x002c:
            java.lang.String r1 = r4.zzc
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.zzc()
            if (r1 != 0) goto L_0x0058
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x0041:
            java.lang.String r1 = r4.zzd
            if (r1 != 0) goto L_0x004c
            java.lang.String r5 = r5.zzd()
            if (r5 != 0) goto L_0x0058
            goto L_0x0057
        L_0x004c:
            java.lang.String r5 = r5.zzd()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzl zzl = this.zzb;
        int i12 = 0;
        if (zzl == null) {
            i10 = 0;
        } else {
            i10 = zzl.hashCode();
        }
        int i13 = ((hashCode * 1000003) ^ i10) * 1000003;
        String str = this.zzc;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i13 ^ i11) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 ^ i12;
    }

    public final String toString() {
        zzl zzl = this.zzb;
        String obj = this.zza.toString();
        String valueOf = String.valueOf(zzl);
        return "OfflineUtilsParams{activity=" + obj + ", adOverlay=" + valueOf + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    public final Activity zza() {
        return this.zza;
    }

    public final zzl zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
