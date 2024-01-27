package s3;

import android.annotation.SuppressLint;
import q3.d;
import q3.f;
import w3.a;

/* compiled from: ForcedSender */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(f<?> fVar, d dVar) {
        if (fVar instanceof s) {
            u.c().e().u(((s) fVar).d().f(dVar), 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
    }
}
