package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzath extends zzaud {
    public zzath(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzaom, i10, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String id = info.getId();
                int i10 = zzass.zza;
                if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(id);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    id = zzapz.zza(bArr, true);
                }
                if (id != null) {
                    synchronized (this.zze) {
                        this.zze.zzs(id);
                        this.zze.zzr(info.isLimitAdTrackingEnabled());
                        this.zze.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        zzl();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzs((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()}));
            }
            return;
        }
        zzc();
    }

    public final Void zzl() {
        if (this.zzb.zzr()) {
            super.zzl();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
