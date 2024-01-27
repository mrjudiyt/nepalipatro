package a5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.k0;
import e4.j;
import x4.a;

/* compiled from: VorbisComment */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final String f143h;

    /* renamed from: i  reason: collision with root package name */
    public final String f144i;

    /* compiled from: VorbisComment */
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

    public b(String str, String str2) {
        this.f143h = str;
        this.f144i = str2;
    }

    public /* synthetic */ byte[] W() {
        return x4.b.a(this);
    }

    public void a(k0.b bVar) {
        String str = this.f143h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.K(this.f144i);
                return;
            case 1:
                bVar.V(this.f144i);
                return;
            case 2:
                bVar.O(this.f144i);
                return;
            case 3:
                bVar.J(this.f144i);
                return;
            case 4:
                bVar.L(this.f144i);
                return;
            default:
                return;
        }
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
        if (!this.f143h.equals(bVar.f143h) || !this.f144i.equals(bVar.f144i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f143h.hashCode()) * 31) + this.f144i.hashCode();
    }

    public String toString() {
        String str = this.f143h;
        String str2 = this.f144i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f143h);
        parcel.writeString(this.f144i);
    }

    b(Parcel parcel) {
        this.f143h = (String) m0.j(parcel.readString());
        this.f144i = (String) m0.j(parcel.readString());
    }
}
