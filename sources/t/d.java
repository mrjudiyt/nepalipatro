package t;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private a f11492a;

    /* renamed from: b  reason: collision with root package name */
    private String f11493b;

    /* renamed from: c  reason: collision with root package name */
    private int f11494c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f11495d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f11496e = 0;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<b> f11497f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator */
    static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* compiled from: KeyCycleOscillator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f11498a;

        /* renamed from: b  reason: collision with root package name */
        float f11499b;
    }

    public float a(float f10) {
        return (float) this.f11492a.a(f10);
    }

    public String toString() {
        String str = this.f11493b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f11497f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.f11498a + " , " + decimalFormat.format((double) next.f11499b) + "] ";
        }
        return str;
    }
}
