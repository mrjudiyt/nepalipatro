package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjr {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgrx zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzgjq("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzgrx.zzb(bArr);
    }
}
