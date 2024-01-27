package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.x;
import androidx.core.widget.l;

public class AppCompatImageView extends ImageView implements x, l {

    /* renamed from: h  reason: collision with root package name */
    private final e f875h;

    /* renamed from: i  reason: collision with root package name */
    private final m f876i;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f875h;
        if (eVar != null) {
            eVar.b();
        }
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f875h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f875h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        m mVar = this.f876i;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        m mVar = this.f876i;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f876i.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f875h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f875h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setImageResource(int i10) {
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.g(i10);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f875h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f875h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f876i;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f875h = eVar;
        eVar.e(attributeSet, i10);
        m mVar = new m(this);
        this.f876i = mVar;
        mVar.f(attributeSet, i10);
    }
}
