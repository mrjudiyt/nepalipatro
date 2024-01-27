package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbso;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class OfflinePingSender extends Worker {
    private final zzbso zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbou());
    }

    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzh();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
