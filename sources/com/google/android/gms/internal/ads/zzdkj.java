package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdkj {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final zzg zzb;
    private final zzfdn zzc;
    private final zzdjo zzd;
    private final zzdjj zze;
    private final zzdkv zzf;
    private final zzdld zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfc zzj;
    private final zzdjg zzk;

    public zzdkj(zzg zzg2, zzfdn zzfdn, zzdjo zzdjo, zzdjj zzdjj, zzdkv zzdkv, zzdld zzdld, Executor executor, Executor executor2, zzdjg zzdjg) {
        this.zzb = zzg2;
        this.zzc = zzfdn;
        this.zzj = zzfdn.zzi;
        this.zzd = zzdjo;
        this.zze = zzdjj;
        this.zzf = zzdkv;
        this.zzg = zzdld;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdjg;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            view = this.zze.zzf();
        } else {
            view = this.zze.zzg();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdG)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdjj zzdjj = this.zze;
        if (zzdjj.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdjj.zzc() == 2 || zzdjj.zzc() == 1) {
                this.zzb.zzJ(this.zzc.zzf, String.valueOf(zzdjj.zzc()), z10);
            } else if (zzdjj.zzc() == 6) {
                this.zzb.zzJ(this.zzc.zzf, "2", z10);
                this.zzb.zzJ(this.zzc.zzf, AppEventsConstants.EVENT_PARAM_VALUE_YES, z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdlf zzdlf) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbfl zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                View zzg2 = zzdlf.zzg(strArr[i10]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i10++;
            }
        }
        viewGroup = null;
        Context context2 = zzdlf.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdjj zzdjj = this.zze;
        if (zzdjj.zze() != null) {
            zzbfc zzbfc = this.zzj;
            view = zzdjj.zze();
            if (zzbfc != null && viewGroup == null) {
                zzh(layoutParams, zzbfc.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdjj.zzl() instanceof zzbex)) {
            view = null;
        } else {
            zzbex zzbex = (zzbex) zzdjj.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbex.zzc());
                viewGroup = null;
            }
            zzbey zzbey = new zzbey(context2, zzbex, layoutParams);
            zzbey.setContentDescription((CharSequence) zzba.zzc().zzb(zzbci.zzdE));
            view = zzbey;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza3 = new zza(zzdlf.zzf().getContext());
                zza3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza3.addView(view);
                FrameLayout zzh2 = zzdlf.zzh();
                if (zzh2 != null) {
                    zzh2.addView(zza3);
                }
            }
            zzdlf.zzq(zzdlf.zzk(), view, true);
        }
        zzfvs zzfvs = zzdkf.zza;
        int size = zzfvs.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdlf.zzg((String) zzfvs.get(i11));
            i11++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzi.execute(new zzdkg(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdjj zzdjj2 = this.zze;
                if (zzdjj2.zzs() != null) {
                    zzdjj2.zzs().zzao(new zzdki(zzdlf, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzjt)).booleanValue() || !zzi(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdlf.zzf();
                if (zzf2 != null) {
                    context = zzf2.getContext();
                }
                if (context != null && (zza2 = this.zzk.zza()) != null) {
                    try {
                        IObjectWrapper zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi2)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            IObjectWrapper zzj2 = zzdlf.zzj();
                            if (zzj2 != null) {
                                if (((Boolean) zzba.zzc().zzb(zzbci.zzge)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj2));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(zza);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzcat.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdjj zzdjj3 = this.zze;
                if (zzdjj3.zzq() != null) {
                    zzdjj3.zzq().zzao(new zzdki(zzdlf, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdlf zzdlf) {
        if (zzdlf != null && this.zzf != null && zzdlf.zzh() != null && this.zzd.zzg()) {
            try {
                zzdlf.zzh().addView(this.zzf.zza());
            } catch (zzcgm e10) {
                zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final void zzd(zzdlf zzdlf) {
        if (zzdlf != null) {
            Context context = zzdlf.zzf().getContext();
            if (zzbz.zzh(context, this.zzd.zza)) {
                if (!(context instanceof Activity)) {
                    zzcat.zze("Activity context is needed for policy validator.");
                } else if (this.zzg != null && zzdlf.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzg.zza(zzdlf.zzh(), windowManager), zzbz.zzb());
                    } catch (zzcgm e10) {
                        zze.zzb("web view can not be obtained", e10);
                    }
                }
            }
        }
    }

    public final void zze(zzdlf zzdlf) {
        this.zzh.execute(new zzdkh(this, zzdlf));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
