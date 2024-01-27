package androidx.media2.common;

import androidx.core.util.c;
import j1.b;
import java.util.Arrays;

public final class SubtitleData implements b {

    /* renamed from: a  reason: collision with root package name */
    long f3767a;

    /* renamed from: b  reason: collision with root package name */
    long f3768b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f3769c;

    SubtitleData() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        if (this.f3767a == subtitleData.f3767a && this.f3768b == subtitleData.f3768b && Arrays.equals(this.f3769c, subtitleData.f3769c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Long.valueOf(this.f3767a), Long.valueOf(this.f3768b), Integer.valueOf(Arrays.hashCode(this.f3769c)));
    }
}
