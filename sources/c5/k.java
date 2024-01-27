package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: MlltFrame */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final int f5258i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5259j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5260k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f5261l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f5262m;

    /* compiled from: MlltFrame */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f5258i = i10;
        this.f5259j = i11;
        this.f5260k = i12;
        this.f5261l = iArr;
        this.f5262m = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f5258i == kVar.f5258i && this.f5259j == kVar.f5259j && this.f5260k == kVar.f5260k && Arrays.equals(this.f5261l, kVar.f5261l) && Arrays.equals(this.f5262m, kVar.f5262m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f5258i) * 31) + this.f5259j) * 31) + this.f5260k) * 31) + Arrays.hashCode(this.f5261l)) * 31) + Arrays.hashCode(this.f5262m);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5258i);
        parcel.writeInt(this.f5259j);
        parcel.writeInt(this.f5260k);
        parcel.writeIntArray(this.f5261l);
        parcel.writeIntArray(this.f5262m);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f5258i = parcel.readInt();
        this.f5259j = parcel.readInt();
        this.f5260k = parcel.readInt();
        this.f5261l = (int[]) m0.j(parcel.createIntArray());
        this.f5262m = (int[]) m0.j(parcel.createIntArray());
    }
}
