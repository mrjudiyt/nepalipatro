package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import y.e;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2461c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f2462a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f2463b;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0038a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f2464a;

        C0038a(a aVar) {
            this.f2464a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2464a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b10 = this.f2464a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2464a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c g02 = c.g0(accessibilityNodeInfo);
            g02.c0(z.G(view));
            g02.a0(z.D(view));
            g02.b0(z.l(view));
            g02.e0(z.x(view));
            this.f2464a.g(view, g02);
            g02.d(accessibilityNodeInfo.getText(), view);
            List<c.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                g02.b(c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2464a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2464a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2464a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f2464a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2464a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat */
    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f2461c);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(e.W);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] o10 = c.o(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (o10 != null && i10 < o10.length) {
                if (clickableSpan.equals(o10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(e.X);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2462a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider a10;
        if (Build.VERSION.SDK_INT < 16 || (a10 = b.a(this.f2462a, view)) == null) {
            return null;
        }
        return new d(a10);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f2463b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2462a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c cVar) {
        this.f2462a.onInitializeAccessibilityNodeInfo(view, cVar.f0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2462a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2462a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<c.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            c.a aVar = c10.get(i11);
            if (aVar.a() == i10) {
                z10 = aVar.c(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 16) {
            z10 = b.b(this.f2462a, view, i10, bundle);
        }
        return (z10 || i10 != e.f12862a || bundle == null) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f2462a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2462a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2462a = accessibilityDelegate;
        this.f2463b = new C0038a(this);
    }
}
