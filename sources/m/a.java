package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import z.b;

/* compiled from: ActionMenuItem */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f10115a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10116b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10117c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f10118d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f10119e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f10120f;

    /* renamed from: g  reason: collision with root package name */
    private char f10121g;

    /* renamed from: h  reason: collision with root package name */
    private int f10122h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f10123i;

    /* renamed from: j  reason: collision with root package name */
    private int f10124j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f10125k;

    /* renamed from: l  reason: collision with root package name */
    private Context f10126l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f10127m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f10128n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f10129o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f10130p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f10131q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10132r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10133s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f10134t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f10126l = context;
        this.f10115a = i11;
        this.f10116b = i10;
        this.f10117c = i13;
        this.f10118d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f10125k;
        if (drawable == null) {
            return;
        }
        if (this.f10132r || this.f10133s) {
            Drawable q10 = androidx.core.graphics.drawable.a.q(drawable);
            this.f10125k = q10;
            Drawable mutate = q10.mutate();
            this.f10125k = mutate;
            if (this.f10132r) {
                androidx.core.graphics.drawable.a.n(mutate, this.f10130p);
            }
            if (this.f10133s) {
                androidx.core.graphics.drawable.a.o(this.f10125k, this.f10131q);
            }
        }
    }

    public b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public androidx.core.view.b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f10124j;
    }

    public char getAlphabeticShortcut() {
        return this.f10123i;
    }

    public CharSequence getContentDescription() {
        return this.f10128n;
    }

    public int getGroupId() {
        return this.f10116b;
    }

    public Drawable getIcon() {
        return this.f10125k;
    }

    public ColorStateList getIconTintList() {
        return this.f10130p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10131q;
    }

    public Intent getIntent() {
        return this.f10120f;
    }

    public int getItemId() {
        return this.f10115a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f10122h;
    }

    public char getNumericShortcut() {
        return this.f10121g;
    }

    public int getOrder() {
        return this.f10117c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f10118d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10119e;
        return charSequence != null ? charSequence : this.f10118d;
    }

    public CharSequence getTooltipText() {
        return this.f10129o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f10134t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f10134t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f10134t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f10134t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10123i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f10134t = z10 | (this.f10134t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f10134t = (z10 ? 2 : 0) | (this.f10134t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f10134t = (z10 ? 16 : 0) | (this.f10134t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10125k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10130p = colorStateList;
        this.f10132r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10131q = mode;
        this.f10133s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10120f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10121g = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10127m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10121g = c10;
        this.f10123i = Character.toLowerCase(c11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10118d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10119e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f10134t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f10134t = i11 | i10;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10123i = Character.toLowerCase(c10);
        this.f10124j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f10128n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10121g = c10;
        this.f10122h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f10118d = this.f10126l.getResources().getString(i10);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f10129o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10125k = androidx.core.content.a.f(this.f10126l, i10);
        c();
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10121g = c10;
        this.f10122h = KeyEvent.normalizeMetaState(i10);
        this.f10123i = Character.toLowerCase(c11);
        this.f10124j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
