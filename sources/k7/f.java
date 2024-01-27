package k7;

import j7.a;
import j7.b;
import j7.c;

/* compiled from: QRCode */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private b f15461a;

    /* renamed from: b  reason: collision with root package name */
    private a f15462b;

    /* renamed from: c  reason: collision with root package name */
    private c f15463c;

    /* renamed from: d  reason: collision with root package name */
    private int f15464d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f15465e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f15465e;
    }

    public void c(a aVar) {
        this.f15462b = aVar;
    }

    public void d(int i10) {
        this.f15464d = i10;
    }

    public void e(b bVar) {
        this.f15465e = bVar;
    }

    public void f(b bVar) {
        this.f15461a = bVar;
    }

    public void g(c cVar) {
        this.f15463c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f15461a);
        sb.append("\n ecLevel: ");
        sb.append(this.f15462b);
        sb.append("\n version: ");
        sb.append(this.f15463c);
        sb.append("\n maskPattern: ");
        sb.append(this.f15464d);
        if (this.f15465e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f15465e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
