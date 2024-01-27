package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzada implements zzabm {
    public static final zzabt zza = zzacz.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzabp zzp;
    private zzacs zzq;
    private zzacm zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i10 = zzfk.zza;
        Charset charset = zzfsi.zzc;
        zzd = "#!AMR\n".getBytes(charset);
        zze = "#!AMR-WB\n".getBytes(charset);
        zzf = iArr[8];
    }

    public zzada() {
        this(0);
    }

    public zzada(int i10) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[Catch:{ EOFException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[Catch:{ EOFException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(com.google.android.gms.internal.ads.zzabn r12) {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0008
            goto L_0x0055
        L_0x0008:
            r12.zzj()     // Catch:{ EOFException -> 0x00b5 }
            byte[] r0 = r11.zzg     // Catch:{ EOFException -> 0x00b5 }
            r4 = r12
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4     // Catch:{ EOFException -> 0x00b5 }
            r4.zzm(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x00b5 }
            byte[] r0 = r11.zzg     // Catch:{ EOFException -> 0x00b5 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x00b5 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x009f
            int r0 = r0 >> 3
            boolean r4 = r11.zzh     // Catch:{ EOFException -> 0x00b5 }
            r0 = r0 & 15
            if (r4 == 0) goto L_0x002d
            r6 = 10
            if (r0 < r6) goto L_0x0038
            r6 = 13
            if (r0 <= r6) goto L_0x002d
            goto L_0x0038
        L_0x002d:
            if (r4 != 0) goto L_0x007a
            r6 = 12
            if (r0 < r6) goto L_0x0038
            r6 = 14
            if (r0 > r6) goto L_0x0038
            goto L_0x007a
        L_0x0038:
            if (r4 == 0) goto L_0x003f
            int[] r4 = zzc     // Catch:{ EOFException -> 0x00b5 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x00b5 }
            goto L_0x0043
        L_0x003f:
            int[] r4 = zzb     // Catch:{ EOFException -> 0x00b5 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x00b5 }
        L_0x0043:
            r11.zzj = r0     // Catch:{ EOFException -> 0x00b5 }
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L_0x004e
            r11.zzm = r0
            r4 = r0
        L_0x004e:
            if (r4 != r0) goto L_0x0055
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
        L_0x0055:
            com.google.android.gms.internal.ads.zzacs r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzacq.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x005e
            return r1
        L_0x005e:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto L_0x0066
            return r3
        L_0x0066:
            com.google.android.gms.internal.ads.zzacs r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzt(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        L_0x007a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x0081
            r12 = r3
        L_0x0081:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00b5 }
            r2.<init>()     // Catch:{ EOFException -> 0x00b5 }
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch:{ EOFException -> 0x00b5 }
            r2.append(r12)     // Catch:{ EOFException -> 0x00b5 }
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch:{ EOFException -> 0x00b5 }
            r2.append(r0)     // Catch:{ EOFException -> 0x00b5 }
            java.lang.String r12 = r2.toString()     // Catch:{ EOFException -> 0x00b5 }
            com.google.android.gms.internal.ads.zzcc r12 = com.google.android.gms.internal.ads.zzcc.zza(r12, r5)     // Catch:{ EOFException -> 0x00b5 }
            throw r12     // Catch:{ EOFException -> 0x00b5 }
        L_0x009f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00b5 }
            r12.<init>()     // Catch:{ EOFException -> 0x00b5 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x00b5 }
            r12.append(r0)     // Catch:{ EOFException -> 0x00b5 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x00b5 }
            com.google.android.gms.internal.ads.zzcc r12 = com.google.android.gms.internal.ads.zzcc.zza(r12, r5)     // Catch:{ EOFException -> 0x00b5 }
            throw r12     // Catch:{ EOFException -> 0x00b5 }
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzada.zza(com.google.android.gms.internal.ads.zzabn):int");
    }

    private static boolean zzf(zzabn zzabn, byte[] bArr) {
        zzabn.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzabc) zzabn).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzabn zzabn) {
        byte[] bArr = zzd;
        if (zzf(zzabn, bArr)) {
            this.zzh = false;
            ((zzabc) zzabn).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzabn, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzabc) zzabn).zzo(bArr2.length, false);
        return true;
    }

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        zzdx.zzb(this.zzq);
        int i10 = zzfk.zza;
        if (zzabn.zzf() != 0 || zzg(zzabn)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z10 = this.zzh;
                String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
                int i11 = true != z10 ? 8000 : 16000;
                zzacs zzacs = this.zzq;
                zzak zzak = new zzak();
                zzak.zzU(str);
                zzak.zzN(zzf);
                zzak.zzy(1);
                zzak.zzV(i11);
                zzacs.zzl(zzak.zzac());
            }
            int zza2 = zza(zzabn);
            if (this.zzl) {
                return zza2;
            }
            zzacl zzacl = new zzacl(-9223372036854775807L, 0);
            this.zzr = zzacl;
            this.zzp.zzO(zzacl);
            this.zzl = true;
            return zza2;
        }
        throw zzcc.zza("Could not find AMR header.", (Throwable) null);
    }

    public final void zzc(zzabp zzabp) {
        this.zzp = zzabp;
        this.zzq = zzabp.zzw(0, 1);
        zzabp.zzD();
    }

    public final void zzd(long j10, long j11) {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0;
    }

    public final boolean zze(zzabn zzabn) {
        return zzg(zzabn);
    }
}
