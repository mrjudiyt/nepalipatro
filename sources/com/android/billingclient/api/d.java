package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.f;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfh;
import com.google.android.gms.internal.play_billing.zzfj;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfw;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import z1.a;
import z1.a0;
import z1.b;
import z1.c;
import z1.e;
import z1.e0;
import z1.h;
import z1.i;
import z1.j;
import z1.k;
import z1.l;
import z1.m;
import z1.o;
import z1.q0;
import z1.v;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
class d extends c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile int f5362a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5363b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f5364c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a0 f5365d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f5366e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public n f5367f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile zze f5368g;

    /* renamed from: h  reason: collision with root package name */
    private volatile l f5369h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f5370i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f5371j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f5372k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f5373l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f5374m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f5375n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f5376o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f5377p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f5378q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f5379r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f5380s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f5381t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f5382u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f5383v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f5384w;

    /* renamed from: x  reason: collision with root package name */
    private s f5385x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f5386y;

    /* renamed from: z  reason: collision with root package name */
    private ExecutorService f5387z;

    private d(Context context, s sVar, k kVar, String str, String str2, c cVar, n nVar) {
        this.f5362a = 0;
        this.f5364c = new Handler(Looper.getMainLooper());
        this.f5372k = 0;
        this.f5363b = str;
        m(context, kVar, sVar, cVar, str, (n) null);
    }

    /* access modifiers changed from: private */
    public final Handler A() {
        return Looper.myLooper() == null ? this.f5364c : new Handler(Looper.myLooper());
    }

    private final f B(f fVar) {
        if (Thread.interrupted()) {
            return fVar;
        }
        this.f5364c.post(new l0(this, fVar));
        return fVar;
    }

    /* access modifiers changed from: private */
    public final f C() {
        if (this.f5362a == 0 || this.f5362a == 3) {
            return o.f5514m;
        }
        return o.f5511j;
    }

    @SuppressLint({"PrivateApi"})
    private static String D() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    /* access modifiers changed from: private */
    public final Future E(Callable callable, long j10, Runnable runnable, Handler handler) {
        if (this.f5387z == null) {
            this.f5387z = Executors.newFixedThreadPool(zzb.zza, new i(this));
        }
        try {
            Future submit = this.f5387z.submit(callable);
            handler.postDelayed(new q0(submit, runnable), (long) (((double) j10) * 0.95d));
            return submit;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    private final void F(String str, i iVar) {
        if (!f()) {
            n nVar = this.f5367f;
            f fVar = o.f5514m;
            nVar.b(v.a(2, 11, fVar));
            iVar.a(fVar, (List<PurchaseHistoryRecord>) null);
            return;
        }
        if (E(new n0(this, str, iVar), 30000, new f0(this, iVar), A()) == null) {
            f C = C();
            this.f5367f.b(v.a(25, 11, C));
            iVar.a(C, (List<PurchaseHistoryRecord>) null);
        }
    }

    private final void G(String str, j jVar) {
        if (!f()) {
            n nVar = this.f5367f;
            f fVar = o.f5514m;
            nVar.b(v.a(2, 9, fVar));
            jVar.a(fVar, zzu.zzk());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzj("BillingClient", "Please provide a valid product type.");
            n nVar2 = this.f5367f;
            f fVar2 = o.f5508g;
            nVar2.b(v.a(50, 9, fVar2));
            jVar.a(fVar2, zzu.zzk());
        } else {
            if (E(new m0(this, str, jVar), 30000, new k0(this, jVar), A()) == null) {
                f C = C();
                this.f5367f.b(v.a(25, 9, C));
                jVar.a(C, zzu.zzk());
            }
        }
    }

    private final void H(f fVar, int i10, int i11) {
        if (fVar.b() != 0) {
            n nVar = this.f5367f;
            zzfa zzv = zzfb.zzv();
            zzfh zzv2 = zzfj.zzv();
            zzv2.zzj(fVar.b());
            zzv2.zzi(fVar.a());
            zzv2.zzk(i10);
            zzv.zzi(zzv2);
            zzv.zzk(5);
            zzfu zzv3 = zzfw.zzv();
            zzv3.zzi(i11);
            zzv.zzj((zzfw) zzv3.zzc());
            nVar.b((zzfb) zzv.zzc());
            return;
        }
        n nVar2 = this.f5367f;
        zzfe zzv4 = zzff.zzv();
        zzv4.zzj(5);
        zzfu zzv5 = zzfw.zzv();
        zzv5.zzi(i11);
        zzv4.zzi((zzfw) zzv5.zzc());
        nVar2.c((zzff) zzv4.zzc());
    }

    static /* synthetic */ m N(d dVar, String str) {
        d dVar2 = dVar;
        zzb.zzi("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzc = zzb.zzc(dVar2.f5375n, dVar2.f5383v, true, false, dVar2.f5363b);
        String str2 = null;
        while (dVar2.f5373l) {
            try {
                Bundle zzh = dVar2.f5368g.zzh(6, dVar2.f5366e.getPackageName(), str, str2, zzc);
                x a10 = y.a(zzh, "BillingClient", "getPurchaseHistory()");
                f a11 = a10.a();
                if (a11 != o.f5513l) {
                    dVar2.f5367f.b(v.a(a10.b(), 11, a11));
                    return new m(a11, (List) null);
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i10 = 0;
                boolean z10 = false;
                while (i10 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    zzb.zzi("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.e())) {
                            zzb.zzj("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i10++;
                    } catch (JSONException e10) {
                        zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        n nVar = dVar2.f5367f;
                        f fVar = o.f5511j;
                        nVar.b(v.a(51, 11, fVar));
                        return new m(fVar, (List) null);
                    }
                }
                if (z10) {
                    dVar2.f5367f.b(v.a(26, 11, o.f5511j));
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new m(o.f5513l, arrayList);
                }
            } catch (RemoteException e11) {
                zzb.zzk("BillingClient", "Got exception trying to get purchase history, try to reconnect", e11);
                n nVar2 = dVar2.f5367f;
                f fVar2 = o.f5514m;
                nVar2.b(v.a(59, 11, fVar2));
                return new m(fVar2, (List) null);
            }
        }
        zzb.zzj("BillingClient", "getPurchaseHistory is not supported on current device");
        return new m(o.f5518q, (List) null);
    }

    private void m(Context context, k kVar, s sVar, c cVar, String str, n nVar) {
        this.f5366e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(str);
        zzv.zzi(this.f5366e.getPackageName());
        if (nVar != null) {
            this.f5367f = nVar;
        } else {
            this.f5367f = new p(this.f5366e, (zzfm) zzv.zzc());
        }
        if (kVar == null) {
            zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5365d = new a0(this.f5366e, kVar, cVar, this.f5367f);
        this.f5385x = sVar;
        this.f5386y = cVar != null;
    }

    static /* synthetic */ e0 z(d dVar, String str, int i10) {
        Bundle bundle;
        d dVar2 = dVar;
        zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        Bundle zzc = zzb.zzc(dVar2.f5375n, dVar2.f5383v, true, false, dVar2.f5363b);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (dVar2.f5375n) {
                    bundle = dVar2.f5368g.zzj(z10 != dVar2.f5383v ? 9 : 19, dVar2.f5366e.getPackageName(), str, str2, zzc);
                    String str3 = str;
                } else {
                    bundle = dVar2.f5368g.zzi(3, dVar2.f5366e.getPackageName(), str, str2);
                }
                x a10 = y.a(bundle, "BillingClient", "getPurchase()");
                f a11 = a10.a();
                if (a11 != o.f5513l) {
                    dVar2.f5367f.b(v.a(a10.b(), 9, a11));
                    return new e0(a11, list);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i11 = 0;
                boolean z11 = false;
                while (i11 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i11);
                    String str5 = stringArrayList3.get(i11);
                    zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str4, str5);
                        if (TextUtils.isEmpty(purchase.i())) {
                            zzb.zzj("BillingClient", "BUG: empty/null token!");
                            z11 = true;
                        }
                        arrayList.add(purchase);
                        i11++;
                    } catch (JSONException e10) {
                        zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        n nVar = dVar2.f5367f;
                        f fVar = o.f5511j;
                        nVar.b(v.a(51, 9, fVar));
                        return new e0(fVar, (List) null);
                    }
                }
                if (z11) {
                    dVar2.f5367f.b(v.a(26, 9, o.f5511j));
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new e0(o.f5513l, arrayList);
                }
                list = null;
                z10 = true;
            } catch (Exception e11) {
                n nVar2 = dVar2.f5367f;
                f fVar2 = o.f5514m;
                nVar2.b(v.a(52, 9, fVar2));
                zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                return new e0(fVar2, (List) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle K(int i10, String str, String str2, e eVar, Bundle bundle) {
        return this.f5368g.zzg(i10, this.f5366e.getPackageName(), str, str2, (String) null, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle L(String str, String str2) {
        return this.f5368g.zzf(3, this.f5366e.getPackageName(), str, str2, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object R(a aVar, b bVar) {
        try {
            zze zze = this.f5368g;
            String packageName = this.f5366e.getPackageName();
            String a10 = aVar.a();
            String str = this.f5363b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd = zze.zzd(9, packageName, a10, bundle);
            int zzb = zzb.zzb(zzd, "BillingClient");
            String zzf = zzb.zzf(zzd, "BillingClient");
            f.a c10 = f.c();
            c10.c(zzb);
            c10.b(zzf);
            bVar.a(c10.a());
            return null;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Error acknowledge purchase!", e10);
            n nVar = this.f5367f;
            f fVar = o.f5514m;
            nVar.b(v.a(28, 3, fVar));
            bVar.a(fVar);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object S(e eVar, z1.f fVar) {
        int i10;
        String str;
        String a10 = eVar.a();
        try {
            zzb.zzi("BillingClient", "Consuming purchase with token: " + a10);
            if (this.f5375n) {
                zze zze = this.f5368g;
                String packageName = this.f5366e.getPackageName();
                boolean z10 = this.f5375n;
                String str2 = this.f5363b;
                Bundle bundle = new Bundle();
                if (z10) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze2 = zze.zze(9, packageName, a10, bundle);
                i10 = zze2.getInt("RESPONSE_CODE");
                str = zzb.zzf(zze2, "BillingClient");
            } else {
                i10 = this.f5368g.zza(3, this.f5366e.getPackageName(), a10);
                str = "";
            }
            f.a c10 = f.c();
            c10.c(i10);
            c10.b(str);
            f a11 = c10.a();
            if (i10 == 0) {
                zzb.zzi("BillingClient", "Successfully consumed purchase.");
                fVar.a(a11, a10);
                return null;
            }
            zzb.zzj("BillingClient", "Error consuming purchase with token. Response code: " + i10);
            this.f5367f.b(v.a(23, 4, a11));
            fVar.a(a11, a10);
            return null;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Error consuming purchase!", e10);
            n nVar = this.f5367f;
            f fVar2 = o.f5514m;
            nVar.b(v.a(29, 4, fVar2));
            fVar.a(fVar2, a10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        r13 = "Item is unavailable for purchase.";
        r15 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object T(com.android.billingclient.api.h r28, z1.h r29) {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "BillingClient"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = r28.c()
            com.google.android.gms.internal.play_billing.zzu r10 = r28.b()
            int r11 = r10.size()
            r4 = 0
        L_0x0016:
            java.lang.String r13 = "Error trying to decode SkuDetails."
            java.lang.String r14 = "Item is unavailable for purchase."
            r8 = 0
            if (r4 >= r11) goto L_0x021c
            int r7 = r4 + 20
            if (r7 <= r11) goto L_0x0023
            r5 = r11
            goto L_0x0024
        L_0x0023:
            r5 = r7
        L_0x0024:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r4 = r10.subList(r4, r5)
            r6.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r6.size()
            r9 = 0
        L_0x0037:
            if (r9 >= r5) goto L_0x0049
            java.lang.Object r16 = r6.get(r9)
            com.android.billingclient.api.h$b r16 = (com.android.billingclient.api.h.b) r16
            java.lang.String r12 = r16.b()
            r4.add(r12)
            int r9 = r9 + 1
            goto L_0x0037
        L_0x0049:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r5 = "ITEM_ID_LIST"
            r9.putStringArrayList(r5, r4)
            java.lang.String r4 = r1.f5363b
            java.lang.String r5 = "playBillingLibraryVersion"
            r9.putString(r5, r4)
            com.google.android.gms.internal.play_billing.zze r4 = r1.f5368g     // Catch:{ Exception -> 0x0203 }
            boolean r12 = r1.f5384w     // Catch:{ Exception -> 0x0203 }
            r15 = 1
            if (r15 == r12) goto L_0x0064
            r12 = 17
            goto L_0x0066
        L_0x0064:
            r12 = 20
        L_0x0066:
            android.content.Context r15 = r1.f5366e     // Catch:{ Exception -> 0x0203 }
            java.lang.String r15 = r15.getPackageName()     // Catch:{ Exception -> 0x0203 }
            r18 = r7
            java.lang.String r7 = r1.f5363b     // Catch:{ Exception -> 0x0203 }
            boolean r19 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0203 }
            if (r19 == 0) goto L_0x007b
            android.content.Context r8 = r1.f5366e     // Catch:{ Exception -> 0x0200 }
            r8.getPackageName()     // Catch:{ Exception -> 0x0200 }
        L_0x007b:
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ Exception -> 0x0200 }
            r8.<init>()     // Catch:{ Exception -> 0x0200 }
            r8.putString(r5, r7)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r5 = "enablePendingPurchases"
            r7 = 1
            r8.putBoolean(r5, r7)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r5 = "SKU_DETAILS_RESPONSE_FORMAT"
            java.lang.String r7 = "PRODUCT_DETAILS"
            r8.putString(r5, r7)     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0200 }
            r5.<init>()     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0200 }
            r7.<init>()     // Catch:{ Exception -> 0x0200 }
            r20 = r10
            int r10 = r6.size()     // Catch:{ Exception -> 0x0200 }
            r22 = r11
            r11 = 0
            r21 = 0
            r23 = 0
        L_0x00a7:
            if (r11 >= r10) goto L_0x00e2
            java.lang.Object r24 = r6.get(r11)     // Catch:{ Exception -> 0x0200 }
            com.android.billingclient.api.h$b r24 = (com.android.billingclient.api.h.b) r24     // Catch:{ Exception -> 0x0200 }
            r25 = r6
            r6 = 0
            r5.add(r6)     // Catch:{ Exception -> 0x00de }
            boolean r26 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00de }
            r6 = 1
            r17 = r26 ^ 1
            r23 = r23 | r17
            java.lang.String r6 = r24.c()     // Catch:{ Exception -> 0x0200 }
            r24 = r10
            java.lang.String r10 = "first_party"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            java.lang.String r6 = "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products."
            r10 = 0
            com.google.android.gms.internal.play_billing.zzm.zzc(r10, r6)     // Catch:{ Exception -> 0x0103 }
            r7.add(r10)     // Catch:{ Exception -> 0x0103 }
            r21 = 1
        L_0x00d7:
            int r11 = r11 + 1
            r10 = r24
            r6 = r25
            goto L_0x00a7
        L_0x00de:
            r0 = move-exception
            r12 = r6
            goto L_0x0205
        L_0x00e2:
            if (r23 == 0) goto L_0x00e9
            java.lang.String r6 = "SKU_OFFER_ID_TOKEN_LIST"
            r8.putStringArrayList(r6, r5)     // Catch:{ Exception -> 0x0200 }
        L_0x00e9:
            boolean r5 = r7.isEmpty()     // Catch:{ Exception -> 0x0200 }
            if (r5 != 0) goto L_0x00f4
            java.lang.String r5 = "SKU_SERIALIZED_DOCID_LIST"
            r8.putStringArrayList(r5, r7)     // Catch:{ Exception -> 0x0200 }
        L_0x00f4:
            if (r21 == 0) goto L_0x0107
            r10 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0103 }
            if (r5 != 0) goto L_0x0108
            java.lang.String r5 = "accountName"
            r8.putString(r5, r10)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0108
        L_0x0103:
            r0 = move-exception
            r12 = r10
            goto L_0x0205
        L_0x0107:
            r10 = 0
        L_0x0108:
            r5 = r12
            r6 = r15
            r11 = r18
            r7 = r0
            r12 = r10
            r10 = r8
            r8 = r9
            r15 = 6
            r9 = r10
            android.os.Bundle r4 = r4.zzl(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x01fe }
            if (r4 != 0) goto L_0x013c
            java.lang.String r0 = "queryProductDetailsAsync got empty product details response."
            com.google.android.gms.internal.play_billing.zzb.zzj(r2, r0)
            com.android.billingclient.api.n r0 = r1.f5367f
            r2 = 44
            com.android.billingclient.api.f$a r4 = com.android.billingclient.api.f.c()
            r5 = 4
            r4.c(r5)
            r4.b(r14)
            com.android.billingclient.api.f r4 = r4.a()
            r6 = 7
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r6, r4)
            r0.b(r2)
        L_0x0138:
            r13 = r14
            r15 = 4
            goto L_0x0220
        L_0x013c:
            r5 = 4
            java.lang.String r6 = "DETAILS_LIST"
            boolean r7 = r4.containsKey(r6)
            if (r7 != 0) goto L_0x0197
            int r0 = com.google.android.gms.internal.play_billing.zzb.zzb(r4, r2)
            java.lang.String r13 = com.google.android.gms.internal.play_billing.zzb.zzf(r4, r2)
            if (r0 == 0) goto L_0x0176
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getSkuDetails() failed for queryProductDetailsAsync. Response code: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.play_billing.zzb.zzj(r2, r4)
            com.android.billingclient.api.n r2 = r1.f5367f
            r4 = 23
            com.android.billingclient.api.f r5 = com.android.billingclient.api.o.a(r0, r13)
            r7 = 7
            com.google.android.gms.internal.play_billing.zzfb r4 = z1.v.a(r4, r7, r5)
            r2.b(r4)
            r15 = r0
            goto L_0x0220
        L_0x0176:
            r7 = 7
            java.lang.String r0 = "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."
            com.google.android.gms.internal.play_billing.zzb.zzj(r2, r0)
            com.android.billingclient.api.n r0 = r1.f5367f
            r2 = 45
            com.android.billingclient.api.f$a r4 = com.android.billingclient.api.f.c()
            r4.c(r15)
            r4.b(r13)
            com.android.billingclient.api.f r4 = r4.a()
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r7, r4)
            r0.b(r2)
            goto L_0x0220
        L_0x0197:
            r7 = 7
            java.util.ArrayList r4 = r4.getStringArrayList(r6)
            if (r4 != 0) goto L_0x01b1
            java.lang.String r0 = "queryProductDetailsAsync got null response list"
            com.google.android.gms.internal.play_billing.zzb.zzj(r2, r0)
            com.android.billingclient.api.n r0 = r1.f5367f
            r2 = 46
            com.android.billingclient.api.f r4 = com.android.billingclient.api.o.B
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r7, r4)
            r0.b(r2)
            goto L_0x0138
        L_0x01b1:
            r5 = 0
        L_0x01b2:
            int r6 = r4.size()
            if (r5 >= r6) goto L_0x01f7
            java.lang.Object r6 = r4.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            com.android.billingclient.api.g r7 = new com.android.billingclient.api.g     // Catch:{ JSONException -> 0x01d6 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "Got product details: "
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.internal.play_billing.zzb.zzi(r2, r6)
            r3.add(r7)
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x01d6:
            r0 = move-exception
            java.lang.String r4 = "Got a JSON exception trying to decode ProductDetails. \n Exception: "
            com.google.android.gms.internal.play_billing.zzb.zzk(r2, r4, r0)
            com.android.billingclient.api.n r0 = r1.f5367f
            r2 = 47
            com.android.billingclient.api.f$a r4 = com.android.billingclient.api.f.c()
            r4.c(r15)
            r4.b(r13)
            com.android.billingclient.api.f r4 = r4.a()
            r5 = 7
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r5, r4)
            r0.b(r2)
            goto L_0x0220
        L_0x01f7:
            r4 = r11
            r10 = r20
            r11 = r22
            goto L_0x0016
        L_0x01fe:
            r0 = move-exception
            goto L_0x0206
        L_0x0200:
            r0 = move-exception
            r12 = 0
            goto L_0x0205
        L_0x0203:
            r0 = move-exception
            r12 = r8
        L_0x0205:
            r15 = 6
        L_0x0206:
            java.lang.String r4 = "queryProductDetailsAsync got a remote exception (try to reconnect)."
            com.google.android.gms.internal.play_billing.zzb.zzk(r2, r4, r0)
            com.android.billingclient.api.n r0 = r1.f5367f
            r2 = 43
            com.android.billingclient.api.f r4 = com.android.billingclient.api.o.f5511j
            r5 = 7
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r5, r4)
            r0.b(r2)
            java.lang.String r13 = "An internal error occurred."
            goto L_0x0220
        L_0x021c:
            r12 = r8
            java.lang.String r13 = ""
            r15 = 0
        L_0x0220:
            com.android.billingclient.api.f$a r0 = com.android.billingclient.api.f.c()
            r0.c(r15)
            r0.b(r13)
            com.android.billingclient.api.f r0 = r0.a()
            r2 = r29
            r2.a(r0, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.T(com.android.billingclient.api.h, z1.h):java.lang.Object");
    }

    public final void a(a aVar, b bVar) {
        if (!f()) {
            n nVar = this.f5367f;
            f fVar = o.f5514m;
            nVar.b(v.a(2, 3, fVar));
            bVar.a(fVar);
        } else if (TextUtils.isEmpty(aVar.a())) {
            zzb.zzj("BillingClient", "Please provide a valid purchase token.");
            n nVar2 = this.f5367f;
            f fVar2 = o.f5510i;
            nVar2.b(v.a(26, 3, fVar2));
            bVar.a(fVar2);
        } else if (!this.f5375n) {
            n nVar3 = this.f5367f;
            f fVar3 = o.f5503b;
            nVar3.b(v.a(27, 3, fVar3));
            bVar.a(fVar3);
        } else {
            if (E(new g0(this, aVar, bVar), 30000, new h0(this, bVar), A()) == null) {
                f C = C();
                this.f5367f.b(v.a(25, 3, C));
                bVar.a(C);
            }
        }
    }

    public final void b(e eVar, z1.f fVar) {
        if (!f()) {
            n nVar = this.f5367f;
            f fVar2 = o.f5514m;
            nVar.b(v.a(2, 4, fVar2));
            fVar.a(fVar2, eVar.a());
            return;
        }
        if (E(new d0(this, eVar, fVar), 30000, new e0(this, fVar, eVar), A()) == null) {
            f C = C();
            this.f5367f.b(v.a(25, 4, C));
            fVar.a(C, eVar.a());
        }
    }

    public final void c() {
        this.f5367f.c(v.b(12));
        try {
            this.f5365d.d();
            if (this.f5369h != null) {
                this.f5369h.c();
            }
            if (!(this.f5369h == null || this.f5368g == null)) {
                zzb.zzi("BillingClient", "Unbinding from service.");
                this.f5366e.unbindService(this.f5369h);
                this.f5369h = null;
            }
            this.f5368g = null;
            ExecutorService executorService = this.f5387z;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f5387z = null;
            }
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "There was an exception while ending connection!", e10);
        } finally {
            this.f5362a = 3;
        }
    }

    public final int d() {
        return this.f5362a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.f e(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = r12.f()
            r1 = 2
            r2 = 5
            if (r0 != 0) goto L_0x0024
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5514m
            int r0 = r13.b()
            if (r0 == 0) goto L_0x001a
            com.android.billingclient.api.n r0 = r12.f5367f
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r2, r13)
            r0.b(r1)
            goto L_0x0023
        L_0x001a:
            com.android.billingclient.api.n r0 = r12.f5367f
            com.google.android.gms.internal.play_billing.zzff r1 = z1.v.b(r2)
            r0.c(r1)
        L_0x0023:
            return r13
        L_0x0024:
            int r0 = com.android.billingclient.api.o.D
            int r0 = r13.hashCode()
            r3 = 11
            r4 = 8
            r5 = 7
            r6 = 6
            r7 = 3
            r8 = 4
            r9 = 1
            r10 = 10
            r11 = 9
            switch(r0) {
                case -422092961: goto L_0x00b0;
                case 96321: goto L_0x00a6;
                case 97314: goto L_0x009c;
                case 98307: goto L_0x0092;
                case 99300: goto L_0x0088;
                case 100293: goto L_0x007e;
                case 101286: goto L_0x0073;
                case 102279: goto L_0x0068;
                case 103272: goto L_0x005d;
                case 104265: goto L_0x0052;
                case 207616302: goto L_0x0047;
                case 1987365622: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00ba
        L_0x003c:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 0
            goto L_0x00bb
        L_0x0047:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 2
            goto L_0x00bb
        L_0x0052:
            java.lang.String r0 = "iii"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 11
            goto L_0x00bb
        L_0x005d:
            java.lang.String r0 = "hhh"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 10
            goto L_0x00bb
        L_0x0068:
            java.lang.String r0 = "ggg"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 9
            goto L_0x00bb
        L_0x0073:
            java.lang.String r0 = "fff"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 8
            goto L_0x00bb
        L_0x007e:
            java.lang.String r0 = "eee"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 7
            goto L_0x00bb
        L_0x0088:
            java.lang.String r0 = "ddd"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 5
            goto L_0x00bb
        L_0x0092:
            java.lang.String r0 = "ccc"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 6
            goto L_0x00bb
        L_0x009c:
            java.lang.String r0 = "bbb"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 3
            goto L_0x00bb
        L_0x00a6:
            java.lang.String r0 = "aaa"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 4
            goto L_0x00bb
        L_0x00b0:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = -1
        L_0x00bb:
            switch(r0) {
                case 0: goto L_0x0178;
                case 1: goto L_0x016b;
                case 2: goto L_0x015c;
                case 3: goto L_0x014d;
                case 4: goto L_0x013e;
                case 5: goto L_0x012f;
                case 6: goto L_0x0120;
                case 7: goto L_0x0111;
                case 8: goto L_0x0102;
                case 9: goto L_0x00f3;
                case 10: goto L_0x00e2;
                case 11: goto L_0x00d1;
                default: goto L_0x00be;
            }
        L_0x00be:
            java.lang.String r0 = "Unsupported feature: "
            java.lang.String r13 = r0.concat(r13)
            java.lang.String r0 = "BillingClient"
            com.google.android.gms.internal.play_billing.zzb.zzj(r0, r13)
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5526y
            r0 = 34
            r12.H(r13, r0, r9)
            return r13
        L_0x00d1:
            boolean r13 = r12.f5384w
            if (r13 == 0) goto L_0x00d8
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x00da
        L_0x00d8:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.C
        L_0x00da:
            r0 = 60
            r1 = 13
            r12.H(r13, r0, r1)
            return r13
        L_0x00e2:
            boolean r13 = r12.f5382u
            if (r13 == 0) goto L_0x00e9
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x00eb
        L_0x00e9:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.A
        L_0x00eb:
            r0 = 33
            r1 = 12
            r12.H(r13, r0, r1)
            return r13
        L_0x00f3:
            boolean r13 = r12.f5382u
            if (r13 == 0) goto L_0x00fa
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x00fc
        L_0x00fa:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5527z
        L_0x00fc:
            r0 = 32
            r12.H(r13, r0, r3)
            return r13
        L_0x0102:
            boolean r13 = r12.f5381t
            if (r13 == 0) goto L_0x0109
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x010b
        L_0x0109:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5523v
        L_0x010b:
            r0 = 20
            r12.H(r13, r0, r10)
            return r13
        L_0x0111:
            boolean r13 = r12.f5380s
            if (r13 == 0) goto L_0x0118
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x011a
        L_0x0118:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5521t
        L_0x011a:
            r0 = 61
            r12.H(r13, r0, r11)
            return r13
        L_0x0120:
            boolean r13 = r12.f5380s
            if (r13 == 0) goto L_0x0127
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0129
        L_0x0127:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5521t
        L_0x0129:
            r0 = 19
            r12.H(r13, r0, r4)
            return r13
        L_0x012f:
            boolean r13 = r12.f5378q
            if (r13 == 0) goto L_0x0136
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0138
        L_0x0136:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5522u
        L_0x0138:
            r0 = 21
            r12.H(r13, r0, r5)
            return r13
        L_0x013e:
            boolean r13 = r12.f5379r
            if (r13 == 0) goto L_0x0145
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0147
        L_0x0145:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5520s
        L_0x0147:
            r0 = 31
            r12.H(r13, r0, r6)
            return r13
        L_0x014d:
            boolean r13 = r12.f5377p
            if (r13 == 0) goto L_0x0154
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0156
        L_0x0154:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5524w
        L_0x0156:
            r0 = 30
            r12.H(r13, r0, r2)
            return r13
        L_0x015c:
            boolean r13 = r12.f5374m
            if (r13 == 0) goto L_0x0163
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0165
        L_0x0163:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5519r
        L_0x0165:
            r0 = 35
            r12.H(r13, r0, r8)
            return r13
        L_0x016b:
            boolean r13 = r12.f5371j
            if (r13 == 0) goto L_0x0172
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0174
        L_0x0172:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5517p
        L_0x0174:
            r12.H(r13, r10, r7)
            return r13
        L_0x0178:
            boolean r13 = r12.f5370i
            if (r13 == 0) goto L_0x017f
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5513l
            goto L_0x0181
        L_0x017f:
            com.android.billingclient.api.f r13 = com.android.billingclient.api.o.f5516o
        L_0x0181:
            r12.H(r13, r11, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.e(java.lang.String):com.android.billingclient.api.f");
    }

    public final boolean f() {
        return (this.f5362a != 2 || this.f5368g == null || this.f5369h == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0477 A[Catch:{ CancellationException | TimeoutException -> 0x04d9, Exception -> 0x04c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04a8 A[Catch:{ CancellationException | TimeoutException -> 0x04d9, Exception -> 0x04c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.f g(android.app.Activity r32, com.android.billingclient.api.e r33) {
        /*
            r31 = this;
            r8 = r31
            r0 = r32
            java.lang.String r1 = "proxyPackageVersion"
            java.lang.String r9 = "BUY_INTENT"
            boolean r2 = r31.f()
            r10 = 2
            if (r2 != 0) goto L_0x001e
            com.android.billingclient.api.n r0 = r8.f5367f
            com.android.billingclient.api.f r1 = com.android.billingclient.api.o.f5514m
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r10, r10, r1)
            r0.b(r2)
            r8.B(r1)
            return r1
        L_0x001e:
            java.util.ArrayList r2 = r33.h()
            java.util.List r3 = r33.i()
            r4 = 0
            java.lang.Object r5 = com.google.android.gms.internal.play_billing.zzz.zza(r2, r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzz.zza(r3, r4)
            com.android.billingclient.api.e$b r6 = (com.android.billingclient.api.e.b) r6
            if (r5 == 0) goto L_0x003e
            java.lang.String r7 = r5.a()
            java.lang.String r11 = r5.b()
            goto L_0x004e
        L_0x003e:
            com.android.billingclient.api.g r7 = r6.b()
            java.lang.String r7 = r7.d()
            com.android.billingclient.api.g r11 = r6.b()
            java.lang.String r11 = r11.e()
        L_0x004e:
            java.lang.String r12 = "subs"
            boolean r12 = r11.equals(r12)
            r13 = 9
            java.lang.String r14 = "BillingClient"
            if (r12 == 0) goto L_0x0073
            boolean r12 = r8.f5370i
            if (r12 == 0) goto L_0x005f
            goto L_0x0073
        L_0x005f:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zzb.zzj(r14, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            com.android.billingclient.api.f r1 = com.android.billingclient.api.o.f5516o
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r13, r10, r1)
            r0.b(r2)
            r8.B(r1)
            return r1
        L_0x0073:
            boolean r12 = r33.r()
            if (r12 == 0) goto L_0x0094
            boolean r12 = r8.f5373l
            if (r12 == 0) goto L_0x007e
            goto L_0x0094
        L_0x007e:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zzb.zzj(r14, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 18
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5509h
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r10, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        L_0x0094:
            int r12 = r2.size()
            r15 = 1
            if (r12 <= r15) goto L_0x00b6
            boolean r12 = r8.f5380s
            if (r12 == 0) goto L_0x00a0
            goto L_0x00b6
        L_0x00a0:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zzb.zzj(r14, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 19
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5521t
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r10, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        L_0x00b6:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x00d7
            boolean r12 = r8.f5381t
            if (r12 == 0) goto L_0x00c1
            goto L_0x00d7
        L_0x00c1:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zzb.zzj(r14, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 20
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5523v
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r10, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        L_0x00d7:
            boolean r12 = r8.f5373l
            if (r12 == 0) goto L_0x044c
            boolean r12 = r8.f5375n
            boolean r13 = r8.f5386y
            java.lang.String r10 = r8.f5363b
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r15 = "playBillingLibraryVersion"
            r4.putString(r15, r10)
            int r10 = r33.c()
            java.lang.String r15 = "prorationMode"
            if (r10 == 0) goto L_0x00fb
            int r10 = r33.c()
            r4.putInt(r15, r10)
            goto L_0x0108
        L_0x00fb:
            int r10 = r33.b()
            if (r10 == 0) goto L_0x0108
            int r10 = r33.b()
            r4.putInt(r15, r10)
        L_0x0108:
            java.lang.String r10 = r33.d()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x011b
            java.lang.String r10 = r33.d()
            java.lang.String r15 = "accountId"
            r4.putString(r15, r10)
        L_0x011b:
            java.lang.String r10 = r33.e()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x012e
            java.lang.String r10 = r33.e()
            java.lang.String r15 = "obfuscatedProfileId"
            r4.putString(r15, r10)
        L_0x012e:
            boolean r10 = r33.q()
            if (r10 == 0) goto L_0x013a
            java.lang.String r10 = "isOfferPersonalizedByDeveloper"
            r15 = 1
            r4.putBoolean(r10, r15)
        L_0x013a:
            r10 = 0
            boolean r15 = android.text.TextUtils.isEmpty(r10)
            if (r15 != 0) goto L_0x0153
            java.util.ArrayList r15 = new java.util.ArrayList
            java.lang.String[] r17 = new java.lang.String[]{r10}
            java.util.List r10 = java.util.Arrays.asList(r17)
            r15.<init>(r10)
            java.lang.String r10 = "skusToReplace"
            r4.putStringArrayList(r10, r15)
        L_0x0153:
            java.lang.String r10 = r33.f()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0166
            java.lang.String r10 = r33.f()
            java.lang.String r15 = "oldSkuPurchaseToken"
            r4.putString(r15, r10)
        L_0x0166:
            r10 = 0
            boolean r15 = android.text.TextUtils.isEmpty(r10)
            if (r15 != 0) goto L_0x0172
            java.lang.String r15 = "oldSkuPurchaseId"
            r4.putString(r15, r10)
        L_0x0172:
            java.lang.String r15 = r33.g()
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x0186
            java.lang.String r15 = r33.g()
            java.lang.String r10 = "originalExternalTransactionId"
            r4.putString(r10, r15)
            r10 = 0
        L_0x0186:
            boolean r15 = android.text.TextUtils.isEmpty(r10)
            if (r15 != 0) goto L_0x0191
            java.lang.String r15 = "paymentsPurchaseParams"
            r4.putString(r15, r10)
        L_0x0191:
            if (r12 == 0) goto L_0x019a
            java.lang.String r10 = "enablePendingPurchases"
            r12 = 1
            r4.putBoolean(r10, r12)
            goto L_0x019b
        L_0x019a:
            r12 = 1
        L_0x019b:
            if (r13 == 0) goto L_0x01a2
            java.lang.String r10 = "enableAlternativeBilling"
            r4.putBoolean(r10, r12)
        L_0x01a2:
            boolean r10 = r2.isEmpty()
            java.lang.String r12 = "additionalSkuTypes"
            java.lang.String r13 = "additionalSkus"
            java.lang.String r15 = "SKU_SERIALIZED_DOCID_LIST"
            r17 = r9
            java.lang.String r9 = "skuDetailsTokens"
            java.lang.String r0 = "SKU_OFFER_ID_TOKEN_LIST"
            r18 = r11
            if (r10 != 0) goto L_0x02bb
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r19 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r20 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r21 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r22 = r2.iterator()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x01e1:
            boolean r27 = r22.hasNext()
            if (r27 == 0) goto L_0x024d
            java.lang.Object r27 = r22.next()
            com.android.billingclient.api.SkuDetails r27 = (com.android.billingclient.api.SkuDetails) r27
            java.lang.String r28 = r27.h()
            boolean r28 = r28.isEmpty()
            if (r28 != 0) goto L_0x0201
            r28 = r6
            java.lang.String r6 = r27.h()
            r10.add(r6)
            goto L_0x0203
        L_0x0201:
            r28 = r6
        L_0x0203:
            java.lang.String r6 = r27.e()
            r29 = r5
            java.lang.String r5 = r27.d()
            int r30 = r27.c()
            java.lang.String r8 = r27.g()
            r11.add(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r16 = 1
            r6 = r6 ^ 1
            r23 = r23 | r6
            r7.add(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ 1
            r24 = r24 | r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r30)
            r1.add(r5)
            if (r30 == 0) goto L_0x0238
            r5 = 1
            goto L_0x0239
        L_0x0238:
            r5 = 0
        L_0x0239:
            r25 = r25 | r5
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            r5 = r5 ^ 1
            r26 = r26 | r5
            r14.add(r8)
            r8 = r31
            r6 = r28
            r5 = r29
            goto L_0x01e1
        L_0x024d:
            r29 = r5
            r28 = r6
            boolean r5 = r10.isEmpty()
            if (r5 != 0) goto L_0x025a
            r4.putStringArrayList(r9, r10)
        L_0x025a:
            if (r23 == 0) goto L_0x025f
            r4.putStringArrayList(r0, r11)
        L_0x025f:
            if (r24 == 0) goto L_0x0266
            java.lang.String r5 = "SKU_OFFER_ID_LIST"
            r4.putStringArrayList(r5, r7)
        L_0x0266:
            if (r25 == 0) goto L_0x026d
            java.lang.String r5 = "SKU_OFFER_TYPE_LIST"
            r4.putIntegerArrayList(r5, r1)
        L_0x026d:
            if (r26 == 0) goto L_0x0272
            r4.putStringArrayList(r15, r14)
        L_0x0272:
            int r1 = r2.size()
            r5 = 1
            if (r1 <= r5) goto L_0x036e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r6 = r2.size()
            int r6 = r6 + -1
            r1.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r2.size()
            int r7 = r7 + -1
            r6.<init>(r7)
            r15 = 1
        L_0x0290:
            int r7 = r2.size()
            if (r15 >= r7) goto L_0x02b3
            java.lang.Object r7 = r2.get(r15)
            com.android.billingclient.api.SkuDetails r7 = (com.android.billingclient.api.SkuDetails) r7
            java.lang.String r7 = r7.a()
            r1.add(r7)
            java.lang.Object r7 = r2.get(r15)
            com.android.billingclient.api.SkuDetails r7 = (com.android.billingclient.api.SkuDetails) r7
            java.lang.String r7 = r7.b()
            r6.add(r7)
            int r15 = r15 + 1
            goto L_0x0290
        L_0x02b3:
            r4.putStringArrayList(r13, r1)
            r4.putStringArrayList(r12, r6)
            goto L_0x036e
        L_0x02bb:
            r20 = r1
            r29 = r5
            r28 = r6
            r19 = r7
            r21 = r14
            r5 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r3.size()
            int r6 = r6 + -1
            r2.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
        L_0x02ec:
            int r11 = r3.size()
            if (r10 >= r11) goto L_0x034d
            java.lang.Object r11 = r3.get(r10)
            com.android.billingclient.api.e$b r11 = (com.android.billingclient.api.e.b) r11
            com.android.billingclient.api.g r14 = r11.b()
            java.lang.String r16 = r14.i()
            boolean r16 = r16.isEmpty()
            if (r16 != 0) goto L_0x030d
            java.lang.String r5 = r14.i()
            r6.add(r5)
        L_0x030d:
            java.lang.String r5 = r11.c()
            r7.add(r5)
            java.lang.String r5 = r14.j()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0325
            java.lang.String r5 = r14.j()
            r8.add(r5)
        L_0x0325:
            if (r10 <= 0) goto L_0x0349
            java.lang.Object r5 = r3.get(r10)
            com.android.billingclient.api.e$b r5 = (com.android.billingclient.api.e.b) r5
            com.android.billingclient.api.g r5 = r5.b()
            java.lang.String r5 = r5.d()
            r1.add(r5)
            java.lang.Object r5 = r3.get(r10)
            com.android.billingclient.api.e$b r5 = (com.android.billingclient.api.e.b) r5
            com.android.billingclient.api.g r5 = r5.b()
            java.lang.String r5 = r5.e()
            r2.add(r5)
        L_0x0349:
            int r10 = r10 + 1
            r5 = 1
            goto L_0x02ec
        L_0x034d:
            r4.putStringArrayList(r0, r7)
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x0359
            r4.putStringArrayList(r9, r6)
        L_0x0359:
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto L_0x0362
            r4.putStringArrayList(r15, r8)
        L_0x0362:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x036e
            r4.putStringArrayList(r13, r1)
            r4.putStringArrayList(r12, r2)
        L_0x036e:
            boolean r0 = r4.containsKey(r0)
            r8 = r31
            if (r0 == 0) goto L_0x038d
            boolean r0 = r8.f5378q
            if (r0 == 0) goto L_0x037b
            goto L_0x038d
        L_0x037b:
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 21
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5522u
            r3 = 2
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r3, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        L_0x038d:
            java.lang.String r0 = "skuPackageName"
            if (r29 == 0) goto L_0x03a5
            java.lang.String r1 = r29.f()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03a5
            java.lang.String r1 = r29.f()
            r4.putString(r0, r1)
        L_0x03a2:
            r0 = 0
            r15 = 1
            goto L_0x03c3
        L_0x03a5:
            if (r28 == 0) goto L_0x03c1
            com.android.billingclient.api.g r1 = r28.b()
            java.lang.String r1 = r1.h()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03c1
            com.android.billingclient.api.g r1 = r28.b()
            java.lang.String r1 = r1.h()
            r4.putString(r0, r1)
            goto L_0x03a2
        L_0x03c1:
            r0 = 0
            r15 = 0
        L_0x03c3:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x03ce
            java.lang.String r1 = "accountName"
            r4.putString(r1, r0)
        L_0x03ce:
            android.content.Intent r0 = r32.getIntent()
            if (r0 != 0) goto L_0x03dc
            java.lang.String r0 = "Activity's intent is null."
            r9 = r21
            com.google.android.gms.internal.play_billing.zzb.zzj(r9, r0)
            goto L_0x040d
        L_0x03dc:
            r9 = r21
            java.lang.String r1 = "PROXY_PACKAGE"
            java.lang.String r2 = r0.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x040d
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "proxyPackage"
            r4.putString(r1, r0)
            android.content.Context r1 = r8.f5366e     // Catch:{ NameNotFoundException -> 0x0406 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0406 }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0406 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0406 }
            r1 = r20
            r4.putString(r1, r0)     // Catch:{ NameNotFoundException -> 0x0408 }
            goto L_0x040d
        L_0x0406:
            r1 = r20
        L_0x0408:
            java.lang.String r0 = "package not found"
            r4.putString(r1, r0)
        L_0x040d:
            boolean r0 = r8.f5381t
            if (r0 == 0) goto L_0x041c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x041c
            r0 = 17
            r3 = 17
            goto L_0x0430
        L_0x041c:
            boolean r0 = r8.f5379r
            if (r0 == 0) goto L_0x0427
            if (r15 == 0) goto L_0x0427
            r0 = 15
            r3 = 15
            goto L_0x0430
        L_0x0427:
            boolean r0 = r8.f5375n
            if (r0 == 0) goto L_0x042e
            r3 = 9
            goto L_0x0430
        L_0x042e:
            r0 = 6
            r3 = 6
        L_0x0430:
            com.android.billingclient.api.i0 r0 = new com.android.billingclient.api.i0
            r1 = r0
            r2 = r31
            r7 = r4
            r4 = r19
            r5 = r18
            r6 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.f5364c
            r1 = r31
            r2 = r0
            java.util.concurrent.Future r0 = r1.E(r2, r3, r5, r6)
            goto L_0x0463
        L_0x044c:
            r19 = r7
            r17 = r9
            r18 = r11
            r9 = r14
            com.android.billingclient.api.j0 r2 = new com.android.billingclient.api.j0
            r2.<init>(r8, r7, r11)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.f5364c
            r1 = r31
            java.util.concurrent.Future r0 = r1.E(r2, r3, r5, r6)
        L_0x0463:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            int r1 = com.google.android.gms.internal.play_billing.zzb.zzb(r0, r9)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            java.lang.String r2 = com.google.android.gms.internal.play_billing.zzb.zzf(r0, r9)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            if (r1 == 0) goto L_0x04a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r0.<init>()     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            java.lang.String r3 = "Unable to buy item, Error response code: "
            r0.append(r3)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r0.append(r1)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            com.google.android.gms.internal.play_billing.zzb.zzj(r9, r0)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            com.android.billingclient.api.f$a r0 = com.android.billingclient.api.f.c()     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r0.c(r1)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r0.b(r2)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            com.android.billingclient.api.f r0 = r0.a()     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            com.android.billingclient.api.n r1 = r8.f5367f     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r2 = 3
            r3 = 2
            com.google.android.gms.internal.play_billing.zzfb r2 = z1.v.a(r2, r3, r0)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r1.b(r2)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r8.B(r0)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            return r0
        L_0x04a8:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r32
            r1.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r1.putExtra(r2, r0)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            r3.startActivity(r1)     // Catch:{ TimeoutException -> 0x04db, CancellationException -> 0x04d9, Exception -> 0x04c2 }
            com.android.billingclient.api.f r0 = com.android.billingclient.api.o.f5513l
            return r0
        L_0x04c2:
            r0 = move-exception
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzk(r9, r1, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 5
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5514m
            r3 = 2
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r3, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        L_0x04d9:
            r0 = move-exception
            goto L_0x04dc
        L_0x04db:
            r0 = move-exception
        L_0x04dc:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzk(r9, r1, r0)
            com.android.billingclient.api.n r0 = r8.f5367f
            r1 = 4
            com.android.billingclient.api.f r2 = com.android.billingclient.api.o.f5515n
            r3 = 2
            com.google.android.gms.internal.play_billing.zzfb r1 = z1.v.a(r1, r3, r2)
            r0.b(r1)
            r8.B(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.g(android.app.Activity, com.android.billingclient.api.e):com.android.billingclient.api.f");
    }

    public final void i(h hVar, h hVar2) {
        if (!f()) {
            n nVar = this.f5367f;
            f fVar = o.f5514m;
            nVar.b(v.a(2, 7, fVar));
            hVar2.a(fVar, new ArrayList());
        } else if (!this.f5381t) {
            zzb.zzj("BillingClient", "Querying product details is not supported.");
            n nVar2 = this.f5367f;
            f fVar2 = o.f5523v;
            nVar2.b(v.a(20, 7, fVar2));
            hVar2.a(fVar2, new ArrayList());
        } else {
            if (E(new b0(this, hVar, hVar2), 30000, new c0(this, hVar2), A()) == null) {
                f C = C();
                this.f5367f.b(v.a(25, 7, C));
                hVar2.a(C, new ArrayList());
            }
        }
    }

    public final void j(l lVar, i iVar) {
        F(lVar.b(), iVar);
    }

    public final void k(m mVar, j jVar) {
        G(mVar.b(), jVar);
    }

    public final void l(z1.d dVar) {
        if (f()) {
            zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f5367f.c(v.b(6));
            dVar.onBillingSetupFinished(o.f5513l);
            return;
        }
        int i10 = 1;
        if (this.f5362a == 1) {
            zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            n nVar = this.f5367f;
            f fVar = o.f5505d;
            nVar.b(v.a(37, 6, fVar));
            dVar.onBillingSetupFinished(fVar);
        } else if (this.f5362a == 3) {
            zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            n nVar2 = this.f5367f;
            f fVar2 = o.f5514m;
            nVar2.b(v.a(38, 6, fVar2));
            dVar.onBillingSetupFinished(fVar2);
        } else {
            this.f5362a = 1;
            this.f5365d.e();
            zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.f5369h = new l(this, dVar, (o) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f5366e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i10 = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i10 = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f5363b);
                        if (this.f5366e.bindService(intent2, this.f5369h, 1)) {
                            zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i10 = 39;
                        }
                    }
                }
            }
            this.f5362a = 0;
            zzb.zzi("BillingClient", "Billing service unavailable on device.");
            n nVar3 = this.f5367f;
            f fVar3 = o.f5504c;
            nVar3.b(v.a(i10, 6, fVar3));
            dVar.onBillingSetupFinished(fVar3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(b bVar) {
        n nVar = this.f5367f;
        f fVar = o.f5515n;
        nVar.b(v.a(24, 3, fVar));
        bVar.a(fVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u(f fVar) {
        if (this.f5365d.c() != null) {
            this.f5365d.c().onPurchasesUpdated(fVar, (List<Purchase>) null);
            return;
        }
        this.f5365d.b();
        zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v(z1.f fVar, e eVar) {
        n nVar = this.f5367f;
        f fVar2 = o.f5515n;
        nVar.b(v.a(24, 4, fVar2));
        fVar.a(fVar2, eVar.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w(h hVar) {
        n nVar = this.f5367f;
        f fVar = o.f5515n;
        nVar.b(v.a(24, 7, fVar));
        hVar.a(fVar, new ArrayList());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x(i iVar) {
        n nVar = this.f5367f;
        f fVar = o.f5515n;
        nVar.b(v.a(24, 11, fVar));
        iVar.a(fVar, (List<PurchaseHistoryRecord>) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y(j jVar) {
        n nVar = this.f5367f;
        f fVar = o.f5515n;
        nVar.b(v.a(24, 9, fVar));
        jVar.a(fVar, zzu.zzk());
    }

    d(String str, s sVar, Context context, a0 a0Var, n nVar) {
        this.f5362a = 0;
        this.f5364c = new Handler(Looper.getMainLooper());
        this.f5372k = 0;
        this.f5363b = D();
        this.f5366e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(D());
        zzv.zzi(this.f5366e.getPackageName());
        this.f5367f = new p(this.f5366e, (zzfm) zzv.zzc());
        zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f5365d = new a0(this.f5366e, (a0) null, this.f5367f);
        this.f5385x = sVar;
    }

    d(String str, s sVar, Context context, k kVar, c cVar, n nVar) {
        this(context, sVar, kVar, D(), (String) null, cVar, (n) null);
    }
}
