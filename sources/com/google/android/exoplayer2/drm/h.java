package com.google.android.exoplayer2.drm;

import a6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import e4.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: DrmInitData */
public final class h implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final b[] f6565h;

    /* renamed from: i  reason: collision with root package name */
    private int f6566i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6567j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6568k;

    /* compiled from: DrmInitData */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        /* renamed from: b */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* compiled from: DrmInitData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        private int f6569h;

        /* renamed from: i  reason: collision with root package name */
        public final UUID f6570i;

        /* renamed from: j  reason: collision with root package name */
        public final String f6571j;

        /* renamed from: k  reason: collision with root package name */
        public final String f6572k;

        /* renamed from: l  reason: collision with root package name */
        public final byte[] f6573l;

        /* compiled from: DrmInitData */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public boolean b(b bVar) {
            return d() && !bVar.d() && e(bVar.f6570i);
        }

        public b c(byte[] bArr) {
            return new b(this.f6570i, this.f6571j, this.f6572k, bArr);
        }

        public boolean d() {
            return this.f6573l != null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return c.f8045a.equals(this.f6570i) || uuid.equals(this.f6570i);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!m0.c(this.f6571j, bVar.f6571j) || !m0.c(this.f6572k, bVar.f6572k) || !m0.c(this.f6570i, bVar.f6570i) || !Arrays.equals(this.f6573l, bVar.f6573l)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f6569h == 0) {
                int hashCode = this.f6570i.hashCode() * 31;
                String str = this.f6571j;
                this.f6569h = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6572k.hashCode()) * 31) + Arrays.hashCode(this.f6573l);
            }
            return this.f6569h;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f6570i.getMostSignificantBits());
            parcel.writeLong(this.f6570i.getLeastSignificantBits());
            parcel.writeString(this.f6571j);
            parcel.writeString(this.f6572k);
            parcel.writeByteArray(this.f6573l);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f6570i = (UUID) a6.a.e(uuid);
            this.f6571j = str;
            this.f6572k = (String) a6.a.e(str2);
            this.f6573l = bArr;
        }

        b(Parcel parcel) {
            this.f6570i = new UUID(parcel.readLong(), parcel.readLong());
            this.f6571j = parcel.readString();
            this.f6572k = (String) m0.j(parcel.readString());
            this.f6573l = parcel.createByteArray();
        }
    }

    public h(List<b> list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean c(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f6570i.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static h e(h hVar, h hVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (hVar != null) {
            str = hVar.f6567j;
            for (b bVar : hVar.f6565h) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (hVar2 != null) {
            if (str == null) {
                str = hVar2.f6567j;
            }
            int size = arrayList.size();
            for (b bVar2 : hVar2.f6565h) {
                if (bVar2.d() && !c(arrayList, size, bVar2.f6570i)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new h(str, (List<b>) arrayList);
    }

    /* renamed from: b */
    public int compare(b bVar, b bVar2) {
        UUID uuid = c.f8045a;
        if (uuid.equals(bVar.f6570i)) {
            return uuid.equals(bVar2.f6570i) ? 0 : 1;
        }
        return bVar.f6570i.compareTo(bVar2.f6570i);
    }

    public h d(String str) {
        if (m0.c(this.f6567j, str)) {
            return this;
        }
        return new h(str, false, this.f6565h);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!m0.c(this.f6567j, hVar.f6567j) || !Arrays.equals(this.f6565h, hVar.f6565h)) {
            return false;
        }
        return true;
    }

    public b f(int i10) {
        return this.f6565h[i10];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f6567j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.h g(com.google.android.exoplayer2.drm.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f6567j
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.f6567j
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            a6.a.f(r0)
            java.lang.String r0 = r2.f6567j
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.f6567j
        L_0x001c:
            com.google.android.exoplayer2.drm.h$b[] r1 = r2.f6565h
            com.google.android.exoplayer2.drm.h$b[] r3 = r3.f6565h
            java.lang.Object[] r3 = a6.m0.u0(r1, r3)
            com.google.android.exoplayer2.drm.h$b[] r3 = (com.google.android.exoplayer2.drm.h.b[]) r3
            com.google.android.exoplayer2.drm.h r1 = new com.google.android.exoplayer2.drm.h
            r1.<init>((java.lang.String) r0, (com.google.android.exoplayer2.drm.h.b[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.h.g(com.google.android.exoplayer2.drm.h):com.google.android.exoplayer2.drm.h");
    }

    public int hashCode() {
        if (this.f6566i == 0) {
            String str = this.f6567j;
            this.f6566i = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6565h);
        }
        return this.f6566i;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6567j);
        parcel.writeTypedArray(this.f6565h, 0);
    }

    public h(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public h(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public h(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.exoplayer2.drm.h$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h(java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.h.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f6567j = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.h$b[] r3 = (com.google.android.exoplayer2.drm.h.b[]) r3
        L_0x000e:
            r0.f6565h = r3
            int r1 = r3.length
            r0.f6568k = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.h.<init>(java.lang.String, boolean, com.google.android.exoplayer2.drm.h$b[]):void");
    }

    h(Parcel parcel) {
        this.f6567j = parcel.readString();
        b[] bVarArr = (b[]) m0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f6565h = bVarArr;
        this.f6568k = bVarArr.length;
    }
}
