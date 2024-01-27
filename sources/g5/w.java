package g5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: TrackGroupArray */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final w f8923k = new w(new v[0]);

    /* renamed from: h  reason: collision with root package name */
    public final int f8924h;

    /* renamed from: i  reason: collision with root package name */
    private final v[] f8925i;

    /* renamed from: j  reason: collision with root package name */
    private int f8926j;

    /* compiled from: TrackGroupArray */
    class a implements Parcelable.Creator<w> {
        a() {
        }

        /* renamed from: a */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        /* renamed from: b */
        public w[] newArray(int i10) {
            return new w[i10];
        }
    }

    public w(v... vVarArr) {
        this.f8925i = vVarArr;
        this.f8924h = vVarArr.length;
    }

    public v b(int i10) {
        return this.f8925i[i10];
    }

    public int c(v vVar) {
        for (int i10 = 0; i10 < this.f8924h; i10++) {
            if (this.f8925i[i10] == vVar) {
                return i10;
            }
        }
        return -1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f8924h != wVar.f8924h || !Arrays.equals(this.f8925i, wVar.f8925i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f8926j == 0) {
            this.f8926j = Arrays.hashCode(this.f8925i);
        }
        return this.f8926j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8924h);
        for (int i11 = 0; i11 < this.f8924h; i11++) {
            parcel.writeParcelable(this.f8925i[i11], 0);
        }
    }

    w(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8924h = readInt;
        this.f8925i = new v[readInt];
        for (int i10 = 0; i10 < this.f8924h; i10++) {
            this.f8925i[i10] = (v) parcel.readParcelable(v.class.getClassLoader());
        }
    }
}
