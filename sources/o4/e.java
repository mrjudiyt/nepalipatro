package o4;

import a6.n0;
import a6.p;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.x;
import java.io.StringReader;
import o4.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: XmpMotionPhotoDescriptionParser */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f10391a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f10392b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f10393c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            p.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (n0.f(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            x<b.a> s10 = x.s();
            do {
                newPullParser.next();
                if (n0.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    s10 = c(newPullParser);
                } else if (n0.f(newPullParser, "Container:Directory")) {
                    s10 = f(newPullParser, "Container", "Item");
                } else if (n0.f(newPullParser, "GContainer:Directory")) {
                    s10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!n0.d(newPullParser, "x:xmpmeta"));
            if (s10.isEmpty()) {
                return null;
            }
            return new b(j10, s10);
        }
        throw ParserException.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static x<b.a> c(XmlPullParser xmlPullParser) {
        for (String a10 : f10393c) {
            String a11 = n0.a(xmlPullParser, a10);
            if (a11 != null) {
                return x.u(new b.a("image/jpeg", "Primary", 0, 0), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return x.s();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        String[] strArr = f10391a;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String a10 = n0.a(xmlPullParser, strArr[i10]);
            if (a10 == null) {
                i10++;
            } else if (Integer.parseInt(a10) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String a10 : f10392b) {
            String a11 = n0.a(xmlPullParser, a10);
            if (a11 != null) {
                long parseLong = Long.parseLong(a11);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static x<b.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        x.a l10 = x.l();
        String concat = String.valueOf(str).concat(":Item");
        String concat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, concat)) {
                String concat3 = String.valueOf(str2).concat(":Mime");
                String concat4 = String.valueOf(str2).concat(":Semantic");
                String concat5 = String.valueOf(str2).concat(":Length");
                String concat6 = String.valueOf(str2).concat(":Padding");
                String a10 = n0.a(xmlPullParser, concat3);
                String a11 = n0.a(xmlPullParser, concat4);
                String a12 = n0.a(xmlPullParser, concat5);
                String a13 = n0.a(xmlPullParser, concat6);
                if (a10 == null || a11 == null) {
                    return x.s();
                }
                l10.f(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0, a13 != null ? Long.parseLong(a13) : 0));
            }
        } while (!n0.d(xmlPullParser, concat2));
        return l10.h();
    }
}
