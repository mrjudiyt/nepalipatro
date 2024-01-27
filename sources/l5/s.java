package l5;

import a6.a;
import a6.i0;
import a6.y;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.b0;
import k4.i;
import k4.k;
import k4.x;
import k4.y;

/* compiled from: WebvttExtractor */
public final class s implements i {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f10107g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f10108h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f10109a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f10110b;

    /* renamed from: c  reason: collision with root package name */
    private final y f10111c = new y();

    /* renamed from: d  reason: collision with root package name */
    private k f10112d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f10113e = new byte[1024];

    /* renamed from: f  reason: collision with root package name */
    private int f10114f;

    public s(String str, i0 i0Var) {
        this.f10109a = str;
        this.f10110b = i0Var;
    }

    private b0 a(long j10) {
        b0 e10 = this.f10112d.e(0, 3);
        e10.d(new j.b().e0("text/vtt").V(this.f10109a).i0(j10).E());
        this.f10112d.o();
        return e10;
    }

    private void e() {
        y yVar = new y(this.f10113e);
        x5.i.e(yVar);
        long j10 = 0;
        long j11 = 0;
        for (String o10 = yVar.o(); !TextUtils.isEmpty(o10); o10 = yVar.o()) {
            if (o10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f10107g.matcher(o10);
                if (!matcher.find()) {
                    throw ParserException.a(o10.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(o10) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), (Throwable) null);
                }
                Matcher matcher2 = f10108h.matcher(o10);
                if (!matcher2.find()) {
                    throw ParserException.a(o10.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(o10) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), (Throwable) null);
                }
                j11 = x5.i.d((String) a.e(matcher.group(1)));
                j10 = i0.f(Long.parseLong((String) a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = x5.i.a(yVar);
        if (a10 == null) {
            a(0);
            return;
        }
        long d10 = x5.i.d((String) a.e(a10.group(1)));
        long b10 = this.f10110b.b(i0.j((j10 + d10) - j11));
        b0 a11 = a(b10 - d10);
        this.f10111c.M(this.f10113e, this.f10114f);
        a11.a(this.f10111c, this.f10114f);
        a11.e(b10, 1, this.f10114f, 0, (b0.a) null);
    }

    public void b(long j10, long j11) {
        throw new IllegalStateException();
    }

    public void c(k kVar) {
        this.f10112d = kVar;
        kVar.i(new y.b(-9223372036854775807L));
    }

    public boolean d(k4.j jVar) {
        jVar.d(this.f10113e, 0, 6, false);
        this.f10111c.M(this.f10113e, 6);
        if (x5.i.b(this.f10111c)) {
            return true;
        }
        jVar.d(this.f10113e, 6, 3, false);
        this.f10111c.M(this.f10113e, 9);
        return x5.i.b(this.f10111c);
    }

    public int g(k4.j jVar, x xVar) {
        int i10;
        a.e(this.f10112d);
        int a10 = (int) jVar.a();
        int i11 = this.f10114f;
        byte[] bArr = this.f10113e;
        if (i11 == bArr.length) {
            if (a10 != -1) {
                i10 = a10;
            } else {
                i10 = bArr.length;
            }
            this.f10113e = Arrays.copyOf(bArr, (i10 * 3) / 2);
        }
        byte[] bArr2 = this.f10113e;
        int i12 = this.f10114f;
        int read = jVar.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f10114f + read;
            this.f10114f = i13;
            if (a10 == -1 || i13 != a10) {
                return 0;
            }
        }
        e();
        return -1;
    }

    public void release() {
    }
}
