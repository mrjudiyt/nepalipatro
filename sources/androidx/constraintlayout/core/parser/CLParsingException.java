package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {

    /* renamed from: h  reason: collision with root package name */
    private final String f1498h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1499i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1500j;

    public String a() {
        return this.f1498h + " (" + this.f1500j + " at line " + this.f1499i + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
