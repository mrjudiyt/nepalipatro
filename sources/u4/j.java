package u4;

import a6.c;
import a6.y;
import android.util.SparseArray;
import com.google.common.collect.x;
import e4.j;
import java.util.ArrayList;
import java.util.List;
import u4.i0;

/* compiled from: DefaultTsPayloadReaderFactory */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f11881a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e4.j> f11882b;

    public j(int i10) {
        this(i10, x.s());
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<e4.j> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f11882b;
        }
        y yVar = new y(bVar.f11875d);
        List<e4.j> list = this.f11882b;
        while (yVar.a() > 0) {
            int C = yVar.C();
            int e10 = yVar.e() + yVar.C();
            if (C == 134) {
                list = new ArrayList<>();
                int C2 = yVar.C() & 31;
                for (int i11 = 0; i11 < C2; i11++) {
                    String z10 = yVar.z(3);
                    int C3 = yVar.C();
                    boolean z11 = true;
                    boolean z12 = (C3 & 128) != 0;
                    if (z12) {
                        i10 = C3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte C4 = (byte) yVar.C();
                    yVar.P(1);
                    List<byte[]> list2 = null;
                    if (z12) {
                        if ((C4 & 64) == 0) {
                            z11 = false;
                        }
                        list2 = c.b(z11);
                    }
                    list.add(new j.b().e0(str).V(z10).F(i10).T(list2).E());
                }
            }
            yVar.O(e10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f11881a) != 0;
    }

    public i0 a(int i10, i0.b bVar) {
        if (i10 == 2) {
            return new w(new n(d(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new w(new t(bVar.f11873b));
        }
        if (i10 == 21) {
            return new w(new r());
        }
        if (i10 != 27) {
            if (i10 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i10 == 89) {
                return new w(new l(bVar.f11874c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new f(bVar.f11873b));
                }
                if (i10 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i10 != 129) {
                    if (i10 != 130) {
                        if (i10 != 134) {
                            if (i10 != 135) {
                                switch (i10) {
                                    case 15:
                                        if (f(2)) {
                                            return null;
                                        }
                                        return new w(new i(false, bVar.f11873b));
                                    case 16:
                                        return new w(new o(d(bVar)));
                                    case 17:
                                        if (f(2)) {
                                            return null;
                                        }
                                        return new w(new s(bVar.f11873b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (f(16)) {
                            return null;
                        } else {
                            return new c0(new v("application/x-scte35"));
                        }
                    } else if (!f(64)) {
                        return null;
                    }
                }
                return new w(new c(bVar.f11873b));
            }
            return new w(new k(bVar.f11873b));
        } else if (f(4)) {
            return null;
        } else {
            return new w(new p(c(bVar), f(1), f(8)));
        }
    }

    public SparseArray<i0> b() {
        return new SparseArray<>();
    }

    public j(int i10, List<e4.j> list) {
        this.f11881a = i10;
        this.f11882b = list;
    }
}
