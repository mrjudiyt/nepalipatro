package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.h;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdjj {
    private int zza;
    private zzdq zzb;
    private zzbfg zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzel zzg;
    private Bundle zzh;
    private zzcgb zzi;
    private zzcgb zzj;
    private zzcgb zzk;
    private zzfkc zzl;
    private e zzm;
    private zzcbl zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfo zzs;
    private zzbfo zzt;
    private String zzu;
    private final h zzv = new h();
    private final h zzw = new h();
    private float zzx;
    private String zzy;

    public static zzdjj zzag(zzbpi zzbpi) {
        try {
            zzdji zzak = zzak(zzbpi.zzg(), (zzbpm) null);
            zzbfg zzh2 = zzbpi.zzh();
            String zzo2 = zzbpi.zzo();
            List zzr2 = zzbpi.zzr();
            String zzm2 = zzbpi.zzm();
            Bundle zzf2 = zzbpi.zzf();
            String zzn2 = zzbpi.zzn();
            IObjectWrapper zzl2 = zzbpi.zzl();
            String zzq2 = zzbpi.zzq();
            String zzp2 = zzbpi.zzp();
            double zze2 = zzbpi.zze();
            zzbfo zzi2 = zzbpi.zzi();
            zzdjj zzdjj = new zzdjj();
            zzdjj.zza = 2;
            zzdjj.zzb = zzak;
            zzdjj.zzc = zzh2;
            zzdjj.zzd = (View) zzam(zzbpi.zzj());
            zzdjj.zzZ("headline", zzo2);
            zzdjj.zze = zzr2;
            zzdjj.zzZ("body", zzm2);
            zzdjj.zzh = zzf2;
            zzdjj.zzZ("call_to_action", zzn2);
            zzdjj.zzo = (View) zzam(zzbpi.zzk());
            zzdjj.zzq = zzl2;
            zzdjj.zzZ("store", zzq2);
            zzdjj.zzZ(FirebaseAnalytics.Param.PRICE, zzp2);
            zzdjj.zzr = zze2;
            zzdjj.zzs = zzi2;
            return zzdjj;
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to get native ad from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdjj zzah(zzbpj zzbpj) {
        try {
            zzdji zzak = zzak(zzbpj.zzf(), (zzbpm) null);
            zzbfg zzg2 = zzbpj.zzg();
            String zzo2 = zzbpj.zzo();
            List zzp2 = zzbpj.zzp();
            String zzm2 = zzbpj.zzm();
            Bundle zze2 = zzbpj.zze();
            String zzn2 = zzbpj.zzn();
            IObjectWrapper zzk2 = zzbpj.zzk();
            String zzl2 = zzbpj.zzl();
            zzbfo zzh2 = zzbpj.zzh();
            zzdjj zzdjj = new zzdjj();
            zzdjj.zza = 1;
            zzdjj.zzb = zzak;
            zzdjj.zzc = zzg2;
            zzdjj.zzd = (View) zzam(zzbpj.zzi());
            zzdjj.zzZ("headline", zzo2);
            zzdjj.zze = zzp2;
            zzdjj.zzZ("body", zzm2);
            zzdjj.zzh = zze2;
            zzdjj.zzZ("call_to_action", zzn2);
            zzdjj.zzo = (View) zzam(zzbpj.zzj());
            zzdjj.zzq = zzk2;
            zzdjj.zzZ("advertiser", zzl2);
            zzdjj.zzt = zzh2;
            return zzdjj;
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdjj zzai(zzbpi zzbpi) {
        try {
            return zzal(zzak(zzbpi.zzg(), (zzbpm) null), zzbpi.zzh(), (View) zzam(zzbpi.zzj()), zzbpi.zzo(), zzbpi.zzr(), zzbpi.zzm(), zzbpi.zzf(), zzbpi.zzn(), (View) zzam(zzbpi.zzk()), zzbpi.zzl(), zzbpi.zzq(), zzbpi.zzp(), zzbpi.zze(), zzbpi.zzi(), (String) null, 0.0f);
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdjj zzaj(zzbpj zzbpj) {
        try {
            return zzal(zzak(zzbpj.zzf(), (zzbpm) null), zzbpj.zzg(), (View) zzam(zzbpj.zzi()), zzbpj.zzo(), zzbpj.zzp(), zzbpj.zzm(), zzbpj.zze(), zzbpj.zzn(), (View) zzam(zzbpj.zzj()), zzbpj.zzk(), (String) null, (String) null, -1.0d, zzbpj.zzh(), zzbpj.zzl(), 0.0f);
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdji zzak(zzdq zzdq, zzbpm zzbpm) {
        if (zzdq == null) {
            return null;
        }
        return new zzdji(zzdq, zzbpm);
    }

    private static zzdjj zzal(zzdq zzdq, zzbfg zzbfg, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzbfo zzbfo, String str6, float f10) {
        zzdjj zzdjj = new zzdjj();
        zzdjj.zza = 6;
        zzdjj.zzb = zzdq;
        zzdjj.zzc = zzbfg;
        zzdjj.zzd = view;
        String str7 = str;
        zzdjj.zzZ("headline", str);
        zzdjj.zze = list;
        String str8 = str2;
        zzdjj.zzZ("body", str2);
        zzdjj.zzh = bundle;
        String str9 = str3;
        zzdjj.zzZ("call_to_action", str3);
        zzdjj.zzo = view2;
        zzdjj.zzq = iObjectWrapper;
        String str10 = str4;
        zzdjj.zzZ("store", str4);
        String str11 = str5;
        zzdjj.zzZ(FirebaseAnalytics.Param.PRICE, str5);
        zzdjj.zzr = d10;
        zzdjj.zzs = zzbfo;
        zzdjj.zzZ("advertiser", str6);
        zzdjj.zzR(f10);
        return zzdjj;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdjj zzt(zzbpm zzbpm) {
        try {
            return zzal(zzak(zzbpm.zzj(), zzbpm), zzbpm.zzk(), (View) zzam(zzbpm.zzm()), zzbpm.zzs(), zzbpm.zzv(), zzbpm.zzq(), zzbpm.zzi(), zzbpm.zzr(), (View) zzam(zzbpm.zzn()), zzbpm.zzo(), zzbpm.zzu(), zzbpm.zzt(), zzbpm.zze(), zzbpm.zzl(), zzbpm.zzp(), zzbpm.zzf());
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcgb zzcgb = this.zzi;
        if (zzcgb != null) {
            zzcgb.destroy();
            this.zzi = null;
        }
        zzcgb zzcgb2 = this.zzj;
        if (zzcgb2 != null) {
            zzcgb2.destroy();
            this.zzj = null;
        }
        zzcgb zzcgb3 = this.zzk;
        if (zzcgb3 != null) {
            zzcgb3.destroy();
            this.zzk = null;
        }
        e eVar = this.zzm;
        if (eVar != null) {
            eVar.cancel(false);
            this.zzm = null;
        }
        zzcbl zzcbl = this.zzn;
        if (zzcbl != null) {
            zzcbl.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbfg zzbfg) {
        this.zzc = zzbfg;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(zzel zzel) {
        this.zzg = zzel;
    }

    public final synchronized void zzM(zzbfo zzbfo) {
        this.zzs = zzbfo;
    }

    public final synchronized void zzN(String str, zzbfa zzbfa) {
        if (zzbfa == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfa);
        }
    }

    public final synchronized void zzO(zzcgb zzcgb) {
        this.zzj = zzcgb;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfo zzbfo) {
        this.zzt = zzbfo;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcgb zzcgb) {
        this.zzk = zzcgb;
    }

    public final synchronized void zzU(e eVar) {
        this.zzm = eVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzfkc zzfkc) {
        this.zzl = zzfkc;
    }

    public final synchronized void zzX(zzcbl zzcbl) {
        this.zzn = zzcbl;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(zzdq zzdq) {
        this.zzb = zzdq;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcgb zzcgb) {
        this.zzi = zzcgb;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized h zzh() {
        return this.zzv;
    }

    public final synchronized h zzi() {
        return this.zzw;
    }

    public final synchronized zzdq zzj() {
        return this.zzb;
    }

    public final synchronized zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbfg zzl() {
        return this.zzc;
    }

    public final zzbfo zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfn.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbfo zzn() {
        return this.zzs;
    }

    public final synchronized zzbfo zzo() {
        return this.zzt;
    }

    public final synchronized zzcbl zzp() {
        return this.zzn;
    }

    public final synchronized zzcgb zzq() {
        return this.zzj;
    }

    public final synchronized zzcgb zzr() {
        return this.zzk;
    }

    public final synchronized zzcgb zzs() {
        return this.zzi;
    }

    public final synchronized zzfkc zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized e zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
