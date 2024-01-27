package androidx.media2.session;

import androidx.core.util.c;
import androidx.media.AudioAttributesCompat;
import j1.b;

public final class MediaController$PlaybackInfo implements b {

    /* renamed from: a  reason: collision with root package name */
    int f3811a;

    /* renamed from: b  reason: collision with root package name */
    int f3812b;

    /* renamed from: c  reason: collision with root package name */
    int f3813c;

    /* renamed from: d  reason: collision with root package name */
    int f3814d;

    /* renamed from: e  reason: collision with root package name */
    AudioAttributesCompat f3815e;

    MediaController$PlaybackInfo() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        if (this.f3811a == mediaController$PlaybackInfo.f3811a && this.f3812b == mediaController$PlaybackInfo.f3812b && this.f3813c == mediaController$PlaybackInfo.f3813c && this.f3814d == mediaController$PlaybackInfo.f3814d && c.a(this.f3815e, mediaController$PlaybackInfo.f3815e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f3811a), Integer.valueOf(this.f3812b), Integer.valueOf(this.f3813c), Integer.valueOf(this.f3814d), this.f3815e);
    }
}
