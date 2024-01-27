package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.Clock;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdta {
    private final Clock zza;

    public zzdta(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(Constants.TIMESTAMP).value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = objArr[i10];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                zzcat.zzh("unable to log", e10);
            }
            zzcat.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
