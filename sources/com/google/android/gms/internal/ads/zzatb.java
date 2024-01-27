package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatb extends zzaud {
    public zzatb(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", zzaom, i10, 49);
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zze.zzaa(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
            zzaom zzaom = this.zze;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzaom.zzaa(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
