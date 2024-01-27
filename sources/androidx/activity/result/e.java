package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: IntentSenderRequest */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final IntentSender f547h;

    /* renamed from: i  reason: collision with root package name */
    private final Intent f548i;

    /* renamed from: j  reason: collision with root package name */
    private final int f549j;

    /* renamed from: k  reason: collision with root package name */
    private final int f550k;

    /* compiled from: IntentSenderRequest */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* compiled from: IntentSenderRequest */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private IntentSender f551a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f552b;

        /* renamed from: c  reason: collision with root package name */
        private int f553c;

        /* renamed from: d  reason: collision with root package name */
        private int f554d;

        public b(IntentSender intentSender) {
            this.f551a = intentSender;
        }

        public e a() {
            return new e(this.f551a, this.f552b, this.f553c, this.f554d);
        }

        public b b(Intent intent) {
            this.f552b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f554d = i10;
            this.f553c = i11;
            return this;
        }
    }

    e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f547h = intentSender;
        this.f548i = intent;
        this.f549j = i10;
        this.f550k = i11;
    }

    public Intent b() {
        return this.f548i;
    }

    public int c() {
        return this.f549j;
    }

    public int d() {
        return this.f550k;
    }

    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f547h;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f547h, i10);
        parcel.writeParcelable(this.f548i, i10);
        parcel.writeInt(this.f549j);
        parcel.writeInt(this.f550k);
    }

    e(Parcel parcel) {
        this.f547h = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f548i = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f549j = parcel.readInt();
        this.f550k = parcel.readInt();
    }
}
