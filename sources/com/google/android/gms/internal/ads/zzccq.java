package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzccq extends FrameLayout implements zzcch {
    final zzcde zza;
    private final zzcdc zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbda zze;
    private final long zzf;
    private final zzcci zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.zzcci, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.google.android.gms.internal.ads.zzccg] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.google.android.gms.internal.ads.zzcdu] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzccq(android.content.Context r16, com.google.android.gms.internal.ads.zzcdc r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzbda r20, com.google.android.gms.internal.ads.zzcdb r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r20
            r15.<init>(r16)
            r7 = r17
            r0.zzb = r7
            r0.zze = r9
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r8)
            r0.zzc = r10
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r1.<init>(r11, r11)
            r15.addView(r10, r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzj()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzj()
            com.google.android.gms.internal.ads.zzccj r1 = r1.zza
            com.google.android.gms.internal.ads.zzcdd r12 = new com.google.android.gms.internal.ads.zzcdd
            com.google.android.gms.internal.ads.zzcaz r3 = r17.zzn()
            java.lang.String r4 = r17.zzbm()
            com.google.android.gms.internal.ads.zzbcx r6 = r17.zzk()
            r1 = r12
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x005a
            com.google.android.gms.internal.ads.zzcdu r13 = new com.google.android.gms.internal.ads.zzcdu
            boolean r6 = com.google.android.gms.internal.ads.zzccj.zza(r17)
            r1 = r13
            r2 = r16
            r3 = r12
            r4 = r17
            r5 = r19
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0082
        L_0x005a:
            com.google.android.gms.internal.ads.zzccg r13 = new com.google.android.gms.internal.ads.zzccg
            boolean r12 = com.google.android.gms.internal.ads.zzccj.zza(r17)
            com.google.android.gms.internal.ads.zzcdd r14 = new com.google.android.gms.internal.ads.zzcdd
            com.google.android.gms.internal.ads.zzcaz r3 = r17.zzn()
            java.lang.String r4 = r17.zzbm()
            com.google.android.gms.internal.ads.zzbcx r6 = r17.zzk()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r12
            r6 = r21
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0082:
            r0.zzg = r13
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            r0.zzd = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r11, r11, r3)
            r10.addView(r13, r2)
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzF
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b6
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r11, r11)
            r10.addView(r1, r2)
            r10.bringChildToFront(r1)
        L_0x00b6:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzC
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00cb
            r15.zzn()
        L_0x00cb:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r8)
            r0.zzq = r1
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzI
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzE
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzk = r1
            if (r9 == 0) goto L_0x0105
            r2 = 1
            if (r2 == r1) goto L_0x00fe
            java.lang.String r1 = "0"
            goto L_0x0100
        L_0x00fe:
            java.lang.String r1 = "1"
        L_0x0100:
            java.lang.String r2 = "spinner_used"
            r9.zzd(r2, r1)
        L_0x0105:
            com.google.android.gms.internal.ads.zzcde r1 = new com.google.android.gms.internal.ads.zzcde
            r1.<init>(r15)
            r0.zza = r1
            r13.zzr(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccq.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcdc, int, boolean, com.google.android.gms.internal.ads.zzbda, com.google.android.gms.internal.ads.zzcdb):void");
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl2 = zzl();
        if (zzl2 != null) {
            hashMap.put("playerId", zzl2.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() {
        try {
            this.zza.zza();
            zzcci zzcci = this.zzg;
            if (zzcci != null) {
                zzcbg.zze.execute(new zzcck(zzcci));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzt.zza.post(new zzccm(this, z10));
    }

    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        zzt.zza.post(new zzccp(this, z10));
    }

    public final void zzA(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzz(i10);
        }
    }

    public final void zzB(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzA(i10);
        }
    }

    public final void zzC(int i10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzB(i10);
        }
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzb.zze(f10);
            zzcci.zzn();
        }
    }

    public final void zzH(float f10, float f11) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzb.zzd(false);
            zzcci.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbQ)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    public final void zzc(String str, String str2) {
        zzK(Constants.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbQ)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcci zzcci = this.zzg;
        if (zzcci != null && this.zzm == 0) {
            zzcci zzcci2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(((float) zzcci.zzc()) / 1000.0f), "videoWidth", String.valueOf(zzcci2.zze()), "videoHeight", String.valueOf(zzcci2.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzt.zza.post(new zzccl(this));
    }

    public final void zzh() {
        this.zza.zzb();
        zzt.zza.post(new zzccn(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzt.zza.post(new zzcco(this));
    }

    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbca zzbca = zzbci.zzH;
            int max = Math.max(i10 / ((Integer) zzba.zzc().zzb(zzbca)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) zzba.zzc().zzb(zzbca)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zzcat.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbda zzbda = this.zze;
                if (zzbda != null) {
                    zzbda.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            return zzcci.zzw();
        }
        return null;
    }

    public final void zzn() {
        String str;
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            TextView textView = new TextView(zzcci.getContext());
            Resources zzd2 = com.google.android.gms.ads.internal.zzt.zzo().zzd();
            if (zzd2 == null) {
                str = "AdMob - ";
            } else {
                str = zzd2.getString(R.string.watermark_label_prefix);
            }
            textView.setText(String.valueOf(str).concat(this.zzg.zzj()));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzc.bringChildToFront(textView);
        }
    }

    public final void zzo() {
        this.zza.zza();
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzt();
        }
        zzJ();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr(Integer num) {
        if (this.zzg != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                this.zzg.zzC(this.zzn, this.zzo, num);
            } else {
                zzK("no_src", new String[0]);
            }
        }
    }

    public final void zzs() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzb.zzd(true);
            zzcci.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            long zza2 = (long) zzcci.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f10 = ((float) zza2) / 1000.0f;
                if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f10));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzu() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzo();
        }
    }

    public final void zzv() {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzp();
        }
    }

    public final void zzw(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzq(i10);
        }
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzy(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzx(i10);
        }
    }

    public final void zzz(int i10) {
        zzcci zzcci = this.zzg;
        if (zzcci != null) {
            zzcci.zzy(i10);
        }
    }
}
