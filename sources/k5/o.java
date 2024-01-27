package k5;

/* compiled from: UtcTimingElement */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f9731a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9732b;

    public o(String str, String str2) {
        this.f9731a = str;
        this.f9732b = str2;
    }

    public String toString() {
        String str = this.f9731a;
        String str2 = this.f9732b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
