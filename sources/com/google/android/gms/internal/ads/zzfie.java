package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfie implements zzfib {
    private final zzfib zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzba.zzc().zzb(zzbci.zziu)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfie(zzfib zzfib, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfib;
        long intValue = (long) ((Integer) zzba.zzc().zzb(zzbci.zzit)).intValue();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkO)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new zzfid(this), intValue, intValue, TimeUnit.MILLISECONDS);
            return;
        }
        scheduledExecutorService.scheduleAtFixedRate(new zzfid(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfie zzfie) {
        while (!zzfie.zzb.isEmpty()) {
            zzfie.zza.zzb((zzfia) zzfie.zzb.remove());
        }
    }

    public final String zza(zzfia zzfia) {
        return this.zza.zza(zzfia);
    }

    public final void zzb(zzfia zzfia) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfia);
        } else if (!this.zzd.getAndSet(true)) {
            Queue queue = this.zzb;
            zzfia zzb2 = zzfia.zzb("dropped_event");
            Map zzj = zzfia.zzj();
            if (zzj.containsKey(NativeProtocol.WEB_DIALOG_ACTION)) {
                zzb2.zza("dropped_action", (String) zzj.get(NativeProtocol.WEB_DIALOG_ACTION));
            }
            queue.offer(zzb2);
        }
    }
}
