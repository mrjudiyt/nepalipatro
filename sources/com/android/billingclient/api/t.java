package com.android.billingclient.api;

import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class t {
    t(JSONObject jSONObject) {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
