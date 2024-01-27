package com.google.android.exoplayer2.mediacodec;

import a6.a;
import a6.m0;
import a6.p;
import a6.t;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import e4.j;
import h4.e;

/* compiled from: MediaCodecInfo */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f6988a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6990c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6991d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6992e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6993f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6994g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6995h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6996i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6997j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f6998k;

    i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f6988a = (String) a.e(str);
        this.f6989b = str2;
        this.f6990c = str3;
        this.f6991d = codecCapabilities;
        this.f6995h = z10;
        this.f6996i = z11;
        this.f6997j = z12;
        this.f6992e = z13;
        this.f6993f = z14;
        this.f6994g = z15;
        this.f6998k = t.s(str2);
    }

    public static i A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new i(str, str2, str3, codecCapabilities, z10, z11, z12, !z13 && codecCapabilities != null && h(codecCapabilities) && !y(str), codecCapabilities != null && r(codecCapabilities), z14 || (codecCapabilities != null && p(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((m0.f205a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i10);
        sb.append(" to ");
        sb.append(i11);
        sb.append("]");
        p.h("MediaCodecInfo", sb.toString());
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(m0.l(i10, widthAlignment) * widthAlignment, m0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] f(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.i.f(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f205a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f205a >= 21 && q(codecCapabilities);
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f205a >= 21 && s(codecCapabilities);
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String str) {
        String str2 = this.f6988a;
        String str3 = this.f6989b;
        String str4 = m0.f209e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        p.b("MediaCodecInfo", sb.toString());
    }

    private void v(String str) {
        String str2 = this.f6988a;
        String str3 = this.f6989b;
        String str4 = m0.f209e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        p.b("MediaCodecInfo", sb.toString());
    }

    private static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean x(String str) {
        return m0.f208d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean y(String str) {
        if (m0.f205a <= 22) {
            String str2 = m0.f208d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean z(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(m0.f206b);
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6991d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public e e(j jVar, j jVar2) {
        int i10 = !m0.c(jVar.f8096s, jVar2.f8096s) ? 8 : 0;
        if (this.f6998k) {
            if (jVar.A != jVar2.A) {
                i10 |= 1024;
            }
            if (!this.f6992e && !(jVar.f8101x == jVar2.f8101x && jVar.f8102y == jVar2.f8102y)) {
                i10 |= 512;
            }
            if (!m0.c(jVar.E, jVar2.E)) {
                i10 |= 2048;
            }
            if (x(this.f6988a) && !jVar.e(jVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new e(this.f6988a, jVar, jVar2, jVar.e(jVar2) ? 3 : 2, 0);
            }
        } else {
            if (jVar.F != jVar2.F) {
                i10 |= 4096;
            }
            if (jVar.G != jVar2.G) {
                i10 |= 8192;
            }
            if (jVar.H != jVar2.H) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f6989b)) {
                Pair<Integer, Integer> p10 = MediaCodecUtil.p(jVar);
                Pair<Integer, Integer> p11 = MediaCodecUtil.p(jVar2);
                if (!(p10 == null || p11 == null)) {
                    int intValue = ((Integer) p10.first).intValue();
                    int intValue2 = ((Integer) p11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new e(this.f6988a, jVar, jVar2, 3, 0);
                    }
                }
            }
            if (!jVar.e(jVar2)) {
                i10 |= 32;
            }
            if (w(this.f6989b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new e(this.f6988a, jVar, jVar2, 1, 0);
            }
        }
        return new e(this.f6988a, jVar, jVar2, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f6991d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.i.g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6991d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        } else if (a(this.f6988a, this.f6989b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i10);
            v(sb.toString());
            return false;
        }
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6991d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i10);
            v(sb.toString());
            return false;
        }
    }

    public boolean l(j jVar) {
        String g10;
        String str = jVar.f8093p;
        if (str == null || this.f6989b == null || (g10 = t.g(str)) == null) {
            return true;
        }
        if (!this.f6989b.equals(g10)) {
            String str2 = jVar.f8093p;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + g10.length());
            sb.append("codec.mime ");
            sb.append(str2);
            sb.append(", ");
            sb.append(g10);
            v(sb.toString());
            return false;
        }
        Pair<Integer, Integer> p10 = MediaCodecUtil.p(jVar);
        if (p10 == null) {
            return true;
        }
        int intValue = ((Integer) p10.first).intValue();
        int intValue2 = ((Integer) p10.second).intValue();
        if (!this.f6998k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g11 = g();
        if (m0.f205a <= 23 && "video/x-vnd.on2.vp9".equals(this.f6989b) && g11.length == 0) {
            g11 = f(this.f6991d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g11) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        String str3 = jVar.f8093p;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + g10.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(g10);
        v(sb2.toString());
        return false;
    }

    public boolean m(j jVar) {
        int i10;
        boolean z10 = false;
        if (!l(jVar)) {
            return false;
        }
        if (this.f6998k) {
            int i11 = jVar.f8101x;
            if (i11 <= 0 || (i10 = jVar.f8102y) <= 0) {
                return true;
            }
            if (m0.f205a >= 21) {
                return t(i11, i10, (double) jVar.f8103z);
            }
            if (i11 * i10 <= MediaCodecUtil.M()) {
                z10 = true;
            }
            if (!z10) {
                int i12 = jVar.f8101x;
                int i13 = jVar.f8102y;
                StringBuilder sb = new StringBuilder(40);
                sb.append("legacyFrameSize, ");
                sb.append(i12);
                sb.append("x");
                sb.append(i13);
                v(sb.toString());
            }
            return z10;
        }
        if (m0.f205a >= 21) {
            int i14 = jVar.G;
            if (i14 != -1 && !k(i14)) {
                return false;
            }
            int i15 = jVar.F;
            if (i15 == -1 || j(i15)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean n() {
        if (m0.f205a >= 29 && "video/x-vnd.on2.vp9".equals(this.f6989b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(j jVar) {
        if (this.f6998k) {
            return this.f6992e;
        }
        Pair<Integer, Integer> p10 = MediaCodecUtil.p(jVar);
        return p10 != null && ((Integer) p10.first).intValue() == 42;
    }

    public boolean t(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6991d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        } else if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 >= i11 || !z(this.f6988a) || !d(videoCapabilities, i11, i10, d10)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i10);
                sb.append("x");
                sb.append(i11);
                sb.append("x");
                sb.append(d10);
                v(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            sb2.append("x");
            sb2.append(d10);
            u(sb2.toString());
            return true;
        }
    }

    public String toString() {
        return this.f6988a;
    }
}
