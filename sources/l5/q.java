package l5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.a;

/* compiled from: HlsTrackMetadataEntry */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final String f10097h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10098i;

    /* renamed from: j  reason: collision with root package name */
    public final List<b> f10099j;

    /* compiled from: HlsTrackMetadataEntry */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(String str, String str2, List<b> list) {
        this.f10097h = str;
        this.f10098i = str2;
        this.f10099j = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!TextUtils.equals(this.f10097h, qVar.f10097h) || !TextUtils.equals(this.f10098i, qVar.f10098i) || !this.f10099j.equals(qVar.f10099j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f10097h;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10098i;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f10099j.hashCode();
    }

    public String toString() {
        String str;
        String str2 = this.f10097h;
        if (str2 != null) {
            String str3 = this.f10098i;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 5 + String.valueOf(str3).length());
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10097h);
        parcel.writeString(this.f10098i);
        int size = this.f10099j.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f10099j.get(i11), 0);
        }
    }

    q(Parcel parcel) {
        this.f10097h = parcel.readString();
        this.f10098i = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f10099j = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: HlsTrackMetadataEntry */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final int f10100h;

        /* renamed from: i  reason: collision with root package name */
        public final int f10101i;

        /* renamed from: j  reason: collision with root package name */
        public final String f10102j;

        /* renamed from: k  reason: collision with root package name */
        public final String f10103k;

        /* renamed from: l  reason: collision with root package name */
        public final String f10104l;

        /* renamed from: m  reason: collision with root package name */
        public final String f10105m;

        /* compiled from: HlsTrackMetadataEntry */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f10100h = i10;
            this.f10101i = i11;
            this.f10102j = str;
            this.f10103k = str2;
            this.f10104l = str3;
            this.f10105m = str4;
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
            if (this.f10100h != bVar.f10100h || this.f10101i != bVar.f10101i || !TextUtils.equals(this.f10102j, bVar.f10102j) || !TextUtils.equals(this.f10103k, bVar.f10103k) || !TextUtils.equals(this.f10104l, bVar.f10104l) || !TextUtils.equals(this.f10105m, bVar.f10105m)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = ((this.f10100h * 31) + this.f10101i) * 31;
            String str = this.f10102j;
            int i11 = 0;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10103k;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f10104l;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f10105m;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return hashCode3 + i11;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10100h);
            parcel.writeInt(this.f10101i);
            parcel.writeString(this.f10102j);
            parcel.writeString(this.f10103k);
            parcel.writeString(this.f10104l);
            parcel.writeString(this.f10105m);
        }

        b(Parcel parcel) {
            this.f10100h = parcel.readInt();
            this.f10101i = parcel.readInt();
            this.f10102j = parcel.readString();
            this.f10103k = parcel.readString();
            this.f10104l = parcel.readString();
            this.f10105m = parcel.readString();
        }
    }
}
