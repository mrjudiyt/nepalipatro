package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatu extends zzaud {
    private final boolean zzi;

    public zzatu(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzaom, i10, 61);
        this.zzi = zzasp.zzs();
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(this.zzi)})).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
