package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class e {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1725f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    private static SparseIntArray f1726g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f1727h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f1728a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f1729b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, b> f1730c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f1731d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, a> f1732e = new HashMap<>();

    /* compiled from: ConstraintSet */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1733a;

        /* renamed from: b  reason: collision with root package name */
        String f1734b;

        /* renamed from: c  reason: collision with root package name */
        public final d f1735c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f1736d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f1737e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final C0022e f1738f = new C0022e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, b> f1739g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0021a f1740h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        static class C0021a {

            /* renamed from: a  reason: collision with root package name */
            int[] f1741a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f1742b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f1743c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f1744d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f1745e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f1746f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f1747g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f1748h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f1749i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f1750j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f1751k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f1752l = 0;

            C0021a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, float f10) {
                int i11 = this.f1746f;
                int[] iArr = this.f1744d;
                if (i11 >= iArr.length) {
                    this.f1744d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1745e;
                    this.f1745e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1744d;
                int i12 = this.f1746f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1745e;
                this.f1746f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* access modifiers changed from: package-private */
            public void b(int i10, int i11) {
                int i12 = this.f1743c;
                int[] iArr = this.f1741a;
                if (i12 >= iArr.length) {
                    this.f1741a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1742b;
                    this.f1742b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1741a;
                int i13 = this.f1743c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1742b;
                this.f1743c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(int i10, String str) {
                int i11 = this.f1749i;
                int[] iArr = this.f1747g;
                if (i11 >= iArr.length) {
                    this.f1747g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1748h;
                    this.f1748h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1747g;
                int i12 = this.f1749i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1748h;
                this.f1749i = i12 + 1;
                strArr2[i12] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i10, boolean z10) {
                int i11 = this.f1752l;
                int[] iArr = this.f1750j;
                if (i11 >= iArr.length) {
                    this.f1750j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1751k;
                    this.f1751k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1750j;
                int i12 = this.f1752l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1751k;
                this.f1752l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f1733a = i10;
            b bVar2 = this.f1737e;
            bVar2.f1772j = bVar.f1629e;
            bVar2.f1774k = bVar.f1631f;
            bVar2.f1776l = bVar.f1633g;
            bVar2.f1778m = bVar.f1635h;
            bVar2.f1780n = bVar.f1637i;
            bVar2.f1782o = bVar.f1639j;
            bVar2.f1784p = bVar.f1641k;
            bVar2.f1786q = bVar.f1643l;
            bVar2.f1788r = bVar.f1645m;
            bVar2.f1789s = bVar.f1647n;
            bVar2.f1790t = bVar.f1649o;
            bVar2.f1791u = bVar.f1657s;
            bVar2.f1792v = bVar.f1659t;
            bVar2.f1793w = bVar.f1661u;
            bVar2.f1794x = bVar.f1663v;
            bVar2.f1795y = bVar.G;
            bVar2.f1796z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1651p;
            bVar2.C = bVar.f1653q;
            bVar2.D = bVar.f1655r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1768h = bVar.f1625c;
            bVar2.f1764f = bVar.f1621a;
            bVar2.f1766g = bVar.f1623b;
            bVar2.f1760d = bVar.width;
            bVar2.f1762e = bVar.height;
            bVar2.H = bVar.leftMargin;
            bVar2.I = bVar.rightMargin;
            bVar2.J = bVar.topMargin;
            bVar2.K = bVar.bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1781n0 = bVar.f1622a0;
            bVar2.f1783o0 = bVar.f1624b0;
            bVar2.Z = bVar.P;
            bVar2.f1755a0 = bVar.Q;
            bVar2.f1757b0 = bVar.T;
            bVar2.f1759c0 = bVar.U;
            bVar2.f1761d0 = bVar.R;
            bVar2.f1763e0 = bVar.S;
            bVar2.f1765f0 = bVar.V;
            bVar2.f1767g0 = bVar.W;
            bVar2.f1779m0 = bVar.f1626c0;
            bVar2.P = bVar.f1667x;
            bVar2.R = bVar.f1669z;
            bVar2.O = bVar.f1665w;
            bVar2.Q = bVar.f1668y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1787q0 = bVar.f1628d0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.L = bVar.getMarginEnd();
                this.f1737e.M = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void g(int i10, f.a aVar) {
            f(i10, aVar);
            this.f1735c.f1815d = aVar.f1833x0;
            C0022e eVar = this.f1738f;
            eVar.f1819b = aVar.A0;
            eVar.f1820c = aVar.B0;
            eVar.f1821d = aVar.C0;
            eVar.f1822e = aVar.D0;
            eVar.f1823f = aVar.E0;
            eVar.f1824g = aVar.F0;
            eVar.f1825h = aVar.G0;
            eVar.f1827j = aVar.H0;
            eVar.f1828k = aVar.I0;
            eVar.f1829l = aVar.J0;
            eVar.f1831n = aVar.f1835z0;
            eVar.f1830m = aVar.f1834y0;
        }

        /* access modifiers changed from: private */
        public void h(c cVar, int i10, f.a aVar) {
            g(i10, aVar);
            if (cVar instanceof a) {
                b bVar = this.f1737e;
                bVar.f1773j0 = 1;
                a aVar2 = (a) cVar;
                bVar.f1769h0 = aVar2.getType();
                this.f1737e.f1775k0 = aVar2.getReferencedIds();
                this.f1737e.f1771i0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1737e;
            bVar.f1629e = bVar2.f1772j;
            bVar.f1631f = bVar2.f1774k;
            bVar.f1633g = bVar2.f1776l;
            bVar.f1635h = bVar2.f1778m;
            bVar.f1637i = bVar2.f1780n;
            bVar.f1639j = bVar2.f1782o;
            bVar.f1641k = bVar2.f1784p;
            bVar.f1643l = bVar2.f1786q;
            bVar.f1645m = bVar2.f1788r;
            bVar.f1647n = bVar2.f1789s;
            bVar.f1649o = bVar2.f1790t;
            bVar.f1657s = bVar2.f1791u;
            bVar.f1659t = bVar2.f1792v;
            bVar.f1661u = bVar2.f1793w;
            bVar.f1663v = bVar2.f1794x;
            bVar.leftMargin = bVar2.H;
            bVar.rightMargin = bVar2.I;
            bVar.topMargin = bVar2.J;
            bVar.bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1667x = bVar2.P;
            bVar.f1669z = bVar2.R;
            bVar.G = bVar2.f1795y;
            bVar.H = bVar2.f1796z;
            bVar.f1651p = bVar2.B;
            bVar.f1653q = bVar2.C;
            bVar.f1655r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1622a0 = bVar2.f1781n0;
            bVar.f1624b0 = bVar2.f1783o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1755a0;
            bVar.T = bVar2.f1757b0;
            bVar.U = bVar2.f1759c0;
            bVar.R = bVar2.f1761d0;
            bVar.S = bVar2.f1763e0;
            bVar.V = bVar2.f1765f0;
            bVar.W = bVar2.f1767g0;
            bVar.Z = bVar2.G;
            bVar.f1625c = bVar2.f1768h;
            bVar.f1621a = bVar2.f1764f;
            bVar.f1623b = bVar2.f1766g;
            bVar.width = bVar2.f1760d;
            bVar.height = bVar2.f1762e;
            String str = bVar2.f1779m0;
            if (str != null) {
                bVar.f1626c0 = str;
            }
            bVar.f1628d0 = bVar2.f1787q0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.M);
                bVar.setMarginEnd(this.f1737e.L);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f1737e.a(this.f1737e);
            aVar.f1736d.a(this.f1736d);
            aVar.f1735c.a(this.f1735c);
            aVar.f1738f.a(this.f1738f);
            aVar.f1733a = this.f1733a;
            aVar.f1740h = this.f1740h;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet */
    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f1753r0;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1754a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1755a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1756b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f1757b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1758c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f1759c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1760d;

        /* renamed from: d0  reason: collision with root package name */
        public int f1761d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1762e;

        /* renamed from: e0  reason: collision with root package name */
        public int f1763e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f1764f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f1765f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f1766g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f1767g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f1768h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f1769h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1770i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f1771i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1772j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1773j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1774k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f1775k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1776l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f1777l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1778m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f1779m0;

        /* renamed from: n  reason: collision with root package name */
        public int f1780n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1781n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f1782o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1783o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1784p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f1785p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f1786q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f1787q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f1788r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1789s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1790t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1791u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1792v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1793w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f1794x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f1795y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f1796z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1753r0 = sparseIntArray;
            sparseIntArray.append(k.K5, 24);
            f1753r0.append(k.L5, 25);
            f1753r0.append(k.N5, 28);
            f1753r0.append(k.O5, 29);
            f1753r0.append(k.T5, 35);
            f1753r0.append(k.S5, 34);
            f1753r0.append(k.f2026u5, 4);
            f1753r0.append(k.f2017t5, 3);
            f1753r0.append(k.f1999r5, 1);
            f1753r0.append(k.Z5, 6);
            f1753r0.append(k.f1847a6, 7);
            f1753r0.append(k.B5, 17);
            f1753r0.append(k.C5, 18);
            f1753r0.append(k.D5, 19);
            f1753r0.append(k.f1963n5, 90);
            f1753r0.append(k.Z4, 26);
            f1753r0.append(k.P5, 31);
            f1753r0.append(k.Q5, 32);
            f1753r0.append(k.A5, 10);
            f1753r0.append(k.f2071z5, 9);
            f1753r0.append(k.f1874d6, 13);
            f1753r0.append(k.f1901g6, 16);
            f1753r0.append(k.f1883e6, 14);
            f1753r0.append(k.f1856b6, 11);
            f1753r0.append(k.f1892f6, 15);
            f1753r0.append(k.f1865c6, 12);
            f1753r0.append(k.W5, 38);
            f1753r0.append(k.I5, 37);
            f1753r0.append(k.H5, 39);
            f1753r0.append(k.V5, 40);
            f1753r0.append(k.G5, 20);
            f1753r0.append(k.U5, 36);
            f1753r0.append(k.f2062y5, 5);
            f1753r0.append(k.J5, 91);
            f1753r0.append(k.R5, 91);
            f1753r0.append(k.M5, 91);
            f1753r0.append(k.f2008s5, 91);
            f1753r0.append(k.f1990q5, 91);
            f1753r0.append(k.f1864c5, 23);
            f1753r0.append(k.f1882e5, 27);
            f1753r0.append(k.f1900g5, 30);
            f1753r0.append(k.f1909h5, 8);
            f1753r0.append(k.f1873d5, 33);
            f1753r0.append(k.f1891f5, 2);
            f1753r0.append(k.f1846a5, 22);
            f1753r0.append(k.f1855b5, 21);
            f1753r0.append(k.X5, 41);
            f1753r0.append(k.E5, 42);
            f1753r0.append(k.f1981p5, 41);
            f1753r0.append(k.f1972o5, 42);
            f1753r0.append(k.f1910h6, 76);
            f1753r0.append(k.f2035v5, 61);
            f1753r0.append(k.f2053x5, 62);
            f1753r0.append(k.f2044w5, 63);
            f1753r0.append(k.Y5, 69);
            f1753r0.append(k.F5, 70);
            f1753r0.append(k.f1945l5, 71);
            f1753r0.append(k.f1927j5, 72);
            f1753r0.append(k.f1936k5, 73);
            f1753r0.append(k.f1954m5, 74);
            f1753r0.append(k.f1918i5, 75);
        }

        public void a(b bVar) {
            this.f1754a = bVar.f1754a;
            this.f1760d = bVar.f1760d;
            this.f1756b = bVar.f1756b;
            this.f1762e = bVar.f1762e;
            this.f1764f = bVar.f1764f;
            this.f1766g = bVar.f1766g;
            this.f1768h = bVar.f1768h;
            this.f1770i = bVar.f1770i;
            this.f1772j = bVar.f1772j;
            this.f1774k = bVar.f1774k;
            this.f1776l = bVar.f1776l;
            this.f1778m = bVar.f1778m;
            this.f1780n = bVar.f1780n;
            this.f1782o = bVar.f1782o;
            this.f1784p = bVar.f1784p;
            this.f1786q = bVar.f1786q;
            this.f1788r = bVar.f1788r;
            this.f1789s = bVar.f1789s;
            this.f1790t = bVar.f1790t;
            this.f1791u = bVar.f1791u;
            this.f1792v = bVar.f1792v;
            this.f1793w = bVar.f1793w;
            this.f1794x = bVar.f1794x;
            this.f1795y = bVar.f1795y;
            this.f1796z = bVar.f1796z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1755a0 = bVar.f1755a0;
            this.f1757b0 = bVar.f1757b0;
            this.f1759c0 = bVar.f1759c0;
            this.f1761d0 = bVar.f1761d0;
            this.f1763e0 = bVar.f1763e0;
            this.f1765f0 = bVar.f1765f0;
            this.f1767g0 = bVar.f1767g0;
            this.f1769h0 = bVar.f1769h0;
            this.f1771i0 = bVar.f1771i0;
            this.f1773j0 = bVar.f1773j0;
            this.f1779m0 = bVar.f1779m0;
            int[] iArr = bVar.f1775k0;
            if (iArr == null || bVar.f1777l0 != null) {
                this.f1775k0 = null;
            } else {
                this.f1775k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1777l0 = bVar.f1777l0;
            this.f1781n0 = bVar.f1781n0;
            this.f1783o0 = bVar.f1783o0;
            this.f1785p0 = bVar.f1785p0;
            this.f1787q0 = bVar.f1787q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Y4);
            this.f1756b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1753r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1788r = e.l(obtainStyledAttributes, index, this.f1788r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1786q = e.l(obtainStyledAttributes, index, this.f1786q);
                        break;
                    case 4:
                        this.f1784p = e.l(obtainStyledAttributes, index, this.f1784p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        }
                    case 9:
                        this.f1794x = e.l(obtainStyledAttributes, index, this.f1794x);
                        break;
                    case 10:
                        this.f1793w = e.l(obtainStyledAttributes, index, this.f1793w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1764f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1764f);
                        break;
                    case 18:
                        this.f1766g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1766g);
                        break;
                    case 19:
                        this.f1768h = obtainStyledAttributes.getFloat(index, this.f1768h);
                        break;
                    case 20:
                        this.f1795y = obtainStyledAttributes.getFloat(index, this.f1795y);
                        break;
                    case 21:
                        this.f1762e = obtainStyledAttributes.getLayoutDimension(index, this.f1762e);
                        break;
                    case 22:
                        this.f1760d = obtainStyledAttributes.getLayoutDimension(index, this.f1760d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1772j = e.l(obtainStyledAttributes, index, this.f1772j);
                        break;
                    case 25:
                        this.f1774k = e.l(obtainStyledAttributes, index, this.f1774k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1776l = e.l(obtainStyledAttributes, index, this.f1776l);
                        break;
                    case 29:
                        this.f1778m = e.l(obtainStyledAttributes, index, this.f1778m);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        }
                    case 31:
                        this.f1791u = e.l(obtainStyledAttributes, index, this.f1791u);
                        break;
                    case 32:
                        this.f1792v = e.l(obtainStyledAttributes, index, this.f1792v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1782o = e.l(obtainStyledAttributes, index, this.f1782o);
                        break;
                    case 35:
                        this.f1780n = e.l(obtainStyledAttributes, index, this.f1780n);
                        break;
                    case 36:
                        this.f1796z = obtainStyledAttributes.getFloat(index, this.f1796z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = e.l(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1765f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1767g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f1769h0 = obtainStyledAttributes.getInt(index, this.f1769h0);
                                        break;
                                    case 73:
                                        this.f1771i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1771i0);
                                        break;
                                    case 74:
                                        this.f1777l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1785p0 = obtainStyledAttributes.getBoolean(index, this.f1785p0);
                                        break;
                                    case 76:
                                        this.f1787q0 = obtainStyledAttributes.getInt(index, this.f1787q0);
                                        break;
                                    case 77:
                                        this.f1789s = e.l(obtainStyledAttributes, index, this.f1789s);
                                        break;
                                    case 78:
                                        this.f1790t = e.l(obtainStyledAttributes, index, this.f1790t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f1755a0 = obtainStyledAttributes.getInt(index, this.f1755a0);
                                        break;
                                    case 83:
                                        this.f1759c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1759c0);
                                        break;
                                    case 84:
                                        this.f1757b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1757b0);
                                        break;
                                    case 85:
                                        this.f1763e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1763e0);
                                        break;
                                    case 86:
                                        this.f1761d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1761d0);
                                        break;
                                    case 87:
                                        this.f1781n0 = obtainStyledAttributes.getBoolean(index, this.f1781n0);
                                        break;
                                    case 88:
                                        this.f1783o0 = obtainStyledAttributes.getBoolean(index, this.f1783o0);
                                        break;
                                    case 89:
                                        this.f1779m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1770i = obtainStyledAttributes.getBoolean(index, this.f1770i);
                                        break;
                                    case 91:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(f1753r0.get(index));
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f1753r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f1797o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1798a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1799b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f1800c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f1801d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1802e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1803f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f1804g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1805h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1806i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f1807j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f1808k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f1809l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1810m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f1811n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1797o = sparseIntArray;
            sparseIntArray.append(k.f2018t6, 1);
            f1797o.append(k.f2036v6, 2);
            f1797o.append(k.f2072z6, 3);
            f1797o.append(k.f2009s6, 4);
            f1797o.append(k.f2000r6, 5);
            f1797o.append(k.f1991q6, 6);
            f1797o.append(k.f2027u6, 7);
            f1797o.append(k.f2063y6, 8);
            f1797o.append(k.f2054x6, 9);
            f1797o.append(k.f2045w6, 10);
        }

        public void a(c cVar) {
            this.f1798a = cVar.f1798a;
            this.f1799b = cVar.f1799b;
            this.f1801d = cVar.f1801d;
            this.f1802e = cVar.f1802e;
            this.f1803f = cVar.f1803f;
            this.f1806i = cVar.f1806i;
            this.f1804g = cVar.f1804g;
            this.f1805h = cVar.f1805h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1982p6);
            this.f1798a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1797o.get(index)) {
                    case 1:
                        this.f1806i = obtainStyledAttributes.getFloat(index, this.f1806i);
                        break;
                    case 2:
                        this.f1802e = obtainStyledAttributes.getInt(index, this.f1802e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f1801d = t.b.f11490c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f1801d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f1803f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1799b = e.l(obtainStyledAttributes, index, this.f1799b);
                        break;
                    case 6:
                        this.f1800c = obtainStyledAttributes.getInteger(index, this.f1800c);
                        break;
                    case 7:
                        this.f1804g = obtainStyledAttributes.getFloat(index, this.f1804g);
                        break;
                    case 8:
                        this.f1808k = obtainStyledAttributes.getInteger(index, this.f1808k);
                        break;
                    case 9:
                        this.f1807j = obtainStyledAttributes.getFloat(index, this.f1807j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f1810m = obtainStyledAttributes.getInteger(index, this.f1811n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1809l = string;
                                if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                    this.f1810m = -1;
                                    break;
                                } else {
                                    this.f1811n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f1810m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1811n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f1810m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1812a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1813b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1814c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1815d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1816e = Float.NaN;

        public void a(d dVar) {
            this.f1812a = dVar.f1812a;
            this.f1813b = dVar.f1813b;
            this.f1815d = dVar.f1815d;
            this.f1816e = dVar.f1816e;
            this.f1814c = dVar.f1814c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.M6);
            this.f1812a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.O6) {
                    this.f1815d = obtainStyledAttributes.getFloat(index, this.f1815d);
                } else if (index == k.N6) {
                    this.f1813b = obtainStyledAttributes.getInt(index, this.f1813b);
                    this.f1813b = e.f1725f[this.f1813b];
                } else if (index == k.Q6) {
                    this.f1814c = obtainStyledAttributes.getInt(index, this.f1814c);
                } else if (index == k.P6) {
                    this.f1816e = obtainStyledAttributes.getFloat(index, this.f1816e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0022e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f1817o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1818a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1819b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1820c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1821d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1822e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1823f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1824g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1825h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1826i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1827j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1828k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1829l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1830m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f1831n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1817o = sparseIntArray;
            sparseIntArray.append(k.f1947l7, 1);
            f1817o.append(k.f1956m7, 2);
            f1817o.append(k.f1965n7, 3);
            f1817o.append(k.f1929j7, 4);
            f1817o.append(k.f1938k7, 5);
            f1817o.append(k.f1893f7, 6);
            f1817o.append(k.f1902g7, 7);
            f1817o.append(k.f1911h7, 8);
            f1817o.append(k.f1920i7, 9);
            f1817o.append(k.f1974o7, 10);
            f1817o.append(k.f1983p7, 11);
            f1817o.append(k.f1992q7, 12);
        }

        public void a(C0022e eVar) {
            this.f1818a = eVar.f1818a;
            this.f1819b = eVar.f1819b;
            this.f1820c = eVar.f1820c;
            this.f1821d = eVar.f1821d;
            this.f1822e = eVar.f1822e;
            this.f1823f = eVar.f1823f;
            this.f1824g = eVar.f1824g;
            this.f1825h = eVar.f1825h;
            this.f1826i = eVar.f1826i;
            this.f1827j = eVar.f1827j;
            this.f1828k = eVar.f1828k;
            this.f1829l = eVar.f1829l;
            this.f1830m = eVar.f1830m;
            this.f1831n = eVar.f1831n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1884e7);
            this.f1818a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1817o.get(index)) {
                    case 1:
                        this.f1819b = obtainStyledAttributes.getFloat(index, this.f1819b);
                        break;
                    case 2:
                        this.f1820c = obtainStyledAttributes.getFloat(index, this.f1820c);
                        break;
                    case 3:
                        this.f1821d = obtainStyledAttributes.getFloat(index, this.f1821d);
                        break;
                    case 4:
                        this.f1822e = obtainStyledAttributes.getFloat(index, this.f1822e);
                        break;
                    case 5:
                        this.f1823f = obtainStyledAttributes.getFloat(index, this.f1823f);
                        break;
                    case 6:
                        this.f1824g = obtainStyledAttributes.getDimension(index, this.f1824g);
                        break;
                    case 7:
                        this.f1825h = obtainStyledAttributes.getDimension(index, this.f1825h);
                        break;
                    case 8:
                        this.f1827j = obtainStyledAttributes.getDimension(index, this.f1827j);
                        break;
                    case 9:
                        this.f1828k = obtainStyledAttributes.getDimension(index, this.f1828k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1829l = obtainStyledAttributes.getDimension(index, this.f1829l);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1830m = true;
                            this.f1831n = obtainStyledAttributes.getDimension(index, this.f1831n);
                            break;
                        }
                    case 12:
                        this.f1826i = e.l(obtainStyledAttributes, index, this.f1826i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1726g.append(k.A0, 25);
        f1726g.append(k.B0, 26);
        f1726g.append(k.D0, 29);
        f1726g.append(k.E0, 30);
        f1726g.append(k.K0, 36);
        f1726g.append(k.J0, 35);
        f1726g.append(k.f1904h0, 4);
        f1726g.append(k.f1895g0, 3);
        f1726g.append(k.f1859c0, 1);
        f1726g.append(k.f1877e0, 91);
        f1726g.append(k.f1868d0, 92);
        f1726g.append(k.T0, 6);
        f1726g.append(k.U0, 7);
        f1726g.append(k.f1967o0, 17);
        f1726g.append(k.f1976p0, 18);
        f1726g.append(k.f1985q0, 19);
        f1726g.append(k.Y, 99);
        f1726g.append(k.f2020u, 27);
        f1726g.append(k.F0, 32);
        f1726g.append(k.G0, 33);
        f1726g.append(k.f1958n0, 10);
        f1726g.append(k.f1949m0, 9);
        f1726g.append(k.X0, 13);
        f1726g.append(k.f1842a1, 16);
        f1726g.append(k.Y0, 14);
        f1726g.append(k.V0, 11);
        f1726g.append(k.Z0, 15);
        f1726g.append(k.W0, 12);
        f1726g.append(k.N0, 40);
        f1726g.append(k.f2057y0, 39);
        f1726g.append(k.f2048x0, 41);
        f1726g.append(k.M0, 42);
        f1726g.append(k.f2039w0, 20);
        f1726g.append(k.L0, 37);
        f1726g.append(k.f1940l0, 5);
        f1726g.append(k.f2066z0, 87);
        f1726g.append(k.I0, 87);
        f1726g.append(k.C0, 87);
        f1726g.append(k.f1886f0, 87);
        f1726g.append(k.f1850b0, 87);
        f1726g.append(k.f2065z, 24);
        f1726g.append(k.B, 28);
        f1726g.append(k.N, 31);
        f1726g.append(k.O, 8);
        f1726g.append(k.A, 34);
        f1726g.append(k.C, 2);
        f1726g.append(k.f2047x, 23);
        f1726g.append(k.f2056y, 21);
        f1726g.append(k.O0, 95);
        f1726g.append(k.f1994r0, 96);
        f1726g.append(k.f2038w, 22);
        f1726g.append(k.D, 43);
        f1726g.append(k.Q, 44);
        f1726g.append(k.L, 45);
        f1726g.append(k.M, 46);
        f1726g.append(k.K, 60);
        f1726g.append(k.I, 47);
        f1726g.append(k.J, 48);
        f1726g.append(k.E, 49);
        f1726g.append(k.F, 50);
        f1726g.append(k.G, 51);
        f1726g.append(k.H, 52);
        f1726g.append(k.P, 53);
        f1726g.append(k.P0, 54);
        f1726g.append(k.f2003s0, 55);
        f1726g.append(k.Q0, 56);
        f1726g.append(k.f2012t0, 57);
        f1726g.append(k.R0, 58);
        f1726g.append(k.f2021u0, 59);
        f1726g.append(k.f1913i0, 61);
        f1726g.append(k.f1931k0, 62);
        f1726g.append(k.f1922j0, 63);
        f1726g.append(k.R, 64);
        f1726g.append(k.f1932k1, 65);
        f1726g.append(k.X, 66);
        f1726g.append(k.f1941l1, 67);
        f1726g.append(k.f1869d1, 79);
        f1726g.append(k.f2029v, 38);
        f1726g.append(k.f1860c1, 68);
        f1726g.append(k.S0, 69);
        f1726g.append(k.f2030v0, 70);
        f1726g.append(k.f1851b1, 97);
        f1726g.append(k.V, 71);
        f1726g.append(k.T, 72);
        f1726g.append(k.U, 73);
        f1726g.append(k.W, 74);
        f1726g.append(k.S, 75);
        f1726g.append(k.f1878e1, 76);
        f1726g.append(k.H0, 77);
        f1726g.append(k.f1950m1, 78);
        f1726g.append(k.f1841a0, 80);
        f1726g.append(k.Z, 81);
        f1726g.append(k.f1887f1, 82);
        f1726g.append(k.f1923j1, 83);
        f1726g.append(k.f1914i1, 84);
        f1726g.append(k.f1905h1, 85);
        f1726g.append(k.f1896g1, 86);
        SparseIntArray sparseIntArray = f1727h;
        int i10 = k.R3;
        sparseIntArray.append(i10, 6);
        f1727h.append(i10, 7);
        f1727h.append(k.M2, 27);
        f1727h.append(k.U3, 13);
        f1727h.append(k.X3, 16);
        f1727h.append(k.V3, 14);
        f1727h.append(k.S3, 11);
        f1727h.append(k.W3, 15);
        f1727h.append(k.T3, 12);
        f1727h.append(k.L3, 40);
        f1727h.append(k.E3, 39);
        f1727h.append(k.D3, 41);
        f1727h.append(k.K3, 42);
        f1727h.append(k.C3, 20);
        f1727h.append(k.J3, 37);
        f1727h.append(k.f2042w3, 5);
        f1727h.append(k.F3, 87);
        f1727h.append(k.I3, 87);
        f1727h.append(k.G3, 87);
        f1727h.append(k.f2015t3, 87);
        f1727h.append(k.f2006s3, 87);
        f1727h.append(k.R2, 24);
        f1727h.append(k.T2, 28);
        f1727h.append(k.f1889f3, 31);
        f1727h.append(k.f1898g3, 8);
        f1727h.append(k.S2, 34);
        f1727h.append(k.U2, 2);
        f1727h.append(k.P2, 23);
        f1727h.append(k.Q2, 21);
        f1727h.append(k.M3, 95);
        f1727h.append(k.f2051x3, 96);
        f1727h.append(k.O2, 22);
        f1727h.append(k.V2, 43);
        f1727h.append(k.f1916i3, 44);
        f1727h.append(k.f1871d3, 45);
        f1727h.append(k.f1880e3, 46);
        f1727h.append(k.f1862c3, 60);
        f1727h.append(k.f1844a3, 47);
        f1727h.append(k.f1853b3, 48);
        f1727h.append(k.W2, 49);
        f1727h.append(k.X2, 50);
        f1727h.append(k.Y2, 51);
        f1727h.append(k.Z2, 52);
        f1727h.append(k.f1907h3, 53);
        f1727h.append(k.N3, 54);
        f1727h.append(k.f2060y3, 55);
        f1727h.append(k.O3, 56);
        f1727h.append(k.f2069z3, 57);
        f1727h.append(k.P3, 58);
        f1727h.append(k.A3, 59);
        f1727h.append(k.f2033v3, 62);
        f1727h.append(k.f2024u3, 63);
        f1727h.append(k.f1925j3, 64);
        f1727h.append(k.f1917i4, 65);
        f1727h.append(k.f1979p3, 66);
        f1727h.append(k.f1926j4, 67);
        f1727h.append(k.f1845a4, 79);
        f1727h.append(k.N2, 38);
        f1727h.append(k.f1854b4, 98);
        f1727h.append(k.Z3, 68);
        f1727h.append(k.Q3, 69);
        f1727h.append(k.B3, 70);
        f1727h.append(k.f1961n3, 71);
        f1727h.append(k.f1943l3, 72);
        f1727h.append(k.f1952m3, 73);
        f1727h.append(k.f1970o3, 74);
        f1727h.append(k.f1934k3, 75);
        f1727h.append(k.f1863c4, 76);
        f1727h.append(k.H3, 77);
        f1727h.append(k.f1935k4, 78);
        f1727h.append(k.f1997r3, 80);
        f1727h.append(k.f1988q3, 81);
        f1727h.append(k.f1872d4, 82);
        f1727h.append(k.f1908h4, 83);
        f1727h.append(k.f1899g4, 84);
        f1727h.append(k.f1890f4, 85);
        f1727h.append(k.f1881e4, 86);
        f1727h.append(k.Y3, 97);
    }

    private int[] h(View view, String str) {
        int i10;
        Object f10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = j.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f10 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f10 instanceof Integer)) {
                i10 = ((Integer) f10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? k.L2 : k.f2011t);
        p(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* access modifiers changed from: private */
    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    static void m(Object obj, TypedArray typedArray, int i10, int i11) {
        if (obj != null) {
            int i12 = typedArray.peekValue(i10).type;
            if (i12 != 3) {
                int i13 = -2;
                boolean z10 = false;
                if (i12 != 5) {
                    int i14 = typedArray.getInt(i10, 0);
                    if (i14 != -4) {
                        i13 = (i14 == -3 || !(i14 == -2 || i14 == -1)) ? 0 : i14;
                    } else {
                        z10 = true;
                    }
                } else {
                    i13 = typedArray.getDimensionPixelSize(i10, 0);
                }
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        bVar.width = i13;
                        bVar.f1622a0 = z10;
                        return;
                    }
                    bVar.height = i13;
                    bVar.f1624b0 = z10;
                } else if (obj instanceof b) {
                    b bVar2 = (b) obj;
                    if (i11 == 0) {
                        bVar2.f1760d = i13;
                        bVar2.f1781n0 = z10;
                        return;
                    }
                    bVar2.f1762e = i13;
                    bVar2.f1783o0 = z10;
                } else if (obj instanceof a.C0021a) {
                    a.C0021a aVar = (a.C0021a) obj;
                    if (i11 == 0) {
                        aVar.b(23, i13);
                        aVar.d(80, z10);
                        return;
                    }
                    aVar.b(21, i13);
                    aVar.d(81, z10);
                }
            } else {
                n(obj, typedArray.getString(i10), i11);
            }
        }
    }

    static void n(Object obj, String str, int i10) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            o(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).A = trim2;
                        } else if (obj instanceof a.C0021a) {
                            ((a.C0021a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i10 == 0) {
                                    bVar2.width = 0;
                                    bVar2.L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i10 == 0) {
                                    bVar3.f1760d = 0;
                                    bVar3.W = parseFloat;
                                    return;
                                }
                                bVar3.f1762e = 0;
                                bVar3.V = parseFloat;
                            } else if (obj instanceof a.C0021a) {
                                a.C0021a aVar = (a.C0021a) obj;
                                if (i10 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar4.width = 0;
                                bVar4.V = max;
                                bVar4.P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i10 == 0) {
                                bVar5.f1760d = 0;
                                bVar5.f1765f0 = max;
                                bVar5.Z = 2;
                                return;
                            }
                            bVar5.f1762e = 0;
                            bVar5.f1767g0 = max;
                            bVar5.f1755a0 = 2;
                        } else if (obj instanceof a.C0021a) {
                            a.C0021a aVar2 = (a.C0021a) obj;
                            if (i10 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void o(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i11);
                if (substring2.length() > 0) {
                    f10 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i11, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.I = str;
        bVar.J = f10;
        bVar.K = i10;
    }

    private void p(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == k.f2029v || k.N == index || k.O == index)) {
                aVar.f1736d.f1798a = true;
                aVar.f1737e.f1756b = true;
                aVar.f1735c.f1812a = true;
                aVar.f1738f.f1818a = true;
            }
            switch (f1726g.get(index)) {
                case 1:
                    b bVar = aVar.f1737e;
                    bVar.f1788r = l(typedArray, index, bVar.f1788r);
                    break;
                case 2:
                    b bVar2 = aVar.f1737e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1737e;
                    bVar3.f1786q = l(typedArray, index, bVar3.f1786q);
                    break;
                case 4:
                    b bVar4 = aVar.f1737e;
                    bVar4.f1784p = l(typedArray, index, bVar4.f1784p);
                    break;
                case 5:
                    aVar.f1737e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1737e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1737e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        b bVar7 = aVar.f1737e;
                        bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f1737e;
                    bVar8.f1794x = l(typedArray, index, bVar8.f1794x);
                    break;
                case 10:
                    b bVar9 = aVar.f1737e;
                    bVar9.f1793w = l(typedArray, index, bVar9.f1793w);
                    break;
                case 11:
                    b bVar10 = aVar.f1737e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1737e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1737e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1737e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1737e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1737e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1737e;
                    bVar16.f1764f = typedArray.getDimensionPixelOffset(index, bVar16.f1764f);
                    break;
                case 18:
                    b bVar17 = aVar.f1737e;
                    bVar17.f1766g = typedArray.getDimensionPixelOffset(index, bVar17.f1766g);
                    break;
                case 19:
                    b bVar18 = aVar.f1737e;
                    bVar18.f1768h = typedArray.getFloat(index, bVar18.f1768h);
                    break;
                case 20:
                    b bVar19 = aVar.f1737e;
                    bVar19.f1795y = typedArray.getFloat(index, bVar19.f1795y);
                    break;
                case 21:
                    b bVar20 = aVar.f1737e;
                    bVar20.f1762e = typedArray.getLayoutDimension(index, bVar20.f1762e);
                    break;
                case 22:
                    d dVar = aVar.f1735c;
                    dVar.f1813b = typedArray.getInt(index, dVar.f1813b);
                    d dVar2 = aVar.f1735c;
                    dVar2.f1813b = f1725f[dVar2.f1813b];
                    break;
                case 23:
                    b bVar21 = aVar.f1737e;
                    bVar21.f1760d = typedArray.getLayoutDimension(index, bVar21.f1760d);
                    break;
                case 24:
                    b bVar22 = aVar.f1737e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1737e;
                    bVar23.f1772j = l(typedArray, index, bVar23.f1772j);
                    break;
                case 26:
                    b bVar24 = aVar.f1737e;
                    bVar24.f1774k = l(typedArray, index, bVar24.f1774k);
                    break;
                case 27:
                    b bVar25 = aVar.f1737e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1737e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1737e;
                    bVar27.f1776l = l(typedArray, index, bVar27.f1776l);
                    break;
                case 30:
                    b bVar28 = aVar.f1737e;
                    bVar28.f1778m = l(typedArray, index, bVar28.f1778m);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        b bVar29 = aVar.f1737e;
                        bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f1737e;
                    bVar30.f1791u = l(typedArray, index, bVar30.f1791u);
                    break;
                case 33:
                    b bVar31 = aVar.f1737e;
                    bVar31.f1792v = l(typedArray, index, bVar31.f1792v);
                    break;
                case 34:
                    b bVar32 = aVar.f1737e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f1737e;
                    bVar33.f1782o = l(typedArray, index, bVar33.f1782o);
                    break;
                case 36:
                    b bVar34 = aVar.f1737e;
                    bVar34.f1780n = l(typedArray, index, bVar34.f1780n);
                    break;
                case 37:
                    b bVar35 = aVar.f1737e;
                    bVar35.f1796z = typedArray.getFloat(index, bVar35.f1796z);
                    break;
                case 38:
                    aVar.f1733a = typedArray.getResourceId(index, aVar.f1733a);
                    break;
                case 39:
                    b bVar36 = aVar.f1737e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f1737e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f1737e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f1737e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f1735c;
                    dVar3.f1815d = typedArray.getFloat(index, dVar3.f1815d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0022e eVar = aVar.f1738f;
                        eVar.f1830m = true;
                        eVar.f1831n = typedArray.getDimension(index, eVar.f1831n);
                        break;
                    }
                case 45:
                    C0022e eVar2 = aVar.f1738f;
                    eVar2.f1820c = typedArray.getFloat(index, eVar2.f1820c);
                    break;
                case 46:
                    C0022e eVar3 = aVar.f1738f;
                    eVar3.f1821d = typedArray.getFloat(index, eVar3.f1821d);
                    break;
                case 47:
                    C0022e eVar4 = aVar.f1738f;
                    eVar4.f1822e = typedArray.getFloat(index, eVar4.f1822e);
                    break;
                case 48:
                    C0022e eVar5 = aVar.f1738f;
                    eVar5.f1823f = typedArray.getFloat(index, eVar5.f1823f);
                    break;
                case 49:
                    C0022e eVar6 = aVar.f1738f;
                    eVar6.f1824g = typedArray.getDimension(index, eVar6.f1824g);
                    break;
                case 50:
                    C0022e eVar7 = aVar.f1738f;
                    eVar7.f1825h = typedArray.getDimension(index, eVar7.f1825h);
                    break;
                case 51:
                    C0022e eVar8 = aVar.f1738f;
                    eVar8.f1827j = typedArray.getDimension(index, eVar8.f1827j);
                    break;
                case 52:
                    C0022e eVar9 = aVar.f1738f;
                    eVar9.f1828k = typedArray.getDimension(index, eVar9.f1828k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0022e eVar10 = aVar.f1738f;
                        eVar10.f1829l = typedArray.getDimension(index, eVar10.f1829l);
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f1737e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1737e;
                    bVar41.f1755a0 = typedArray.getInt(index, bVar41.f1755a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1737e;
                    bVar42.f1757b0 = typedArray.getDimensionPixelSize(index, bVar42.f1757b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1737e;
                    bVar43.f1759c0 = typedArray.getDimensionPixelSize(index, bVar43.f1759c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1737e;
                    bVar44.f1761d0 = typedArray.getDimensionPixelSize(index, bVar44.f1761d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1737e;
                    bVar45.f1763e0 = typedArray.getDimensionPixelSize(index, bVar45.f1763e0);
                    break;
                case 60:
                    C0022e eVar11 = aVar.f1738f;
                    eVar11.f1819b = typedArray.getFloat(index, eVar11.f1819b);
                    break;
                case 61:
                    b bVar46 = aVar.f1737e;
                    bVar46.B = l(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1737e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1737e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f1736d;
                    cVar.f1799b = l(typedArray, index, cVar.f1799b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f1736d.f1801d = t.b.f11490c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f1736d.f1801d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f1736d.f1803f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1736d;
                    cVar2.f1806i = typedArray.getFloat(index, cVar2.f1806i);
                    break;
                case 68:
                    d dVar4 = aVar.f1735c;
                    dVar4.f1816e = typedArray.getFloat(index, dVar4.f1816e);
                    break;
                case 69:
                    aVar.f1737e.f1765f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1737e.f1767g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f1737e;
                    bVar49.f1769h0 = typedArray.getInt(index, bVar49.f1769h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1737e;
                    bVar50.f1771i0 = typedArray.getDimensionPixelSize(index, bVar50.f1771i0);
                    break;
                case 74:
                    aVar.f1737e.f1777l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1737e;
                    bVar51.f1785p0 = typedArray.getBoolean(index, bVar51.f1785p0);
                    break;
                case 76:
                    c cVar3 = aVar.f1736d;
                    cVar3.f1802e = typedArray.getInt(index, cVar3.f1802e);
                    break;
                case 77:
                    aVar.f1737e.f1779m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1735c;
                    dVar5.f1814c = typedArray.getInt(index, dVar5.f1814c);
                    break;
                case 79:
                    c cVar4 = aVar.f1736d;
                    cVar4.f1804g = typedArray.getFloat(index, cVar4.f1804g);
                    break;
                case 80:
                    b bVar52 = aVar.f1737e;
                    bVar52.f1781n0 = typedArray.getBoolean(index, bVar52.f1781n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1737e;
                    bVar53.f1783o0 = typedArray.getBoolean(index, bVar53.f1783o0);
                    break;
                case 82:
                    c cVar5 = aVar.f1736d;
                    cVar5.f1800c = typedArray.getInteger(index, cVar5.f1800c);
                    break;
                case 83:
                    C0022e eVar12 = aVar.f1738f;
                    eVar12.f1826i = l(typedArray, index, eVar12.f1826i);
                    break;
                case 84:
                    c cVar6 = aVar.f1736d;
                    cVar6.f1808k = typedArray.getInteger(index, cVar6.f1808k);
                    break;
                case 85:
                    c cVar7 = aVar.f1736d;
                    cVar7.f1807j = typedArray.getFloat(index, cVar7.f1807j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar8 = aVar.f1736d;
                            cVar8.f1810m = typedArray.getInteger(index, cVar8.f1811n);
                            break;
                        } else {
                            aVar.f1736d.f1809l = typedArray.getString(index);
                            if (aVar.f1736d.f1809l.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                aVar.f1736d.f1810m = -1;
                                break;
                            } else {
                                aVar.f1736d.f1811n = typedArray.getResourceId(index, -1);
                                aVar.f1736d.f1810m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f1736d.f1811n = typedArray.getResourceId(index, -1);
                        c cVar9 = aVar.f1736d;
                        if (cVar9.f1811n == -1) {
                            break;
                        } else {
                            cVar9.f1810m = -2;
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f1726g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1737e;
                    bVar54.f1789s = l(typedArray, index, bVar54.f1789s);
                    break;
                case 92:
                    b bVar55 = aVar.f1737e;
                    bVar55.f1790t = l(typedArray, index, bVar55.f1790t);
                    break;
                case 93:
                    b bVar56 = aVar.f1737e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1737e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    m(aVar.f1737e, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar.f1737e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1737e;
                    bVar58.f1787q0 = typedArray.getInt(index, bVar58.f1787q0);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f1726g.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f1737e;
        if (bVar59.f1777l0 != null) {
            bVar59.f1775k0 = null;
        }
    }

    private static void q(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0021a aVar2 = new a.C0021a();
        aVar.f1740h = aVar2;
        aVar.f1736d.f1798a = false;
        aVar.f1737e.f1756b = false;
        aVar.f1735c.f1812a = false;
        aVar.f1738f.f1818a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1727h.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f1737e.K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1737e.E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1737e.F));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f1737e.L));
                        break;
                    }
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f1737e.R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f1737e.S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f1737e.O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f1737e.Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f1737e.T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f1737e.P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1737e.f1764f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1737e.f1766g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f1737e.f1768h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f1737e.f1795y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f1737e.f1762e));
                    break;
                case 22:
                    aVar2.b(22, f1725f[typedArray.getInt(index, aVar.f1735c.f1813b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f1737e.f1760d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f1737e.H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f1737e.G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f1737e.I));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f1737e.M));
                        break;
                    }
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f1737e.J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f1737e.f1796z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1733a);
                    aVar.f1733a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f1737e.W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f1737e.V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f1737e.X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f1737e.Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f1735c.f1815d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar2.d(44, true);
                        aVar2.a(44, typedArray.getDimension(index, aVar.f1738f.f1831n));
                        break;
                    }
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f1738f.f1820c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f1738f.f1821d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f1738f.f1822e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f1738f.f1823f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f1738f.f1824g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f1738f.f1825h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f1738f.f1827j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f1738f.f1828k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar2.a(53, typedArray.getDimension(index, aVar.f1738f.f1829l));
                        break;
                    }
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f1737e.Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f1737e.f1755a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f1737e.f1757b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f1737e.f1759c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f1737e.f1761d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f1737e.f1763e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f1738f.f1819b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f1737e.C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f1737e.D));
                    break;
                case 64:
                    aVar2.b(64, l(typedArray, index, aVar.f1736d.f1799b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, t.b.f11490c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f1736d.f1806i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f1735c.f1816e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f1737e.f1769h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f1737e.f1771i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f1737e.f1785p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f1736d.f1802e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f1735c.f1814c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f1736d.f1804g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f1737e.f1781n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f1737e.f1783o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f1736d.f1800c));
                    break;
                case 83:
                    aVar2.b(83, l(typedArray, index, aVar.f1738f.f1826i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f1736d.f1808k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f1736d.f1807j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar = aVar.f1736d;
                            cVar.f1810m = typedArray.getInteger(index, cVar.f1811n);
                            aVar2.b(88, aVar.f1736d.f1810m);
                            break;
                        } else {
                            aVar.f1736d.f1809l = typedArray.getString(index);
                            aVar2.c(90, aVar.f1736d.f1809l);
                            if (aVar.f1736d.f1809l.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                aVar.f1736d.f1810m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f1736d.f1811n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f1736d.f1811n);
                                aVar.f1736d.f1810m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f1736d.f1811n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f1736d.f1811n);
                        c cVar2 = aVar.f1736d;
                        if (cVar2.f1811n == -1) {
                            break;
                        } else {
                            cVar2.f1810m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f1726g.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f1737e.N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f1737e.U));
                    break;
                case 95:
                    m(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f1737e.f1787q0));
                    break;
                case 98:
                    if (!j.E0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f1733a = typedArray.getResourceId(index, aVar.f1733a);
                            break;
                        } else {
                            aVar.f1734b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1733a);
                        aVar.f1733a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f1734b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f1737e.f1770i));
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f1726g.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((e) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1732e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f1732e.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(androidx.constraintlayout.motion.widget.a.b(childAt));
            } else if (this.f1731d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1732e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f1732e.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof a) {
                            aVar.f1737e.f1773j0 = 1;
                            a aVar2 = (a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f1737e.f1769h0);
                            aVar2.setMargin(aVar.f1737e.f1771i0);
                            aVar2.setAllowsGoneWidget(aVar.f1737e.f1785p0);
                            b bVar = aVar.f1737e;
                            int[] iArr = bVar.f1775k0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1777l0;
                                if (str != null) {
                                    bVar.f1775k0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f1737e.f1775k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            b.e(childAt, aVar.f1739g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f1735c;
                        if (dVar.f1814c == 0) {
                            childAt.setVisibility(dVar.f1813b);
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 17) {
                            childAt.setAlpha(aVar.f1735c.f1815d);
                            childAt.setRotation(aVar.f1738f.f1819b);
                            childAt.setRotationX(aVar.f1738f.f1820c);
                            childAt.setRotationY(aVar.f1738f.f1821d);
                            childAt.setScaleX(aVar.f1738f.f1822e);
                            childAt.setScaleY(aVar.f1738f.f1823f);
                            C0022e eVar = aVar.f1738f;
                            if (eVar.f1826i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1738f.f1826i);
                                if (findViewById != null) {
                                    float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                    float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - ((float) childAt.getLeft()));
                                        childAt.setPivotY(top - ((float) childAt.getTop()));
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1824g)) {
                                    childAt.setPivotX(aVar.f1738f.f1824g);
                                }
                                if (!Float.isNaN(aVar.f1738f.f1825h)) {
                                    childAt.setPivotY(aVar.f1738f.f1825h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1738f.f1827j);
                            childAt.setTranslationY(aVar.f1738f.f1828k);
                            if (i11 >= 21) {
                                childAt.setTranslationZ(aVar.f1738f.f1829l);
                                C0022e eVar2 = aVar.f1738f;
                                if (eVar2.f1830m) {
                                    childAt.setElevation(eVar2.f1831n);
                                }
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1732e.get(num);
            if (aVar3 != null) {
                if (aVar3.f1737e.f1773j0 == 1) {
                    a aVar4 = new a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f1737e;
                    int[] iArr2 = bVar3.f1775k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1777l0;
                        if (str2 != null) {
                            bVar3.f1775k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f1737e.f1775k0);
                        }
                    }
                    aVar4.setType(aVar3.f1737e.f1769h0);
                    aVar4.setMargin(aVar3.f1737e.f1771i0);
                    ConstraintLayout.b d10 = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(d10);
                    constraintLayout.addView(aVar4, d10);
                }
                if (aVar3.f1737e.f1754a) {
                    h hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b d11 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(d11);
                    constraintLayout.addView(hVar, d11);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof c) {
                ((c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1732e.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1731d || id != -1) {
                if (!this.f1732e.containsKey(Integer.valueOf(id))) {
                    this.f1732e.put(Integer.valueOf(id), new a());
                }
                a aVar = this.f1732e.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f1739g = b.a(this.f1730c, childAt);
                    aVar.f(id, bVar);
                    aVar.f1735c.f1813b = childAt.getVisibility();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 17) {
                        aVar.f1735c.f1815d = childAt.getAlpha();
                        aVar.f1738f.f1819b = childAt.getRotation();
                        aVar.f1738f.f1820c = childAt.getRotationX();
                        aVar.f1738f.f1821d = childAt.getRotationY();
                        aVar.f1738f.f1822e = childAt.getScaleX();
                        aVar.f1738f.f1823f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && ((double) pivotY) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                            C0022e eVar = aVar.f1738f;
                            eVar.f1824g = pivotX;
                            eVar.f1825h = pivotY;
                        }
                        aVar.f1738f.f1827j = childAt.getTranslationX();
                        aVar.f1738f.f1828k = childAt.getTranslationY();
                        if (i11 >= 21) {
                            aVar.f1738f.f1829l = childAt.getTranslationZ();
                            C0022e eVar2 = aVar.f1738f;
                            if (eVar2.f1830m) {
                                eVar2.f1831n = childAt.getElevation();
                            }
                        }
                    }
                    if (childAt instanceof a) {
                        a aVar2 = (a) childAt;
                        aVar.f1737e.f1785p0 = aVar2.getAllowsGoneWidget();
                        aVar.f1737e.f1775k0 = aVar2.getReferencedIds();
                        aVar.f1737e.f1769h0 = aVar2.getType();
                        aVar.f1737e.f1771i0 = aVar2.getMargin();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f1732e.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = fVar.getChildAt(i10);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1731d || id != -1) {
                if (!this.f1732e.containsKey(Integer.valueOf(id))) {
                    this.f1732e.put(Integer.valueOf(id), new a());
                }
                a aVar2 = this.f1732e.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof c) {
                        aVar2.h((c) childAt, id, aVar);
                    }
                    aVar2.g(id, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i11 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i11.f1737e.f1754a = true;
                    }
                    this.f1732e.put(Integer.valueOf(i11.f1733a), i11);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r0 = r9.f1732e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f1733a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.b> r0 = r2.f1739g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.b.d(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.e$c r0 = r2.f1736d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.e$b r0 = r2.f1737e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.e$e r0 = r2.f1738f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.e$d r0 = r2.f1735c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f1737e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1773j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f1737e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1754a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1756b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
