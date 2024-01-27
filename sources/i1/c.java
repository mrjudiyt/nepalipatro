package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z;
import java.util.Map;

/* compiled from: ChangeBounds */
public class c extends m {
    private static final String[] T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> U = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> V = new C0150c(PointF.class, "topLeft");
    private static final Property<k, PointF> W = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> X = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> Y = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> Z = new g(PointF.class, "position");

    /* renamed from: a0  reason: collision with root package name */
    private static k f9081a0 = new k();
    private int[] Q = new int[2];
    private boolean R = false;
    private boolean S = false;

    /* compiled from: ChangeBounds */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f9083b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f9084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f9085d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f9082a = viewGroup;
            this.f9083b = bitmapDrawable;
            this.f9084c = view;
            this.f9085d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            c0.b(this.f9082a).b(this.f9083b);
            c0.g(this.f9084c, this.f9085d);
        }
    }

    /* compiled from: ChangeBounds */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f9087a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f9087a);
            Rect rect = this.f9087a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f9087a);
            this.f9087a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f9087a);
        }
    }

    /* renamed from: i1.c$c  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    class C0150c extends Property<k, PointF> {
        C0150c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f9088a;
        private k mViewBounds;

        h(k kVar) {
            this.f9088a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f9091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f9092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f9093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f9094e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f9095f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f9096g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f9091b = view;
            this.f9092c = rect;
            this.f9093d = i10;
            this.f9094e = i11;
            this.f9095f = i12;
            this.f9096g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9090a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9090a) {
                z.W(this.f9091b, this.f9092c);
                c0.f(this.f9091b, this.f9093d, this.f9094e, this.f9095f, this.f9096g);
            }
        }
    }

    /* compiled from: ChangeBounds */
    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f9098a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9099b;

        j(ViewGroup viewGroup) {
            this.f9099b = viewGroup;
        }

        public void a(m mVar) {
            x.c(this.f9099b, false);
            this.f9098a = true;
        }

        public void b(m mVar) {
            if (!this.f9098a) {
                x.c(this.f9099b, false);
            }
            mVar.R(this);
        }

        public void c(m mVar) {
            x.c(this.f9099b, false);
        }

        public void e(m mVar) {
            x.c(this.f9099b, true);
        }
    }

    /* compiled from: ChangeBounds */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f9101a;

        /* renamed from: b  reason: collision with root package name */
        private int f9102b;

        /* renamed from: c  reason: collision with root package name */
        private int f9103c;

        /* renamed from: d  reason: collision with root package name */
        private int f9104d;

        /* renamed from: e  reason: collision with root package name */
        private View f9105e;

        /* renamed from: f  reason: collision with root package name */
        private int f9106f;

        /* renamed from: g  reason: collision with root package name */
        private int f9107g;

        k(View view) {
            this.f9105e = view;
        }

        private void b() {
            c0.f(this.f9105e, this.f9101a, this.f9102b, this.f9103c, this.f9104d);
            this.f9106f = 0;
            this.f9107g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f9103c = Math.round(pointF.x);
            this.f9104d = Math.round(pointF.y);
            int i10 = this.f9107g + 1;
            this.f9107g = i10;
            if (this.f9106f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f9101a = Math.round(pointF.x);
            this.f9102b = Math.round(pointF.y);
            int i10 = this.f9106f + 1;
            this.f9106f = i10;
            if (i10 == this.f9107g) {
                b();
            }
        }
    }

    private void e0(s sVar) {
        View view = sVar.f9210b;
        if (z.F(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f9209a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f9209a.put("android:changeBounds:parent", sVar.f9210b.getParent());
            if (this.S) {
                sVar.f9210b.getLocationInWindow(this.Q);
                sVar.f9209a.put("android:changeBounds:windowX", Integer.valueOf(this.Q[0]));
                sVar.f9209a.put("android:changeBounds:windowY", Integer.valueOf(this.Q[1]));
            }
            if (this.R) {
                sVar.f9209a.put("android:changeBounds:clip", z.o(view));
            }
        }
    }

    private boolean f0(View view, View view2) {
        if (!this.S) {
            return true;
        }
        s v10 = v(view, true);
        if (v10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == v10.f9210b) {
            return true;
        }
        return false;
    }

    public String[] F() {
        return T;
    }

    public void g(s sVar) {
        e0(sVar);
    }

    public void l(s sVar) {
        e0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator2;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f9209a;
        Map<String, Object> map2 = sVar4.f9209a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f9210b;
        if (f0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f9209a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f9209a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f9209a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f9209a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.R) {
                view = view3;
                c0.f(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        animator = f.a(view, Z, x().a((float) i12, (float) i14, (float) i13, (float) i15));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a10 = f.a(kVar, V, x().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a11 = f.a(kVar, W, x().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a10, a11});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    animator = f.a(view, X, x().a((float) i16, (float) i18, (float) i17, (float) i19));
                } else {
                    animator = f.a(view, Y, x().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
            } else {
                view = view3;
                c0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                if (i12 == i13 && i14 == i15) {
                    objectAnimator = null;
                } else {
                    objectAnimator = f.a(view, Z, x().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
                if (rect7 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i11, i11, i22, i23) : rect6;
                if (!rect.equals(rect8)) {
                    z.W(view, rect);
                    k kVar2 = f9081a0;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = r.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f9209a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f9209a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f9209a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f9209a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.Q);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c10 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        g x10 = x();
        int[] iArr = this.Q;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{i.a(U, x10.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
        return ofPropertyValuesHolder;
    }
}
