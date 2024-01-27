package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzawa {
    private final int zza;
    private final zzavx zzb = new zzawc();

    public zzawa(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzavz zzavz = new zzavz();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzavy(this));
        for (String zzb2 : split) {
            String[] zzb3 = zzawb.zzb(zzb2, false);
            if (zzb3.length != 0) {
                zzawf.zzc(zzb3, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzavz.zzb.write(this.zzb.zzb(((zzawe) it.next()).zzb));
            } catch (IOException e10) {
                zzcat.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzavz.toString();
    }
}
