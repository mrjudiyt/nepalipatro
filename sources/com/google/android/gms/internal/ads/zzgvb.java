package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvb implements zzgwd {
    private static final zzgvh zza = new zzguz();
    private final zzgvh zzb;

    public zzgvb() {
        zzgvh zzgvh;
        zzgvh[] zzgvhArr = new zzgvh[2];
        zzgvhArr[0] = zzgtu.zza();
        try {
            zzgvh = (zzgvh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzgvh = zza;
        }
        zzgvhArr[1] = zzgvh;
        zzgva zzgva = new zzgva(zzgvhArr);
        byte[] bArr = zzguj.zzd;
        this.zzb = zzgva;
    }

    private static boolean zzb(zzgvg zzgvg) {
        return zzgvg.zzc() + -1 != 1;
    }

    public final zzgwc zza(Class cls) {
        Class<zzgtz> cls2 = zzgtz.class;
        zzgwe.zzr(cls);
        zzgvg zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzgvn.zzc(zzgwe.zzn(), zzgto.zzb(), zzb2.zza());
            }
            return zzgvn.zzc(zzgwe.zzm(), zzgto.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzgvm.zzl(cls, zzb2, zzgvp.zzb(), zzgux.zze(), zzgwe.zzn(), zzgto.zzb(), zzgvf.zzb());
            }
            return zzgvm.zzl(cls, zzb2, zzgvp.zzb(), zzgux.zze(), zzgwe.zzn(), (zzgtm) null, zzgvf.zzb());
        } else if (zzb(zzb2)) {
            return zzgvm.zzl(cls, zzb2, zzgvp.zza(), zzgux.zzd(), zzgwe.zzm(), zzgto.zza(), zzgvf.zza());
        } else {
            return zzgvm.zzl(cls, zzb2, zzgvp.zza(), zzgux.zzd(), zzgwe.zzm(), (zzgtm) null, zzgvf.zza());
        }
    }
}
