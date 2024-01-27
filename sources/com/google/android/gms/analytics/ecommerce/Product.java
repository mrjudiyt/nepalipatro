package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public class Product {
    Map<String, String> zza = new HashMap();

    public Product setBrand(String str) {
        zzb("br", str);
        return this;
    }

    public Product setCategory(String str) {
        zzb("ca", str);
        return this;
    }

    public Product setCouponCode(String str) {
        zzb("cc", str);
        return this;
    }

    public Product setCustomDimension(int i10, String str) {
        zzb(zzd.zzc(i10), str);
        return this;
    }

    public Product setCustomMetric(int i10, int i11) {
        zzb(zzd.zzf(i10), Integer.toString(i11));
        return this;
    }

    public Product setId(String str) {
        zzb("id", str);
        return this;
    }

    public Product setName(String str) {
        zzb("nm", str);
        return this;
    }

    public Product setPosition(int i10) {
        zzb("ps", Integer.toString(i10));
        return this;
    }

    public Product setPrice(double d10) {
        zzb("pr", Double.toString(d10));
        return this;
    }

    public Product setQuantity(int i10) {
        zzb("qt", Integer.toString(i10));
        return this;
    }

    public Product setVariant(String str) {
        zzb("va", str);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map<String, String> zza(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.zza.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) next.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) next.getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
