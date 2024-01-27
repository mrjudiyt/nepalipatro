package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzerb implements zzetw {
    private final zzgad zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerb(zzgad zzgad, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgad;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final e zzb() {
        return this.zza.zzb(new zzera(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzerc zzc() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfP)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzerc(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfQ)).booleanValue() && this.zzd.contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z10 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z10 = true;
                        }
                        bool = Boolean.valueOf(z10);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzerc(bool);
            }
        }
        return new zzerc((Boolean) null);
    }
}
