package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebi {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzebi zza(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            HashMap hashMap = new HashMap();
            long j10 = -1;
            String str = "";
            jsonReader.beginObject();
            int i10 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("response".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("body".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("latency".equals(nextName)) {
                    j10 = jsonReader.nextLong();
                } else if ("headers".equals(nextName)) {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), zzbw.zzd(jsonReader));
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            zzebi zzebi = new zzebi();
            zzebi.zza = i10;
            if (str != null) {
                zzebi.zzc = str;
            }
            zzebi.zzd = j10;
            zzebi.zzb = hashMap;
            IOUtils.closeQuietly((Closeable) reader);
            return zzebi;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e10) {
            throw new zzfcw("Unable to parse Response", e10);
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) reader);
            throw th;
        }
    }
}
