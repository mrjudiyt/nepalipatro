package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import com.facebook.internal.NativeProtocol;
import f.h;
import z.b;

/* compiled from: MenuItemImpl */
public final class g implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f755a;

    /* renamed from: b  reason: collision with root package name */
    private final int f756b;

    /* renamed from: c  reason: collision with root package name */
    private final int f757c;

    /* renamed from: d  reason: collision with root package name */
    private final int f758d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f759e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f760f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f761g;

    /* renamed from: h  reason: collision with root package name */
    private char f762h;

    /* renamed from: i  reason: collision with root package name */
    private int f763i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f764j;

    /* renamed from: k  reason: collision with root package name */
    private int f765k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f766l;

    /* renamed from: m  reason: collision with root package name */
    private int f767m = 0;

    /* renamed from: n  reason: collision with root package name */
    e f768n;

    /* renamed from: o  reason: collision with root package name */
    private m f769o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f770p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f771q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f772r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f773s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f774t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f775u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f776v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f777w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f778x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f779y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f780z = 0;

    /* compiled from: MenuItemImpl */
    class a implements b.C0041b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f768n.J(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f768n = eVar;
        this.f755a = i11;
        this.f756b = i10;
        this.f757c = i12;
        this.f758d = i13;
        this.f759e = charSequence;
        this.f780z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f778x && (this.f776v || this.f777w)) {
            drawable = androidx.core.graphics.drawable.a.q(drawable).mutate();
            if (this.f776v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f774t);
            }
            if (this.f777w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f775u);
            }
            this.f778x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f768n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f780z & 4) == 4;
    }

    public z.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f768n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f768n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f780z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f768n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f768n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f758d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f768n.G() ? this.f764j : this.f762h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.A = d10;
        return d10;
    }

    public int getAlphabeticModifiers() {
        return this.f765k;
    }

    public char getAlphabeticShortcut() {
        return this.f764j;
    }

    public CharSequence getContentDescription() {
        return this.f772r;
    }

    public int getGroupId() {
        return this.f756b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f766l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f767m == 0) {
            return null;
        }
        Drawable d10 = h.a.d(this.f768n.u(), this.f767m);
        this.f767m = 0;
        this.f766l = d10;
        return e(d10);
    }

    public ColorStateList getIconTintList() {
        return this.f774t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f775u;
    }

    public Intent getIntent() {
        return this.f761g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f755a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f763i;
    }

    public char getNumericShortcut() {
        return this.f762h;
    }

    public int getOrder() {
        return this.f757c;
    }

    public SubMenu getSubMenu() {
        return this.f769o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f759e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f760f;
        if (charSequence == null) {
            charSequence = this.f759e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f773s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f768n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f768n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.f8313k));
        }
        int i10 = this.f768n.G() ? this.f765k : this.f763i;
        d(sb, i10, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, resources.getString(h.f8309g));
        d(sb, i10, 4096, resources.getString(h.f8305c));
        d(sb, i10, 2, resources.getString(h.f8304b));
        d(sb, i10, 1, resources.getString(h.f8310h));
        d(sb, i10, 4, resources.getString(h.f8312j));
        d(sb, i10, 8, resources.getString(h.f8308f));
        if (g10 == 8) {
            sb.append(resources.getString(h.f8306d));
        } else if (g10 == 10) {
            sb.append(resources.getString(h.f8307e));
        } else if (g10 != ' ') {
            sb.append(g10);
        } else {
            sb.append(resources.getString(h.f8311i));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f769o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar == null || !aVar.c()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f779y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f779y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f779y & 16) != 0;
    }

    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            if ((this.f779y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f779y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f780z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f771q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f768n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f770p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f761g != null) {
            try {
                this.f768n.u().startActivity(this.f761g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return (this.f779y & 32) == 32;
    }

    public boolean m() {
        return (this.f779y & 4) != 0;
    }

    public boolean n() {
        return (this.f780z & 1) == 1;
    }

    public boolean o() {
        return (this.f780z & 2) == 2;
    }

    /* renamed from: p */
    public z.b setActionView(int i10) {
        Context u10 = this.f768n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, new LinearLayout(u10), false));
        return this;
    }

    /* renamed from: q */
    public z.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f755a) > 0) {
            view.setId(i10);
        }
        this.f768n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f768n.K(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f779y;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f779y = i11;
        if (i10 != i11) {
            this.f768n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f764j == c10) {
            return this;
        }
        this.f764j = Character.toLowerCase(c10);
        this.f768n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f779y;
        boolean z11 = z10 | (i10 & true);
        this.f779y = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f768n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f779y & 4) != 0) {
            this.f768n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f779y |= 16;
        } else {
            this.f779y &= -17;
        }
        this.f768n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f767m = 0;
        this.f766l = drawable;
        this.f778x = true;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f774t = colorStateList;
        this.f776v = true;
        this.f778x = true;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f775u = mode;
        this.f777w = true;
        this.f778x = true;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f761g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f762h == c10) {
            return this;
        }
        this.f762h = c10;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f771q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f762h = c10;
        this.f764j = Character.toLowerCase(c11);
        this.f768n.K(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f780z = i10;
            this.f768n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f759e = charSequence;
        this.f768n.K(false);
        m mVar = this.f769o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f760f = charSequence;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f768n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f779y = (z10 ? 4 : 0) | (this.f779y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f759e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f779y |= 32;
        } else {
            this.f779y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public z.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f769o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f779y;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f779y = i11;
        if (i10 != i11) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.f768n.A();
    }

    public z.b setContentDescription(CharSequence charSequence) {
        this.f772r = charSequence;
        this.f768n.K(false);
        return this;
    }

    public z.b setTooltipText(CharSequence charSequence) {
        this.f773s = charSequence;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f764j == c10 && this.f765k == i10) {
            return this;
        }
        this.f764j = Character.toLowerCase(c10);
        this.f765k = KeyEvent.normalizeMetaState(i10);
        this.f768n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f762h == c10 && this.f763i == i10) {
            return this;
        }
        this.f762h = c10;
        this.f763i = KeyEvent.normalizeMetaState(i10);
        this.f768n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f762h = c10;
        this.f763i = KeyEvent.normalizeMetaState(i10);
        this.f764j = Character.toLowerCase(c11);
        this.f765k = KeyEvent.normalizeMetaState(i11);
        this.f768n.K(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f766l = null;
        this.f767m = i10;
        this.f778x = true;
        this.f768n.K(false);
        return this;
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f768n.u().getString(i10));
    }
}
