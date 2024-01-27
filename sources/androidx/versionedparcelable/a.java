package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4571d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4572e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4573f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4574g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4575h;

    /* renamed from: i  reason: collision with root package name */
    private int f4576i;

    /* renamed from: j  reason: collision with root package name */
    private int f4577j;

    /* renamed from: k  reason: collision with root package name */
    private int f4578k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    public String D() {
        return this.f4572e.readString();
    }

    public IBinder F() {
        return this.f4572e.readStrongBinder();
    }

    public void J(int i10) {
        a();
        this.f4576i = i10;
        this.f4571d.put(i10, this.f4572e.dataPosition());
        X(0);
        X(i10);
    }

    public void L(boolean z10) {
        this.f4572e.writeInt(z10 ? 1 : 0);
    }

    public void N(Bundle bundle) {
        this.f4572e.writeBundle(bundle);
    }

    public void P(byte[] bArr) {
        if (bArr != null) {
            this.f4572e.writeInt(bArr.length);
            this.f4572e.writeByteArray(bArr);
            return;
        }
        this.f4572e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void R(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4572e, 0);
    }

    public void V(float f10) {
        this.f4572e.writeFloat(f10);
    }

    public void X(int i10) {
        this.f4572e.writeInt(i10);
    }

    public void a() {
        int i10 = this.f4576i;
        if (i10 >= 0) {
            int i11 = this.f4571d.get(i10);
            int dataPosition = this.f4572e.dataPosition();
            this.f4572e.setDataPosition(i11);
            this.f4572e.writeInt(dataPosition - i11);
            this.f4572e.setDataPosition(dataPosition);
        }
    }

    public void a0(long j10) {
        this.f4572e.writeLong(j10);
    }

    /* access modifiers changed from: protected */
    public VersionedParcel b() {
        Parcel parcel = this.f4572e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4577j;
        if (i10 == this.f4573f) {
            i10 = this.f4574g;
        }
        int i11 = i10;
        return new a(parcel, dataPosition, i11, this.f4575h + "  ", this.f4567a, this.f4568b, this.f4569c);
    }

    public void c0(Parcelable parcelable) {
        this.f4572e.writeParcelable(parcelable, 0);
    }

    public void g0(String str) {
        this.f4572e.writeString(str);
    }

    public boolean h() {
        return this.f4572e.readInt() != 0;
    }

    public void i0(IBinder iBinder) {
        this.f4572e.writeStrongBinder(iBinder);
    }

    public Bundle j() {
        return this.f4572e.readBundle(getClass().getClassLoader());
    }

    public byte[] l() {
        int readInt = this.f4572e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4572e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4572e);
    }

    public boolean q(int i10) {
        while (this.f4577j < this.f4574g) {
            int i11 = this.f4578k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4572e.setDataPosition(this.f4577j);
            int readInt = this.f4572e.readInt();
            this.f4578k = this.f4572e.readInt();
            this.f4577j += readInt;
        }
        if (this.f4578k == i10) {
            return true;
        }
        return false;
    }

    public float r() {
        return this.f4572e.readFloat();
    }

    public int u() {
        return this.f4572e.readInt();
    }

    public long x() {
        return this.f4572e.readLong();
    }

    public <T extends Parcelable> T z() {
        return this.f4572e.readParcelable(getClass().getClassLoader());
    }

    private a(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4571d = new SparseIntArray();
        this.f4576i = -1;
        this.f4577j = 0;
        this.f4578k = -1;
        this.f4572e = parcel;
        this.f4573f = i10;
        this.f4574g = i11;
        this.f4577j = i10;
        this.f4575h = str;
    }
}
