package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class e implements z.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f725a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f726b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f727c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f728d;

    /* renamed from: e  reason: collision with root package name */
    private a f729e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f730f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f731g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f732h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f733i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f734j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f735k;

    /* renamed from: l  reason: collision with root package name */
    private int f736l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f737m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f738n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f739o;

    /* renamed from: p  reason: collision with root package name */
    View f740p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f741q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f742r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f743s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f744t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f745u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f746v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f747w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private g f748x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f749y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f750z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f725a = context;
        this.f726b = context.getResources();
        this.f730f = new ArrayList<>();
        this.f731g = new ArrayList<>();
        this.f732h = true;
        this.f733i = new ArrayList<>();
        this.f734j = new ArrayList<>();
        this.f735k = true;
        b0(true);
    }

    private static int B(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f730f.size()) {
            this.f730f.remove(i10);
            if (z10) {
                K(true);
            }
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f740p = view;
            this.f738n = null;
            this.f739o = null;
        } else {
            if (i10 > 0) {
                this.f738n = C.getText(i10);
            } else if (charSequence != null) {
                this.f738n = charSequence;
            }
            if (i11 > 0) {
                this.f739o = androidx.core.content.a.f(u(), i11);
            } else if (drawable != null) {
                this.f739o = drawable;
            }
            this.f740p = null;
        }
        K(false);
    }

    private void b0(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.f726b.getConfiguration().keyboard == 1 || !b0.f(ViewConfiguration.get(this.f725a), this.f725a)) {
            z11 = false;
        }
        this.f728d = z11;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (!this.f747w.isEmpty()) {
            d0();
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    jVar.c(z10);
                }
            }
            c0();
        }
    }

    private boolean j(m mVar, j jVar) {
        boolean z10 = false;
        if (this.f747w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z10 = jVar.j(mVar);
        }
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null) {
                this.f747w.remove(next);
            } else if (!z10) {
                z10 = jVar2.j(mVar);
            }
        }
        return z10;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f744t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.f726b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f732h) {
            return this.f731g;
        }
        this.f731g.clear();
        int size = this.f730f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f730f.get(i10);
            if (gVar.isVisible()) {
                this.f731g.add(gVar);
            }
        }
        this.f732h = false;
        this.f735k = true;
        return this.f731g;
    }

    public boolean F() {
        return this.f749y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f727c;
    }

    public boolean H() {
        return this.f728d;
    }

    /* access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f735k = true;
        K(true);
    }

    /* access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f732h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (!this.f741q) {
            if (z10) {
                this.f732h = true;
                this.f735k = true;
            }
            i(z10);
            return;
        }
        this.f742r = true;
        if (z10) {
            this.f743s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, (j) null, i10);
    }

    public boolean M(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        androidx.core.view.b b10 = gVar.b();
        boolean z10 = b10 != null && b10.a();
        if (gVar.j()) {
            k10 |= gVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                b10.f(mVar);
            }
            k10 |= j(mVar, jVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f747w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).P(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f729e = aVar;
    }

    public e S(int i10) {
        this.f736l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f730f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f730f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    /* access modifiers changed from: protected */
    public e U(int i10) {
        W(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e X(int i10) {
        W(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f736l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f737m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f730f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f750z = z10;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f725a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f725a);
    }

    public void c(j jVar, Context context) {
        this.f747w.add(new WeakReference(jVar));
        jVar.h(context, this);
        this.f735k = true;
    }

    public void c0() {
        this.f741q = false;
        if (this.f742r) {
            this.f742r = false;
            K(this.f743s);
        }
    }

    public void clear() {
        g gVar = this.f748x;
        if (gVar != null) {
            f(gVar);
        }
        this.f730f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f739o = null;
        this.f738n = null;
        this.f740p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f729e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.f741q) {
            this.f741q = true;
            this.f742r = false;
            this.f743s = false;
        }
    }

    public final void e(boolean z10) {
        if (!this.f745u) {
            this.f745u = true;
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    jVar.b(this, z10);
                }
            }
            this.f745u = false;
        }
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f747w.isEmpty() && this.f748x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    z10 = jVar.e(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            c0();
            if (z10) {
                this.f748x = null;
            }
        }
        return z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f730f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return this.f730f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f729e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f750z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f730f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f747w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.f747w.remove(next);
            } else {
                z10 = jVar.f(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        c0();
        if (z10) {
            this.f748x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f730f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f730f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public g p(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<g> arrayList = this.f746v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (G) {
                c10 = gVar.getAlphabeticShortcut();
            } else {
                c10 = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (G && c10 == 8 && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    public void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f730f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f730f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f735k) {
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    z10 |= jVar.d();
                }
            }
            if (z10) {
                this.f733i.clear();
                this.f734j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    if (gVar.l()) {
                        this.f733i.add(gVar);
                    } else {
                        this.f734j.add(gVar);
                    }
                }
            } else {
                this.f733i.clear();
                this.f734j.clear();
                this.f734j.addAll(E());
            }
            this.f735k = false;
        }
    }

    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f730f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f730f.get(l10).getGroupId() != i10) {
                    K(true);
                } else {
                    N(l10, false);
                    i11 = i12;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f733i;
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f730f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f730f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f749y = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f730f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f730f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f730f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f730f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f727c = z10;
        K(false);
    }

    public int size() {
        return this.f730f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f725a;
    }

    public g v() {
        return this.f748x;
    }

    public Drawable w() {
        return this.f739o;
    }

    public CharSequence x() {
        return this.f738n;
    }

    public View y() {
        return this.f740p;
    }

    public ArrayList<g> z() {
        r();
        return this.f734j;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f726b.getString(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f726b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f725a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f726b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f726b.getString(i13));
    }
}
