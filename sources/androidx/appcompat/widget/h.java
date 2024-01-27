package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* compiled from: AppCompatCompoundButtonHelper */
class h {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1088a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1089b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1090c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1091d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1092e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1093f;

    h(CompoundButton compoundButton) {
        this.f1088a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = c.a(this.f1088a);
        if (a10 == null) {
            return;
        }
        if (this.f1091d || this.f1092e) {
            Drawable mutate = a.q(a10).mutate();
            if (this.f1091d) {
                a.n(mutate, this.f1089b);
            }
            if (this.f1092e) {
                a.o(mutate, this.f1090c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1088a.getDrawableState());
            }
            this.f1088a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.c.a(r2.f1088a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1088a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.b(int):int");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1089b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1090c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1088a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.R0
            r8 = 0
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1088a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.z.Q(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.j.T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1088a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = h.a.d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = f.j.S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1088a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = h.a.d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = f.j.U0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1088a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = f.j.V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1088a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.c0.e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.v()
            return
        L_0x0084:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f1093f) {
            this.f1093f = false;
            return;
        }
        this.f1093f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1089b = colorStateList;
        this.f1091d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1090c = mode;
        this.f1092e = true;
        a();
    }
}
