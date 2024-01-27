package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdtt {
    private final zzbkh zza;

    zzdtt(zzbkh zzbkh) {
        this.zza = zzbkh;
    }

    private final void zzs(zzdts zzdts) {
        String zza2 = zzdts.zza(zzdts);
        zzcat.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() {
        zzs(new zzdts("initialize", (zzdtr) null));
    }

    public final void zzb(long j10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdClicked";
        this.zza.zzb(zzdts.zza(zzdts));
    }

    public final void zzc(long j10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdClosed";
        zzs(zzdts);
    }

    public final void zzd(long j10, int i10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdFailedToLoad";
        zzdts.zzd = Integer.valueOf(i10);
        zzs(zzdts);
    }

    public final void zze(long j10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdLoaded";
        zzs(zzdts);
    }

    public final void zzf(long j10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdts);
    }

    public final void zzg(long j10) {
        zzdts zzdts = new zzdts("interstitial", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdOpened";
        zzs(zzdts);
    }

    public final void zzh(long j10) {
        zzdts zzdts = new zzdts("creation", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "nativeObjectCreated";
        zzs(zzdts);
    }

    public final void zzi(long j10) {
        zzdts zzdts = new zzdts("creation", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "nativeObjectNotCreated";
        zzs(zzdts);
    }

    public final void zzj(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdClicked";
        zzs(zzdts);
    }

    public final void zzk(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onRewardedAdClosed";
        zzs(zzdts);
    }

    public final void zzl(long j10, zzbwm zzbwm) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onUserEarnedReward";
        zzdts.zze = zzbwm.zzf();
        zzdts.zzf = Integer.valueOf(zzbwm.zze());
        zzs(zzdts);
    }

    public final void zzm(long j10, int i10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onRewardedAdFailedToLoad";
        zzdts.zzd = Integer.valueOf(i10);
        zzs(zzdts);
    }

    public final void zzn(long j10, int i10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onRewardedAdFailedToShow";
        zzdts.zzd = Integer.valueOf(i10);
        zzs(zzdts);
    }

    public final void zzo(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onAdImpression";
        zzs(zzdts);
    }

    public final void zzp(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onRewardedAdLoaded";
        zzs(zzdts);
    }

    public final void zzq(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdts);
    }

    public final void zzr(long j10) {
        zzdts zzdts = new zzdts("rewarded", (zzdtr) null);
        zzdts.zza = Long.valueOf(j10);
        zzdts.zzc = "onRewardedAdOpened";
        zzs(zzdts);
    }
}
