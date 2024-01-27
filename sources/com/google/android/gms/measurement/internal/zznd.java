package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import w0.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zznd extends zzic {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd = new AtomicLong(0);
    private int zze;
    private a zzf;
    private Boolean zzg;
    private Integer zzh = null;

    zznd(zzhf zzhf) {
        super(zzhf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r15 = this;
            r7 = r15
            r8 = r18
            r0 = r19
            r1 = r20
            r15.zzt()
            boolean r2 = zza((java.lang.Object) r19)
            java.lang.String r3 = "param"
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0091
            if (r23 == 0) goto L_0x008e
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzik.zzc
            boolean r2 = zza((java.lang.String) r8, (java.lang.String[]) r2)
            if (r2 != 0) goto L_0x0021
            r0 = 20
            return r0
        L_0x0021:
            com.google.android.gms.measurement.internal.zzhf r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzkp r2 = r2.zzr()
            boolean r2 = r2.zzai()
            if (r2 != 0) goto L_0x0030
            r0 = 25
            return r0
        L_0x0030:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == 0) goto L_0x003b
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0046
        L_0x003b:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x005b
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0046:
            if (r5 <= r4) goto L_0x005b
            com.google.android.gms.measurement.internal.zzfr r6 = r15.zzj()
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzv()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r6.zza(r11, r3, r8, r5)
            r5 = 0
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x0091
            r5 = 17
            if (r2 == 0) goto L_0x0072
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r4) goto L_0x008b
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x008b
        L_0x0072:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x008b
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r4) goto L_0x008b
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r9, r4)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x008b:
            r11 = 17
            goto L_0x0092
        L_0x008e:
            r0 = 21
            return r0
        L_0x0091:
            r11 = 0
        L_0x0092:
            boolean r1 = zzg(r17)
            if (r1 != 0) goto L_0x00b2
            boolean r1 = zzg(r18)
            if (r1 == 0) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            com.google.android.gms.measurement.internal.zzaf r1 = r15.zze()
            com.google.android.gms.measurement.internal.zzhf r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzh()
            java.lang.String r2 = r2.zzad()
            int r1 = r1.zzb(r2)
            goto L_0x00c4
        L_0x00b2:
            com.google.android.gms.measurement.internal.zzaf r1 = r15.zze()
            com.google.android.gms.measurement.internal.zzhf r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzh()
            java.lang.String r2 = r2.zzad()
            int r1 = r1.zzc(r2)
        L_0x00c4:
            boolean r1 = r15.zza((java.lang.String) r3, (java.lang.String) r8, (int) r1, (java.lang.Object) r0)
            if (r1 == 0) goto L_0x00cb
            return r11
        L_0x00cb:
            if (r23 == 0) goto L_0x0161
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e5
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
        L_0x00e2:
            r9 = 1
            goto L_0x015e
        L_0x00e5:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011c
            r12 = r0
            android.os.Parcelable[] r12 = (android.os.Parcelable[]) r12
            int r13 = r12.length
            r14 = 0
        L_0x00ee:
            if (r14 >= r13) goto L_0x00e2
            r0 = r12[r14]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0108
            com.google.android.gms.measurement.internal.zzfr r1 = r15.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzv()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.zza(r2, r0, r8)
            goto L_0x015e
        L_0x0108:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
            int r14 = r14 + 1
            goto L_0x00ee
        L_0x011c:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x015e
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            r0 = 0
        L_0x0128:
            if (r0 >= r13) goto L_0x00e2
            java.lang.Object r1 = r12.get(r0)
            int r14 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014b
            com.google.android.gms.measurement.internal.zzfr r0 = r15.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzv()
            if (r1 == 0) goto L_0x0143
            java.lang.Class r1 = r1.getClass()
            goto L_0x0145
        L_0x0143:
            java.lang.String r1 = "null"
        L_0x0145:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.zza(r2, r1, r8)
            goto L_0x015e
        L_0x014b:
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
            r0 = r14
            goto L_0x0128
        L_0x015e:
            if (r9 == 0) goto L_0x0161
            return r11
        L_0x0161:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznd.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static int zzc() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    private final int zzk(String str) {
        if (!zzb("event param", str)) {
            return 3;
        }
        if (!zza("event param", (String[]) null, str)) {
            return 14;
        }
        if (!zza("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int zzl(String str) {
        if (!zzc("event param", str)) {
            return 3;
        }
        if (!zza("event param", (String[]) null, str)) {
            return 14;
        }
        if (!zza("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private static int zzm(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (!"_lgclid".equals(str) && !"_gbraid".equals(str)) {
            return 36;
        }
        return 100;
    }

    static MessageDigest zzu() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @TargetApi(30)
    private final boolean zzy() {
        Integer num;
        if (this.zzg == null) {
            a zzn = zzn();
            boolean z10 = false;
            if (zzn == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = zzn.b().get(10000, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (InterruptedException e12) {
                        e = e12;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    }
                }
                this.zzg = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                e = e14;
                zzj().zzu().zza("Measurement manager api exception", e);
                this.zzg = Boolean.FALSE;
                num = num2;
                zzj().zzp().zza("Measurement manager api status result", num);
                return this.zzg.booleanValue();
            }
            zzj().zzp().zza("Measurement manager api status result", num);
        }
        return this.zzg.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int zzb(String str) {
        if (!zzb("user property", str)) {
            return 6;
        }
        if (!zza("user property", zzij.zza, str)) {
            return 15;
        }
        if (!zza("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final int zzg() {
        if (this.zzh == null) {
            this.zzh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.zzh.intValue();
    }

    /* access modifiers changed from: package-private */
    public final long zzh() {
        long j10;
        zzt();
        if (!zzd(this.zzu.zzh().zzad())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            j10 = zzc() < zzbi.zzau.zza(null).intValue() ? 16 : 0;
        }
        if (!zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !zzy()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1;
        }
        return j10;
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    /* access modifiers changed from: package-private */
    public final a zzn() {
        if (this.zzf == null) {
            this.zzf = a.a(zza());
        }
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final boolean zzo() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String zzp() {
        byte[] bArr = new byte[16];
        zzv().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom zzv() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzw() {
        zzt();
        return zzh() == 1;
    }

    public final boolean zzx() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzz() {
        zzt();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().zzu().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(nextLong);
    }

    static boolean zzd(String str) {
        String zza2 = zzbi.zzay.zza(null);
        return zza2.equals("*") || Arrays.asList(zza2.split(",")).contains(str);
    }

    public static boolean zzj(String str) {
        for (String equals : zzb) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(String str) {
        zzt();
        if (Wrappers.packageManager(zza()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().zzc().zza("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zze().zzn().equals(str);
    }

    public final boolean zzi(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (!TextUtils.isEmpty(str) && (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) != null && !queryIntentActivities.isEmpty()) {
            return true;
        }
        return false;
    }

    static boolean zzg(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean zzn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzb(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzb2 = zzb(str, bundle.get(str));
                if (zzb2 == null) {
                    zzj().zzv().zza("Param value can't be null", zzi().zzb(str));
                } else {
                    zza(bundle2, str, zzb2);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final long zzc(String str) {
        if (zza().getPackageManager() == null) {
            return 0;
        }
        int i10 = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i10 = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().zzn().zza("PackageManager failed to find running app: app_id", str);
        }
        return (long) i10;
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final long zzm() {
        long andIncrement;
        long j10;
        if (this.zzd.get() == 0) {
            synchronized (this.zzd) {
                long nextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
                int i10 = this.zze + 1;
                this.zze = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.zzd) {
            this.zzd.compareAndSet(-1, 1);
            andIncrement = this.zzd.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final Object zzc(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzm(str), obj, true, false);
        }
        return zza(zzm(str), obj, false, false);
    }

    static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(String str, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzj().zzh().zza("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object zzb(String str, Object obj) {
        int i10;
        if ("_ev".equals(str)) {
            return zza(zze().zzc(this.zzu.zzh().zzad()), obj, true, true);
        }
        if (zzg(str)) {
            i10 = zze().zzc(this.zzu.zzh().zzad());
        } else {
            i10 = zze().zzb(this.zzu.zzh().zzad());
        }
        return zza(i10, obj, false, true);
    }

    public static ArrayList<Bundle> zzb(List<zzad> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzad next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.zza);
            bundle.putString("origin", next.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, next.zzd);
            bundle.putString("name", next.zzc.zza);
            zzie.zza(bundle, Preconditions.checkNotNull(next.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, next.zze);
            String str = next.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbg zzbg = next.zzg;
            if (zzbg != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbg.zza);
                zzbb zzbb = zzbg.zzb;
                if (zzbb != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbb.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, next.zzh);
            zzbg zzbg2 = next.zzi;
            if (zzbg2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbg2.zza);
                zzbb zzbb2 = zzbg2.zzb;
                if (zzbb2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbb2.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, next.zzc.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, next.zzj);
            zzbg zzbg3 = next.zzk;
            if (zzbg3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbg3.zza);
                zzbb zzbb3 = zzbg3.zzb;
                if (zzbb3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbb3.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean zzc(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza(String str, Object obj) {
        boolean z10;
        if ("_ldl".equals(str)) {
            z10 = zza("user property referrer", str, zzm(str), obj);
        } else {
            z10 = zza("user property", str, zzm(str), obj);
        }
        return z10 ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final int zza(String str) {
        if (!zzb("event", str)) {
            return 2;
        }
        if (!zza("event", zzii.zza, zzii.zzb, str)) {
            return 13;
        }
        if (!zza("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    private static boolean zzb(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    public final int zza(int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    public final long zza(Context context, String str) {
        zzt();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest zzu = zzu();
        if (zzu == null) {
            zzj().zzg().zza("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!zzb(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return zza(zzu.digest(signatureArr[0].toByteArray()));
                    }
                    zzj().zzu().zza("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                zzj().zzg().zza("Package name not found", e10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(String str, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzj().zzh().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    static long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i10 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j10 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
            length--;
        }
        return j10;
    }

    private final boolean zzb(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            zzj().zzg().zza("Error obtaining certificate", e10);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            zzj().zzg().zza("Package name not found", e11);
            return true;
        }
    }

    public static long zza(zzbb zzbb) {
        long j10 = 0;
        if (zzbb == null) {
            return 0;
        }
        Iterator<String> it = zzbb.iterator();
        while (it.hasNext()) {
            Object zzc2 = zzbb.zzc(it.next());
            if (zzc2 instanceof Parcelable[]) {
                j10 += (long) ((Parcelable[]) zzc2).length;
            }
        }
        return j10;
    }

    public static long zza(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Bundle zza(List<zznc> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zznc next : list) {
            String str = next.zzd;
            if (str != null) {
                bundle.putString(next.zza, str);
            } else {
                Long l10 = next.zzc;
                if (l10 != null) {
                    bundle.putLong(next.zza, l10.longValue());
                } else {
                    Double d10 = next.zzf;
                    if (d10 != null) {
                        bundle.putDouble(next.zza, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle zza(Uri uri, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                str5 = z11 ? uri2.getQueryParameter("gbraid") : null;
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = z10 ? uri2.getQueryParameter("sfmc_id") : null;
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && ((!z11 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z10 || TextUtils.isEmpty(str)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("medium", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (z11 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter6);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter8);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (z10 && !TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().zzu().zza("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public static Bundle zza(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzii.zzd
            boolean r13 = zza((java.lang.String) r10, (java.lang.String[]) r0)
            if (r11 == 0) goto L_0x00e8
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.zzaf r0 = r19.zze()
            int r8 = r0.zzg()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0046
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0054
        L_0x0046:
            if (r24 != 0) goto L_0x004d
            int r0 = r9.zzl(r7)
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0054
            int r0 = r9.zzk(r7)
        L_0x0054:
            if (r0 == 0) goto L_0x0064
            r1 = 3
            if (r0 != r1) goto L_0x005b
            r1 = r7
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            zza((android.os.Bundle) r15, (int) r0, (java.lang.String) r7, (java.lang.String) r7, (java.lang.Object) r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a0
        L_0x0064:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0085
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            zza((android.os.Bundle) r15, (int) r0, (java.lang.String) r14, (java.lang.String) r14, (java.lang.Object) r1)
            goto L_0x00a4
        L_0x0085:
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a4
            r1 = 21
            if (r0 != r1) goto L_0x0095
            r7 = r10
            goto L_0x0096
        L_0x0095:
            r7 = r14
        L_0x0096:
            java.lang.Object r1 = r11.get(r14)
            zza((android.os.Bundle) r15, (int) r0, (java.lang.String) r7, (java.lang.String) r14, (java.lang.Object) r1)
            r15.remove(r14)
        L_0x00a0:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a4:
            boolean r0 = zzh(r14)
            if (r0 == 0) goto L_0x00a0
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.zzfr r2 = r19.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzh()
            com.google.android.gms.measurement.internal.zzfq r3 = r19.zzi()
            java.lang.String r3 = r3.zza((java.lang.String) r10)
            com.google.android.gms.measurement.internal.zzfq r4 = r19.zzi()
            java.lang.String r4 = r4.zza((android.os.Bundle) r11)
            r2.zza(r1, r3, r4)
            r1 = 5
            zzb((android.os.Bundle) r15, (int) r1)
            r15.remove(r14)
        L_0x00e3:
            r18 = r0
            goto L_0x00a0
        L_0x00e6:
            r14 = r15
            goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznd.zza(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final zzbg zza(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zza(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle zza2 = zza(str, str2, bundle3, (List<String>) CollectionUtils.listOf("_o"), true);
            if (z10) {
                zza2 = zzb(zza2);
            }
            Preconditions.checkNotNull(zza2);
            return new zzbg(str2, new zzbb(zza2), str3, j10);
        }
        zzj().zzg().zza("Invalid conditional property event name", zzi().zzc(str2));
        throw new IllegalArgumentException();
    }

    private final Object zza(int i10, Object obj, boolean z10, boolean z11) {
        Bundle zzb2;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zza(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (zzb2 = zzb((Bundle) parcelable)) != null && !zzb2.isEmpty()) {
                    arrayList.add(zzb2);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static String zza(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i10));
        return substring + "...";
    }

    public final URL zza(long j10, String str, String str2, long j11, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j10), Integer.valueOf(zzg())}), str2, str, Long.valueOf(j11)});
            if (str.equals(zze().zzo())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().zzu().zza("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    private static void zza(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (zzb(bundle, i10)) {
            bundle.putString("_ev", zza(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public static void zza(zzki zzki, Bundle bundle, boolean z10) {
        if (bundle != null && zzki != null && (!bundle.containsKey("_sc") || z10)) {
            String str = zzki.zza;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = zzki.zzb;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzki.zzc);
        } else if (bundle != null && zzki == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    zzq().zza(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Parcelable[] parcelableArr, int i10, boolean z10) {
        Preconditions.checkNotNull(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzh(str) && !zza(str, zzik.zzd) && (i11 = i11 + 1) > i10) {
                    if (z10) {
                        zzj().zzh().zza("Param can't contain more than " + i10 + " item-scoped custom parameters", zzi().zzb(str), zzi().zza(bundle));
                        zzb(bundle, 28);
                    } else {
                        zzj().zzh().zza("Param cannot contain item-scoped custom parameters", zzi().zzb(str), zzi().zza(bundle));
                        zzb(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzfv zzfv, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(zzfv.zzb.keySet())) {
            if (zzh(str) && (i11 = i11 + 1) > i10) {
                zzj().zzh().zza("Event can't contain more than " + i10 + " params", zzi().zza(zzfv.zza), zzi().zza(zzfv.zzb));
                zzb(zzfv.zzb, 5);
                zzfv.zzb.remove(str);
            }
        }
    }

    public static void zza(zznf zznf, int i10, String str, String str2, int i11) {
        zza(zznf, (String) null, i10, str, str2, i11);
    }

    static void zza(zznf zznf, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        zzb(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        zznf.zza(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                zzj().zzv().zza("Not putting event parameter. Invalid value type. name, type", zzi().zzb(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void zza(zzcv zzcv, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, Bundle bundle) {
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", e10);
        }
    }

    public final void zza(zzcv zzcv, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", e10);
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int i11;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            int zzc2 = zze().zzc();
            int i12 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i10 = !z10 ? zzl(str6) : 0;
                    if (i10 == 0) {
                        i10 = zzk(str6);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    zza(bundle2, i10, str6, str6, (Object) i10 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (zza(bundle2.get(str6))) {
                        zzj().zzv().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i11 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i11 = zza(str, str2, str6, bundle2.get(str6), bundle, list, z10, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        zza(bundle2, i11, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (zzh(str4) && !zza(str4, zzik.zzd)) {
                        int i13 = i12 + 1;
                        if (!zza(231100000, true)) {
                            zzj().zzh().zza("Item array not supported on client's version of Google Play Services (Android Only)", zzi().zza(str5), zzi().zza(bundle2));
                            zzb(bundle2, 23);
                            bundle2.remove(str4);
                        } else if (i13 > zzc2) {
                            if (!zzot.zza() || !zze().zza(zzbi.zzcc)) {
                                zzj().zzh().zza("Item cannot contain custom parameters", zzi().zza(str5), zzi().zza(bundle2));
                                zzb(bundle2, 23);
                                bundle2.remove(str4);
                            } else {
                                zzft zzh2 = zzj().zzh();
                                zzh2.zza("Item can't contain more than " + zzc2 + " item-scoped custom params", zzi().zza(str5), zzi().zza(bundle2));
                                zzb(bundle2, 28);
                                bundle2.remove(str4);
                            }
                        }
                        i12 = i13;
                    }
                }
            }
        }
    }

    private static boolean zza(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String zza2 : strArr) {
            if (zzng.zza(str, zza2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzn(str)) {
                return true;
            }
            if (this.zzu.zzae()) {
                zzj().zzh().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzfr.zza(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.zzu.zzae()) {
                zzj().zzh().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (zzn(str2)) {
            return true;
        } else {
            zzj().zzh().zza("Invalid admob_app_id. Analytics disabled.", zzfr.zza(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            zzj().zzh().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, String[] strArr, String str2) {
        return zza(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            zzj().zzh().zza("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !zza(str2, strArr) || (strArr2 != null && zza(str2, strArr2))) {
            return true;
        } else {
            zzj().zzh().zza("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    static boolean zza(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean zza(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zza(int i10, boolean z10) {
        Boolean zzab = this.zzu.zzr().zzab();
        if (zzg() < i10 / 1000) {
            return zzab != null && !zzab.booleanValue();
        }
        return true;
    }

    static boolean zza(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean zza(Context context, boolean z10) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzc(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean zza(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(Constants.TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    static boolean zza(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean zza(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty || !isEmpty2) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
