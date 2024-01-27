package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzcan implements zzcar {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;
    public final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzcan(String str, String str2, Map map, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        this.zzd = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzcas.zza(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter);
    }
}
