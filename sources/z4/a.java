package z4;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import java.util.Arrays;
import x4.a;
import x4.b;

/* compiled from: EventMessage */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0221a();

    /* renamed from: n  reason: collision with root package name */
    private static final j f13186n = new j.b().e0("application/id3").E();

    /* renamed from: o  reason: collision with root package name */
    private static final j f13187o = new j.b().e0("application/x-scte35").E();

    /* renamed from: h  reason: collision with root package name */
    public final String f13188h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13189i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13190j;

    /* renamed from: k  reason: collision with root package name */
    public final long f13191k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f13192l;

    /* renamed from: m  reason: collision with root package name */
    private int f13193m;

    /* renamed from: z4.a$a  reason: collision with other inner class name */
    /* compiled from: EventMessage */
    class C0221a implements Parcelable.Creator<a> {
        C0221a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f13188h = str;
        this.f13189i = str2;
        this.f13190j = j10;
        this.f13191k = j11;
        this.f13192l = bArr;
    }

    public byte[] W() {
        if (u() != null) {
            return this.f13192l;
        }
        return null;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f13190j != aVar.f13190j || this.f13191k != aVar.f13191k || !m0.c(this.f13188h, aVar.f13188h) || !m0.c(this.f13189i, aVar.f13189i) || !Arrays.equals(this.f13192l, aVar.f13192l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f13193m == 0) {
            String str = this.f13188h;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13189i;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f13190j;
            long j11 = this.f13191k;
            this.f13193m = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f13192l);
        }
        return this.f13193m;
    }

    public String toString() {
        String str = this.f13188h;
        long j10 = this.f13191k;
        long j11 = this.f13190j;
        String str2 = this.f13189i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j10);
        sb.append(", durationMs=");
        sb.append(j11);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public j u() {
        String str = this.f13188h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f13187o;
            case 1:
            case 2:
                return f13186n;
            default:
                return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13188h);
        parcel.writeString(this.f13189i);
        parcel.writeLong(this.f13190j);
        parcel.writeLong(this.f13191k);
        parcel.writeByteArray(this.f13192l);
    }

    a(Parcel parcel) {
        this.f13188h = (String) m0.j(parcel.readString());
        this.f13189i = (String) m0.j(parcel.readString());
        this.f13190j = parcel.readLong();
        this.f13191k = parcel.readLong();
        this.f13192l = (byte[]) m0.j(parcel.createByteArray());
    }
}
