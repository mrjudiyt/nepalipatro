package b5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.Arrays;
import x4.a;
import x4.b;

/* compiled from: IcyInfo */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f5005h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5006i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5007j;

    /* compiled from: IcyInfo */
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

    public c(byte[] bArr, String str, String str2) {
        this.f5005h = bArr;
        this.f5006i = str;
        this.f5007j = str2;
    }

    public /* synthetic */ byte[] W() {
        return b.a(this);
    }

    public void a(k0.b bVar) {
        String str = this.f5006i;
        if (str != null) {
            bVar.V(str);
        }
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
        return Arrays.equals(this.f5005h, ((c) obj).f5005h);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5005h);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f5006i, this.f5007j, Integer.valueOf(this.f5005h.length)});
    }

    public /* synthetic */ j u() {
        return b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f5005h);
        parcel.writeString(this.f5006i);
        parcel.writeString(this.f5007j);
    }

    c(Parcel parcel) {
        this.f5005h = (byte[]) a6.a.e(parcel.createByteArray());
        this.f5006i = parcel.readString();
        this.f5007j = parcel.readString();
    }
}
