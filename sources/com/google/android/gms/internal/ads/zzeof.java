package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeof implements zzetv {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzeof(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzj(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.zza);
    }
}
