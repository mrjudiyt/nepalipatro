package d5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import x4.a;
import x4.b;

/* compiled from: SmtaMetadataEntry */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final float f7965h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7966i;

    /* compiled from: SmtaMetadataEntry */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f7965h == eVar.f7965h && this.f7966i == eVar.f7966i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + n6.b.a(this.f7965h)) * 31) + this.f7966i;
    }

    public String toString() {
        float f10 = this.f7965h;
        int i10 = this.f7966i;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f10);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i10);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f7965h);
        parcel.writeInt(this.f7966i);
    }

    public e(float f10, int i10) {
        this.f7965h = f10;
        this.f7966i = i10;
    }

    private e(Parcel parcel) {
        this.f7965h = parcel.readFloat();
        this.f7966i = parcel.readInt();
    }
}
