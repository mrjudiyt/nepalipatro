package com.google.android.exoplayer2.mediacodec;

import a6.m0;
import a6.p;
import a6.t;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f6924a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<b, List<i>> f6925b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static int f6926c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6927a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6928b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6929c;

        public b(String str, boolean z10, boolean z11) {
            this.f6927a = str;
            this.f6928b = z10;
            this.f6929c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.f6927a, bVar.f6927a) && this.f6928b == bVar.f6928b && this.f6929c == bVar.f6929c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = 1231;
            int hashCode = (((this.f6927a.hashCode() + 31) * 31) + (this.f6928b ? 1231 : 1237)) * 31;
            if (!this.f6929c) {
                i10 = 1237;
            }
            return hashCode + i10;
        }
    }

    private interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public int d() {
            return MediaCodecList.getCodecCount();
        }

        public boolean e() {
            return false;
        }
    }

    private static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f6930a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f6931b;

        public e(boolean z10, boolean z11) {
            this.f6930a = (z10 || z11) ? 1 : 0;
        }

        private void f() {
            if (this.f6931b == null) {
                this.f6931b = new MediaCodecList(this.f6930a).getCodecInfos();
            }
        }

        public MediaCodecInfo a(int i10) {
            f();
            return this.f6931b[i10];
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public int d() {
            f();
            return this.f6931b.length;
        }

        public boolean e() {
            return true;
        }
    }

    private interface f<T> {
        int a(T t10);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean B(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = m0.f205a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = m0.f206b;
            if ("a70".equals(str3) || ("Xiaomi".equals(m0.f207c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = m0.f206b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = m0.f206b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(m0.f207c))) {
            String str6 = m0.f206b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(m0.f207c)) {
            String str7 = m0.f206b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && m0.f206b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (m0.f205a >= 29) {
            return D(mediaCodecInfo);
        }
        return !E(mediaCodecInfo);
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        if (m0.f205a >= 29) {
            return F(mediaCodecInfo);
        }
        String e10 = l6.c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        if (e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.") || ((e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.") || (!e10.startsWith("omx.") && !e10.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        if (m0.f205a >= 29) {
            return H(mediaCodecInfo);
        }
        String e10 = l6.c.e(mediaCodecInfo.getName());
        return !e10.startsWith("omx.google.") && !e10.startsWith("c2.android.") && !e10.startsWith("c2.google.");
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int I(i iVar) {
        String str = iVar.f6988a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (m0.f205a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int J(i iVar) {
        return iVar.f6988a.startsWith("OMX.google") ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int K(j jVar, i iVar) {
        try {
            return iVar.m(jVar) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int L(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static int M() {
        if (f6926c == -1) {
            int i10 = 0;
            i q10 = q("video/avc", false, false);
            if (q10 != null) {
                MediaCodecInfo.CodecProfileLevel[] g10 = q10.g();
                int length = g10.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(h(g10[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, m0.f205a >= 21 ? 345600 : 172800);
            }
            f6926c = i10;
        }
        return f6926c;
    }

    private static int N(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static <T> void O(List<T> list, f<T> fVar) {
        Collections.sort(list, new n(fVar));
    }

    private static int P(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int Q(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static void e(String str, List<i> list) {
        if ("audio/raw".equals(str)) {
            if (m0.f205a < 26 && m0.f206b.equals("R9") && list.size() == 1 && list.get(0).f6988a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.A("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            O(list, l.f7001a);
        }
        int i10 = m0.f205a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f6988a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                O(list, m.f7002a);
            }
        }
        if (i10 < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f6988a)) {
            list.add(list.remove(0));
        }
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case UserVerificationMethods.USER_VERIFY_HANDPRINT /*256*/:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case 9:
                return 512;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int N;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(t.h(Integer.parseInt(strArr[1], 16))) && (N = N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(N), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr, b6.b bVar) {
        int i10;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i11 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AV1 profile: ");
                sb.append(parseInt);
                p.h("MediaCodecUtil", sb.toString());
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    i11 = (bVar == null || !(bVar.f5017k != null || (i10 = bVar.f5016j) == 7 || i10 == 6)) ? 2 : 4096;
                }
                int f10 = f(parseInt2);
                if (f10 != -1) {
                    return new Pair<>(Integer.valueOf(i11), Integer.valueOf(f10));
                }
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown AV1 level: ");
                sb2.append(parseInt2);
                p.h("MediaCodecUtil", sb2.toString());
                return null;
            } else {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(parseInt3);
                p.h("MediaCodecUtil", sb3.toString());
                return null;
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = parseInt;
            } else {
                String valueOf2 = String.valueOf(str);
                p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AVC profile: ");
                sb.append(i11);
                p.h("MediaCodecUtil", sb.toString());
                return null;
            }
            int g10 = g(i10);
            if (g10 != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(g10));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown AVC level: ");
            sb2.append(i10);
            p.h("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    private static String o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> p(e4.j r6) {
        /*
            java.lang.String r0 = r6.f8093p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f8096s
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f8093p
            android.util.Pair r6 = v(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = -1
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f8093p
            android.util.Pair r6 = x(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f8093p
            android.util.Pair r6 = l(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f8093p
            android.util.Pair r6 = w(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f8093p
            android.util.Pair r6 = n(r6, r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f8093p
            b6.b r6 = r6.E
            android.util.Pair r6 = m(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.p(e4.j):android.util.Pair");
    }

    public static i q(String str, boolean z10, boolean z11) {
        List<i> r10 = r(str, z10, z11);
        if (r10.isEmpty()) {
            return null;
        }
        return r10.get(0);
    }

    public static synchronized List<i> r(String str, boolean z10, boolean z11) {
        c cVar;
        synchronized (MediaCodecUtil.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<i>> hashMap = f6925b;
            List<i> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = m0.f205a;
            if (i10 >= 21) {
                cVar = new e(z10, z11);
            } else {
                cVar = new d();
            }
            ArrayList<i> s10 = s(bVar, cVar);
            if (z10 && s10.isEmpty() && 21 <= i10 && i10 <= 23) {
                s10 = s(bVar, new d());
                if (!s10.isEmpty()) {
                    String str2 = s10.get(0).f6988a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    p.h("MediaCodecUtil", sb.toString());
                }
            }
            e(str, s10);
            List<i> unmodifiableList = Collections.unmodifiableList(s10);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3 A[SYNTHETIC, Splitter:B:48:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0116 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.i> s(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b r24, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c r25) {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014c }
            r5.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = r1.f6927a     // Catch:{ Exception -> 0x014c }
            int r14 = r25.d()     // Catch:{ Exception -> 0x014c }
            boolean r13 = r25.e()     // Catch:{ Exception -> 0x014c }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x014b
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x014c }
            boolean r6 = z(r0)     // Catch:{ Exception -> 0x014c }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x010e
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014c }
            boolean r6 = B(r0, r11, r13, r15)     // Catch:{ Exception -> 0x014c }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = o(r0, r11, r15)     // Catch:{ Exception -> 0x014c }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00d0 }
            boolean r6 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x00d0 }
            boolean r7 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x00d0 }
            boolean r8 = r1.f6929c     // Catch:{ Exception -> 0x00d0 }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x00d0 }
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x00d0 }
            boolean r8 = r1.f6928b     // Catch:{ Exception -> 0x00d0 }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = C(r0)     // Catch:{ Exception -> 0x00d0 }
            boolean r17 = E(r0)     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = G(r0)     // Catch:{ Exception -> 0x00d0 }
            if (r13 == 0) goto L_0x007b
            boolean r7 = r1.f6928b     // Catch:{ Exception -> 0x00d0 }
            if (r7 == r6) goto L_0x0081
        L_0x007b:
            if (r13 != 0) goto L_0x00a6
            boolean r7 = r1.f6928b     // Catch:{ Exception -> 0x00d0 }
            if (r7 != 0) goto L_0x00a6
        L_0x0081:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            com.google.android.exoplayer2.mediacodec.i r0 = com.google.android.exoplayer2.mediacodec.i.A(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x010e
        L_0x00a4:
            r0 = move-exception
            goto L_0x00db
        L_0x00a6:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x010e
            if (r6 == 0) goto L_0x010e
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = ".secure"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x00a4 }
            r13 = 0
            r14 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            com.google.android.exoplayer2.mediacodec.i r0 = com.google.android.exoplayer2.mediacodec.i.A(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            return r5
        L_0x00d0:
            r0 = move-exception
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00db:
            int r6 = a6.m0.f205a     // Catch:{ Exception -> 0x014c }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0116
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014c }
            if (r6 != 0) goto L_0x0116
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x014c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x014c }
            int r0 = r0 + 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r6.<init>(r0)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "Skipping codec "
            r6.append(r0)     // Catch:{ Exception -> 0x014c }
            r7 = r21
            r6.append(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = " (failed to query capabilities)"
            r6.append(r0)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x014c }
            a6.p.c(r8, r0)     // Catch:{ Exception -> 0x014c }
        L_0x010e:
            int r12 = r22 + 1
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x0116:
            r7 = r21
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x014c }
            int r1 = r1.length()     // Catch:{ Exception -> 0x014c }
            int r1 = r1 + 25
            int r2 = r20.length()     // Catch:{ Exception -> 0x014c }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x014c }
            r2.append(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014c }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014c }
            a6.p.c(r8, r1)     // Catch:{ Exception -> 0x014c }
            throw r0     // Catch:{ Exception -> 0x014c }
        L_0x014b:
            return r5
        L_0x014c:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.s(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    public static List<i> t(List<i> list, j jVar) {
        ArrayList arrayList = new ArrayList(list);
        O(arrayList, new k(jVar));
        return arrayList;
    }

    public static i u() {
        return q("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> v(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f6924a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer k10 = k(group);
        if (k10 == null) {
            String valueOf3 = String.valueOf(group);
            p.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer j10 = j(str2);
        if (j10 != null) {
            return new Pair<>(k10, j10);
        }
        String valueOf4 = String.valueOf(str2);
        p.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i10 = 1;
        Matcher matcher = f6924a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(group)) {
            if ("2".equals(group)) {
                i10 = 2;
            } else {
                String valueOf3 = String.valueOf(group);
                p.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
        }
        String str2 = strArr[3];
        Integer y10 = y(str2);
        if (y10 != null) {
            return new Pair<>(Integer.valueOf(i10), y10);
        }
        String valueOf4 = String.valueOf(str2);
        p.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int Q = Q(parseInt);
            if (Q == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown VP9 profile: ");
                sb.append(parseInt);
                p.h("MediaCodecUtil", sb.toString());
                return null;
            }
            int P = P(parseInt2);
            if (P != -1) {
                return new Pair<>(Integer.valueOf(Q), Integer.valueOf(P));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown VP9 level: ");
            sb2.append(parseInt2);
            p.h("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            p.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    private static Integer y(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return Integer.valueOf(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return m0.f205a >= 29 && A(mediaCodecInfo);
    }
}
