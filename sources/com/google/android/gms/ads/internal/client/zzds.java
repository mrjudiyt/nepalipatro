package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzds extends zzaun implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zze();
        } else if (i10 != 5) {
            return false;
        } else {
            boolean zzg = zzauo.zzg(parcel);
            zzauo.zzc(parcel);
            zzf(zzg);
        }
        parcel2.writeNoException();
        return true;
    }
}
