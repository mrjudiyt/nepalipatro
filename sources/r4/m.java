package r4;

import a6.y;
import com.google.android.exoplayer2.ParserException;
import d5.c;
import java.util.ArrayList;
import java.util.List;
import k4.j;
import k4.x;
import l6.s;
import x4.a;

/* compiled from: SefReader */
final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final s f11131d = s.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final s f11132e = s.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f11133a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f11134b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f11135c;

    /* compiled from: SefReader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11136a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11137b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11138c;

        public a(int i10, long j10, int i11) {
            this.f11136a = i10;
            this.f11137b = j10;
            this.f11138c = i11;
        }
    }

    private void a(j jVar, x xVar) {
        y yVar = new y(8);
        jVar.readFully(yVar.d(), 0, 8);
        this.f11135c = yVar.p() + 8;
        if (yVar.m() != 1397048916) {
            xVar.f9627a = 0;
            return;
        }
        xVar.f9627a = jVar.getPosition() - ((long) (this.f11135c - 12));
        this.f11134b = 2;
    }

    private static int b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", (Throwable) null);
        }
    }

    private void d(j jVar, x xVar) {
        long a10 = jVar.a();
        int i10 = (this.f11135c - 12) - 8;
        y yVar = new y(i10);
        jVar.readFully(yVar.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            yVar.P(2);
            short r10 = yVar.r();
            if (r10 == 2192 || r10 == 2816 || r10 == 2817 || r10 == 2819 || r10 == 2820) {
                this.f11133a.add(new a(r10, (a10 - ((long) this.f11135c)) - ((long) yVar.p()), yVar.p()));
            } else {
                yVar.P(8);
            }
        }
        if (this.f11133a.isEmpty()) {
            xVar.f9627a = 0;
            return;
        }
        this.f11134b = 3;
        xVar.f9627a = this.f11133a.get(0).f11137b;
    }

    private void e(j jVar, List<a.b> list) {
        long position = jVar.getPosition();
        int a10 = (int) ((jVar.a() - jVar.getPosition()) - ((long) this.f11135c));
        y yVar = new y(a10);
        jVar.readFully(yVar.d(), 0, a10);
        for (int i10 = 0; i10 < this.f11133a.size(); i10++) {
            a aVar = this.f11133a.get(i10);
            yVar.O((int) (aVar.f11137b - position));
            yVar.P(4);
            int p10 = yVar.p();
            int b10 = b(yVar.z(p10));
            int i11 = aVar.f11138c - (p10 + 8);
            if (b10 == 2192) {
                list.add(f(yVar, i11));
            } else if (!(b10 == 2816 || b10 == 2817 || b10 == 2819 || b10 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private static c f(y yVar, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f11132e.f(yVar.z(i10));
        int i11 = 0;
        while (i11 < f10.size()) {
            List<String> f11 = f11131d.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                    i11++;
                } catch (NumberFormatException e10) {
                    throw ParserException.a((String) null, e10);
                }
            } else {
                throw ParserException.a((String) null, (Throwable) null);
            }
        }
        return new c(arrayList);
    }

    public int c(j jVar, x xVar, List<a.b> list) {
        int i10 = this.f11134b;
        long j10 = 0;
        if (i10 == 0) {
            long a10 = jVar.a();
            if (a10 != -1 && a10 >= 8) {
                j10 = a10 - 8;
            }
            xVar.f9627a = j10;
            this.f11134b = 1;
        } else if (i10 == 1) {
            a(jVar, xVar);
        } else if (i10 == 2) {
            d(jVar, xVar);
        } else if (i10 == 3) {
            e(jVar, list);
            xVar.f9627a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f11133a.clear();
        this.f11134b = 0;
    }
}
