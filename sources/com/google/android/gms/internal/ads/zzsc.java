package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzsc extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrz zzc;
    public final String zzd;
    public final zzsc zze;

    public zzsc(zzam zzam, Throwable th, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + String.valueOf(zzam), th, zzam.zzm, false, (zzrz) null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), (zzsc) null);
    }

    static /* bridge */ /* synthetic */ zzsc zza(zzsc zzsc, zzsc zzsc2) {
        return new zzsc(zzsc.getMessage(), zzsc.getCause(), zzsc.zza, false, zzsc.zzc, zzsc.zzd, zzsc2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzsc(com.google.android.gms.internal.ads.zzam r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzrz r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzm
            int r11 = com.google.android.gms.internal.ads.zzfk.zza
            r13 = 0
            r0 = 21
            if (r11 < r0) goto L_0x0035
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L_0x0035
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            r8 = r11
            goto L_0x0036
        L_0x0035:
            r8 = r13
        L_0x0036:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsc.<init>(com.google.android.gms.internal.ads.zzam, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzrz):void");
    }

    private zzsc(String str, Throwable th, String str2, boolean z10, zzrz zzrz, String str3, zzsc zzsc) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrz;
        this.zzd = str3;
        this.zze = zzsc;
    }
}
