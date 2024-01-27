package e5;

import com.google.android.exoplayer2.k0;
import e4.j;
import x4.a;

/* compiled from: SpliceCommand */
public abstract class b implements a.b {
    public /* synthetic */ byte[] W() {
        return x4.b.a(this);
    }

    public /* synthetic */ void a(k0.b bVar) {
        x4.b.c(this, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }
}
