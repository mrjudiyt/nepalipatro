package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcai {
    public static final ThreadPoolExecutor zza = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zzcah("ClientDefault"));
    public static final ExecutorService zzb = Executors.newSingleThreadExecutor(new zzcah("ClientSingle"));
}
