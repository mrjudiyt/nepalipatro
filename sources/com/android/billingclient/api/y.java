package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.f;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class y {
    static x a(Bundle bundle, String str, String str2) {
        f fVar = o.f5511j;
        if (bundle == null) {
            zzb.zzj("BillingClient", String.format("%s got null owned items list", new Object[]{str2}));
            return new x(fVar, 54);
        }
        int zzb = zzb.zzb(bundle, "BillingClient");
        String zzf = zzb.zzf(bundle, "BillingClient");
        f.a c10 = f.c();
        c10.c(zzb);
        c10.b(zzf);
        f a10 = c10.a();
        if (zzb != 0) {
            zzb.zzj("BillingClient", String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(zzb)}));
            return new x(a10, 23);
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2}));
            return new x(fVar, 55);
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2}));
                return new x(fVar, 56);
            } else if (stringArrayList2 == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2}));
                return new x(fVar, 57);
            } else if (stringArrayList3 != null) {
                return new x(o.f5513l, 1);
            } else {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2}));
                return new x(fVar, 58);
            }
        }
    }
}
