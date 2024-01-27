package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    private final String f5335a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5336b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f5337c;

    public Purchase(String str, String str2) {
        this.f5335a = str;
        this.f5336b = str2;
        this.f5337c = new JSONObject(str);
    }

    private final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        if (this.f5337c.has("productIds")) {
            JSONArray optJSONArray = this.f5337c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f5337c.has("productId")) {
            arrayList.add(this.f5337c.optString("productId"));
        }
        return arrayList;
    }

    public a a() {
        String optString = this.f5337c.optString("obfuscatedAccountId");
        String optString2 = this.f5337c.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new a(optString, optString2);
    }

    public String b() {
        return this.f5337c.optString("developerPayload");
    }

    public String c() {
        String optString = this.f5337c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String d() {
        return this.f5335a;
    }

    public String e() {
        return this.f5337c.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f5335a, purchase.d()) && TextUtils.equals(this.f5336b, purchase.k());
    }

    public List<String> f() {
        return n();
    }

    public int g() {
        return this.f5337c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long h() {
        return this.f5337c.optLong("purchaseTime");
    }

    public int hashCode() {
        return this.f5335a.hashCode();
    }

    public String i() {
        JSONObject jSONObject = this.f5337c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int j() {
        return this.f5337c.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    public String k() {
        return this.f5336b;
    }

    public boolean l() {
        return this.f5337c.optBoolean("acknowledged", true);
    }

    public boolean m() {
        return this.f5337c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5335a));
    }
}
