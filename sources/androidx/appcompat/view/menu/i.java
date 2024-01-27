package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.d;
import androidx.core.view.z;

/* compiled from: MenuPopupHelper */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f783a;

    /* renamed from: b  reason: collision with root package name */
    private final e f784b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f785c;

    /* renamed from: d  reason: collision with root package name */
    private final int f786d;

    /* renamed from: e  reason: collision with root package name */
    private final int f787e;

    /* renamed from: f  reason: collision with root package name */
    private View f788f;

    /* renamed from: g  reason: collision with root package name */
    private int f789g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f790h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f791i;

    /* renamed from: j  reason: collision with root package name */
    private h f792j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f793k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f794l;

    /* compiled from: MenuPopupHelper */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.h a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f783a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f783a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = f.d.f8221c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f783a
            android.view.View r3 = r14.f788f
            int r4 = r14.f786d
            int r5 = r14.f787e
            boolean r6 = r14.f785c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f783a
            androidx.appcompat.view.menu.e r9 = r14.f784b
            android.view.View r10 = r14.f788f
            int r11 = r14.f786d
            int r12 = r14.f787e
            boolean r13 = r14.f785c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.e r1 = r14.f784b
            r0.k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f794l
            r0.t(r1)
            android.view.View r1 = r14.f788f
            r0.o(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f791i
            r0.g(r1)
            boolean r1 = r14.f790h
            r0.q(r1)
            int r1 = r14.f789g
            r0.r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():androidx.appcompat.view.menu.h");
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.u(z11);
        if (z10) {
            if ((d.a(this.f789g, z.t(this.f788f)) & 7) == 5) {
                i10 -= this.f788f.getWidth();
            }
            c10.s(i10);
            c10.v(i11);
            int i12 = (int) ((this.f783a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public void b() {
        if (d()) {
            this.f792j.dismiss();
        }
    }

    public h c() {
        if (this.f792j == null) {
            this.f792j = a();
        }
        return this.f792j;
    }

    public boolean d() {
        h hVar = this.f792j;
        return hVar != null && hVar.a();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f792j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f793k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f788f = view;
    }

    public void g(boolean z10) {
        this.f790h = z10;
        h hVar = this.f792j;
        if (hVar != null) {
            hVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f789g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f793k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f791i = aVar;
        h hVar = this.f792j;
        if (hVar != null) {
            hVar.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f788f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f788f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f789g = 8388611;
        this.f794l = new a();
        this.f783a = context;
        this.f784b = eVar;
        this.f788f = view;
        this.f785c = z10;
        this.f786d = i10;
        this.f787e = i11;
    }
}
