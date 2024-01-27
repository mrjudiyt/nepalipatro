package a6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile */
public class c0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f150h = a0.f145h;

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f151i = b0.f147h;

    /* renamed from: a  reason: collision with root package name */
    private final int f152a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f153b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f154c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f155d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f156e;

    /* renamed from: f  reason: collision with root package name */
    private int f157f;

    /* renamed from: g  reason: collision with root package name */
    private int f158g;

    /* compiled from: SlidingPercentile */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f159a;

        /* renamed from: b  reason: collision with root package name */
        public int f160b;

        /* renamed from: c  reason: collision with root package name */
        public float f161c;

        private b() {
        }
    }

    public c0(int i10) {
        this.f152a = i10;
    }

    private void d() {
        if (this.f155d != 1) {
            Collections.sort(this.f153b, f150h);
            this.f155d = 1;
        }
    }

    private void e() {
        if (this.f155d != 0) {
            Collections.sort(this.f153b, f151i);
            this.f155d = 0;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f159a - bVar2.f159a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f158g;
        if (i11 > 0) {
            b[] bVarArr = this.f154c;
            int i12 = i11 - 1;
            this.f158g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f156e;
        this.f156e = i13 + 1;
        bVar.f159a = i13;
        bVar.f160b = i10;
        bVar.f161c = f10;
        this.f153b.add(bVar);
        this.f157f += i10;
        while (true) {
            int i14 = this.f157f;
            int i15 = this.f152a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f153b.get(0);
                int i17 = bVar2.f160b;
                if (i17 <= i16) {
                    this.f157f -= i17;
                    this.f153b.remove(0);
                    int i18 = this.f158g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f154c;
                        this.f158g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f160b = i17 - i16;
                    this.f157f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f157f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f153b.size(); i11++) {
            b bVar = this.f153b.get(i11);
            i10 += bVar.f160b;
            if (((float) i10) >= f11) {
                return bVar.f161c;
            }
        }
        if (this.f153b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f153b;
        return arrayList.get(arrayList.size() - 1).f161c;
    }

    public void i() {
        this.f153b.clear();
        this.f155d = -1;
        this.f156e = 0;
        this.f157f = 0;
    }
}
