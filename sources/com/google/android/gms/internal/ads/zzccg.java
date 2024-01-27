package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzccg extends zzcci implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcdc zzd;
    private final zzcdd zze;
    private final boolean zzf;
    private int zzg = 0;
    private int zzh = 0;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcda zzn;
    private final boolean zzo;
    private int zzp;
    /* access modifiers changed from: private */
    public zzcch zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    private Integer zzs = null;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzccg(Context context, zzcdc zzcdc, boolean z10, boolean z11, zzcdb zzcdb, zzcdd zzcdd) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzd = zzcdc;
        this.zze = zzcdd;
        this.zzo = z10;
        this.zzf = z11;
        zzcdd.zza(this);
    }

    private final void zzD() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj != null && surfaceTexture != null) {
            zzE(false);
            try {
                zzt.zzk();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.zzi = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.zzi.setOnCompletionListener(this);
                this.zzi.setOnErrorListener(this);
                this.zzi.setOnInfoListener(this);
                this.zzi.setOnPreparedListener(this);
                this.zzi.setOnVideoSizeChangedListener(this);
                this.zzm = 0;
                if (this.zzo) {
                    zzcda zzcda = new zzcda(getContext());
                    this.zzn = zzcda;
                    zzcda.zzd(surfaceTexture, getWidth(), getHeight());
                    this.zzn.start();
                    SurfaceTexture zzb = this.zzn.zzb();
                    if (zzb != null) {
                        surfaceTexture = zzb;
                    } else {
                        this.zzn.zze();
                        this.zzn = null;
                    }
                }
                this.zzi.setDataSource(getContext(), this.zzj);
                zzt.zzl();
                this.zzi.setSurface(new Surface(surfaceTexture));
                this.zzi.setAudioStreamType(3);
                this.zzi.setScreenOnWhilePlaying(true);
                this.zzi.prepareAsync();
                zzF(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
                zzcat.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e10);
                onError(this.zzi, 1, 0);
            }
        }
    }

    private final void zzE(boolean z10) {
        zze.zza("AdMediaPlayerView release");
        zzcda zzcda = this.zzn;
        if (zzcda != null) {
            zzcda.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z10) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i10) {
        if (i10 == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i10;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzcat.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.zzg;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzH() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.zzi
            if (r0 == 0) goto L_0x000f
            int r0 = r2.zzg
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccg.zzH():boolean");
    }

    static /* bridge */ /* synthetic */ void zzl(zzccg zzccg, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzccg.zzd != null && mediaPlayer != null) {
            try {
                MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                if (trackInfo != null) {
                    HashMap hashMap = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType == 1) {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzccg.zzs = valueOf;
                                        hashMap.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) && format2.containsKey(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                                        hashMap.put("resolution", format2.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) + "x" + format2.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        hashMap.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                }
                            } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                if (format.containsKey("mime")) {
                                    hashMap.put("audioMime", format.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                    hashMap.put("audioCodec", format.getString("codecs-string"));
                                }
                            }
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        zzccg.zzd.zzd("onMetadataEvent", hashMap);
                    }
                }
            } catch (RuntimeException e10) {
                zzt.zzo().zzu(e10, "AdMediaPlayerView.reportMetadata");
            }
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.zzm = i10;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbz(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        zzcat.zzj("AdMediaPlayerView MediaPlayer error: " + str + CertificateUtil.DELIMITER + str2);
        zzF(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcca(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + CertificateUtil.DELIMITER + ((String) map.get(Integer.valueOf(i11))));
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L_0x007e
            int r2 = r5.zzl
            if (r2 <= 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzcda r2 = r5.zzn
            if (r2 != 0) goto L_0x007e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0043
            if (r1 != r2) goto L_0x0041
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007e
        L_0x003c:
            if (r1 <= r3) goto L_0x0063
            int r1 = r3 / r0
            goto L_0x0054
        L_0x0041:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0043:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0056
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0053
            if (r0 <= r7) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r1 = r0
        L_0x0054:
            r0 = r6
            goto L_0x007e
        L_0x0056:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
        L_0x0063:
            r0 = r6
            goto L_0x003a
        L_0x0065:
            r0 = r1
            goto L_0x003a
        L_0x0067:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0075
        L_0x0073:
            r1 = r2
            r7 = r4
        L_0x0075:
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0054
        L_0x007e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcda r6 = r5.zzn
            if (r6 == 0) goto L_0x0088
            r6.zzc(r0, r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccg.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:12:0x005f->B:17:0x007a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r9) {
        /*
            r8 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 2
            r8.zzF(r0)
            com.google.android.gms.internal.ads.zzcdd r0 = r8.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzfps r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcby r1 = new com.google.android.gms.internal.ads.zzcby
            r1.<init>(r8, r9)
            r0.post(r1)
            int r0 = r9.getVideoWidth()
            r8.zzk = r0
            int r9 = r9.getVideoHeight()
            r8.zzl = r9
            int r9 = r8.zzp
            if (r9 == 0) goto L_0x002b
            r8.zzq(r9)
        L_0x002b:
            boolean r9 = r8.zzf
            r0 = 3
            if (r9 != 0) goto L_0x0031
            goto L_0x0084
        L_0x0031:
            boolean r9 = r8.zzH()
            if (r9 == 0) goto L_0x0084
            android.media.MediaPlayer r9 = r8.zzi
            int r9 = r9.getCurrentPosition()
            if (r9 <= 0) goto L_0x0084
            int r9 = r8.zzh
            if (r9 == r0) goto L_0x0084
            java.lang.String r9 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r9)
            r9 = 0
            r8.zzG(r9)
            android.media.MediaPlayer r9 = r8.zzi
            r9.start()
            android.media.MediaPlayer r9 = r8.zzi
            int r9 = r9.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzB()
            long r1 = r1.currentTimeMillis()
        L_0x005f:
            boolean r3 = r8.zzH()
            if (r3 == 0) goto L_0x007c
            android.media.MediaPlayer r3 = r8.zzi
            int r3 = r3.getCurrentPosition()
            if (r3 != r9) goto L_0x007c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzB()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005f
        L_0x007c:
            android.media.MediaPlayer r9 = r8.zzi
            r9.pause()
            r8.zzn()
        L_0x0084:
            int r9 = r8.zzk
            int r1 = r8.zzl
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " x "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            com.google.android.gms.internal.ads.zzcat.zzi(r9)
            int r9 = r8.zzh
            if (r9 != r0) goto L_0x00ab
            r8.zzp()
        L_0x00ab:
            r8.zzn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccg.onPrepared(android.media.MediaPlayer):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccb(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzcda zzcda = this.zzn;
        if (zzcda != null) {
            zzcda.zze();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccd(this));
        zzE(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface changed");
        int i12 = this.zzh;
        boolean z10 = false;
        if (this.zzk == i10 && this.zzl == i11) {
            z10 = true;
        }
        if (this.zzi != null && i12 == 3 && z10) {
            int i13 = this.zzp;
            if (i13 != 0) {
                zzq(i13);
            }
            zzp();
        }
        zzcda zzcda = this.zzn;
        if (zzcda != null) {
            zzcda.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccc(this, i10, i11));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        zze.zza("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i10) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbx(this, i10));
        super.onWindowVisibilityChanged(i10);
    }

    public final String toString() {
        String name = zzccg.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final long zzf() {
        return 0;
    }

    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * ((long) this.zzm)) / 100;
        }
        return -1;
    }

    public final long zzh() {
        if (this.zzs != null) {
            return ((long) zzc()) * ((long) this.zzs.intValue());
        }
        return -1;
    }

    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(int i10) {
        zzcch zzcch = this.zzq;
        if (zzcch != null) {
            zzcch.onWindowVisibilityChanged(i10);
        }
    }

    public final void zzn() {
        zzG(this.zzb.zza());
    }

    public final void zzo() {
        zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccf(this));
        }
        this.zzh = 4;
    }

    public final void zzp() {
        zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcce(this));
        }
        this.zzh = 3;
    }

    public final void zzq(int i10) {
        zze.zza("AdMediaPlayerView seek " + i10);
        if (zzH()) {
            this.zzi.seekTo(i10);
            this.zzp = 0;
            return;
        }
        this.zzp = i10;
    }

    public final void zzr(zzcch zzcch) {
        this.zzq = zzcch;
    }

    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzaxh zza = zzaxh.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    public final void zzt() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    public final void zzu(float f10, float f11) {
        zzcda zzcda = this.zzn;
        if (zzcda != null) {
            zzcda.zzf(f10, f11);
        }
    }
}
