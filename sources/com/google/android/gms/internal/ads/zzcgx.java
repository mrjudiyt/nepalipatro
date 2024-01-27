package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcgx extends zzdp {
    private final zzcdc zza;
    private final Object zzb = new Object();
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzdt zzf;
    private boolean zzg;
    private boolean zzh = true;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbgw zzn;

    public zzcgx(zzcdc zzcdc, float f10, boolean z10, boolean z11) {
        this.zza = zzcdc;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(int i10, int i11, boolean z10, boolean z11) {
        zzcbg.zze.execute(new zzcgw(this, i10, i11, z10, z11));
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, str);
        zzcbg.zze.execute(new zzcgv(this, hashMap));
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi) {
                if (f12 == this.zzk) {
                    z11 = false;
                }
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbgw zzbgw = this.zzn;
                if (zzbgw != null) {
                    zzbgw.zze();
                }
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        int i12;
        boolean z13;
        zzdt zzdt;
        zzdt zzdt2;
        zzdt zzdt3;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            boolean z15 = false;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z16 = i10 != i11;
            if (!z16 || i12 != 1) {
                z13 = false;
            } else {
                z13 = true;
                i12 = 1;
            }
            boolean z17 = z16 && i12 == 2;
            boolean z18 = z16 && i12 == 3;
            if (z14 || z12) {
                z15 = true;
            }
            this.zzg = z15;
            if (z12) {
                try {
                    zzdt zzdt4 = this.zzf;
                    if (zzdt4 != null) {
                        zzdt4.zzi();
                    }
                } catch (RemoteException e10) {
                    zzcat.zzl("#007 Could not call remote method.", e10);
                }
            }
            if (z13 && (zzdt3 = this.zzf) != null) {
                zzdt3.zzh();
            }
            if (z17 && (zzdt2 = this.zzf) != null) {
                zzdt2.zzg();
            }
            if (z18) {
                zzdt zzdt5 = this.zzf;
                if (zzdt5 != null) {
                    zzdt5.zze();
                }
                this.zza.zzw();
            }
            if (!(z10 == z11 || (zzdt = this.zzf) == null)) {
                zzdt.zzf(z11);
            }
        }
    }

    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    public final zzdt zzi() {
        zzdt zzdt;
        synchronized (this.zzb) {
            zzdt = this.zzf;
        }
        return zzdt;
    }

    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", (Map) null);
    }

    public final void zzk() {
        zzx("pause", (Map) null);
    }

    public final void zzl() {
        zzx("play", (Map) null);
    }

    public final void zzm(zzdt zzdt) {
        synchronized (this.zzb) {
            this.zzf = zzdt;
        }
    }

    public final void zzn() {
        zzx("stop", (Map) null);
    }

    public final boolean zzo() {
        boolean z10;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z10;
    }

    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(zzfl zzfl) {
        Object obj = this.zzb;
        boolean z10 = zzfl.zza;
        boolean z11 = zzfl.zzb;
        boolean z12 = zzfl.zzc;
        synchronized (obj) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "customControlsRequested", true != z11 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "clickToExpandRequested", true != z12 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbgw zzbgw) {
        synchronized (this.zzb) {
            this.zzn = zzbgw;
        }
    }
}
