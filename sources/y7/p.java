package y7;

import java.net.ProtocolException;
import v7.u;

/* compiled from: StatusLine */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final u f17440a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17441b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17442c;

    public p(u uVar, int i10, String str) {
        this.f17440a = uVar;
        this.f17441b = i10;
        this.f17442c = str;
    }

    public static p a(String str) {
        u uVar;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                uVar = u.HTTP_1_0;
            } else if (charAt == 1) {
                uVar = u.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            uVar = u.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new p(uVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17440a == u.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f17441b);
        if (this.f17442c != null) {
            sb.append(' ');
            sb.append(this.f17442c);
        }
        return sb.toString();
    }
}
