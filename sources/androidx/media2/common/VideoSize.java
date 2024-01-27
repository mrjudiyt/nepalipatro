package androidx.media2.common;

import j1.b;

public class VideoSize implements b {

    /* renamed from: a  reason: collision with root package name */
    int f3770a;

    /* renamed from: b  reason: collision with root package name */
    int f3771b;

    VideoSize() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        if (this.f3770a == videoSize.f3770a && this.f3771b == videoSize.f3771b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f3771b;
        int i11 = this.f3770a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f3770a + "x" + this.f3771b;
    }
}
