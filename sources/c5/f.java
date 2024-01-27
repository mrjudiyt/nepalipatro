package c5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: GeobFrame */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5244i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5245j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5246k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f5247l;

    /* compiled from: GeobFrame */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f5244i = str;
        this.f5245j = str2;
        this.f5246k = str3;
        this.f5247l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!m0.c(this.f5244i, fVar.f5244i) || !m0.c(this.f5245j, fVar.f5245j) || !m0.c(this.f5246k, fVar.f5246k) || !Arrays.equals(this.f5247l, fVar.f5247l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5244i;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5245j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5246k;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.f5247l);
    }

    public String toString() {
        String str = this.f5254h;
        String str2 = this.f5244i;
        String str3 = this.f5245j;
        String str4 = this.f5246k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5244i);
        parcel.writeString(this.f5245j);
        parcel.writeString(this.f5246k);
        parcel.writeByteArray(this.f5247l);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f5244i = (String) m0.j(parcel.readString());
        this.f5245j = (String) m0.j(parcel.readString());
        this.f5246k = (String) m0.j(parcel.readString());
        this.f5247l = (byte[]) m0.j(parcel.createByteArray());
    }
}
