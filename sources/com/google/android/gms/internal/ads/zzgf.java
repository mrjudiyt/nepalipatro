package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgf extends zzgc {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgf(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new zzge(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzfk.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - ((long) read);
        }
        zzg(read);
        return read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102 A[ExcHandler: zzge (r0v1 'e' com.google.android.gms.internal.ads.zzge A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzgn r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r3 = 1
            android.net.Uri r4 = r0.zza     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            android.net.Uri r4 = r4.normalizeScheme()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r1.zzb = r4     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r17.zzi(r18)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r5 = "content"
            java.lang.String r6 = r4.getScheme()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            boolean r5 = r5.equals(r6)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            if (r5 == 0) goto L_0x002f
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r5.<init>()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r6 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"
            r5.putBoolean(r6, r3)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            android.content.ContentResolver r6 = r1.zza     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            goto L_0x0037
        L_0x002f:
            android.content.ContentResolver r5 = r1.zza     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
        L_0x0037:
            r1.zzc = r5     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            if (r5 == 0) goto L_0x00cd
            long r6 = r5.getLength()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r4.<init>(r8)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r1.zzd = r4     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0060
            long r13 = r0.zzf     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r0.<init>(r9, r8)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            throw r0     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
        L_0x0060:
            long r13 = r5.getStartOffset()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            long r2 = r0.zzf     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            long r2 = r2 - r13
            long r13 = r0.zzf     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x00c7
            r13 = 0
            if (r12 != 0) goto L_0x0098
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            long r3 = r2.size()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0086
            r1.zze = r10     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r3 = r10
            goto L_0x00a0
        L_0x0086:
            long r6 = r2.position()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            long r3 = r3 - r6
            r1.zze = r3     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
            goto L_0x00a0
        L_0x0092:
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r0.<init>(r9, r8)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            throw r0     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
        L_0x0098:
            long r3 = r6 - r2
            r1.zze = r3     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
        L_0x00a0:
            long r5 = r0.zzg
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00b1
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00ab
            goto L_0x00af
        L_0x00ab:
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00af:
            r1.zze = r5
        L_0x00b1:
            r2 = 1
            r1.zzf = r2
            r17.zzj(r18)
            long r2 = r0.zzg
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00be
            return r2
        L_0x00be:
            long r2 = r1.zze
            return r2
        L_0x00c1:
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r0.<init>(r9, r8)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            throw r0     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
        L_0x00c7:
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r0.<init>(r9, r8)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            throw r0     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
        L_0x00cd:
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r4.<init>()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r6 = "Could not open file descriptor for: "
            r4.append(r6)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r4.append(r3)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            java.lang.String r3 = r4.toString()     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r2.<init>(r3)     // Catch:{ zzge -> 0x0102, IOException -> 0x00f1 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ zzge -> 0x0102, IOException -> 0x00ef }
            throw r0     // Catch:{ zzge -> 0x0102, IOException -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00f4:
            com.google.android.gms.internal.ads.zzge r2 = new com.google.android.gms.internal.ads.zzge
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x00fe:
            r2.<init>(r0, r3)
            throw r2
        L_0x0102:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgf.zzb(com.google.android.gms.internal.ads.zzgn):long");
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zzb = null;
        try {
            FileInputStream fileInputStream = this.zzd;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzc;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzge(e10, 2000);
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new zzge(e11, 2000);
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e12) {
                throw new zzge(e12, 2000);
            } catch (Throwable th3) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th3;
            }
        }
    }
}
