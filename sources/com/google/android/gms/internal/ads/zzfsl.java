package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzfsl {
    static final CharSequence zza(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder zzb(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                sb.append(zza(it.next()));
                while (it.hasNext()) {
                    sb.append(str);
                    sb.append(zza(it.next()));
                }
            }
            return sb;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
