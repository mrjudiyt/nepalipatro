package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ChapterFrame */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5230i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5231j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5232k;

    /* renamed from: l  reason: collision with root package name */
    public final long f5233l;

    /* renamed from: m  reason: collision with root package name */
    public final long f5234m;

    /* renamed from: n  reason: collision with root package name */
    private final i[] f5235n;

    /* compiled from: ChapterFrame */
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

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f5230i = str;
        this.f5231j = i10;
        this.f5232k = i11;
        this.f5233l = j10;
        this.f5234m = j11;
        this.f5235n = iVarArr;
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
        if (this.f5231j == cVar.f5231j && this.f5232k == cVar.f5232k && this.f5233l == cVar.f5233l && this.f5234m == cVar.f5234m && m0.c(this.f5230i, cVar.f5230i) && Arrays.equals(this.f5235n, cVar.f5235n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f5231j) * 31) + this.f5232k) * 31) + ((int) this.f5233l)) * 31) + ((int) this.f5234m)) * 31;
        String str = this.f5230i;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5230i);
        parcel.writeInt(this.f5231j);
        parcel.writeInt(this.f5232k);
        parcel.writeLong(this.f5233l);
        parcel.writeLong(this.f5234m);
        parcel.writeInt(this.f5235n.length);
        for (i writeParcelable : this.f5235n) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f5230i = (String) m0.j(parcel.readString());
        this.f5231j = parcel.readInt();
        this.f5232k = parcel.readInt();
        this.f5233l = parcel.readLong();
        this.f5234m = parcel.readLong();
        int readInt = parcel.readInt();
        this.f5235n = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f5235n[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
