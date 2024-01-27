package g9;

import d9.f;
import f9.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import o8.k;
import y8.p;

/* compiled from: Strings.kt */
final class e implements c<f> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f14765a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f14766b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f14767c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, k<Integer, Integer>> f14768d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<f>, z8.a {

        /* renamed from: h  reason: collision with root package name */
        private int f14769h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f14770i;

        /* renamed from: j  reason: collision with root package name */
        private int f14771j;

        /* renamed from: k  reason: collision with root package name */
        private f f14772k;

        /* renamed from: l  reason: collision with root package name */
        private int f14773l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f14774m;

        a(e eVar) {
            this.f14774m = eVar;
            int e10 = l.e(eVar.f14766b, 0, eVar.f14765a.length());
            this.f14770i = e10;
            this.f14771j = e10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < g9.e.c(r6.f14774m)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f14771j
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f14769h = r1
                r0 = 0
                r6.f14772k = r0
                goto L_0x009e
            L_0x000c:
                g9.e r0 = r6.f14774m
                int r0 = r0.f14767c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f14773l
                int r0 = r0 + r3
                r6.f14773l = r0
                g9.e r4 = r6.f14774m
                int r4 = r4.f14767c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f14771j
                g9.e r4 = r6.f14774m
                java.lang.CharSequence r4 = r4.f14765a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                d9.f r0 = new d9.f
                int r1 = r6.f14770i
                g9.e r4 = r6.f14774m
                java.lang.CharSequence r4 = r4.f14765a
                int r4 = g9.q.B(r4)
                r0.<init>(r1, r4)
                r6.f14772k = r0
                r6.f14771j = r2
                goto L_0x009c
            L_0x0047:
                g9.e r0 = r6.f14774m
                y8.p r0 = r0.f14768d
                g9.e r4 = r6.f14774m
                java.lang.CharSequence r4 = r4.f14765a
                int r5 = r6.f14771j
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                o8.k r0 = (o8.k) r0
                if (r0 != 0) goto L_0x0077
                d9.f r0 = new d9.f
                int r1 = r6.f14770i
                g9.e r4 = r6.f14774m
                java.lang.CharSequence r4 = r4.f14765a
                int r4 = g9.q.B(r4)
                r0.<init>(r1, r4)
                r6.f14772k = r0
                r6.f14771j = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f14770i
                d9.f r4 = d9.l.i(r4, r2)
                r6.f14772k = r4
                int r2 = r2 + r0
                r6.f14770i = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f14771j = r2
            L_0x009c:
                r6.f14769h = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.e.a.b():void");
        }

        /* renamed from: c */
        public f next() {
            if (this.f14769h == -1) {
                b();
            }
            if (this.f14769h != 0) {
                f fVar = this.f14772k;
                m.d(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f14772k = null;
                this.f14769h = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f14769h == -1) {
                b();
            }
            return this.f14769h == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, k<Integer, Integer>> pVar) {
        m.f(charSequence, "input");
        m.f(pVar, "getNextMatch");
        this.f14765a = charSequence;
        this.f14766b = i10;
        this.f14767c = i11;
        this.f14768d = pVar;
    }

    public Iterator<f> iterator() {
        return new a(this);
    }
}
