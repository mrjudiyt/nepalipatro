package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzkb extends zzm implements zziw {
    public static final /* synthetic */ int zzd = 0;
    private final zzma zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlv zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    /* access modifiers changed from: private */
    public zzam zzK;
    /* access modifiers changed from: private */
    public zzam zzL;
    private AudioTrack zzM;
    /* access modifiers changed from: private */
    public Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfc zzQ;
    /* access modifiers changed from: private */
    public zzid zzR;
    /* access modifiers changed from: private */
    public zzid zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    /* access modifiers changed from: private */
    public boolean zzW;
    private zzdw zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    /* access modifiers changed from: private */
    public zzdm zzab;
    private zzbv zzac;
    private zzlk zzad;
    private int zzae;
    private long zzaf;
    private final zzix zzag;
    private zzvr zzah;
    final zzxr zzb;
    final zzck zzc;
    private final zzea zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzlr[] zzh;
    private final zzxq zzi;
    private final zzei zzj;
    private final zzkl zzk;
    /* access modifiers changed from: private */
    public final zzeo zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcs zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztv zzq;
    /* access modifiers changed from: private */
    public final zzmb zzr;
    private final Looper zzs;
    private final zzxy zzt;
    private final zzdy zzu;
    private final zzjx zzv;
    private final zzjz zzw;
    private final zzhx zzx;
    private final zzib zzy;
    private final zzlz zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzxx, java.lang.Object, com.google.android.gms.internal.ads.zzmb] */
    @SuppressLint({"HandlerLeak"})
    public zzkb(zziv zziv, zzco zzco) {
        zzol zza;
        Object obj;
        zziv zziv2 = zziv;
        zzco zzco2 = zzco;
        zzea zzea = new zzea(zzdy.zza);
        this.zze = zzea;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfk.zze;
            zzer.zze("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.2.0-alpha01] [" + str + "]");
            Context applicationContext = zziv2.zza.getApplicationContext();
            this.zzf = applicationContext;
            ? apply = zziv2.zzh.apply(zziv2.zzb);
            this.zzr = apply;
            this.zzU = zziv2.zzj;
            this.zzP = zziv2.zzk;
            this.zzW = false;
            this.zzB = zziv2.zzo;
            zzjx zzjx = new zzjx(this, (zzjw) null);
            this.zzv = zzjx;
            zzjz zzjz = new zzjz((zzjy) null);
            this.zzw = zzjz;
            Handler handler = new Handler(zziv2.zzi);
            Handler handler2 = handler;
            zzlr[] zza2 = ((zzio) zziv2.zzc).zza.zza(handler, zzjx, zzjx, zzjx, zzjx);
            this.zzh = zza2;
            int length = zza2.length;
            zzxq zzxq = (zzxq) zziv2.zze.zza();
            this.zzi = zzxq;
            this.zzq = zziv.zza(((zzip) zziv2.zzd).zza);
            zzyc zzg2 = zzyc.zzg(((zzis) zziv2.zzg).zza);
            this.zzt = zzg2;
            this.zzp = zziv2.zzl;
            this.zzG = zziv2.zzm;
            Looper looper = zziv2.zzi;
            this.zzs = looper;
            zzdy zzdy = zziv2.zzb;
            this.zzu = zzdy;
            this.zzg = zzco2;
            zzeo zzeo = new zzeo(looper, zzdy, new zzjr(this));
            this.zzl = zzeo;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            zzjz zzjz2 = zzjz;
            this.zzah = new zzvr(0);
            int length2 = zza2.length;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            zzyc zzyc = zzg2;
            zzeo zzeo2 = zzeo;
            zzxr zzxr = new zzxr(new zzlu[2], new zzxk[2], zzdg.zza, (Object) null);
            this.zzb = zzxr;
            this.zzn = new zzcs();
            zzci zzci = new zzci();
            zzci.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            zzxq.zzm();
            zzci.zzd(29, true);
            zzci.zzd(23, false);
            zzci.zzd(25, false);
            zzci.zzd(33, false);
            zzci.zzd(26, false);
            zzci.zzd(34, false);
            zzck zze2 = zzci.zze();
            this.zzc = zze2;
            zzci zzci2 = new zzci();
            zzci2.zzb(zze2);
            zzci2.zza(4);
            zzci2.zza(10);
            this.zzH = zzci2.zze();
            this.zzj = zzdy.zzb(looper, (Handler.Callback) null);
            zzix zzix = new zzix(this);
            this.zzag = zzix;
            this.zzad = zzlk.zzi(zzxr);
            apply.zzP(zzco2, looper);
            int i10 = zzfk.zza;
            if (i10 < 31) {
                zza = new zzol();
            } else {
                zza = zzjs.zza(applicationContext, this, zziv2.zzp);
            }
            zzol zzol = zza;
            zzlv zzlv = this.zzG;
            zzeo zzeo3 = zzeo2;
            zzkl zzkl = r7;
            zzlv zzlv2 = zzlv;
            CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
            Looper looper2 = looper;
            zzxr zzxr2 = zzxr;
            zzyc zzyc2 = zzyc;
            zzxq zzxq2 = zzxq;
            zzjz zzjz3 = zzjz2;
            zzjx zzjx2 = zzjx;
            zzkl zzkl2 = new zzkl(zza2, zzxq, zzxr2, (zzko) zziv2.zzf.zza(), zzyc2, 0, false, apply, zzlv2, zziv2.zzr, zziv2.zzn, false, looper2, zzdy, zzix, zzol, (Looper) null);
            this.zzk = zzkl2;
            this.zzV = 1.0f;
            zzbv zzbv = zzbv.zza;
            this.zzI = zzbv;
            this.zzJ = zzbv;
            this.zzac = zzbv;
            int i11 = -1;
            this.zzae = -1;
            if (i10 >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    i11 = audioManager.generateAudioSessionId();
                }
                this.zzT = i11;
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzdw.zza;
            this.zzY = true;
            Objects.requireNonNull(apply);
            zzeo3.zzb(apply);
            zzyc2.zze(new Handler(looper2), apply);
            zzjx zzjx3 = zzjx2;
            copyOnWriteArraySet3.add(zzjx3);
            Handler handler3 = handler2;
            this.zzx = new zzhx(zziv2.zza, handler3, zzjx3);
            this.zzy = new zzib(zziv2.zza, handler3, zzjx3);
            zzfk.zzE(obj, obj);
            this.zzz = new zzlz(zziv2.zza);
            this.zzA = new zzma(zziv2.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdm.zza;
            this.zzQ = zzfc.zza;
            zzxq2.zzj(this.zzU);
            zzah(1, 10, Integer.valueOf(this.zzT));
            zzah(2, 10, Integer.valueOf(this.zzT));
            zzah(1, 3, this.zzU);
            zzah(2, 4, Integer.valueOf(this.zzP));
            zzah(2, 5, 0);
            zzah(1, 9, Boolean.valueOf(this.zzW));
            zzjz zzjz4 = zzjz3;
            zzah(2, 7, zzjz4);
            zzah(6, 8, zzjz4);
            zzea.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzkb zzkb, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkb.zzaj(surface);
        zzkb.zzO = surface;
    }

    private final int zzX(zzlk zzlk) {
        if (zzlk.zza.zzo()) {
            return this.zzae;
        }
        return zzlk.zza.zzn(zzlk.zzb.zza, this.zzn).zzd;
    }

    /* access modifiers changed from: private */
    public static int zzY(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long zzZ(zzlk zzlk) {
        if (!zzlk.zzb.zzb()) {
            return zzfk.zzs(zzaa(zzlk));
        }
        zzlk.zza.zzn(zzlk.zzb.zza, this.zzn);
        long j10 = zzlk.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzlk.zza.zze(zzX(zzlk), this.zza, 0).zzn;
            return zzfk.zzs(0);
        }
        int i10 = zzfk.zza;
        return zzfk.zzs(j10) + zzfk.zzs(0);
    }

    private final long zzaa(zzlk zzlk) {
        long j10;
        if (zzlk.zza.zzo()) {
            return zzfk.zzq(this.zzaf);
        }
        if (zzlk.zzo) {
            j10 = zzlk.zza();
        } else {
            j10 = zzlk.zzr;
        }
        if (zzlk.zzb.zzb()) {
            return j10;
        }
        zzac(zzlk.zza, zzlk.zzb, j10);
        return j10;
    }

    private static long zzab(zzlk zzlk) {
        zzcu zzcu = new zzcu();
        zzcs zzcs = new zzcs();
        zzlk.zza.zzn(zzlk.zzb.zza, zzcs);
        long j10 = zzlk.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzlk.zza.zze(zzcs.zzd, zzcu, 0).zzn;
        return 0;
    }

    private final long zzac(zzcv zzcv, zztw zztw, long j10) {
        zzcv.zzn(zztw.zza, this.zzn);
        return j10;
    }

    private final Pair zzad(zzcv zzcv, int i10, long j10) {
        if (zzcv.zzo()) {
            this.zzae = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzaf = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzcv.zzc()) {
            i10 = zzcv.zzg(false);
            long j11 = zzcv.zze(i10, this.zza, 0).zzn;
            j10 = zzfk.zzs(0);
        }
        return zzcv.zzl(this.zza, this.zzn, i10, zzfk.zzq(j10));
    }

    private final zzlk zzae(zzlk zzlk, zzcv zzcv, Pair pair) {
        zztw zztw;
        zzvx zzvx;
        zzxr zzxr;
        List list;
        int i10;
        long j10;
        zzcv zzcv2 = zzcv;
        Pair pair2 = pair;
        zzdx.zzd(zzcv.zzo() || pair2 != null);
        zzcv zzcv3 = zzlk.zza;
        long zzZ2 = zzZ(zzlk);
        zzlk zzh2 = zzlk.zzh(zzcv);
        if (zzcv.zzo()) {
            zztw zzj2 = zzlk.zzj();
            long zzq2 = zzfk.zzq(this.zzaf);
            zzlk zzc2 = zzh2.zzd(zzj2, zzq2, zzq2, zzq2, 0, zzvx.zza, this.zzb, zzfvs.zzl()).zzc(zzj2);
            zzc2.zzp = zzc2.zzr;
            return zzc2;
        }
        Object obj = zzh2.zzb.zza;
        int i11 = zzfk.zza;
        boolean z10 = !obj.equals(pair2.first);
        if (z10) {
            zztw = new zztw(pair2.first, -1);
        } else {
            zztw = zzh2.zzb;
        }
        zztw zztw2 = zztw;
        long longValue = ((Long) pair2.second).longValue();
        long zzq3 = zzfk.zzq(zzZ2);
        if (!zzcv3.zzo()) {
            zzcv3.zzn(obj, this.zzn);
        }
        if (z10 || longValue < zzq3) {
            long j11 = longValue;
            zztw zztw3 = zztw2;
            zzdx.zzf(!zztw3.zzb());
            if (z10) {
                zzvx = zzvx.zza;
            } else {
                zzvx = zzh2.zzh;
            }
            zzvx zzvx2 = zzvx;
            if (z10) {
                zzxr = this.zzb;
            } else {
                zzxr = zzh2.zzi;
            }
            zzxr zzxr2 = zzxr;
            if (z10) {
                list = zzfvs.zzl();
            } else {
                list = zzh2.zzj;
            }
            zzlk zzc3 = zzh2.zzd(zztw3, j11, j11, j11, 0, zzvx2, zzxr2, list).zzc(zztw3);
            zzc3.zzp = j11;
            return zzc3;
        } else if (i10 == 0) {
            int zza = zzcv2.zza(zzh2.zzk.zza);
            if (zza != -1 && zzcv2.zzd(zza, this.zzn, false).zzd == zzcv2.zzn(zztw2.zza, this.zzn).zzd) {
                return zzh2;
            }
            zzcv2.zzn(zztw2.zza, this.zzn);
            if (zztw2.zzb()) {
                j10 = this.zzn.zzh(zztw2.zzb, zztw2.zzc);
            } else {
                j10 = this.zzn.zze;
            }
            zzlk zzc4 = zzh2.zzd(zztw2, zzh2.zzr, zzh2.zzr, zzh2.zzd, j10 - zzh2.zzr, zzh2.zzh, zzh2.zzi, zzh2.zzj).zzc(zztw2);
            zzc4.zzp = j10;
            return zzc4;
        } else {
            zztw zztw4 = zztw2;
            zzdx.zzf(!zztw4.zzb());
            long max = Math.max(0, zzh2.zzq - (longValue - zzq3));
            long j12 = zzh2.zzp;
            if (zzh2.zzk.equals(zzh2.zzb)) {
                j12 = longValue + max;
            }
            zzlk zzd2 = zzh2.zzd(zztw4, longValue, longValue, longValue, max, zzh2.zzh, zzh2.zzi, zzh2.zzj);
            zzd2.zzp = j12;
            return zzd2;
        }
    }

    private final zzln zzaf(zzlm zzlm) {
        int zzX2 = zzX(this.zzad);
        zzcv zzcv = this.zzad.zza;
        int i10 = zzX2 == -1 ? 0 : zzX2;
        zzdy zzdy = this.zzu;
        zzkl zzkl = this.zzk;
        return new zzln(zzkl, zzlm, zzcv, i10, zzdy, zzkl.zzb());
    }

    /* access modifiers changed from: private */
    public final void zzag(int i10, int i11) {
        if (i10 != this.zzQ.zzb() || i11 != this.zzQ.zza()) {
            this.zzQ = new zzfc(i10, i11);
            zzeo zzeo = this.zzl;
            zzeo.zzd(24, new zzjo(i10, i11));
            zzeo.zzc();
            zzah(2, 14, new zzfc(i10, i11));
        }
    }

    private final void zzah(int i10, int i11, Object obj) {
        zzlr[] zzlrArr = this.zzh;
        int length = zzlrArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzlr zzlr = zzlrArr[i12];
            if (zzlr.zzb() == i10) {
                zzln zzaf2 = zzaf(zzlr);
                zzaf2.zzf(i11);
                zzaf2.zze(obj);
                zzaf2.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzai() {
        zzah(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzaj(Object obj) {
        ArrayList<zzln> arrayList = new ArrayList<>();
        zzlr[] zzlrArr = this.zzh;
        int length = zzlrArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlr zzlr = zzlrArr[i10];
            if (zzlr.zzb() == 2) {
                zzln zzaf2 = zzaf(zzlr);
                zzaf2.zzf(1);
                zzaf2.zze(obj);
                zzaf2.zzd();
                arrayList.add(zzaf2);
            }
        }
        Object obj2 = this.zzN;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                for (zzln zzi2 : arrayList) {
                    zzi2.zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z10) {
            zzak(zzil.zzd(new zzkm(3), 1003));
        }
    }

    private final void zzak(zzil zzil) {
        zzlk zzlk = this.zzad;
        zzlk zzc2 = zzlk.zzc(zzlk.zzb);
        zzc2.zzp = zzc2.zzr;
        zzc2.zzq = 0;
        zzlk zzg2 = zzc2.zzg(1);
        if (zzil != null) {
            zzg2 = zzg2.zzf(zzil);
        }
        this.zzC++;
        this.zzk.zzo();
        zzam(zzg2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* access modifiers changed from: private */
    public final void zzal(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzlk zzlk = this.zzad;
        if (zzlk.zzl != z11 || zzlk.zzm != i12) {
            this.zzC++;
            if (zzlk.zzo) {
                zzlk = zzlk.zzb();
            }
            zzlk zze2 = zzlk.zze(z11, i12);
            this.zzk.zzn(z11, i12);
            zzam(zze2, 0, i11, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x047f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x048a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x049b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzam(com.google.android.gms.internal.ads.zzlk r44, int r45, int r46, boolean r47, int r48, long r49, int r51, boolean r52) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r48
            com.google.android.gms.internal.ads.zzlk r3 = r0.zzad
            r0.zzad = r1
            com.google.android.gms.internal.ads.zzcv r4 = r3.zza
            com.google.android.gms.internal.ads.zzcv r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzcv r6 = r3.zza
            com.google.android.gms.internal.ads.zzcv r7 = r1.zza
            boolean r8 = r7.zzo()
            r10 = 3
            r11 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r15 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.zzo()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r12)
            goto L_0x004a
        L_0x0035:
            boolean r8 = r7.zzo()
            boolean r9 = r6.zzo()
            if (r8 == r9) goto L_0x004f
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r6.<init>(r7, r8)
        L_0x004a:
            r7 = r6
            r6 = r47
            goto L_0x00da
        L_0x004f:
            com.google.android.gms.internal.ads.zztw r8 = r3.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzcs r9 = r0.zzn
            com.google.android.gms.internal.ads.zzcs r8 = r6.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzcu r9 = r0.zza
            com.google.android.gms.internal.ads.zzcu r6 = r6.zze(r8, r9, r13)
            java.lang.Object r6 = r6.zzc
            com.google.android.gms.internal.ads.zztw r8 = r1.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzcs r9 = r0.zzn
            com.google.android.gms.internal.ads.zzcs r8 = r7.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzcu r9 = r0.zza
            com.google.android.gms.internal.ads.zzcu r7 = r7.zze(r8, r9, r13)
            java.lang.Object r7 = r7.zzc
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a7
            if (r47 == 0) goto L_0x0088
            if (r2 != 0) goto L_0x0085
            r2 = 0
            r6 = 1
            r7 = 1
            goto L_0x0094
        L_0x0085:
            r6 = 1
            r7 = 1
            goto L_0x008a
        L_0x0088:
            r6 = 0
            r7 = 0
        L_0x008a:
            if (r6 == 0) goto L_0x0091
            if (r2 != r5) goto L_0x0091
            r6 = r7
            r7 = 2
            goto L_0x0094
        L_0x0091:
            if (r4 == 0) goto L_0x00a1
            r7 = 3
        L_0x0094:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.<init>(r9, r7)
            r7 = r8
            goto L_0x00da
        L_0x00a1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00a7:
            if (r47 == 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.zztw r2 = r3.zzb
            long r6 = r2.zzd
            com.google.android.gms.internal.ads.zztw r2 = r1.zzb
            long r8 = r2.zzd
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c6
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6.<init>(r2, r7)
            r7 = r6
            r2 = 0
            r6 = 1
            goto L_0x00da
        L_0x00c6:
            r2 = 1
            r6 = 0
            goto L_0x00ce
        L_0x00c9:
            r6 = r2
            r2 = 1
            goto L_0x00ce
        L_0x00cc:
            r6 = r2
            r2 = 0
        L_0x00ce:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.<init>(r8, r12)
            r42 = r6
            r6 = r2
            r2 = r42
        L_0x00da:
            java.lang.Object r8 = r7.first
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r8 == 0) goto L_0x0113
            com.google.android.gms.internal.ads.zzcv r12 = r1.zza
            boolean r12 = r12.zzo()
            if (r12 != 0) goto L_0x010d
            com.google.android.gms.internal.ads.zzcv r12 = r1.zza
            com.google.android.gms.internal.ads.zztw r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzcs r10 = r0.zzn
            com.google.android.gms.internal.ads.zzcs r9 = r12.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzcv r10 = r1.zza
            com.google.android.gms.internal.ads.zzcu r12 = r0.zza
            com.google.android.gms.internal.ads.zzcu r9 = r10.zze(r9, r12, r13)
            com.google.android.gms.internal.ads.zzbp r9 = r9.zze
            goto L_0x010e
        L_0x010d:
            r9 = 0
        L_0x010e:
            com.google.android.gms.internal.ads.zzbv r10 = com.google.android.gms.internal.ads.zzbv.zza
            r0.zzac = r10
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.List r10 = r3.zzj
            java.util.List r12 = r1.zzj
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0150
            com.google.android.gms.internal.ads.zzbv r10 = r0.zzac
            com.google.android.gms.internal.ads.zzbt r10 = r10.zza()
            java.util.List r12 = r1.zzj
            r11 = 0
        L_0x0127:
            int r15 = r12.size()
            if (r11 >= r15) goto L_0x014a
            java.lang.Object r15 = r12.get(r11)
            com.google.android.gms.internal.ads.zzby r15 = (com.google.android.gms.internal.ads.zzby) r15
            r5 = 0
        L_0x0134:
            int r13 = r15.zza()
            if (r5 >= r13) goto L_0x0144
            com.google.android.gms.internal.ads.zzbx r13 = r15.zzb(r5)
            r13.zza(r10)
            int r5 = r5 + 1
            goto L_0x0134
        L_0x0144:
            int r11 = r11 + 1
            r5 = 1
            r13 = 0
            goto L_0x0127
        L_0x014a:
            com.google.android.gms.internal.ads.zzbv r5 = r10.zzu()
            r0.zzac = r5
        L_0x0150:
            com.google.android.gms.internal.ads.zzcv r5 = r43.zzn()
            boolean r10 = r5.zzo()
            if (r10 == 0) goto L_0x015d
            com.google.android.gms.internal.ads.zzbv r5 = r0.zzac
            goto L_0x017a
        L_0x015d:
            int r10 = r43.zzd()
            com.google.android.gms.internal.ads.zzcu r11 = r0.zza
            r12 = 0
            com.google.android.gms.internal.ads.zzcu r5 = r5.zze(r10, r11, r12)
            com.google.android.gms.internal.ads.zzbp r5 = r5.zze
            com.google.android.gms.internal.ads.zzbv r10 = r0.zzac
            com.google.android.gms.internal.ads.zzbt r10 = r10.zza()
            com.google.android.gms.internal.ads.zzbv r5 = r5.zzg
            r10.zzb(r5)
            com.google.android.gms.internal.ads.zzbv r5 = r10.zzu()
        L_0x017a:
            com.google.android.gms.internal.ads.zzbv r10 = r0.zzI
            boolean r10 = r5.equals(r10)
            r11 = 1
            r10 = r10 ^ r11
            r0.zzI = r5
            boolean r5 = r3.zzl
            boolean r11 = r1.zzl
            if (r5 == r11) goto L_0x018c
            r11 = 1
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            int r5 = r3.zze
            int r12 = r1.zze
            if (r5 == r12) goto L_0x0195
            r5 = 1
            goto L_0x0196
        L_0x0195:
            r5 = 0
        L_0x0196:
            if (r5 != 0) goto L_0x019a
            if (r11 == 0) goto L_0x019d
        L_0x019a:
            r43.zzan()
        L_0x019d:
            boolean r12 = r3.zzg
            boolean r13 = r1.zzg
            if (r12 == r13) goto L_0x01a5
            r12 = 1
            goto L_0x01a6
        L_0x01a5:
            r12 = 0
        L_0x01a6:
            if (r4 == 0) goto L_0x01b5
            com.google.android.gms.internal.ads.zzeo r4 = r0.zzl
            com.google.android.gms.internal.ads.zziz r13 = new com.google.android.gms.internal.ads.zziz
            r14 = r45
            r13.<init>(r1, r14)
            r14 = 0
            r4.zzd(r14, r13)
        L_0x01b5:
            if (r6 == 0) goto L_0x02e3
            com.google.android.gms.internal.ads.zzcs r6 = new com.google.android.gms.internal.ads.zzcs
            r6.<init>()
            com.google.android.gms.internal.ads.zzcv r13 = r3.zza
            boolean r13 = r13.zzo()
            if (r13 != 0) goto L_0x01f6
            com.google.android.gms.internal.ads.zztw r13 = r3.zzb
            java.lang.Object r13 = r13.zza
            com.google.android.gms.internal.ads.zzcv r14 = r3.zza
            r14.zzn(r13, r6)
            int r14 = r6.zzd
            com.google.android.gms.internal.ads.zzcv r15 = r3.zza
            int r15 = r15.zza(r13)
            com.google.android.gms.internal.ads.zzcv r4 = r3.zza
            r48 = r13
            com.google.android.gms.internal.ads.zzcu r13 = r0.zza
            r18 = r11
            r19 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcu r4 = r4.zze(r14, r13, r11)
            java.lang.Object r4 = r4.zzc
            com.google.android.gms.internal.ads.zzcu r11 = r0.zza
            com.google.android.gms.internal.ads.zzbp r11 = r11.zze
            r24 = r48
            r21 = r4
            r23 = r11
            r22 = r14
            r25 = r15
            goto L_0x0204
        L_0x01f6:
            r18 = r11
            r19 = r12
            r22 = r51
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = -1
        L_0x0204:
            if (r2 != 0) goto L_0x022e
            com.google.android.gms.internal.ads.zztw r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L_0x021d
            com.google.android.gms.internal.ads.zztw r4 = r3.zzb
            int r11 = r4.zzb
            int r4 = r4.zzc
            long r11 = r6.zzh(r11, r4)
            long r13 = zzab(r3)
            goto L_0x0240
        L_0x021d:
            com.google.android.gms.internal.ads.zztw r4 = r3.zzb
            int r4 = r4.zze
            r11 = -1
            if (r4 == r11) goto L_0x022b
            com.google.android.gms.internal.ads.zzlk r4 = r0.zzad
            long r11 = zzab(r4)
            goto L_0x023f
        L_0x022b:
            long r11 = r6.zze
            goto L_0x023f
        L_0x022e:
            com.google.android.gms.internal.ads.zztw r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L_0x023d
            long r11 = r3.zzr
            long r13 = zzab(r3)
            goto L_0x0240
        L_0x023d:
            long r11 = r3.zzr
        L_0x023f:
            r13 = r11
        L_0x0240:
            com.google.android.gms.internal.ads.zzcn r4 = new com.google.android.gms.internal.ads.zzcn
            int r6 = com.google.android.gms.internal.ads.zzfk.zza
            com.google.android.gms.internal.ads.zztw r6 = r3.zzb
            int r15 = r6.zzb
            int r6 = r6.zzc
            long r26 = com.google.android.gms.internal.ads.zzfk.zzs(r11)
            long r28 = com.google.android.gms.internal.ads.zzfk.zzs(r13)
            r20 = r4
            r30 = r15
            r31 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r28, r30, r31)
            int r6 = r43.zzd()
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzad
            com.google.android.gms.internal.ads.zzcv r11 = r11.zza
            boolean r11 = r11.zzo()
            if (r11 != 0) goto L_0x029c
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzad
            com.google.android.gms.internal.ads.zztw r12 = r11.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzcv r11 = r11.zza
            com.google.android.gms.internal.ads.zzcs r13 = r0.zzn
            r11.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzlk r11 = r0.zzad
            com.google.android.gms.internal.ads.zzcv r11 = r11.zza
            int r11 = r11.zza(r12)
            com.google.android.gms.internal.ads.zzlk r13 = r0.zzad
            com.google.android.gms.internal.ads.zzcv r13 = r13.zza
            com.google.android.gms.internal.ads.zzcu r14 = r0.zza
            r47 = r11
            r15 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcu r13 = r13.zze(r6, r14, r11)
            java.lang.Object r11 = r13.zzc
            com.google.android.gms.internal.ads.zzcu r12 = r0.zza
            com.google.android.gms.internal.ads.zzbp r12 = r12.zze
            r35 = r47
            r31 = r11
            r33 = r12
            r34 = r15
            goto L_0x02a4
        L_0x029c:
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = -1
        L_0x02a4:
            long r36 = com.google.android.gms.internal.ads.zzfk.zzs(r49)
            com.google.android.gms.internal.ads.zzcn r11 = new com.google.android.gms.internal.ads.zzcn
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzad
            com.google.android.gms.internal.ads.zztw r12 = r12.zzb
            boolean r12 = r12.zzb()
            if (r12 == 0) goto L_0x02c1
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzad
            long r12 = zzab(r12)
            long r12 = com.google.android.gms.internal.ads.zzfk.zzs(r12)
            r38 = r12
            goto L_0x02c3
        L_0x02c1:
            r38 = r36
        L_0x02c3:
            com.google.android.gms.internal.ads.zzlk r12 = r0.zzad
            com.google.android.gms.internal.ads.zztw r12 = r12.zzb
            int r13 = r12.zzb
            int r12 = r12.zzc
            r30 = r11
            r32 = r6
            r40 = r13
            r41 = r12
            r30.<init>(r31, r32, r33, r34, r35, r36, r38, r40, r41)
            com.google.android.gms.internal.ads.zzeo r6 = r0.zzl
            com.google.android.gms.internal.ads.zzje r12 = new com.google.android.gms.internal.ads.zzje
            r12.<init>(r2, r4, r11)
            r2 = 11
            r6.zzd(r2, r12)
            goto L_0x02e7
        L_0x02e3:
            r18 = r11
            r19 = r12
        L_0x02e7:
            if (r8 == 0) goto L_0x02f5
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjg r4 = new com.google.android.gms.internal.ads.zzjg
            r4.<init>(r9, r7)
            r11 = 1
            r2.zzd(r11, r4)
            goto L_0x02f6
        L_0x02f5:
            r11 = 1
        L_0x02f6:
            com.google.android.gms.internal.ads.zzil r2 = r3.zzf
            com.google.android.gms.internal.ads.zzil r4 = r1.zzf
            r6 = 10
            if (r2 == r4) goto L_0x0316
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjh r4 = new com.google.android.gms.internal.ads.zzjh
            r4.<init>(r1)
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzil r2 = r1.zzf
            if (r2 == 0) goto L_0x0316
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzji r4 = new com.google.android.gms.internal.ads.zzji
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x0316:
            com.google.android.gms.internal.ads.zzxr r2 = r3.zzi
            com.google.android.gms.internal.ads.zzxr r4 = r1.zzi
            if (r2 == r4) goto L_0x032e
            com.google.android.gms.internal.ads.zzxq r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzp(r4)
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjj r4 = new com.google.android.gms.internal.ads.zzjj
            r4.<init>(r1)
            r7 = 2
            r2.zzd(r7, r4)
        L_0x032e:
            if (r10 == 0) goto L_0x033e
            com.google.android.gms.internal.ads.zzbv r2 = r0.zzI
            com.google.android.gms.internal.ads.zzeo r4 = r0.zzl
            r7 = 14
            com.google.android.gms.internal.ads.zzjk r8 = new com.google.android.gms.internal.ads.zzjk
            r8.<init>(r2)
            r4.zzd(r7, r8)
        L_0x033e:
            if (r19 == 0) goto L_0x034b
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjl r4 = new com.google.android.gms.internal.ads.zzjl
            r4.<init>(r1)
            r7 = 3
            r2.zzd(r7, r4)
        L_0x034b:
            if (r5 != 0) goto L_0x034f
            if (r18 == 0) goto L_0x035a
        L_0x034f:
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjm r4 = new com.google.android.gms.internal.ads.zzjm
            r4.<init>(r1)
            r7 = -1
            r2.zzd(r7, r4)
        L_0x035a:
            r2 = 4
            if (r5 == 0) goto L_0x0367
            com.google.android.gms.internal.ads.zzeo r4 = r0.zzl
            com.google.android.gms.internal.ads.zzjn r5 = new com.google.android.gms.internal.ads.zzjn
            r5.<init>(r1)
            r4.zzd(r2, r5)
        L_0x0367:
            r4 = 5
            if (r18 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.zzeo r5 = r0.zzl
            com.google.android.gms.internal.ads.zzja r7 = new com.google.android.gms.internal.ads.zzja
            r8 = r46
            r7.<init>(r1, r8)
            r5.zzd(r4, r7)
        L_0x0376:
            int r5 = r3.zzm
            int r7 = r1.zzm
            r8 = 6
            if (r5 == r7) goto L_0x0387
            com.google.android.gms.internal.ads.zzeo r5 = r0.zzl
            com.google.android.gms.internal.ads.zzjb r7 = new com.google.android.gms.internal.ads.zzjb
            r7.<init>(r1)
            r5.zzd(r8, r7)
        L_0x0387:
            boolean r5 = r3.zzk()
            boolean r7 = r44.zzk()
            r9 = 7
            if (r5 == r7) goto L_0x039c
            com.google.android.gms.internal.ads.zzeo r5 = r0.zzl
            com.google.android.gms.internal.ads.zzjc r7 = new com.google.android.gms.internal.ads.zzjc
            r7.<init>(r1)
            r5.zzd(r9, r7)
        L_0x039c:
            com.google.android.gms.internal.ads.zzcg r5 = r3.zzn
            com.google.android.gms.internal.ads.zzcg r7 = r1.zzn
            boolean r5 = r5.equals(r7)
            r7 = 12
            if (r5 != 0) goto L_0x03b2
            com.google.android.gms.internal.ads.zzeo r5 = r0.zzl
            com.google.android.gms.internal.ads.zzjd r10 = new com.google.android.gms.internal.ads.zzjd
            r10.<init>(r1)
            r5.zzd(r7, r10)
        L_0x03b2:
            com.google.android.gms.internal.ads.zzck r5 = r0.zzH
            com.google.android.gms.internal.ads.zzco r10 = r0.zzg
            com.google.android.gms.internal.ads.zzck r12 = r0.zzc
            int r13 = com.google.android.gms.internal.ads.zzfk.zza
            boolean r13 = r10.zzx()
            r14 = r10
            com.google.android.gms.internal.ads.zzm r14 = (com.google.android.gms.internal.ads.zzm) r14
            com.google.android.gms.internal.ads.zzcv r15 = r14.zzn()
            boolean r16 = r15.zzo()
            if (r16 != 0) goto L_0x03dd
            int r11 = r14.zzd()
            com.google.android.gms.internal.ads.zzcu r7 = r14.zza
            r8 = 0
            com.google.android.gms.internal.ads.zzcu r7 = r15.zze(r11, r7, r8)
            boolean r7 = r7.zzi
            if (r7 == 0) goto L_0x03dd
            r11 = 1
            goto L_0x03de
        L_0x03dd:
            r11 = 0
        L_0x03de:
            com.google.android.gms.internal.ads.zzcv r7 = r14.zzn()
            boolean r8 = r7.zzo()
            if (r8 == 0) goto L_0x03ed
            r8 = -1
            r9 = 0
        L_0x03ea:
            r17 = 0
            goto L_0x0401
        L_0x03ed:
            int r8 = r14.zzd()
            r14.zzh()
            r14.zzw()
            r9 = 0
            int r7 = r7.zzk(r8, r9, r9)
            r8 = -1
            if (r7 == r8) goto L_0x03ea
            r17 = 1
        L_0x0401:
            com.google.android.gms.internal.ads.zzcv r7 = r14.zzn()
            boolean r15 = r7.zzo()
            if (r15 == 0) goto L_0x040d
        L_0x040b:
            r7 = 0
            goto L_0x041e
        L_0x040d:
            int r15 = r14.zzd()
            r14.zzh()
            r14.zzw()
            int r7 = r7.zzj(r15, r9, r9)
            if (r7 == r8) goto L_0x040b
            r7 = 1
        L_0x041e:
            com.google.android.gms.internal.ads.zzcv r8 = r14.zzn()
            boolean r15 = r8.zzo()
            if (r15 != 0) goto L_0x043e
            int r15 = r14.zzd()
            com.google.android.gms.internal.ads.zzcu r9 = r14.zza
            r50 = r7
            r6 = 0
            com.google.android.gms.internal.ads.zzcu r8 = r8.zze(r15, r9, r6)
            boolean r8 = r8.zzb()
            if (r8 == 0) goto L_0x0442
            r8 = 1
            goto L_0x0443
        L_0x043e:
            r50 = r7
            r6 = 0
        L_0x0442:
            r8 = 0
        L_0x0443:
            com.google.android.gms.internal.ads.zzcv r9 = r14.zzn()
            boolean r15 = r9.zzo()
            if (r15 != 0) goto L_0x045d
            int r15 = r14.zzd()
            com.google.android.gms.internal.ads.zzcu r14 = r14.zza
            com.google.android.gms.internal.ads.zzcu r6 = r9.zze(r15, r14, r6)
            boolean r6 = r6.zzj
            if (r6 == 0) goto L_0x045d
            r6 = 1
            goto L_0x045e
        L_0x045d:
            r6 = 0
        L_0x045e:
            com.google.android.gms.internal.ads.zzcv r7 = r10.zzn()
            boolean r7 = r7.zzo()
            com.google.android.gms.internal.ads.zzci r9 = new com.google.android.gms.internal.ads.zzci
            r9.<init>()
            r9.zzb(r12)
            r10 = r13 ^ 1
            r9.zzd(r2, r10)
            if (r11 == 0) goto L_0x0479
            if (r13 != 0) goto L_0x0479
            r2 = 1
            goto L_0x047a
        L_0x0479:
            r2 = 0
        L_0x047a:
            r9.zzd(r4, r2)
            if (r17 == 0) goto L_0x0483
            if (r13 != 0) goto L_0x0483
            r2 = 1
            goto L_0x0484
        L_0x0483:
            r2 = 0
        L_0x0484:
            r4 = 6
            r9.zzd(r4, r2)
            if (r7 != 0) goto L_0x0494
            if (r17 != 0) goto L_0x0490
            if (r8 == 0) goto L_0x0490
            if (r11 == 0) goto L_0x0494
        L_0x0490:
            if (r13 != 0) goto L_0x0494
            r2 = 1
            goto L_0x0495
        L_0x0494:
            r2 = 0
        L_0x0495:
            r4 = 7
            r9.zzd(r4, r2)
            if (r50 == 0) goto L_0x049f
            if (r13 != 0) goto L_0x049f
            r2 = 1
            goto L_0x04a0
        L_0x049f:
            r2 = 0
        L_0x04a0:
            r4 = 8
            r9.zzd(r4, r2)
            if (r7 != 0) goto L_0x04b1
            if (r50 != 0) goto L_0x04ad
            if (r8 == 0) goto L_0x04b1
            if (r6 == 0) goto L_0x04b1
        L_0x04ad:
            if (r13 != 0) goto L_0x04b1
            r2 = 1
            goto L_0x04b2
        L_0x04b1:
            r2 = 0
        L_0x04b2:
            r4 = 9
            r9.zzd(r4, r2)
            r2 = 10
            r9.zzd(r2, r10)
            if (r11 == 0) goto L_0x04c2
            if (r13 != 0) goto L_0x04c2
            r2 = 1
            goto L_0x04c3
        L_0x04c2:
            r2 = 0
        L_0x04c3:
            r4 = 11
            r9.zzd(r4, r2)
            if (r11 == 0) goto L_0x04ce
            if (r13 != 0) goto L_0x04ce
            r2 = 1
            goto L_0x04cf
        L_0x04ce:
            r2 = 0
        L_0x04cf:
            r4 = 12
            r9.zzd(r4, r2)
            com.google.android.gms.internal.ads.zzck r2 = r9.zze()
            r0.zzH = r2
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x04ec
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            r4 = 13
            com.google.android.gms.internal.ads.zziy r5 = new com.google.android.gms.internal.ads.zziy
            r5.<init>(r0)
            r2.zzd(r4, r5)
        L_0x04ec:
            com.google.android.gms.internal.ads.zzeo r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzo
            boolean r3 = r1.zzo
            if (r2 == r3) goto L_0x050f
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x04fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x050f
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzim r3 = (com.google.android.gms.internal.ads.zzim) r3
            boolean r4 = r1.zzo
            r3.zza(r4)
            goto L_0x04fd
        L_0x050f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkb.zzam(com.google.android.gms.internal.ads.zzlk, int, int, boolean, int, long, int, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void zzan() {
        int zzf2 = zzf();
        if (zzf2 == 2 || zzf2 == 3) {
            zzao();
            boolean z10 = this.zzad.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzao() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[]{Thread.currentThread().getName(), this.zzs.getThread().getName()});
            if (!this.zzY) {
                if (this.zzZ) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzer.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzZ = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    public final void zzA(zzme zzme) {
        zzao();
        this.zzr.zzO(zzme);
    }

    public final void zzB(zzty zzty) {
        zzao();
        List singletonList = Collections.singletonList(zzty);
        zzao();
        zzao();
        zzX(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzlh zzlh = new zzlh((zzty) singletonList.get(i11), this.zzp);
            arrayList.add(zzlh);
            this.zzo.add(i11, new zzka(zzlh.zzb, zzlh.zza));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzlp zzlp = new zzlp(this.zzo, this.zzah);
        if (zzlp.zzo() || zzlp.zzc() >= 0) {
            int zzg2 = zzlp.zzg(false);
            zzlk zzae2 = zzae(this.zzad, zzlp, zzad(zzlp, zzg2, -9223372036854775807L));
            int i12 = zzae2.zze;
            if (!(zzg2 == -1 || i12 == 1)) {
                i12 = (zzlp.zzo() || zzg2 >= zzlp.zzc()) ? 4 : 2;
            }
            zzlk zzg3 = zzae2.zzg(i12);
            this.zzk.zzq(arrayList, zzg2, zzfk.zzq(-9223372036854775807L), this.zzah);
            zzam(zzg3, 0, 1, !this.zzad.zzb.zza.equals(zzg3.zzb.zza) && !this.zzad.zza.zzo(), 4, zzaa(zzg3), -1, false);
            return;
        }
        throw new zzan(zzlp, -1, -9223372036854775807L);
    }

    public final zzil zzE() {
        zzao();
        return this.zzad.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzT(zzkj zzkj) {
        long j10;
        boolean z10;
        int i10 = this.zzC - zzkj.zzb;
        this.zzC = i10;
        boolean z11 = true;
        if (zzkj.zzc) {
            this.zzD = zzkj.zzd;
            this.zzE = true;
        }
        if (zzkj.zze) {
            this.zzF = zzkj.zzf;
        }
        if (i10 == 0) {
            zzcv zzcv = zzkj.zza.zza;
            if (!this.zzad.zza.zzo() && zzcv.zzo()) {
                this.zzae = -1;
                this.zzaf = 0;
            }
            if (!zzcv.zzo()) {
                List zzw2 = ((zzlp) zzcv).zzw();
                zzdx.zzf(zzw2.size() == this.zzo.size());
                for (int i11 = 0; i11 < zzw2.size(); i11++) {
                    ((zzka) this.zzo.get(i11)).zzc((zzcv) zzw2.get(i11));
                }
            }
            if (this.zzE) {
                if (zzkj.zza.zzb.equals(this.zzad.zzb) && zzkj.zza.zzd == this.zzad.zzr) {
                    z11 = false;
                }
                if (!z11) {
                    j10 = -9223372036854775807L;
                } else if (zzcv.zzo() || zzkj.zza.zzb.zzb()) {
                    j10 = zzkj.zza.zzd;
                } else {
                    zzlk zzlk = zzkj.zza;
                    zztw zztw = zzlk.zzb;
                    j10 = zzlk.zzd;
                    zzac(zzcv, zztw, j10);
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzE = false;
            zzam(zzkj.zza, 1, this.zzF, z10, this.zzD, j10, -1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(zzkj zzkj) {
        this.zzj.zzh(new zzjq(this, zzkj));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(zzcl zzcl) {
        zzcl.zza(this.zzH);
    }

    public final void zza(int i10, long j10, int i11, boolean z10) {
        zzao();
        zzdx.zzd(i10 >= 0);
        this.zzr.zzu();
        zzcv zzcv = this.zzad.zza;
        if (zzcv.zzo() || i10 < zzcv.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzer.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkj zzkj = new zzkj(this.zzad);
                zzkj.zza(1);
                this.zzag.zza.zzU(zzkj);
                return;
            }
            zzlk zzlk = this.zzad;
            int i12 = zzlk.zze;
            if (i12 == 3 || (i12 == 4 && !zzcv.zzo())) {
                zzlk = this.zzad.zzg(2);
            }
            int zzd2 = zzd();
            zzlk zzae2 = zzae(zzlk, zzcv, zzad(zzcv, i10, j10));
            this.zzk.zzl(zzcv, i10, zzfk.zzq(j10));
            zzam(zzae2, 0, 1, true, 1, zzaa(zzae2), zzd2, false);
        }
    }

    public final int zzb() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    public final int zzc() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    public final int zzd() {
        zzao();
        int zzX2 = zzX(this.zzad);
        if (zzX2 == -1) {
            return 0;
        }
        return zzX2;
    }

    public final int zze() {
        zzao();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzlk zzlk = this.zzad;
        return zzlk.zza.zza(zzlk.zzb.zza);
    }

    public final int zzf() {
        zzao();
        return this.zzad.zze;
    }

    public final int zzg() {
        zzao();
        return this.zzad.zzm;
    }

    public final int zzh() {
        zzao();
        return 0;
    }

    public final long zzi() {
        zzao();
        if (zzx()) {
            zzlk zzlk = this.zzad;
            if (zzlk.zzk.equals(zzlk.zzb)) {
                return zzfk.zzs(this.zzad.zzp);
            }
            return zzl();
        }
        zzao();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlk zzlk2 = this.zzad;
        long j10 = 0;
        if (zzlk2.zzk.zzd != zzlk2.zzb.zzd) {
            return zzfk.zzs(zzlk2.zza.zze(zzd(), this.zza, 0).zzo);
        }
        long j11 = zzlk2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzlk zzlk3 = this.zzad;
            zzlk3.zza.zzn(zzlk3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzlk zzlk4 = this.zzad;
        zzac(zzlk4.zza, zzlk4.zzk, j10);
        return zzfk.zzs(j10);
    }

    public final long zzj() {
        zzao();
        return zzZ(this.zzad);
    }

    public final long zzk() {
        zzao();
        return zzfk.zzs(zzaa(this.zzad));
    }

    public final long zzl() {
        zzao();
        if (!zzx()) {
            zzcv zzn2 = zzn();
            if (zzn2.zzo()) {
                return -9223372036854775807L;
            }
            return zzfk.zzs(zzn2.zze(zzd(), this.zza, 0).zzo);
        }
        zzlk zzlk = this.zzad;
        zztw zztw = zzlk.zzb;
        zzlk.zza.zzn(zztw.zza, this.zzn);
        return zzfk.zzs(this.zzn.zzh(zztw.zzb, zztw.zzc));
    }

    public final long zzm() {
        zzao();
        return zzfk.zzs(this.zzad.zzq);
    }

    public final zzcv zzn() {
        zzao();
        return this.zzad.zza;
    }

    public final zzdg zzo() {
        zzao();
        return this.zzad.zzi.zzd;
    }

    public final void zzp() {
        zzao();
        zzib zzib = this.zzy;
        boolean zzv2 = zzv();
        int i10 = 2;
        int zzb2 = zzib.zzb(zzv2, 2);
        zzal(zzv2, zzb2, zzY(zzv2, zzb2));
        zzlk zzlk = this.zzad;
        if (zzlk.zze == 1) {
            zzlk zzf2 = zzlk.zzf((zzil) null);
            if (true == zzf2.zza.zzo()) {
                i10 = 4;
            }
            zzlk zzg2 = zzf2.zzg(i10);
            this.zzC++;
            this.zzk.zzk();
            zzam(zzg2, 1, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzq() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfk.zze;
        String zza = zzbq.zza();
        zzer.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.2.0-alpha01] [" + str + "] [" + zza + "]");
        zzao();
        if (zzfk.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeo zzeo = this.zzl;
            zzeo.zzd(10, zzjp.zza);
            zzeo.zzc();
        }
        this.zzl.zze();
        this.zzj.zze((Object) null);
        this.zzt.zzf(this.zzr);
        zzlk zzlk = this.zzad;
        if (zzlk.zzo) {
            this.zzad = zzlk.zzb();
        }
        zzlk zzg2 = this.zzad.zzg(1);
        this.zzad = zzg2;
        zzlk zzc2 = zzg2.zzc(zzg2.zzb);
        this.zzad = zzc2;
        zzc2.zzp = zzc2.zzr;
        this.zzad.zzq = 0;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzdw.zza;
    }

    public final void zzr(boolean z10) {
        zzao();
        int zzb2 = this.zzy.zzb(z10, zzf());
        zzal(z10, zzb2, zzY(z10, zzb2));
    }

    public final void zzs(Surface surface) {
        zzao();
        zzaj(surface);
        int i10 = surface == null ? 0 : -1;
        zzag(i10, i10);
    }

    public final void zzt(float f10) {
        zzao();
        float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzV != max) {
            this.zzV = max;
            zzai();
            zzeo zzeo = this.zzl;
            zzeo.zzd(22, new zzjf(max));
            zzeo.zzc();
        }
    }

    public final void zzu() {
        zzao();
        this.zzy.zzb(zzv(), 1);
        zzak((zzil) null);
        this.zzX = new zzdw(zzfvs.zzl(), this.zzad.zzr);
    }

    public final boolean zzv() {
        zzao();
        return this.zzad.zzl;
    }

    public final boolean zzw() {
        zzao();
        return false;
    }

    public final boolean zzx() {
        zzao();
        return this.zzad.zzb.zzb();
    }

    public final int zzy() {
        zzao();
        int length = this.zzh.length;
        return 2;
    }

    public final void zzz(zzme zzme) {
        this.zzr.zzt(zzme);
    }
}
