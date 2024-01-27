package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zza = true;
        /* access modifiers changed from: private */
        public boolean zzb = false;
        /* access modifiers changed from: private */
        public boolean zzc = false;

        public VideoOptions build() {
            return new VideoOptions(this, (zzi) null);
        }

        public Builder setClickToExpandRequested(boolean z10) {
            this.zzc = z10;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z10) {
            this.zzb = z10;
            return this;
        }

        public Builder setStartMuted(boolean z10) {
            this.zza = z10;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzi zzi) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(zzfl zzfl) {
        this.zza = zzfl.zza;
        this.zzb = zzfl.zzb;
        this.zzc = zzfl.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}
