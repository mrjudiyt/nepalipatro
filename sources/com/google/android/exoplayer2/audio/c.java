package com.google.android.exoplayer2.audio;

import a6.m0;
import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;

/* compiled from: AudioTrackPositionTracker */
final class c {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f6344a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f6345b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f6346c;

    /* renamed from: d  reason: collision with root package name */
    private int f6347d;

    /* renamed from: e  reason: collision with root package name */
    private int f6348e;

    /* renamed from: f  reason: collision with root package name */
    private b f6349f;

    /* renamed from: g  reason: collision with root package name */
    private int f6350g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6351h;

    /* renamed from: i  reason: collision with root package name */
    private long f6352i;

    /* renamed from: j  reason: collision with root package name */
    private float f6353j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6354k;

    /* renamed from: l  reason: collision with root package name */
    private long f6355l;

    /* renamed from: m  reason: collision with root package name */
    private long f6356m;

    /* renamed from: n  reason: collision with root package name */
    private Method f6357n;

    /* renamed from: o  reason: collision with root package name */
    private long f6358o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6359p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6360q;

    /* renamed from: r  reason: collision with root package name */
    private long f6361r;

    /* renamed from: s  reason: collision with root package name */
    private long f6362s;

    /* renamed from: t  reason: collision with root package name */
    private long f6363t;

    /* renamed from: u  reason: collision with root package name */
    private long f6364u;

    /* renamed from: v  reason: collision with root package name */
    private int f6365v;

    /* renamed from: w  reason: collision with root package name */
    private int f6366w;

    /* renamed from: x  reason: collision with root package name */
    private long f6367x;

    /* renamed from: y  reason: collision with root package name */
    private long f6368y;

    /* renamed from: z  reason: collision with root package name */
    private long f6369z;

