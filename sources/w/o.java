package w;

import com.facebook.internal.AnalyticsEvents;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.d;
import v.b;
import v.e;
import v.f;

/* compiled from: WidgetGroup */
public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f12546g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<e> f12547a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f12548b = -1;

    /* renamed from: c  reason: collision with root package name */
    boolean f12549c = false;

    /* renamed from: d  reason: collision with root package name */
    int f12550d = 0;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f12551e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f12552f = -1;

    /* compiled from: WidgetGroup */
    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<e> f12553a;

        /* renamed from: b  reason: collision with root package name */
        int f12554b;

        /* renamed from: c  reason: collision with root package name */
        int f12555c;

        /* renamed from: d  reason: collision with root package name */
        int f12556d;

        /* renamed from: e  reason: collision with root package name */
        int f12557e;

        /* renamed from: f  reason: collision with root package name */
        int f12558f;

        /* renamed from: g  reason: collision with root package name */
        int f12559g;

        public a(e eVar, d dVar, int i10) {
            this.f12553a = new WeakReference<>(eVar);
            this.f12554b = dVar.x(eVar.O);
            this.f12555c = dVar.x(eVar.P);
            this.f12556d = dVar.x(eVar.Q);
            this.f12557e = dVar.x(eVar.R);
            this.f12558f = dVar.x(eVar.S);
            this.f12559g = i10;
        }
    }

    public o(int i10) {
        int i11 = f12546g;
        f12546g = i11 + 1;
        this.f12548b = i11;
        this.f12550d = i10;
    }

    private String e() {
        int i10 = this.f12550d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    private int j(d dVar, ArrayList<e> arrayList, int i10) {
        int x10;
        int x11;
        f fVar = (f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f12551e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f12551e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.O);
            x11 = dVar.x(fVar.Q);
            dVar.D();
        } else {
            x10 = dVar.x(fVar.P);
            x11 = dVar.x(fVar.R);
            dVar.D();
        }
        return x11 - x10;
    }

    public boolean a(e eVar) {
        if (this.f12547a.contains(eVar)) {
            return false;
        }
        this.f12547a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f12547a.size();
        if (this.f12552f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f12552f == oVar.f12548b) {
                    g(this.f12550d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f12548b;
    }

    public int d() {
        return this.f12550d;
    }

    public int f(d dVar, int i10) {
        if (this.f12547a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f12547a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<e> it = this.f12547a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.I0 = oVar.c();
            } else {
                next.J0 = oVar.c();
            }
        }
        this.f12552f = oVar.f12548b;
    }

    public void h(boolean z10) {
        this.f12549c = z10;
    }

    public void i(int i10) {
        this.f12550d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f12548b + "] <";
        Iterator<e> it = this.f12547a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
