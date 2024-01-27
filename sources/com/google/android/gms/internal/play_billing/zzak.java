package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzaj;
import com.google.android.gms.internal.play_billing.zzak;
import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public abstract class zzak<MessageType extends zzak<MessageType, BuilderType>, BuilderType extends zzaj<MessageType, BuilderType>> implements zzdf {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    public int zza(zzdp zzdp) {
        throw null;
    }

    public final zzba zzb() {
        try {
            int zze = zze();
            zzba zzba = zzba.zzb;
            byte[] bArr = new byte[zze];
            zzbi zzz = zzbi.zzz(bArr, 0, zze);
            zzr(zzz);
            zzz.zzA();
            return new zzax(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzc() {
        try {
            int zze = zze();
            byte[] bArr = new byte[zze];
            zzbi zzz = zzbi.zzz(bArr, 0, zze);
            zzr(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
