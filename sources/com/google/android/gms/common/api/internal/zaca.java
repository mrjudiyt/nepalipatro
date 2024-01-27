package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public interface zaca {
    ConnectionResult zab();

    ConnectionResult zac(long j10, TimeUnit timeUnit);

    ConnectionResult zad(Api<?> api);

    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(T t10);

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(T t10);

    void zaq();

    void zar();

    void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(SignInConnectionListener signInConnectionListener);
}
