package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdpw extends FrameLayout {
    private final zzau zza;

    public zzdpw(Context context, View view, zzau zzau) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzau;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zzm(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && (childAt instanceof zzcgb)) {
                arrayList.add((zzcgb) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((zzcgb) arrayList.get(i11)).destroy();
        }
    }
}
