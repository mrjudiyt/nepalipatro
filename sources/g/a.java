package g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import f.j;
import l.b;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract void l(Configuration configuration);

    /* access modifiers changed from: package-private */
    public void m() {
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z10);

    public abstract void r(boolean z10);

    public abstract void s(CharSequence charSequence);

    public abstract l.b t(b.a aVar);

    /* renamed from: g.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0133a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f8532a;

        public C0133a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8532a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8414t);
            this.f8532a = obtainStyledAttributes.getInt(j.f8419u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0133a(int i10, int i11) {
            super(i10, i11);
            this.f8532a = 0;
            this.f8532a = 8388627;
        }

        public C0133a(C0133a aVar) {
            super(aVar);
            this.f8532a = 0;
            this.f8532a = aVar.f8532a;
        }

        public C0133a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8532a = 0;
        }
    }
}
