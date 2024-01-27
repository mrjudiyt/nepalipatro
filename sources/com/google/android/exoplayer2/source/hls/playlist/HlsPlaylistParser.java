package com.google.android.exoplayer2.source.hls.playlist;

import a6.k0;
import a6.m0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.f0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m5.d;
import r4.l;

public final class HlsPlaylistParser implements h.a<d> {
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    private static final Pattern f7326a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    private static final Pattern f7327b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f7328c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f7329d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f7330e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f7331f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f7332g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f7333h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f7334i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f7335j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f7336k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f7337l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f7338m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f7339n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f7340o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f7341p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f7342q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f7343r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f7344s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f7345t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f7346u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f7347v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f7348w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f7349x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f7350y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f7351z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a  reason: collision with root package name */
    private final c f7352a;

    /* renamed from: b  reason: collision with root package name */
    private final d f7353b;

    public static final class DeltaUpdateException extends IOException {
    }

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f7354a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue<String> f7355b;

        /* renamed from: c  reason: collision with root package name */
        private String f7356c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f7355b = queue;
            this.f7354a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f7356c != null) {
                return true;
            }
            if (!this.f7355b.isEmpty()) {
                this.f7356c = (String) a6.a.e(this.f7355b.poll());
                return true;
            }
            do {
                String readLine = this.f7354a.readLine();
                this.f7356c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f7356c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.f7356c;
                this.f7356c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(c.f7389n, (d) null);
    }

    private static String A(String str, Map<String, String> map) {
        Matcher matcher = f7327b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int B(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !m0.k0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int B2 = B(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (B2 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            B2 = bufferedReader.read();
        }
        return m0.k0(B(bufferedReader, false, B2));
    }

    private static Pattern c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    private static com.google.android.exoplayer2.drm.h d(String str, h.b[] bVarArr) {
        h.b[] bVarArr2 = new h.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].c((byte[]) null);
        }
        return new com.google.android.exoplayer2.drm.h(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static c.b f(ArrayList<c.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7407d)) {
                return bVar;
            }
        }
        return null;
    }

    private static c.b g(ArrayList<c.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7408e)) {
                return bVar;
            }
        }
        return null;
    }

    private static c.b h(ArrayList<c.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7406c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static h.b k(String str, String str2, Map<String, String> map) {
        String u10 = u(str, J, AppEventsConstants.EVENT_PARAM_VALUE_YES, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, K, map);
            return new h.b(e4.c.f8048d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new h.b(e4.c.f8048d, "hls", m0.g0(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(u10)) {
                return null;
            }
            String z11 = z(str, K, map);
            byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
            UUID uuid = e4.c.f8049e;
            return new h.b(uuid, "video/mp4", l.a(uuid, decode));
        }
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0473, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04bb, code lost:
        r0 = r0 + 1;
        r31 = r6;
        r32 = r9;
        r33 = r14;
        r15 = r20;
        r9 = r21;
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.c o(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.a r36, java.lang.String r37) {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L_0x0036:
            boolean r14 = r36.a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r14)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x006d
            java.util.regex.Pattern r9 = P
            java.lang.String r9 = z(r14, r9, r11)
            java.util.regex.Pattern r10 = Z
            java.lang.String r10 = z(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00ce
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x0204
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00ce
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = I
            java.lang.String r10 = "identity"
            java.lang.String r9 = u(r14, r9, r10, r11)
            com.google.android.exoplayer2.drm.h$b r9 = k(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = H
            java.lang.String r10 = z(r14, r10, r11)
            java.lang.String r10 = l(r10)
            com.google.android.exoplayer2.drm.h r14 = new com.google.android.exoplayer2.drm.h
            r15 = 1
            com.google.android.exoplayer2.drm.h$b[] r15 = new com.google.android.exoplayer2.drm.h.b[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>((java.lang.String) r10, (com.google.android.exoplayer2.drm.h.b[]) r15)
            r12.add(r14)
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x0204
        L_0x00e1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto L_0x00ef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto L_0x00f2
        L_0x00ef:
            r20 = r13
            r10 = 0
        L_0x00f2:
            java.util.regex.Pattern r13 = f7333h
            int r13 = m(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f7328c
            r29 = r7
            r7 = -1
            int r12 = s(r14, r12, r7)
            java.util.regex.Pattern r7 = f7335j
            java.lang.String r7 = v(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f7336k
            java.lang.String r8 = v(r14, r8, r11)
            if (r8 == 0) goto L_0x0139
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = a6.m0.E0(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x0132
            if (r6 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r17 = r8
            goto L_0x0135
        L_0x0132:
            r6 = -1
            r17 = -1
        L_0x0135:
            r8 = r6
            r6 = r17
            goto L_0x013d
        L_0x0139:
            r31 = r6
            r6 = -1
            r8 = -1
        L_0x013d:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = f7337l
            java.lang.String r5 = v(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = f7329d
            java.lang.String r4 = v(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f7330e
            java.lang.String r3 = v(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f7331f
            java.lang.String r0 = v(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f7332g
            java.lang.String r0 = v(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = K
            java.lang.String r9 = z(r14, r9, r11)
            android.net.Uri r9 = a6.k0.e(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.a()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.b()
            java.lang.String r9 = A(r9, r11)
            android.net.Uri r9 = a6.k0.e(r1, r9)
        L_0x0193:
            e4.j$b r14 = new e4.j$b
            r14.<init>()
            int r1 = r2.size()
            e4.j$b r1 = r14.R(r1)
            e4.j$b r1 = r1.K(r15)
            e4.j$b r1 = r1.I(r7)
            e4.j$b r1 = r1.G(r12)
            e4.j$b r1 = r1.Z(r13)
            e4.j$b r1 = r1.j0(r6)
            e4.j$b r1 = r1.Q(r8)
            e4.j$b r1 = r1.P(r5)
            e4.j$b r1 = r1.c0(r10)
            e4.j r23 = r1.E()
            com.google.android.exoplayer2.source.hls.playlist.c$b r1 = new com.google.android.exoplayer2.source.hls.playlist.c$b
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L_0x01ea:
            l5.q$b r6 = new l5.q$b
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L_0x0204:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x0217:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0, r1)
            throw r0
        L_0x021f:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023b:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0294
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.c$b r5 = (com.google.android.exoplayer2.source.hls.playlist.c.b) r5
            android.net.Uri r6 = r5.f7404a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x0290
            e4.j r6 = r5.f7405b
            x4.a r6 = r6.f8094q
            if (r6 != 0) goto L_0x0257
            r6 = 1
            goto L_0x0258
        L_0x0257:
            r6 = 0
        L_0x0258:
            a6.a.f(r6)
            l5.q r6 = new l5.q
            android.net.Uri r7 = r5.f7404a
            java.lang.Object r7 = r1.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = a6.a.e(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r6.<init>(r8, r8, r7)
            x4.a r7 = new x4.a
            r9 = 1
            x4.a$b[] r10 = new x4.a.b[r9]
            r9 = 0
            r10[r9] = r6
            r7.<init>((x4.a.b[]) r10)
            e4.j r6 = r5.f7405b
            e4.j$b r6 = r6.b()
            e4.j$b r6 = r6.X(r7)
            e4.j r6 = r6.E()
            com.google.android.exoplayer2.source.hls.playlist.c$b r5 = r5.a(r6)
            r3.add(r5)
            goto L_0x0291
        L_0x0290:
            r8 = 0
        L_0x0291:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0294:
            r8 = 0
            r1 = r8
            r9 = r1
            r0 = 0
        L_0x0298:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04ca
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = Q
            java.lang.String r6 = z(r5, r6, r11)
            java.util.regex.Pattern r7 = P
            java.lang.String r7 = z(r5, r7, r11)
            e4.j$b r10 = new e4.j$b
            r10.<init>()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r12 = r12.length()
            r14 = 1
            int r12 = r12 + r14
            java.lang.String r14 = java.lang.String.valueOf(r7)
            int r14 = r14.length()
            int r12 = r12 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r12)
            r14.append(r6)
            java.lang.String r12 = ":"
            r14.append(r12)
            r14.append(r7)
            java.lang.String r12 = r14.toString()
            e4.j$b r10 = r10.S(r12)
            e4.j$b r10 = r10.U(r7)
            e4.j$b r10 = r10.K(r15)
            int r12 = x(r5)
            e4.j$b r10 = r10.g0(r12)
            int r12 = w(r5, r11)
            e4.j$b r10 = r10.c0(r12)
            java.util.regex.Pattern r12 = O
            java.lang.String r12 = v(r5, r12, r11)
            e4.j$b r10 = r10.V(r12)
            java.util.regex.Pattern r12 = K
            java.lang.String r12 = v(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x0310
            r12 = r8
            goto L_0x0314
        L_0x0310:
            android.net.Uri r12 = a6.k0.e(r14, r12)
        L_0x0314:
            x4.a r8 = new x4.a
            r34 = r4
            r4 = 1
            x4.a$b[] r14 = new x4.a.b[r4]
            l5.q r4 = new l5.q
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r6, r7, r15)
            r15 = 0
            r14[r15] = r4
            r8.<init>((x4.a.b[]) r14)
            java.util.regex.Pattern r4 = M
            java.lang.String r4 = z(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x0360;
                case -333210994: goto L_0x0355;
                case 62628790: goto L_0x034a;
                case 81665115: goto L_0x033f;
                default: goto L_0x033d;
            }
        L_0x033d:
            r4 = -1
            goto L_0x036a
        L_0x033f:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0348
            goto L_0x033d
        L_0x0348:
            r4 = 3
            goto L_0x036a
        L_0x034a:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0353
            goto L_0x033d
        L_0x0353:
            r4 = 2
            goto L_0x036a
        L_0x0355:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x035e
            goto L_0x033d
        L_0x035e:
            r4 = 1
            goto L_0x036a
        L_0x0360:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0369
            goto L_0x033d
        L_0x0369:
            r4 = 0
        L_0x036a:
            switch(r4) {
                case 0: goto L_0x0476;
                case 1: goto L_0x0432;
                case 2: goto L_0x03bf;
                case 3: goto L_0x0379;
                default: goto L_0x036d;
            }
        L_0x036d:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
        L_0x0375:
            r16 = 0
            goto L_0x04bb
        L_0x0379:
            com.google.android.exoplayer2.source.hls.playlist.c$b r4 = h(r2, r6)
            if (r4 == 0) goto L_0x03a4
            e4.j r4 = r4.f7405b
            java.lang.String r5 = r4.f8093p
            java.lang.String r5 = a6.m0.I(r5, r15)
            e4.j$b r14 = r10.I(r5)
            java.lang.String r5 = a6.t.g(r5)
            e4.j$b r5 = r14.e0(r5)
            int r14 = r4.f8101x
            e4.j$b r5 = r5.j0(r14)
            int r14 = r4.f8102y
            e4.j$b r5 = r5.Q(r14)
            float r4 = r4.f8103z
            r5.P(r4)
        L_0x03a4:
            if (r12 != 0) goto L_0x03a7
            goto L_0x036d
        L_0x03a7:
            r10.X(r8)
            com.google.android.exoplayer2.source.hls.playlist.c$a r4 = new com.google.android.exoplayer2.source.hls.playlist.c$a
            e4.j r5 = r10.E()
            r4.<init>(r12, r5, r6, r7)
            r14 = r33
            r14.add(r4)
            r21 = r9
            r6 = r31
            r9 = r32
            goto L_0x0375
        L_0x03bf:
            r14 = r33
            com.google.android.exoplayer2.source.hls.playlist.c$b r4 = f(r2, r6)
            if (r4 == 0) goto L_0x03da
            e4.j r15 = r4.f7405b
            java.lang.String r15 = r15.f8093p
            r21 = r9
            r9 = 1
            java.lang.String r15 = a6.m0.I(r15, r9)
            r10.I(r15)
            java.lang.String r15 = a6.t.g(r15)
            goto L_0x03dd
        L_0x03da:
            r21 = r9
            r15 = 0
        L_0x03dd:
            java.util.regex.Pattern r9 = f7334i
            java.lang.String r5 = v(r5, r9, r11)
            if (r5 == 0) goto L_0x040e
            java.lang.String r9 = "/"
            java.lang.String[] r9 = a6.m0.F0(r5, r9)
            r16 = 0
            r9 = r9[r16]
            int r9 = java.lang.Integer.parseInt(r9)
            r10.H(r9)
            java.lang.String r9 = "audio/eac3"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x0410
            java.lang.String r9 = "/JOC"
            boolean r5 = r5.endsWith(r9)
            if (r5 == 0) goto L_0x0410
            java.lang.String r5 = "ec+3"
            r10.I(r5)
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x0410
        L_0x040e:
            r16 = 0
        L_0x0410:
            r10.e0(r15)
            if (r12 == 0) goto L_0x0427
            r10.X(r8)
            com.google.android.exoplayer2.source.hls.playlist.c$a r4 = new com.google.android.exoplayer2.source.hls.playlist.c$a
            e4.j r5 = r10.E()
            r4.<init>(r12, r5, r6, r7)
            r9 = r32
            r9.add(r4)
            goto L_0x0473
        L_0x0427:
            r9 = r32
            if (r4 == 0) goto L_0x0473
            e4.j r4 = r10.E()
            r21 = r4
            goto L_0x0473
        L_0x0432:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = S
            java.lang.String r4 = z(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0453
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x045e
        L_0x0453:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x045e:
            if (r1 != 0) goto L_0x0465
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0465:
            e4.j$b r5 = r10.e0(r5)
            r5.F(r4)
            e4.j r4 = r10.E()
            r1.add(r4)
        L_0x0473:
            r6 = r31
            goto L_0x04bb
        L_0x0476:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            com.google.android.exoplayer2.source.hls.playlist.c$b r4 = g(r2, r6)
            if (r4 == 0) goto L_0x0495
            e4.j r4 = r4.f7405b
            java.lang.String r4 = r4.f8093p
            r5 = 3
            java.lang.String r4 = a6.m0.I(r4, r5)
            r10.I(r4)
            java.lang.String r4 = a6.t.g(r4)
            goto L_0x0496
        L_0x0495:
            r4 = 0
        L_0x0496:
            if (r4 != 0) goto L_0x049a
            java.lang.String r4 = "text/vtt"
        L_0x049a:
            e4.j$b r4 = r10.e0(r4)
            r4.X(r8)
            if (r12 == 0) goto L_0x04b2
            com.google.android.exoplayer2.source.hls.playlist.c$a r4 = new com.google.android.exoplayer2.source.hls.playlist.c$a
            e4.j r5 = r10.E()
            r4.<init>(r12, r5, r6, r7)
            r6 = r31
            r6.add(r4)
            goto L_0x04bb
        L_0x04b2:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            a6.p.h(r4, r5)
        L_0x04bb:
            int r0 = r0 + 1
            r31 = r6
            r32 = r9
            r33 = r14
            r15 = r20
            r9 = r21
            r8 = 0
            goto L_0x0298
        L_0x04ca:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04da
            java.util.List r0 = java.util.Collections.emptyList()
            r10 = r0
            goto L_0x04db
        L_0x04da:
            r10 = r1
        L_0x04db:
            com.google.android.exoplayer2.source.hls.playlist.c r13 = new com.google.android.exoplayer2.source.hls.playlist.c
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r9
            r7 = r29
            r8 = r21
            r9 = r10
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.o(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.c");
    }

    private static d p(c cVar, d dVar, a aVar, String str) {
        boolean z10;
        ArrayList arrayList;
        String str2;
        d.b bVar;
        String str3;
        ArrayList arrayList2;
        HashMap hashMap;
        String str4;
        long j10;
        String str5;
        boolean z11;
        c cVar2;
        d dVar2;
        String str6;
        long j11;
        d.C0117d dVar3;
        com.google.android.exoplayer2.drm.h hVar;
        long j12;
        long j13;
        String str7;
        String str8;
        boolean z12;
        String str9;
        String str10;
        c cVar3 = cVar;
        d dVar4 = dVar;
        boolean z13 = cVar3.f10239c;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        d.f fVar = new d.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str11 = "";
        boolean z14 = z13;
        d.f fVar2 = fVar;
        String str12 = str11;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        boolean z15 = false;
        int i10 = 0;
        long j22 = -9223372036854775807L;
        boolean z16 = false;
        int i11 = 0;
        int i12 = 1;
        long j23 = -9223372036854775807L;
        long j24 = -9223372036854775807L;
        boolean z17 = false;
        com.google.android.exoplayer2.drm.h hVar2 = null;
        com.google.android.exoplayer2.drm.h hVar3 = null;
        boolean z18 = false;
        d.b bVar2 = null;
        String str13 = null;
        long j25 = -1;
        String str14 = null;
        String str15 = null;
        int i13 = 0;
        boolean z19 = false;
        d.C0117d dVar5 = null;
        while (aVar.a()) {
            String b10 = aVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList5.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z20 = z(b10, f7342q, hashMap2);
                if ("VOD".equals(z20)) {
                    i10 = 1;
                } else if ("EVENT".equals(z20)) {
                    i10 = 2;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z19 = true;
            } else if (b10.startsWith("#EXT-X-START")) {
                z15 = q(b10, Y, false);
                j22 = (long) (j(b10, C) * 1000000.0d);
            } else if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar2 = y(b10);
            } else if (b10.startsWith("#EXT-X-PART-INF")) {
                j24 = (long) (j(b10, f7340o) * 1000000.0d);
            } else if (b10.startsWith("#EXT-X-MAP")) {
                String z21 = z(b10, K, hashMap2);
                String v10 = v(b10, E, hashMap2);
                if (v10 != null) {
                    String[] E0 = m0.E0(v10, "@");
                    j25 = Long.parseLong(E0[0]);
                    if (E0.length > 1) {
                        j16 = Long.parseLong(E0[1]);
                    }
                }
                int i14 = (j25 > -1 ? 1 : (j25 == -1 ? 0 : -1));
                if (i14 == 0) {
                    j16 = 0;
                }
                String str16 = str13;
                String str17 = str14;
                if (str16 == null || str17 != null) {
                    dVar5 = new d.C0117d(z21, j16, j25, str16, str17);
                    if (i14 != 0) {
                        j16 += j25;
                    }
                    str13 = str16;
                    str14 = str17;
                    j25 = -1;
                } else {
                    throw ParserException.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", (Throwable) null);
                }
            } else {
                String str18 = str13;
                String str19 = str14;
                boolean z22 = z15;
                if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                    j23 = 1000000 * ((long) m(b10, f7338m));
                } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j19 = n(b10, f7349x);
                    str14 = str19;
                    z15 = z22;
                    j15 = j19;
                    str13 = str18;
                } else if (b10.startsWith("#EXT-X-VERSION")) {
                    i12 = m(b10, f7341p);
                } else {
                    if (b10.startsWith("#EXT-X-DEFINE")) {
                        String v11 = v(b10, f7326a0, hashMap2);
                        if (v11 != null) {
                            String str20 = cVar3.f7398l.get(v11);
                            if (str20 != null) {
                                hashMap2.put(v11, str20);
                            }
                        } else {
                            hashMap2.put(z(b10, P, hashMap2), z(b10, Z, hashMap2));
                        }
                        arrayList2 = arrayList5;
                        str2 = str11;
                        str3 = str18;
                        bVar = bVar2;
                        j10 = j19;
                        hashMap = hashMap4;
                        str4 = str15;
                    } else {
                        if (b10.startsWith("#EXTINF")) {
                            double j26 = j(b10, f7350y);
                            str6 = str18;
                            str12 = u(b10, f7351z, str11, hashMap2);
                            cVar3 = cVar;
                            j20 = (long) (j26 * 1000000.0d);
                            str9 = str19;
                        } else {
                            str6 = str18;
                            if (b10.startsWith("#EXT-X-SKIP")) {
                                int m10 = m(b10, f7345t);
                                a6.a.f(dVar4 != null && arrayList3.isEmpty());
                                int i15 = (int) (j15 - ((d) m0.j(dVar)).f7417k);
                                int i16 = m10 + i15;
                                if (i15 < 0 || i16 > dVar4.f7424r.size()) {
                                    throw new DeltaUpdateException();
                                }
                                str9 = str19;
                                long j27 = j18;
                                while (i15 < i16) {
                                    d.C0117d dVar6 = dVar4.f7424r.get(i15);
                                    String str21 = str11;
                                    if (j15 != dVar4.f7417k) {
                                        dVar6 = dVar6.d(j27, (dVar4.f7416j - i11) + dVar6.f7439k);
                                    }
                                    arrayList3.add(dVar6);
                                    j27 += dVar6.f7438j;
                                    long j28 = dVar6.f7445q;
                                    int i17 = i16;
                                    if (j28 != -1) {
                                        j16 = dVar6.f7444p + j28;
                                    }
                                    int i18 = dVar6.f7439k;
                                    d.C0117d dVar7 = dVar6.f7437i;
                                    com.google.android.exoplayer2.drm.h hVar4 = dVar6.f7441m;
                                    String str22 = dVar6.f7442n;
                                    int i19 = i18;
                                    String str23 = dVar6.f7443o;
                                    d.C0117d dVar8 = dVar7;
                                    if (str23 == null || !str23.equals(Long.toHexString(j19))) {
                                        str9 = dVar6.f7443o;
                                    }
                                    j19++;
                                    i15++;
                                    dVar4 = dVar;
                                    str6 = str22;
                                    j17 = j27;
                                    i13 = i19;
                                    i16 = i17;
                                    dVar5 = dVar8;
                                    hVar3 = hVar4;
                                    str11 = str21;
                                }
                                cVar3 = cVar;
                                dVar4 = dVar;
                                j18 = j27;
                            } else {
                                str2 = str11;
                                if (b10.startsWith("#EXT-X-KEY")) {
                                    String z23 = z(b10, H, hashMap2);
                                    String u10 = u(b10, I, "identity", hashMap2);
                                    if ("NONE".equals(z23)) {
                                        treeMap.clear();
                                        str10 = null;
                                        hVar3 = null;
                                        str8 = null;
                                    } else {
                                        String v12 = v(b10, L, hashMap2);
                                        if (!"identity".equals(u10)) {
                                            String str24 = str15;
                                            str15 = str24 == null ? l(z23) : str24;
                                            h.b k10 = k(b10, u10, hashMap2);
                                            if (k10 != null) {
                                                treeMap.put(u10, k10);
                                                str8 = v12;
                                                str10 = null;
                                                hVar3 = null;
                                            }
                                        } else if ("AES-128".equals(z23)) {
                                            str10 = z(b10, K, hashMap2);
                                            str8 = v12;
                                        }
                                        str8 = v12;
                                        str10 = null;
                                    }
                                    dVar4 = dVar;
                                    z12 = z22;
                                    str11 = str2;
                                    str13 = str10;
                                } else {
                                    String str25 = str15;
                                    if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] E02 = m0.E0(z(b10, D, hashMap2), "@");
                                        j25 = Long.parseLong(E02[0]);
                                        if (E02.length > 1) {
                                            j16 = Long.parseLong(E02[1]);
                                        }
                                    } else if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i11 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                        cVar3 = cVar;
                                        dVar4 = dVar;
                                        str15 = str25;
                                        str9 = str19;
                                        str11 = str2;
                                        z16 = true;
                                    } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                        i13++;
                                    } else if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j14 == 0) {
                                            j14 = e4.c.d(m0.x0(b10.substring(b10.indexOf(58) + 1))) - j18;
                                        } else {
                                            str3 = str6;
                                            arrayList2 = arrayList5;
                                            j10 = j19;
                                            HashMap hashMap5 = hashMap4;
                                            str4 = str25;
                                            bVar = bVar2;
                                            hashMap = hashMap5;
                                        }
                                    } else if (b10.equals("#EXT-X-GAP")) {
                                        cVar3 = cVar;
                                        dVar4 = dVar;
                                        str15 = str25;
                                        str9 = str19;
                                        str11 = str2;
                                        z18 = true;
                                    } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        cVar3 = cVar;
                                        dVar4 = dVar;
                                        str15 = str25;
                                        str9 = str19;
                                        str11 = str2;
                                        z14 = true;
                                    } else if (b10.equals("#EXT-X-ENDLIST")) {
                                        cVar3 = cVar;
                                        dVar4 = dVar;
                                        str15 = str25;
                                        str9 = str19;
                                        str11 = str2;
                                        z17 = true;
                                    } else {
                                        if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            str3 = str6;
                                            String str26 = str25;
                                            long t10 = t(b10, A, (j15 + ((long) arrayList3.size())) - (arrayList4.isEmpty() ? 1 : 0));
                                            int s10 = s(b10, B, j24 != -9223372036854775807L ? (arrayList4.isEmpty() ? ((d.C0117d) f0.c(arrayList3)).f7435t : arrayList4).size() - 1 : -1);
                                            Uri parse = Uri.parse(k0.d(str, z(b10, K, hashMap2)));
                                            hashMap4.put(parse, new d.c(parse, t10, s10));
                                            bVar = bVar2;
                                            j10 = j19;
                                            hashMap = hashMap4;
                                            str4 = str26;
                                        } else {
                                            str3 = str6;
                                            String str27 = str25;
                                            if (b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                d.b bVar3 = bVar2;
                                                if (bVar3 == null && "PART".equals(z(b10, N, hashMap2))) {
                                                    String z24 = z(b10, K, hashMap2);
                                                    long t11 = t(b10, F, -1);
                                                    HashMap hashMap6 = hashMap4;
                                                    long t12 = t(b10, G, -1);
                                                    long j29 = j19;
                                                    String e10 = e(j29, str3, str19);
                                                    if (hVar3 != null || treeMap.isEmpty()) {
                                                        j13 = j29;
                                                        str7 = str27;
                                                    } else {
                                                        j13 = j29;
                                                        h.b[] bVarArr = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                        str7 = str27;
                                                        com.google.android.exoplayer2.drm.h hVar5 = new com.google.android.exoplayer2.drm.h(str7, bVarArr);
                                                        if (hVar2 == null) {
                                                            hVar2 = d(str7, bVarArr);
                                                        }
                                                        hVar3 = hVar5;
                                                    }
                                                    int i20 = (t11 > -1 ? 1 : (t11 == -1 ? 0 : -1));
                                                    if (i20 == 0 || t12 != -1) {
                                                        bVar3 = new d.b(z24, dVar5, 0, i13, j17, hVar3, str3, e10, i20 != 0 ? t11 : 0, t12, false, false, true);
                                                    }
                                                    dVar4 = dVar;
                                                    str8 = str19;
                                                    str15 = str7;
                                                    j19 = j13;
                                                    hashMap4 = hashMap6;
                                                    z12 = z22;
                                                    bVar2 = bVar3;
                                                    str13 = str3;
                                                    str11 = str2;
                                                } else {
                                                    bVar = bVar3;
                                                    hashMap = hashMap4;
                                                    str4 = str27;
                                                    j10 = j19;
                                                }
                                            } else {
                                                d.b bVar4 = bVar2;
                                                long j30 = j19;
                                                hashMap = hashMap4;
                                                str4 = str27;
                                                if (b10.startsWith("#EXT-X-PART")) {
                                                    String e11 = e(j30, str3, str19);
                                                    String z25 = z(b10, K, hashMap2);
                                                    bVar = bVar4;
                                                    long j31 = j30;
                                                    long j32 = (long) (j(b10, f7339n) * 1000000.0d);
                                                    ArrayList arrayList6 = arrayList5;
                                                    boolean q10 = q(b10, W, false) | (z14 && arrayList4.isEmpty());
                                                    boolean q11 = q(b10, X, false);
                                                    String v13 = v(b10, E, hashMap2);
                                                    if (v13 != null) {
                                                        String[] E03 = m0.E0(v13, "@");
                                                        j12 = Long.parseLong(E03[0]);
                                                        if (E03.length > 1) {
                                                            j21 = Long.parseLong(E03[1]);
                                                        }
                                                    } else {
                                                        j12 = -1;
                                                    }
                                                    int i21 = (j12 > -1 ? 1 : (j12 == -1 ? 0 : -1));
                                                    if (i21 == 0) {
                                                        j21 = 0;
                                                    }
                                                    if (hVar3 == null && !treeMap.isEmpty()) {
                                                        h.b[] bVarArr2 = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                        com.google.android.exoplayer2.drm.h hVar6 = new com.google.android.exoplayer2.drm.h(str4, bVarArr2);
                                                        if (hVar2 == null) {
                                                            hVar2 = d(str4, bVarArr2);
                                                        }
                                                        hVar3 = hVar6;
                                                    }
                                                    arrayList4.add(new d.b(z25, dVar5, j32, i13, j17, hVar3, str3, e11, j21, j12, q11, q10, false));
                                                    j17 += j32;
                                                    if (i21 != 0) {
                                                        j21 += j12;
                                                    }
                                                    cVar2 = cVar;
                                                    dVar2 = dVar;
                                                    str5 = str4;
                                                    j19 = j31;
                                                    hashMap4 = hashMap;
                                                    z11 = z22;
                                                    arrayList5 = arrayList6;
                                                    str13 = str3;
                                                    bVar2 = bVar;
                                                    str14 = str19;
                                                    str11 = str2;
                                                } else {
                                                    bVar = bVar4;
                                                    long j33 = j30;
                                                    arrayList2 = arrayList5;
                                                    if (!b10.startsWith("#")) {
                                                        long j34 = j33;
                                                        String e12 = e(j34, str3, str19);
                                                        j19 = j34 + 1;
                                                        String A2 = A(b10, hashMap2);
                                                        d.C0117d dVar9 = (d.C0117d) hashMap3.get(A2);
                                                        int i22 = (j25 > -1 ? 1 : (j25 == -1 ? 0 : -1));
                                                        if (i22 == 0) {
                                                            j11 = 0;
                                                        } else {
                                                            if (z19 && dVar5 == null && dVar9 == null) {
                                                                dVar9 = new d.C0117d(A2, 0, j16, (String) null, (String) null);
                                                                hashMap3.put(A2, dVar9);
                                                            }
                                                            j11 = j16;
                                                        }
                                                        if (hVar3 != null || treeMap.isEmpty()) {
                                                            dVar3 = dVar9;
                                                            hVar = hVar3;
                                                        } else {
                                                            dVar3 = dVar9;
                                                            h.b[] bVarArr3 = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                            hVar = new com.google.android.exoplayer2.drm.h(str4, bVarArr3);
                                                            if (hVar2 == null) {
                                                                hVar2 = d(str4, bVarArr3);
                                                            }
                                                        }
                                                        arrayList3.add(new d.C0117d(A2, dVar5 != null ? dVar5 : dVar3, str12, j20, i13, j18, hVar, str3, e12, j11, j25, z18, arrayList4));
                                                        j17 = j18 + j20;
                                                        arrayList4 = new ArrayList();
                                                        if (i22 != 0) {
                                                            j11 += j25;
                                                        }
                                                        j16 = j11;
                                                        cVar3 = cVar;
                                                        dVar4 = dVar;
                                                        hVar3 = hVar;
                                                        str15 = str4;
                                                        j20 = 0;
                                                        j18 = j17;
                                                        hashMap4 = hashMap;
                                                        z15 = z22;
                                                        arrayList5 = arrayList2;
                                                        str12 = str2;
                                                        z18 = false;
                                                        j25 = -1;
                                                        str13 = str3;
                                                        bVar2 = bVar;
                                                        str14 = str19;
                                                        str11 = str12;
                                                    } else {
                                                        j10 = j33;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList2 = arrayList5;
                                    }
                                    cVar3 = cVar;
                                    dVar4 = dVar;
                                    str15 = str25;
                                    str9 = str19;
                                    str11 = str2;
                                }
                                cVar3 = cVar;
                            }
                        }
                        boolean z26 = z22;
                        str13 = str6;
                        z15 = z26;
                    }
                    j19 = j10;
                    str5 = str4;
                    hashMap4 = hashMap;
                    z11 = z22;
                    arrayList5 = arrayList2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    str13 = str3;
                    bVar2 = bVar;
                    str14 = str19;
                    str11 = str2;
                }
                str14 = str19;
                z15 = z22;
                str13 = str18;
            }
        }
        boolean z27 = z15;
        ArrayList arrayList7 = arrayList5;
        d.b bVar5 = bVar2;
        HashMap hashMap7 = hashMap4;
        if (bVar5 != null) {
            arrayList4.add(bVar5);
        }
        if (j14 != 0) {
            arrayList = arrayList4;
            z10 = true;
        } else {
            arrayList = arrayList4;
            z10 = false;
        }
        return new d(i10, str, arrayList7, j22, z27, j14, z16, i11, j15, i12, j23, j24, z14, z17, z10, hVar2, arrayList3, arrayList, fVar2, hashMap7);
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) a6.a.e(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) a6.a.e(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) a6.a.e(matcher.group(1))) : j10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String u(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x0016
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = a6.a.e(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = A(r2, r3)
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.u(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, (String) null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v10 = v(str, R, map);
        int i10 = 0;
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] E0 = m0.E0(v10, ",");
        if (m0.t(E0, "public.accessibility.describes-video")) {
            i10 = 512;
        }
        if (m0.t(E0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (m0.t(E0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return m0.t(E0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    private static int x(String str) {
        boolean q10 = q(str, U, false);
        if (q(str, V, false)) {
            q10 |= true;
        }
        return q(str, T, false) ? q10 | true ? 1 : 0 : q10 ? 1 : 0;
    }

    private static d.f y(String str) {
        String str2 = str;
        double r10 = r(str2, f7343r, -9.223372036854776E18d);
        long j10 = -9223372036854775807L;
        long j11 = r10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r10 * 1000000.0d);
        boolean q10 = q(str2, f7344s, false);
        double r11 = r(str2, f7346u, -9.223372036854776E18d);
        long j12 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        double r12 = r(str2, f7347v, -9.223372036854776E18d);
        if (r12 != -9.223372036854776E18d) {
            j10 = (long) (r12 * 1000000.0d);
        }
        return new d.f(j11, q10, j12, j10, q(str2, f7348w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw ParserException.c(sb.toString(), (Throwable) null);
    }

    /* renamed from: i */
    public m5.d a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                c o10 = o(new a(arrayDeque, bufferedReader), uri.toString());
                                m0.o(bufferedReader);
                                return o10;
                            }
                        }
                    } else {
                        m0.o(bufferedReader);
                        throw ParserException.c("Failed to parse the playlist, could not identify any tags.", (Throwable) null);
                    }
                }
                arrayDeque.add(trim);
                return p(this.f7352a, this.f7353b, new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw ParserException.c("Input does not start with the #EXTM3U header.", (Throwable) null);
        } finally {
            m0.o(bufferedReader);
        }
    }

    public HlsPlaylistParser(c cVar, d dVar) {
        this.f7352a = cVar;
        this.f7353b = dVar;
    }
}
