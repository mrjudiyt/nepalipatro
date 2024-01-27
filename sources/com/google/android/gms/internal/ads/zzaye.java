package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaye implements zzgud {
    static final zzgud zza = new zzaye();

    private zzaye() {
    }

    public final boolean zza(int i10) {
        zzayf zzayf = zzayf.AD_INITIATER_UNSPECIFIED;
        switch (i10) {
            case 0:
                break;
            case 1:
                zzayf = zzayf.BANNER;
                break;
            case 2:
                zzayf = zzayf.DFP_BANNER;
                break;
            case 3:
                zzayf = zzayf.INTERSTITIAL;
                break;
            case 4:
                zzayf = zzayf.DFP_INTERSTITIAL;
                break;
            case 5:
                zzayf = zzayf.NATIVE_EXPRESS;
                break;
            case 6:
                zzayf = zzayf.AD_LOADER;
                break;
            case 7:
                zzayf = zzayf.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzayf = zzayf.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzayf = zzayf.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzayf = zzayf.APP_OPEN;
                break;
            case 11:
                zzayf = zzayf.REWARDED_INTERSTITIAL;
                break;
            default:
                zzayf = null;
                break;
        }
        return zzayf != null;
    }
}
