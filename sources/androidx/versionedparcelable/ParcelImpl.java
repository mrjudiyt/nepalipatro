package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j1.b;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final b f4566h;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(b bVar) {
        this.f4566h = bVar;
    }

    public <T extends b> T b() {
        return this.f4566h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        new a(parcel).l0(this.f4566h);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4566h = new a(parcel).H();
    }
}
