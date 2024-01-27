package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzasp {
    private static final String zzd = "zzasp";
    protected final Context zza;
    protected boolean zzb;
    protected boolean zzc;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaru zzg;
    private byte[] zzh;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj;
    private Future zzk;
    private final boolean zzl;
    /* access modifiers changed from: private */
    public volatile zzapj zzm;
    private Future zzn;
    private zzarj zzo;
    private final Map zzp;
    private boolean zzq;
    private zzasi zzr;

    private zzasp(Context context) {
        boolean z10 = false;
        this.zzj = false;
        this.zzk = null;
        this.zzm = null;
        this.zzn = null;
        this.zzb = false;
        this.zzc = false;
        this.zzq = false;
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null ? true : z10;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr == null) {
            this.zzr = new zzasi(context);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|(3:27|28|(17:30|(2:32|33)|34|35|36|37|(2:39|(1:41)(2:42|43))|44|(3:46|(1:48)|49)|50|51|52|53|54|55|56|85)(3:74|75|76))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ zzasf -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ IllegalArgumentException -> 0x0160, zzart -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015a A[SYNTHETIC, Splitter:B:74:0x015a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzasp zzg(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r11 = "1689111357674"
            com.google.android.gms.internal.ads.zzasp r0 = new com.google.android.gms.internal.ads.zzasp
            r0.<init>(r9)
            com.google.android.gms.internal.ads.zzasl r9 = new com.google.android.gms.internal.ads.zzasl     // Catch:{ zzasf -> 0x016e }
            r9.<init>()     // Catch:{ zzasf -> 0x016e }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzasf -> 0x016e }
            r0.zze = r9     // Catch:{ zzasf -> 0x016e }
            r0.zzj = r12     // Catch:{ zzasf -> 0x016e }
            if (r12 == 0) goto L_0x0025
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzasf -> 0x016e }
            com.google.android.gms.internal.ads.zzasm r12 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ zzasf -> 0x016e }
            r12.<init>(r0)     // Catch:{ zzasf -> 0x016e }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzasf -> 0x016e }
            r0.zzk = r9     // Catch:{ zzasf -> 0x016e }
        L_0x0025:
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzasf -> 0x016e }
            com.google.android.gms.internal.ads.zzaso r12 = new com.google.android.gms.internal.ads.zzaso     // Catch:{ zzasf -> 0x016e }
            r12.<init>(r0)     // Catch:{ zzasf -> 0x016e }
            r9.execute(r12)     // Catch:{ zzasf -> 0x016e }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r2 = r1.getApkVersion(r2)     // Catch:{ all -> 0x004f }
            if (r2 <= 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r0.zzb = r2     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r1 = r1.isGooglePlayServicesAvailable(r2)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0.zzc = r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0.zzo(r12, r9)     // Catch:{ zzasf -> 0x016e }
            boolean r1 = com.google.android.gms.internal.ads.zzass.zzc()     // Catch:{ zzasf -> 0x016e }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzdb     // Catch:{ zzasf -> 0x016e }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzasf -> 0x016e }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ zzasf -> 0x016e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ zzasf -> 0x016e }
            boolean r1 = r1.booleanValue()     // Catch:{ zzasf -> 0x016e }
            if (r1 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzasf -> 0x016e }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzasf -> 0x016e }
            throw r9     // Catch:{ zzasf -> 0x016e }
        L_0x0073:
            com.google.android.gms.internal.ads.zzaru r1 = new com.google.android.gms.internal.ads.zzaru     // Catch:{ zzasf -> 0x016e }
            r2 = 0
            r1.<init>(r2)     // Catch:{ zzasf -> 0x016e }
            r0.zzg = r1     // Catch:{ zzasf -> 0x016e }
            java.lang.String r3 = "6m/z/fVvE874x19iYpgBji/u+BhM11pzfOVAuANgW+o="
            byte[] r3 = com.google.android.gms.internal.ads.zzapz.zzb(r3, r12)     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0160 }
            r5 = 32
            if (r4 != r5) goto L_0x015a
            r4 = 4
            r5 = 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0160 }
            byte[] r4 = new byte[r5]     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3 = 0
        L_0x0093:
            if (r3 >= r5) goto L_0x009f
            byte r6 = r4[r3]     // Catch:{ IllegalArgumentException -> 0x0160 }
            r6 = r6 ^ 68
            byte r6 = (byte) r6     // Catch:{ IllegalArgumentException -> 0x0160 }
            r4[r3] = r6     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r3 = r3 + 1
            goto L_0x0093
        L_0x009f:
            r0.zzh = r4     // Catch:{ zzart -> 0x0167 }
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.String r3 = "dex"
            java.io.File r1 = r1.getDir(r3, r12)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.gms.internal.ads.zzasf r9 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            throw r9     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
        L_0x00ba:
            java.lang.String r3 = "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"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r7[r12] = r1     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r7[r9] = r11     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            if (r5 != 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzaru r5 = r0.zzg     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            byte[] r7 = r0.zzh     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            byte[] r3 = r5.zzb(r7, r3)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r8 = 33
            if (r7 < r8) goto L_0x00ed
            r4.setReadOnly()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
        L_0x00ed:
            int r7 = r3.length     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r5.write(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
        L_0x00f4:
            r0.zzx(r1, r11)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0129 }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x0129 }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x0129 }
            android.content.Context r8 = r0.zza     // Catch:{ all -> 0x0129 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0129 }
            r3.<init>(r5, r7, r2, r8)     // Catch:{ all -> 0x0129 }
            r0.zzf = r3     // Catch:{ all -> 0x0129 }
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r2[r12] = r1     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r2[r9] = r11     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.String r10 = java.lang.String.format(r10, r2)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            zzz(r10)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            com.google.android.gms.internal.ads.zzarj r10 = new com.google.android.gms.internal.ads.zzarj     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r0)     // Catch:{ zzasf -> 0x016e }
            r0.zzo = r10     // Catch:{ zzasf -> 0x016e }
            r0.zzq = r9     // Catch:{ zzasf -> 0x016e }
            goto L_0x016e
        L_0x0129:
            r2 = move-exception
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r3[r12] = r1     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            r3[r9] = r11     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            zzz(r9)     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
            throw r2     // Catch:{ FileNotFoundException -> 0x0153, IOException -> 0x014c, zzart -> 0x0145, NullPointerException -> 0x013e }
        L_0x013e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzasf r10 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r9)     // Catch:{ zzasf -> 0x016e }
            throw r10     // Catch:{ zzasf -> 0x016e }
        L_0x0145:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzasf r10 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r9)     // Catch:{ zzasf -> 0x016e }
            throw r10     // Catch:{ zzasf -> 0x016e }
        L_0x014c:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzasf r10 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r9)     // Catch:{ zzasf -> 0x016e }
            throw r10     // Catch:{ zzasf -> 0x016e }
        L_0x0153:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzasf r10 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r9)     // Catch:{ zzasf -> 0x016e }
            throw r10     // Catch:{ zzasf -> 0x016e }
        L_0x015a:
            com.google.android.gms.internal.ads.zzart r9 = new com.google.android.gms.internal.ads.zzart     // Catch:{ IllegalArgumentException -> 0x0160 }
            r9.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0160 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0160 }
        L_0x0160:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzart r10 = new com.google.android.gms.internal.ads.zzart     // Catch:{ zzart -> 0x0167 }
            r10.<init>(r1, r9)     // Catch:{ zzart -> 0x0167 }
            throw r10     // Catch:{ zzart -> 0x0167 }
        L_0x0167:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzasf r10 = new com.google.android.gms.internal.ads.zzasf     // Catch:{ zzasf -> 0x016e }
            r10.<init>(r9)     // Catch:{ zzasf -> 0x016e }
            throw r10     // Catch:{ zzasf -> 0x016e }
        L_0x016e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasp.zzg(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzasp");
    }

    /* access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c3 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9 A[SYNTHETIC, Splitter:B:42:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0 A[SYNTHETIC, Splitter:B:46:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ea A[SYNTHETIC, Splitter:B:54:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1 A[SYNTHETIC, Splitter:B:58:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzw(java.io.File r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r12 = "test"
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "1689111357674"
            r2[r4] = r5
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r4] = r5
            java.lang.String r11 = "%s/%s.dex"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r2.<init>(r11)
            boolean r11 = r2.exists()
            if (r11 != 0) goto L_0x0037
            return
        L_0x0037:
            long r6 = r2.length()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0042
            return
        L_0x0042:
            int r11 = (int) r6
            byte[] r11 = new byte[r11]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00e7, all -> 0x00d4 }
            r4.<init>(r2)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00e7, all -> 0x00d4 }
            int r6 = r4.read(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            if (r6 > 0) goto L_0x0058
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            zzy(r2)
            return
        L_0x0058:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r6.print(r12)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r6.print(r12)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r6.print(r12)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzapm r12 = com.google.android.gms.internal.ads.zzapn.zza()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            byte[] r6 = r6.getBytes()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgsr r7 = com.google.android.gms.internal.ads.zzgsr.zzb     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            int r7 = r6.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgsr r6 = com.google.android.gms.internal.ads.zzgsr.zzv(r6, r3, r7)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r12.zzc(r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            byte[] r5 = r5.getBytes()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            int r6 = r5.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgsr r5 = com.google.android.gms.internal.ads.zzgsr.zzv(r5, r3, r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r12.zzd(r5)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzaru r5 = r10.zzg     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            byte[] r6 = r10.zzh     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            java.lang.String r11 = r5.zza(r6, r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            byte[] r11 = r11.getBytes()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            int r5 = r11.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgsr r5 = com.google.android.gms.internal.ads.zzgsr.zzv(r11, r3, r5)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r12.zza(r5)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            byte[] r11 = com.google.android.gms.internal.ads.zzaqd.zze(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            int r5 = r11.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgsr r11 = com.google.android.gms.internal.ads.zzgsr.zzv(r11, r3, r5)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r12.zzb(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r0.createNewFile()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            r11.<init>(r0)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgtz r12 = r12.zzal()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            com.google.android.gms.internal.ads.zzapn r12 = (com.google.android.gms.internal.ads.zzapn) r12     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            byte[] r12 = r12.zzax()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            int r0 = r12.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            r11.write(r12, r3, r0)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            r11.close()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00d2, all -> 0x00ca }
            r4.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            r11.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            zzy(r2)
            return
        L_0x00ca:
            r12 = move-exception
            goto L_0x00cf
        L_0x00cc:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00cf:
            r1 = r4
            goto L_0x00d7
        L_0x00d1:
            r11 = r1
        L_0x00d2:
            r1 = r4
            goto L_0x00e8
        L_0x00d4:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00d7:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ IOException -> 0x00dd }
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            if (r11 == 0) goto L_0x00e3
            r11.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            zzy(r2)
            throw r12
        L_0x00e7:
            r11 = r1
        L_0x00e8:
            if (r1 == 0) goto L_0x00ef
            r1.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r11 == 0) goto L_0x00f4
            r11.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            zzy(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasp.zzw(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|31|32|33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d4 */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: zzart | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3 A[SYNTHETIC, Splitter:B:61:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ea A[SYNTHETIC, Splitter:B:65:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f1 A[SYNTHETIC, Splitter:B:72:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8 A[SYNTHETIC, Splitter:B:76:0x00f8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzx(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r11 = new java.io.File
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            r3 = 1
            java.lang.String r4 = "1689111357674"
            r1[r3] = r4
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r11.<init>(r1)
            boolean r1 = r11.exists()
            if (r1 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.io.File r1 = new java.io.File
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r3] = r4
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 != 0) goto L_0x00fb
            r10 = 0
            long r5 = r11.length()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            zzy(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            return r2
        L_0x0043:
            int r0 = (int) r5     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            byte[] r0 = new byte[r0]     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            r5.<init>(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00df }
            int r6 = r5.read(r0)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            if (r6 > 0) goto L_0x0058
            zzy(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r5.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.zzgtl r6 = com.google.android.gms.internal.ads.zzgtl.zza()     // Catch:{ NullPointerException -> 0x00d4, zzart | IOException | NoSuchAlgorithmException -> 0x00dc, zzart | IOException | NoSuchAlgorithmException -> 0x00dc }
            com.google.android.gms.internal.ads.zzapn r0 = com.google.android.gms.internal.ads.zzapn.zzd(r0, r6)     // Catch:{ NullPointerException -> 0x00d4, zzart | IOException | NoSuchAlgorithmException -> 0x00dc, zzart | IOException | NoSuchAlgorithmException -> 0x00dc }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            com.google.android.gms.internal.ads.zzgsr r7 = r0.zzh()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r7 = r7.zzA()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r6.<init>(r7)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            boolean r4 = r4.equals(r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            if (r4 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.zzgsr r4 = r0.zzf()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r4 = r4.zzA()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            com.google.android.gms.internal.ads.zzgsr r6 = r0.zze()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r6 = r6.zzA()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r6 = com.google.android.gms.internal.ads.zzaqd.zze(r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            if (r4 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.zzgsr r4 = r0.zzg()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r4 = r4.zzA()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            if (r4 != 0) goto L_0x00a2
            goto L_0x00cd
        L_0x00a2:
            com.google.android.gms.internal.ads.zzaru r11 = r9.zzg     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r4 = r9.zzh     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            com.google.android.gms.internal.ads.zzgsr r0 = r0.zze()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r0 = r0.zzA()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r6.<init>(r0)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            byte[] r11 = r11.zzb(r4, r6)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r1.createNewFile()     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r0.<init>(r1)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            int r10 = r11.length     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00ca }
            r0.write(r11, r2, r10)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00ca }
            r5.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            r0.close()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            return r3
        L_0x00ca:
            r10 = move-exception
            r11 = r10
            goto L_0x00da
        L_0x00cd:
            zzy(r11)     // Catch:{ zzart | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00d8 }
            r5.close()     // Catch:{ IOException -> 0x00d3 }
        L_0x00d3:
            return r2
        L_0x00d4:
            r5.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            return r2
        L_0x00d8:
            r11 = move-exception
            r0 = r10
        L_0x00da:
            r10 = r5
            goto L_0x00e1
        L_0x00dc:
            r0 = r10
        L_0x00dd:
            r10 = r5
            goto L_0x00ef
        L_0x00df:
            r11 = move-exception
            r0 = r10
        L_0x00e1:
            if (r10 == 0) goto L_0x00e8
            r10.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00e8
        L_0x00e7:
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            r0.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            throw r11
        L_0x00ee:
            r0 = r10
        L_0x00ef:
            if (r10 == 0) goto L_0x00f6
            r10.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x00f6
        L_0x00f5:
        L_0x00f6:
            if (r0 == 0) goto L_0x00fb
            r0.close()     // Catch:{ IOException -> 0x00fb }
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasp.zzx(java.io.File, java.lang.String):boolean");
    }

    private static final void zzy(File file) {
        if (!file.exists()) {
            String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()});
            return;
        }
        file.delete();
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        if (this.zzo != null) {
            return zzarj.zzd();
        }
        return Integer.MIN_VALUE;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzapj zzc() {
        return this.zzm;
    }

    public final zzarj zzd() {
        return this.zzo;
    }

    public final zzaru zze() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final zzasi zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (!this.zzj) {
            return null;
        }
        if (this.zzi != null) {
            return this.zzi;
        }
        Future future = this.zzk;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzk = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzk.cancel(true);
            }
        }
        return this.zzi;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzauc zzauc = (zzauc) this.zzp.get(new Pair(str, str2));
        if (zzauc == null) {
            return null;
        }
        return zzauc.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(int i10, boolean z10) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzasn(this, i10, true));
            if (i10 == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.zzp.containsKey(pair)) {
            return false;
        }
        this.zzp.put(pair, new zzauc(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}
