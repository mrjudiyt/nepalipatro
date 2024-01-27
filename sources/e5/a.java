package e5;

import a6.m0;
import a6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PrivateCommand */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0130a();

    /* renamed from: h  reason: collision with root package name */
    public final long f8146h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8147i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f8148j;

    /* renamed from: e5.a$a  reason: collision with other inner class name */
    /* compiled from: PrivateCommand */
    class C0130a implements Parcelable.Creator<a> {
        C0130a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0130a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0130a aVar) {
        this(parcel);
    }

    static a b(y yVar, int i10, long j10) {
        long E = yVar.E();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        return new a(E, bArr, j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8146h);
        parcel.writeLong(this.f8147i);
        parcel.writeByteArray(this.f8148j);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f8146h = j11;
        this.f8147i = j10;
        this.f8148j = bArr;
    }

    private a(Parcel parcel) {
        this.f8146h = parcel.readLong();
        this.f8147i = parcel.readLong();
        this.f8148j = (byte[]) m0.j(parcel.createByteArray());
    }
}
