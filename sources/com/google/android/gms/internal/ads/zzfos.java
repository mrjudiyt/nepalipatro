package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfos {
    final zzfov zza;
    final boolean zzb;

    private zzfos(zzfov zzfov) {
        this.zza = zzfov;
        this.zzb = zzfov != null;
    }

    public static zzfos zzb(Context context, String str, String str2) {
        zzfov zzfov;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (instantiate == null) {
                zzfov = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfov = queryLocalInterface instanceof zzfov ? (zzfov) queryLocalInterface : new zzfot(instantiate);
            }
            try {
                zzfov.zze(ObjectWrapper.wrap(context), str, (String) null);
                return new zzfos(zzfov);
            } catch (RemoteException | zzfnu | NullPointerException | SecurityException unused) {
                return new zzfos(new zzfow());
            }
        } catch (Exception e10) {
            throw new zzfnu(e10);
        } catch (Exception e11) {
            throw new zzfnu(e11);
        }
    }

    public static zzfos zzc() {
        return new zzfos(new zzfow());
    }

    public final zzfor zza(byte[] bArr) {
        return new zzfor(this, bArr, (zzfoq) null);
    }
}
