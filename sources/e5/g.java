package e5;

import a6.i0;
import a6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: TimeSignalCommand */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final long f8182h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8183i;

    /* compiled from: TimeSignalCommand */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static g b(y yVar, long j10, i0 i0Var) {
        long c10 = c(yVar, j10);
        return new g(c10, i0Var.b(c10));
    }

    static long c(y yVar, long j10) {
        long C = (long) yVar.C();
        if ((128 & C) != 0) {
            return 8589934591L & ((((C & 1) << 32) | yVar.E()) + j10);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8182h);
        parcel.writeLong(this.f8183i);
    }

    private g(long j10, long j11) {
        this.f8182h = j10;
        this.f8183i = j11;
    }
}
