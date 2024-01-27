package x4;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.Arrays;
import java.util.List;

/* compiled from: Metadata */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0213a();

    /* renamed from: h  reason: collision with root package name */
    private final b[] f12769h;

    /* renamed from: x4.a$a  reason: collision with other inner class name */
    /* compiled from: Metadata */
    class C0213a implements Parcelable.Creator<a> {
        C0213a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: Metadata */
    public interface b extends Parcelable {
        byte[] W();

        void a(k0.b bVar);

        j u();
    }

    public a(b... bVarArr) {
        this.f12769h = bVarArr;
    }

    public a b(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new a((b[]) m0.u0(this.f12769h, bVarArr));
    }

    public a c(a aVar) {
        return aVar == null ? this : b(aVar.f12769h);
    }

    public b d(int i10) {
        return this.f12769h[i10];
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f12769h.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12769h, ((a) obj).f12769h);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12769h);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f12769h));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12769h.length);
        for (b writeParcelable : this.f12769h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public a(List<? extends b> list) {
        this.f12769h = (b[]) list.toArray(new b[0]);
    }

    a(Parcel parcel) {
        this.f12769h = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f12769h;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }
}
