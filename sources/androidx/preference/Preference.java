package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.k;
import com.google.android.gms.common.api.Api;
import java.util.List;
import t0.g;

public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private b K;
    private List<Preference> L;
    private e M;
    private final View.OnClickListener N;

    /* renamed from: h  reason: collision with root package name */
    private final Context f3872h;

    /* renamed from: i  reason: collision with root package name */
    private t0.b f3873i;

    /* renamed from: j  reason: collision with root package name */
    private c f3874j;

    /* renamed from: k  reason: collision with root package name */
    private d f3875k;

    /* renamed from: l  reason: collision with root package name */
    private int f3876l;

    /* renamed from: m  reason: collision with root package name */
    private int f3877m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f3878n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f3879o;

    /* renamed from: p  reason: collision with root package name */
    private int f3880p;

    /* renamed from: q  reason: collision with root package name */
    private String f3881q;

    /* renamed from: r  reason: collision with root package name */
    private Intent f3882r;

    /* renamed from: s  reason: collision with root package name */
    private String f3883s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3884t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3885u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3886v;

    /* renamed from: w  reason: collision with root package name */
    private String f3887w;

    /* renamed from: x  reason: collision with root package name */
    private Object f3888x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3889y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f3890z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Preference.this.D(view);
        }
    }

    interface b {
        void a(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    public interface e<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3876l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3877m = 0;
        this.f3884t = true;
        this.f3885u = true;
        this.f3886v = true;
        this.f3889y = true;
        this.f3890z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.E = true;
        this.H = true;
        int i12 = t0.e.preference;
        this.I = i12;
        this.N = new a();
        this.f3872h = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.I, i10, i11);
        this.f3880p = k.n(obtainStyledAttributes, g.f11533g0, g.J, 0);
        this.f3881q = k.o(obtainStyledAttributes, g.f11539j0, g.P);
        this.f3878n = k.p(obtainStyledAttributes, g.f11555r0, g.N);
        this.f3879o = k.p(obtainStyledAttributes, g.f11553q0, g.Q);
        this.f3876l = k.d(obtainStyledAttributes, g.f11543l0, g.R, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f3883s = k.o(obtainStyledAttributes, g.f11531f0, g.W);
        this.I = k.n(obtainStyledAttributes, g.f11541k0, g.M, i12);
        this.J = k.n(obtainStyledAttributes, g.f11557s0, g.S, 0);
        this.f3884t = k.b(obtainStyledAttributes, g.f11528e0, g.L, true);
        this.f3885u = k.b(obtainStyledAttributes, g.f11547n0, g.O, true);
        this.f3886v = k.b(obtainStyledAttributes, g.f11545m0, g.K, true);
        this.f3887w = k.o(obtainStyledAttributes, g.f11522c0, g.T);
        int i13 = g.Z;
        this.B = k.b(obtainStyledAttributes, i13, i13, this.f3885u);
        int i14 = g.f11516a0;
        this.C = k.b(obtainStyledAttributes, i14, i14, this.f3885u);
        int i15 = g.f11519b0;
        if (obtainStyledAttributes.hasValue(i15)) {
            this.f3888x = A(obtainStyledAttributes, i15);
        } else {
            int i16 = g.U;
            if (obtainStyledAttributes.hasValue(i16)) {
                this.f3888x = A(obtainStyledAttributes, i16);
            }
        }
        this.H = k.b(obtainStyledAttributes, g.f11549o0, g.V, true);
        int i17 = g.f11551p0;
        boolean hasValue = obtainStyledAttributes.hasValue(i17);
        this.D = hasValue;
        if (hasValue) {
            this.E = k.b(obtainStyledAttributes, i17, g.X, true);
        }
        this.F = k.b(obtainStyledAttributes, g.f11535h0, g.Y, false);
        int i18 = g.f11537i0;
        this.A = k.b(obtainStyledAttributes, i18, i18, true);
        int i19 = g.f11525d0;
        this.G = k.b(obtainStyledAttributes, i19, i19, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        return null;
    }

    public void B(Preference preference, boolean z10) {
        if (this.f3890z == z10) {
            this.f3890z = !z10;
            x(I());
            w();
        }
    }

    public void C() {
        if (u() && v()) {
            y();
            d dVar = this.f3875k;
            if (dVar == null || !dVar.a(this)) {
                p();
                if (this.f3882r != null) {
                    e().startActivity(this.f3882r);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void D(View view) {
        C();
    }

    /* access modifiers changed from: protected */
    public boolean E(boolean z10) {
        if (!J()) {
            return false;
        }
        if (z10 == l(!z10)) {
            return true;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean F(int i10) {
        if (!J()) {
            return false;
        }
        if (i10 == m(~i10)) {
            return true;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean G(String str) {
        if (!J()) {
            return false;
        }
        if (TextUtils.equals(str, n((String) null))) {
            return true;
        }
        o();
        throw null;
    }

    public final void H(e eVar) {
        this.M = eVar;
        w();
    }

    public boolean I() {
        return !u();
    }

    /* access modifiers changed from: protected */
    public boolean J() {
        return false;
    }

    public boolean a(Object obj) {
        c cVar = this.f3874j;
        return cVar == null || cVar.a(this, obj);
    }

    /* renamed from: d */
    public int compareTo(Preference preference) {
        int i10 = this.f3876l;
        int i11 = preference.f3876l;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f3878n;
        CharSequence charSequence2 = preference.f3878n;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3878n.toString());
    }

    public Context e() {
        return this.f3872h;
    }

    /* access modifiers changed from: package-private */
    public StringBuilder f() {
        StringBuilder sb = new StringBuilder();
        CharSequence s10 = s();
        if (!TextUtils.isEmpty(s10)) {
            sb.append(s10);
            sb.append(' ');
        }
        CharSequence q10 = q();
        if (!TextUtils.isEmpty(q10)) {
            sb.append(q10);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String g() {
        return this.f3883s;
    }

    public Intent k() {
        return this.f3882r;
    }

    /* access modifiers changed from: protected */
    public boolean l(boolean z10) {
        if (!J()) {
            return z10;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int m(int i10) {
        if (!J()) {
            return i10;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public String n(String str) {
        if (!J()) {
            return str;
        }
        o();
        throw null;
    }

    public t0.a o() {
        return null;
    }

    public t0.b p() {
        return this.f3873i;
    }

    public CharSequence q() {
        if (r() != null) {
            return r().a(this);
        }
        return this.f3879o;
    }

    public final e r() {
        return this.M;
    }

    public CharSequence s() {
        return this.f3878n;
    }

    public boolean t() {
        return !TextUtils.isEmpty(this.f3881q);
    }

    public String toString() {
        return f().toString();
    }

    public boolean u() {
        return this.f3884t && this.f3889y && this.f3890z;
    }

    public boolean v() {
        return this.f3885u;
    }

    /* access modifiers changed from: protected */
    public void w() {
        b bVar = this.K;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void x(boolean z10) {
        List<Preference> list = this.L;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).z(this, z10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    public void z(Preference preference, boolean z10) {
        if (this.f3889y == z10) {
            this.f3889y = !z10;
            x(I());
            w();
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, t0.c.preferenceStyle, 16842894));
    }
}
