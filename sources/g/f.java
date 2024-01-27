package g;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e;
import l.b;

/* compiled from: AppCompatDialog */
public class f extends Dialog implements c {

    /* renamed from: h  reason: collision with root package name */
    private d f8608h;

    /* renamed from: i  reason: collision with root package name */
    private final e.a f8609i = new a();

    /* compiled from: AppCompatDialog */
    class a implements e.a {
        a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.f(keyEvent);
        }
    }

    public f(Context context, int i10) {
        super(context, e(context, i10));
        d b10 = b();
        b10.D(e(context, i10));
        b10.q((Bundle) null);
    }

    private static int e(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f8208y, typedValue, true);
        return typedValue.resourceId;
    }

    public void a(b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().d(view, layoutParams);
    }

    public d b() {
        if (this.f8608h == null) {
            this.f8608h = d.h(this, this);
        }
        return this.f8608h;
    }

    public b c(b.a aVar) {
        return null;
    }

    public void d(b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        b().r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.e(this.f8609i, getWindow().getDecorView(), this, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i10) {
        return b().i(i10);
    }

    public boolean g(int i10) {
        return b().z(i10);
    }

    public void invalidateOptionsMenu() {
        b().o();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        b().n();
        super.onCreate(bundle);
        b().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        b().w();
    }

    public void setContentView(int i10) {
        b().A(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().E(charSequence);
    }

    public void setContentView(View view) {
        b().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().C(view, layoutParams);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        b().E(getContext().getString(i10));
    }
}
