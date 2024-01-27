package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzg implements zzt {
    private static final Uri zza;
    private final LogPrinter zzb = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ShareConstants.MEDIA_URI);
        builder.authority(ImagesContract.LOCAL);
        zza = builder.build();
    }

    public final Uri zzb() {
        return zza;
    }

    public final void zze(zzh zzh) {
        ArrayList arrayList = new ArrayList(zzh.zze());
        Collections.sort(arrayList, new zzf(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String obj = ((zzj) arrayList.get(i10)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.zzb.println(sb.toString());
    }
}
