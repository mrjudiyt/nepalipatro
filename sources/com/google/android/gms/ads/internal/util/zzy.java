package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import java.util.Locale;

@TargetApi(28)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzy extends zzw {
    static final /* synthetic */ WindowInsets zzm(Activity activity, View view, WindowInsets windowInsets) {
        if (zzt.zzo().zzh().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzh = zzt.zzo().zzh();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.zzC(str);
            } else {
                zzt.zzo().zzh().zzC(str);
            }
        }
        zzp(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzp(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = 1;
        if (true != z10) {
            i11 = 2;
        }
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    public final int zzk(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    public final void zzl(Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbe)).booleanValue() && zzt.zzo().zzh().zzm() == null && !activity.isInMultiWindowMode()) {
            zzp(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzx(this, activity));
        }
    }
}
