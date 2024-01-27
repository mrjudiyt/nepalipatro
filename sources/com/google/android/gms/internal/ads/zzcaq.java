package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzcaq implements zzcar {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcaq(int i10, Map map) {
        this.zza = i10;
        this.zzb = map;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzcas.zzb(this.zza, this.zzb, jsonWriter);
    }
}
