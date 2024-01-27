package a5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.Arrays;
import x4.a;
import x4.b;

/* compiled from: PictureFrame */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0002a();

    /* renamed from: h  reason: collision with root package name */
    public final int f135h;

    /* renamed from: i  reason: collision with root package name */
    public final String f136i;

    /* renamed from: j  reason: collision with root package name */
    public final String f137j;

    /* renamed from: k  reason: collision with root package name */
    public final int f138k;

    /* renamed from: l  reason: collision with root package name */
    public final int f139l;

    /* renamed from: m  reason: collision with root package name */
    public final int f140m;

    /* renamed from: n  reason: collision with root package name */
    public final int f141n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f142o;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* compiled from: PictureFrame */
    class C0002a implements Parcelable.Creator<a> {
        C0002a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f135h = i10;
        this.f136i = str;
        this.f137j = str2;
        this.f138k = i11;
        this.f139l = i12;
        this.f140m = i13;
        this.f141n = i14;
        this.f142o = bArr;
    }

    public /* synthetic */ byte[] W() {
        return b.a(this);
    }

    public void a(k0.b bVar) {
        bVar.G(this.f142o, this.f135h);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f135h == aVar.f135h && this.f136i.equals(aVar.f136i) && this.f137j.equals(aVar.f137j) && this.f138k == aVar.f138k && this.f139l == aVar.f139l && this.f140m == aVar.f140m && this.f141n == aVar.f141n && Arrays.equals(this.f142o, aVar.f142o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f135h) * 31) + this.f136i.hashCode()) * 31) + this.f137j.hashCode()) * 31) + this.f138k) * 31) + this.f139l) * 31) + this.f140m) * 31) + this.f141n) * 31) + Arrays.hashCode(this.f142o);
    }

    public String toString() {
        String str = this.f136i;
        String str2 = this.f137j;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f135h);
        parcel.writeString(this.f136i);
        parcel.writeString(this.f137j);
        parcel.writeInt(this.f138k);
        parcel.writeInt(this.f139l);
        parcel.writeInt(this.f140m);
        parcel.writeInt(this.f141n);
        parcel.writeByteArray(this.f142o);
    }

    a(Parcel parcel) {
        this.f135h = parcel.readInt();
        this.f136i = (String) m0.j(parcel.readString());
        this.f137j = (String) m0.j(parcel.readString());
        this.f138k = parcel.readInt();
        this.f139l = parcel.readInt();
        this.f140m = parcel.readInt();
        this.f141n = parcel.readInt();
        this.f142o = (byte[]) m0.j(parcel.createByteArray());
    }
}
