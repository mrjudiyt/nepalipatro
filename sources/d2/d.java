package d2;

import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7919a = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f7920b;

    /* renamed from: c  reason: collision with root package name */
    private c f7921c;

    /* renamed from: d  reason: collision with root package name */
    private int f7922d = 0;

    private boolean b() {
        return this.f7921c.f7907b != 0;
    }

    private int d() {
        try {
            return this.f7920b.get() & 255;
        } catch (Exception unused) {
            this.f7921c.f7907b = 1;
            return 0;
        }
    }

    private void e() {
        this.f7921c.f7909d.f7895a = n();
        this.f7921c.f7909d.f7896b = n();
        this.f7921c.f7909d.f7897c = n();
        this.f7921c.f7909d.f7898d = n();
        int d10 = d();
        boolean z10 = false;
        boolean z11 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        b bVar = this.f7921c.f7909d;
        if ((d10 & 64) != 0) {
            z10 = true;
        }
        bVar.f7899e = z10;
        if (z11) {
            bVar.f7905k = g(pow);
        } else {
            bVar.f7905k = null;
        }
        this.f7921c.f7909d.f7904j = this.f7920b.position();
        r();
        if (!b()) {
            c cVar = this.f7921c;
            cVar.f7908c++;
            cVar.f7910e.add(cVar.f7909d);
        }
    }

    private void f() {
        int d10 = d();
        this.f7922d = d10;
        if (d10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f7922d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f7920b.get(this.f7919a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i10);
                        sb.append(" count: ");
                        sb.append(i11);
                        sb.append(" blockSize: ");
                        sb.append(this.f7922d);
                    }
                    this.f7921c.f7907b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f7920b.get(bArr);
            iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            this.f7921c.f7907b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f7921c.f7908c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f7921c.f7909d = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb.append((char) this.f7919a[i11]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f7921c;
                if (cVar.f7909d == null) {
                    cVar.f7909d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f7921c.f7907b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        b bVar = this.f7921c.f7909d;
        int i10 = (d10 & 28) >> 2;
        bVar.f7901g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f7901g = 1;
        }
        if ((d10 & 1) == 0) {
            z10 = false;
        }
        bVar.f7900f = z10;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f7921c.f7909d;
        bVar2.f7903i = n10 * 10;
        bVar2.f7902h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f7921c.f7907b = 1;
            return;
        }
        l();
        if (this.f7921c.f7913h && !b()) {
            c cVar = this.f7921c;
            cVar.f7906a = g(cVar.f7914i);
            c cVar2 = this.f7921c;
            cVar2.f7917l = cVar2.f7906a[cVar2.f7915j];
        }
    }

    private void l() {
        this.f7921c.f7911f = n();
        this.f7921c.f7912g = n();
        int d10 = d();
        c cVar = this.f7921c;
        cVar.f7913h = (d10 & 128) != 0;
        cVar.f7914i = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        this.f7921c.f7915j = d();
        this.f7921c.f7916k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.f7919a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            d2.c r2 = r3.f7921c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f7918m = r0
        L_0x001b:
            int r0 = r3.f7922d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.d.m():void");
    }

    private int n() {
        return this.f7920b.getShort();
    }

    private void o() {
        this.f7920b = null;
        Arrays.fill(this.f7919a, (byte) 0);
        this.f7921c = new c();
        this.f7922d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f7920b.position(Math.min(this.f7920b.position() + d10, this.f7920b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f7920b = null;
        this.f7921c = null;
    }

    public c c() {
        if (this.f7920b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.f7921c;
        } else {
            k();
            if (!b()) {
                h();
                c cVar = this.f7921c;
                if (cVar.f7908c < 0) {
                    cVar.f7907b = 1;
                }
            }
            return this.f7921c;
        }
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7920b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f7920b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