    /* compiled from: AudioTrackPositionTracker */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public c(a aVar) {
        this.f6344a = (a) a6.a.e(aVar);
        if (m0.f205a >= 18) {
            try {
                this.f6357n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6345b = new long[10];
    }

    private boolean a() {
        return this.f6351h && ((AudioTrack) a6.a.e(this.f6346c)).getPlayState() == 2 && f() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / ((long) this.f6350g);
    }

    private long f() {
        AudioTrack audioTrack = (AudioTrack) a6.a.e(this.f6346c);
        if (this.f6367x != -9223372036854775807L) {
            return Math.min(this.A, this.f6369z + ((((SystemClock.elapsedRealtime() * 1000) - this.f6367x) * ((long) this.f6350g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = KeyboardMap.kValueMask & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f6351h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6364u = this.f6362s;
            }
            playbackHeadPosition += this.f6364u;
        }
        if (m0.f205a <= 29) {
            if (playbackHeadPosition == 0 && this.f6362s > 0 && playState == 3) {
                if (this.f6368y == -9223372036854775807L) {
                    this.f6368y = SystemClock.elapsedRealtime();
                }
                return this.f6362s;
            }
            this.f6368y = -9223372036854775807L;
        }
        if (this.f6362s > playbackHeadPosition) {
            this.f6363t++;
        }
        this.f6362s = playbackHeadPosition;
        return playbackHeadPosition + (this.f6363t << 32);
    }

    private long g() {
        return b(f());
    }

    private void m(long j10, long j11) {
        b bVar = (b) a6.a.e(this.f6349f);
        if (bVar.e(j10)) {
            long c10 = bVar.c();
            long b10 = bVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f6344a.e(b10, c10, j10, j11);
                bVar.f();
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f6344a.d(b10, c10, j10, j11);
                bVar.f();
            } else {
                bVar.a();
            }
        }
    }

    private void n() {
        long g10 = g();
        if (g10 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f6356m >= 30000) {
                long[] jArr = this.f6345b;
                int i10 = this.f6365v;
                jArr[i10] = g10 - nanoTime;
                this.f6365v = (i10 + 1) % 10;
                int i11 = this.f6366w;
                if (i11 < 10) {
                    this.f6366w = i11 + 1;
                }
                this.f6356m = nanoTime;
                this.f6355l = 0;
                int i12 = 0;
                while (true) {
                    int i13 = this.f6366w;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f6355l += this.f6345b[i12] / ((long) i13);
                    i12++;
                }
            }
            if (!this.f6351h) {
                m(nanoTime, g10);
                o(nanoTime);
            }
        }
    }

    private void o(long j10) {
        Method method;
        if (this.f6360q && (method = this.f6357n) != null && j10 - this.f6361r >= 500000) {
            try {
                long intValue = (((long) ((Integer) m0.j((Integer) method.invoke(a6.a.e(this.f6346c), new Object[0]))).intValue()) * 1000) - this.f6352i;
                this.f6358o = intValue;
                long max = Math.max(intValue, 0);
                this.f6358o = max;
                if (max > 5000000) {
                    this.f6344a.c(max);
                    this.f6358o = 0;
                }
            } catch (Exception unused) {
                this.f6357n = null;
            }
            this.f6361r = j10;
        }
    }

    private static boolean p(int i10) {
        return m0.f205a < 23 && (i10 == 5 || i10 == 6);
    }

    private void s() {
        this.f6355l = 0;
        this.f6366w = 0;
        this.f6365v = 0;
        this.f6356m = 0;
        this.C = 0;
        this.F = 0;
        this.f6354k = false;
    }

    public int c(long j10) {
        return this.f6348e - ((int) (j10 - (f() * ((long) this.f6347d))));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) a6.a.e(this.f6346c)).getPlayState() == 3) {
            n();
        }
        long nanoTime = System.nanoTime() / 1000;
        b bVar = (b) a6.a.e(this.f6349f);
        boolean d10 = bVar.d();
        if (d10) {
            j10 = b(bVar.b()) + m0.U(nanoTime - bVar.c(), this.f6353j);
        } else {
            if (this.f6366w == 0) {
                j10 = g();
            } else {
                j10 = this.f6355l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0, j10 - this.f6358o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.E + m0.U(j11, this.f6353j)))) / 1000;
        }
        if (!this.f6354k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f6354k = true;
                this.f6344a.b(System.currentTimeMillis() - e4.c.e(m0.Z(e4.c.e(j10 - j13), this.f6353j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public long e(long j10) {
        return e4.c.e(b(j10 - f()));
    }

    public void h(long j10) {
        this.f6369z = f();
        this.f6367x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean i(long j10) {
        return j10 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) a6.a.e(this.f6346c)).getPlayState() == 3;
    }

    public boolean k(long j10) {
        return this.f6368y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f6368y >= 200;
    }

    public boolean l(long j10) {
        int playState = ((AudioTrack) a6.a.e(this.f6346c)).getPlayState();
        if (this.f6351h) {
            if (playState == 2) {
                this.f6359p = false;
                return false;
            } else if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z10 = this.f6359p;
        boolean i10 = i(j10);
        this.f6359p = i10;
        if (z10 && !i10 && playState != 1) {
            this.f6344a.a(this.f6348e, e4.c.e(this.f6352i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.f6367x != -9223372036854775807L) {
            return false;
        }
        ((b) a6.a.e(this.f6349f)).g();
        return true;
    }

    public void r() {
        s();
        this.f6346c = null;
        this.f6349f = null;
    }

    public void t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f6346c = audioTrack;
        this.f6347d = i11;
        this.f6348e = i12;
        this.f6349f = new b(audioTrack);
        this.f6350g = audioTrack.getSampleRate();
        this.f6351h = z10 && p(i10);
        boolean j02 = m0.j0(i10);
        this.f6360q = j02;
        this.f6352i = j02 ? b((long) (i12 / i11)) : -9223372036854775807L;
        this.f6362s = 0;
        this.f6363t = 0;
        this.f6364u = 0;
        this.f6359p = false;
        this.f6367x = -9223372036854775807L;
        this.f6368y = -9223372036854775807L;
        this.f6361r = 0;
        this.f6358o = 0;
        this.f6353j = 1.0f;
    }

    public void u(float f10) {
        this.f6353j = f10;
        b bVar = this.f6349f;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void v() {
        ((b) a6.a.e(this.f6349f)).g();
    }
}
