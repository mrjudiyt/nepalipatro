package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfqa {
    public static e zza(Task task) {
        zzfpz zzfpz = new zzfpz(task);
        task.addOnCompleteListener(zzgaj.zzb(), new zzfpy(zzfpz));
        return zzfpz;
    }
}
