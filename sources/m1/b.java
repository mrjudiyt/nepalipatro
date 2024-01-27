package m1;

import android.graphics.Rect;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* compiled from: Bounds.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f10157a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10158b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10159c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10160d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10157a = i10;
        this.f10158b = i11;
        this.f10159c = i12;
        this.f10160d = i13;
    }

    public final int a() {
        return this.f10160d - this.f10158b;
    }

    public final int b() {
        return this.f10157a;
    }

    public final int c() {
        return this.f10158b;
    }

    public final int d() {
        return this.f10159c - this.f10157a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(b.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f10157a == bVar.f10157a && this.f10158b == bVar.f10158b && this.f10159c == bVar.f10159c && this.f10160d == bVar.f10160d;
    }

    public final Rect f() {
        return new Rect(this.f10157a, this.f10158b, this.f10159c, this.f10160d);
    }

    public int hashCode() {
        return (((((this.f10157a * 31) + this.f10158b) * 31) + this.f10159c) * 31) + this.f10160d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f10157a + ',' + this.f10158b + ',' + this.f10159c + ',' + this.f10160d + "] }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        m.f(rect, "rect");
    }
}
