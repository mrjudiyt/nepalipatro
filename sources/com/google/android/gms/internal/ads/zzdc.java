package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdc {
    private static final String zzE = Integer.toString(1, 36);
    private static final String zzF = Integer.toString(2, 36);
    private static final String zzG = Integer.toString(3, 36);
    private static final String zzH = Integer.toString(4, 36);
    private static final String zzI = Integer.toString(5, 36);
    private static final String zzJ = Integer.toString(6, 36);
    private static final String zzK = Integer.toString(7, 36);
    private static final String zzL = Integer.toString(8, 36);
    private static final String zzM = Integer.toString(9, 36);
    private static final String zzN = Integer.toString(10, 36);
    private static final String zzO = Integer.toString(11, 36);
    private static final String zzP = Integer.toString(12, 36);
    private static final String zzQ = Integer.toString(13, 36);
    private static final String zzR = Integer.toString(14, 36);
    private static final String zzS = Integer.toString(15, 36);
    private static final String zzT = Integer.toString(16, 36);
    private static final String zzU = Integer.toString(17, 36);
    private static final String zzV = Integer.toString(18, 36);
    private static final String zzW = Integer.toString(19, 36);
    private static final String zzX = Integer.toString(20, 36);
    private static final String zzY = Integer.toString(21, 36);
    private static final String zzZ = Integer.toString(22, 36);
    public static final zzdc zza;
    private static final String zzaa = Integer.toString(23, 36);
    private static final String zzab = Integer.toString(24, 36);
    private static final String zzac = Integer.toString(25, 36);
    private static final String zzad = Integer.toString(26, 36);
    private static final String zzae = Integer.toString(27, 36);
    private static final String zzaf = Integer.toString(28, 36);
    private static final String zzag = Integer.toString(29, 36);
    @Deprecated
    public static final zzdc zzb;
    @Deprecated
    public static final zzn zzc = zzda.zza;
    public final boolean zzA;
    public final boolean zzB;
    public final zzfvv zzC;
    public final zzfvx zzD;
    public final int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfvs zzo;
    public final int zzp;
    public final zzfvs zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfvs zzu;
    public final int zzv;
    public final zzfvs zzw;
    public final int zzx;
    public final int zzy;
    public final boolean zzz;

    static {
        zzdc zzdc = new zzdc(new zzdb());
        zza = zzdc;
        zzb = zzdc;
    }

    protected zzdc(zzdb zzdb) {
        this.zzl = zzdb.zze;
        this.zzm = zzdb.zzf;
        this.zzn = zzdb.zzg;
        this.zzo = zzdb.zzh;
        this.zzp = 0;
        this.zzq = zzdb.zzi;
        this.zzr = 0;
        this.zzs = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzt = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzu = zzdb.zzl;
        this.zzv = 0;
        this.zzw = zzdb.zzm;
        this.zzx = zzdb.zzn;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzC = zzfvv.zzc(zzdb.zzo);
        this.zzD = zzfvx.zzl(zzdb.zzp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdc zzdc = (zzdc) obj;
            return this.zzn == zzdc.zzn && this.zzl == zzdc.zzl && this.zzm == zzdc.zzm && this.zzo.equals(zzdc.zzo) && this.zzq.equals(zzdc.zzq) && this.zzu.equals(zzdc.zzu) && this.zzw.equals(zzdc.zzw) && this.zzx == zzdc.zzx && this.zzC.equals(zzdc.zzC) && this.zzD.equals(zzdc.zzD);
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - true) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + this.zzu.hashCode()) * 923521) + this.zzw.hashCode()) * 31) + this.zzx) * 28629151) + this.zzC.hashCode()) * 31) + this.zzD.hashCode();
    }
}
