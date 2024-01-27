package b6;

import a6.j0;
import a6.m0;
import a6.p;
import a6.s;
import a6.t;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import b6.x;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.mediacodec.i;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e4.k;
import e4.r;
import h4.d;
import h4.e;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaCodecVideoRenderer */
public class g extends MediaCodecRenderer {
    private static boolean A1;

    /* renamed from: y1  reason: collision with root package name */
    private static final int[] f5049y1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: z1  reason: collision with root package name */
    private static boolean f5050z1;
    private final Context P0;
    private final j Q0;
    private final x.a R0;
    private final long S0;
    private final int T0;
    private final boolean U0;
    private a V0;
    private boolean W0;
    private boolean X0;
    private Surface Y0;
    private d Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f5051a1;

    /* renamed from: b1  reason: collision with root package name */
    private int f5052b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f5053c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f5054d1;

    /* renamed from: e1  reason: collision with root package name */
    private boolean f5055e1;

    /* renamed from: f1  reason: collision with root package name */
    private long f5056f1;

    /* renamed from: g1  reason: collision with root package name */
    private long f5057g1;

    /* renamed from: h1  reason: collision with root package name */
    private long f5058h1;

    /* renamed from: i1  reason: collision with root package name */
    private int f5059i1;

    /* renamed from: j1  reason: collision with root package name */
    private int f5060j1;

    /* renamed from: k1  reason: collision with root package name */
    private int f5061k1;

    /* renamed from: l1  reason: collision with root package name */
    private long f5062l1;

    /* renamed from: m1  reason: collision with root package name */
    private long f5063m1;

    /* renamed from: n1  reason: collision with root package name */
    private long f5064n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f5065o1;

    /* renamed from: p1  reason: collision with root package name */
    private int f5066p1;

    /* renamed from: q1  reason: collision with root package name */
    private int f5067q1;

    /* renamed from: r1  reason: collision with root package name */
    private int f5068r1;

    /* renamed from: s1  reason: collision with root package name */
    private float f5069s1;

    /* renamed from: t1  reason: collision with root package name */
    private z f5070t1;

    /* renamed from: u1  reason: collision with root package name */
    private boolean f5071u1;

    /* renamed from: v1  reason: collision with root package name */
    private int f5072v1;

    /* renamed from: w1  reason: collision with root package name */
    b f5073w1;

    /* renamed from: x1  reason: collision with root package name */
    private h f5074x1;

    /* compiled from: MediaCodecVideoRenderer */
    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5075a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5076b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5077c;

