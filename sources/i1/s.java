package i1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f9209a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f9210b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f9211c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f9210b == sVar.f9210b && this.f9209a.equals(sVar.f9209a);
    }

    public int hashCode() {
        return (this.f9210b.hashCode() * 31) + this.f9209a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9210b + "\n") + "    values:";
        for (String next : this.f9209a.keySet()) {
            str = str + "    " + next + ": " + this.f9209a.get(next) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f9210b = view;
    }
}
