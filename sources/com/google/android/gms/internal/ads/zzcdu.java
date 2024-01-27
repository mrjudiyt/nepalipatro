package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcdu extends zzcci implements TextureView.SurfaceTextureListener, zzccs {
    private final zzcdc zzc;
    private final zzcdd zzd;
    private final zzcdb zze;
    private zzcch zzf;
    private Surface zzg;
    private zzcct zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl = 1;
    private zzcda zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdu(Context context, zzcdd zzcdd, zzcdc zzcdc, boolean z10, boolean z11, zzcdb zzcdb) {
        super(context);
        this.zzc = zzcdc;
        this.zzd = zzcdd;
        this.zzn = z10;
        this.zze = zzcdb;
        setSurfaceTextureListener(this);
        zzcdd.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.FORWARD_SLASH_STRING + canonicalName + CertificateUtil.DELIMITER + message;
    }

    private final void zzU() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzo) {
            this.zzo = true;
            zzt.zza.post(new zzcdt(this));
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z10, Integer num) {
        zzcct zzcct = this.zzh;
        if (zzcct != null && !z10) {
            zzcct.zzP(num);
        } else if (this.zzi != null && this.zzg != null) {
            if (z10) {
                if (zzad()) {
                    zzcct.zzU();
                    zzY();
                } else {
                    zzcat.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcen zzp2 = this.zzc.zzp(this.zzi);
                if (zzp2 instanceof zzcew) {
                    zzcct zza = ((zzcew) zzp2).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        zzcat.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp2 instanceof zzcet) {
                    zzcet zzcet = (zzcet) zzp2;
                    String zzF = zzF();
                    ByteBuffer zzk2 = zzcet.zzk();
                    boolean zzl2 = zzcet.zzl();
                    String zzi2 = zzcet.zzi();
                    if (zzi2 == null) {
                        zzcat.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcct zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzi2)}, zzF, zzk2, zzl2);
                } else {
                    zzcat.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ((Surface) null, true);
            zzcct zzcct = this.zzh;
            if (zzcct != null) {
                zzcct.zzL((zzccs) null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            try {
                zzcct.zzS(surface, z10);
            } catch (IOException e10) {
                zzcat.zzk("", e10);
            }
        } else {
            zzcat.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? ((float) i10) / ((float) i11) : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcct zzcct = this.zzh;
        return zzcct != null && zzcct.zzV() && !this.zzk;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = (float) measuredWidth;
            float f12 = f11 / ((float) measuredHeight);
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (((float) measuredHeight) * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcda zzcda = this.zzm;
        if (zzcda != null) {
            zzcda.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcda zzcda = new zzcda(getContext());
            this.zzm = zzcda;
            zzcda.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, (Integer) null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        zzt.zza.post(new zzcdq(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcda zzcda = this.zzm;
        if (zzcda != null) {
            zzcda.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ((Surface) null, true);
        }
        zzt.zza.post(new zzcdm(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzcda zzcda = this.zzm;
        if (zzcda != null) {
            zzcda.zzc(i10, i11);
        }
        zzt.zza.post(new zzcdl(this, i10, i11));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i10) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        zzt.zza.post(new zzcdk(this, i10));
        super.onWindowVisibilityChanged(i10);
    }

    public final void zzA(int i10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzN(i10);
        }
    }

    public final void zzB(int i10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzR(i10);
        }
    }

    public final void zzC(String str, String[] strArr, Integer num) {
        if (str != null) {
            boolean z10 = true;
            if (strArr == null) {
                this.zzj = new String[]{str};
            } else {
                this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzi;
            if (!this.zze.zzl || str2 == null || str.equals(str2) || this.zzl != 4) {
                z10 = false;
            }
            this.zzi = str;
            zzW(z10, num);
        }
    }

    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    /* access modifiers changed from: package-private */
    public final zzcct zzE(Integer num) {
        zzcdb zzcdb = this.zze;
        zzcdc zzcdc = this.zzc;
        zzcfo zzcfo = new zzcfo(zzcdc.getContext(), zzcdb, zzcdc, num);
        zzcat.zzi("ExoPlayerAdapter initialized.");
        return zzcfo;
    }

    /* access modifiers changed from: package-private */
    public final String zzF() {
        zzcdc zzcdc = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcdc.getContext(), zzcdc.zzn().zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str) {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(String str) {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzj(i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            try {
                zzcct.zzT(zza, false);
            } catch (IOException e10) {
                zzcat.zzk("", e10);
            }
        } else {
            zzcat.zzj("Trying to set volume before player is initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(int i10) {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.onWindowVisibilityChanged(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS() {
        zzcch zzcch = this.zzf;
        if (zzcch != null) {
            zzcch.zze();
        }
    }

    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            return zzcct.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzr;
    }

    public final int zze() {
        return this.zzq;
    }

    public final long zzf() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            return zzcct.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            return zzcct.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            return zzcct.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z10, long j10) {
        if (this.zzc != null) {
            zzcbg.zze.execute(new zzcdn(this, z10, j10));
        }
    }

    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzT = zzT(str, exc);
        zzcat.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        zzt.zza.post(new zzcdr(this, zzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzT = zzT("onLoadException", exc);
        zzcat.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        zzt.zza.post(new zzcdo(this, zzT));
    }

    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 == 3) {
                zzV();
            } else if (i10 == 4) {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                zzt.zza.post(new zzcds(this));
            }
        }
    }

    public final void zzn() {
        zzt.zza.post(new zzcdj(this));
    }

    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzt.zza.post(new zzcdp(this));
        }
    }

    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzt.zza.post(new zzcdi(this));
            return;
        }
        this.zzp = true;
    }

    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI((long) i10);
        }
    }

    public final void zzr(zzcch zzcch) {
        this.zzf = zzcch;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzC(str, (String[]) null, (Integer) null);
        }
    }

    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    public final void zzu(float f10, float f11) {
        zzcda zzcda = this.zzm;
        if (zzcda != null) {
            zzcda.zzf(f10, f11);
        }
    }

    public final void zzv() {
        zzt.zza.post(new zzcdh(this));
    }

    public final Integer zzw() {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            return zzcct.zzC();
        }
        return null;
    }

    public final void zzx(int i10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzJ(i10);
        }
    }

    public final void zzy(int i10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzK(i10);
        }
    }

    public final void zzz(int i10) {
        zzcct zzcct = this.zzh;
        if (zzcct != null) {
            zzcct.zzM(i10);
        }
    }
}
