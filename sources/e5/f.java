package e5;

import a6.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceScheduleCommand */
public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f8168h;

    /* compiled from: SpliceScheduleCommand */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8169a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8170b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f8169a);
            parcel.writeLong(this.f8170b);
        }

        private b(int i10, long j10) {
            this.f8169a = i10;
            this.f8170b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f b(y yVar) {
        int C = yVar.C();
        ArrayList arrayList = new ArrayList(C);
        for (int i10 = 0; i10 < C; i10++) {
            arrayList.add(c.e(yVar));
        }
        return new f((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f8168h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f8168h.get(i11).f(parcel);
        }
    }

    private f(List<c> list) {
        this.f8168h = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f8168h = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f8171a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8172b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f8173c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f8174d;

        /* renamed from: e  reason: collision with root package name */
        public final long f8175e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f8176f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f8177g;

        /* renamed from: h  reason: collision with root package name */
        public final long f8178h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8179i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8180j;

        /* renamed from: k  reason: collision with root package name */
        public final int f8181k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f8171a = j10;
            this.f8172b = z10;
            this.f8173c = z11;
            this.f8174d = z12;
            this.f8176f = Collections.unmodifiableList(list);
            this.f8175e = j11;
            this.f8177g = z13;
            this.f8178h = j12;
            this.f8179i = i10;
            this.f8180j = i11;
            this.f8181k = i12;
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(y yVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z11;
            long j11;
            ArrayList arrayList;
            boolean z12;
            long j12;
            boolean z13;
            long E = yVar.E();
            boolean z14 = (yVar.C() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int C = yVar.C();
                boolean z15 = (C & 128) != 0;
                boolean z16 = (C & 64) != 0;
                boolean z17 = (C & 32) != 0;
                long E2 = z16 ? yVar.E() : -9223372036854775807L;
                if (!z16) {
                    int C2 = yVar.C();
                    ArrayList arrayList3 = new ArrayList(C2);
                    for (int i13 = 0; i13 < C2; i13++) {
                        arrayList3.add(new b(yVar.C(), yVar.E(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long C3 = (long) yVar.C();
                    boolean z18 = (128 & C3) != 0;
                    j12 = ((((C3 & 1) << 32) | yVar.E()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int I = yVar.I();
                int C4 = yVar.C();
                z10 = z16;
                i10 = yVar.C();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = E2;
                i12 = I;
                i11 = C4;
                j11 = j13;
                boolean z19 = z15;
                z11 = z13;
                z12 = z19;
            } else {
                arrayList = arrayList2;
                z12 = false;
                j11 = -9223372036854775807L;
                z11 = false;
                j10 = -9223372036854775807L;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z10 = false;
            }
            return new c(E, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f8171a);
            parcel.writeByte(this.f8172b ? (byte) 1 : 0);
            parcel.writeByte(this.f8173c ? (byte) 1 : 0);
            parcel.writeByte(this.f8174d ? (byte) 1 : 0);
            int size = this.f8176f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f8176f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f8175e);
            parcel.writeByte(this.f8177g ? (byte) 1 : 0);
            parcel.writeLong(this.f8178h);
            parcel.writeInt(this.f8179i);
            parcel.writeInt(this.f8180j);
            parcel.writeInt(this.f8181k);
        }

        private c(Parcel parcel) {
            this.f8171a = parcel.readLong();
            boolean z10 = false;
            this.f8172b = parcel.readByte() == 1;
            this.f8173c = parcel.readByte() == 1;
            this.f8174d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f8176f = Collections.unmodifiableList(arrayList);
            this.f8175e = parcel.readLong();
            this.f8177g = parcel.readByte() == 1 ? true : z10;
            this.f8178h = parcel.readLong();
            this.f8179i = parcel.readInt();
            this.f8180j = parcel.readInt();
            this.f8181k = parcel.readInt();
        }
    }
}
