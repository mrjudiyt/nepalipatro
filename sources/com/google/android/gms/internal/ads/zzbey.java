package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbey extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbey(Context context, zzbex zzbex, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbex);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzbex.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbex.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbex.zzg());
            textView.setTextColor(zzbex.zze());
            textView.setTextSize((float) zzbex.zzf());
            zzay.zzb();
            int zzx = zzcam.zzx(context, 4);
            zzay.zzb();
            textView.setPadding(zzx, 0, zzcam.zzx(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbfa> zzi = zzbex.zzi();
        if (zzi != null && zzi.size() > 1) {
            this.zzb = new AnimationDrawable();
            for (zzbfa zzf : zzi) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(zzf.zzf()), zzbex.zzb());
                } catch (Exception e10) {
                    zzcat.zzh("Error while getting drawable.", e10);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(((zzbfa) zzi.get(0)).zzf()));
            } catch (Exception e11) {
                zzcat.zzh("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
