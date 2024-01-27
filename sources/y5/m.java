package y5;

import a6.m0;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: TrackSelectionParameters */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public static final m D;
    @Deprecated
    public static final m E;
    public final boolean A;
    public final boolean B;
    public final boolean C;

    /* renamed from: h  reason: collision with root package name */
    public final int f13055h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13056i;

    /* renamed from: j  reason: collision with root package name */
    public final int f13057j;

    /* renamed from: k  reason: collision with root package name */
    public final int f13058k;

    /* renamed from: l  reason: collision with root package name */
    public final int f13059l;

    /* renamed from: m  reason: collision with root package name */
    public final int f13060m;

    /* renamed from: n  reason: collision with root package name */
    public final int f13061n;

    /* renamed from: o  reason: collision with root package name */
    public final int f13062o;

    /* renamed from: p  reason: collision with root package name */
    public final int f13063p;

    /* renamed from: q  reason: collision with root package name */
    public final int f13064q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f13065r;

    /* renamed from: s  reason: collision with root package name */
    public final x<String> f13066s;

    /* renamed from: t  reason: collision with root package name */
    public final x<String> f13067t;

    /* renamed from: u  reason: collision with root package name */
    public final int f13068u;

    /* renamed from: v  reason: collision with root package name */
    public final int f13069v;

    /* renamed from: w  reason: collision with root package name */
    public final int f13070w;

    /* renamed from: x  reason: collision with root package name */
    public final x<String> f13071x;

    /* renamed from: y  reason: collision with root package name */
    public final x<String> f13072y;

    /* renamed from: z  reason: collision with root package name */
    public final int f13073z;

    /* compiled from: TrackSelectionParameters */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    static {
        m w10 = new b().w();
        D = w10;
        E = w10;
    }

    protected m(b bVar) {
        this.f13055h = bVar.f13074a;
        this.f13056i = bVar.f13075b;
        this.f13057j = bVar.f13076c;
        this.f13058k = bVar.f13077d;
        this.f13059l = bVar.f13078e;
        this.f13060m = bVar.f13079f;
        this.f13061n = bVar.f13080g;
        this.f13062o = bVar.f13081h;
        this.f13063p = bVar.f13082i;
        this.f13064q = bVar.f13083j;
        this.f13065r = bVar.f13084k;
        this.f13066s = bVar.f13085l;
        this.f13067t = bVar.f13086m;
        this.f13068u = bVar.f13087n;
        this.f13069v = bVar.f13088o;
        this.f13070w = bVar.f13089p;
        this.f13071x = bVar.f13090q;
        this.f13072y = bVar.f13091r;
        this.f13073z = bVar.f13092s;
        this.A = bVar.f13093t;
        this.B = bVar.f13094u;
        this.C = bVar.f13095v;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f13055h == mVar.f13055h && this.f13056i == mVar.f13056i && this.f13057j == mVar.f13057j && this.f13058k == mVar.f13058k && this.f13059l == mVar.f13059l && this.f13060m == mVar.f13060m && this.f13061n == mVar.f13061n && this.f13062o == mVar.f13062o && this.f13065r == mVar.f13065r && this.f13063p == mVar.f13063p && this.f13064q == mVar.f13064q && this.f13066s.equals(mVar.f13066s) && this.f13067t.equals(mVar.f13067t) && this.f13068u == mVar.f13068u && this.f13069v == mVar.f13069v && this.f13070w == mVar.f13070w && this.f13071x.equals(mVar.f13071x) && this.f13072y.equals(mVar.f13072y) && this.f13073z == mVar.f13073z && this.A == mVar.A && this.B == mVar.B && this.C == mVar.C) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.f13055h + 31) * 31) + this.f13056i) * 31) + this.f13057j) * 31) + this.f13058k) * 31) + this.f13059l) * 31) + this.f13060m) * 31) + this.f13061n) * 31) + this.f13062o) * 31) + (this.f13065r ? 1 : 0)) * 31) + this.f13063p) * 31) + this.f13064q) * 31) + this.f13066s.hashCode()) * 31) + this.f13067t.hashCode()) * 31) + this.f13068u) * 31) + this.f13069v) * 31) + this.f13070w) * 31) + this.f13071x.hashCode()) * 31) + this.f13072y.hashCode()) * 31) + this.f13073z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f13067t);
        parcel.writeInt(this.f13068u);
        parcel.writeList(this.f13072y);
        parcel.writeInt(this.f13073z);
        m0.M0(parcel, this.A);
        parcel.writeInt(this.f13055h);
        parcel.writeInt(this.f13056i);
        parcel.writeInt(this.f13057j);
        parcel.writeInt(this.f13058k);
        parcel.writeInt(this.f13059l);
        parcel.writeInt(this.f13060m);
        parcel.writeInt(this.f13061n);
        parcel.writeInt(this.f13062o);
        parcel.writeInt(this.f13063p);
        parcel.writeInt(this.f13064q);
        m0.M0(parcel, this.f13065r);
        parcel.writeList(this.f13066s);
        parcel.writeInt(this.f13069v);
        parcel.writeInt(this.f13070w);
        parcel.writeList(this.f13071x);
        m0.M0(parcel, this.B);
        m0.M0(parcel, this.C);
    }

    /* compiled from: TrackSelectionParameters */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f13074a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f13075b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f13076c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f13077d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f13078e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f13079f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f13080g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f13081h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f13082i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f13083j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f13084k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public x<String> f13085l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public x<String> f13086m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public int f13087n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f13088o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f13089p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public x<String> f13090q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public x<String> f13091r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public int f13092s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f13093t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public boolean f13094u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public boolean f13095v;

        @Deprecated
        public b() {
            this.f13074a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13075b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13076c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13077d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13082i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13083j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13084k = true;
            this.f13085l = x.s();
            this.f13086m = x.s();
            this.f13087n = 0;
            this.f13088o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13089p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f13090q = x.s();
            this.f13091r = x.s();
            this.f13092s = 0;
            this.f13093t = false;
            this.f13094u = false;
            this.f13095v = false;
        }

        private void y(Context context) {
            CaptioningManager captioningManager;
            if ((m0.f205a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f13092s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f13091r = x.t(m0.S(locale));
                }
            }
        }

        public b A(Context context, boolean z10) {
            Point L = m0.L(context);
            return z(L.x, L.y, z10);
        }

        public m w() {
            return new m(this);
        }

        public b x(Context context) {
            if (m0.f205a >= 19) {
                y(context);
            }
            return this;
        }

        public b z(int i10, int i11, boolean z10) {
            this.f13082i = i10;
            this.f13083j = i11;
            this.f13084k = z10;
            return this;
        }

        public b(Context context) {
            this();
            x(context);
            A(context, true);
        }
    }

    m(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f13067t = x.n(arrayList);
        this.f13068u = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f13072y = x.n(arrayList2);
        this.f13073z = parcel.readInt();
        this.A = m0.A0(parcel);
        this.f13055h = parcel.readInt();
        this.f13056i = parcel.readInt();
        this.f13057j = parcel.readInt();
        this.f13058k = parcel.readInt();
        this.f13059l = parcel.readInt();
        this.f13060m = parcel.readInt();
        this.f13061n = parcel.readInt();
        this.f13062o = parcel.readInt();
        this.f13063p = parcel.readInt();
        this.f13064q = parcel.readInt();
        this.f13065r = m0.A0(parcel);
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, (ClassLoader) null);
        this.f13066s = x.n(arrayList3);
        this.f13069v = parcel.readInt();
        this.f13070w = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, (ClassLoader) null);
        this.f13071x = x.n(arrayList4);
        this.B = m0.A0(parcel);
        this.C = m0.A0(parcel);
    }
}
