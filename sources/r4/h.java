package r4;

import a6.p;
import a6.y;
import c5.a;
import c5.e;
import c5.i;
import c5.j;
import c5.m;
import com.google.firebase.sessions.settings.RemoteSettings;
import e4.j;
import io.flutter.plugins.googlemobileads.Constants;
import k4.u;
import x4.a;

/* compiled from: MetadataUtil */
final class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f11098a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX, "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static e a(int i10, y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            yVar.P(8);
            String x10 = yVar.x(m10 - 16);
            return new e("und", x10, x10);
        }
        String valueOf = String.valueOf(a.a(i10));
        p.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    private static a b(y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            int b10 = a.b(yVar.m());
            String str = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Unrecognized cover art flags: ");
                sb.append(b10);
                p.h("MetadataUtil", sb.toString());
                return null;
            }
            yVar.P(4);
            int i10 = m10 - 16;
            byte[] bArr = new byte[i10];
            yVar.j(bArr, 0, i10);
            return new a(str, (String) null, 3, bArr);
        }
        p.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static a.b c(y yVar) {
        int e10 = yVar.e() + yVar.m();
        int m10 = yVar.m();
        int i10 = (m10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & m10;
            if (i11 == 6516084) {
                e a10 = a(m10, yVar);
                yVar.O(e10);
                return a10;
            } else if (i11 == 7233901 || i11 == 7631467) {
                m h10 = h(m10, "TIT2", yVar);
                yVar.O(e10);
                return h10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                m h11 = h(m10, "TCOM", yVar);
                yVar.O(e10);
                return h11;
            } else if (i11 == 6578553) {
                m h12 = h(m10, "TDRC", yVar);
                yVar.O(e10);
                return h12;
            } else if (i11 == 4280916) {
                m h13 = h(m10, "TPE1", yVar);
                yVar.O(e10);
                return h13;
            } else if (i11 == 7630703) {
                m h14 = h(m10, "TSSE", yVar);
                yVar.O(e10);
                return h14;
            } else if (i11 == 6384738) {
                m h15 = h(m10, "TALB", yVar);
                yVar.O(e10);
                return h15;
            } else if (i11 == 7108978) {
                m h16 = h(m10, "USLT", yVar);
                yVar.O(e10);
                return h16;
            } else if (i11 == 6776174) {
                m h17 = h(m10, "TCON", yVar);
                yVar.O(e10);
                return h17;
            } else if (i11 == 6779504) {
                m h18 = h(m10, "TIT1", yVar);
                yVar.O(e10);
                return h18;
            }
        } else if (m10 == 1735291493) {
            try {
                return g(yVar);
            } finally {
                yVar.O(e10);
            }
        } else if (m10 == 1684632427) {
            m d10 = d(m10, "TPOS", yVar);
            yVar.O(e10);
            return d10;
        } else if (m10 == 1953655662) {
            m d11 = d(m10, "TRCK", yVar);
            yVar.O(e10);
            return d11;
        } else if (m10 == 1953329263) {
            i i12 = i(m10, "TBPM", yVar, true, false);
            yVar.O(e10);
            return i12;
        } else if (m10 == 1668311404) {
            i i13 = i(m10, "TCMP", yVar, true, true);
            yVar.O(e10);
            return i13;
        } else if (m10 == 1668249202) {
            c5.a b10 = b(yVar);
            yVar.O(e10);
            return b10;
        } else if (m10 == 1631670868) {
            m h19 = h(m10, "TPE2", yVar);
            yVar.O(e10);
            return h19;
        } else if (m10 == 1936682605) {
            m h20 = h(m10, "TSOT", yVar);
            yVar.O(e10);
            return h20;
        } else if (m10 == 1936679276) {
            m h21 = h(m10, "TSO2", yVar);
            yVar.O(e10);
            return h21;
        } else if (m10 == 1936679282) {
            m h22 = h(m10, "TSOA", yVar);
            yVar.O(e10);
            return h22;
        } else if (m10 == 1936679265) {
            m h23 = h(m10, "TSOP", yVar);
            yVar.O(e10);
            return h23;
        } else if (m10 == 1936679791) {
            m h24 = h(m10, "TSOC", yVar);
            yVar.O(e10);
            return h24;
        } else if (m10 == 1920233063) {
            i i14 = i(m10, "ITUNESADVISORY", yVar, false, false);
            yVar.O(e10);
            return i14;
        } else if (m10 == 1885823344) {
            i i15 = i(m10, "ITUNESGAPLESS", yVar, false, true);
            yVar.O(e10);
            return i15;
        } else if (m10 == 1936683886) {
            m h25 = h(m10, "TVSHOWSORT", yVar);
            yVar.O(e10);
            return h25;
        } else if (m10 == 1953919848) {
            m h26 = h(m10, "TVSHOW", yVar);
            yVar.O(e10);
            return h26;
        } else if (m10 == 757935405) {
            i e11 = e(yVar, e10);
            yVar.O(e10);
            return e11;
        }
        String valueOf = String.valueOf(a.a(m10));
        p.b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
        yVar.O(e10);
        return null;
    }

    private static m d(int i10, String str, y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385 && m10 >= 22) {
            yVar.P(10);
            int I = yVar.I();
            if (I > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(I);
                String sb2 = sb.toString();
                int I2 = yVar.I();
                if (I2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append(RemoteSettings.FORWARD_SLASH_STRING);
                    sb3.append(I2);
                    sb2 = sb3.toString();
                }
                return new m(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(a.a(i10));
        p.h("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static i e(y yVar, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (yVar.e() < i10) {
            int e10 = yVar.e();
            int m10 = yVar.m();
            int m11 = yVar.m();
            yVar.P(4);
            if (m11 == 1835360622) {
                str = yVar.x(m10 - 12);
            } else if (m11 == 1851878757) {
                str2 = yVar.x(m10 - 12);
            } else {
                if (m11 == 1684108385) {
                    i11 = e10;
                    i12 = m10;
                }
                yVar.P(m10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        yVar.O(i11);
        yVar.P(16);
        return new j(str, str2, yVar.x(i12 - 16));
    }

    public static d5.a f(y yVar, int i10, String str) {
        while (true) {
            int e10 = yVar.e();
            if (e10 >= i10) {
                return null;
            }
            int m10 = yVar.m();
            if (yVar.m() == 1684108385) {
                int m11 = yVar.m();
                int m12 = yVar.m();
                int i11 = m10 - 16;
                byte[] bArr = new byte[i11];
                yVar.j(bArr, 0, i11);
                return new d5.a(str, bArr, m12, m11);
            }
            yVar.O(e10 + m10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static c5.m g(a6.y r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f11098a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            c5.m r1 = new c5.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            a6.p.h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.h.g(a6.y):c5.m");
    }

    private static m h(int i10, String str, y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            yVar.P(8);
            return new m(str, (String) null, yVar.x(m10 - 16));
        }
        String valueOf = String.valueOf(a.a(i10));
        p.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static i i(int i10, String str, y yVar, boolean z10, boolean z11) {
        int j10 = j(yVar);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 < 0) {
            String valueOf = String.valueOf(a.a(i10));
            p.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z10) {
            return new m(str, (String) null, Integer.toString(j10));
        } else {
            return new e("und", str, Integer.toString(j10));
        }
    }

    private static int j(y yVar) {
        yVar.P(4);
        if (yVar.m() == 1684108385) {
            yVar.P(8);
            return yVar.C();
        }
        p.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, u uVar, j.b bVar) {
        if (i10 == 1 && uVar.a()) {
            bVar.M(uVar.f9620a).N(uVar.f9621b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(int r5, x4.a r6, x4.a r7, e4.j.b r8, x4.a... r9) {
        /*
            x4.a r0 = new x4.a
            r1 = 0
            x4.a$b[] r2 = new x4.a.b[r1]
            r0.<init>((x4.a.b[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.e()
            if (r5 >= r6) goto L_0x003c
            x4.a$b r6 = r7.d(r5)
            boolean r3 = r6 instanceof d5.a
            if (r3 == 0) goto L_0x0039
            d5.a r6 = (d5.a) r6
            java.lang.String r3 = r6.f7951h
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            x4.a r5 = new x4.a
            x4.a$b[] r7 = new x4.a.b[r2]
            r7[r1] = r6
            r5.<init>((x4.a.b[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            x4.a r6 = r6.c(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.e()
            if (r5 <= 0) goto L_0x0052
            r8.X(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.h.l(int, x4.a, x4.a, e4.j$b, x4.a[]):void");
    }
}
