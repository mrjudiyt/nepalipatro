package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zztr extends zzvz {
    private final boolean zzb;
    private final zzcu zzc;
    private final zzcs zzd;
    private zztp zze;
    private zzto zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztr(zzty zzty, boolean z10) {
        super(zzty);
        boolean z11;
        if (z10) {
            zzty.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcu();
        this.zzd = new zzcs();
        zzty.zzM();
        this.zze = zztp.zzq(zzty.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zztp.zzd)) ? obj : this.zze.zzf;
    }

    private final void zzL(long j10) {
        zzto zzto = this.zzf;
        int zza = this.zze.zza(zzto.zza.zza);
        if (zza != -1) {
            zztp zztp = this.zze;
            zzcs zzcs = this.zzd;
            zztp.zzd(zza, zzcs, false);
            long j11 = zzcs.zze;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            zzto.zzs(j10);
        }
    }

    public final zzcv zzC() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zztw zzD(zztw zztw) {
        Object zzs = this.zze.zzf;
        Object obj = zztw.zza;
        if (zzs != null && this.zze.zzf.equals(obj)) {
            obj = zztp.zzd;
        }
        return zztw.zza(obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzE(com.google.android.gms.internal.ads.zzcv r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            if (r15 == 0) goto L_0x009b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L_0x009b
        L_0x001a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.zzi
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            goto L_0x0033
        L_0x002b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcu.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztp.zzd
            com.google.android.gms.internal.ads.zztp r15 = com.google.android.gms.internal.ads.zztp.zzr(r15, r0, r2)
        L_0x0033:
            r14.zze = r15
            goto L_0x009b
        L_0x0036:
            com.google.android.gms.internal.ads.zzcu r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcu r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzto r5 = r14.zzf
            if (r5 == 0) goto L_0x0062
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztp r8 = r14.zze
            com.google.android.gms.internal.ads.zzcs r9 = r14.zzd
            com.google.android.gms.internal.ads.zztw r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztp r5 = r14.zze
            com.google.android.gms.internal.ads.zzcu r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            r12 = r6
            goto L_0x0063
        L_0x0062:
            r12 = r3
        L_0x0063:
            com.google.android.gms.internal.ads.zzcu r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcs r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            goto L_0x0086
        L_0x0082:
            com.google.android.gms.internal.ads.zztp r15 = com.google.android.gms.internal.ads.zztp.zzr(r15, r0, r3)
        L_0x0086:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            if (r15 == 0) goto L_0x009b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zztw r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zztw r1 = r15.zza(r0)
        L_0x009b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztp r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            java.util.Objects.requireNonNull(r15)
            r15.zzr(r1)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztr.zzE(com.google.android.gms.internal.ads.zzcv):void");
    }

    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB((Object) null, this.zza);
        }
    }

    public final void zzG(zztu zztu) {
        ((zzto) zztu).zzt();
        if (zztu == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzH */
    public final zzto zzI(zztw zztw, zzxz zzxz, long j10) {
        zzto zzto = new zzto(zztw, zzxz, j10);
        zzto.zzu(this.zza);
        if (this.zzh) {
            zzto.zzr(zztw.zza(zzK(zztw.zza)));
        } else {
            this.zzf = zzto;
            if (!this.zzg) {
                this.zzg = true;
                zzB((Object) null, this.zza);
            }
        }
        return zzto;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzt(zzbp zzbp) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzvv(this.zze.zzc, zzbp));
        } else {
            this.zze = zztp.zzq(zzbp);
        }
        this.zza.zzt(zzbp);
    }

    public final void zzz() {
    }
}
