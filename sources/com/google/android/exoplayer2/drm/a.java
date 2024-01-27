package com.google.android.exoplayer2.drm;

import a6.m0;
import a6.p;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClearKeyUtil */
final class a {
    public static byte[] a(byte[] bArr) {
        if (m0.f205a >= 27) {
            return bArr;
        }
        return m0.g0(c(m0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (m0.f205a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(m0.D(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return m0.g0(sb.toString());
        } catch (JSONException e10) {
            String valueOf = String.valueOf(m0.D(bArr));
            p.d("ClearKeyUtil", valueOf.length() != 0 ? "Failed to adjust response data: ".concat(valueOf) : new String("Failed to adjust response data: "), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
