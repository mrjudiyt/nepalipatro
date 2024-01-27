package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfxw implements FilenameFilter {
    private final Pattern zza;

    public zzfxw(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
