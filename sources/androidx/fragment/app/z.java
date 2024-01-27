package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.f;
import androidx.core.view.c0;
import androidx.core.view.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* compiled from: FragmentTransitionImpl */
public abstract class z {

    /* compiled from: FragmentTransitionImpl */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f3393h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f3394i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f3395j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f3396k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ArrayList f3397l;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3393h = i10;
            this.f3394i = arrayList;
            this.f3395j = arrayList2;
            this.f3396k = arrayList3;
            this.f3397l = arrayList4;
        }

        public void run() {
            for (int i10 = 0; i10 < this.f3393h; i10++) {
                androidx.core.view.z.e0((View) this.f3394i.get(i10), (String) this.f3395j.get(i10));
                androidx.core.view.z.e0((View) this.f3396k.get(i10), (String) this.f3397l.get(i10));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f3399h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Map f3400i;

        b(ArrayList arrayList, Map map) {
            this.f3399h = arrayList;
            this.f3400i = map;
        }

        public void run() {
            int size = this.f3399h.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3399h.get(i10);
                String y10 = androidx.core.view.z.y(view);
                if (y10 != null) {
                    androidx.core.view.z.e0(view, z.i(this.f3400i, y10));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f3402h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Map f3403i;

        c(ArrayList arrayList, Map map) {
            this.f3402h = arrayList;
            this.f3403i = map;
        }

        public void run() {
            int size = this.f3402h.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3402h.get(i10);
                androidx.core.view.z.e0(view, (String) this.f3403i.get(androidx.core.view.z.y(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            if (androidx.core.view.z.y(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!h(list, childAt, size) && androidx.core.view.z.y(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (c0.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                f(arrayList, viewGroup.getChildAt(i10));
            }
            return;
        }
        arrayList.add(view);
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String y10 = androidx.core.view.z.y(view);
            if (y10 != null) {
                map.put(y10, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (androidx.core.view.z.E(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(androidx.core.view.z.y(view));
            androidx.core.view.z.e0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        v.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, f fVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        v.a(view, new b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String y10 = androidx.core.view.z.y(view2);
            arrayList4.add(y10);
            if (y10 != null) {
                androidx.core.view.z.e0(view2, (String) null);
                String str = map.get(y10);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        androidx.core.view.z.e0(arrayList2.get(i11), y10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        v.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
