package w;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f12508a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12509b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12510c = false;

    /* renamed from: d  reason: collision with root package name */
    p f12511d;

    /* renamed from: e  reason: collision with root package name */
    a f12512e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f12513f;

    /* renamed from: g  reason: collision with root package name */
    public int f12514g;

    /* renamed from: h  reason: collision with root package name */
    int f12515h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f12516i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12517j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f12518k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f12519l = new ArrayList();

    /* compiled from: DependencyNode */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f12511d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f12519l) {
            if (!fVar.f12517j) {
                return;
            }
        }
        this.f12510c = true;
        d dVar2 = this.f12508a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f12509b) {
            this.f12511d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f next : this.f12519l) {
            if (!(next instanceof g)) {
                i10++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f12517j) {
            g gVar = this.f12516i;
            if (gVar != null) {
                if (gVar.f12517j) {
                    this.f12513f = this.f12515h * gVar.f12514g;
                } else {
                    return;
                }
            }
            d(fVar2.f12514g + this.f12513f);
        }
        d dVar3 = this.f12508a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f12518k.add(dVar);
        if (this.f12517j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f12519l.clear();
        this.f12518k.clear();
        this.f12517j = false;
        this.f12514g = 0;
        this.f12510c = false;
        this.f12509b = false;
    }

    public void d(int i10) {
        if (!this.f12517j) {
            this.f12517j = true;
            this.f12514g = i10;
            for (d next : this.f12518k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12511d.f12562b.r());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f12512e);
        sb.append("(");
        sb.append(this.f12517j ? Integer.valueOf(this.f12514g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f12519l.size());
        sb.append(":d=");
        sb.append(this.f12518k.size());
        sb.append(">");
        return sb.toString();
    }
}
