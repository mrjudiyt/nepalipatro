package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.c;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class i extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f4310d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.core.view.a f4311e = new a(this);

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final i f4312d;

        public a(i iVar) {
            this.f4312d = iVar;
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            if (!this.f4312d.n() && this.f4312d.f4310d.getLayoutManager() != null) {
                this.f4312d.f4310d.getLayoutManager().d0(view, cVar);
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (this.f4312d.n() || this.f4312d.f4310d.getLayoutManager() == null) {
                return false;
            }
            return this.f4312d.f4310d.getLayoutManager().u0(view, i10, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f4310d = recyclerView;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !n()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    public void g(View view, c cVar) {
        super.g(view, cVar);
        cVar.X(RecyclerView.class.getName());
        if (!n() && this.f4310d.getLayoutManager() != null) {
            this.f4310d.getLayoutManager().b0(cVar);
        }
    }

    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (n() || this.f4310d.getLayoutManager() == null) {
            return false;
        }
        return this.f4310d.getLayoutManager().s0(i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f4310d.L();
    }
}
