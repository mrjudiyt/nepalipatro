package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfmn implements Continuation {
    public final /* synthetic */ zzany zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfmn(zzany zzany, int i10) {
        this.zza = zzany;
        this.zzb = i10;
    }

    public final Object then(Task task) {
        int i10 = zzfmq.zza;
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        int i11 = this.zzb;
        zzfor zza2 = ((zzfos) task.getResult()).zza(((zzaoc) this.zza.zzal()).zzax());
        zza2.zza(i11);
        zza2.zzc();
        return Boolean.TRUE;
    }
}
