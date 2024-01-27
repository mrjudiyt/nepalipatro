package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzgd;
import z1.d;
import z1.o;
import z1.v;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class l implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5488a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f5489b = false;

    /* renamed from: c  reason: collision with root package name */
    private d f5490c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f5491d;

    /* synthetic */ l(d dVar, d dVar2, o oVar) {
        this.f5491d = dVar;
        this.f5490c = dVar2;
    }

    private final void d(f fVar) {
        synchronized (this.f5488a) {
            d dVar = this.f5490c;
            if (dVar != null) {
                dVar.onBillingSetupFinished(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b3, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b6, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Exception while checking if billing is supported; try to reconnect", r0);
        r14.f5491d.f5362a = 0;
        r14.f5491d.f5368g = null;
        r7 = 42;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ca, code lost:
        if (r8 != 0) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cc, code lost:
        r14.f5491d.f5367f.c(z1.v.b(6));
        d(com.android.billingclient.api.o.f5513l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01df, code lost:
        r0 = r14.f5491d.f5367f;
        r3 = com.android.billingclient.api.o.f5502a;
        r0.b(z1.v.a(r7, 6, r3));
        d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r0 = new android.os.Bundle();
        r0.putString("accountName", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5 = r14.f5491d.f5366e.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r7 = 20;
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r7 < 3) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r14.f5491d.f5368g.zzq(r7, r5, "subs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r8 = r14.f5491d.f5368g.zzc(r7, r5, "subs", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r8 != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "highestLevelSupportedForSubs: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        r9 = r14.f5491d;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r7 < 5) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r9.f5371j = r10;
        r9 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r7 < 3) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r9.f5370i = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r7 >= 3) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "In-app billing API does not support subscription on this device.");
        r7 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r10 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r10 < 3) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r0 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        r8 = r14.f5491d.f5368g.zzq(r10, r5, "inapp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r8 = r14.f5491d.f5368g.zzc(r10, r5, "inapp", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r8 != 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        r14.f5491d.f5372k = r10;
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "mHighestLevelSupportedForInApp: " + r14.f5491d.f5372k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
        r10 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d4, code lost:
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        if (r0.f5372k < 20) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        r0.f5384w = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r0.f5372k < 19) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ec, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r0.f5383v = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
        if (r0.f5372k < 18) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        r0.f5382u = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r0.f5372k < 17) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        r0.f5381t = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011a, code lost:
        if (r0.f5372k < 16) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        r0.f5380s = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        if (r0.f5372k < 15) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        r0.f5379r = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013a, code lost:
        if (r0.f5372k < 14) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013f, code lost:
        r0.f5378q = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014a, code lost:
        if (r0.f5372k < 12) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014f, code lost:
        r0.f5377p = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015a, code lost:
        if (r0.f5372k < 10) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015f, code lost:
        r0.f5376o = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0168, code lost:
        if (r0.f5372k < 9) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016d, code lost:
        r0.f5375n = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0178, code lost:
        if (r0.f5372k < 8) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017d, code lost:
        r0.f5374m = r5;
        r0 = r14.f5491d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        if (r0.f5372k < 6) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0189, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018a, code lost:
        r0.f5373l = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0193, code lost:
        if (r14.f5491d.f5372k >= 3) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0195, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "In-app billing API version 3 is not supported on this device.");
        r7 = 36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019e, code lost:
        if (r8 != 0) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a0, code lost:
        r14.f5491d.f5362a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a7, code lost:
        r14.f5491d.f5362a = 0;
        r14.f5491d.f5368g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f5488a
            monitor-enter(r0)
            boolean r1 = r14.f5489b     // Catch:{ all -> 0x01f2 }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x01f2 }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x01f2 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accountName"
            r0.putString(r1, r2)
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            r1 = 6
            r3 = 3
            r4 = 0
            com.android.billingclient.api.d r5 = r14.f5491d     // Catch:{ Exception -> 0x01b5 }
            android.content.Context r5 = r5.f5366e     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x01b5 }
            r6 = 20
            r7 = 20
            r8 = 3
        L_0x002f:
            if (r7 < r3) goto L_0x0068
            if (r0 != 0) goto L_0x0040
            com.android.billingclient.api.d r9 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zze r9 = r9.f5368g     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r10 = "subs"
            int r8 = r9.zzq(r7, r5, r10)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x004c
        L_0x0040:
            com.android.billingclient.api.d r9 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zze r9 = r9.f5368g     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r10 = "subs"
            int r8 = r9.zzc(r7, r5, r10, r0)     // Catch:{ Exception -> 0x01b2 }
        L_0x004c:
            if (r8 != 0) goto L_0x0065
            java.lang.String r9 = "BillingClient"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b2 }
            r10.<init>()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r11 = "highestLevelSupportedForSubs: "
            r10.append(r11)     // Catch:{ Exception -> 0x01b2 }
            r10.append(r7)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zzb.zzi(r9, r10)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x0069
        L_0x0065:
            int r7 = r7 + -1
            goto L_0x002f
        L_0x0068:
            r7 = 0
        L_0x0069:
            com.android.billingclient.api.d r9 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            r10 = 5
            r11 = 1
            if (r7 < r10) goto L_0x0071
            r10 = 1
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            r9.f5371j = r10     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r9 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            if (r7 < r3) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            r9.f5370i = r10     // Catch:{ Exception -> 0x01b2 }
            r9 = 9
            if (r7 >= r3) goto L_0x008d
            java.lang.String r7 = "BillingClient"
            java.lang.String r10 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zzb.zzi(r7, r10)     // Catch:{ Exception -> 0x01b2 }
            r7 = 9
            goto L_0x008e
        L_0x008d:
            r7 = 1
        L_0x008e:
            r10 = 20
        L_0x0090:
            if (r10 < r3) goto L_0x00d4
            if (r0 != 0) goto L_0x00a1
            com.android.billingclient.api.d r12 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zze r12 = r12.f5368g     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r13 = "inapp"
            int r8 = r12.zzq(r10, r5, r13)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x00ad
        L_0x00a1:
            com.android.billingclient.api.d r12 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zze r12 = r12.f5368g     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r13 = "inapp"
            int r8 = r12.zzc(r10, r5, r13, r0)     // Catch:{ Exception -> 0x01b2 }
        L_0x00ad:
            if (r8 != 0) goto L_0x00d1
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            r0.f5372k = r10     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r0 = "BillingClient"
            com.android.billingclient.api.d r5 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r5.f5372k     // Catch:{ Exception -> 0x01b2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b2 }
            r10.<init>()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r12 = "mHighestLevelSupportedForInApp: "
            r10.append(r12)     // Catch:{ Exception -> 0x01b2 }
            r10.append(r5)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x01b2 }
            com.google.android.gms.internal.play_billing.zzb.zzi(r0, r5)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x00d4
        L_0x00d1:
            int r10 = r10 + -1
            goto L_0x0090
        L_0x00d4:
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            if (r5 < r6) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            r0.f5384w = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 19
            if (r5 < r6) goto L_0x00ee
            r5 = 1
            goto L_0x00ef
        L_0x00ee:
            r5 = 0
        L_0x00ef:
            r0.f5383v = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 18
            if (r5 < r6) goto L_0x00fe
            r5 = 1
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            r0.f5382u = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 17
            if (r5 < r6) goto L_0x010e
            r5 = 1
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            r0.f5381t = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 16
            if (r5 < r6) goto L_0x011e
            r5 = 1
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            r0.f5380s = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 15
            if (r5 < r6) goto L_0x012e
            r5 = 1
            goto L_0x012f
        L_0x012e:
            r5 = 0
        L_0x012f:
            r0.f5379r = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 14
            if (r5 < r6) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            r0.f5378q = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 12
            if (r5 < r6) goto L_0x014e
            r5 = 1
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            r0.f5377p = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 10
            if (r5 < r6) goto L_0x015e
            r5 = 1
            goto L_0x015f
        L_0x015e:
            r5 = 0
        L_0x015f:
            r0.f5376o = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            if (r5 < r9) goto L_0x016c
            r5 = 1
            goto L_0x016d
        L_0x016c:
            r5 = 0
        L_0x016d:
            r0.f5375n = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            r6 = 8
            if (r5 < r6) goto L_0x017c
            r5 = 1
            goto L_0x017d
        L_0x017c:
            r5 = 0
        L_0x017d:
            r0.f5374m = r5     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r5 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            if (r5 < r1) goto L_0x0189
            goto L_0x018a
        L_0x0189:
            r11 = 0
        L_0x018a:
            r0.f5373l = r11     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            int r0 = r0.f5372k     // Catch:{ Exception -> 0x01b2 }
            if (r0 >= r3) goto L_0x019e
            java.lang.String r0 = "BillingClient"
            java.lang.String r3 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zzb.zzj(r0, r3)     // Catch:{ Exception -> 0x01b2 }
            r7 = 36
        L_0x019e:
            if (r8 != 0) goto L_0x01a7
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            r3 = 2
            r0.f5362a = r3     // Catch:{ Exception -> 0x01b2 }
            goto L_0x01ca
        L_0x01a7:
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            r0.f5362a = r4     // Catch:{ Exception -> 0x01b2 }
            com.android.billingclient.api.d r0 = r14.f5491d     // Catch:{ Exception -> 0x01b2 }
            r0.f5368g = r2     // Catch:{ Exception -> 0x01b2 }
            goto L_0x01ca
        L_0x01b2:
            r0 = move-exception
            r3 = r8
            goto L_0x01b6
        L_0x01b5:
            r0 = move-exception
        L_0x01b6:
            java.lang.String r5 = "BillingClient"
            java.lang.String r6 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzk(r5, r6, r0)
            com.android.billingclient.api.d r0 = r14.f5491d
            r0.f5362a = r4
            com.android.billingclient.api.d r0 = r14.f5491d
            r0.f5368g = r2
            r7 = 42
            r8 = r3
        L_0x01ca:
            if (r8 != 0) goto L_0x01df
            com.android.billingclient.api.d r0 = r14.f5491d
            com.android.billingclient.api.n r0 = r0.f5367f
            com.google.android.gms.internal.play_billing.zzff r1 = z1.v.b(r1)
            r0.c(r1)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.o.f5513l
            r14.d(r0)
            goto L_0x01f1
        L_0x01df:
            com.android.billingclient.api.d r0 = r14.f5491d
            com.android.billingclient.api.n r0 = r0.f5367f
            com.android.billingclient.api.f r3 = com.android.billingclient.api.o.f5502a
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r7, r1, r3)
            r0.b(r1)
            r14.d(r3)
        L_0x01f1:
            return r2
        L_0x01f2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01f2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.l.a():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f5491d.f5362a = 0;
        this.f5491d.f5368g = null;
        n O = this.f5491d.f5367f;
        f fVar = o.f5515n;
        O.b(v.a(24, 6, fVar));
        d(fVar);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.f5488a) {
            this.f5490c = null;
            this.f5489b = true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzi("BillingClient", "Billing service connected.");
        this.f5491d.f5368g = zzd.zzn(iBinder);
        d dVar = this.f5491d;
        if (dVar.E(new j(this), 30000, new k(this), dVar.A()) == null) {
            f P = this.f5491d.C();
            this.f5491d.f5367f.b(v.a(25, 6, P));
            d(P);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzj("BillingClient", "Billing service disconnected.");
        this.f5491d.f5367f.a(zzgd.zzw());
        this.f5491d.f5368g = null;
        this.f5491d.f5362a = 0;
        synchronized (this.f5488a) {
            d dVar = this.f5490c;
            if (dVar != null) {
                dVar.onBillingServiceDisconnected();
            }
        }
    }
}
