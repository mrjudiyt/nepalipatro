package d5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l6.l;
import x4.a;

/* compiled from: SlowMotionData */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f7960h;

    /* compiled from: SlowMotionData */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* compiled from: SlowMotionData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public static final Comparator<b> f7961k = d.f14157h;

        /* renamed from: h  reason: collision with root package name */
        public final long f7962h;

        /* renamed from: i  reason: collision with root package name */
        public final long f7963i;

        /* renamed from: j  reason: collision with root package name */
        public final int f7964j;

        /* compiled from: SlowMotionData */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            a6.a.a(j10 < j11);
            this.f7962h = j10;
            this.f7963i = j11;
            this.f7964j = i10;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7962h == bVar.f7962h && this.f7963i == bVar.f7963i && this.f7964j == bVar.f7964j) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return l.b(Long.valueOf(this.f7962h), Long.valueOf(this.f7963i), Integer.valueOf(this.f7964j));
        }

        public String toString() {
            return m0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f7962h), Long.valueOf(this.f7963i), Integer.valueOf(this.f7964j));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f7962h);
            parcel.writeLong(this.f7963i);
            parcel.writeInt(this.f7964j);
        }
    }

    public c(List<b> list) {
        this.f7960h = list;
        a6.a.a(!b(list));
    }

    private static boolean b(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f7963i;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f7962h < j10) {
                return true;
            }
            j10 = list.get(i10).f7963i;
        }
        return false;
    }

    public /* synthetic */ byte[] W() {
        return x4.b.a(this);
    }

    public /* synthetic */ void a(k0.b bVar) {
        x4.b.c(this, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f7960h.equals(((c) obj).f7960h);
    }

    public int hashCode() {
        return this.f7960h.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7960h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f7960h);
    }
}
