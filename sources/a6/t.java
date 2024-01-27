package a6;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l6.c;

/* compiled from: MimeTypes */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f237a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f238b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f239a;

        /* renamed from: b  reason: collision with root package name */
        public final String f240b;

        /* renamed from: c  reason: collision with root package name */
        public final int f241c;
    }

    /* compiled from: MimeTypes */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f242a;

        /* renamed from: b  reason: collision with root package name */
        public final int f243b;

        public b(int i10, int i11) {
            this.f242a = i10;
            this.f243b = i11;
        }
    }

    public static boolean a(String str, String str2) {
        b i10;
        int c10;
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c11 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c11 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c11 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c11 = 10;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (i10 = i(str2)) == null || (c10 = g4.a.c(i10.f243b)) == 0 || c10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : m0.G0(str)) {
            String g11 = g(g10);
            if (g11 != null && p(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] G0 = m0.G0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : G0) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f237a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f237a.get(i10);
            if (str.startsWith(aVar.f240b)) {
                return aVar.f239a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return g4.a.c(i10.f243b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e10 = c.e(str.trim());
        if (e10.startsWith("avc1") || e10.startsWith("avc3")) {
            return "video/avc";
        }
        if (e10.startsWith("hev1") || e10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e10.startsWith("dvav") || e10.startsWith("dva1") || e10.startsWith("dvhe") || e10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e10.startsWith("av01")) {
            return "video/av01";
        }
        if (e10.startsWith("vp9") || e10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e10.startsWith("vp8") || e10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e10.startsWith("mp4a")) {
            if (e10.startsWith("mp4a.") && (i10 = i(e10)) != null) {
                str2 = h(i10.f242a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (e10.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (e10.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (e10.startsWith("ac-3") || e10.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (e10.startsWith("ec-3") || e10.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (e10.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (e10.startsWith("ac-4") || e10.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (e10.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (e10.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (e10.startsWith("dtsh") || e10.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (e10.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd";
            }
            if (e10.startsWith("opus")) {
                return "audio/opus";
            }
            if (e10.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (e10.startsWith("flac")) {
                return "audio/flac";
            }
            if (e10.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (e10.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (e10.contains("cea708")) {
                return "application/cea-708";
            }
            return (e10.contains("eia608") || e10.contains("cea608")) ? "application/cea-608" : e(e10);
        }
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b i(String str) {
        Matcher matcher = f238b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) a.e(matcher.group(1));
        String group = matcher.group(2);
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : m0.G0(str)) {
            String g11 = g(g10);
            if (g11 != null && r(g11)) {
                return g11;
            }
        }
        return null;
    }

    private static String k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    private static int m(String str) {
        int size = f237a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f237a.get(i10);
            if (str.equals(aVar.f239a)) {
                return aVar.f241c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : m0.G0(str)) {
            String g11 = g(g10);
            if (g11 != null && s(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static boolean p(String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    public static boolean r(String str) {
        return ViewHierarchyConstants.TEXT_KEY.equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(k(str));
    }

    public static String t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
