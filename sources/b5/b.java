package b5;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.k0;
import e4.j;
import x4.a;

/* compiled from: IcyHeaders */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f4999h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5000i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5001j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5002k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5003l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5004m;

    /* compiled from: IcyHeaders */
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

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        a6.a.a(i11 == -1 || i11 > 0);
        this.f4999h = i10;
        this.f5000i = str;
        this.f5001j = str2;
        this.f5002k = str3;
        this.f5003l = z10;
        this.f5004m = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b5.b b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0041 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x003d
        L_0x0021:
            java.lang.String r7 = "Invalid bitrate: "
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x003f }
            int r9 = r8.length()     // Catch:{ NumberFormatException -> 0x003f }
            if (r9 == 0) goto L_0x0032
            java.lang.String r7 = r7.concat(r8)     // Catch:{ NumberFormatException -> 0x003f }
            goto L_0x0038
        L_0x0032:
            java.lang.String r8 = new java.lang.String     // Catch:{ NumberFormatException -> 0x003f }
            r8.<init>(r7)     // Catch:{ NumberFormatException -> 0x003f }
            r7 = r8
        L_0x0038:
            a6.p.h(r2, r7)     // Catch:{ NumberFormatException -> 0x003f }
            r1 = 0
            r6 = -1
        L_0x003d:
            r7 = r6
            goto L_0x0060
        L_0x003f:
            goto L_0x0042
        L_0x0041:
            r6 = -1
        L_0x0042:
            java.lang.String r7 = "Invalid bitrate header: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = r7.concat(r1)
            goto L_0x0058
        L_0x0053:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
        L_0x0058:
            a6.p.h(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0060
        L_0x005e:
            r1 = 0
            r7 = -1
        L_0x0060:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0074
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r9 = r8
        L_0x0075:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0088
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r10 = r8
        L_0x0089:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x009c
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x009d
        L_0x009c:
            r11 = r8
        L_0x009d:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00b6
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00b7
        L_0x00b6:
            r12 = 0
        L_0x00b7:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0103
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00eb }
            if (r5 <= 0) goto L_0x00cf
            r3 = r5
            goto L_0x00e7
        L_0x00cf:
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00e9 }
            int r6 = r4.length()     // Catch:{ NumberFormatException -> 0x00e9 }
            if (r6 == 0) goto L_0x00de
            java.lang.String r4 = r0.concat(r4)     // Catch:{ NumberFormatException -> 0x00e9 }
            goto L_0x00e3
        L_0x00de:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x00e9 }
            r4.<init>(r0)     // Catch:{ NumberFormatException -> 0x00e9 }
        L_0x00e3:
            a6.p.h(r2, r4)     // Catch:{ NumberFormatException -> 0x00e9 }
            r4 = r1
        L_0x00e7:
            r1 = r4
            goto L_0x0103
        L_0x00e9:
            r3 = r5
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r4 = r13.length()
            if (r4 == 0) goto L_0x00fb
            java.lang.String r13 = r0.concat(r13)
            goto L_0x0100
        L_0x00fb:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L_0x0100:
            a6.p.h(r2, r13)
        L_0x0103:
            if (r1 == 0) goto L_0x0111
            b5.b r13 = new b5.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x0111:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b.b(java.util.Map):b5.b");
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
        if (this.f4999h != bVar.f4999h || !m0.c(this.f5000i, bVar.f5000i) || !m0.c(this.f5001j, bVar.f5001j) || !m0.c(this.f5002k, bVar.f5002k) || this.f5003l != bVar.f5003l || this.f5004m != bVar.f5004m) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (527 + this.f4999h) * 31;
        String str = this.f5000i;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5001j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5002k;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.f5003l ? 1 : 0)) * 31) + this.f5004m;
    }

    public String toString() {
        String str = this.f5001j;
        String str2 = this.f5000i;
        int i10 = this.f4999h;
        int i11 = this.f5004m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i10);
        sb.append(", metadataInterval=");
        sb.append(i11);
        return sb.toString();
    }

    public /* synthetic */ j u() {
        return x4.b.b(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4999h);
        parcel.writeString(this.f5000i);
        parcel.writeString(this.f5001j);
        parcel.writeString(this.f5002k);
        m0.M0(parcel, this.f5003l);
        parcel.writeInt(this.f5004m);
    }

    b(Parcel parcel) {
        this.f4999h = parcel.readInt();
        this.f5000i = parcel.readString();
        this.f5001j = parcel.readString();
        this.f5002k = parcel.readString();
        this.f5003l = m0.A0(parcel);
        this.f5004m = parcel.readInt();
    }
}
