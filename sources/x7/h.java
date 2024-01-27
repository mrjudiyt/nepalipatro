package x7;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.sessions.settings.RemoteSettings;
import ea.e;
import ea.g;
import ea.o;
import ea.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Hpack */
final class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final f[] f17223a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Map<ea.h, Integer> f17224b = e();

    /* compiled from: Hpack */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<f> f17225a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final g f17226b;

        /* renamed from: c  reason: collision with root package name */
        private int f17227c;

        /* renamed from: d  reason: collision with root package name */
        private int f17228d;

        /* renamed from: e  reason: collision with root package name */
        f[] f17229e;

        /* renamed from: f  reason: collision with root package name */
        int f17230f;

        /* renamed from: g  reason: collision with root package name */
        int f17231g;

        /* renamed from: h  reason: collision with root package name */
        int f17232h;

        a(int i10, z zVar) {
            f[] fVarArr = new f[8];
            this.f17229e = fVarArr;
            this.f17230f = fVarArr.length - 1;
            this.f17231g = 0;
            this.f17232h = 0;
            this.f17227c = i10;
            this.f17228d = i10;
            this.f17226b = o.b(zVar);
        }

        private void a() {
            int i10 = this.f17228d;
            int i11 = this.f17232h;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        private void b() {
            this.f17225a.clear();
            Arrays.fill(this.f17229e, (Object) null);
            this.f17230f = this.f17229e.length - 1;
            this.f17231g = 0;
            this.f17232h = 0;
        }

        private int c(int i10) {
            return this.f17230f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17229e.length;
                while (true) {
                    length--;
                    i11 = this.f17230f;
                    if (length < i11 || i10 <= 0) {
                        f[] fVarArr = this.f17229e;
                        System.arraycopy(fVarArr, i11 + 1, fVarArr, i11 + 1 + i12, this.f17231g);
                        this.f17230f += i12;
                    } else {
                        f[] fVarArr2 = this.f17229e;
                        i10 -= fVarArr2[length].f17217c;
                        this.f17232h -= fVarArr2[length].f17217c;
                        this.f17231g--;
                        i12++;
                    }
                }
                f[] fVarArr3 = this.f17229e;
                System.arraycopy(fVarArr3, i11 + 1, fVarArr3, i11 + 1 + i12, this.f17231g);
                this.f17230f += i12;
            }
            return i12;
        }

        private ea.h f(int i10) {
            if (i(i10)) {
                return h.f17223a[i10].f17215a;
            }
            return this.f17229e[c(i10 - h.f17223a.length)].f17215a;
        }

        private void h(int i10, f fVar) {
            this.f17225a.add(fVar);
            int i11 = fVar.f17217c;
            if (i10 != -1) {
                i11 -= this.f17229e[c(i10)].f17217c;
            }
            int i12 = this.f17228d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f17232h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f17231g + 1;
                f[] fVarArr = this.f17229e;
                if (i13 > fVarArr.length) {
                    f[] fVarArr2 = new f[(fVarArr.length * 2)];
                    System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
                    this.f17230f = this.f17229e.length - 1;
                    this.f17229e = fVarArr2;
                }
                int i14 = this.f17230f;
                this.f17230f = i14 - 1;
                this.f17229e[i14] = fVar;
                this.f17231g++;
            } else {
                this.f17229e[i10 + c(i10) + d10] = fVar;
            }
            this.f17232h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= h.f17223a.length - 1;
        }

        private int j() {
            return this.f17226b.readByte() & 255;
        }

        private void m(int i10) {
            if (i(i10)) {
                this.f17225a.add(h.f17223a[i10]);
                return;
            }
            int c10 = c(i10 - h.f17223a.length);
            if (c10 >= 0) {
                f[] fVarArr = this.f17229e;
                if (c10 <= fVarArr.length - 1) {
                    this.f17225a.add(fVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void o(int i10) {
            h(-1, new f(f(i10), k()));
        }

        private void p() {
            h(-1, new f(h.d(k()), k()));
        }

        private void q(int i10) {
            this.f17225a.add(new f(f(i10), k()));
        }

        private void r() {
            this.f17225a.add(new f(h.d(k()), k()));
        }

        public List<f> e() {
            ArrayList arrayList = new ArrayList(this.f17225a);
            this.f17225a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public void g(int i10) {
            this.f17227c = i10;
            this.f17228d = i10;
            a();
        }

        /* access modifiers changed from: package-private */
        public ea.h k() {
            int j10 = j();
            boolean z10 = (j10 & 128) == 128;
            int n10 = n(j10, 127);
            if (z10) {
                return ea.h.q(j.d().c(this.f17226b.n0((long) n10)));
            }
            return this.f17226b.s((long) n10);
        }

        /* access modifiers changed from: package-private */
        public void l() {
            while (!this.f17226b.F()) {
                byte readByte = this.f17226b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n10 = n(readByte, 31);
                    this.f17228d = n10;
                    if (n10 < 0 || n10 > this.f17227c) {
                        throw new IOException("Invalid dynamic table size update " + this.f17228d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    r();
                } else {
                    q(n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int j10 = j();
                if ((j10 & 128) == 0) {
                    return i11 + (j10 << i13);
                }
                i11 += (j10 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* compiled from: Hpack */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final e f17233a;

        b(e eVar) {
            this.f17233a = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a(ea.h hVar) {
            c(hVar.u(), 127, 0);
            this.f17233a.u0(hVar);
        }

        /* access modifiers changed from: package-private */
        public void b(List<f> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ea.h v10 = list.get(i10).f17215a.v();
                Integer num = (Integer) h.f17224b.get(v10);
                if (num != null) {
                    c(num.intValue() + 1, 15, 0);
                    a(list.get(i10).f17216b);
                } else {
                    this.f17233a.G(0);
                    a(v10);
                    a(list.get(i10).f17216b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f17233a.G(i10 | i12);
                return;
            }
            this.f17233a.G(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f17233a.G(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f17233a.G(i13);
        }
    }

    static {
        ea.h hVar = f.f17209e;
        ea.h hVar2 = f.f17210f;
        ea.h hVar3 = f.f17211g;
        ea.h hVar4 = f.f17208d;
        f17223a = new f[]{new f(f.f17212h, ""), new f(hVar, "GET"), new f(hVar, "POST"), new f(hVar2, (String) RemoteSettings.FORWARD_SLASH_STRING), new f(hVar2, "/index.html"), new f(hVar3, "http"), new f(hVar3, "https"), new f(hVar4, "200"), new f(hVar4, "204"), new f(hVar4, "206"), new f(hVar4, "304"), new f(hVar4, "400"), new f(hVar4, "404"), new f(hVar4, "500"), new f("accept-charset", ""), new f("accept-encoding", "gzip, deflate"), new f("accept-language", ""), new f("accept-ranges", ""), new f("accept", ""), new f("access-control-allow-origin", ""), new f("age", ""), new f("allow", ""), new f("authorization", ""), new f("cache-control", ""), new f("content-disposition", ""), new f("content-encoding", ""), new f("content-language", ""), new f("content-length", ""), new f("content-location", ""), new f("content-range", ""), new f("content-type", ""), new f("cookie", ""), new f("date", ""), new f("etag", ""), new f("expect", ""), new f("expires", ""), new f((String) Constants.MessagePayloadKeys.FROM, ""), new f("host", ""), new f("if-match", ""), new f("if-modified-since", ""), new f("if-none-match", ""), new f("if-range", ""), new f("if-unmodified-since", ""), new f("last-modified", ""), new f("link", ""), new f((String) FirebaseAnalytics.Param.LOCATION, ""), new f("max-forwards", ""), new f("proxy-authenticate", ""), new f("proxy-authorization", ""), new f("range", ""), new f("referer", ""), new f("refresh", ""), new f("retry-after", ""), new f("server", ""), new f("set-cookie", ""), new f("strict-transport-security", ""), new f("transfer-encoding", ""), new f("user-agent", ""), new f("vary", ""), new f("via", ""), new f("www-authenticate", "")};
    }

    /* access modifiers changed from: private */
    public static ea.h d(ea.h hVar) {
        int u10 = hVar.u();
        int i10 = 0;
        while (i10 < u10) {
            byte f10 = hVar.f(i10);
            if (f10 < 65 || f10 > 90) {
                i10++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.x());
            }
        }
        return hVar;
    }

    private static Map<ea.h, Integer> e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f17223a.length);
        int i10 = 0;
        while (true) {
            f[] fVarArr = f17223a;
            if (i10 >= fVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(fVarArr[i10].f17215a)) {
                linkedHashMap.put(fVarArr[i10].f17215a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
