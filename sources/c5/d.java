package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ChapterTocFrame */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5236i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5237j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5238k;

    /* renamed from: l  reason: collision with root package name */
    public final String[] f5239l;

    /* renamed from: m  reason: collision with root package name */
    private final i[] f5240m;

    /* compiled from: ChapterTocFrame */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f5236i = str;
        this.f5237j = z10;
        this.f5238k = z11;
        this.f5239l = strArr;
        this.f5240m = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f5237j != dVar.f5237j || this.f5238k != dVar.f5238k || !m0.c(this.f5236i, dVar.f5236i) || !Arrays.equals(this.f5239l, dVar.f5239l) || !Arrays.equals(this.f5240m, dVar.f5240m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (((true + (this.f5237j ? 1 : 0)) * 31) + (this.f5238k ? 1 : 0)) * 31;
        String str = this.f5236i;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5236i);
        parcel.writeByte(this.f5237j ? (byte) 1 : 0);
        parcel.writeByte(this.f5238k ? (byte) 1 : 0);
        parcel.writeStringArray(this.f5239l);
        parcel.writeInt(this.f5240m.length);
        for (i writeParcelable : this.f5240m) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f5236i = (String) m0.j(parcel.readString());
        boolean z10 = true;
        this.f5237j = parcel.readByte() != 0;
        this.f5238k = parcel.readByte() == 0 ? false : z10;
        this.f5239l = (String[]) m0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f5240m = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f5240m[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
