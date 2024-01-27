package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzo extends zzp<Void> {
    zzo(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return true;
    }
}
