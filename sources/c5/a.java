package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import java.util.Arrays;

/* compiled from: ApicFrame */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0102a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5225i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5226j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5227k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f5228l;

    /* renamed from: c5.a$a  reason: collision with other inner class name */
    /* compiled from: ApicFrame */
    class C0102a implements Parcelable.Creator<a> {
        C0102a() {
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

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f5225i = str;
        this.f5226j = str2;
        this.f5227k = i10;
        this.f5228l = bArr;
    }

    public void a(k0.b bVar) {
        bVar.G(this.f5228l, this.f5227k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5227k != aVar.f5227k || !m0.c(this.f5225i, aVar.f5225i) || !m0.c(this.f5226j, aVar.f5226j) || !Arrays.equals(this.f5228l, aVar.f5228l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (527 + this.f5227k) * 31;
        String str = this.f5225i;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5226j;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.f5228l);
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5225i;
        String str3 = this.f5226j;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5225i);
        parcel.writeString(this.f5226j);
        parcel.writeInt(this.f5227k);
        parcel.writeByteArray(this.f5228l);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f5225i = (String) m0.j(parcel.readString());
        this.f5226j = parcel.readString();
        this.f5227k = parcel.readInt();
        this.f5228l = (byte[]) m0.j(parcel.createByteArray());
    }
}
