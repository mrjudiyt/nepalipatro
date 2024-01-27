package v7;

/* compiled from: TlsVersion */
public enum a0 {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: h  reason: collision with root package name */
    final String f16755h;

    private a0(String str) {
        this.f16755h = str;
    }

    public static a0 a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c10 = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c10 = 1;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return SSL_3_0;
            case 3:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }
}
