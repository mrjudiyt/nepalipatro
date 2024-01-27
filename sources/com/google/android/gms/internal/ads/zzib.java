package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzib {
    private final AudioManager zza;
    private final zzhz zzb;
    private zzia zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzib(Context context, Handler handler, zzia zzia) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzia;
        this.zzb = new zzhz(this, handler);
        this.zzd = 0;
    }

    static /* bridge */ /* synthetic */ void zzc(zzib zzib, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzib.zzg(3);
                return;
            }
            zzib.zzf(0);
            zzib.zzg(2);
        } else if (i10 == -1) {
            zzib.zzf(-1);
            zzib.zze();
        } else if (i10 != 1) {
            zzer.zzf("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            zzib.zzg(1);
            zzib.zzf(1);
        }
    }

    private final void zze() {
        if (this.zzd != 0) {
            if (zzfk.zza < 26) {
                this.zza.abandonAudioFocus(this.zzb);
            }
            zzg(0);
        }
    }

    private final void zzf(int i10) {
        zzia zzia = this.zzc;
        if (zzia != null) {
            zzjx zzjx = (zzjx) zzia;
            boolean zzv = zzjx.zza.zzv();
            zzjx.zza.zzal(zzv, i10, zzkb.zzY(zzv, i10));
        }
    }

    private final void zzg(int i10) {
        if (this.zzd != i10) {
            this.zzd = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.zze != f10) {
                this.zze = f10;
                zzia zzia = this.zzc;
                if (zzia != null) {
                    ((zzjx) zzia).zza.zzai();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        return z10 ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
