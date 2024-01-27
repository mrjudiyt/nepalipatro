package u6;

import java.util.ArrayList;
import r6.f;
import r6.s;
import r6.t;
import y6.c;

/* compiled from: ObjectTypeAdapter */
public final class h extends s<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f16632b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f f16633a;

    /* compiled from: ObjectTypeAdapter */
    static class a implements t {
        a() {
        }

        public <T> s<T> a(f fVar, x6.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16634a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y6.b[] r0 = y6.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16634a = r0
                y6.b r1 = y6.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16634a     // Catch:{ NoSuchFieldError -> 0x001d }
                y6.b r1 = y6.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16634a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y6.b r1 = y6.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16634a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y6.b r1 = y6.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16634a     // Catch:{ NoSuchFieldError -> 0x003e }
                y6.b r1 = y6.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16634a     // Catch:{ NoSuchFieldError -> 0x0049 }
                y6.b r1 = y6.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.h.b.<clinit>():void");
        }
    }

    h(f fVar) {
        this.f16633a = fVar;
    }

    public Object b(y6.a aVar) {
        switch (b.f16634a[aVar.I0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.L()) {
                    arrayList.add(b(aVar));
                }
                aVar.w();
                return arrayList;
            case 2:
                t6.h hVar = new t6.h();
                aVar.h();
                while (aVar.L()) {
                    hVar.put(aVar.o0(), b(aVar));
                }
                aVar.E();
                return hVar;
            case 3:
                return aVar.w0();
            case 4:
                return Double.valueOf(aVar.h0());
            case 5:
                return Boolean.valueOf(aVar.g0());
            case 6:
                aVar.s0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.g0();
            return;
        }
        s<?> k10 = this.f16633a.k(obj.getClass());
        if (k10 instanceof h) {
            cVar.q();
            cVar.E();
            return;
        }
        k10.d(cVar, obj);
    }
}
