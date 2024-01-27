package com.google.android.gms.internal.consent_sdk;

import k6.e;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzi extends Exception {
    private final int zza;

    public zzi(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public final e zza() {
        if (getCause() == null) {
            getMessage();
        } else {
            getMessage();
            getCause();
        }
        return new e(this.zza, getMessage());
    }

    public zzi(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = i10;
    }
}
