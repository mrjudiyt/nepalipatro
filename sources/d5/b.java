package d5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import n6.f;
import x4.a;

/* compiled from: MotionPhotoMetadata */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final long f7955h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7956i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7957j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7958k;

    /* renamed from: l  reason: collision with root package name */
    public final long f7959l;

    /* compiled from: MotionPhotoMetadata */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public /* synthetic */ byte[] W() {
        return x4.b.a(this);
    }

    public /* synthetic */ void a(k0.b bVar) {
        x4.b.c(this, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7955h == bVar.f7955h && this.f7956i == bVar.f7956i && this.f7957j == bVar.f7957j && this.f7958k == bVar.f7958k && this.f7959l == bVar.f7959l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + f.b(this.f7955h)) * 31) + f.b(this.f7956i)) * 31) + f.b(this.f7957j)) * 31) + f.b(this.f7958k)) * 31) + f.b(this.f7959l);
    }

    public String toString() {
        long j10 = this.f7955h;
        long j11 = this.f7956i;
        long j12 = this.f7957j;
        long j13 = this.f7958k;
        long j14 = this.f7959l;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j10);
        sb.append(", photoSize=");
        sb.append(j11);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j12);
        sb.append(", videoStartPosition=");
        sb.append(j13);
        sb.append(", videoSize=");
        sb.append(j14);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7955h);
        parcel.writeLong(this.f7956i);
        parcel.writeLong(this.f7957j);
        parcel.writeLong(this.f7958k);
        parcel.writeLong(this.f7959l);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f7955h = j10;
        this.f7956i = j11;
        this.f7957j = j12;
        this.f7958k = j13;
        this.f7959l = j14;
    }

    private b(Parcel parcel) {
        this.f7955h = parcel.readLong();
        this.f7956i = parcel.readLong();
        this.f7957j = parcel.readLong();
        this.f7958k = parcel.readLong();
        this.f7959l = parcel.readLong();
    }
}
