package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.Base64Utils;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzcao implements zzcar {
    public final /* synthetic */ byte[] zza;

    public /* synthetic */ zzcao(byte[] bArr) {
        this.zza = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        int i10 = zzcas.zza;
        jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginObject();
        byte[] bArr = this.zza;
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zze = zzcam.zze(encode);
            if (zze != null) {
                jsonWriter.name("bodydigest").value(zze);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
