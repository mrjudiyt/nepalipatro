package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfcs {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfcs(int i10, int i11, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = z10;
    }

    static List zza(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (ViewHierarchyConstants.DIMENSION_WIDTH_KEY.equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if (ViewHierarchyConstants.DIMENSION_HEIGHT_KEY.equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z10 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfcs(i10, i11, z10));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
