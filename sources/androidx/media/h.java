package androidx.media;

import android.text.TextUtils;
import androidx.core.util.c;

/* compiled from: MediaSessionManagerImplBase */
class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private String f3730a;

    /* renamed from: b  reason: collision with root package name */
    private int f3731b;

    /* renamed from: c  reason: collision with root package name */
    private int f3732c;

    h(String str, int i10, int i11) {
        this.f3730a = str;
        this.f3731b = i10;
        this.f3732c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3731b < 0 || hVar.f3731b < 0) {
            if (!TextUtils.equals(this.f3730a, hVar.f3730a) || this.f3732c != hVar.f3732c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f3730a, hVar.f3730a) && this.f3731b == hVar.f3731b && this.f3732c == hVar.f3732c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return c.b(this.f3730a, Integer.valueOf(this.f3732c));
    }
}
