package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzff implements zzeh {
    private Message zza;
    private zzfg zzb;

    private zzff() {
    }

    /* synthetic */ zzff(zzfe zzfe) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfg.zzl(this);
    }

    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final zzff zzb(Message message, zzfg zzfg) {
        this.zza = message;
        this.zzb = zzfg;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
