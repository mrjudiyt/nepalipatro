package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzawf {
    static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return ((i10 & 1) == 0 ? zza(j11, i11) : j10 * (zza(j11, i11) % 1073807359)) % 1073807359;
    }

    static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzcat.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb.append(strArr[i10]);
                sb.append(' ');
                i10++;
            } else {
                sb.append(strArr[i13]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            zzd(i10, zze(strArr2, 0, length), zzb(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr2, 0, 6);
        zzd(i10, zze, zzb(strArr2, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i12 < length2 - 5) {
                String zzb = zzb(strArr2, i12, 6);
                zze = ((((((zze + 1073807359) - ((zza(16785407, 5) * ((((long) zzawb.zza(strArr2[i12 - 1])) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzawb.zza(strArr2[i12 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                zzd(i10, zze, zzb, length2, priorityQueue);
                i12++;
            } else {
                return;
            }
        }
    }

    static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzawe zzawe = new zzawe(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzawe) priorityQueue.peek()).zzc <= zzawe.zzc && ((zzawe) priorityQueue.peek()).zza <= zzawe.zza)) && !priorityQueue.contains(zzawe)) {
            priorityQueue.add(zzawe);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (((long) zzawb.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zza * 16785407) % 1073807359) + ((((long) zzawb.zza(strArr[i12])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
