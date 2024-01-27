package h9;

import kotlin.jvm.internal.m;

/* compiled from: DurationUnitJvm.kt */
class e {
    public static final long a(long j10, d dVar, d dVar2) {
        m.f(dVar, "sourceUnit");
        m.f(dVar2, "targetUnit");
        return dVar2.d().convert(j10, dVar.d());
    }

    public static final long b(long j10, d dVar, d dVar2) {
        m.f(dVar, "sourceUnit");
        m.f(dVar2, "targetUnit");
        return dVar2.d().convert(j10, dVar.d());
    }
}
