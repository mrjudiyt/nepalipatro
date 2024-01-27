package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    private final String f5338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5339b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f5340c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f5338a = str;
        this.f5339b = str2;
        this.f5340c = new JSONObject(str);
    }

    private final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f5340c.has("productIds")) {
            JSONArray optJSONArray = this.f5340c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f5340c.has("productId")) {
            arrayList.add(this.f5340c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f5340c.optString("developerPayload");
    }

    public String b() {
        return this.f5338a;
    }

    public List<String> c() {
        return h();
    }

    public long d() {
        return this.f5340c.optLong("purchaseTime");
    }

    public String e() {
        JSONObject jSONObject = this.f5340c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f5338a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f5339b, purchaseHistoryRecord.g());
    }

    public int f() {
        return this.f5340c.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    public String g() {
        return this.f5339b;
    }

    public int hashCode() {
        return this.f5338a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f5338a));
    }
}
