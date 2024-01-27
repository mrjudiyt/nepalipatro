package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpu extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpu zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgpx zzf;

    static {
        zzgpu zzgpu = new zzgpu();
        zzb = zzgpu;
        zzgtz.zzaU(zzgpu.class, zzgpu);
    }

    private zzgpu() {
    }

    public static zzgpt zzc() {
        return (zzgpt) zzb.zzaA();
    }

    public static zzgpu zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgpu) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzh(zzgpu zzgpu, zzgpx zzgpx) {
        zzgpx.getClass();
        zzgpu.zzf = zzgpx;
        zzgpu.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgpu();
        } else {
            if (i11 == 4) {
                return new zzgpt((zzgps) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpx zzf() {
        zzgpx zzgpx = this.zzf;
        return zzgpx == null ? zzgpx.zzc() : zzgpx;
    }
}
