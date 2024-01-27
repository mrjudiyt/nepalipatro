package i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f9196a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>>> f9197b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f9198c = new ArrayList<>();

    /* compiled from: TransitionManager */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: h  reason: collision with root package name */
        m f9199h;

        /* renamed from: i  reason: collision with root package name */
        ViewGroup f9200i;

        /* renamed from: i1.o$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0152a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f9201a;

            C0152a(androidx.collection.a aVar) {
                this.f9201a = aVar;
            }

            public void b(m mVar) {
                ((ArrayList) this.f9201a.get(a.this.f9200i)).remove(mVar);
                mVar.R(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f9199h = mVar;
            this.f9200i = viewGroup;
        }

        private void a() {
            this.f9200i.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9200i.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f9198c.remove(this.f9200i)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<m>> b10 = o.b();
            ArrayList arrayList = b10.get(this.f9200i);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f9200i, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f9199h);
            this.f9199h.a(new C0152a(b10));
            this.f9199h.m(this.f9200i, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).T(this.f9200i);
                }
            }
            this.f9199h.Q(this.f9200i);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.f9198c.remove(this.f9200i);
            ArrayList arrayList = o.b().get(this.f9200i);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).T(this.f9200i);
                }
            }
            this.f9199h.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f9198c.contains(viewGroup) && z.F(viewGroup)) {
            f9198c.add(viewGroup);
            if (mVar == null) {
                mVar = f9196a;
            }
            m o10 = mVar.clone();
            d(viewGroup, o10);
            l.c(viewGroup, (l) null);
            c(viewGroup, o10);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<m>> b() {
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference weakReference = f9197b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar2 = new androidx.collection.a<>();
        f9197b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).P(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.m(viewGroup, true);
        }
        l b10 = l.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
