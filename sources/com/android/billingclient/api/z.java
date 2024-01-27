package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import org.json.JSONException;
import z1.a0;
import z1.c;
import z1.k;
import z1.o0;
import z1.v;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class z extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f5535a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a0 f5536b;

    /* renamed from: c  reason: collision with root package name */
    private final c f5537c;

    /* renamed from: d  reason: collision with root package name */
    private final n f5538d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5539e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a0 f5540f;

    /* synthetic */ z(a0 a0Var, a0 a0Var2, n nVar, o0 o0Var) {
        this.f5540f = a0Var;
        this.f5535a = null;
        this.f5537c = null;
        this.f5536b = null;
        this.f5538d = nVar;
    }

    private final void e(Bundle bundle, f fVar, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.f5538d.b(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzbn.zza()));
            } catch (Throwable unused) {
                zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
            }
        } else {
            this.f5538d.b(v.a(23, i10, fVar));
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void c(Context context, IntentFilter intentFilter) {
        if (!this.f5539e) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.f5540f.f5346b, intentFilter, 2);
            } else {
                context.registerReceiver(this.f5540f.f5346b, intentFilter);
            }
            this.f5539e = true;
        }
    }

    public final void d(Context context) {
        if (this.f5539e) {
            context.unregisterReceiver(this.f5540f.f5346b);
            this.f5539e = false;
            return;
        }
        zzb.zzj("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            n nVar = this.f5538d;
            f fVar = o.f5511j;
            nVar.b(v.a(11, 1, fVar));
            k kVar = this.f5535a;
            if (kVar != null) {
                kVar.onPurchasesUpdated(fVar, (List<Purchase>) null);
                return;
            }
            return;
        }
        f zzd = zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i10 = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i10 = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List zzh = zzb.zzh(extras);
            if (zzd.b() == 0) {
                this.f5538d.c(v.b(i10));
            } else {
                e(extras, zzd, i10);
            }
            this.f5535a.onPurchasesUpdated(zzd, zzh);
        } else if (!action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
        } else {
            if (zzd.b() != 0) {
                e(extras, zzd, i10);
                this.f5535a.onPurchasesUpdated(zzd, zzu.zzk());
            } else if (this.f5537c == null) {
                zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
                n nVar2 = this.f5538d;
                f fVar2 = o.f5511j;
                nVar2.b(v.a(15, i10, fVar2));
                this.f5535a.onPurchasesUpdated(fVar2, zzu.zzk());
            } else {
                String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string2 == null) {
                    zzb.zzj("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    n nVar3 = this.f5538d;
                    f fVar3 = o.f5511j;
                    nVar3.b(v.a(16, i10, fVar3));
                    this.f5535a.onPurchasesUpdated(fVar3, zzu.zzk());
                    return;
                }
                try {
                    b bVar = new b(string2);
                    this.f5538d.c(v.b(i10));
                    this.f5537c.a(bVar);
                } catch (JSONException unused) {
                    zzb.zzj("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", new Object[]{string2}));
                    n nVar4 = this.f5538d;
                    f fVar4 = o.f5511j;
                    nVar4.b(v.a(17, i10, fVar4));
                    this.f5535a.onPurchasesUpdated(fVar4, zzu.zzk());
                }
            }
        }
    }

    /* synthetic */ z(a0 a0Var, k kVar, c cVar, n nVar, o0 o0Var) {
        this.f5540f = a0Var;
        this.f5535a = kVar;
        this.f5538d = nVar;
        this.f5537c = cVar;
        this.f5536b = null;
    }
}
