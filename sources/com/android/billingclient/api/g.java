package com.android.billingclient.api;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f5426a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5427b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5428c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5429d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5430e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5431f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5432g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5433h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5434i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5435j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5436k;

    /* renamed from: l  reason: collision with root package name */
    private final List f5437l;

    /* renamed from: m  reason: collision with root package name */
    private final List f5438m;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f5439a;

        /* renamed from: b  reason: collision with root package name */
        private final long f5440b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5441c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5442d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5443e;

        /* renamed from: f  reason: collision with root package name */
        private final zzu f5444f;

        /* renamed from: g  reason: collision with root package name */
        private final Long f5445g;

        /* renamed from: h  reason: collision with root package name */
        private final u f5446h;

        /* renamed from: i  reason: collision with root package name */
        private final w f5447i;

        /* renamed from: j  reason: collision with root package name */
        private final v f5448j;

        a(JSONObject jSONObject) {
            u uVar;
            w wVar;
            this.f5439a = jSONObject.optString("formattedPrice");
            this.f5440b = jSONObject.optLong("priceAmountMicros");
            this.f5441c = jSONObject.optString("priceCurrencyCode");
            this.f5442d = jSONObject.optString("offerIdToken");
            this.f5443e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f5444f = zzu.zzj(arrayList);
            v vVar = null;
            this.f5445g = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject == null) {
                uVar = null;
            } else {
                uVar = new u(optJSONObject);
            }
            this.f5446h = uVar;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 == null) {
                wVar = null;
            } else {
                wVar = new w(optJSONObject2);
            }
            this.f5447i = wVar;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5448j = optJSONObject3 != null ? new v(optJSONObject3) : vVar;
        }

        public String a() {
            return this.f5439a;
        }

        public long b() {
            return this.f5440b;
        }

        public String c() {
            return this.f5441c;
        }

        public final String d() {
            return this.f5442d;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f5449a;

        /* renamed from: b  reason: collision with root package name */
        private final long f5450b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5451c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5452d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5453e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5454f;

        b(JSONObject jSONObject) {
            this.f5452d = jSONObject.optString("billingPeriod");
            this.f5451c = jSONObject.optString("priceCurrencyCode");
            this.f5449a = jSONObject.optString("formattedPrice");
            this.f5450b = jSONObject.optLong("priceAmountMicros");
            this.f5454f = jSONObject.optInt("recurrenceMode");
            this.f5453e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f5453e;
        }

        public String b() {
            return this.f5452d;
        }

        public String c() {
            return this.f5449a;
        }

        public long d() {
            return this.f5450b;
        }

        public String e() {
            return this.f5451c;
        }

        public int f() {
            return this.f5454f;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final List f5455a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f5455a = arrayList;
        }

        public List<b> a() {
            return this.f5455a;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f5456a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5457b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5458c;

        /* renamed from: d  reason: collision with root package name */
        private final c f5459d;

        /* renamed from: e  reason: collision with root package name */
        private final List f5460e;

        /* renamed from: f  reason: collision with root package name */
        private final t f5461f;

        d(JSONObject jSONObject) {
            this.f5456a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            t tVar = null;
            this.f5457b = true == optString.isEmpty() ? null : optString;
            this.f5458c = jSONObject.getString("offerIdToken");
            this.f5459d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5461f = optJSONObject != null ? new t(optJSONObject) : tVar;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f5460e = arrayList;
        }

        public String a() {
            return this.f5456a;
        }

        public String b() {
            return this.f5457b;
        }

        public List<String> c() {
            return this.f5460e;
        }

        public String d() {
            return this.f5458c;
        }

        public c e() {
            return this.f5459d;
        }
    }

    g(String str) {
        ArrayList arrayList;
        this.f5426a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5427b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f5428c = optString;
        String optString2 = jSONObject.optString(ShareConstants.MEDIA_TYPE);
        this.f5429d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.f5430e = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_TITLE);
            this.f5431f = jSONObject.optString("name");
            this.f5432g = jSONObject.optString("description");
            this.f5434i = jSONObject.optString("packageDisplayName");
            this.f5435j = jSONObject.optString("iconUrl");
            this.f5433h = jSONObject.optString("skuDetailsToken");
            this.f5436k = jSONObject.optString("serializedDocid");
            JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList2.add(new d(optJSONArray.getJSONObject(i10)));
                }
                this.f5437l = arrayList2;
            } else {
                if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                this.f5437l = arrayList;
            }
            JSONObject optJSONObject = this.f5427b.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray2 = this.f5427b.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    arrayList3.add(new a(optJSONArray2.getJSONObject(i11)));
                }
                this.f5438m = arrayList3;
            } else if (optJSONObject != null) {
                arrayList3.add(new a(optJSONObject));
                this.f5438m = arrayList3;
            } else {
                this.f5438m = null;
            }
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    public String a() {
        return this.f5432g;
    }

    public String b() {
        return this.f5431f;
    }

    public a c() {
        List list = this.f5438m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (a) this.f5438m.get(0);
    }

    public String d() {
        return this.f5428c;
    }

    public String e() {
        return this.f5429d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return TextUtils.equals(this.f5426a, ((g) obj).f5426a);
    }

    public List<d> f() {
        return this.f5437l;
    }

    public String g() {
        return this.f5430e;
    }

    public final String h() {
        return this.f5427b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public int hashCode() {
        return this.f5426a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final String i() {
        return this.f5433h;
    }

    public String j() {
        return this.f5436k;
    }

    public String toString() {
        String str = this.f5426a;
        String obj = this.f5427b.toString();
        String str2 = this.f5428c;
        String str3 = this.f5429d;
        String str4 = this.f5430e;
        String str5 = this.f5433h;
        String valueOf = String.valueOf(this.f5437l);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
