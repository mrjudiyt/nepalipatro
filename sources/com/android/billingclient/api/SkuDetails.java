package com.android.billingclient.api;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

@Deprecated
/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class SkuDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f5341a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5342b;

    public String a() {
        return this.f5342b.optString("productId");
    }

    public String b() {
        return this.f5342b.optString(ShareConstants.MEDIA_TYPE);
    }

    public int c() {
        return this.f5342b.optInt("offer_type");
    }

    public String d() {
        return this.f5342b.optString("offer_id");
    }

    public String e() {
        String optString = this.f5342b.optString("offerIdToken");
        return optString.isEmpty() ? this.f5342b.optString("offer_id_token") : optString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f5341a, ((SkuDetails) obj).f5341a);
    }

    public final String f() {
        return this.f5342b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public String g() {
        return this.f5342b.optString("serializedDocid");
    }

    /* access modifiers changed from: package-private */
    public final String h() {
        return this.f5342b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f5341a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f5341a));
    }
}
