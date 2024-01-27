package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzr extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */
    public final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzq, zzad zzad) {
        super(context);
        this.zzb = zzad;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int zzx = zzcam.zzx(context, zzq.zza);
        zzay.zzb();
        int zzx2 = zzcam.zzx(context, 0);
        zzay.zzb();
        int zzx3 = zzcam.zzx(context, zzq.zzb);
        zzay.zzb();
        imageButton.setPadding(zzx, zzx2, zzx3, zzcam.zzx(context, zzq.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int zzx4 = zzcam.zzx(context, zzq.zzd + zzq.zza + zzq.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzx4, zzcam.zzx(context, zzq.zzd + zzq.zzc), 17));
        long longValue = ((Long) zzba.zzc().zzb(zzbci.zzbb)).longValue();
        if (longValue > 0) {
            zzp zzp = ((Boolean) zzba.zzc().zzb(zzbci.zzbc)).booleanValue() ? new zzp(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzp);
        }
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zzb(zzbci.zzba);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(17301527);
            return;
        }
        Resources zzd = zzt.zzo().zzd();
        if (zzd != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zzd.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zzd.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                zzcat.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.zza.setImageResource(17301527);
                return;
            }
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    public final void onClick(View view) {
        zzad zzad = this.zzb;
        if (zzad != null) {
            zzad.zzj();
        }
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zza.setVisibility(8);
            if (((Long) zzba.zzc().zzb(zzbci.zzbb)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
