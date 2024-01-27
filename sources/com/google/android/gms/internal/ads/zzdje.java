package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.a;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdje extends zzcsx {
    public static final zzfvs zzc = zzfvs.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzauy zzA;
    private final Executor zzd;
    /* access modifiers changed from: private */
    public final zzdjj zze;
    private final zzdjr zzf;
    private final zzdkj zzg;
    private final zzdjo zzh;
    private final zzdju zzi;
    private final zzhaw zzj;
    private final zzhaw zzk;
    private final zzhaw zzl;
    private final zzhaw zzm;
    private final zzhaw zzn;
    /* access modifiers changed from: private */
    public zzdlf zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbyg zzs;
    private final zzaro zzt;
    private final zzcaz zzu;
    private final Context zzv;
    private final zzdjg zzw;
    private final zzemn zzx;
    /* access modifiers changed from: private */
    public final Map zzy = new HashMap();
    private final List zzz = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdje(zzcsw zzcsw, Executor executor, zzdjj zzdjj, zzdjr zzdjr, zzdkj zzdkj, zzdjo zzdjo, zzdju zzdju, zzhaw zzhaw, zzhaw zzhaw2, zzhaw zzhaw3, zzhaw zzhaw4, zzhaw zzhaw5, zzbyg zzbyg, zzaro zzaro, zzcaz zzcaz, Context context, zzdjg zzdjg, zzemn zzemn, zzauy zzauy) {
        super(zzcsw);
        this.zzd = executor;
        this.zze = zzdjj;
        this.zzf = zzdjr;
        this.zzg = zzdkj;
        this.zzh = zzdjo;
        this.zzi = zzdju;
        this.zzj = zzhaw;
        this.zzk = zzhaw2;
        this.zzl = zzhaw3;
        this.zzm = zzhaw4;
        this.zzn = zzhaw5;
        this.zzs = zzbyg;
        this.zzt = zzaro;
        this.zzu = zzcaz;
        this.zzv = context;
        this.zzw = zzdjg;
        this.zzx = zzemn;
        this.zzA = zzauy;
    }

    public static boolean zzV(View view) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjM)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        zzt.zzp();
        long zzv2 = com.google.android.gms.ads.internal.util.zzt.zzv(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (zzv2 >= ((long) ((Integer) zzba.zzc().zzb(zzbci.zzjN)).intValue())) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzX(Map map) {
        if (map == null) {
            return null;
        }
        zzfvs zzfvs = zzc;
        int size = zzfvs.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfvs.get(i10));
            i10++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzY() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhL)).booleanValue()) {
            return null;
        }
        zzdlf zzdlf = this.zzo;
        if (zzdlf == null) {
            zzcat.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj2 = zzdlf.zzj();
        if (zzj2 != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj2);
        }
        return zzdkj.zza;
    }

    private final void zzZ(String str, boolean z10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            e zzw2 = this.zze.zzw();
            if (zzw2 != null) {
                zzfzt.zzr(zzw2, new zzdjc(this, "Google", true), this.zzd);
                return;
            }
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzaa(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzY());
        this.zzq = true;
    }

    /* access modifiers changed from: private */
    public final void zzab(View view, zzfkc zzfkc) {
        zzcgb zzr2 = this.zze.zzr();
        if (this.zzh.zzd() && zzfkc != null && zzr2 != null && view != null) {
            zzt.zzA().zzh(zzfkc, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzac */
    public final synchronized void zzx(zzdlf zzdlf) {
        View view;
        if (!this.zzp) {
            this.zzo = zzdlf;
            this.zzg.zze(zzdlf);
            this.zzf.zzy(zzdlf.zzf(), zzdlf.zzm(), zzdlf.zzn(), zzdlf, zzdlf);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzcs)).booleanValue()) {
                this.zzt.zzc().zzo(zzdlf.zzf());
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbI)).booleanValue()) {
                zzfcr zzfcr = this.zzb;
                if (zzfcr.zzam) {
                    Iterator<String> keys = zzfcr.zzal.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                zzaux zzaux = new zzaux(this.zzv, view);
                                this.zzz.add(zzaux);
                                zzaux.zzc(new zzdjb(this, next));
                            }
                        }
                    }
                }
            }
            if (zzdlf.zzi() != null) {
                zzdlf.zzi().zzc(this.zzs);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzad */
    public final void zzy(zzdlf zzdlf) {
        this.zzf.zzz(zzdlf.zzf(), zzdlf.zzl());
        if (zzdlf.zzh() != null) {
            zzdlf.zzh().setClickable(false);
            zzdlf.zzh().removeAllViews();
        }
        if (zzdlf.zzi() != null) {
            zzdlf.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzq(zzdje zzdje) {
        try {
            zzdjj zzdjj = zzdje.zze;
            int zzc2 = zzdjj.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                zzcat.zzg("Wrong native template id!");
                                return;
                            }
                            zzdju zzdju = zzdje.zzi;
                            if (zzdju.zzg() != null) {
                                zzdju.zzg().zzg((zzblv) zzdje.zzm.zzb());
                            }
                        } else if (zzdje.zzi.zzf() != null) {
                            zzdje.zzZ("Google", true);
                            zzdje.zzi.zzf().zze((zzbhl) zzdje.zzl.zzb());
                        }
                    } else if (zzdje.zzi.zzd(zzdjj.zzA()) != null) {
                        if (zzdje.zze.zzs() != null) {
                            zzdje.zzf("Google", true);
                        }
                        zzdje.zzi.zzd(zzdje.zze.zzA()).zze((zzbgi) zzdje.zzn.zzb());
                    }
                } else if (zzdje.zzi.zza() != null) {
                    zzdje.zzZ("Google", true);
                    zzdje.zzi.zza().zze((zzbgd) zzdje.zzk.zzb());
                }
            } else if (zzdje.zzi.zzb() != null) {
                zzdje.zzZ("Google", true);
                zzdje.zzi.zzb().zze((zzbgf) zzdje.zzj.zzb());
            }
        } catch (RemoteException e10) {
            zzcat.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public final synchronized void zzA(zzcw zzcw) {
        this.zzf.zzj(zzcw);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzB(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdkj r0 = r9.zzg     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdlf r1 = r9.zzo     // Catch:{ all -> 0x0035 }
            r0.zzc(r1)     // Catch:{ all -> 0x0035 }
            android.widget.ImageView$ScaleType r8 = r9.zzY()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdjr r2 = r9.zzf     // Catch:{ all -> 0x0035 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzk(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
            boolean r10 = r9.zzr     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzdjj r10 = r9.zze     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzcgb r11 = r10.zzs()     // Catch:{ all -> 0x0035 }
            if (r11 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            com.google.android.gms.internal.ads.zzcgb r10 = r10.zzs()     // Catch:{ all -> 0x0035 }
            androidx.collection.a r11 = new androidx.collection.a     // Catch:{ all -> 0x0035 }
            r11.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch:{ all -> 0x0035 }
            monitor-exit(r9)
            return
        L_0x0033:
            monitor-exit(r9)
            return
        L_0x0035:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdje.zzB(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzC(View view, int i10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
            zzdlf zzdlf = this.zzo;
            if (zzdlf == null) {
                zzcat.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.zzd.execute(new zzdiy(this, view, zzdlf instanceof zzdkd, i10));
            }
        }
    }

    public final synchronized void zzD(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzF() {
        zzdlf zzdlf = this.zzo;
        if (zzdlf == null) {
            zzcat.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzd.execute(new zzdja(this, zzdlf instanceof zzdkd));
        }
    }

    public final synchronized void zzG() {
        if (!this.zzq) {
            this.zzf.zzr();
        }
    }

    public final void zzH(View view) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            zzcbl zzp2 = this.zze.zzp();
            if (zzp2 != null) {
                zzfzt.zzr(zzp2, new zzdjd(this, view), this.zzd);
                return;
            }
            return;
        }
        zzab(view, this.zze.zzu());
    }

    public final synchronized void zzI(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzJ(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzK(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzL() {
        this.zzf.zzv();
    }

    public final synchronized void zzM(zzcs zzcs) {
        this.zzf.zzw(zzcs);
    }

    public final synchronized void zzN(zzdg zzdg) {
        this.zzx.zza(zzdg);
    }

    public final synchronized void zzO(zzbhi zzbhi) {
        this.zzf.zzx(zzbhi);
    }

    public final synchronized void zzP(zzdlf zzdlf) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzdiu(this, zzdlf));
        } else {
            zzx(zzdlf);
        }
    }

    public final synchronized void zzQ(zzdlf zzdlf) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzdiv(this, zzdlf));
        } else {
            zzy(zzdlf);
        }
    }

    public final boolean zzR() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzS() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzB();
    }

    public final boolean zzU() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzW(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new zzdiz(this));
        super.zzb();
    }

    public final zzdjg zzc() {
        return this.zzw;
    }

    public final zzfkc zzf(String str, boolean z10) {
        String str2;
        zzeeo zzeeo;
        zzeep zzeep;
        zzeep zzeep2;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdjj zzdjj = this.zze;
        zzcgb zzr2 = zzdjj.zzr();
        zzcgb zzs2 = zzdjj.zzs();
        if (zzr2 == null && zzs2 == null) {
            zzcat.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z11 = false;
        boolean z12 = zzr2 != null;
        boolean z13 = zzs2 != null;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeW)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i10 = zzb - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    zzcat.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL) + ". Not initializing Omid.");
                    return null;
                } else if (zzr2 != null) {
                    z11 = true;
                    z13 = false;
                } else {
                    zzcat.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs2 != null) {
                z13 = true;
            } else {
                zzcat.zzj("Omid media type was video but there was no video webview.");
                return null;
            }
        } else {
            z11 = z12;
        }
        if (z11) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr2 = zzs2;
        }
        zzr2.zzG();
        if (!zzt.zzA().zzj(this.zzv)) {
            zzcat.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcaz zzcaz = this.zzu;
        String str3 = zzcaz.zzb + "." + zzcaz.zzc;
        if (z13) {
            zzeeo = zzeeo.zzc;
            zzeep = zzeep.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdjj zzdjj2 = this.zze;
            zzeeo zzeeo2 = zzeeo.NATIVE_DISPLAY;
            if (zzdjj2.zzc() == 3) {
                zzeep2 = zzeep.UNSPECIFIED;
            } else {
                zzeep2 = zzeep.ONE_PIXEL;
            }
            zzeep = zzeep2;
            zzeeo = zzeeo2;
        }
        zzfkc zzb2 = zzt.zzA().zzb(str3, zzr2.zzG(), "", "javascript", str2, str, zzeep, zzeeo, this.zzb.zzan);
        if (zzb2 == null) {
            zzcat.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb2);
        zzr2.zzap(zzb2);
        if (z13) {
            zzt.zzA().zzh(zzb2, zzs2.zzF());
            this.zzr = true;
        }
        if (z10) {
            zzt.zzA().zzi(zzb2);
            zzr2.zzd("onSdkLoaded", new a());
        }
        return zzb2;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzY());
    }

    public final void zzj() {
        this.zzd.execute(new zzdiw(this));
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            zzdjr zzdjr = this.zzf;
            zzdjr.getClass();
            executor.execute(new zzdix(zzdjr));
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzY());
    }

    public final void zzs(View view) {
        zzfkc zzu2 = this.zze.zzu();
        if (this.zzh.zzd() && zzu2 != null && view != null) {
            zzt.zzA().zzf(zzu2, view);
        }
    }

    public final synchronized void zzt() {
        this.zzf.zzh();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzv(View view, boolean z10, int i10) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzY(), i10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(boolean z10) {
        this.zzf.zzo((View) null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzY(), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbI     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzfcr r0 = r3.zzb     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.zzam     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            java.util.Map r2 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzbca r7 = com.google.android.gms.internal.ads.zzbci.zzdI     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r0.zzb(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f2 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = zzV(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            r3.zzaa(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            android.view.View r7 = r3.zzX(r5)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0095
            r3.zzaa(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzdJ     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00b4
            boolean r7 = zzV(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00b2
            r3.zzaa(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00b2:
            monitor-exit(r3)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzdK     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00eb
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f2 }
            int r2 = r0.height()     // Catch:{ all -> 0x00f2 }
            if (r1 != r2) goto L_0x00eb
            int r7 = r7.getWidth()     // Catch:{ all -> 0x00f2 }
            int r0 = r0.width()     // Catch:{ all -> 0x00f2 }
            if (r7 != r0) goto L_0x00eb
            r3.zzaa(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00eb:
            monitor-exit(r3)
            return
        L_0x00ed:
            r3.zzaa(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00f2:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdje.zzz(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }
}
