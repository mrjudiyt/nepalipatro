package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeno implements zzetv {
    public final Context zza;
    public final zzq zzb;
    public final List zzc;

    public zzeno(Context context, zzq zzq, List list) {
        this.zza = context;
        this.zzb = zzq;
        this.zzc = list;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzt.zzp();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.zzb.zze);
            bundle3.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzb.zzb);
            bundle2.putBundle("size", bundle3);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
