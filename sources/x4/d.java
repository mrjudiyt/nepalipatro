package x4;

import c5.h;
import e4.j;
import e5.c;
import y4.b;

/* compiled from: MetadataDecoderFactory */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12770a = new a();

    /* compiled from: MetadataDecoderFactory */
    class a implements d {
        a() {
        }

        public boolean a(j jVar) {
            String str = jVar.f8096s;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        public c b(j jVar) {
            String str = jVar.f8096s;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new b();
                    case 1:
                        return new b5.a();
                    case 2:
                        return new h();
                    case 3:
                        return new z4.b();
                    case 4:
                        return new c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(j jVar);

    c b(j jVar);
}
