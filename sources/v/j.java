package v;

import s.d;
import v.e;

/* compiled from: Optimizer */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f12219a = new boolean[3];

    static void a(f fVar, d dVar, e eVar) {
        eVar.f12181t = -1;
        eVar.f12183u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f12129g;
            int U = fVar.U() - eVar.Q.f12129g;
            d dVar2 = eVar.O;
            dVar2.f12131i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f12131i = dVar.q(dVar3);
            dVar.f(eVar.O.f12131i, i10);
            dVar.f(eVar.Q.f12131i, U);
            eVar.f12181t = 2;
            eVar.L0(i10, U);
        }
        if (fVar.Z[1] != bVar2 && eVar.Z[1] == e.b.MATCH_PARENT) {
            int i11 = eVar.P.f12129g;
            int v10 = fVar.v() - eVar.R.f12129g;
            d dVar4 = eVar.P;
            dVar4.f12131i = dVar.q(dVar4);
            d dVar5 = eVar.R;
            dVar5.f12131i = dVar.q(dVar5);
            dVar.f(eVar.P.f12131i, i11);
            dVar.f(eVar.R.f12131i, v10);
            if (eVar.f12166l0 > 0 || eVar.T() == 8) {
                d dVar6 = eVar.S;
                dVar6.f12131i = dVar.q(dVar6);
                dVar.f(eVar.S.f12131i, eVar.f12166l0 + i11);
            }
            eVar.f12183u = 2;
            eVar.c1(i11, v10);
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
