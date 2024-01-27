package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public interface zabf {
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t10);

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t10);

    void zad();

    void zae();

    void zag(Bundle bundle);

    void zah(ConnectionResult connectionResult, Api<?> api, boolean z10);

    void zai(int i10);

    boolean zaj();
}
