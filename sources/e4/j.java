package e4;

import a6.m0;
import a6.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.h;
import j4.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Format */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final b6.b E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final Class<? extends p> L;
    private int M;

    /* renamed from: h  reason: collision with root package name */
    public final String f8085h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8086i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8087j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8088k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8089l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8090m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8091n;

    /* renamed from: o  reason: collision with root package name */
    public final int f8092o;

    /* renamed from: p  reason: collision with root package name */
    public final String f8093p;

    /* renamed from: q  reason: collision with root package name */
    public final x4.a f8094q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8095r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8096s;

    /* renamed from: t  reason: collision with root package name */
    public final int f8097t;

    /* renamed from: u  reason: collision with root package name */
    public final List<byte[]> f8098u;

    /* renamed from: v  reason: collision with root package name */
    public final h f8099v;

    /* renamed from: w  reason: collision with root package name */
    public final long f8100w;

    /* renamed from: x  reason: collision with root package name */
    public final int f8101x;

    /* renamed from: y  reason: collision with root package name */
    public final int f8102y;

    /* renamed from: z  reason: collision with root package name */
    public final float f8103z;

    /* compiled from: Format */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    /* compiled from: Format */
    public static final class b {
        /* access modifiers changed from: private */
        public int A;
        /* access modifiers changed from: private */
        public int B;
        /* access modifiers changed from: private */
        public int C;
        /* access modifiers changed from: private */
        public Class<? extends p> D;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f8104a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f8105b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f8106c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f8107d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f8108e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f8109f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f8110g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String f8111h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public x4.a f8112i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public String f8113j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public String f8114k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public int f8115l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public List<byte[]> f8116m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public h f8117n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public long f8118o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f8119p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f8120q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public float f8121r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public int f8122s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public float f8123t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public byte[] f8124u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public int f8125v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public b6.b f8126w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public int f8127x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public int f8128y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public int f8129z;

        /* synthetic */ b(j jVar, a aVar) {
            this(jVar);
        }

        public j E() {
            return new j(this, (a) null);
        }

        public b F(int i10) {
            this.C = i10;
            return this;
        }

        public b G(int i10) {
            this.f8109f = i10;
            return this;
        }

        public b H(int i10) {
            this.f8127x = i10;
            return this;
        }

        public b I(String str) {
            this.f8111h = str;
            return this;
        }

        public b J(b6.b bVar) {
            this.f8126w = bVar;
            return this;
        }

        public b K(String str) {
            this.f8113j = str;
            return this;
        }

        public b L(h hVar) {
            this.f8117n = hVar;
            return this;
        }

        public b M(int i10) {
            this.A = i10;
            return this;
        }

        public b N(int i10) {
            this.B = i10;
            return this;
        }

        public b O(Class<? extends p> cls) {
            this.D = cls;
            return this;
        }

        public b P(float f10) {
            this.f8121r = f10;
            return this;
        }

        public b Q(int i10) {
            this.f8120q = i10;
            return this;
        }

        public b R(int i10) {
            this.f8104a = Integer.toString(i10);
            return this;
        }

        public b S(String str) {
            this.f8104a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f8116m = list;
            return this;
        }

        public b U(String str) {
            this.f8105b = str;
            return this;
        }

        public b V(String str) {
            this.f8106c = str;
            return this;
        }

        public b W(int i10) {
            this.f8115l = i10;
            return this;
        }

        public b X(x4.a aVar) {
            this.f8112i = aVar;
            return this;
        }

        public b Y(int i10) {
            this.f8129z = i10;
            return this;
        }

        public b Z(int i10) {
            this.f8110g = i10;
            return this;
        }

        public b a0(float f10) {
            this.f8123t = f10;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f8124u = bArr;
            return this;
        }

        public b c0(int i10) {
            this.f8108e = i10;
            return this;
        }

        public b d0(int i10) {
            this.f8122s = i10;
            return this;
        }

        public b e0(String str) {
            this.f8114k = str;
            return this;
        }

        public b f0(int i10) {
            this.f8128y = i10;
            return this;
        }

        public b g0(int i10) {
            this.f8107d = i10;
            return this;
        }

        public b h0(int i10) {
            this.f8125v = i10;
            return this;
        }

        public b i0(long j10) {
            this.f8118o = j10;
            return this;
        }

        public b j0(int i10) {
            this.f8119p = i10;
            return this;
        }

        public b() {
            this.f8109f = -1;
            this.f8110g = -1;
            this.f8115l = -1;
            this.f8118o = Long.MAX_VALUE;
            this.f8119p = -1;
            this.f8120q = -1;
            this.f8121r = -1.0f;
            this.f8123t = 1.0f;
            this.f8125v = -1;
            this.f8127x = -1;
            this.f8128y = -1;
            this.f8129z = -1;
            this.C = -1;
        }

        private b(j jVar) {
            this.f8104a = jVar.f8085h;
            this.f8105b = jVar.f8086i;
            this.f8106c = jVar.f8087j;
            this.f8107d = jVar.f8088k;
            this.f8108e = jVar.f8089l;
            this.f8109f = jVar.f8090m;
            this.f8110g = jVar.f8091n;
            this.f8111h = jVar.f8093p;
            this.f8112i = jVar.f8094q;
            this.f8113j = jVar.f8095r;
            this.f8114k = jVar.f8096s;
            this.f8115l = jVar.f8097t;
            this.f8116m = jVar.f8098u;
            this.f8117n = jVar.f8099v;
            this.f8118o = jVar.f8100w;
            this.f8119p = jVar.f8101x;
            this.f8120q = jVar.f8102y;
            this.f8121r = jVar.f8103z;
            this.f8122s = jVar.A;
            this.f8123t = jVar.B;
            this.f8124u = jVar.C;
            this.f8125v = jVar.D;
            this.f8126w = jVar.E;
            this.f8127x = jVar.F;
            this.f8128y = jVar.G;
            this.f8129z = jVar.H;
            this.A = jVar.I;
            this.B = jVar.J;
            this.C = jVar.K;
            this.D = jVar.L;
        }
    }

    /* synthetic */ j(b bVar, a aVar) {
        this(bVar);
    }

    public b b() {
        return new b(this, (a) null);
    }

    public j c(Class<? extends p> cls) {
        return b().O(cls).E();
    }

    public int d() {
        int i10;
        int i11 = this.f8101x;
        if (i11 == -1 || (i10 = this.f8102y) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e(j jVar) {
        if (this.f8098u.size() != jVar.f8098u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f8098u.size(); i10++) {
            if (!Arrays.equals(this.f8098u.get(i10), jVar.f8098u.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        int i11 = this.M;
        if ((i11 == 0 || (i10 = jVar.M) == 0 || i11 == i10) && this.f8088k == jVar.f8088k && this.f8089l == jVar.f8089l && this.f8090m == jVar.f8090m && this.f8091n == jVar.f8091n && this.f8097t == jVar.f8097t && this.f8100w == jVar.f8100w && this.f8101x == jVar.f8101x && this.f8102y == jVar.f8102y && this.A == jVar.A && this.D == jVar.D && this.F == jVar.F && this.G == jVar.G && this.H == jVar.H && this.I == jVar.I && this.J == jVar.J && this.K == jVar.K && Float.compare(this.f8103z, jVar.f8103z) == 0 && Float.compare(this.B, jVar.B) == 0 && m0.c(this.L, jVar.L) && m0.c(this.f8085h, jVar.f8085h) && m0.c(this.f8086i, jVar.f8086i) && m0.c(this.f8093p, jVar.f8093p) && m0.c(this.f8095r, jVar.f8095r) && m0.c(this.f8096s, jVar.f8096s) && m0.c(this.f8087j, jVar.f8087j) && Arrays.equals(this.C, jVar.C) && m0.c(this.f8094q, jVar.f8094q) && m0.c(this.E, jVar.E) && m0.c(this.f8099v, jVar.f8099v) && e(jVar)) {
            return true;
        }
        return false;
    }

    public j f(j jVar) {
        x4.a aVar;
        String str;
        if (this == jVar) {
            return this;
        }
        int l10 = t.l(this.f8096s);
        String str2 = jVar.f8085h;
        String str3 = jVar.f8086i;
        if (str3 == null) {
            str3 = this.f8086i;
        }
        String str4 = this.f8087j;
        if ((l10 == 3 || l10 == 1) && (str = jVar.f8087j) != null) {
            str4 = str;
        }
        int i10 = this.f8090m;
        if (i10 == -1) {
            i10 = jVar.f8090m;
        }
        int i11 = this.f8091n;
        if (i11 == -1) {
            i11 = jVar.f8091n;
        }
        String str5 = this.f8093p;
        if (str5 == null) {
            String I2 = m0.I(jVar.f8093p, l10);
            if (m0.G0(I2).length == 1) {
                str5 = I2;
            }
        }
        x4.a aVar2 = this.f8094q;
        if (aVar2 == null) {
            aVar = jVar.f8094q;
        } else {
            aVar = aVar2.c(jVar.f8094q);
        }
        float f10 = this.f8103z;
        if (f10 == -1.0f && l10 == 2) {
            f10 = jVar.f8103z;
        }
        int i12 = this.f8088k | jVar.f8088k;
        int i13 = this.f8089l | jVar.f8089l;
        return b().S(str2).U(str3).V(str4).g0(i12).c0(i13).G(i10).Z(i11).I(str5).X(aVar).L(h.e(jVar.f8099v, this.f8099v)).P(f10).E();
    }

    public int hashCode() {
        if (this.M == 0) {
            String str = this.f8085h;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8086i;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8087j;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8088k) * 31) + this.f8089l) * 31) + this.f8090m) * 31) + this.f8091n) * 31;
            String str4 = this.f8093p;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            x4.a aVar = this.f8094q;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f8095r;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8096s;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f8097t) * 31) + ((int) this.f8100w)) * 31) + this.f8101x) * 31) + this.f8102y) * 31) + Float.floatToIntBits(this.f8103z)) * 31) + this.A) * 31) + Float.floatToIntBits(this.B)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31;
            Class<? extends p> cls = this.L;
            if (cls != null) {
                i10 = cls.hashCode();
            }
            this.M = hashCode7 + i10;
        }
        return this.M;
    }

    public String toString() {
        String str = this.f8085h;
        String str2 = this.f8086i;
        String str3 = this.f8095r;
        String str4 = this.f8096s;
        String str5 = this.f8093p;
        int i10 = this.f8092o;
        String str6 = this.f8087j;
        int i11 = this.f8101x;
        int i12 = this.f8102y;
        float f10 = this.f8103z;
        int i13 = this.F;
        int i14 = this.G;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(f10);
        sb.append("], [");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8085h);
        parcel.writeString(this.f8086i);
        parcel.writeString(this.f8087j);
        parcel.writeInt(this.f8088k);
        parcel.writeInt(this.f8089l);
        parcel.writeInt(this.f8090m);
        parcel.writeInt(this.f8091n);
        parcel.writeString(this.f8093p);
        boolean z10 = false;
        parcel.writeParcelable(this.f8094q, 0);
        parcel.writeString(this.f8095r);
        parcel.writeString(this.f8096s);
        parcel.writeInt(this.f8097t);
        int size = this.f8098u.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f8098u.get(i11));
        }
        parcel.writeParcelable(this.f8099v, 0);
        parcel.writeLong(this.f8100w);
        parcel.writeInt(this.f8101x);
        parcel.writeInt(this.f8102y);
        parcel.writeFloat(this.f8103z);
        parcel.writeInt(this.A);
        parcel.writeFloat(this.B);
        if (this.C != null) {
            z10 = true;
        }
        m0.M0(parcel, z10);
        byte[] bArr = this.C;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.D);
        parcel.writeParcelable(this.E, i10);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
    }

    private j(b bVar) {
        this.f8085h = bVar.f8104a;
        this.f8086i = bVar.f8105b;
        this.f8087j = m0.s0(bVar.f8106c);
        this.f8088k = bVar.f8107d;
        this.f8089l = bVar.f8108e;
        int A2 = bVar.f8109f;
        this.f8090m = A2;
        int B2 = bVar.f8110g;
        this.f8091n = B2;
        this.f8092o = B2 != -1 ? B2 : A2;
        this.f8093p = bVar.f8111h;
        this.f8094q = bVar.f8112i;
        this.f8095r = bVar.f8113j;
        this.f8096s = bVar.f8114k;
        this.f8097t = bVar.f8115l;
        this.f8098u = bVar.f8116m == null ? Collections.emptyList() : bVar.f8116m;
        h f10 = bVar.f8117n;
        this.f8099v = f10;
        this.f8100w = bVar.f8118o;
        this.f8101x = bVar.f8119p;
        this.f8102y = bVar.f8120q;
        this.f8103z = bVar.f8121r;
        int i10 = 0;
        this.A = bVar.f8122s == -1 ? 0 : bVar.f8122s;
        this.B = bVar.f8123t == -1.0f ? 1.0f : bVar.f8123t;
        this.C = bVar.f8124u;
        this.D = bVar.f8125v;
        this.E = bVar.f8126w;
        this.F = bVar.f8127x;
        this.G = bVar.f8128y;
        this.H = bVar.f8129z;
        this.I = bVar.A == -1 ? 0 : bVar.A;
        this.J = bVar.B != -1 ? bVar.B : i10;
        this.K = bVar.C;
        if (bVar.D != null || f10 == null) {
            this.L = bVar.D;
        } else {
            this.L = j4.t.class;
        }
    }

    j(Parcel parcel) {
        this.f8085h = parcel.readString();
        this.f8086i = parcel.readString();
        this.f8087j = parcel.readString();
        this.f8088k = parcel.readInt();
        this.f8089l = parcel.readInt();
        int readInt = parcel.readInt();
        this.f8090m = readInt;
        int readInt2 = parcel.readInt();
        this.f8091n = readInt2;
        this.f8092o = readInt2 != -1 ? readInt2 : readInt;
        this.f8093p = parcel.readString();
        this.f8094q = (x4.a) parcel.readParcelable(x4.a.class.getClassLoader());
        this.f8095r = parcel.readString();
        this.f8096s = parcel.readString();
        this.f8097t = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f8098u = new ArrayList(readInt3);
        for (int i10 = 0; i10 < readInt3; i10++) {
            this.f8098u.add((byte[]) a6.a.e(parcel.createByteArray()));
        }
        h hVar = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f8099v = hVar;
        this.f8100w = parcel.readLong();
        this.f8101x = parcel.readInt();
        this.f8102y = parcel.readInt();
        this.f8103z = parcel.readFloat();
        this.A = parcel.readInt();
        this.B = parcel.readFloat();
        Class cls = null;
        this.C = m0.A0(parcel) ? parcel.createByteArray() : null;
        this.D = parcel.readInt();
        this.E = (b6.b) parcel.readParcelable(b6.b.class.getClassLoader());
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = hVar != null ? j4.t.class : cls;
    }
}
