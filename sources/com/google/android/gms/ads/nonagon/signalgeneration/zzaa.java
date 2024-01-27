package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzarp;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzdoi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfjh;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzgad;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaa extends zzbzj {
    protected static final List zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int zze = 0;
    /* access modifiers changed from: private */
    public final zzcaz zzA;
    /* access modifiers changed from: private */
    public String zzB;
    /* access modifiers changed from: private */
    public final String zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzchw zzf;
    /* access modifiers changed from: private */
    public Context zzg;
    private final zzaro zzh;
    private final zzfek zzi;
    /* access modifiers changed from: private */
    public zzdsj zzj = null;
    private final zzgad zzk;
    private final ScheduledExecutorService zzl;
    private zzbtt zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final zzc zzq;
    /* access modifiers changed from: private */
    public final zzdst zzr;
    /* access modifiers changed from: private */
    public final zzfjx zzs;
    /* access modifiers changed from: private */
    public final boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final boolean zzv;
    /* access modifiers changed from: private */
    public final boolean zzw;
    /* access modifiers changed from: private */
    public final String zzx;
    /* access modifiers changed from: private */
    public final String zzy;
    /* access modifiers changed from: private */
    public final AtomicInteger zzz = new AtomicInteger(0);

    public zzaa(zzchw zzchw, Context context, zzaro zzaro, zzfek zzfek, zzgad zzgad, ScheduledExecutorService scheduledExecutorService, zzdst zzdst, zzfjx zzfjx, zzcaz zzcaz) {
        List list;
        this.zzf = zzchw;
        this.zzg = context;
        this.zzh = zzaro;
        this.zzi = zzfek;
        this.zzk = zzgad;
        this.zzl = scheduledExecutorService;
        this.zzq = zzchw.zzn();
        this.zzr = zzdst;
        this.zzs = zzfjx;
        this.zzA = zzcaz;
        this.zzt = ((Boolean) zzba.zzc().zzb(zzbci.zzhi)).booleanValue();
        this.zzu = ((Boolean) zzba.zzc().zzb(zzbci.zzhh)).booleanValue();
        this.zzv = ((Boolean) zzba.zzc().zzb(zzbci.zzhk)).booleanValue();
        this.zzw = ((Boolean) zzba.zzc().zzb(zzbci.zzhm)).booleanValue();
        this.zzx = (String) zzba.zzc().zzb(zzbci.zzhl);
        this.zzy = (String) zzba.zzc().zzb(zzbci.zzhn);
        this.zzC = (String) zzba.zzc().zzb(zzbci.zzho);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhp)).booleanValue()) {
            this.zzD = zzY((String) zzba.zzc().zzb(zzbci.zzhq));
            this.zzE = zzY((String) zzba.zzc().zzb(zzbci.zzhr));
            this.zzF = zzY((String) zzba.zzc().zzb(zzbci.zzhs));
            list = zzY((String) zzba.zzc().zzb(zzbci.zzht));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    static /* bridge */ /* synthetic */ void zzF(zzaa zzaa, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaa.zzN((Uri) it.next())) {
                zzaa.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzG(zzaa zzaa, String str, String str2, zzdsj zzdsj) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgT)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgZ)).booleanValue()) {
                zzcbg.zza.execute(new zzk(zzaa, str, str2, zzdsj));
            } else {
                zzaa.zzq.zzd(str, str2, zzdsj);
            }
        }
    }

    static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzX(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzQ(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfdl r0 = new com.google.android.gms.internal.ads.zzfdl
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzfcy r2 = r0.zzo()
            r2.zza(r5)
            goto L_0x0026
        L_0x0019:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzfcy r2 = r0.zzo()
            r2.zza(r4)
        L_0x0026:
            com.google.android.gms.internal.ads.zzchw r2 = r7.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r2 = r2.zzo()
            com.google.android.gms.internal.ads.zzcwt r6 = new com.google.android.gms.internal.ads.zzcwt
            r6.<init>()
            r6.zze(r8)
            if (r9 != 0) goto L_0x0038
            java.lang.String r9 = "adUnitId"
        L_0x0038:
            r0.zzs(r9)
            if (r12 != 0) goto L_0x0046
            com.google.android.gms.ads.internal.client.zzm r9 = new com.google.android.gms.ads.internal.client.zzm
            r9.<init>()
            com.google.android.gms.ads.internal.client.zzl r12 = r9.zza()
        L_0x0046:
            r0.zzE(r12)
            r9 = 1
            if (r11 != 0) goto L_0x00aa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L_0x0079;
                case -428325382: goto L_0x006f;
                case 543046670: goto L_0x0067;
                case 1854800829: goto L_0x005f;
                case 1951953708: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0083
        L_0x0055:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 0
            goto L_0x0084
        L_0x005f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L_0x0083
            r11 = 2
            goto L_0x0084
        L_0x0067:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L_0x0083
            r11 = 1
            goto L_0x0084
        L_0x006f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 4
            goto L_0x0084
        L_0x0079:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 3
            goto L_0x0084
        L_0x0083:
            r11 = -1
        L_0x0084:
            if (r11 == 0) goto L_0x00a3
            if (r11 == r9) goto L_0x009e
            if (r11 == r5) goto L_0x009e
            if (r11 == r4) goto L_0x0099
            if (r11 == r12) goto L_0x0094
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            r11.<init>()
            goto L_0x00aa
        L_0x0094:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzb()
            goto L_0x00aa
        L_0x0099:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzc()
            goto L_0x00aa
        L_0x009e:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzd()
            goto L_0x00aa
        L_0x00a3:
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.AdSize.BANNER
            r11.<init>((android.content.Context) r8, (com.google.android.gms.ads.AdSize) r12)
        L_0x00aa:
            r0.zzr(r11)
            r0.zzx(r9)
            com.google.android.gms.internal.ads.zzfdn r8 = r0.zzG()
            r6.zzi(r8)
            com.google.android.gms.internal.ads.zzcwv r8 = r6.zzj()
            r2.zza(r8)
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzac
            r8.<init>()
            r8.zza(r10)
            com.google.android.gms.ads.nonagon.signalgeneration.zzae r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzae
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.zzdda r8 = new com.google.android.gms.internal.ads.zzdda
            r8.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzh r8 = r2.zzc()
            com.google.android.gms.internal.ads.zzdsj r9 = r8.zza()
            r7.zzj = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzQ(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl):com.google.android.gms.ads.nonagon.signalgeneration.zzh");
    }

    private final e zzR(String str) {
        zzdoi[] zzdoiArr = new zzdoi[1];
        e zzn2 = zzfzt.zzn(this.zzi.zza(), new zzl(this, zzdoiArr, str), this.zzk);
        zzn2.addListener(new zzm(this, zzdoiArr), this.zzk);
        return zzfzt.zze(zzfzt.zzm((zzfzk) zzfzt.zzo(zzfzk.zzu(zzn2), (long) ((Integer) zzba.zzc().zzb(zzbci.zzhA)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzs.zza, this.zzk), Exception.class, zzt.zza, this.zzk);
    }

    private final void zzS() {
        e eVar;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjh)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzjk)).booleanValue()) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzkh)).booleanValue()) {
                    eVar = zzfzt.zzk(new zzi(this), zzcbg.zza);
                } else {
                    eVar = zzQ(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzc();
                }
                zzfzt.zzr(eVar, new zzz(this), this.zzf.zzB());
            }
        }
    }

    private final void zzT(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk, boolean z10) {
        e eVar;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            zzcat.zzj("The updating URL feature is not enabled.");
            try {
                zzbtk.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e10) {
                zzcat.zzh("", e10);
            }
        } else {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (zzN((Uri) it.next())) {
                    i10++;
                }
            }
            if (i10 > 1) {
                zzcat.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!zzN(uri)) {
                    zzcat.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    eVar = zzfzt.zzh(uri);
                } else {
                    eVar = this.zzk.zzb(new zzn(this, uri, iObjectWrapper));
                    if (zzW()) {
                        eVar = zzfzt.zzn(eVar, new zzo(this), this.zzk);
                    } else {
                        zzcat.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(eVar);
            }
            zzfzt.zzr(zzfzt.zzd(arrayList), new zzy(this, zzbtk, z10), this.zzf.zzB());
        }
    }

    private final void zzU(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk, boolean z10) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            try {
                zzbtk.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e10) {
                zzcat.zzh("", e10);
            }
        } else {
            e zzb2 = this.zzk.zzb(new zzu(this, list, iObjectWrapper));
            if (zzW()) {
                zzb2 = zzfzt.zzn(zzb2, new zzv(this), this.zzk);
            } else {
                zzcat.zzi("Asset view map is empty.");
            }
            zzfzt.zzr(zzb2, new zzx(this, zzbtk, z10), this.zzf.zzB());
        }
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzW() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzbtt r0 = r1.zzm
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzW():boolean");
    }

    /* access modifiers changed from: private */
    public static final Uri zzX(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
    }

    private static final List zzY(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzftl.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfje zzr(e eVar, zzbzo zzbzo) {
        String str;
        if (!zzfjh.zza() || !((Boolean) zzbdu.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfje zzb2 = ((zzh) zzfzt.zzp(eVar)).zzb();
            zzb2.zzd(new ArrayList(Collections.singletonList(zzbzo.zzb)));
            zzl zzl2 = zzbzo.zzd;
            if (zzl2 == null) {
                str = "";
            } else {
                str = zzl2.zzp;
            }
            zzb2.zzb(str);
            return zzb2;
        } catch (ExecutionException e10) {
            zzt.zzo().zzu(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzO(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzX(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) {
        this.zzh.zzc();
        String zzh2 = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        if (!TextUtils.isEmpty(zzh2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzO(uri)) {
                    zzcat.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzX(uri, "ms", zzh2));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(zzdoi[] zzdoiArr) {
        zzdoi zzdoi = zzdoiArr[0];
        if (zzdoi != null) {
            this.zzi.zzb(zzfzt.zzh(zzdoi));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(String str, String str2, zzdsj zzdsj) {
        this.zzq.zzd(str, str2, zzdsj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzN(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzV(uri, this.zzF, this.zzG);
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzbzo zzbzo, zzbzh zzbzh) {
        e eVar;
        e eVar2;
        zzbzo zzbzo2 = zzbzo;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfit zza2 = zzfis.zza(context, 22);
        zza2.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkh)).booleanValue()) {
            zzgad zzgad = zzcbg.zza;
            eVar = zzgad.zzb(new zzq(this, zzbzo));
            eVar2 = zzfzt.zzn(eVar, zzr.zza, zzgad);
        } else {
            zzh zzQ = zzQ(this.zzg, zzbzo2.zza, zzbzo2.zzb, zzbzo2.zzc, zzbzo2.zzd);
            eVar = zzfzt.zzh(zzQ);
            eVar2 = zzQ.zzc();
        }
        zzfzt.zzr(eVar2, new zzw(this, eVar, zzbzo, zzbzh, zza2, zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    public final void zzf(zzbtt zzbtt) {
        this.zzm = zzbtt;
        this.zzi.zzc(1);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        zzT(list, iObjectWrapper, zzbtk, true);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        zzU(list, iObjectWrapper, zzbtk, true);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjg)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zzcat.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            zzbca zzbca = zzbci.zzhy;
            if (!((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                zzS();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzcat.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzcat.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
                if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                    zzS();
                }
            }
        }
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbtt zzbtt = this.zzm;
            if (zzbtt == null) {
                view = null;
            } else {
                view = zzbtt.zza;
            }
            this.zzn = zzbz.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation((float) point.x, (float) point.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        zzT(list, iObjectWrapper, zzbtk, false);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        zzU(list, iObjectWrapper, zzbtk, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } catch (zzarp e10) {
            zzcat.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzh zzq(zzbzo zzbzo) {
        return zzQ(this.zzg, zzbzo.zza, zzbzo.zzb, zzbzo.zzc, zzbzo.zzd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzu() {
        return zzQ(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzv(zzdoi[] zzdoiArr, String str, zzdoi zzdoi) {
        zzdoiArr[0] = zzdoi;
        Context context = this.zzg;
        zzbtt zzbtt = this.zzm;
        Map map = zzbtt.zzb;
        JSONObject zzd2 = zzbz.zzd(context, map, map, zzbtt.zza, (ImageView.ScaleType) null);
        JSONObject zzg2 = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf2 = zzbz.zzf(this.zzm.zza);
        JSONObject zze2 = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg2);
        jSONObject.put("scroll_view_signal", zzf2);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc((String) null, this.zzg, this.zzo, this.zzn));
        }
        return zzdoi.zzd(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzw(ArrayList arrayList) {
        return zzfzt.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzj(this, arrayList), this.zzk);
    }
}
