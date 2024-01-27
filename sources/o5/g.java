package o5;

import e4.j;
import p5.c;
import x5.h;

/* compiled from: SubtitleDecoderFactory */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f10432a = new a();

    /* compiled from: SubtitleDecoderFactory */
    class a implements g {
        a() {
        }

        public boolean a(j jVar) {
            String str = jVar.f8096s;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        public f b(j jVar) {
            String str = jVar.f8096s;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 10;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new q5.a(jVar.f8098u);
                    case 1:
                        return new r5.a();
                    case 2:
                        return new x5.a();
                    case 3:
                        return new h();
                    case 4:
                        return new w5.a(jVar.f8098u);
                    case 5:
                        return new t5.a(jVar.f8098u);
                    case 6:
                    case 7:
                        return new p5.a(str, jVar.K, 16000);
                    case 8:
                        return new c(jVar.K, jVar.f8098u);
                    case 9:
                        return new u5.a();
                    case 10:
                        return new v5.c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(j jVar);

    f b(j jVar);
}
