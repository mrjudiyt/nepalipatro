package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.facebook.internal.NativeProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzcap implements zzcar {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzcap(String str) {
        this.zza = str;
    }

    public final void zza(JsonWriter jsonWriter) {
        int i10 = zzcas.zza;
        jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginObject();
        String str = this.zza;
        if (str != null) {
            jsonWriter.name(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION).value(str);
        }
        jsonWriter.endObject();
    }
}
