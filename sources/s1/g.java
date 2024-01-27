package s1;

import android.content.Context;
import android.os.Build;
import androidx.work.n;
import r1.b;
import v1.p;
import x1.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super(t1.g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f12264j.b() == n.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f12264j.b() == n.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        return !bVar.a() || bVar.b();
    }
}
