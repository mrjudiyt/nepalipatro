package p4;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import k4.j;

/* compiled from: DefaultEbmlReader */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10486a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f10487b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f10488c = new g();

    /* renamed from: d  reason: collision with root package name */
    private b f10489d;

    /* renamed from: e  reason: collision with root package name */
    private int f10490e;

    /* renamed from: f  reason: collision with root package name */
    private int f10491f;

    /* renamed from: g  reason: collision with root package name */
    private long f10492g;

    /* compiled from: DefaultEbmlReader */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f10493a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f10494b;

        private b(int i10, long j10) {
            this.f10493a = i10;
            this.f10494b = j10;
        }
    }

    private long c(j jVar) {
        jVar.k();
        while (true) {
            jVar.o(this.f10486a, 0, 4);
            int c10 = g.c(this.f10486a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f10486a, c10, false);
                if (this.f10489d.d(a10)) {
                    jVar.l(c10);
                    return (long) a10;
                }
            }
            jVar.l(1);
        }
    }

    private double d(j jVar, int i10) {
        long e10 = e(jVar, i10);
        if (i10 == 4) {
            return (double) Float.intBitsToFloat((int) e10);
        }
        return Double.longBitsToDouble(e10);
    }

    private long e(j jVar, int i10) {
        jVar.readFully(this.f10486a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f10486a[i11] & 255));
        }
        return j10;
    }

    private static String f(j jVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        jVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public boolean a(j jVar) {
        a6.a.h(this.f10489d);
        while (true) {
            b peek = this.f10487b.peek();
            if (peek == null || jVar.getPosition() < peek.f10494b) {
                if (this.f10490e == 0) {
                    long d10 = this.f10488c.d(jVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = c(jVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f10491f = (int) d10;
                    this.f10490e = 1;
                }
                if (this.f10490e == 1) {
                    this.f10492g = this.f10488c.d(jVar, false, true, 8);
                    this.f10490e = 2;
                }
                int b10 = this.f10489d.b(this.f10491f);
                if (b10 == 0) {
                    jVar.l((int) this.f10492g);
                    this.f10490e = 0;
                } else if (b10 == 1) {
                    long position = jVar.getPosition();
                    this.f10487b.push(new b(this.f10491f, this.f10492g + position));
                    this.f10489d.g(this.f10491f, position, this.f10492g);
                    this.f10490e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f10492g;
                    if (j10 <= 8) {
                        this.f10489d.h(this.f10491f, e(jVar, (int) j10));
                        this.f10490e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j10);
                    throw ParserException.a(sb.toString(), (Throwable) null);
                } else if (b10 == 3) {
                    long j11 = this.f10492g;
                    if (j11 <= 2147483647L) {
                        this.f10489d.e(this.f10491f, f(jVar, (int) j11));
                        this.f10490e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j11);
                    throw ParserException.a(sb2.toString(), (Throwable) null);
                } else if (b10 == 4) {
                    this.f10489d.c(this.f10491f, (int) this.f10492g, jVar);
                    this.f10490e = 0;
                    return true;
                } else if (b10 == 5) {
                    long j12 = this.f10492g;
                    if (j12 == 4 || j12 == 8) {
                        this.f10489d.f(this.f10491f, d(jVar, (int) j12));
                        this.f10490e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j12);
                    throw ParserException.a(sb3.toString(), (Throwable) null);
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(b10);
                    throw ParserException.a(sb4.toString(), (Throwable) null);
                }
            } else {
                this.f10489d.a(this.f10487b.pop().f10493a);
                return true;
            }
        }
    }

    public void b(b bVar) {
        this.f10489d = bVar;
    }

    public void reset() {
        this.f10490e = 0;
        this.f10487b.clear();
        this.f10488c.e();
    }
}
