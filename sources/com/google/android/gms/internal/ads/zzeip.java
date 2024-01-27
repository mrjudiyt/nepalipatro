package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeip {
    private final zzfed zza;
    private final zzdqg zzb;
    private final zzdso zzc;
    private final zzfib zzd;

    public zzeip(zzfed zzfed, zzdqg zzdqg, zzdso zzdso, zzfib zzfib) {
        this.zza = zzfed;
        this.zzb = zzdqg;
        this.zzc = zzdso;
        this.zzd = zzfib;
    }

    public final void zza(zzfcv zzfcv, zzfcr zzfcr, int i10, zzeey zzeey, long j10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfia zzb2 = zzfia.zzb("adapter_status");
            zzb2.zzg(zzfcv);
            zzb2.zzf(zzfcr);
            zzb2.zza("adapter_l", String.valueOf(j10));
            zzb2.zza("sc", Integer.toString(i10));
            if (zzeey != null) {
                zzb2.zza("arec", Integer.toString(zzeey.zzb().zza));
                String zza2 = this.zza.zza(zzeey.getMessage());
                if (zza2 != null) {
                    zzb2.zza("areec", zza2);
                }
            }
            zzdqf zzb3 = this.zzb.zzb(zzfcr.zzv);
            if (zzb3 != null) {
                zzb2.zza("ancn", zzb3.zza);
                zzbrj zzbrj = zzb3.zzb;
                if (zzbrj != null) {
                    zzb2.zza("adapter_v", zzbrj.toString());
                }
                zzbrj zzbrj2 = zzb3.zzc;
                if (zzbrj2 != null) {
                    zzb2.zza("adapter_sv", zzbrj2.toString());
                }
            }
            this.zzd.zzb(zzb2);
            return;
        }
        zzdsn zza3 = this.zzc.zza();
        zza3.zze(zzfcv);
        zza3.zzd(zzfcr);
        zza3.zzb(NativeProtocol.WEB_DIALOG_ACTION, "adapter_status");
        zza3.zzb("adapter_l", String.valueOf(j10));
        zza3.zzb("sc", Integer.toString(i10));
        if (zzeey != null) {
            zza3.zzb("arec", Integer.toString(zzeey.zzb().zza));
            String zza4 = this.zza.zza(zzeey.getMessage());
            if (zza4 != null) {
                zza3.zzb("areec", zza4);
            }
        }
        zzdqf zzb4 = this.zzb.zzb(zzfcr.zzv);
        if (zzb4 != null) {
            zza3.zzb("ancn", zzb4.zza);
            zzbrj zzbrj3 = zzb4.zzb;
            if (zzbrj3 != null) {
                zza3.zzb("adapter_v", zzbrj3.toString());
            }
            zzbrj zzbrj4 = zzb4.zzc;
            if (zzbrj4 != null) {
                zza3.zzb("adapter_sv", zzbrj4.toString());
            }
        }
        zza3.zzg();
    }
}
