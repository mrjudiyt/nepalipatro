package r4;

import a6.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Atom */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11018a;

    /* renamed from: r4.a$a  reason: collision with other inner class name */
    /* compiled from: Atom */
    static final class C0191a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f11019b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f11020c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<C0191a> f11021d = new ArrayList();

        public C0191a(int i10, long j10) {
            super(i10);
            this.f11019b = j10;
        }

        public void d(C0191a aVar) {
            this.f11021d.add(aVar);
        }

        public void e(b bVar) {
            this.f11020c.add(bVar);
        }

        public C0191a f(int i10) {
            int size = this.f11021d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0191a aVar = this.f11021d.get(i11);
                if (aVar.f11018a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f11020c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f11020c.get(i11);
                if (bVar.f11018a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            String a10 = a.a(this.f11018a);
            String arrays = Arrays.toString(this.f11020c.toArray());
            String arrays2 = Arrays.toString(this.f11021d.toArray());
            StringBuilder sb = new StringBuilder(String.valueOf(a10).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb.append(a10);
            sb.append(" leaves: ");
            sb.append(arrays);
            sb.append(" containers: ");
            sb.append(arrays2);
            return sb.toString();
        }
    }

    /* compiled from: Atom */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final y f11022b;

        public b(int i10, y yVar) {
            super(i10);
            this.f11022b = yVar;
        }
    }

    public a(int i10) {
        this.f11018a = i10;
    }

    public static String a(int i10) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i10 >> 24) & 255));
        sb.append((char) ((i10 >> 16) & 255));
        sb.append((char) ((i10 >> 8) & 255));
        sb.append((char) (i10 & 255));
        return sb.toString();
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f11018a);
    }
}
