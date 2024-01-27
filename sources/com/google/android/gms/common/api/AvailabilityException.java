package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class AvailabilityException extends Exception {
    private final a<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(a<ApiKey<?>, ConnectionResult> aVar) {
        this.zaa = aVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (ApiKey next : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(next));
            z10 &= !connectionResult.isSuccess();
            String zab = next.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb.append(zab);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
    }
}
