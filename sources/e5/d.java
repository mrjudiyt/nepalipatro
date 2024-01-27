package e5;

import a6.i0;
import a6.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceInsertCommand */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final long f8152h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8153i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8154j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8155k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8156l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8157m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8158n;

    /* renamed from: o  reason: collision with root package name */
    public final List<b> f8159o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8160p;

    /* renamed from: q  reason: collision with root package name */
    public final long f8161q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8162r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8163s;

    /* renamed from: t  reason: collision with root package name */
    public final int f8164t;

    /* compiled from: SpliceInsertCommand */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* compiled from: SpliceInsertCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8165a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8166b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8167c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f8165a);
            parcel.writeLong(this.f8166b);
            parcel.writeLong(this.f8167c);
        }

        private b(int i10, long j10, long j11) {
            this.f8165a = i10;
            this.f8166b = j10;
            this.f8167c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d b(y yVar, long j10, i0 i0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z11;
        List list;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        i0 i0Var2 = i0Var;
        long E = yVar.E();
        boolean z15 = (yVar.C() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int C = yVar.C();
            boolean z16 = (C & 128) != 0;
            boolean z17 = (C & 64) != 0;
            boolean z18 = (C & 32) != 0;
            boolean z19 = (C & 16) != 0;
            long c10 = (!z17 || z19) ? -9223372036854775807L : g.c(yVar, j10);
            if (!z17) {
                int C2 = yVar.C();
                ArrayList arrayList = new ArrayList(C2);
                for (int i13 = 0; i13 < C2; i13++) {
                    int C3 = yVar.C();
                    long c11 = !z19 ? g.c(yVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(C3, c11, i0Var2.b(c11), (a) null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long C4 = (long) yVar.C();
                boolean z20 = (128 & C4) != 0;
                j13 = ((((C4 & 1) << 32) | yVar.E()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i12 = yVar.I();
            z10 = z17;
            i11 = yVar.C();
            i10 = yVar.C();
            list = emptyList;
            long j14 = c10;
            z11 = z14;
            j11 = j13;
            z12 = z19;
            z13 = z16;
            j12 = j14;
        } else {
            list = emptyList;
            z13 = false;
            z12 = false;
            j12 = -9223372036854775807L;
            z11 = false;
            j11 = -9223372036854775807L;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
        }
        return new d(E, z15, z13, z10, z12, j12, i0Var2.b(j12), list, z11, j11, i12, i11, i10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8152h);
        parcel.writeByte(this.f8153i ? (byte) 1 : 0);
        parcel.writeByte(this.f8154j ? (byte) 1 : 0);
        parcel.writeByte(this.f8155k ? (byte) 1 : 0);
        parcel.writeByte(this.f8156l ? (byte) 1 : 0);
        parcel.writeLong(this.f8157m);
        parcel.writeLong(this.f8158n);
        int size = this.f8159o.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f8159o.get(i11).b(parcel);
        }
        parcel.writeByte(this.f8160p ? (byte) 1 : 0);
        parcel.writeLong(this.f8161q);
        parcel.writeInt(this.f8162r);
        parcel.writeInt(this.f8163s);
        parcel.writeInt(this.f8164t);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f8152h = j10;
        this.f8153i = z10;
        this.f8154j = z11;
        this.f8155k = z12;
        this.f8156l = z13;
        this.f8157m = j11;
        this.f8158n = j12;
        this.f8159o = Collections.unmodifiableList(list);
        this.f8160p = z14;
        this.f8161q = j13;
        this.f8162r = i10;
        this.f8163s = i11;
        this.f8164t = i12;
    }

    private d(Parcel parcel) {
        this.f8152h = parcel.readLong();
        boolean z10 = false;
        this.f8153i = parcel.readByte() == 1;
        this.f8154j = parcel.readByte() == 1;
        this.f8155k = parcel.readByte() == 1;
        this.f8156l = parcel.readByte() == 1;
        this.f8157m = parcel.readLong();
        this.f8158n = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f8159o = Collections.unmodifiableList(arrayList);
        this.f8160p = parcel.readByte() == 1 ? true : z10;
        this.f8161q = parcel.readLong();
        this.f8162r = parcel.readInt();
        this.f8163s = parcel.readInt();
        this.f8164t = parcel.readInt();
    }
}
