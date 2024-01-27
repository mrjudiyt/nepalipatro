package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: BinaryFrame */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f5229i;

    /* compiled from: BinaryFrame */
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

    public b(String str, byte[] bArr) {
        super(str);
        this.f5229i = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f5254h.equals(bVar.f5254h) || !Arrays.equals(this.f5229i, bVar.f5229i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f5254h.hashCode()) * 31) + Arrays.hashCode(this.f5229i);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5254h);
        parcel.writeByteArray(this.f5229i);
    }

    b(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f5229i = (byte[]) m0.j(parcel.createByteArray());
    }
}
