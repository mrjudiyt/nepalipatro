package d5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.Arrays;
import x4.a;
import x4.b;

/* compiled from: MdtaMetadataEntry */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0124a();

    /* renamed from: h  reason: collision with root package name */
    public final String f7951h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f7952i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7953j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7954k;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* compiled from: MdtaMetadataEntry */
    class C0124a implements Parcelable.Creator<a> {
        C0124a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0124a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0124a aVar) {
        this(parcel);
    }

    public /* synthetic */ byte[] W() {
        return b.a(this);
    }

    public /* synthetic */ void a(k0.b bVar) {
        b.c(this, bVar);
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
        if (!this.f7951h.equals(aVar.f7951h) || !Arrays.equals(this.f7952i, aVar.f7952i) || this.f7953j != aVar.f7953j || this.f7954k != aVar.f7954k) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f7951h.hashCode()) * 31) + Arrays.hashCode(this.f7952i)) * 31) + this.f7953j) * 31) + this.f7954k;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7951h);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public /* synthetic */ j u() {
        return b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7951h);
        parcel.writeByteArray(this.f7952i);
        parcel.writeInt(this.f7953j);
        parcel.writeInt(this.f7954k);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f7951h = str;
        this.f7952i = bArr;
        this.f7953j = i10;
        this.f7954k = i11;
    }

    private a(Parcel parcel) {
        this.f7951h = (String) m0.j(parcel.readString());
        this.f7952i = (byte[]) m0.j(parcel.createByteArray());
        this.f7953j = parcel.readInt();
        this.f7954k = parcel.readInt();
    }
}
