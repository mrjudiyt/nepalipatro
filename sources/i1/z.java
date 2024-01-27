package i1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14 */
class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f9223a;

    /* compiled from: ViewOverlayApi14 */
    static class a extends ViewGroup {

        /* renamed from: m  reason: collision with root package name */
        static Method f9224m;

        /* renamed from: h  reason: collision with root package name */
        ViewGroup f9225h;

        /* renamed from: i  reason: collision with root package name */
        View f9226i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<Drawable> f9227j = null;

        /* renamed from: k  reason: collision with root package name */
        z f9228k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f9229l;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f9224m = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f9225h = viewGroup;
            this.f9226i = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f9228k = zVar;
        }

        private void c() {
            if (this.f9229l) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f9227j;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f9229l = true;
                    this.f9225h.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f9225h.getLocationOnScreen(iArr2);
            this.f9226i.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f9227j == null) {
                this.f9227j = new ArrayList<>();
            }
            if (!this.f9227j.contains(drawable)) {
                this.f9227j.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f9225h || viewGroup.getParent() == null || !androidx.core.view.z.E(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f9225h.getLocationOnScreen(iArr2);
                    androidx.core.view.z.I(view, iArr[0] - iArr2[0]);
                    androidx.core.view.z.J(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f9225h.getLocationOnScreen(iArr);
            this.f9226i.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f9226i.getWidth(), this.f9226i.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f9227j;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f9227j.get(i10).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f9227j;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f9225h == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f9225h != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f9227j;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f9227j
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i1.z.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    z(Context context, ViewGroup viewGroup, View view) {
        this.f9223a = new a(context, viewGroup, view, this);
    }

    static z e(View view) {
        ViewGroup f10 = f(view);
        if (f10 == null) {
            return null;
        }
        int childCount = f10.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f10.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f9228k;
            }
        }
        return new u(f10.getContext(), f10, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public void a(Drawable drawable) {
        this.f9223a.a(drawable);
    }

    public void b(Drawable drawable) {
        this.f9223a.f(drawable);
    }
}
