package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CommentFrame */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5241i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5242j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5243k;

    /* compiled from: CommentFrame */
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

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f5241i = str;
        this.f5242j = str2;
        this.f5243k = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!m0.c(this.f5242j, eVar.f5242j) || !m0.c(this.f5241i, eVar.f5241i) || !m0.c(this.f5243k, eVar.f5243k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5241i;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5242j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5243k;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5241i;
        String str3 = this.f5242j;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5254h);
        parcel.writeString(this.f5241i);
        parcel.writeString(this.f5243k);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f5241i = (String) m0.j(parcel.readString());
        this.f5242j = (String) m0.j(parcel.readString());
        this.f5243k = (String) m0.j(parcel.readString());
    }
}
