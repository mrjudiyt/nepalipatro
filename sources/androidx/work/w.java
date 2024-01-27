package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import o1.i;

@SuppressLint({"AddedAbstractMethod"})
/* compiled from: WorkManager */
public abstract class w {
    protected w() {
    }

    public static w f(Context context) {
        return i.m(context);
    }

    public static void g(Context context, b bVar) {
        i.g(context, bVar);
    }

    public abstract p a(String str);

    public final p b(x xVar) {
        return c(Collections.singletonList(xVar));
    }

    public abstract p c(List<? extends x> list);

    public p d(String str, f fVar, o oVar) {
        return e(str, fVar, Collections.singletonList(oVar));
    }

    public abstract p e(String str, f fVar, List<o> list);
}
