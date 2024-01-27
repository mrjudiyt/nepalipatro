package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* compiled from: CallbackWithHandler */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f2406a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2407b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* compiled from: CallbackWithHandler */
    class C0036a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.c f2408h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Typeface f2409i;

        C0036a(g.c cVar, Typeface typeface) {
            this.f2408h = cVar;
            this.f2409i = typeface;
        }

        public void run() {
            this.f2408h.b(this.f2409i);
        }
    }

    /* compiled from: CallbackWithHandler */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.c f2411h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f2412i;

        b(g.c cVar, int i10) {
            this.f2411h = cVar;
            this.f2412i = i10;
        }

        public void run() {
            this.f2411h.a(this.f2412i);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2406a = cVar;
        this.f2407b = handler;
    }

    private void a(int i10) {
        this.f2407b.post(new b(this.f2406a, i10));
    }

    private void c(Typeface typeface) {
        this.f2407b.post(new C0036a(this.f2406a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2436a);
        } else {
            a(eVar.f2437b);
        }
    }
}