        public a(int i10, int i11, int i12) {
            this.f5075a = i10;
            this.f5076b = i11;
            this.f5077c = i12;
        }
    }

    /* compiled from: MediaCodecVideoRenderer */
    private final class b implements h.c, Handler.Callback {

        /* renamed from: h  reason: collision with root package name */
        private final Handler f5078h;

        public b(h hVar) {
            Handler y10 = m0.y(this);
            this.f5078h = y10;
            hVar.g(this, y10);
        }

        private void b(long j10) {
            g gVar = g.this;
            if (this == gVar.f5073w1) {
                if (j10 == Long.MAX_VALUE) {
                    gVar.Q1();
                    return;
                }
                try {
                    gVar.P1(j10);
                } catch (ExoPlaybackException e10) {
                    g.this.g1(e10);
                }
            }
        }

        public void a(h hVar, long j10, long j11) {
            if (m0.f205a < 30) {
                this.f5078h.sendMessageAtFrontOfQueue(Message.obtain(this.f5078h, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(m0.J0(message.arg1, message.arg2));
            return true;
        }
    }

    public g(Context context, j jVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        this(context, h.b.f6987a, jVar, j10, z10, handler, xVar, i10);
    }

    private static Point A1(i iVar, e4.j jVar) {
        int i10 = jVar.f8102y;
        int i11 = jVar.f8101x;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = ((float) i10) / ((float) i12);
        for (int i13 : f5049y1) {
            int i14 = (int) (((float) i13) * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (m0.f205a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = iVar.b(i15, i13);
                if (iVar.t(b10.x, b10.y, (double) jVar.f8103z)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = m0.l(i13, 16) * 16;
                    int l11 = m0.l(i14, 16) * 16;
                    if (l10 * l11 <= MediaCodecUtil.M()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List<i> C1(j jVar, e4.j jVar2, boolean z10, boolean z11) {
        Pair<Integer, Integer> p10;
        String str = jVar2.f8096s;
        if (str == null) {
            return Collections.emptyList();
        }
        List<i> t10 = MediaCodecUtil.t(jVar.a(str, z10, z11), jVar2);
        if ("video/dolby-vision".equals(str) && (p10 = MediaCodecUtil.p(jVar2)) != null) {
            int intValue = ((Integer) p10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                t10.addAll(jVar.a("video/hevc", z10, z11));
            } else if (intValue == 512) {
                t10.addAll(jVar.a("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(t10);
    }

    protected static int D1(i iVar, e4.j jVar) {
        if (jVar.f8097t == -1) {
            return z1(iVar, jVar.f8096s, jVar.f8101x, jVar.f8102y);
        }
        int size = jVar.f8098u.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += jVar.f8098u.get(i11).length;
        }
        return jVar.f8097t + i10;
    }

    private static boolean F1(long j10) {
        return j10 < -30000;
    }

    private static boolean G1(long j10) {
        return j10 < -500000;
    }

    private void I1() {
        if (this.f5059i1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R0.n(this.f5059i1, elapsedRealtime - this.f5058h1);
            this.f5059i1 = 0;
            this.f5058h1 = elapsedRealtime;
        }
    }

    private void K1() {
        int i10 = this.f5065o1;
        if (i10 != 0) {
            this.R0.B(this.f5064n1, i10);
            this.f5064n1 = 0;
            this.f5065o1 = 0;
        }
    }

    private void L1() {
        int i10 = this.f5066p1;
        if (i10 != -1 || this.f5067q1 != -1) {
            z zVar = this.f5070t1;
            if (zVar == null || zVar.f5137a != i10 || zVar.f5138b != this.f5067q1 || zVar.f5139c != this.f5068r1 || zVar.f5140d != this.f5069s1) {
                z zVar2 = new z(this.f5066p1, this.f5067q1, this.f5068r1, this.f5069s1);
                this.f5070t1 = zVar2;
                this.R0.D(zVar2);
            }
        }
    }

    private void M1() {
        if (this.f5051a1) {
            this.R0.A(this.Y0);
        }
    }

    private void N1() {
        z zVar = this.f5070t1;
        if (zVar != null) {
            this.R0.D(zVar);
        }
    }

    private void O1(long j10, long j11, e4.j jVar) {
        h hVar = this.f5074x1;
        if (hVar != null) {
            hVar.i(j10, j11, jVar, u0());
        }
    }

    /* access modifiers changed from: private */
    public void Q1() {
        f1();
    }

    private static void T1(h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.c(bundle);
    }

    private void U1() {
        this.f5057g1 = this.S0 > 0 ? SystemClock.elapsedRealtime() + this.S0 : -9223372036854775807L;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void V1(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            b6.d r0 = r4.Z0
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            com.google.android.exoplayer2.mediacodec.i r0 = r4.r0()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.a2(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.P0
            boolean r0 = r0.f6994g
            b6.d r5 = b6.d.d(r5, r0)
            r4.Z0 = r5
        L_0x0026:
            android.view.Surface r0 = r4.Y0
            if (r0 == r5) goto L_0x006e
            r4.Y0 = r5
            b6.j r0 = r4.Q0
            r0.o(r5)
            r0 = 0
            r4.f5051a1 = r0
            int r0 = r4.d()
            com.google.android.exoplayer2.mediacodec.h r1 = r4.q0()
            if (r1 == 0) goto L_0x0054
            int r2 = a6.m0.f205a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.W0
            if (r2 != 0) goto L_0x004e
            r4.W1(r1, r5)
            goto L_0x0054
        L_0x004e:
            r4.Y0()
            r4.I0()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            b6.d r1 = r4.Z0
            if (r5 == r1) goto L_0x0067
            r4.N1()
            r4.s1()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.U1()
            goto L_0x007a
        L_0x0067:
            r4.t1()
            r4.s1()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            b6.d r0 = r4.Z0
            if (r5 == r0) goto L_0x007a
            r4.N1()
            r4.M1()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.g.V1(java.lang.Object):void");
    }

    private boolean a2(i iVar) {
        return m0.f205a >= 23 && !this.f5071u1 && !u1(iVar.f6988a) && (!iVar.f6994g || d.c(this.P0));
    }

    private void s1() {
        h q02;
        this.f5053c1 = false;
        if (m0.f205a >= 23 && this.f5071u1 && (q02 = q0()) != null) {
            this.f5073w1 = new b(q02);
        }
    }

    private void t1() {
        this.f5070t1 = null;
    }

    private static void v1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean w1() {
        return "NVIDIA".equals(m0.f207c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07cf, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0831, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x084d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean y1() {
        /*
            int r0 = a6.m0.f205a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x006d
            java.lang.String r10 = a6.m0.f206b
            r10.hashCode()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x005e;
                case -1220081023: goto L_0x0053;
                case -1220066608: goto L_0x0048;
                case -1012436106: goto L_0x003d;
                case -64886864: goto L_0x0032;
                case 3415681: goto L_0x0027;
                case 825323514: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r10 = -1
            goto L_0x0068
        L_0x001c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r10 = 6
            goto L_0x0068
        L_0x0027:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r10 = 5
            goto L_0x0068
        L_0x0032:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r10 = 4
            goto L_0x0068
        L_0x003d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            r10 = 3
            goto L_0x0068
        L_0x0048:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            r10 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x001a
        L_0x005c:
            r10 = 1
            goto L_0x0068
        L_0x005e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r10 = 0
        L_0x0068:
            switch(r10) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006c;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            return r9
        L_0x006d:
            r10 = 27
            if (r0 > r10) goto L_0x007c
            java.lang.String r11 = a6.m0.f206b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x007c
            return r9
        L_0x007c:
            r11 = 26
            if (r0 > r11) goto L_0x084e
            java.lang.String r0 = a6.m0.f206b
            r0.hashCode()
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x080f;
                case -2144781185: goto L_0x0803;
                case -2144781160: goto L_0x07f7;
                case -2097309513: goto L_0x07eb;
                case -2022874474: goto L_0x07df;
                case -1978993182: goto L_0x07d3;
                case -1978990237: goto L_0x07c9;
                case -1936688988: goto L_0x07bd;
                case -1936688066: goto L_0x07b0;
                case -1936688065: goto L_0x07a2;
                case -1931988508: goto L_0x0794;
                case -1885099851: goto L_0x0786;
                case -1696512866: goto L_0x0778;
                case -1680025915: goto L_0x076a;
                case -1615810839: goto L_0x075c;
                case -1600724499: goto L_0x074e;
                case -1554255044: goto L_0x0740;
                case -1481772737: goto L_0x0732;
                case -1481772730: goto L_0x0724;
                case -1481772729: goto L_0x0716;
                case -1320080169: goto L_0x0708;
                case -1217592143: goto L_0x06fa;
                case -1180384755: goto L_0x06ec;
                case -1139198265: goto L_0x06de;
                case -1052835013: goto L_0x06d0;
                case -993250464: goto L_0x06c2;
                case -993250458: goto L_0x06b4;
                case -965403638: goto L_0x06a6;
                case -958336948: goto L_0x0698;
                case -879245230: goto L_0x068a;
                case -842500323: goto L_0x067c;
                case -821392978: goto L_0x066e;
                case -797483286: goto L_0x0660;
                case -794946968: goto L_0x0652;
                case -788334647: goto L_0x0644;
                case -782144577: goto L_0x0636;
                case -575125681: goto L_0x0628;
                case -521118391: goto L_0x061a;
                case -430914369: goto L_0x060c;
                case -290434366: goto L_0x05fe;
                case -282781963: goto L_0x05f0;
                case -277133239: goto L_0x05e2;
                case -173639913: goto L_0x05d4;
                case -56598463: goto L_0x05c6;
                case 2126: goto L_0x05b8;
                case 2564: goto L_0x05aa;
                case 2715: goto L_0x059c;
                case 2719: goto L_0x058e;
                case 3091: goto L_0x0580;
                case 3483: goto L_0x0572;
                case 73405: goto L_0x0564;
                case 75537: goto L_0x0556;
                case 75739: goto L_0x0548;
                case 76779: goto L_0x053a;
                case 78669: goto L_0x052c;
                case 79305: goto L_0x051e;
                case 80618: goto L_0x0510;
                case 88274: goto L_0x0502;
                case 98846: goto L_0x04f4;
                case 98848: goto L_0x04e6;
                case 99329: goto L_0x04d8;
                case 101481: goto L_0x04ca;
                case 1513190: goto L_0x04bc;
                case 1514184: goto L_0x04ae;
                case 1514185: goto L_0x04a0;
                case 2133089: goto L_0x0492;
                case 2133091: goto L_0x0484;
                case 2133120: goto L_0x0476;
                case 2133151: goto L_0x0468;
                case 2133182: goto L_0x045a;
                case 2133184: goto L_0x044c;
                case 2436959: goto L_0x043e;
                case 2463773: goto L_0x0430;
                case 2464648: goto L_0x0422;
                case 2689555: goto L_0x0414;
                case 3154429: goto L_0x0406;
                case 3284551: goto L_0x03f8;
                case 3351335: goto L_0x03ea;
                case 3386211: goto L_0x03dc;
                case 41325051: goto L_0x03ce;
                case 51349633: goto L_0x03c0;
                case 51350594: goto L_0x03b2;
                case 55178625: goto L_0x03a4;
                case 61542055: goto L_0x0396;
                case 65355429: goto L_0x0388;
                case 66214468: goto L_0x037a;
                case 66214470: goto L_0x036c;
                case 66214473: goto L_0x035e;
                case 66215429: goto L_0x0350;
                case 66215431: goto L_0x0342;
                case 66215433: goto L_0x0334;
                case 66216390: goto L_0x0326;
                case 76402249: goto L_0x0318;
                case 76404105: goto L_0x030a;
                case 76404911: goto L_0x02fc;
                case 80963634: goto L_0x02ee;
                case 82882791: goto L_0x02e0;
                case 98715550: goto L_0x02d2;
                case 101370885: goto L_0x02c4;
                case 102844228: goto L_0x02b6;
                case 165221241: goto L_0x02a8;
                case 182191441: goto L_0x029a;
                case 245388979: goto L_0x028c;
                case 287431619: goto L_0x027e;
                case 307593612: goto L_0x0270;
                case 308517133: goto L_0x0262;
                case 316215098: goto L_0x0254;
                case 316215116: goto L_0x0246;
                case 316246811: goto L_0x0238;
                case 316246818: goto L_0x022a;
                case 407160593: goto L_0x021c;
                case 507412548: goto L_0x020e;
                case 793982701: goto L_0x0200;
                case 794038622: goto L_0x01f2;
                case 794040393: goto L_0x01e4;
                case 835649806: goto L_0x01d6;
                case 917340916: goto L_0x01c8;
                case 958008161: goto L_0x01ba;
                case 1060579533: goto L_0x01ac;
                case 1150207623: goto L_0x019e;
                case 1176899427: goto L_0x0190;
                case 1280332038: goto L_0x0182;
                case 1306947716: goto L_0x0174;
                case 1349174697: goto L_0x0166;
                case 1522194893: goto L_0x0158;
                case 1691543273: goto L_0x014a;
                case 1691544261: goto L_0x013c;
                case 1709443163: goto L_0x012e;
                case 1865889110: goto L_0x0120;
                case 1906253259: goto L_0x0112;
                case 1977196784: goto L_0x0104;
                case 2006372676: goto L_0x00f7;
                case 2019281702: goto L_0x00ea;
                case 2029784656: goto L_0x00dd;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c3;
                case 2047190025: goto L_0x00b6;
                case 2047252157: goto L_0x00a9;
                case 2048319463: goto L_0x009c;
                case 2048855701: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r1 = -1
            goto L_0x081a
        L_0x008f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x008c
        L_0x0098:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x081a
        L_0x009c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x008c
        L_0x00a5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x081a
        L_0x00a9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x081a
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x008c
        L_0x00bf:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x081a
        L_0x00c3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x081a
        L_0x00d0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x008c
        L_0x00d9:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x081a
        L_0x00dd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x008c
        L_0x00e6:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x081a
        L_0x00ea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x008c
        L_0x00f3:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x081a
        L_0x00f7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x008c
        L_0x0100:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x081a
        L_0x0104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            goto L_0x008c
        L_0x010e:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x081a
        L_0x0112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            goto L_0x008c
        L_0x011c:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x081a
        L_0x0120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x008c
        L_0x012a:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x081a
        L_0x012e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0138
            goto L_0x008c
        L_0x0138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x081a
        L_0x013c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x008c
        L_0x0146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x081a
        L_0x014a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x008c
        L_0x0154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x081a
        L_0x0158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0162
            goto L_0x008c
        L_0x0162:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x081a
        L_0x0166:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0170
            goto L_0x008c
        L_0x0170:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x081a
        L_0x0174:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017e
            goto L_0x008c
        L_0x017e:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x081a
        L_0x0182:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018c
            goto L_0x008c
        L_0x018c:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x081a
        L_0x0190:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019a
            goto L_0x008c
        L_0x019a:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x081a
        L_0x019e:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a8
            goto L_0x008c
        L_0x01a8:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x081a
        L_0x01ac:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x008c
        L_0x01b6:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x081a
        L_0x01ba:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c4
            goto L_0x008c
        L_0x01c4:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x081a
        L_0x01c8:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d2
            goto L_0x008c
        L_0x01d2:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x081a
        L_0x01d6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e0
            goto L_0x008c
        L_0x01e0:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x081a
        L_0x01e4:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ee
            goto L_0x008c
        L_0x01ee:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x081a
        L_0x01f2:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fc
            goto L_0x008c
        L_0x01fc:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x081a
        L_0x0200:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020a
            goto L_0x008c
        L_0x020a:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x081a
        L_0x020e:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0218
            goto L_0x008c
        L_0x0218:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x081a
        L_0x021c:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0226
            goto L_0x008c
        L_0x0226:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x081a
        L_0x022a:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0234
            goto L_0x008c
        L_0x0234:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x081a
        L_0x0238:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0242
            goto L_0x008c
        L_0x0242:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x081a
        L_0x0246:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0250
            goto L_0x008c
        L_0x0250:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x081a
        L_0x0254:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025e
            goto L_0x008c
        L_0x025e:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x081a
        L_0x0262:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026c
            goto L_0x008c
        L_0x026c:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x081a
        L_0x0270:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027a
            goto L_0x008c
        L_0x027a:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x081a
        L_0x027e:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0288
            goto L_0x008c
        L_0x0288:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x081a
        L_0x028c:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0296
            goto L_0x008c
        L_0x0296:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x081a
        L_0x029a:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a4
            goto L_0x008c
        L_0x02a4:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x081a
        L_0x02a8:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b2
            goto L_0x008c
        L_0x02b2:
            r1 = 100
            goto L_0x081a
        L_0x02b6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c0
            goto L_0x008c
        L_0x02c0:
            r1 = 99
            goto L_0x081a
        L_0x02c4:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ce
            goto L_0x008c
        L_0x02ce:
            r1 = 98
            goto L_0x081a
        L_0x02d2:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02dc
            goto L_0x008c
        L_0x02dc:
            r1 = 97
            goto L_0x081a
        L_0x02e0:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x008c
        L_0x02ea:
            r1 = 96
            goto L_0x081a
        L_0x02ee:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f8
            goto L_0x008c
        L_0x02f8:
            r1 = 95
            goto L_0x081a
        L_0x02fc:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0306
            goto L_0x008c
        L_0x0306:
            r1 = 94
            goto L_0x081a
        L_0x030a:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0314
            goto L_0x008c
        L_0x0314:
            r1 = 93
            goto L_0x081a
        L_0x0318:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x008c
        L_0x0322:
            r1 = 92
            goto L_0x081a
        L_0x0326:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0330
            goto L_0x008c
        L_0x0330:
            r1 = 91
            goto L_0x081a
        L_0x0334:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033e
            goto L_0x008c
        L_0x033e:
            r1 = 90
            goto L_0x081a
        L_0x0342:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034c
            goto L_0x008c
        L_0x034c:
            r1 = 89
            goto L_0x081a
        L_0x0350:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035a
            goto L_0x008c
        L_0x035a:
            r1 = 88
            goto L_0x081a
        L_0x035e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0368
            goto L_0x008c
        L_0x0368:
            r1 = 87
            goto L_0x081a
        L_0x036c:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0376
            goto L_0x008c
        L_0x0376:
            r1 = 86
            goto L_0x081a
        L_0x037a:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0384
            goto L_0x008c
        L_0x0384:
            r1 = 85
            goto L_0x081a
        L_0x0388:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0392
            goto L_0x008c
        L_0x0392:
            r1 = 84
            goto L_0x081a
        L_0x0396:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a0
            goto L_0x008c
        L_0x03a0:
            r1 = 83
            goto L_0x081a
        L_0x03a4:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ae
            goto L_0x008c
        L_0x03ae:
            r1 = 82
            goto L_0x081a
        L_0x03b2:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bc
            goto L_0x008c
        L_0x03bc:
            r1 = 81
            goto L_0x081a
        L_0x03c0:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ca
            goto L_0x008c
        L_0x03ca:
            r1 = 80
            goto L_0x081a
        L_0x03ce:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d8
            goto L_0x008c
        L_0x03d8:
            r1 = 79
            goto L_0x081a
        L_0x03dc:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e6
            goto L_0x008c
        L_0x03e6:
            r1 = 78
            goto L_0x081a
        L_0x03ea:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f4
            goto L_0x008c
        L_0x03f4:
            r1 = 77
            goto L_0x081a
        L_0x03f8:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0402
            goto L_0x008c
        L_0x0402:
            r1 = 76
            goto L_0x081a
        L_0x0406:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0410
            goto L_0x008c
        L_0x0410:
            r1 = 75
            goto L_0x081a
        L_0x0414:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041e
            goto L_0x008c
        L_0x041e:
            r1 = 74
            goto L_0x081a
        L_0x0422:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042c
            goto L_0x008c
        L_0x042c:
            r1 = 73
            goto L_0x081a
        L_0x0430:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043a
            goto L_0x008c
        L_0x043a:
            r1 = 72
            goto L_0x081a
        L_0x043e:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0448
            goto L_0x008c
        L_0x0448:
            r1 = 71
            goto L_0x081a
        L_0x044c:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0456
            goto L_0x008c
        L_0x0456:
            r1 = 70
            goto L_0x081a
        L_0x045a:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0464
            goto L_0x008c
        L_0x0464:
            r1 = 69
            goto L_0x081a
        L_0x0468:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0472
            goto L_0x008c
        L_0x0472:
            r1 = 68
            goto L_0x081a
        L_0x0476:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0480
            goto L_0x008c
        L_0x0480:
            r1 = 67
            goto L_0x081a
        L_0x0484:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048e
            goto L_0x008c
        L_0x048e:
            r1 = 66
            goto L_0x081a
        L_0x0492:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049c
            goto L_0x008c
        L_0x049c:
            r1 = 65
            goto L_0x081a
        L_0x04a0:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04aa
            goto L_0x008c
        L_0x04aa:
            r1 = 64
            goto L_0x081a
        L_0x04ae:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b8
            goto L_0x008c
        L_0x04b8:
            r1 = 63
            goto L_0x081a
        L_0x04bc:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c6
            goto L_0x008c
        L_0x04c6:
            r1 = 62
            goto L_0x081a
        L_0x04ca:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d4
            goto L_0x008c
        L_0x04d4:
            r1 = 61
            goto L_0x081a
        L_0x04d8:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e2
            goto L_0x008c
        L_0x04e2:
            r1 = 60
            goto L_0x081a
        L_0x04e6:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f0
            goto L_0x008c
        L_0x04f0:
            r1 = 59
            goto L_0x081a
        L_0x04f4:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fe
            goto L_0x008c
        L_0x04fe:
            r1 = 58
            goto L_0x081a
        L_0x0502:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050c
            goto L_0x008c
        L_0x050c:
            r1 = 57
            goto L_0x081a
        L_0x0510:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051a
            goto L_0x008c
        L_0x051a:
            r1 = 56
            goto L_0x081a
        L_0x051e:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0528
            goto L_0x008c
        L_0x0528:
            r1 = 55
            goto L_0x081a
        L_0x052c:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0536
            goto L_0x008c
        L_0x0536:
            r1 = 54
            goto L_0x081a
        L_0x053a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0544
            goto L_0x008c
        L_0x0544:
            r1 = 53
            goto L_0x081a
        L_0x0548:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0552
            goto L_0x008c
        L_0x0552:
            r1 = 52
            goto L_0x081a
        L_0x0556:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0560
            goto L_0x008c
        L_0x0560:
            r1 = 51
            goto L_0x081a
        L_0x0564:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056e
            goto L_0x008c
        L_0x056e:
            r1 = 50
            goto L_0x081a
        L_0x0572:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057c
            goto L_0x008c
        L_0x057c:
            r1 = 49
            goto L_0x081a
        L_0x0580:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058a
            goto L_0x008c
        L_0x058a:
            r1 = 48
            goto L_0x081a
        L_0x058e:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0598
            goto L_0x008c
        L_0x0598:
            r1 = 47
            goto L_0x081a
        L_0x059c:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a6
            goto L_0x008c
        L_0x05a6:
            r1 = 46
            goto L_0x081a
        L_0x05aa:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b4
            goto L_0x008c
        L_0x05b4:
            r1 = 45
            goto L_0x081a
        L_0x05b8:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c2
            goto L_0x008c
        L_0x05c2:
            r1 = 44
            goto L_0x081a
        L_0x05c6:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d0
            goto L_0x008c
        L_0x05d0:
            r1 = 43
            goto L_0x081a
        L_0x05d4:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05de
            goto L_0x008c
        L_0x05de:
            r1 = 42
            goto L_0x081a
        L_0x05e2:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ec
            goto L_0x008c
        L_0x05ec:
            r1 = 41
            goto L_0x081a
        L_0x05f0:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05fa
            goto L_0x008c
        L_0x05fa:
            r1 = 40
            goto L_0x081a
        L_0x05fe:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0608
            goto L_0x008c
        L_0x0608:
            r1 = 39
            goto L_0x081a
        L_0x060c:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0616
            goto L_0x008c
        L_0x0616:
            r1 = 38
            goto L_0x081a
        L_0x061a:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0624
            goto L_0x008c
        L_0x0624:
            r1 = 37
            goto L_0x081a
        L_0x0628:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0632
            goto L_0x008c
        L_0x0632:
            r1 = 36
            goto L_0x081a
        L_0x0636:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0640
            goto L_0x008c
        L_0x0640:
            r1 = 35
            goto L_0x081a
        L_0x0644:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064e
            goto L_0x008c
        L_0x064e:
            r1 = 34
            goto L_0x081a
        L_0x0652:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065c
            goto L_0x008c
        L_0x065c:
            r1 = 33
            goto L_0x081a
        L_0x0660:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x066a
            goto L_0x008c
        L_0x066a:
            r1 = 32
            goto L_0x081a
        L_0x066e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0678
            goto L_0x008c
        L_0x0678:
            r1 = 31
            goto L_0x081a
        L_0x067c:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0686
            goto L_0x008c
        L_0x0686:
            r1 = 30
            goto L_0x081a
        L_0x068a:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0694
            goto L_0x008c
        L_0x0694:
            r1 = 29
            goto L_0x081a
        L_0x0698:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a2
            goto L_0x008c
        L_0x06a2:
            r1 = 28
            goto L_0x081a
        L_0x06a6:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b0
            goto L_0x008c
        L_0x06b0:
            r1 = 27
            goto L_0x081a
        L_0x06b4:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06be
            goto L_0x008c
        L_0x06be:
            r1 = 26
            goto L_0x081a
        L_0x06c2:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06cc
            goto L_0x008c
        L_0x06cc:
            r1 = 25
            goto L_0x081a
        L_0x06d0:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06da
            goto L_0x008c
        L_0x06da:
            r1 = 24
            goto L_0x081a
        L_0x06de:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e8
            goto L_0x008c
        L_0x06e8:
            r1 = 23
            goto L_0x081a
        L_0x06ec:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f6
            goto L_0x008c
        L_0x06f6:
            r1 = 22
            goto L_0x081a
        L_0x06fa:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0704
            goto L_0x008c
        L_0x0704:
            r1 = 21
            goto L_0x081a
        L_0x0708:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0712
            goto L_0x008c
        L_0x0712:
            r1 = 20
            goto L_0x081a
        L_0x0716:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x008c
        L_0x0720:
            r1 = 19
            goto L_0x081a
        L_0x0724:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072e
            goto L_0x008c
        L_0x072e:
            r1 = 18
            goto L_0x081a
        L_0x0732:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073c
            goto L_0x008c
        L_0x073c:
            r1 = 17
            goto L_0x081a
        L_0x0740:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074a
            goto L_0x008c
        L_0x074a:
            r1 = 16
            goto L_0x081a
        L_0x074e:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0758
            goto L_0x008c
        L_0x0758:
            r1 = 15
            goto L_0x081a
        L_0x075c:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0766
            goto L_0x008c
        L_0x0766:
            r1 = 14
            goto L_0x081a
        L_0x076a:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0774
            goto L_0x008c
        L_0x0774:
            r1 = 13
            goto L_0x081a
        L_0x0778:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0782
            goto L_0x008c
        L_0x0782:
            r1 = 12
            goto L_0x081a
        L_0x0786:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0790
            goto L_0x008c
        L_0x0790:
            r1 = 11
            goto L_0x081a
        L_0x0794:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079e
            goto L_0x008c
        L_0x079e:
            r1 = 10
            goto L_0x081a
        L_0x07a2:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ac
            goto L_0x008c
        L_0x07ac:
            r1 = 9
            goto L_0x081a
        L_0x07b0:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ba
            goto L_0x008c
        L_0x07ba:
            r1 = 8
            goto L_0x081a
        L_0x07bd:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c7
            goto L_0x008c
        L_0x07c7:
            r1 = 7
            goto L_0x081a
        L_0x07c9:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x081a
            goto L_0x008c
        L_0x07d3:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07dd
            goto L_0x008c
        L_0x07dd:
            r1 = 5
            goto L_0x081a
        L_0x07df:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e9
            goto L_0x008c
        L_0x07e9:
            r1 = 4
            goto L_0x081a
        L_0x07eb:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f5
            goto L_0x008c
        L_0x07f5:
            r1 = 3
            goto L_0x081a
        L_0x07f7:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0801
            goto L_0x008c
        L_0x0801:
            r1 = 2
            goto L_0x081a
        L_0x0803:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080d
            goto L_0x008c
        L_0x080d:
            r1 = 1
            goto L_0x081a
        L_0x080f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0819
            goto L_0x008c
        L_0x0819:
            r1 = 0
        L_0x081a:
            switch(r1) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                case 3: goto L_0x084d;
                case 4: goto L_0x084d;
                case 5: goto L_0x084d;
                case 6: goto L_0x084d;
                case 7: goto L_0x084d;
                case 8: goto L_0x084d;
                case 9: goto L_0x084d;
                case 10: goto L_0x084d;
                case 11: goto L_0x084d;
                case 12: goto L_0x084d;
                case 13: goto L_0x084d;
                case 14: goto L_0x084d;
                case 15: goto L_0x084d;
                case 16: goto L_0x084d;
                case 17: goto L_0x084d;
                case 18: goto L_0x084d;
                case 19: goto L_0x084d;
                case 20: goto L_0x084d;
                case 21: goto L_0x084d;
                case 22: goto L_0x084d;
                case 23: goto L_0x084d;
                case 24: goto L_0x084d;
                case 25: goto L_0x084d;
                case 26: goto L_0x084d;
                case 27: goto L_0x084d;
                case 28: goto L_0x084d;
                case 29: goto L_0x084d;
                case 30: goto L_0x084d;
                case 31: goto L_0x084d;
                case 32: goto L_0x084d;
                case 33: goto L_0x084d;
                case 34: goto L_0x084d;
                case 35: goto L_0x084d;
                case 36: goto L_0x084d;
                case 37: goto L_0x084d;
                case 38: goto L_0x084d;
                case 39: goto L_0x084d;
                case 40: goto L_0x084d;
                case 41: goto L_0x084d;
                case 42: goto L_0x084d;
                case 43: goto L_0x084d;
                case 44: goto L_0x084d;
                case 45: goto L_0x084d;
                case 46: goto L_0x084d;
                case 47: goto L_0x084d;
                case 48: goto L_0x084d;
                case 49: goto L_0x084d;
                case 50: goto L_0x084d;
                case 51: goto L_0x084d;
                case 52: goto L_0x084d;
                case 53: goto L_0x084d;
                case 54: goto L_0x084d;
                case 55: goto L_0x084d;
                case 56: goto L_0x084d;
                case 57: goto L_0x084d;
                case 58: goto L_0x084d;
                case 59: goto L_0x084d;
                case 60: goto L_0x084d;
                case 61: goto L_0x084d;
                case 62: goto L_0x084d;
                case 63: goto L_0x084d;
                case 64: goto L_0x084d;
                case 65: goto L_0x084d;
                case 66: goto L_0x084d;
                case 67: goto L_0x084d;
                case 68: goto L_0x084d;
                case 69: goto L_0x084d;
                case 70: goto L_0x084d;
                case 71: goto L_0x084d;
                case 72: goto L_0x084d;
                case 73: goto L_0x084d;
                case 74: goto L_0x084d;
                case 75: goto L_0x084d;
                case 76: goto L_0x084d;
                case 77: goto L_0x084d;
                case 78: goto L_0x084d;
                case 79: goto L_0x084d;
                case 80: goto L_0x084d;
                case 81: goto L_0x084d;
                case 82: goto L_0x084d;
                case 83: goto L_0x084d;
                case 84: goto L_0x084d;
                case 85: goto L_0x084d;
                case 86: goto L_0x084d;
                case 87: goto L_0x084d;
                case 88: goto L_0x084d;
                case 89: goto L_0x084d;
                case 90: goto L_0x084d;
                case 91: goto L_0x084d;
                case 92: goto L_0x084d;
                case 93: goto L_0x084d;
                case 94: goto L_0x084d;
                case 95: goto L_0x084d;
                case 96: goto L_0x084d;
                case 97: goto L_0x084d;
                case 98: goto L_0x084d;
                case 99: goto L_0x084d;
                case 100: goto L_0x084d;
                case 101: goto L_0x084d;
                case 102: goto L_0x084d;
                case 103: goto L_0x084d;
                case 104: goto L_0x084d;
                case 105: goto L_0x084d;
                case 106: goto L_0x084d;
                case 107: goto L_0x084d;
                case 108: goto L_0x084d;
                case 109: goto L_0x084d;
                case 110: goto L_0x084d;
                case 111: goto L_0x084d;
                case 112: goto L_0x084d;
                case 113: goto L_0x084d;
                case 114: goto L_0x084d;
                case 115: goto L_0x084d;
                case 116: goto L_0x084d;
                case 117: goto L_0x084d;
                case 118: goto L_0x084d;
                case 119: goto L_0x084d;
                case 120: goto L_0x084d;
                case 121: goto L_0x084d;
                case 122: goto L_0x084d;
                case 123: goto L_0x084d;
                case 124: goto L_0x084d;
                case 125: goto L_0x084d;
                case 126: goto L_0x084d;
                case 127: goto L_0x084d;
                case 128: goto L_0x084d;
                case 129: goto L_0x084d;
                case 130: goto L_0x084d;
                case 131: goto L_0x084d;
                case 132: goto L_0x084d;
                case 133: goto L_0x084d;
                case 134: goto L_0x084d;
                case 135: goto L_0x084d;
                case 136: goto L_0x084d;
                case 137: goto L_0x084d;
                case 138: goto L_0x084d;
                case 139: goto L_0x084d;
                default: goto L_0x081d;
            }
        L_0x081d:
            java.lang.String r0 = a6.m0.f208d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x083f;
                case 2006354: goto L_0x0834;
                case 2006367: goto L_0x082b;
                default: goto L_0x0829;
            }
        L_0x0829:
            r6 = -1
            goto L_0x0849
        L_0x082b:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0849
            goto L_0x0829
        L_0x0834:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x083d
            goto L_0x0829
        L_0x083d:
            r6 = 1
            goto L_0x0849
        L_0x083f:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0848
            goto L_0x0829
        L_0x0848:
            r6 = 0
        L_0x0849:
            switch(r6) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                default: goto L_0x084c;
            }
        L_0x084c:
            goto L_0x084e
        L_0x084d:
            return r9
        L_0x084e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.g.y1():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        return (r7 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int z1(com.google.android.exoplayer2.mediacodec.i r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00ad
            if (r8 != r0) goto L_0x0007
            goto L_0x00ad
        L_0x0007:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1851077871: goto L_0x0058;
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = -1
            goto L_0x0062
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 6
            goto L_0x0062
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = 5
            goto L_0x0062
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = 4
            goto L_0x0062
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = 3
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0014
        L_0x0061:
            r6 = 0
        L_0x0062:
            switch(r6) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0069;
                case 4: goto L_0x006d;
                case 5: goto L_0x0069;
                case 6: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r0
        L_0x0066:
            int r7 = r7 * r8
            goto L_0x00a7
        L_0x0069:
            int r7 = r7 * r8
        L_0x006b:
            r2 = 2
            goto L_0x00a7
        L_0x006d:
            java.lang.String r6 = a6.m0.f208d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = a6.m0.f207c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0096
            boolean r5 = r5.f6994g
            if (r5 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            r5 = 16
            int r6 = a6.m0.l(r7, r5)
            int r7 = a6.m0.l(r8, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r7 = r6 * 16
            goto L_0x006b
        L_0x00a7:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.g.z1(com.google.android.exoplayer2.mediacodec.i, java.lang.String, int, int):int");
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    public void A0(DecoderInputBuffer decoderInputBuffer) {
        if (this.X0) {
            ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(decoderInputBuffer.f6472m);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    T1(q0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public a B1(i iVar, e4.j jVar, e4.j[] jVarArr) {
        int z12;
        int i10 = jVar.f8101x;
        int i11 = jVar.f8102y;
        int D1 = D1(iVar, jVar);
        if (jVarArr.length == 1) {
            if (!(D1 == -1 || (z12 = z1(iVar, jVar.f8096s, jVar.f8101x, jVar.f8102y)) == -1)) {
                D1 = Math.min((int) (((float) D1) * 1.5f), z12);
            }
            return new a(i10, i11, D1);
        }
        int length = jVarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            e4.j jVar2 = jVarArr[i12];
            if (jVar.E != null && jVar2.E == null) {
                jVar2 = jVar2.b().J(jVar.E).E();
            }
            if (iVar.e(jVar, jVar2).f8968d != 0) {
                int i13 = jVar2.f8101x;
                z10 |= i13 == -1 || jVar2.f8102y == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, jVar2.f8102y);
                D1 = Math.max(D1, D1(iVar, jVar2));
            }
        }
        if (z10) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i10);
            sb.append("x");
            sb.append(i11);
            p.h("MediaCodecVideoRenderer", sb.toString());
            Point A12 = A1(iVar, jVar);
            if (A12 != null) {
                i10 = Math.max(i10, A12.x);
                i11 = Math.max(i11, A12.y);
                D1 = Math.max(D1, z1(iVar, jVar.f8096s, i10, i11));
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                p.h("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new a(i10, i11, D1);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat E1(e4.j jVar, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> p10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, jVar.f8101x);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, jVar.f8102y);
        s.e(mediaFormat, jVar.f8098u);
        s.c(mediaFormat, "frame-rate", jVar.f8103z);
        s.d(mediaFormat, "rotation-degrees", jVar.A);
        s.b(mediaFormat, jVar.E);
        if ("video/dolby-vision".equals(jVar.f8096s) && (p10 = MediaCodecUtil.p(jVar)) != null) {
            s.d(mediaFormat, Scopes.PROFILE, ((Integer) p10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f5075a);
        mediaFormat.setInteger("max-height", aVar.f5076b);
        s.d(mediaFormat, "max-input-size", aVar.f5077c);
        if (m0.f205a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            v1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void G() {
        t1();
        s1();
        this.f5051a1 = false;
        this.Q0.g();
        this.f5073w1 = null;
        try {
            super.G();
        } finally {
            this.R0.m(this.K0);
        }
    }

    /* access modifiers changed from: protected */
    public void H(boolean z10, boolean z11) {
        super.H(z10, z11);
        boolean z12 = B().f8138a;
        a6.a.f(!z12 || this.f5072v1 != 0);
        if (this.f5071u1 != z12) {
            this.f5071u1 = z12;
            Y0();
        }
        this.R0.o(this.K0);
        this.Q0.h();
        this.f5054d1 = z11;
        this.f5055e1 = false;
    }

    /* access modifiers changed from: protected */
    public boolean H1(long j10, boolean z10) {
        int O = O(j10);
        if (O == 0) {
            return false;
        }
        d dVar = this.K0;
        dVar.f8962i++;
        int i10 = this.f5061k1 + O;
        if (z10) {
            dVar.f8959f += i10;
        } else {
            c2(i10);
        }
        n0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        super.I(j10, z10);
        s1();
        this.Q0.l();
        this.f5062l1 = -9223372036854775807L;
        this.f5056f1 = -9223372036854775807L;
        this.f5060j1 = 0;
        if (z10) {
            U1();
        } else {
            this.f5057g1 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(17)
    public void J() {
        try {
            super.J();
            d dVar = this.Z0;
            if (dVar != null) {
                if (this.Y0 == dVar) {
                    this.Y0 = null;
                }
                dVar.release();
                this.Z0 = null;
            }
        } catch (Throwable th) {
            if (this.Z0 != null) {
                Surface surface = this.Y0;
                d dVar2 = this.Z0;
                if (surface == dVar2) {
                    this.Y0 = null;
                }
                dVar2.release();
                this.Z0 = null;
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void J1() {
        this.f5055e1 = true;
        if (!this.f5053c1) {
            this.f5053c1 = true;
            this.R0.A(this.Y0);
            this.f5051a1 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
        super.K();
        this.f5059i1 = 0;
        this.f5058h1 = SystemClock.elapsedRealtime();
        this.f5063m1 = SystemClock.elapsedRealtime() * 1000;
        this.f5064n1 = 0;
        this.f5065o1 = 0;
        this.Q0.m();
    }

    /* access modifiers changed from: protected */
    public void L() {
        this.f5057g1 = -9223372036854775807L;
        I1();
        K1();
        this.Q0.n();
        super.L();
    }

    /* access modifiers changed from: protected */
    public void L0(Exception exc) {
        p.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.R0.C(exc);
    }

    /* access modifiers changed from: protected */
    public void M0(String str, long j10, long j11) {
        this.R0.k(str, j10, j11);
        this.W0 = u1(str);
        this.X0 = ((i) a6.a.e(r0())).n();
        if (m0.f205a >= 23 && this.f5071u1) {
            this.f5073w1 = new b((h) a6.a.e(q0()));
        }
    }

    /* access modifiers changed from: protected */
    public void N0(String str) {
        this.R0.l(str);
    }

    /* access modifiers changed from: protected */
    public e O0(k kVar) {
        e O0 = super.O0(kVar);
        this.R0.p(kVar.f8131b, O0);
        return O0;
    }

    /* access modifiers changed from: protected */
    public void P0(e4.j jVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        h q02 = q0();
        if (q02 != null) {
            q02.i(this.f5052b1);
        }
        if (this.f5071u1) {
            this.f5066p1 = jVar.f8101x;
            this.f5067q1 = jVar.f8102y;
        } else {
            a6.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            }
            this.f5066p1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            }
            this.f5067q1 = i11;
        }
        float f10 = jVar.B;
        this.f5069s1 = f10;
        if (m0.f205a >= 21) {
            int i12 = jVar.A;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f5066p1;
                this.f5066p1 = this.f5067q1;
                this.f5067q1 = i13;
                this.f5069s1 = 1.0f / f10;
            }
        } else {
            this.f5068r1 = jVar.A;
        }
        this.Q0.i(jVar.f8103z);
    }

    /* access modifiers changed from: protected */
    public void P1(long j10) {
        p1(j10);
        L1();
        this.K0.f8958e++;
        J1();
        Q0(j10);
    }

    /* access modifiers changed from: protected */
    public void Q0(long j10) {
        super.Q0(j10);
        if (!this.f5071u1) {
            this.f5061k1--;
        }
    }

    /* access modifiers changed from: protected */
    public e R(i iVar, e4.j jVar, e4.j jVar2) {
        int i10;
        e e10 = iVar.e(jVar, jVar2);
        int i11 = e10.f8969e;
        int i12 = jVar2.f8101x;
        a aVar = this.V0;
        if (i12 > aVar.f5075a || jVar2.f8102y > aVar.f5076b) {
            i11 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (D1(iVar, jVar2) > this.V0.f5077c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = iVar.f6988a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f8968d;
        }
        return new e(str, jVar, jVar2, i10, i13);
    }

    /* access modifiers changed from: protected */
    public void R0() {
        super.R0();
        s1();
    }

    /* access modifiers changed from: protected */
    public void R1(h hVar, int i10, long j10) {
        L1();
        j0.a("releaseOutputBuffer");
        hVar.h(i10, true);
        j0.c();
        this.f5063m1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f8958e++;
        this.f5060j1 = 0;
        J1();
    }

    /* access modifiers changed from: protected */
    public void S0(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.f5071u1;
        if (!z10) {
            this.f5061k1++;
        }
        if (m0.f205a < 23 && z10) {
            P1(decoderInputBuffer.f6471l);
        }
    }

    /* access modifiers changed from: protected */
    public void S1(h hVar, int i10, long j10, long j11) {
        L1();
        j0.a("releaseOutputBuffer");
        hVar.d(i10, j11);
        j0.c();
        this.f5063m1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f8958e++;
        this.f5060j1 = 0;
        J1();
    }

    /* access modifiers changed from: protected */
    public boolean U0(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, e4.j jVar) {
        long j13;
        boolean z12;
        long j14 = j10;
        h hVar2 = hVar;
        int i13 = i10;
        long j15 = j12;
        a6.a.e(hVar);
        if (this.f5056f1 == -9223372036854775807L) {
            this.f5056f1 = j14;
        }
        if (j15 != this.f5062l1) {
            this.Q0.j(j15);
            this.f5062l1 = j15;
        }
        long y02 = y0();
        long j16 = j15 - y02;
        if (!z10 || z11) {
            double z02 = (double) z0();
            boolean z13 = d() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j17 = (long) (((double) (j15 - j14)) / z02);
            if (z13) {
                j17 -= elapsedRealtime - j11;
            }
            if (this.Y0 != this.Z0) {
                long j18 = elapsedRealtime - this.f5063m1;
                if (this.f5055e1 ? this.f5053c1 : !z13 && !this.f5054d1) {
                    j13 = j18;
                    z12 = false;
                } else {
                    j13 = j18;
                    z12 = true;
                }
                if (this.f5057g1 == -9223372036854775807L && j14 >= y02 && (z12 || (z13 && Z1(j17, j13)))) {
                    long nanoTime = System.nanoTime();
                    O1(j16, nanoTime, jVar);
                    if (m0.f205a >= 21) {
                        S1(hVar, i10, j16, nanoTime);
                    } else {
                        R1(hVar2, i13, j16);
                    }
                    d2(j17);
                    return true;
                }
                if (z13 && j14 != this.f5056f1) {
                    long nanoTime2 = System.nanoTime();
                    long b10 = this.Q0.b((j17 * 1000) + nanoTime2);
                    long j19 = (b10 - nanoTime2) / 1000;
                    long j20 = j19;
                    boolean z14 = this.f5057g1 != -9223372036854775807L;
                    if (X1(j19, j11, z11) && H1(j14, z14)) {
                        return false;
                    }
                    if (Y1(j20, j11, z11)) {
                        if (z14) {
                            b2(hVar2, i13, j16);
                        } else {
                            x1(hVar2, i13, j16);
                        }
                        d2(j20);
                        return true;
                    }
                    long j21 = j20;
                    if (m0.f205a >= 21) {
                        if (j21 < 50000) {
                            O1(j16, b10, jVar);
                            S1(hVar, i10, j16, b10);
                            d2(j21);
                            return true;
                        }
                    } else if (j21 < 30000) {
                        if (j21 > 11000) {
                            try {
                                Thread.sleep((j21 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        O1(j16, b10, jVar);
                        R1(hVar2, i13, j16);
                        d2(j21);
                        return true;
                    }
                }
                return false;
            } else if (!F1(j17)) {
                return false;
            } else {
                b2(hVar2, i13, j16);
                d2(j17);
                return true;
            }
        } else {
            b2(hVar2, i13, j16);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void W1(h hVar, Surface surface) {
        hVar.k(surface);
    }

    /* access modifiers changed from: protected */
    public boolean X1(long j10, long j11, boolean z10) {
        return G1(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public boolean Y1(long j10, long j11, boolean z10) {
        return F1(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public boolean Z1(long j10, long j11) {
        return F1(j10) && j11 > 100000;
    }

    /* access modifiers changed from: protected */
    public void a1() {
        super.a1();
        this.f5061k1 = 0;
    }

    public String b() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    public MediaCodecDecoderException b0(Throwable th, i iVar) {
        return new MediaCodecVideoDecoderException(th, iVar, this.Y0);
    }

    /* access modifiers changed from: protected */
    public void b2(h hVar, int i10, long j10) {
        j0.a("skipVideoBuffer");
        hVar.h(i10, false);
        j0.c();
        this.K0.f8959f++;
    }

    /* access modifiers changed from: protected */
    public void c2(int i10) {
        d dVar = this.K0;
        dVar.f8960g += i10;
        this.f5059i1 += i10;
        int i11 = this.f5060j1 + i10;
        this.f5060j1 = i11;
        dVar.f8961h = Math.max(i11, dVar.f8961h);
        int i12 = this.T0;
        if (i12 > 0 && this.f5059i1 >= i12) {
            I1();
        }
    }

    /* access modifiers changed from: protected */
    public void d2(long j10) {
        this.K0.a(j10);
        this.f5064n1 += j10;
        this.f5065o1++;
    }

    public boolean e() {
        d dVar;
        if (super.e() && (this.f5053c1 || (((dVar = this.Z0) != null && this.Y0 == dVar) || q0() == null || this.f5071u1))) {
            this.f5057g1 = -9223372036854775807L;
            return true;
        } else if (this.f5057g1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f5057g1) {
                return true;
            }
            this.f5057g1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean j1(i iVar) {
        return this.Y0 != null || a2(iVar);
    }

    /* access modifiers changed from: protected */
    public int l1(j jVar, e4.j jVar2) {
        int i10 = 0;
        if (!t.s(jVar2.f8096s)) {
            return r.a(0);
        }
        boolean z10 = jVar2.f8099v != null;
        List<i> C1 = C1(jVar, jVar2, z10, false);
        if (z10 && C1.isEmpty()) {
            C1 = C1(jVar, jVar2, false, false);
        }
        if (C1.isEmpty()) {
            return r.a(1);
        }
        if (!MediaCodecRenderer.m1(jVar2)) {
            return r.a(2);
        }
        i iVar = C1.get(0);
        boolean m10 = iVar.m(jVar2);
        int i11 = iVar.o(jVar2) ? 16 : 8;
        if (m10) {
            List<i> C12 = C1(jVar, jVar2, z10, true);
            if (!C12.isEmpty()) {
                i iVar2 = C12.get(0);
                if (iVar2.m(jVar2) && iVar2.o(jVar2)) {
                    i10 = 32;
                }
            }
        }
        return r.b(m10 ? 4 : 3, i11, i10);
    }

    public void o(float f10, float f11) {
        super.o(f10, f11);
        this.Q0.k(f10);
    }

    public void r(int i10, Object obj) {
        if (i10 == 1) {
            V1(obj);
        } else if (i10 == 4) {
            this.f5052b1 = ((Integer) obj).intValue();
            h q02 = q0();
            if (q02 != null) {
                q02.i(this.f5052b1);
            }
        } else if (i10 == 6) {
            this.f5074x1 = (h) obj;
        } else if (i10 != 102) {
            super.r(i10, obj);
        } else {
            int intValue = ((Integer) obj).intValue();
            if (this.f5072v1 != intValue) {
                this.f5072v1 = intValue;
                if (this.f5071u1) {
                    Y0();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean s0() {
        return this.f5071u1 && m0.f205a < 23;
    }

    /* access modifiers changed from: protected */
    public float t0(float f10, e4.j jVar, e4.j[] jVarArr) {
        float f11 = -1.0f;
        for (e4.j jVar2 : jVarArr) {
            float f12 = jVar2.f8103z;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public boolean u1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!f5050z1) {
                A1 = y1();
                f5050z1 = true;
            }
        }
        return A1;
    }

    /* access modifiers changed from: protected */
    public List<i> v0(j jVar, e4.j jVar2, boolean z10) {
        return C1(jVar, jVar2, z10, this.f5071u1);
    }

    /* access modifiers changed from: protected */
    @TargetApi(17)
    public h.a x0(i iVar, e4.j jVar, MediaCrypto mediaCrypto, float f10) {
        d dVar = this.Z0;
        if (!(dVar == null || dVar.f5024h == iVar.f6994g)) {
            dVar.release();
            this.Z0 = null;
        }
        String str = iVar.f6990c;
        a B1 = B1(iVar, jVar, E());
        this.V0 = B1;
        MediaFormat E1 = E1(jVar, str, B1, f10, this.U0, this.f5071u1 ? this.f5072v1 : 0);
        if (this.Y0 == null) {
            if (a2(iVar)) {
                if (this.Z0 == null) {
                    this.Z0 = d.d(this.P0, iVar.f6994g);
                }
                this.Y0 = this.Z0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new h.a(iVar, E1, jVar, this.Y0, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    public void x1(h hVar, int i10, long j10) {
        j0.a("dropVideoBuffer");
        hVar.h(i10, false);
        j0.c();
        c2(1);
    }

    public g(Context context, h.b bVar, j jVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        super(2, bVar, jVar, z10, 30.0f);
        this.S0 = j10;
        this.T0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.P0 = applicationContext;
        this.Q0 = new j(applicationContext);
        this.R0 = new x.a(handler, xVar);
        this.U0 = w1();
        this.f5057g1 = -9223372036854775807L;
        this.f5066p1 = -1;
        this.f5067q1 = -1;
        this.f5069s1 = -1.0f;
        this.f5052b1 = 1;
        this.f5072v1 = 0;
        t1();
    }
}
