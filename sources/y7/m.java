package y7;

import java.net.Proxy;
import v7.q;
import v7.v;

/* compiled from: RequestLine */
public final class m {
    static String a(v vVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.l());
        sb.append(' ');
        if (b(vVar, type)) {
            sb.append(vVar.j());
        } else {
            sb.append(c(vVar.j()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(v vVar, Proxy.Type type) {
        return !vVar.k() && type == Proxy.Type.HTTP;
    }

    public static String c(q qVar) {
        String m10 = qVar.m();
        String o10 = qVar.o();
        if (o10 == null) {
            return m10;
        }
        return m10 + '?' + o10;
    }
}
