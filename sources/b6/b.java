package b6;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ColorInfo */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f5014h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5015i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5016j;

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f5017k;

    /* renamed from: l  reason: collision with root package name */
    private int f5018l;

    /* compiled from: ColorInfo */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f5014h = i10;
        this.f5015i = i11;
        this.f5016j = i12;
        this.f5017k = bArr;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
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
        if (this.f5014h == bVar.f5014h && this.f5015i == bVar.f5015i && this.f5016j == bVar.f5016j && Arrays.equals(this.f5017k, bVar.f5017k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f5018l == 0) {
            this.f5018l = ((((((527 + this.f5014h) * 31) + this.f5015i) * 31) + this.f5016j) * 31) + Arrays.hashCode(this.f5017k);
        }
        return this.f5018l;
    }

    public String toString() {
        int i10 = this.f5014h;
        int i11 = this.f5015i;
        int i12 = this.f5016j;
        boolean z10 = this.f5017k != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(z10);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5014h);
        parcel.writeInt(this.f5015i);
        parcel.writeInt(this.f5016j);
        m0.M0(parcel, this.f5017k != null);
        byte[] bArr = this.f5017k;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    b(Parcel parcel) {
        this.f5014h = parcel.readInt();
        this.f5015i = parcel.readInt();
        this.f5016j = parcel.readInt();
        this.f5017k = m0.A0(parcel) ? parcel.createByteArray() : null;
    }
}
