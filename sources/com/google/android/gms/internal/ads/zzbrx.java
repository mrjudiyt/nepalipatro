package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbrx extends zzbry implements zzbjj {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcgb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbs zzk;
    private float zzl;
    private int zzm;

    public zzbrx(zzcgb zzcgb, Context context, zzbbs zzbbs) {
        super(zzcgb, "");
        this.zzh = zzcgb;
        this.zzi = context;
        this.zzk = zzbbs;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcgb zzcgb = (zzcgb) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcam.zzv(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcam.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi2 = this.zzh.zzi();
        if (zzi2 == null || zzi2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            zzt.zzp();
            int[] zzP = com.google.android.gms.ads.internal.util.zzt.zzP(zzi2);
            zzay.zzb();
            this.zzd = zzcam.zzv(this.zza, zzP[0]);
            zzay.zzb();
            this.zze = zzcam.zzv(this.zza, zzP[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrw zzbrw = new zzbrw();
        zzbbs zzbbs = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrw.zze(zzbbs.zza(intent));
        zzbbs zzbbs2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrw.zzc(zzbbs2.zza(intent2));
        zzbrw.zza(this.zzk.zzb());
        zzbrw.zzd(this.zzk.zzc());
        zzbrw.zzb(true);
        boolean zzh2 = zzbrw.zza;
        boolean zzj2 = zzbrw.zzb;
        boolean zzf2 = zzbrw.zzc;
        boolean zzi3 = zzbrw.zzd;
        boolean zzg2 = zzbrw.zze;
        zzcgb zzcgb2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi3).put("inlineVideo", zzg2);
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        zzcgb2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzay.zzb().zzb(this.zzi, iArr[0]), zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zzcat.zzm(2)) {
            zzcat.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        Context context = this.zzi;
        int i13 = 0;
        if (context instanceof Activity) {
            zzt.zzp();
            i12 = com.google.android.gms.ads.internal.util.zzt.zzQ((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcgb zzcgb = this.zzh;
            int width = zzcgb.getWidth();
            int height = zzcgb.getHeight();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzR)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = zzay.zzb().zzb(this.zzi, width);
                    this.zzg = zzay.zzb().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = zzay.zzb().zzb(this.zzi, width);
            this.zzg = zzay.zzb().zzb(this.zzi, i13);
        }
        zzf(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i10, i11);
    }
}
