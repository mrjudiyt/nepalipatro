package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f456h;

    /* renamed from: i  reason: collision with root package name */
    public int f457i;

    /* renamed from: j  reason: collision with root package name */
    public int f458j;

    /* renamed from: k  reason: collision with root package name */
    public int f459k;

    /* renamed from: l  reason: collision with root package name */
    public int f460l;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f456h = i10;
        this.f457i = i11;
        this.f458j = i12;
        this.f459k = i13;
        this.f460l = i14;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f456h);
        parcel.writeInt(this.f458j);
        parcel.writeInt(this.f459k);
        parcel.writeInt(this.f460l);
        parcel.writeInt(this.f457i);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f456h = parcel.readInt();
        this.f458j = parcel.readInt();
        this.f459k = parcel.readInt();
        this.f460l = parcel.readInt();
        this.f457i = parcel.readInt();
    }
}
