package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzoe {
    final /* synthetic */ zzof zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zztw zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzoe(zzof zzof, String str, int i10, zztw zztw) {
        this.zza = zzof;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zztw == null ? -1 : zztw.zzd;
        if (zztw != null && zztw.zzb()) {
            this.zze = zztw;
        }
    }

    public final void zzg(int i10, zztw zztw) {
        if (this.zzd == -1 && i10 == this.zzc && zztw != null) {
            zzof zzof = this.zza;
            long j10 = zztw.zzd;
            if (j10 >= zzof.zzl()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzj(int i10, zztw zztw) {
        if (zztw == null) {
            return i10 == this.zzc;
        }
        zztw zztw2 = this.zze;
        return zztw2 == null ? !zztw.zzb() && zztw.zzd == this.zzd : zztw.zzd == zztw2.zzd && zztw.zzb == zztw2.zzb && zztw.zzc == zztw2.zzc;
    }

    public final boolean zzk(zzmc zzmc) {
        zztw zztw = zzmc.zzd;
        if (zztw == null) {
            return this.zzc != zzmc.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zztw.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcv zzcv = zzmc.zzb;
        int zza2 = zzcv.zza(zztw.zza);
        int zza3 = zzcv.zza(this.zze.zza);
        zztw zztw2 = zzmc.zzd;
        if (zztw2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zztw2.zzb()) {
            zztw zztw3 = zzmc.zzd;
            int i10 = zztw3.zzb;
            int i11 = zztw3.zzc;
            zztw zztw4 = this.zze;
            int i12 = zztw4.zzb;
            if (i10 <= i12) {
                return i10 == i12 && i11 > zztw4.zzc;
            }
            return true;
        }
        int i13 = zzmc.zzd.zze;
        return i13 == -1 || i13 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcv r7, com.google.android.gms.internal.ads.zzcv r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzof r1 = r6.zza
            com.google.android.gms.internal.ads.zzcu r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzof r0 = r6.zza
            com.google.android.gms.internal.ads.zzcu r0 = r0.zzc
            int r0 = r0.zzp
        L_0x0026:
            com.google.android.gms.internal.ads.zzof r1 = r6.zza
            com.google.android.gms.internal.ads.zzcu r1 = r1.zzc
            int r1 = r1.zzq
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzof r7 = r6.zza
            com.google.android.gms.internal.ads.zzcs r7 = r7.zzd
            com.google.android.gms.internal.ads.zzcs r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zztw r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoe.zzl(com.google.android.gms.internal.ads.zzcv, com.google.android.gms.internal.ads.zzcv):boolean");
    }
}
