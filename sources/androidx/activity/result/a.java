package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ActivityResult */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0009a();

    /* renamed from: h  reason: collision with root package name */
    private final int f545h;

    /* renamed from: i  reason: collision with root package name */
    private final Intent f546i;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResult */
    class C0009a implements Parcelable.Creator<a> {
        C0009a() {
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

    public a(int i10, Intent intent) {
        this.f545h = i10;
        this.f546i = intent;
    }

    public static String d(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent b() {
        return this.f546i;
    }

    public int c() {
        return this.f545h;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f545h) + ", data=" + this.f546i + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f545h);
        parcel.writeInt(this.f546i == null ? 0 : 1);
        Intent intent = this.f546i;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    a(Parcel parcel) {
        this.f545h = parcel.readInt();
        this.f546i = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
