package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.api.Api;
import t0.g;

@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* renamed from: h  reason: collision with root package name */
    private int f3897h;

    /* renamed from: i  reason: collision with root package name */
    private int f3898i;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getMaxHeight() {
        return this.f3898i;
    }

    public int getMaxWidth() {
        return this.f3897h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i11);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i11 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxHeight(int i10) {
        this.f3898i = i10;
        super.setMaxHeight(i10);
    }

    public void setMaxWidth(int i10) {
        this.f3897h = i10;
        super.setMaxWidth(i10);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3897h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3898i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11569y0, i10, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(g.A0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(g.f11571z0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        obtainStyledAttributes.recycle();
    }
}
