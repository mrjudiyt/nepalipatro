package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhi extends zzgc {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzhi(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzf;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new zzhh((String) null, e10, 2000);
            }
        }
        InputStream inputStream = this.zze;
        int i12 = zzfk.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.zzf;
            if (j11 != -1) {
                this.zzf = j11 - ((long) read);
            }
            zzg(read);
            return read;
        } else if (this.zzf == -1) {
            return -1;
        } else {
            throw new zzhh("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r3.matches("\\d+") != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzgn r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r2 = r0.zza
            android.net.Uri r2 = r2.normalizeScheme()
            r1.zzc = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 2005(0x7d5, float:2.81E-42)
            r5 = 1004(0x3ec, float:1.407E-42)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x00b5
            java.lang.String r3 = r2.getScheme()
            java.lang.String r8 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0044
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r6) goto L_0x0044
            java.lang.String r3 = r2.getLastPathSegment()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r9 = "\\d+"
            boolean r3 = r3.matches(r9)
            if (r3 == 0) goto L_0x0044
            goto L_0x00b5
        L_0x0044:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0095
            java.lang.String r3 = r2.getPath()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "/"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x0061
            java.lang.String r3 = r3.substring(r6)
        L_0x0061:
            java.lang.String r5 = r2.getHost()
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x006e
            java.lang.String r5 = ""
            goto L_0x0078
        L_0x006e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = ":"
            java.lang.String r5 = r5.concat(r8)
        L_0x0078:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.content.res.Resources r8 = r1.zza
            java.lang.String r9 = r1.zzb
            java.lang.String r3 = r5.concat(r3)
            java.lang.String r5 = "raw"
            int r3 = r8.getIdentifier(r3, r5, r9)
            if (r3 == 0) goto L_0x008d
            goto L_0x00c0
        L_0x008d:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh
            java.lang.String r2 = "Resource not found."
            r0.<init>(r2, r7, r4)
            throw r0
        L_0x0095:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh
            java.lang.String r2 = r2.getScheme()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported URI scheme ("
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "). Only rawresource and android.resource are supported."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2, r7, r5)
            throw r0
        L_0x00b5:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x018b }
            java.util.Objects.requireNonNull(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x018b }
        L_0x00c0:
            r17.zzi(r18)
            android.content.res.Resources r5 = r1.zza     // Catch:{ NotFoundException -> 0x0184 }
            android.content.res.AssetFileDescriptor r3 = r5.openRawResourceFd(r3)     // Catch:{ NotFoundException -> 0x0184 }
            r1.zzd = r3
            if (r3 == 0) goto L_0x0172
            long r8 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r3.getFileDescriptor()
            r2.<init>(r5)
            r1.zze = r2
            r5 = 2008(0x7d8, float:2.814E-42)
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00f1
            long r13 = r0.zzf     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto L_0x00eb
            goto L_0x00f1
        L_0x00eb:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            r0.<init>(r7, r7, r5)     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            throw r0     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
        L_0x00f1:
            long r13 = r3.getStartOffset()     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r4 = r0.zzf     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r4 = r4 + r13
            long r4 = r2.skip(r4)     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r4 = r4 - r13
            long r13 = r0.zzf     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x015f
            r13 = 0
            if (r12 != 0) goto L_0x012f
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r4 = r2.size()     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            r1.zzf = r10     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            r4 = r10
            goto L_0x0137
        L_0x0117:
            long r4 = r2.size()     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r8 = r2.position()     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            long r4 = r4 - r8
            r1.zzf = r4     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0127
            goto L_0x0137
        L_0x0127:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            throw r0     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
        L_0x012f:
            long r4 = r8 - r4
            r1.zzf = r4     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0157
        L_0x0137:
            long r2 = r0.zzg
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0148
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0142
            goto L_0x0146
        L_0x0142:
            long r2 = java.lang.Math.min(r4, r2)
        L_0x0146:
            r1.zzf = r2
        L_0x0148:
            r1.zzg = r6
            r17.zzj(r18)
            long r2 = r0.zzg
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0154
            return r2
        L_0x0154:
            long r2 = r1.zzf
            return r2
        L_0x0157:
            com.google.android.gms.internal.ads.zzgj r0 = new com.google.android.gms.internal.ads.zzgj     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            throw r0     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
        L_0x015f:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
            throw r0     // Catch:{ zzhh -> 0x0170, IOException -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzhh r2 = new com.google.android.gms.internal.ads.zzhh
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r7, r0, r3)
            throw r2
        L_0x0170:
            r0 = move-exception
            throw r0
        L_0x0172:
            r3 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Resource is compressed: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2, r7, r3)
            throw r0
        L_0x0184:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzhh r2 = new com.google.android.gms.internal.ads.zzhh
            r2.<init>(r7, r0, r4)
            throw r2
        L_0x018b:
            com.google.android.gms.internal.ads.zzhh r0 = new com.google.android.gms.internal.ads.zzhh
            java.lang.String r2 = "Resource identifier must be an integer."
            r0.<init>(r2, r7, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhi.zzb(com.google.android.gms.internal.ads.zzgn):long");
    }

    public final Uri zzc() {
        return this.zzc;
    }

    public final void zzd() {
        this.zzc = null;
        try {
            InputStream inputStream = this.zze;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zze = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzd;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzhh((String) null, e10, 2000);
            } catch (Throwable th) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new zzhh((String) null, e11, 2000);
        } catch (Throwable th2) {
            this.zze = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e12) {
                throw new zzhh((String) null, e12, 2000);
            } catch (Throwable th3) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th3;
            }
        }
    }
}
