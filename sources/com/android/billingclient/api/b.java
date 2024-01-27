package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import z1.n0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f5347a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5348b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5349c;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f5350a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5351b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5352c;

        /* synthetic */ a(JSONObject jSONObject, n0 n0Var) {
            this.f5350a = jSONObject.optString("productId");
            this.f5351b = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.f5352c = true == optString.isEmpty() ? null : optString;
        }

        public String a() {
            return this.f5350a;
        }

        public String b() {
            return this.f5352c;
        }

        public String c() {
            return this.f5351b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
            r1 = r4.f5352c;
            r5 = r5.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.android.billingclient.api.b.a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.android.billingclient.api.b$a r5 = (com.android.billingclient.api.b.a) r5
                java.lang.String r1 = r4.f5350a
                java.lang.String r3 = r5.a()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0035
                java.lang.String r1 = r4.f5351b
                java.lang.String r3 = r5.c()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0035
                java.lang.String r1 = r4.f5352c
                java.lang.String r5 = r5.b()
                if (r1 == r5) goto L_0x0034
                if (r1 == 0) goto L_0x0035
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x0035
            L_0x0034:
                return r0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5350a, this.f5351b, this.f5352c});
        }

        public final String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", new Object[]{this.f5350a, this.f5351b, this.f5352c});
        }
    }

    b(String str) {
        this.f5347a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5348b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new a(optJSONObject, (n0) null));
                }
            }
        }
        this.f5349c = arrayList;
    }
}
