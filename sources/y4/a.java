package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import x4.a;
import x4.b;

/* compiled from: AppInfoTable */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0217a();

    /* renamed from: h  reason: collision with root package name */
    public final int f12964h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12965i;

    /* renamed from: y4.a$a  reason: collision with other inner class name */
    /* compiled from: AppInfoTable */
    class C0217a implements Parcelable.Creator<a> {
        C0217a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) a6.a.e(parcel.readString()));
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f12964h = i10;
        this.f12965i = str;
    }

    public /* synthetic */ byte[] W() {
        return b.a(this);
    }

    public /* synthetic */ void a(k0.b bVar) {
        b.c(this, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i10 = this.f12964h;
        String str = this.f12965i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Ait(controlCode=");
        sb.append(i10);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12965i);
        parcel.writeInt(this.f12964h);
    }
}
