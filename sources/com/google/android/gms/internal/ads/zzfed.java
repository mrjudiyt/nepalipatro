package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfed {
    private final Pattern zza;

    public zzfed() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzba.zzc().zzb(zzbci.zzgP));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    public final String zza(String str) {
        Pattern pattern = this.zza;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
