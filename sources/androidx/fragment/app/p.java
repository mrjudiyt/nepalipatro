package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentManagerState */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<t> f3267h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<String> f3268i;

    /* renamed from: j  reason: collision with root package name */
    b[] f3269j;

    /* renamed from: k  reason: collision with root package name */
    int f3270k;

    /* renamed from: l  reason: collision with root package name */
    String f3271l = null;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<String> f3272m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<Bundle> f3273n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<n.m> f3274o;

    /* compiled from: FragmentManagerState */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f3267h);
        parcel.writeStringList(this.f3268i);
        parcel.writeTypedArray(this.f3269j, i10);
        parcel.writeInt(this.f3270k);
        parcel.writeString(this.f3271l);
        parcel.writeStringList(this.f3272m);
        parcel.writeTypedList(this.f3273n);
        parcel.writeTypedList(this.f3274o);
    }

    public p(Parcel parcel) {
        this.f3267h = parcel.createTypedArrayList(t.CREATOR);
        this.f3268i = parcel.createStringArrayList();
        this.f3269j = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3270k = parcel.readInt();
        this.f3271l = parcel.readString();
        this.f3272m = parcel.createStringArrayList();
        this.f3273n = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3274o = parcel.createTypedArrayList(n.m.CREATOR);
    }
}
