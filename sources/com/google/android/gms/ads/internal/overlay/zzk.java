package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzk extends zzb {
    final /* synthetic */ zzl zza;

    /* synthetic */ zzk(zzl zzl, zzj zzj) {
        this.zza = zzl;
    }

    public final void zza() {
        BitmapDrawable bitmapDrawable;
        Bitmap zza2 = zzt.zzu().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (zza2 != null) {
            zzt.zzp();
            zzl zzl = this.zza;
            zzj zzj = zzl.zzc.zzo;
            boolean z10 = zzj.zzd;
            float f10 = zzj.zze;
            Activity activity = zzl.zzb;
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza2);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza2, zza2.getWidth(), zza2.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza2);
                }
            }
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzi(this, bitmapDrawable));
        }
    }
}
