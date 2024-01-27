package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final zzfvs zzh;
    /* access modifiers changed from: private */
    public final zzfvs zzi;
    private final int zzj;
    private final int zzk;
    /* access modifiers changed from: private */
    public final zzfvs zzl;
    /* access modifiers changed from: private */
    public zzfvs zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public final HashMap zzo;
    /* access modifiers changed from: private */
    public final HashSet zzp;

    @Deprecated
    public zzdb() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfvs.zzl();
        this.zzi = zzfvs.zzl();
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzfvs.zzl();
        this.zzm = zzfvs.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzdb zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzfk.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfvs.zzm(zzfk.zzz(locale));
            }
        }
        return this;
    }

    public zzdb zze(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    protected zzdb(zzdc zzdc) {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = zzdc.zzl;
        this.zzf = zzdc.zzm;
        this.zzg = zzdc.zzn;
        this.zzh = zzdc.zzo;
        this.zzi = zzdc.zzq;
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzdc.zzu;
        this.zzm = zzdc.zzw;
        this.zzn = zzdc.zzx;
        this.zzp = new HashSet(zzdc.zzD);
        this.zzo = new HashMap(zzdc.zzC);
    }
}
