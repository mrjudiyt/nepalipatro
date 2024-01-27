package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgn {
    public static final /* synthetic */ int zzj = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbq.zzb("media3.datasource");
    }

    public zzgn(Uri uri) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 0, (Object) null);
    }

    /* synthetic */ zzgn(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, zzgm zzgm) {
        this(uri, 0, 1, (byte[]) null, map, j11, -1, (String) null, i11, (Object) null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return "DataSpec[" + "GET" + " " + valueOf + ", " + this.zzf + ", " + this.zzg + ", null, " + this.zzi + "]";
    }

    public final boolean zza(int i10) {
        return (this.zzi & i10) == i10;
    }

    @Deprecated
    public zzgn(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, (byte[]) null, Collections.emptyMap(), j11, j12, (String) null, i10, (Object) null);
    }

    private zzgn(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j11;
        long j14 = j10 + j13;
        boolean z10 = false;
        zzdx.zzd(j14 >= 0);
        zzdx.zzd(j13 >= 0);
        long j15 = -1;
        if (j12 > 0) {
            j15 = j12;
        } else if (j12 != -1) {
            j15 = j12;
            zzdx.zzd(z10);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j13;
            this.zze = j14;
            this.zzg = j15;
            this.zzh = null;
            this.zzi = i11;
        }
        z10 = true;
        zzdx.zzd(z10);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j13;
        this.zze = j14;
        this.zzg = j15;
        this.zzh = null;
        this.zzi = i11;
    }
}
