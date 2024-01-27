package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: UrlLinkFrame */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5267i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5268j;

    /* compiled from: UrlLinkFrame */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f5267i = str2;
        this.f5268j = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f5254h.equals(nVar.f5254h) || !m0.c(this.f5267i, nVar.f5267i) || !m0.c(this.f5268j, nVar.f5268j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f5254h.hashCode()) * 31;
        String str = this.f5267i;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5268j;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5268j;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5254h);
        parcel.writeString(this.f5267i);
        parcel.writeString(this.f5268j);
    }

    n(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f5267i = parcel.readString();
        this.f5268j = (String) m0.j(parcel.readString());
    }
}
