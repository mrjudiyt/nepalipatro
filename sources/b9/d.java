package b9;

import com.google.firebase.messaging.Constants;
import d9.f;
import kotlin.jvm.internal.m;

/* compiled from: Random.kt */
public final class d {
    public static final String a(Object obj, Object obj2) {
        m.f(obj, Constants.MessagePayloadKeys.FROM);
        m.f(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void c(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int e(c cVar, f fVar) {
        m.f(cVar, "<this>");
        m.f(fVar, "range");
        if (fVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + fVar);
        } else if (fVar.b() < Integer.MAX_VALUE) {
            return cVar.e(fVar.a(), fVar.b() + 1);
        } else {
            if (fVar.a() > Integer.MIN_VALUE) {
                return cVar.e(fVar.a() - 1, fVar.b()) + 1;
            }
            return cVar.c();
        }
    }

    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
