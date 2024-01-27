package v1;

/* compiled from: Preference */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f12227a;

    /* renamed from: b  reason: collision with root package name */
    public Long f12228b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, z10 ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f12227a.equals(dVar.f12227a)) {
            return false;
        }
        Long l10 = this.f12228b;
        Long l11 = dVar.f12228b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        if (l11 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f12227a.hashCode() * 31;
        Long l10 = this.f12228b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f12227a = str;
        this.f12228b = Long.valueOf(j10);
    }
}
