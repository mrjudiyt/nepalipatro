package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfvw extends zzfvl {
    Object[] zzd;
    private int zze;

    public zzfvw() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ zzfvm zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfvw zzf(Object obj) {
        int length;
        Objects.requireNonNull(obj);
        if (this.zzd == null || zzfvx.zzh(this.zzb) > (length = this.zzd.length)) {
            this.zzd = null;
            super.zza(obj);
            return this;
        }
        int hashCode = obj.hashCode();
        int zza = zzfvk.zza(hashCode);
        while (true) {
            Object[] objArr = this.zzd;
            int i10 = zza & (length - 1);
            Object obj2 = objArr[i10];
            if (obj2 != null) {
                if (obj2.equals(obj)) {
                    break;
                }
                zza = i10 + 1;
            } else {
                objArr[i10] = obj;
                this.zze += hashCode;
                super.zza(obj);
                break;
            }
        }
        return this;
    }

    public final zzfvw zzg(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (this.zzd != null) {
            for (Object zzf : iterable) {
                zzf(zzf);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.zzfxi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzfvx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.zzfxi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.ads.zzfxi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvx zzh() {
        /*
            r9 = this;
            int r0 = r9.zzb
            if (r0 == 0) goto L_0x0056
            r1 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.Object[] r2 = r9.zzd
            if (r2 == 0) goto L_0x0034
            int r0 = com.google.android.gms.internal.ads.zzfvx.zzh(r0)
            java.lang.Object[] r2 = r9.zzd
            int r2 = r2.length
            if (r0 != r2) goto L_0x0034
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            int r3 = r2.length
            boolean r3 = com.google.android.gms.internal.ads.zzfvx.zzt(r0, r3)
            if (r3 == 0) goto L_0x0023
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L_0x0023:
            r4 = r2
            com.google.android.gms.internal.ads.zzfxi r0 = new com.google.android.gms.internal.ads.zzfxi
            int r5 = r9.zze
            java.lang.Object[] r6 = r9.zzd
            int r2 = r6.length
            int r7 = r2 + -1
            int r8 = r9.zzb
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x0034:
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            com.google.android.gms.internal.ads.zzfvx r0 = com.google.android.gms.internal.ads.zzfvx.zzs(r0, r2)
            int r2 = r0.size()
            r9.zzb = r2
        L_0x0042:
            r9.zzc = r1
            r1 = 0
            r9.zzd = r1
            return r0
        L_0x0048:
            java.lang.Object[] r0 = r9.zza
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.zzfxp r1 = new com.google.android.gms.internal.ads.zzfxp
            r1.<init>(r0)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfxi r0 = com.google.android.gms.internal.ads.zzfxi.zza
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvw.zzh():com.google.android.gms.internal.ads.zzfvx");
    }

    zzfvw(int i10) {
        super(i10);
        this.zzd = new Object[zzfvx.zzh(i10)];
    }
}
