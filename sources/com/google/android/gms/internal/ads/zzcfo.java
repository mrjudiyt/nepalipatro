package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcfo extends zzcct implements zzhk, zzme {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcez zzc;
    private final zzxi zzd;
    private final zzcdb zze;
    private final WeakReference zzf;
    private final zzvd zzg;
    private zziw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzccs zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq = new Object();
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcfb zzt;
    private final Set zzu = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzbO)).booleanValue() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e7, code lost:
        if (r5.zzj == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ec, code lost:
        if (r5.zzm == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcff(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        if (r5.zzi <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcfg(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcfh(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (r5.zzj == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcfi(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r4.limit() <= 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcfj(r5, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcfo(android.content.Context r4, com.google.android.gms.internal.ads.zzcdb r5, com.google.android.gms.internal.ads.zzcdc r6, java.lang.Integer r7) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzq = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zzu = r0
            r3.zzb = r4
            r3.zze = r5
            r3.zzr = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            r3.zzf = r7
            com.google.android.gms.internal.ads.zzcez r7 = new com.google.android.gms.internal.ads.zzcez
            r7.<init>()
            r3.zzc = r7
            com.google.android.gms.internal.ads.zzxi r0 = new com.google.android.gms.internal.ads.zzxi
            r0.<init>(r4)
            r3.zzd = r0
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "SimpleExoPlayerAdapter initialize "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L_0x003f:
            java.util.concurrent.atomic.AtomicInteger r1 = com.google.android.gms.internal.ads.zzcct.zzD()
            r1.incrementAndGet()
            com.google.android.gms.internal.ads.zzlw r1 = new com.google.android.gms.internal.ads.zzlw
            com.google.android.gms.internal.ads.zzcfl r2 = new com.google.android.gms.internal.ads.zzcfl
            r2.<init>(r3)
            r1.<init>(r4, r2)
            r1.zzb(r0)
            r1.zza(r7)
            com.google.android.gms.internal.ads.zzlx r7 = r1.zzc()
            r3.zzh = r7
            r7.zzz(r3)
            r7 = 0
            r3.zzl = r7
            r0 = 0
            r3.zzn = r0
            r3.zzm = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zzs = r0
            r0 = 0
            r3.zzt = r0
            if (r6 == 0) goto L_0x0078
            java.lang.String r0 = r6.zzbl()
        L_0x0078:
            com.google.android.gms.internal.ads.zzfss r0 = com.google.android.gms.internal.ads.zzfss.zzd(r0)
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.zzb(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.zzo = r0
            if (r6 == 0) goto L_0x008d
            int r0 = r6.zzf()
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            r3.zzp = r0
            com.google.android.gms.internal.ads.zzvd r0 = new com.google.android.gms.internal.ads.zzvd
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.zzcaz r6 = r6.zzn()
            java.lang.String r6 = r6.zza
            java.lang.String r4 = r1.zzc(r4, r6)
            boolean r6 = r3.zzj
            if (r6 == 0) goto L_0x00c0
            java.nio.ByteBuffer r6 = r3.zzi
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x00c0
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = r3.zzi
            r5.get(r4)
            com.google.android.gms.internal.ads.zzcfd r5 = new com.google.android.gms.internal.ads.zzcfd
            r5.<init>(r4)
            goto L_0x012c
        L_0x00c0:
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzbW
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r1.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 1
            if (r6 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzbO
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r2.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00e9
        L_0x00e5:
            boolean r6 = r5.zzj
            if (r6 != 0) goto L_0x00ea
        L_0x00e9:
            r7 = 1
        L_0x00ea:
            boolean r6 = r5.zzm
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzcff r6 = new com.google.android.gms.internal.ads.zzcff
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00f4:
            int r6 = r5.zzi
            if (r6 <= 0) goto L_0x00fe
            com.google.android.gms.internal.ads.zzcfg r6 = new com.google.android.gms.internal.ads.zzcfg
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.zzcfh r6 = new com.google.android.gms.internal.ads.zzcfh
            r6.<init>(r3, r4, r7)
        L_0x0103:
            boolean r4 = r5.zzj
            if (r4 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzcfi r4 = new com.google.android.gms.internal.ads.zzcfi
            r4.<init>(r3, r6)
            r5 = r4
            goto L_0x010f
        L_0x010e:
            r5 = r6
        L_0x010f:
            java.nio.ByteBuffer r4 = r3.zzi
            if (r4 == 0) goto L_0x012c
            int r4 = r4.limit()
            if (r4 <= 0) goto L_0x012c
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r6 = r3.zzi
            r6.get(r4)
            com.google.android.gms.internal.ads.zzcfj r6 = new com.google.android.gms.internal.ads.zzcfj
            r6.<init>(r5, r4)
            r5 = r6
        L_0x012c:
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzo
            com.google.android.gms.internal.ads.zzbcg r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r6.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0141
            com.google.android.gms.internal.ads.zzcfn r4 = com.google.android.gms.internal.ads.zzcfn.zza
            goto L_0x0143
        L_0x0141:
            com.google.android.gms.internal.ads.zzcfe r4 = com.google.android.gms.internal.ads.zzcfe.zza
        L_0x0143:
            com.google.android.gms.internal.ads.zzvc r6 = new com.google.android.gms.internal.ads.zzvc
            r6.<init>(r4)
            r0.<init>(r5, r6)
            r3.zzg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcdb, com.google.android.gms.internal.ads.zzcdc, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcct.zzD().decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzad()) {
            return (long) this.zzl;
        }
        return 0;
    }

    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j10 = this.zzn;
                Map zze2 = ((zzhf) this.zzs.remove(0)).zze();
                long j11 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfsc.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j10 + j11;
            }
        }
        return this.zzn;
    }

    public final Integer zzC() {
        return this.zzr;
    }

    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzty zzty;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzty = zzaa(uriArr[0]);
            } else {
                zzty[] zztyArr = new zzty[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zztyArr[i10] = zzaa(uriArr[i10]);
                }
                zzty = new zzuo(false, false, zztyArr);
            }
            this.zzh.zzB(zzty);
            this.zzh.zzp();
            zzcct.zzE().incrementAndGet();
        }
    }

    public final void zzH() {
        zziw zziw = this.zzh;
        if (zziw != null) {
            zziw.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcct.zzE().decrementAndGet();
        }
    }

    public final void zzI(long j10) {
        zzm zzm2 = (zzm) this.zzh;
        zzm2.zza(zzm2.zzd(), j10, 5, false);
    }

    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    public final void zzL(zzccs zzccs) {
        this.zzk = zzccs;
    }

    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    public final void zzP(Integer num) {
        this.zzr = num;
    }

    public final void zzQ(boolean z10) {
        if (this.zzh != null) {
            int i10 = 0;
            while (true) {
                this.zzh.zzy();
                if (i10 < 2) {
                    zzxi zzxi = this.zzd;
                    zzwu zzc2 = zzxi.zzd().zzc();
                    zzc2.zzo(i10, !z10);
                    zzxi.zzk(zzc2);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzR(int i10) {
        for (WeakReference weakReference : this.zzu) {
            zzcey zzcey = (zzcey) weakReference.get();
            if (zzcey != null) {
                zzcey.zzm(i10);
            }
        }
    }

    public final void zzS(Surface surface, boolean z10) {
        zziw zziw = this.zzh;
        if (zziw != null) {
            zziw.zzs(surface);
        }
    }

    public final void zzT(float f10, boolean z10) {
        zziw zziw = this.zzh;
        if (zziw != null) {
            zziw.zzt(f10);
        }
    }

    public final void zzU() {
        this.zzh.zzu();
    }

    public final boolean zzV() {
        return this.zzh != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzW(String str, boolean z10) {
        zzcfo zzcfo = true != z10 ? null : this;
        zzcdb zzcdb = this.zze;
        return new zzcfr(str, zzcfo, zzcdb.zzd, zzcdb.zzf, zzcdb.zzn, zzcdb.zzo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzX(String str, boolean z10) {
        zzcfo zzcfo = true != z10 ? null : this;
        zzcdb zzcdb = this.zze;
        zzcey zzcey = new zzcey(str, zzcfo, zzcdb.zzd, zzcdb.zzf, zzcdb.zzi);
        this.zzu.add(new WeakReference(zzcey));
        return zzcey;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzY(String str, boolean z10) {
        zzgq zzgq = new zzgq();
        zzgq.zzf(str);
        zzgq.zze(true != z10 ? null : this);
        zzgq.zzc(this.zze.zzd);
        zzgq.zzd(this.zze.zzf);
        zzgq.zzb(true);
        return zzgq.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzZ(zzgh zzgh) {
        zzgi zza2 = zzgh.zza();
        zzcfm zzcfm = new zzcfm(this);
        return new zzcfb(this.zzb, zza2, this.zzo, this.zzp, this, zzcfm);
    }

    public final void zza(zzgi zzgi, zzgn zzgn, boolean z10, int i10) {
        this.zzl += i10;
    }

    /* access modifiers changed from: package-private */
    public final zzty zzaa(Uri uri) {
        zzar zzar = new zzar();
        zzar.zzb(uri);
        zzbp zzc2 = zzar.zzc();
        zzvd zzvd = this.zzg;
        zzvd.zza(this.zze.zzg);
        return zzvd.zzb(zzc2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(boolean z10, long j10) {
        zzccs zzccs = this.zzk;
        if (zzccs != null) {
            zzccs.zzi(z10, j10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzlr[] zzac(Handler handler, zzaad zzaad, zzpc zzpc, zzwa zzwa, zzsw zzsw) {
        zzsg zzsg = zzsg.zzb;
        zzon zzon = zzon.zza;
        zzdq[] zzdqArr = new zzdq[0];
        zzpw zzpw = new zzpw();
        if (zzon == null) {
            Objects.requireNonNull(zzon, "Both parameters are null");
        }
        Context context = this.zzb;
        zzpw.zzc(zzon);
        zzpw.zzd(zzdqArr);
        zzqi zze2 = zzpw.zze();
        zzrv zzrv = zzrv.zza;
        return new zzlr[]{new zzqo(context, zzrv, zzsg, false, handler, zzpc, zze2), new zzzf(this.zzb, zzrv, zzsg, 0, false, handler, zzaad, -1, 30.0f)};
    }

    public final void zzb(zzgi zzgi, zzgn zzgn, boolean z10) {
    }

    public final void zzc(zzgi zzgi, zzgn zzgn, boolean z10) {
    }

    public final void zzd(zzgi zzgi, zzgn zzgn, boolean z10) {
        if (zzgi instanceof zzhf) {
            synchronized (this.zzq) {
                this.zzs.add((zzhf) zzgi);
            }
        } else if (zzgi instanceof zzcfb) {
            this.zzt = (zzcfb) zzgi;
            zzcdc zzcdc = (zzcdc) this.zzf.get();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdc != null && this.zzt.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                zzt.zza.post(new zzcfk(zzcdc, hashMap));
            }
        }
    }

    public final void zze(zzmc zzmc, zzam zzam, zzie zzie) {
        zzcdc zzcdc = (zzcdc) this.zzf.get();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdc != null) {
            HashMap hashMap = new HashMap();
            String str = zzam.zzl;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzam.zzm;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzam.zzj;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcdc.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzmc zzmc, int i10, long j10, long j11) {
    }

    public final /* synthetic */ void zzg(zzmc zzmc, zzts zzts) {
    }

    public final void zzh(zzmc zzmc, int i10, long j10) {
        this.zzm += i10;
    }

    public final /* synthetic */ void zzi(zzco zzco, zzmd zzmd) {
    }

    public final void zzj(zzmc zzmc, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        zzccs zzccs = this.zzk;
        if (zzccs == null) {
            return;
        }
        if (this.zze.zzk) {
            zzccs.zzl("onLoadException", iOException);
        } else {
            zzccs.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzmc zzmc, int i10) {
        zzccs zzccs = this.zzk;
        if (zzccs != null) {
            zzccs.zzm(i10);
        }
    }

    public final void zzl(zzmc zzmc, zzce zzce) {
        zzccs zzccs = this.zzk;
        if (zzccs != null) {
            zzccs.zzk("onPlayerError", zzce);
        }
    }

    public final /* synthetic */ void zzm(zzmc zzmc, zzcn zzcn, zzcn zzcn2, int i10) {
    }

    public final void zzn(zzmc zzmc, Object obj, long j10) {
        zzccs zzccs = this.zzk;
        if (zzccs != null) {
            zzccs.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzmc zzmc, zzid zzid) {
    }

    public final void zzp(zzmc zzmc, zzam zzam, zzie zzie) {
        zzcdc zzcdc = (zzcdc) this.zzf.get();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzam.zzt));
            hashMap.put("bitRate", String.valueOf(zzam.zzi));
            int i10 = zzam.zzr;
            int i11 = zzam.zzs;
            hashMap.put("resolution", i10 + "x" + i11);
            String str = zzam.zzl;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzam.zzm;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzam.zzj;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcdc.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzmc zzmc, zzdm zzdm) {
        zzccs zzccs = this.zzk;
        if (zzccs != null) {
            zzccs.zzD(zzdm.zzc, zzdm.zzd);
        }
    }

    public final int zzr() {
        return this.zzm;
    }

    public final int zzt() {
        return this.zzh.zzf();
    }

    public final long zzv() {
        return this.zzh.zzi();
    }

    public final long zzw() {
        return (long) this.zzl;
    }

    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min((long) this.zzl, this.zzt.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzh.zzk();
    }

    public final long zzz() {
        return this.zzh.zzl();
    }
}
