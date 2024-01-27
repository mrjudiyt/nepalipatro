package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzdq zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return 0;
            }
            try {
                int zzh = zzdq.zzh();
                return zzh;
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.zza) {
            z10 = this.zzb != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return false;
            }
            try {
                boolean zzo = zzdq.zzo();
                return zzo;
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return false;
            }
            try {
                boolean zzp = zzdq.zzp();
                return zzp;
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return true;
            }
            try {
                boolean zzq = zzdq.zzq();
                return zzq;
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                try {
                    zzdq.zzj(z10);
                } catch (RemoteException e10) {
                    zzcat.zzh("Unable to call mute on video controller.", e10);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                try {
                    zzdq.zzk();
                } catch (RemoteException e10) {
                    zzcat.zzh("Unable to call pause on video controller.", e10);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                try {
                    zzdq.zzl();
                } catch (RemoteException e10) {
                    zzcat.zzh("Unable to call play on video controller.", e10);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfk zzfk;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfk = null;
                } else {
                    try {
                        zzfk = new zzfk(videoLifecycleCallbacks);
                    } catch (RemoteException e10) {
                        zzcat.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                        return;
                    }
                }
                zzdq.zzm(zzfk);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                try {
                    zzdq.zzn();
                } catch (RemoteException e10) {
                    zzcat.zzh("Unable to call stop on video controller.", e10);
                }
            }
        }
    }

    public final zzdq zza() {
        zzdq zzdq;
        synchronized (this.zza) {
            zzdq = this.zzb;
        }
        return zzdq;
    }

    public final void zzb(zzdq zzdq) {
        synchronized (this.zza) {
            this.zzb = zzdq;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
