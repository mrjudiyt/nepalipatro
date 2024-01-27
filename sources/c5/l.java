package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PrivFrame */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5263i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f5264j;

    /* compiled from: PrivFrame */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f5263i = str;
        this.f5264j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!m0.c(this.f5263i, lVar.f5263i) || !Arrays.equals(this.f5264j, lVar.f5264j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5263i;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f5264j);
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5263i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5263i);
        parcel.writeByteArray(this.f5264j);
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f5263i = (String) m0.j(parcel.readString());
        this.f5264j = (byte[]) m0.j(parcel.createByteArray());
    }
}
