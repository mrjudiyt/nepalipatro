package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfnj {
    private final Context zza;
    private final Executor zzb;
    private final zzfmq zzc;
    private final zzfms zzd;
    private final zzfni zze;
    private final zzfni zzf;
    private Task zzg;
    private Task zzh;

    zzfnj(Context context, Executor executor, zzfmq zzfmq, zzfms zzfms, zzfng zzfng, zzfnh zzfnh) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfmq;
        this.zzd = zzfms;
        this.zze = zzfng;
        this.zzf = zzfnh;
    }

    public static zzfnj zze(Context context, Executor executor, zzfmq zzfmq, zzfms zzfms) {
        zzfnj zzfnj = new zzfnj(context, executor, zzfmq, zzfms, new zzfng(), new zzfnh());
        if (zzfnj.zzd.zzd()) {
            zzfnj.zzg = zzfnj.zzh(new zzfnd(zzfnj));
        } else {
            zzfnj.zzg = Tasks.forResult(zzfnj.zze.zza());
        }
        zzfnj.zzh = zzfnj.zzh(new zzfne(zzfnj));
        return zzfnj;
    }

    private static zzapj zzg(Task task, zzapj zzapj) {
        if (!task.isSuccessful()) {
            return zzapj;
        }
        return (zzapj) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzfnf(this));
    }

    public final zzapj zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzapj zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzapj zzc() {
        zzaom zza2 = zzapj.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza2.zzs(id);
            zza2.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzab(6);
        }
        return (zzapj) zza2.zzal();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzapj zzd() {
        Context context = this.zza;
        return zzfmy.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}
