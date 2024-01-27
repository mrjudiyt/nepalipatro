package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.a;
import androidx.collection.h;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnq extends zzbgh {
    private final Context zza;
    private final zzdjj zzb;
    private zzdkj zzc;
    /* access modifiers changed from: private */
    public zzdje zzd;

    public zzdnq(Context context, zzdjj zzdjj, zzdkj zzdkj, zzdje zzdje) {
        this.zza = context;
        this.zzb = zzdjj;
        this.zzc = zzdkj;
        this.zzd = zzdje;
    }

    private final zzbfb zzd(String str) {
        return new zzdnp(this, "_videoMediaView");
    }

    public final zzdq zze() {
        return this.zzb.zzj();
    }

    public final zzbfl zzf() {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e10) {
            zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    public final zzbfo zzg(String str) {
        return (zzbfo) this.zzb.zzh().get(str);
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzi() {
        return this.zzb.zzA();
    }

    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzk() {
        try {
            h zzh = this.zzb.zzh();
            h zzi = this.zzb.zzi();
            String[] strArr = new String[(zzh.size() + zzi.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.size(); i11++) {
                strArr[i10] = (String) zzh.i(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.size(); i12++) {
                strArr[i10] = (String) zzi.i(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    public final void zzl() {
        zzdje zzdje = this.zzd;
        if (zzdje != null) {
            zzdje.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (zzC != "Google") {
                if (zzC == null || !zzC.equals("Google")) {
                    if (TextUtils.isEmpty(zzC)) {
                        zzcat.zzj("Not starting OMID session. OM partner name has not been configured.");
                        return;
                    }
                    zzdje zzdje = this.zzd;
                    if (zzdje != null) {
                        zzdje.zzf(zzC, false);
                        return;
                    }
                    return;
                }
            }
            zzcat.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e10) {
            zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    public final void zzn(String str) {
        zzdje zzdje = this.zzd;
        if (zzdje != null) {
            zzdje.zzD(str);
        }
    }

    public final void zzo() {
        zzdje zzdje = this.zzd;
        if (zzdje != null) {
            zzdje.zzG();
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdje zzdje;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdje = this.zzd) != null) {
            zzdje.zzH((View) unwrap);
        }
    }

    public final boolean zzq() {
        zzdje zzdje = this.zzd;
        if ((zzdje == null || zzdje.zzU()) && this.zzb.zzr() != null && this.zzb.zzs() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdkj zzdkj;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkj = this.zzc) == null || !zzdkj.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzao(zzd("_videoMediaView"));
        return true;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdkj zzdkj;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkj = this.zzc) == null || !zzdkj.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzao(zzd("_videoMediaView"));
        return true;
    }

    public final boolean zzt() {
        zzfkc zzu = this.zzb.zzu();
        if (zzu != null) {
            zzt.zzA().zzi(zzu);
            if (this.zzb.zzr() == null) {
                return true;
            }
            this.zzb.zzr().zzd("onSdkLoaded", new a());
            return true;
        }
        zzcat.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
