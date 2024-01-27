package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzoh implements zzme, zzoi {
    private final Context zza;
    private final zzoj zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzcu zze = new zzcu();
    private final zzcs zzf = new zzcs();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzce zzn;
    private zzog zzo;
    private zzog zzp;
    private zzog zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzoh(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzof zzof = new zzof(zzof.zza);
        this.zzb = zzof;
        zzof.zzh(this);
    }

    public static zzoh zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzoh(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzfk.zzi(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j10;
        long j11;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l10 == null) {
                j10 = 0;
            } else {
                j10 = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j10);
            Long l11 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l11 == null) {
                j11 = 0;
            } else {
                j11 = l11.longValue();
            }
            builder3.setNetworkBytesRead(j11);
            this.zzj.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzam zzam, int i10) {
        if (!zzfk.zzE(this.zzs, zzam)) {
            int i11 = this.zzs == null ? 1 : 0;
            this.zzs = zzam;
            zzx(0, j10, zzam, i11);
        }
    }

    private final void zzu(long j10, zzam zzam, int i10) {
        if (!zzfk.zzE(this.zzt, zzam)) {
            int i11 = this.zzt == null ? 1 : 0;
            this.zzt = zzam;
            zzx(2, j10, zzam, i11);
        }
    }

    private final void zzv(zzcv zzcv, zztw zztw) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztw != null && (zza2 = zzcv.zza(zztw.zza)) != -1) {
            int i10 = 0;
            zzcv.zzd(zza2, this.zzf, false);
            zzcv.zze(this.zzf.zzd, this.zze, 0);
            zzbi zzbi = this.zze.zze.zzd;
            int i11 = 2;
            if (zzbi != null) {
                int zzm2 = zzfk.zzm(zzbi.zzb);
                i10 = zzm2 != 0 ? zzm2 != 1 ? zzm2 != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i10);
            zzcu zzcu = this.zze;
            if (zzcu.zzo != -9223372036854775807L && !zzcu.zzm && !zzcu.zzj && !zzcu.zzb()) {
                builder.setMediaDurationMillis(zzfk.zzs(this.zze.zzo));
            }
            if (true != this.zze.zzb()) {
                i11 = 1;
            }
            builder.setPlaybackType(i11);
            this.zzz = true;
        }
    }

    private final void zzw(long j10, zzam zzam, int i10) {
        if (!zzfk.zzE(this.zzr, zzam)) {
            int i11 = this.zzr == null ? 1 : 0;
            this.zzr = zzam;
            zzx(1, j10, zzam, i11);
        }
    }

    private final void zzx(int i10, long j10, zzam zzam, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzam != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzam.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzam.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzam.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzam.zzi;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzam.zzr;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzam.zzs;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzam.zzz;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzam.zzA;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzam.zzd;
            if (str4 != null) {
                int i17 = zzfk.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzam.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzog zzog) {
        if (zzog == null) {
            return false;
        }
        return zzog.zzc.equals(this.zzb.zze());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzmc zzmc, String str) {
        zztw zztw = zzmc.zzd;
        if (zztw == null || !zztw.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.0-alpha01");
            zzv(zzmc.zzb, zzmc.zzd);
        }
    }

    public final void zzd(zzmc zzmc, String str, boolean z10) {
        zztw zztw = zzmc.zzd;
        if ((zztw == null || !zztw.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzmc zzmc, zzam zzam, zzie zzie) {
    }

    public final void zzf(zzmc zzmc, int i10, long j10, long j11) {
        long j12;
        zztw zztw = zzmc.zzd;
        if (zztw != null) {
            zzoj zzoj = this.zzb;
            zzcv zzcv = zzmc.zzb;
            HashMap hashMap = this.zzh;
            String zzf2 = zzoj.zzf(zzcv, zztw);
            Long l10 = (Long) hashMap.get(zzf2);
            Long l11 = (Long) this.zzg.get(zzf2);
            HashMap hashMap2 = this.zzh;
            long j13 = 0;
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            hashMap2.put(zzf2, Long.valueOf(j12 + j10));
            HashMap hashMap3 = this.zzg;
            if (l11 != null) {
                j13 = l11.longValue();
            }
            hashMap3.put(zzf2, Long.valueOf(j13 + ((long) i10)));
        }
    }

    public final void zzg(zzmc zzmc, zzts zzts) {
        zztw zztw = zzmc.zzd;
        if (zztw != null) {
            zzam zzam = zzts.zzb;
            Objects.requireNonNull(zzam);
            zzog zzog = new zzog(zzam, 0, this.zzb.zzf(zzmc.zzb, zztw));
            int i10 = zzts.zza;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.zzp = zzog;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.zzq = zzog;
                        return;
                    }
                    return;
                }
            }
            this.zzo = zzog;
        }
    }

    public final /* synthetic */ void zzh(zzmc zzmc, int i10, long j10) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzco r21, com.google.android.gms.internal.ads.zzmd r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 == 0) goto L_0x03ee
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzmc r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzoj r4 = r0.zzb
            r4.zzk(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zzoj r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzj(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzoj r4 = r0.zzb
            r4.zzi(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzmc r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzcv r7 = r6.zzb
            com.google.android.gms.internal.ads.zztw r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c5
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00c5
            com.google.android.gms.internal.ads.zzdg r7 = r21.zzo()
            com.google.android.gms.internal.ads.zzfvs r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008e
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzdf r14 = (com.google.android.gms.internal.ads.zzdf) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.zzb
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008a
            boolean r5 = r14.zzd(r2)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzam r5 = r14.zzb(r2)
            com.google.android.gms.internal.ads.zzad r5 = r5.zzp
            if (r5 == 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            r15 = 1
            goto L_0x0073
        L_0x008a:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008e:
            r5 = r10
        L_0x008f:
            if (r5 == 0) goto L_0x00c5
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzfk.zza
            r12 = 0
        L_0x0096:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c1
            com.google.android.gms.internal.ads.zzac r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00aa
            r5 = 3
            goto L_0x00c2
        L_0x00aa:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b4
            r5 = 2
            goto L_0x00c2
        L_0x00b4:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00be
            r5 = 6
            goto L_0x00c2
        L_0x00be:
            int r12 = r12 + 1
            goto L_0x0096
        L_0x00c1:
            r5 = 1
        L_0x00c2:
            r7.setDrmType(r5)
        L_0x00c5:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d2
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00d2:
            com.google.android.gms.internal.ads.zzce r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00da
            goto L_0x0298
        L_0x00da:
            android.content.Context r7 = r0.zza
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f2
            r17 = 20
            r14 = 20
            goto L_0x0272
        L_0x00f2:
            r8 = r5
            com.google.android.gms.internal.ads.zzil r8 = (com.google.android.gms.internal.ads.zzil) r8
            int r12 = r8.zze
            if (r12 != r11) goto L_0x00fb
            r12 = 1
            goto L_0x00fc
        L_0x00fb:
            r12 = 0
        L_0x00fc:
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            java.util.Objects.requireNonNull(r15)
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x0201
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzhd
            if (r2 == 0) goto L_0x0114
            com.google.android.gms.internal.ads.zzhd r15 = (com.google.android.gms.internal.ads.zzhd) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x0272
        L_0x0114:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzhc
            if (r2 != 0) goto L_0x01fc
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzcc
            if (r2 == 0) goto L_0x011e
            goto L_0x01fc
        L_0x011e:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzhb
            if (r2 != 0) goto L_0x01c9
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzhl
            if (r8 == 0) goto L_0x0128
            goto L_0x01c9
        L_0x0128:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x0133
            r2 = 0
            r14 = 21
            goto L_0x0272
        L_0x0133:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqv
            if (r2 == 0) goto L_0x0191
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            int r7 = com.google.android.gms.internal.ads.zzfk.zza
            if (r7 < r13) goto L_0x0156
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0156
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzfk.zzj(r2)
            int r17 = zzr(r2)
            goto L_0x026a
        L_0x0156:
            if (r7 < r14) goto L_0x0163
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x0163
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x0272
        L_0x0163:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x016e
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x0272
        L_0x016e:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x0179
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x0272
        L_0x0179:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzrg
            if (r7 == 0) goto L_0x017f
            goto L_0x021a
        L_0x017f:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzqt
            if (r2 == 0) goto L_0x018a
            r17 = 28
            r2 = 0
            r14 = 28
            goto L_0x0272
        L_0x018a:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x0272
        L_0x0191:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzgx
            if (r2 == 0) goto L_0x01c4
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01c4
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzfk.zza
            if (r7 < r13) goto L_0x01bf
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01bf
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01bf
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x0272
        L_0x01bf:
            r2 = 0
            r14 = 31
            goto L_0x0272
        L_0x01c4:
            r2 = 0
            r14 = 9
            goto L_0x0272
        L_0x01c9:
            com.google.android.gms.internal.ads.zzez r7 = com.google.android.gms.internal.ads.zzez.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01d7
            r2 = 0
            r14 = 3
            goto L_0x0272
        L_0x01d7:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01e3
            r2 = 0
            r14 = 6
            goto L_0x0272
        L_0x01e3:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01eb
            r2 = 0
            r14 = 7
            goto L_0x0272
        L_0x01eb:
            if (r2 == 0) goto L_0x01f7
            com.google.android.gms.internal.ads.zzhb r15 = (com.google.android.gms.internal.ads.zzhb) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01f7
            r2 = 0
            r14 = 4
            goto L_0x0272
        L_0x01f7:
            r2 = 0
            r14 = 8
            goto L_0x0272
        L_0x01fc:
            r2 = 0
            r14 = 11
            goto L_0x0272
        L_0x0201:
            if (r12 == 0) goto L_0x020c
            if (r8 == 0) goto L_0x0207
            if (r8 != r11) goto L_0x020c
        L_0x0207:
            r2 = 0
            r14 = 35
            goto L_0x0272
        L_0x020c:
            if (r12 == 0) goto L_0x0216
            if (r8 != r9) goto L_0x0216
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x0272
        L_0x0216:
            if (r12 == 0) goto L_0x021c
            if (r8 != r6) goto L_0x021c
        L_0x021a:
            r2 = 0
            goto L_0x0272
        L_0x021c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzsc
            if (r2 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.zzsc r15 = (com.google.android.gms.internal.ads.zzsc) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzfk.zzj(r2)
            r14 = 13
            goto L_0x0272
        L_0x022b:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzrx
            if (r2 == 0) goto L_0x023a
            com.google.android.gms.internal.ads.zzrx r15 = (com.google.android.gms.internal.ads.zzrx) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzfk.zzj(r2)
        L_0x0237:
            r14 = 14
            goto L_0x0272
        L_0x023a:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x0240
            r2 = 0
            goto L_0x0237
        L_0x0240:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpe
            if (r2 == 0) goto L_0x024d
            com.google.android.gms.internal.ads.zzpe r15 = (com.google.android.gms.internal.ads.zzpe) r15
            int r2 = r15.zza
            r17 = 17
            r14 = 17
            goto L_0x0272
        L_0x024d:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzph
            if (r2 == 0) goto L_0x025a
            com.google.android.gms.internal.ads.zzph r15 = (com.google.android.gms.internal.ads.zzph) r15
            int r2 = r15.zza
            r17 = 18
            r14 = 18
            goto L_0x0272
        L_0x025a:
            int r2 = com.google.android.gms.internal.ads.zzfk.zza
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x026d
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = zzr(r2)
        L_0x026a:
            r14 = r17
            goto L_0x0272
        L_0x026d:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x0272:
            android.media.metrics.PlaybackSession r7 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.zzz = r11
            r0.zzn = r10
        L_0x0298:
            boolean r2 = r1.zzd(r6)
            if (r2 == 0) goto L_0x02c7
            com.google.android.gms.internal.ads.zzdg r2 = r21.zzo()
            boolean r5 = r2.zzb(r6)
            boolean r7 = r2.zzb(r11)
            boolean r2 = r2.zzb(r9)
            if (r5 != 0) goto L_0x02b5
            if (r7 != 0) goto L_0x02b5
            if (r2 == 0) goto L_0x02c7
            r2 = 1
        L_0x02b5:
            if (r5 != 0) goto L_0x02bc
            r5 = 0
            r0.zzw(r3, r10, r5)
            goto L_0x02bd
        L_0x02bc:
            r5 = 0
        L_0x02bd:
            if (r7 != 0) goto L_0x02c2
            r0.zzt(r3, r10, r5)
        L_0x02c2:
            if (r2 != 0) goto L_0x02c7
            r0.zzu(r3, r10, r5)
        L_0x02c7:
            com.google.android.gms.internal.ads.zzog r2 = r0.zzo
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02df
            com.google.android.gms.internal.ads.zzog r2 = r0.zzo
            com.google.android.gms.internal.ads.zzam r2 = r2.zza
            int r5 = r2.zzs
            r7 = -1
            if (r5 == r7) goto L_0x02df
            r5 = 0
            r0.zzw(r3, r2, r5)
            r0.zzo = r10
            goto L_0x02e0
        L_0x02df:
            r5 = 0
        L_0x02e0:
            com.google.android.gms.internal.ads.zzog r2 = r0.zzp
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02f1
            com.google.android.gms.internal.ads.zzog r2 = r0.zzp
            com.google.android.gms.internal.ads.zzam r2 = r2.zza
            r0.zzt(r3, r2, r5)
            r0.zzp = r10
        L_0x02f1:
            com.google.android.gms.internal.ads.zzog r2 = r0.zzq
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x0302
            com.google.android.gms.internal.ads.zzog r2 = r0.zzq
            com.google.android.gms.internal.ads.zzam r2 = r2.zza
            r0.zzu(r3, r2, r5)
            r0.zzq = r10
        L_0x0302:
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzez r2 = com.google.android.gms.internal.ads.zzez.zzb(r2)
            int r2 = r2.zza()
            switch(r2) {
                case 0: goto L_0x0323;
                case 1: goto L_0x0320;
                case 2: goto L_0x031e;
                case 3: goto L_0x031c;
                case 4: goto L_0x031a;
                case 5: goto L_0x0318;
                case 6: goto L_0x030f;
                case 7: goto L_0x0316;
                case 8: goto L_0x030f;
                case 9: goto L_0x0313;
                case 10: goto L_0x0311;
                default: goto L_0x030f;
            }
        L_0x030f:
            r13 = 1
            goto L_0x0324
        L_0x0311:
            r13 = 7
            goto L_0x0324
        L_0x0313:
            r13 = 8
            goto L_0x0324
        L_0x0316:
            r13 = 3
            goto L_0x0324
        L_0x0318:
            r13 = 6
            goto L_0x0324
        L_0x031a:
            r13 = 5
            goto L_0x0324
        L_0x031c:
            r13 = 4
            goto L_0x0324
        L_0x031e:
            r13 = 2
            goto L_0x0324
        L_0x0320:
            r13 = 9
            goto L_0x0324
        L_0x0323:
            r13 = 0
        L_0x0324:
            int r2 = r0.zzm
            if (r13 == r2) goto L_0x0344
            r0.zzm = r13
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zzd
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x0344:
            int r2 = r21.zzf()
            if (r2 == r6) goto L_0x034e
            r2 = 0
            r0.zzu = r2
            goto L_0x034f
        L_0x034e:
            r2 = 0
        L_0x034f:
            r5 = r21
            com.google.android.gms.internal.ads.zzlx r5 = (com.google.android.gms.internal.ads.zzlx) r5
            com.google.android.gms.internal.ads.zzil r5 = r5.zzC()
            r7 = 10
            if (r5 != 0) goto L_0x035e
            r0.zzv = r2
            goto L_0x0366
        L_0x035e:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x0366
            r0.zzv = r11
        L_0x0366:
            int r2 = r21.zzf()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x0370
            r5 = 5
            goto L_0x03ba
        L_0x0370:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x0377
            r5 = 13
            goto L_0x03ba
        L_0x0377:
            r5 = 4
            if (r2 != r5) goto L_0x037d
            r5 = 11
            goto L_0x03ba
        L_0x037d:
            if (r2 != r6) goto L_0x039b
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x0399
            if (r2 != r6) goto L_0x0386
            goto L_0x0399
        L_0x0386:
            boolean r2 = r21.zzv()
            if (r2 != 0) goto L_0x038e
            r5 = 7
            goto L_0x03ba
        L_0x038e:
            int r2 = r21.zzg()
            if (r2 == 0) goto L_0x0397
            r5 = 10
            goto L_0x03ba
        L_0x0397:
            r5 = 6
            goto L_0x03ba
        L_0x0399:
            r5 = 2
            goto L_0x03ba
        L_0x039b:
            if (r2 != r9) goto L_0x03af
            boolean r2 = r21.zzv()
            if (r2 != 0) goto L_0x03a4
            goto L_0x03ba
        L_0x03a4:
            int r2 = r21.zzg()
            if (r2 == 0) goto L_0x03ad
            r5 = 9
            goto L_0x03ba
        L_0x03ad:
            r5 = 3
            goto L_0x03ba
        L_0x03af:
            if (r2 != r11) goto L_0x03b8
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03b8
            r5 = 12
            goto L_0x03ba
        L_0x03b8:
            int r5 = r0.zzl
        L_0x03ba:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03dd
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03dd:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03ee
            com.google.android.gms.internal.ads.zzoj r3 = r0.zzb
            com.google.android.gms.internal.ads.zzmc r1 = r1.zzc(r2)
            r3.zzg(r1)
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoh.zzi(com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzmd):void");
    }

    public final void zzj(zzmc zzmc, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
    }

    public final /* synthetic */ void zzk(zzmc zzmc, int i10) {
    }

    public final void zzl(zzmc zzmc, zzce zzce) {
        this.zzn = zzce;
    }

    public final void zzm(zzmc zzmc, zzcn zzcn, zzcn zzcn2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    public final /* synthetic */ void zzn(zzmc zzmc, Object obj, long j10) {
    }

    public final void zzo(zzmc zzmc, zzid zzid) {
        this.zzw += zzid.zzg;
        this.zzx += zzid.zze;
    }

    public final /* synthetic */ void zzp(zzmc zzmc, zzam zzam, zzie zzie) {
    }

    public final void zzq(zzmc zzmc, zzdm zzdm) {
        zzog zzog = this.zzo;
        if (zzog != null) {
            zzam zzam = zzog.zza;
            if (zzam.zzs == -1) {
                zzak zzb2 = zzam.zzb();
                zzb2.zzab(zzdm.zzc);
                zzb2.zzH(zzdm.zzd);
                this.zzo = new zzog(zzb2.zzac(), 0, zzog.zzc);
            }
        }
    }
}
