package e0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: AbsSavedState */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final a f7970i = new C0128a();

    /* renamed from: h  reason: collision with root package name */
    private final Parcelable f7971h;

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* compiled from: AbsSavedState */
    class C0128a extends a {
        C0128a() {
            super((C0128a) null);
        }
    }

    /* compiled from: AbsSavedState */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f7970i;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0128a aVar) {
        this();
    }

    public final Parcelable b() {
        return this.f7971h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7971h, i10);
    }

    private a() {
        this.f7971h = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7971h = parcelable == f7970i ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7971h = readParcelable == null ? f7970i : readParcelable;
    }
}
