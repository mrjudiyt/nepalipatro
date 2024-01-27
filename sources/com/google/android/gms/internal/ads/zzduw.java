package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzduw {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzduw(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = ((Integer) zzba.zzc().zzb(zzbci.zziS)).intValue();
        this.zzd = ((Integer) zzba.zzc().zzb(zzbci.zziT)).intValue();
    }

    public final JSONObject zza() {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str2 = this.zzb.packageName;
            zzfps zzfps = zzt.zza;
            jSONObject.put("name", Wrappers.packageManager(context).getApplicationLabel(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.zzb.packageName);
        com.google.android.gms.ads.internal.zzt.zzp();
        jSONObject.put("adMobAppId", zzt.zzp(this.zza));
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).f2455b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap createBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = str;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
