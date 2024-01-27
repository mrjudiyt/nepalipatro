package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.u0;
import androidx.core.view.k;
import f.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f9754e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f9755f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f9756a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f9757b;

    /* renamed from: c  reason: collision with root package name */
    Context f9758c;

    /* renamed from: d  reason: collision with root package name */
    private Object f9759d;

    /* compiled from: SupportMenuInflater */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f9760c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f9761a;

        /* renamed from: b  reason: collision with root package name */
        private Method f9762b;

        public a(Object obj, String str) {
            this.f9761a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f9762b = cls.getMethod(str, f9760c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f9762b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f9762b.invoke(this.f9761a, new Object[]{menuItem})).booleanValue();
                }
                this.f9762b.invoke(this.f9761a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f9763a;

        /* renamed from: b  reason: collision with root package name */
        private int f9764b;

        /* renamed from: c  reason: collision with root package name */
        private int f9765c;

        /* renamed from: d  reason: collision with root package name */
        private int f9766d;

        /* renamed from: e  reason: collision with root package name */
        private int f9767e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9768f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9769g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f9770h;

        /* renamed from: i  reason: collision with root package name */
        private int f9771i;

        /* renamed from: j  reason: collision with root package name */
        private int f9772j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f9773k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f9774l;

        /* renamed from: m  reason: collision with root package name */
        private int f9775m;

        /* renamed from: n  reason: collision with root package name */
        private char f9776n;

        /* renamed from: o  reason: collision with root package name */
        private int f9777o;

        /* renamed from: p  reason: collision with root package name */
        private char f9778p;

        /* renamed from: q  reason: collision with root package name */
        private int f9779q;

        /* renamed from: r  reason: collision with root package name */
        private int f9780r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f9781s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f9782t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f9783u;

        /* renamed from: v  reason: collision with root package name */
        private int f9784v;

        /* renamed from: w  reason: collision with root package name */
        private int f9785w;

        /* renamed from: x  reason: collision with root package name */
        private String f9786x;

        /* renamed from: y  reason: collision with root package name */
        private String f9787y;

        /* renamed from: z  reason: collision with root package name */
        private String f9788z;

        public b(Menu menu) {
            this.f9763a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f9758c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f9781s).setVisible(this.f9782t).setEnabled(this.f9783u).setCheckable(this.f9780r >= 1).setTitleCondensed(this.f9774l).setIcon(this.f9775m);
            int i10 = this.f9784v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f9788z != null) {
                if (!g.this.f9758c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f9788z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f9780r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f9786x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f9754e, g.this.f9756a));
                z10 = true;
            }
            int i11 = this.f9785w;
            if (i11 > 0 && !z10) {
                menuItem.setActionView(i11);
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                k.a(menuItem, bVar);
            }
            k.c(menuItem, this.B);
            k.g(menuItem, this.C);
            k.b(menuItem, this.f9776n, this.f9777o);
            k.f(menuItem, this.f9778p, this.f9779q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                k.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                k.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f9770h = true;
            i(this.f9763a.add(this.f9764b, this.f9771i, this.f9772j, this.f9773k));
        }

        public SubMenu b() {
            this.f9770h = true;
            SubMenu addSubMenu = this.f9763a.addSubMenu(this.f9764b, this.f9771i, this.f9772j, this.f9773k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f9770h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f9758c.obtainStyledAttributes(attributeSet, j.f8406r1);
            this.f9764b = obtainStyledAttributes.getResourceId(j.f8416t1, 0);
            this.f9765c = obtainStyledAttributes.getInt(j.f8426v1, 0);
            this.f9766d = obtainStyledAttributes.getInt(j.f8431w1, 0);
            this.f9767e = obtainStyledAttributes.getInt(j.f8436x1, 0);
            this.f9768f = obtainStyledAttributes.getBoolean(j.f8421u1, true);
            this.f9769g = obtainStyledAttributes.getBoolean(j.f8411s1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            u0 t10 = u0.t(g.this.f9758c, attributeSet, j.f8441y1);
            this.f9771i = t10.m(j.B1, 0);
            this.f9772j = (t10.j(j.E1, this.f9765c) & -65536) | (t10.j(j.F1, this.f9766d) & 65535);
            this.f9773k = t10.o(j.G1);
            this.f9774l = t10.o(j.H1);
            this.f9775m = t10.m(j.f8446z1, 0);
            this.f9776n = c(t10.n(j.I1));
            this.f9777o = t10.j(j.P1, 4096);
            this.f9778p = c(t10.n(j.J1));
            this.f9779q = t10.j(j.T1, 4096);
            int i10 = j.K1;
            if (t10.r(i10)) {
                this.f9780r = t10.a(i10, false) ? 1 : 0;
            } else {
                this.f9780r = this.f9767e;
            }
            this.f9781s = t10.a(j.C1, false);
            this.f9782t = t10.a(j.D1, this.f9768f);
            this.f9783u = t10.a(j.A1, this.f9769g);
            this.f9784v = t10.j(j.U1, -1);
            this.f9788z = t10.n(j.L1);
            this.f9785w = t10.m(j.M1, 0);
            this.f9786x = t10.n(j.O1);
            String n10 = t10.n(j.N1);
            this.f9787y = n10;
            if ((n10 != null) && this.f9785w == 0 && this.f9786x == null) {
                this.A = (androidx.core.view.b) e(n10, g.f9755f, g.this.f9757b);
            } else {
                this.A = null;
            }
            this.B = t10.o(j.Q1);
            this.C = t10.o(j.V1);
            int i11 = j.S1;
            if (t10.r(i11)) {
                this.E = c0.e(t10.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.R1;
            if (t10.r(i12)) {
                this.D = t10.c(i12);
            } else {
                this.D = null;
            }
            t10.v();
            this.f9770h = false;
        }

        public void h() {
            this.f9764b = 0;
            this.f9765c = 0;
            this.f9766d = 0;
            this.f9767e = 0;
            this.f9768f = true;
            this.f9769g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f9754e = r0
            f9755f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f9758c = context;
        Object[] objArr = {context};
        this.f9756a = objArr;
        this.f9757b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            str = null;
                            z11 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                androidx.core.view.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f9759d == null) {
            this.f9759d = a(this.f9758c);
        }
        return this.f9759d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof z.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f9758c.getResources().getLayout(i10);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
