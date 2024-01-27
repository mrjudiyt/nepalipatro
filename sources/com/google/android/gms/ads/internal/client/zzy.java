package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzy {
    private final AdSize[] zza;
    private final String zzb;

    public zzy(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.zza = zzc(string);
        } else if (!z10 && z11) {
            this.zza = zzc(string2);
        } else if (z10) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.zzb = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static AdSize[] zzc(String str) {
        int i10;
        int i11;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i12 = 0; i12 < split.length; i12++) {
            String trim = split[i12].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i10 = -1;
                    } else {
                        i10 = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i11 = -2;
                    } else {
                        i11 = Integer.parseInt(split2[1]);
                    }
                    adSizeArr[i12] = new AdSize(i10, i11);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i12] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i12] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i12] = AdSize.FULL_BANNER;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i12] = AdSize.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i12] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i12] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i12] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i12] = AdSize.FLUID;
            } else if ("ICON".equals(trim)) {
                adSizeArr[i12] = AdSize.zza;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String zza() {
        return this.zzb;
    }

    public final AdSize[] zzb(boolean z10) {
        if (z10 || this.zza.length == 1) {
            return this.zza;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
