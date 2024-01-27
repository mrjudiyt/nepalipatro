package x2;

import a3.k;
import android.graphics.drawable.Drawable;
import w2.d;

/* compiled from: CustomTarget */
public abstract class a<T> implements d<T> {

    /* renamed from: h  reason: collision with root package name */
    private final int f12766h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12767i;

    /* renamed from: j  reason: collision with root package name */
    private d f12768j;

    public a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void a(c cVar) {
        cVar.e(this.f12766h, this.f12767i);
    }

    public final void c(d dVar) {
        this.f12768j = dVar;
    }

    public void f(Drawable drawable) {
    }

    public final void g(c cVar) {
    }

    public void h(Drawable drawable) {
    }

    public final d i() {
        return this.f12768j;
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public a(int i10, int i11) {
        if (k.s(i10, i11)) {
            this.f12766h = i10;
            this.f12767i = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
