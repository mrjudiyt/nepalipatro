package y3;

import a4.d;
import android.content.Context;
import android.os.Build;
import c4.a;
import z3.e;
import z3.g;
import z3.y;

/* compiled from: SchedulingModule */
public abstract class h {
    static y a(Context context, d dVar, g gVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, dVar, gVar);
        }
        return new z3.a(context, dVar, aVar, gVar);
    }
}
