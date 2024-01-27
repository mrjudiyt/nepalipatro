package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: InternalFrame */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5255i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5256j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5257k;

    /* compiled from: InternalFrame */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f5255i = str;
        this.f5256j = str2;
        this.f5257k = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (!m0.c(this.f5256j, jVar.f5256j) || !m0.c(this.f5255i, jVar.f5255i) || !m0.c(this.f5257k, jVar.f5257k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5255i;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5256j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5257k;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5255i;
        String str3 = this.f5256j;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5254h);
        parcel.writeString(this.f5255i);
        parcel.writeString(this.f5257k);
    }

    j(Parcel parcel) {
        super("----");
        this.f5255i = (String) m0.j(parcel.readString());
        this.f5256j = (String) m0.j(parcel.readString());
        this.f5257k = (String) m0.j(parcel.readString());
    }
}
