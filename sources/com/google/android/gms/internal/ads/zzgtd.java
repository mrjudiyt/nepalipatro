package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgtd extends IOException {
    zzgtd() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgtd(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzgtd(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
