package e4;

import a6.m0;
import a6.p;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.w0;
import g5.w;
import y5.h;
import z5.b;
import z5.k;

/* compiled from: DefaultLoadControl */
public class d implements l {

    /* renamed from: a  reason: collision with root package name */
    private final k f8050a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8051b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8052c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8053d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8054e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8055f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8056g;

    /* renamed from: h  reason: collision with root package name */
    private final long f8057h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f8058i;

    /* renamed from: j  reason: collision with root package name */
    private int f8059j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8060k;

    /* compiled from: DefaultLoadControl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private k f8061a;

        /* renamed from: b  reason: collision with root package name */
        private int f8062b = 50000;

        /* renamed from: c  reason: collision with root package name */
        private int f8063c = 50000;

        /* renamed from: d  reason: collision with root package name */
        private int f8064d = 2500;

        /* renamed from: e  reason: collision with root package name */
        private int f8065e = 5000;

        /* renamed from: f  reason: collision with root package name */
        private int f8066f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f8067g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f8068h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8069i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f8070j;

        public d a() {
            a6.a.f(!this.f8070j);
            this.f8070j = true;
            if (this.f8061a == null) {
                this.f8061a = new k(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            }
            return new d(this.f8061a, this.f8062b, this.f8063c, this.f8064d, this.f8065e, this.f8066f, this.f8067g, this.f8068h, this.f8069i);
        }

        public a b(int i10, boolean z10) {
            a6.a.f(!this.f8070j);
            d.j(i10, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            this.f8068h = i10;
            this.f8069i = z10;
            return this;
        }

        public a c(int i10, int i11, int i12, int i13) {
            a6.a.f(!this.f8070j);
            d.j(i12, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            d.j(i13, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            d.j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            d.j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            d.j(i11, i10, "maxBufferMs", "minBufferMs");
            this.f8062b = i10;
            this.f8063c = i11;
            this.f8064d = i12;
            this.f8065e = i13;
            return this;
        }

        public a d(boolean z10) {
            a6.a.f(!this.f8070j);
            this.f8067g = z10;
            return this;
        }

        public a e(int i10) {
            a6.a.f(!this.f8070j);
            this.f8066f = i10;
            return this;
        }
    }

    public d() {
        this(new k(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* access modifiers changed from: private */
    public static void j(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        a6.a.b(z10, sb.toString());
    }

    private static int l(int i10) {
        if (i10 == 0) {
            return 144310272;
        }
        if (i10 == 1) {
            return 13107200;
        }
        if (i10 == 2) {
            return 131072000;
        }
        if (i10 == 3 || i10 == 5 || i10 == 6) {
            return 131072;
        }
        if (i10 == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    private void m(boolean z10) {
        int i10 = this.f8055f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f8059j = i10;
        this.f8060k = false;
        if (z10) {
            this.f8050a.g();
        }
    }

    public void a() {
        m(true);
    }

    public boolean b() {
        return this.f8058i;
    }

    public long c() {
        return this.f8057h;
    }

    public void d(w0[] w0VarArr, w wVar, h[] hVarArr) {
        int i10 = this.f8055f;
        if (i10 == -1) {
            i10 = k(w0VarArr, hVarArr);
        }
        this.f8059j = i10;
        this.f8050a.h(i10);
    }

    public void e() {
        m(true);
    }

    public boolean f(long j10, float f10, boolean z10, long j11) {
        long Z = m0.Z(j10, f10);
        long j12 = z10 ? this.f8054e : this.f8053d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || Z >= j12 || (!this.f8056g && this.f8050a.f() >= this.f8059j);
    }

    public boolean g(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f8050a.f() >= this.f8059j;
        long j12 = this.f8051b;
        if (f10 > 1.0f) {
            j12 = Math.min(m0.U(j12, f10), this.f8052c);
        }
        if (j11 < Math.max(j12, 500000)) {
            if (!this.f8056g && z11) {
                z10 = false;
            }
            this.f8060k = z10;
            if (!z10 && j11 < 500000) {
                p.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f8052c || z11) {
            this.f8060k = false;
        }
        return this.f8060k;
    }

    public b h() {
        return this.f8050a;
    }

    /* access modifiers changed from: protected */
    public int k(w0[] w0VarArr, h[] hVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < w0VarArr.length; i11++) {
            if (hVarArr[i11] != null) {
                i10 += l(w0VarArr[i11].j());
            }
        }
        return Math.max(13107200, i10);
    }

    public void onPrepared() {
        m(false);
    }

    protected d(k kVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f8050a = kVar;
        this.f8051b = c.d((long) i10);
        this.f8052c = c.d((long) i11);
        this.f8053d = c.d((long) i12);
        this.f8054e = c.d((long) i13);
        this.f8055f = i14;
        this.f8059j = i14 == -1 ? 13107200 : i14;
        this.f8056g = z10;
        this.f8057h = c.d((long) i15);
        this.f8058i = z11;
    }
}
