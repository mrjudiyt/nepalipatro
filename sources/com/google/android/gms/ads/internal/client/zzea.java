package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzea {
    final zzaz zza;
    private final zzbou zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    /* access modifiers changed from: private */
    public final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, zzp.zza, (zzbu) null, 0);
    }

    private static zzq zzC(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzq = new zzq(context, adSizeArr);
        zzq.zzj = zzD(i10);
        return zzq;
    }

    private static boolean zzD(int i10) {
        return i10 == 1;
    }

    public final boolean zzA() {
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                return zzbu.zzY();
            }
            return false;
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        zzq zzg2;
        try {
            zzbu zzbu = this.zzj;
            if (!(zzbu == null || (zzg2 = zzbu.zzg()) == null)) {
                return zzb.zzc(zzg2.zze, zzg2.zzb, zzg2.zza);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzdn zzdn = null;
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzdn = zzbu.zzk();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zza(zzdn);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzdq zzi() {
        zzbu zzbu = this.zzj;
        if (zzbu != null) {
            try {
                return zzbu.zzl();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbu;
        if (this.zzl == null && (zzbu = this.zzj) != null) {
            try {
                this.zzl = zzbu.zzr();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzx();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzdx zzdx) {
        zzbu zzbu;
        try {
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzq zzC = zzC(context, this.zzh, this.zzn);
                if ("search_v2".equals(zzC.zza)) {
                    zzbu = (zzbu) new zzal(zzay.zza(), context, zzC, this.zzl).zzd(context, false);
                } else {
                    zzbu = (zzbu) new zzaj(zzay.zza(), context, zzC, this.zzl, this.zzb).zzd(context, false);
                }
                this.zzj = zzbu;
                zzbu.zzD(new zzg(this.zza));
                zza zza2 = this.zzf;
                if (zza2 != null) {
                    this.zzj.zzC(new zzb(zza2));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzG(new zzavk(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzU(new zzfl(this.zzk));
                }
                this.zzj.zzP(new zzfe(this.zzp));
                this.zzj.zzN(this.zzo);
                zzbu zzbu2 = this.zzj;
                if (zzbu2 != null) {
                    try {
                        IObjectWrapper zzn2 = zzbu2.zzn();
                        if (zzn2 != null) {
                            if (((Boolean) zzbdz.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                                    zzcam.zza.post(new zzdy(this, zzn2));
                                }
                            }
                            this.zzm.addView((View) ObjectWrapper.unwrap(zzn2));
                        }
                    } catch (RemoteException e10) {
                        zzcat.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
            zzbu zzbu3 = this.zzj;
            Objects.requireNonNull(zzbu3);
            zzbu3.zzaa(this.zzc.zza(this.zzm.getContext(), zzdx));
        } catch (RemoteException e11) {
            zzcat.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzn() {
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzz();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzo() {
        if (!this.zzd.getAndSet(true)) {
            try {
                zzbu zzbu = this.zzj;
                if (zzbu != null) {
                    zzbu.zzA();
                }
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void zzp() {
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzB();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzq(zza zza2) {
        try {
            this.zzf = zza2;
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzC(zza2 != null ? new zzb(zza2) : null);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzF(zzC(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzG(appEventListener != null ? new zzavk(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzw(boolean z10) {
        this.zzo = z10;
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                zzbu.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        zzfl zzfl;
        this.zzk = videoOptions;
        try {
            zzbu zzbu = this.zzj;
            if (zzbu != null) {
                if (videoOptions == null) {
                    zzfl = null;
                } else {
                    zzfl = new zzfl(videoOptions);
                }
                zzbu.zzU(zzfl);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean zzz(zzbu zzbu) {
        try {
            IObjectWrapper zzn2 = zzbu.zzn();
            if (zzn2 == null || ((View) ObjectWrapper.unwrap(zzn2)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zzn2));
            this.zzj = zzbu;
            return true;
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public zzea(ViewGroup viewGroup, int i10) {
        this(viewGroup, (AttributeSet) null, false, zzp.zza, (zzbu) null, i10);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzp.zza, (zzbu) null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzp.zza, (zzbu) null, i10);
    }

    zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzp zzp2, zzbu zzbu, int i10) {
        zzq zzq;
        this.zzb = new zzbou();
        this.zze = new VideoController();
        this.zza = new zzdz(this);
        this.zzm = viewGroup;
        this.zzc = zzp2;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzy = new zzy(context, attributeSet);
                this.zzh = zzy.zzb(z10);
                this.zzl = zzy.zza();
                if (viewGroup.isInEditMode()) {
                    zzcam zzb2 = zzay.zzb();
                    AdSize adSize = this.zzh[0];
                    int i11 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzq = zzq.zze();
                    } else {
                        zzq zzq2 = new zzq(context, adSize);
                        zzq2.zzj = zzD(i11);
                        zzq = zzq2;
                    }
                    zzb2.zzm(viewGroup, zzq, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                zzay.zzb().zzl(viewGroup, new zzq(context, AdSize.BANNER), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
