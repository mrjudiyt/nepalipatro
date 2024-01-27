package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpm extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpm zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgpm zzgpm = new zzgpm();
        zzb = zzgpm;
        zzgtz.zzaU(zzgpm.class, zzgpm);
    }

    private zzgpm() {
    }

    public static zzgpj zzd() {
        return (zzgpj) zzb.zzaA();
    }

    public static zzgpm zzg(InputStream inputStream, zzgtl zzgtl) {
        return (zzgpm) zzgtz.zzaH(zzb, inputStream, zzgtl);
    }

    static /* synthetic */ void zzj(zzgpm zzgpm, zzgpl zzgpl) {
        zzgpl.getClass();
        zzgui zzgui = zzgpm.zze;
        if (!zzgui.zzc()) {
            zzgpm.zze = zzgtz.zzaO(zzgui);
        }
        zzgpm.zze.add(zzgpl);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgpl.class});
        } else if (i11 == 3) {
            return new zzgpm();
        } else {
            if (i11 == 4) {
                return new zzgpj((zzgpi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgpl zze(int i10) {
        return (zzgpl) this.zze.get(i10);
    }

    public final List zzh() {
        return this.zze;
    }
}
