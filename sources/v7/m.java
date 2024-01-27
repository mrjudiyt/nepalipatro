package v7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* compiled from: Dns */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f16862a = new a();

    /* compiled from: Dns */
    static class a implements m {
        a() {
        }

        public List<InetAddress> a(String str) {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List<InetAddress> a(String str);
}
