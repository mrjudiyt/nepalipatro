package x7;

import ea.e;
import ea.g;
import ea.h;
import ea.j;
import ea.m;
import ea.o;
import ea.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: NameValueBlockReader */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final m f17262a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f17263b;

    /* renamed from: c  reason: collision with root package name */
    private final g f17264c;

    /* compiled from: NameValueBlockReader */
    class a extends j {
        a(z zVar) {
            super(zVar);
        }

        public long S(e eVar, long j10) {
            if (k.this.f17263b == 0) {
                return -1;
            }
            long S = super.S(eVar, Math.min(j10, (long) k.this.f17263b));
            if (S == -1) {
                return -1;
            }
            k kVar = k.this;
            int unused = kVar.f17263b = (int) (((long) kVar.f17263b) - S);
            return S;
        }
    }

    /* compiled from: NameValueBlockReader */
    class b extends Inflater {
        b() {
        }

        public int inflate(byte[] bArr, int i10, int i11) {
            int inflate = super.inflate(bArr, i10, i11);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(o.f17275a);
            return super.inflate(bArr, i10, i11);
        }
    }

    public k(g gVar) {
        m mVar = new m((z) new a(gVar), (Inflater) new b());
        this.f17262a = mVar;
        this.f17264c = o.b(mVar);
    }

    private void d() {
        if (this.f17263b > 0) {
            this.f17262a.h();
            if (this.f17263b != 0) {
                throw new IOException("compressedLimit > 0: " + this.f17263b);
            }
        }
    }

    private h e() {
        return this.f17264c.s((long) this.f17264c.readInt());
    }

    public void c() {
        this.f17264c.close();
    }

    public List<f> f(int i10) {
        this.f17263b += i10;
        int readInt = this.f17264c.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 < readInt) {
                h v10 = e().v();
                h e10 = e();
                if (v10.u() != 0) {
                    arrayList.add(new f(v10, e10));
                    i11++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            d();
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
    }
}
