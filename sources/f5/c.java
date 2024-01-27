package f5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: StreamKey */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f8529h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8530i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8531j;

    /* compiled from: StreamKey */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12) {
        this.f8529h = i10;
        this.f8530i = i11;
        this.f8531j = i12;
    }

    /* renamed from: d */
    public int compareTo(c cVar) {
        int i10 = this.f8529h - cVar.f8529h;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f8530i - cVar.f8530i;
        return i11 == 0 ? this.f8531j - cVar.f8531j : i11;
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
        c cVar = (c) obj;
        if (this.f8529h == cVar.f8529h && this.f8530i == cVar.f8530i && this.f8531j == cVar.f8531j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f8529h * 31) + this.f8530i) * 31) + this.f8531j;
    }

    public String toString() {
        int i10 = this.f8529h;
        int i11 = this.f8530i;
        int i12 = this.f8531j;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        sb.append(".");
        sb.append(i12);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8529h);
        parcel.writeInt(this.f8530i);
        parcel.writeInt(this.f8531j);
    }

    c(Parcel parcel) {
        this.f8529h = parcel.readInt();
        this.f8530i = parcel.readInt();
        this.f8531j = parcel.readInt();
    }
}
