package x5;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l6.c;

/* compiled from: WebvttCssStyle */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f12785a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f12786b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f12787c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f12788d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f12789e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f12790f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12791g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f12792h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12793i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f12794j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f12795k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f12796l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f12797m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f12798n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f12799o;

    /* renamed from: p  reason: collision with root package name */
    private int f12800p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12801q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f12795k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f12793i) {
            return this.f12792h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f12801q;
    }

    public int c() {
        if (this.f12791g) {
            return this.f12790f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f12789e;
    }

    public float e() {
        return this.f12799o;
    }

    public int f() {
        return this.f12798n;
    }

    public int g() {
        return this.f12800p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f12785a.isEmpty() && this.f12786b.isEmpty() && this.f12787c.isEmpty() && this.f12788d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f12785a, str, 1073741824), this.f12786b, str2, 2), this.f12788d, str3, 4);
        if (B == -1 || !set.containsAll(this.f12787c)) {
            return 0;
        }
        return B + (this.f12787c.size() * 4);
    }

    public int i() {
        int i10 = this.f12796l;
        if (i10 == -1 && this.f12797m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f12797m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public boolean j() {
        return this.f12793i;
    }

    public boolean k() {
        return this.f12791g;
    }

    public boolean l() {
        return this.f12794j == 1;
    }

    public boolean m() {
        return this.f12795k == 1;
    }

    public d n(int i10) {
        this.f12792h = i10;
        this.f12793i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f12796l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f12801q = z10;
        return this;
    }

    public d q(int i10) {
        this.f12790f = i10;
        this.f12791g = true;
        return this;
    }

    public d r(String str) {
        this.f12789e = str == null ? null : c.e(str);
        return this;
    }

    public d s(float f10) {
        this.f12799o = f10;
        return this;
    }

    public d t(int i10) {
        this.f12798n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f12797m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f12800p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f12787c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f12785a = str;
    }

    public void y(String str) {
        this.f12786b = str;
    }

    public void z(String str) {
        this.f12788d = str;
    }
}
