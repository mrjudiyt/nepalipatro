package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentState */
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    final String f3283h;

    /* renamed from: i  reason: collision with root package name */
    final String f3284i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f3285j;

    /* renamed from: k  reason: collision with root package name */
    final int f3286k;

    /* renamed from: l  reason: collision with root package name */
    final int f3287l;

    /* renamed from: m  reason: collision with root package name */
    final String f3288m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f3289n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f3290o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f3291p;

    /* renamed from: q  reason: collision with root package name */
    final Bundle f3292q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f3293r;

    /* renamed from: s  reason: collision with root package name */
    final int f3294s;

    /* renamed from: t  reason: collision with root package name */
    Bundle f3295t;

    /* compiled from: FragmentState */
    class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i10) {
            return new t[i10];
        }
    }

    t(Fragment fragment) {
        this.f3283h = fragment.getClass().getName();
        this.f3284i = fragment.mWho;
        this.f3285j = fragment.mFromLayout;
        this.f3286k = fragment.mFragmentId;
        this.f3287l = fragment.mContainerId;
        this.f3288m = fragment.mTag;
        this.f3289n = fragment.mRetainInstance;
        this.f3290o = fragment.mRemoving;
        this.f3291p = fragment.mDetached;
        this.f3292q = fragment.mArguments;
        this.f3293r = fragment.mHidden;
        this.f3294s = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3283h);
        sb.append(" (");
        sb.append(this.f3284i);
        sb.append(")}:");
        if (this.f3285j) {
            sb.append(" fromLayout");
        }
        if (this.f3287l != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3287l));
        }
        String str = this.f3288m;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3288m);
        }
        if (this.f3289n) {
            sb.append(" retainInstance");
        }
        if (this.f3290o) {
            sb.append(" removing");
        }
        if (this.f3291p) {
            sb.append(" detached");
        }
        if (this.f3293r) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3283h);
        parcel.writeString(this.f3284i);
        parcel.writeInt(this.f3285j ? 1 : 0);
        parcel.writeInt(this.f3286k);
        parcel.writeInt(this.f3287l);
        parcel.writeString(this.f3288m);
        parcel.writeInt(this.f3289n ? 1 : 0);
        parcel.writeInt(this.f3290o ? 1 : 0);
        parcel.writeInt(this.f3291p ? 1 : 0);
        parcel.writeBundle(this.f3292q);
        parcel.writeInt(this.f3293r ? 1 : 0);
        parcel.writeBundle(this.f3295t);
        parcel.writeInt(this.f3294s);
    }

    t(Parcel parcel) {
        this.f3283h = parcel.readString();
        this.f3284i = parcel.readString();
        boolean z10 = true;
        this.f3285j = parcel.readInt() != 0;
        this.f3286k = parcel.readInt();
        this.f3287l = parcel.readInt();
        this.f3288m = parcel.readString();
        this.f3289n = parcel.readInt() != 0;
        this.f3290o = parcel.readInt() != 0;
        this.f3291p = parcel.readInt() != 0;
        this.f3292q = parcel.readBundle();
        this.f3293r = parcel.readInt() == 0 ? false : z10;
        this.f3295t = parcel.readBundle();
        this.f3294s = parcel.readInt();
    }
}
