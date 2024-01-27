package t3;

import android.content.Context;
import c4.a;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11639a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11640b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11641c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11642d;

    c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f11639a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f11640b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f11641c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f11642d = str;
    }

    public Context b() {
        return this.f11639a;
    }

    public String c() {
        return this.f11642d;
    }

    public a d() {
        return this.f11641c;
    }

    public a e() {
        return this.f11640b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f11639a.equals(hVar.b()) || !this.f11640b.equals(hVar.e()) || !this.f11641c.equals(hVar.d()) || !this.f11642d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f11639a.hashCode() ^ 1000003) * 1000003) ^ this.f11640b.hashCode()) * 1000003) ^ this.f11641c.hashCode()) * 1000003) ^ this.f11642d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f11639a + ", wallClock=" + this.f11640b + ", monotonicClock=" + this.f11641c + ", backendName=" + this.f11642d + "}";
    }
}
