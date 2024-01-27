package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfg implements zzei {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfg(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzff zzff) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzff);
            }
        }
    }

    private static zzff zzm() {
        zzff zzff;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzff = new zzff((zzfe) null);
            } else {
                zzff = (zzff) list.remove(list.size() - 1);
            }
        }
        return zzff;
    }

    public final Looper zza() {
        return this.zzb.getLooper();
    }

    public final zzeh zzb(int i10) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10), this);
        return zzm;
    }

    public final zzeh zzc(int i10, Object obj) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10, obj), this);
        return zzm;
    }

    public final zzeh zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    public final boolean zzk(zzeh zzeh) {
        return ((zzff) zzeh).zzc(this.zzb);
    }
}
