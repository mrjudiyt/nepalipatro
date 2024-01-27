package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable */
class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1007a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1007a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1007a;
        if (actionBarContainer.f823o) {
            Drawable drawable = actionBarContainer.f822n;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f820l;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1007a;
        Drawable drawable3 = actionBarContainer2.f821m;
        if (drawable3 != null && actionBarContainer2.f824p) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1007a;
        if (actionBarContainer.f823o) {
            Drawable drawable = actionBarContainer.f822n;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f820l;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
