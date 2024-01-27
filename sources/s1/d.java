package s1;

import android.content.Context;
import android.os.Build;
import androidx.work.n;
import r1.b;
import t1.g;
import v1.p;
import x1.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f12264j.b() == n.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return !bVar.a();
        }
        if (!bVar.a() || !bVar.d()) {
            return true;
        }
        return false;
    }
}
