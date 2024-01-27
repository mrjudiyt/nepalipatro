package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzlp extends zzhu {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcv[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzlp(java.util.Collection r7, com.google.android.gms.internal.ads.zzvr r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcv[] r0 = new com.google.android.gms.internal.ads.zzcv[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        L_0x000c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0022
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzky r4 = (com.google.android.gms.internal.ads.zzky) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcv r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto L_0x000c
        L_0x0022:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L_0x002c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzky r3 = (com.google.android.gms.internal.ads.zzky) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L_0x002c
        L_0x0042:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlp.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzvr):void");
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public final int zzq(int i10) {
        return zzfk.zzb(this.zzf, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public final int zzr(int i10) {
        return zzfk.zzb(this.zzg, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public final int zzs(int i10) {
        return this.zzf[i10];
    }

    /* access modifiers changed from: protected */
    public final int zzt(int i10) {
        return this.zzg[i10];
    }

    /* access modifiers changed from: protected */
    public final zzcv zzu(int i10) {
        return this.zzh[i10];
    }

    /* access modifiers changed from: protected */
    public final Object zzv(int i10) {
        return this.zzi[i10];
    }

    /* access modifiers changed from: package-private */
    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzlp zzx(zzvr zzvr) {
        zzcv[] zzcvArr = new zzcv[this.zzh.length];
        int i10 = 0;
        while (true) {
            zzcv[] zzcvArr2 = this.zzh;
            if (i10 >= zzcvArr2.length) {
                return new zzlp(zzcvArr, this.zzi, zzvr);
            }
            zzcvArr[i10] = new zzlo(this, zzcvArr2[i10]);
            i10++;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzlp(zzcv[] zzcvArr, Object[] objArr, zzvr zzvr) {
        super(false, zzvr);
        int i10 = 0;
        this.zzh = zzcvArr;
        int length = zzcvArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < zzcvArr.length) {
            zzcv zzcv = zzcvArr[i10];
            this.zzh[i13] = zzcv;
            this.zzg[i13] = i11;
            this.zzf[i13] = i12;
            i11 += zzcv.zzc();
            i12 += this.zzh[i13].zzb();
            this.zzj.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.zzd = i11;
        this.zze = i12;
    }
}
