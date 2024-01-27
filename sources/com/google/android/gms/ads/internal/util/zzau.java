package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzgad;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzau {
    private final Context zza;
    private final zzdvm zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new zzah(this);
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        zzt.zzt().zzb();
        this.zzk = zzt.zzt().zza();
        this.zzb = zzt.zzs().zza();
    }

    private final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        int zzu2 = zzu(arrayList, "Shake", true);
        int zzu3 = zzu(arrayList, "Flick", true);
        zzdvi zzdvi = zzdvi.NONE;
        int ordinal = this.zzb.zza().ordinal();
        int i10 = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        zzt.zzp();
        AlertDialog.Builder zzJ = zzt.zzJ(context);
        AtomicInteger atomicInteger = new AtomicInteger(i10);
        zzJ.setTitle("Setup gesture");
        zzJ.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new zzap(atomicInteger));
        zzJ.setNegativeButton("Dismiss", new zzaq(this));
        zzJ.setPositiveButton("Save", new zzar(this, atomicInteger, i10, zzu2, zzu3));
        zzJ.setOnCancelListener(new zzas(this));
        zzJ.create().show();
    }

    private final boolean zzt(float f10, float f11, float f12, float f13) {
        return Math.abs(this.zzi.x - f10) < ((float) this.zzh) && Math.abs(this.zzi.y - f11) < ((float) this.zzh) && Math.abs(this.zzj.x - f12) < ((float) this.zzh) && Math.abs(this.zzj.y - f13) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzgad zzgad) {
        if (!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzt.zzs().zzd(this.zza, this.zzd, this.zze);
            return;
        }
        zzgad.execute(new zzan(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzgad zzgad) {
        if (!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzt.zzs().zzd(this.zza, this.zzd, this.zze);
            return;
        }
        zzgad.execute(new zzam(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        zzt.zzs().zzc(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        zzt.zzs().zzc(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.zzb.zzl(zzdvi.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.zzb.zzl(zzdvi.FLICK);
            } else {
                this.zzb.zzl(zzdvi.NONE);
            }
        }
        zzr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i10) {
        zzt.zzp();
        zzt.zzS(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 == i10) {
            if (!(this.zza instanceof Activity)) {
                zzcat.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.zzc;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                zzt.zzp();
                Map zzO = zzt.zzO(build);
                for (String str3 : zzO.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzO.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            zzt.zzp();
            AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
            zzJ.setMessage(str2);
            zzJ.setTitle("Ad Information");
            zzJ.setPositiveButton("Share", new zzaj(this, str2));
            zzJ.setNegativeButton("Close", zzak.zza);
            zzJ.create().show();
        } else if (i15 == i11) {
            zzcat.zze("Debug mode [Creative Preview] selected.");
            zzcbg.zza.execute(new zzai(this));
        } else if (i15 == i12) {
            zzcat.zze("Debug mode [Troubleshooting] selected.");
            zzcbg.zza.execute(new zzag(this));
        } else if (i15 == i13) {
            zzdvm zzdvm = this.zzb;
            zzgad zzgad = zzcbg.zze;
            zzgad zzgad2 = zzcbg.zza;
            if (zzdvm.zzp()) {
                zzgad.execute(new zzat(this));
            } else {
                zzgad2.execute(new zzaf(this, zzgad));
            }
        } else if (i15 == i14) {
            zzdvm zzdvm2 = this.zzb;
            zzgad zzgad3 = zzcbg.zze;
            zzgad zzgad4 = zzcbg.zza;
            if (zzdvm2.zzp()) {
                zzgad3.execute(new zzae(this));
            } else {
                zzgad4.execute(new zzal(this, zzgad3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        zzay zzs = zzt.zzs();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzs.zzm();
        Context context = this.zza;
        zzs.zzh(zzs.zzj(context, str, str2));
        if (zzs.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzs.zze(context, str2, str3, str);
            }
            zzcat.zze("Device is linked for debug signals.");
            zzs.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzs.zzd(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl() {
        zzay zzs = zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzs.zzk(context, str, str2)) {
            zzs.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzs.zza)) {
            zzcat.zze("Creative is not pushed for this device.");
            zzs.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(zzs.zza)) {
            zzcat.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(zzs.zza)) {
            zzcat.zze("Device is linked for in app preview.");
            zzs.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.zzg;
        if (i10 != -1) {
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.zzk.postDelayed(this.zzl, ((Long) zzba.zzc().zzb(zzbci.zzez)).longValue());
                }
            } else if (i10 == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z10 = false;
                        for (int i11 = 0; i11 < historySize; i11++) {
                            z10 |= !zzt(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                        }
                        if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.zzg = -1;
                this.zzk.removeCallbacks(this.zzl);
            }
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzcat.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != zzt.zzs().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int zzu = zzu(arrayList, "Ad information", true);
            int zzu2 = zzu(arrayList, str, true);
            int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zziU)).booleanValue();
            int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            zzt.zzp();
            AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
            zzJ.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzao(this, zzu, zzu2, zzu3, zzu4, zzu5));
            zzJ.create().show();
        } catch (WindowManager.BadTokenException e10) {
            zze.zzb("", e10);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
