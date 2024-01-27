package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbi {
    public static final zzn zza = zzbg.zza;
    private static final String zzl = Integer.toString(0, 36);
    private static final String zzm = Integer.toString(1, 36);
    private static final String zzn = Integer.toString(2, 36);
    private static final String zzo = Integer.toString(3, 36);
    private static final String zzp = Integer.toString(4, 36);
    private static final String zzq = Integer.toString(5, 36);
    private static final String zzr = Integer.toString(6, 36);
    private static final String zzs = Integer.toString(7, 36);
    public final Uri zzb;
    public final String zzc = null;
    public final zzbb zzd = null;
    public final zzaq zze = null;
    public final List zzf;
    public final String zzg;
    public final zzfvs zzh;
    @Deprecated
    public final List zzi;
    public final Object zzj;
    public final long zzk;

    /* synthetic */ zzbi(Uri uri, String str, zzbb zzbb, zzaq zzaq, List list, String str2, zzfvs zzfvs, Object obj, long j10, zzbh zzbh) {
        this.zzb = uri;
        this.zzf = list;
        this.zzg = null;
        this.zzh = zzfvs;
        zzfvp zzfvp = new zzfvp();
        if (zzfvs.size() <= 0) {
            this.zzi = zzfvp.zzi();
            this.zzj = null;
            this.zzk = -9223372036854775807L;
            return;
        }
        zzbn zzbn = (zzbn) zzfvs.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbi = (zzbi) obj;
        return this.zzb.equals(zzbi.zzb) && zzfk.zzE((Object) null, (Object) null) && zzfk.zzE((Object) null, (Object) null) && zzfk.zzE((Object) null, (Object) null) && this.zzf.equals(zzbi.zzf) && zzfk.zzE((Object) null, (Object) null) && this.zzh.equals(zzbi.zzh) && zzfk.zzE((Object) null, (Object) null) && zzfk.zzE(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zzb.hashCode() * 923521) + this.zzf.hashCode()) * 961) + this.zzh.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
