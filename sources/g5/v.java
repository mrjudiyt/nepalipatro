package g5;

import a6.p;
import android.os.Parcel;
import android.os.Parcelable;
import e4.j;
import java.util.Arrays;

/* compiled from: TrackGroup */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f8920h;

    /* renamed from: i  reason: collision with root package name */
    private final j[] f8921i;

    /* renamed from: j  reason: collision with root package name */
    private int f8922j;

    /* compiled from: TrackGroup */
    class a implements Parcelable.Creator<v> {
        a() {
        }

        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        /* renamed from: b */
        public v[] newArray(int i10) {
            return new v[i10];
        }
    }

    public v(j... jVarArr) {
        a6.a.f(jVarArr.length > 0);
        this.f8921i = jVarArr;
        this.f8920h = jVarArr.length;
        g();
    }

    private static void d(String str, String str2, String str3, int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i10);
        sb.append(")");
        p.d("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    private static String e(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int f(int i10) {
        return i10 | 16384;
    }

    private void g() {
        String e10 = e(this.f8921i[0].f8087j);
        int f10 = f(this.f8921i[0].f8089l);
        int i10 = 1;
        while (true) {
            j[] jVarArr = this.f8921i;
            if (i10 >= jVarArr.length) {
                return;
            }
            if (!e10.equals(e(jVarArr[i10].f8087j))) {
                j[] jVarArr2 = this.f8921i;
                d("languages", jVarArr2[0].f8087j, jVarArr2[i10].f8087j, i10);
                return;
            } else if (f10 != f(this.f8921i[i10].f8089l)) {
                d("role flags", Integer.toBinaryString(this.f8921i[0].f8089l), Integer.toBinaryString(this.f8921i[i10].f8089l), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public j b(int i10) {
        return this.f8921i[i10];
    }

    public int c(j jVar) {
        int i10 = 0;
        while (true) {
            j[] jVarArr = this.f8921i;
            if (i10 >= jVarArr.length) {
                return -1;
            }
            if (jVar == jVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f8920h != vVar.f8920h || !Arrays.equals(this.f8921i, vVar.f8921i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f8922j == 0) {
            this.f8922j = 527 + Arrays.hashCode(this.f8921i);
        }
        return this.f8922j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8920h);
        for (int i11 = 0; i11 < this.f8920h; i11++) {
            parcel.writeParcelable(this.f8921i[i11], 0);
        }
    }

    v(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8920h = readInt;
        this.f8921i = new j[readInt];
        for (int i10 = 0; i10 < this.f8920h; i10++) {
            this.f8921i[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
