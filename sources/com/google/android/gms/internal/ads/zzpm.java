package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpm {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzdy zzJ;
    private final zzpl zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpk zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpm(zzpl zzpl) {
        this.zza = zzpl;
        int i10 = zzfk.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzJ = zzdy.zza;
    }

    private final long zzm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzfk.zzn(zzfk.zzo(zzfk.zzq(elapsedRealtime) - this.zzy, this.zzj), this.zzg));
        }
        if (elapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = (long) audioTrack.getPlaybackHeadPosition();
                boolean z10 = this.zzh;
                long j10 = playbackHeadPosition & KeyboardMap.kValueMask;
                long j11 = 0;
                if (z10) {
                    if (playState == 2) {
                        if (j10 == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    j10 += this.zzv;
                }
                if (zzfk.zza <= 29) {
                    if (j10 != 0) {
                        j11 = j10;
                    } else if (this.zzt > 0 && playState == 3) {
                        if (this.zzz == -9223372036854775807L) {
                            this.zzz = elapsedRealtime;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                    j10 = j11;
                }
                if (this.zzt > j10) {
                    this.zzu++;
                }
                this.zzt = j10;
            }
            this.zzs = elapsedRealtime;
        }
        return this.zzt + this.zzI + (this.zzu << 32);
    }

    private final long zzn() {
        long zzm2 = zzm();
        int i10 = this.zzg;
        int i11 = zzfk.zza;
        return (zzm2 * 1000000) / ((long) i10);
    }

    private final void zzo() {
        this.zzl = 0;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0;
        this.zzD = 0;
        this.zzG = 0;
        this.zzk = false;
    }

    public final int zza(long j10) {
        return this.zze - ((int) (j10 - (zzm() * ((long) this.zzd))));
    }

    public final long zzb(boolean z10) {
        long j10;
        Method method;
        zzpm zzpm = this;
        AudioTrack audioTrack = zzpm.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzpm.zzm >= 30000) {
                long zzn2 = zzn();
                if (zzn2 != 0) {
                    zzpm.zzb[zzpm.zzw] = zzfk.zzp(zzn2, zzpm.zzj) - nanoTime;
                    zzpm.zzw = (zzpm.zzw + 1) % 10;
                    int i10 = zzpm.zzx;
                    if (i10 < 10) {
                        zzpm.zzx = i10 + 1;
                    }
                    zzpm.zzm = nanoTime;
                    zzpm.zzl = 0;
                    int i11 = 0;
                    while (true) {
                        int i12 = zzpm.zzx;
                        if (i11 >= i12) {
                            break;
                        }
                        zzpm.zzl += zzpm.zzb[i11] / ((long) i12);
                        i11++;
                    }
                }
            }
            if (!zzpm.zzh) {
                zzpk zzpk = zzpm.zzf;
                Objects.requireNonNull(zzpk);
                if (zzpk.zzg(nanoTime)) {
                    long zzb2 = zzpk.zzb();
                    long zza2 = zzpk.zza();
                    long zzn3 = zzn();
                    if (Math.abs(zzb2 - nanoTime) > 5000000) {
                        zzqi zzqi = ((zzqd) zzpm.zza).zza;
                        zzer.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza2 + ", " + zzb2 + ", " + nanoTime + ", " + zzn3 + ", " + zzqi.zzH() + ", " + zzqi.zzI());
                        zzpk.zzd();
                    } else {
                        long j11 = zza2;
                        int i13 = zzpm.zzg;
                        int i14 = zzfk.zza;
                        if (Math.abs(((j11 * 1000000) / ((long) i13)) - zzn3) > 5000000) {
                            zzqi zzqi2 = ((zzqd) zzpm.zza).zza;
                            zzpk zzpk2 = zzpk;
                            zzer.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + zzb2 + ", " + nanoTime + ", " + zzn3 + ", " + zzqi2.zzH() + ", " + zzqi2.zzI());
                            zzpk2.zzd();
                        } else {
                            zzpk.zzc();
                        }
                        zzpm = this;
                    }
                }
                if (zzpm.zzq && (method = zzpm.zzn) != null && nanoTime - zzpm.zzr >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzpm.zzc;
                        Objects.requireNonNull(audioTrack2);
                        int i15 = zzfk.zza;
                        long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - zzpm.zzi;
                        zzpm.zzo = intValue;
                        long max = Math.max(intValue, 0);
                        zzpm.zzo = max;
                        if (max > 5000000) {
                            zzer.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzpm.zzo = 0;
                        }
                    } catch (Exception unused) {
                        zzpm.zzn = null;
                    }
                    zzpm.zzr = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpk zzpk3 = zzpm.zzf;
        Objects.requireNonNull(zzpk3);
        boolean zzf2 = zzpk3.zzf();
        if (zzf2) {
            long zza3 = zzpk3.zza();
            int i16 = zzpm.zzg;
            int i17 = zzfk.zza;
            j10 = ((zza3 * 1000000) / ((long) i16)) + zzfk.zzo(nanoTime2 - zzpk3.zzb(), zzpm.zzj);
        } else {
            if (zzpm.zzx == 0) {
                j10 = zzn();
            } else {
                j10 = zzfk.zzo(zzpm.zzl + nanoTime2, zzpm.zzj);
            }
            if (!z10) {
                j10 = Math.max(0, j10 - zzpm.zzo);
            }
        }
        if (zzpm.zzE != zzf2) {
            zzpm.zzG = zzpm.zzD;
            zzpm.zzF = zzpm.zzC;
        }
        long j12 = nanoTime2 - zzpm.zzG;
        if (j12 < 1000000) {
            long j13 = (j12 * 1000) / 1000000;
            j10 = ((j10 * j13) + ((1000 - j13) * (zzpm.zzF + zzfk.zzo(j12, zzpm.zzj)))) / 1000;
        }
        if (!zzpm.zzk) {
            long j14 = zzpm.zzC;
            if (j10 > j14) {
                zzpm.zzk = true;
                int i18 = zzfk.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfk.zzs(zzfk.zzp(zzfk.zzs(j10 - j14), zzpm.zzj));
                zzqi zzqi3 = ((zzqd) zzpm.zza).zza;
                if (zzqi3.zzp != null) {
                    ((zzqn) zzqi3.zzp).zza.zzc.zzr(currentTimeMillis);
                }
            }
        }
        zzpm.zzD = nanoTime2;
        zzpm.zzC = j10;
        zzpm.zzE = zzf2;
        return j10;
    }

    public final void zzc(long j10) {
        this.zzA = zzm();
        this.zzy = zzfk.zzq(SystemClock.elapsedRealtime());
        this.zzB = j10;
    }

    public final void zzd() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(android.media.AudioTrack r7, boolean r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            r6.zzc = r7
            r6.zzd = r10
            r6.zze = r11
            com.google.android.gms.internal.ads.zzpk r0 = new com.google.android.gms.internal.ads.zzpk
            r0.<init>(r7)
            r6.zzf = r0
            int r7 = r7.getSampleRate()
            r6.zzg = r7
            r7 = 6
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0025
            int r8 = com.google.android.gms.internal.ads.zzfk.zza
            r2 = 23
            if (r8 >= r2) goto L_0x0025
            r8 = 5
            if (r9 == r8) goto L_0x0026
            if (r9 != r7) goto L_0x0025
            r9 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r6.zzh = r0
            boolean r7 = com.google.android.gms.internal.ads.zzfk.zzF(r9)
            r6.zzq = r7
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0041
            int r11 = r11 / r10
            long r10 = (long) r11
            int r7 = r6.zzg
            long r2 = (long) r7
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r4
            long r10 = r10 / r2
            goto L_0x0042
        L_0x0041:
            r10 = r8
        L_0x0042:
            r6.zzi = r10
            r10 = 0
            r6.zzt = r10
            r6.zzu = r10
            r6.zzH = r1
            r6.zzI = r10
            r6.zzv = r10
            r6.zzp = r1
            r6.zzy = r8
            r6.zzz = r8
            r6.zzr = r10
            r6.zzo = r10
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.zzj = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpm.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf(zzdy zzdy) {
        this.zzJ = zzdy;
    }

    public final void zzg() {
        zzpk zzpk = this.zzf;
        Objects.requireNonNull(zzpk);
        zzpk.zze();
    }

    public final boolean zzh(long j10) {
        if (j10 > zzfk.zzn(zzb(false), this.zzg)) {
            return true;
        }
        if (this.zzh) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 2 && zzm() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j10) {
        return this.zzz != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200;
    }

    public final boolean zzk(long j10) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzp;
        boolean zzh2 = zzh(j10);
        this.zzp = zzh2;
        if (z10 && !zzh2 && playState != 1) {
            zzpl zzpl = this.zza;
            int i10 = this.zze;
            long zzs2 = zzfk.zzs(this.zzi);
            zzqd zzqd = (zzqd) zzpl;
            zzqi zzqi = zzqd.zza;
            if (zzqi.zzp != null) {
                ((zzqn) zzqd.zza.zzp).zza.zzc.zzt(i10, zzs2, SystemClock.elapsedRealtime() - zzqi.zzV);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzy != -9223372036854775807L) {
            return false;
        }
        zzpk zzpk = this.zzf;
        Objects.requireNonNull(zzpk);
        zzpk.zze();
        return true;
    }
}
