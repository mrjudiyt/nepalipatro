package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaib implements zzaii {
    private final zzaih zza;
    /* access modifiers changed from: private */
    public final long zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final zzain zzd;
    private int zze;
    /* access modifiers changed from: private */
    public long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaib(zzain zzain, long j10, long j11, long j12, long j13, boolean z10) {
        zzdx.zzd(j10 >= 0 && j11 > j10);
        this.zzd = zzain;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaih();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzd(com.google.android.gms.internal.ads.zzabn r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.zze
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00e8
            if (r2 == r3) goto L_0x00fb
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0015
            if (r2 == r10) goto L_0x00ab
            return r6
        L_0x0015:
            long r2 = r0.zzi
            long r11 = r0.zzj
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0020
        L_0x001d:
            r11 = r6
            goto L_0x00a4
        L_0x0020:
            long r2 = r22.zzf()
            com.google.android.gms.internal.ads.zzaih r13 = r0.zza
            boolean r11 = r13.zzc(r1, r11)
            if (r11 != 0) goto L_0x003c
            long r11 = r0.zzi
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0034
            goto L_0x00a4
        L_0x0034:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003c:
            com.google.android.gms.internal.ads.zzaih r11 = r0.zza
            r11.zzb(r1, r5)
            r22.zzj()
            long r11 = r0.zzh
            com.google.android.gms.internal.ads.zzaih r13 = r0.zza
            long r14 = r13.zzb
            long r11 = r11 - r14
            int r8 = r13.zzd
            int r9 = r13.zze
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x005e
            r16 = 72000(0x11940, double:3.55727E-319)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x005e
            goto L_0x001d
        L_0x005e:
            if (r9 >= 0) goto L_0x0065
            r0.zzj = r2
            r0.zzl = r14
            goto L_0x0070
        L_0x0065:
            long r2 = (long) r8
            long r16 = r22.zzf()
            long r2 = r16 + r2
            r0.zzi = r2
            r0.zzk = r14
        L_0x0070:
            long r2 = r0.zzj
            long r13 = r0.zzi
            long r16 = r2 - r13
            r18 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 >= 0) goto L_0x0081
            r0.zzj = r13
            r11 = r13
            goto L_0x00a4
        L_0x0081:
            long r4 = (long) r8
            if (r9 > 0) goto L_0x0087
            r8 = 2
            goto L_0x0089
        L_0x0087:
            r8 = 1
        L_0x0089:
            long r19 = r22.zzf()
            long r4 = r4 * r8
            long r19 = r19 - r4
            long r11 = r11 * r16
            long r4 = r0.zzl
            long r8 = r0.zzk
            long r4 = r4 - r8
            long r11 = r11 / r4
            long r4 = r19 + r11
            long r2 = r2 + r6
            long r2 = java.lang.Math.min(r4, r2)
            long r11 = java.lang.Math.max(r13, r2)
        L_0x00a4:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            return r11
        L_0x00a9:
            r0.zze = r10
        L_0x00ab:
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            r2.zzc(r1, r6)
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            r3 = 0
            r2.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            long r3 = r2.zzb
            long r8 = r0.zzh
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cd
            r22.zzj()
            r1 = 4
            r0.zze = r1
            long r1 = r0.zzk
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00cd:
            r4 = 2
            int r3 = r2.zzd
            int r2 = r2.zze
            int r3 = r3 + r2
            r2 = r1
            com.google.android.gms.internal.ads.zzabc r2 = (com.google.android.gms.internal.ads.zzabc) r2
            r8 = 0
            r2.zzo(r3, r8)
            long r2 = r22.zzf()
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            long r2 = r2.zzb
            r0.zzk = r2
            goto L_0x00ab
        L_0x00e8:
            long r4 = r22.zzf()
            r0.zzg = r4
            r0.zze = r3
            long r8 = r0.zzc
            r10 = -65307(0xffffffffffff00e5, double:NaN)
            long r8 = r8 + r10
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fb
            return r8
        L_0x00fb:
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            r2.zza()
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            boolean r2 = r2.zzc(r1, r6)
            if (r2 == 0) goto L_0x015a
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            r4 = 0
            r2.zzb(r1, r4)
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            int r5 = r2.zzd
            int r2 = r2.zze
            int r5 = r5 + r2
            r2 = r1
            com.google.android.gms.internal.ads.zzabc r2 = (com.google.android.gms.internal.ads.zzabc) r2
            r2.zzo(r5, r4)
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            long r4 = r2.zzb
        L_0x011f:
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            int r8 = r2.zza
            r9 = 4
            r8 = r8 & r9
            if (r8 == r9) goto L_0x0152
            boolean r2 = r2.zzc(r1, r6)
            if (r2 == 0) goto L_0x0152
            long r8 = r22.zzf()
            long r10 = r0.zzc
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            boolean r2 = r2.zzb(r1, r3)
            if (r2 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            int r8 = r2.zzd
            int r2 = r2.zze
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.zzabq.zze(r1, r8)
            if (r2 != 0) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            com.google.android.gms.internal.ads.zzaih r2 = r0.zza
            long r4 = r2.zzb
            goto L_0x011f
        L_0x0152:
            r0.zzf = r4
            r1 = 4
            r0.zze = r1
            long r1 = r0.zzg
            return r1
        L_0x015a:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaib.zzd(com.google.android.gms.internal.ads.zzabn):long");
    }

    public final /* bridge */ /* synthetic */ zzacm zze() {
        if (this.zzf != 0) {
            return new zzaia(this, (zzahz) null);
        }
        return null;
    }

    public final void zzg(long j10) {
        this.zzh = Math.max(0, Math.min(j10, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0;
        this.zzl = this.zzf;
    }
}
