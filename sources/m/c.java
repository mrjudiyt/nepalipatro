package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS */
public class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final z.b f10138d;

    /* renamed from: e  reason: collision with root package name */
    private Method f10139e;

    /* compiled from: MenuItemWrapperICS */
    private class a extends androidx.core.view.b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f10140d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f10140d = actionProvider;
        }

        public boolean a() {
            return this.f10140d.hasSubMenu();
        }

        public View c() {
            return this.f10140d.onCreateActionView();
        }

        public boolean e() {
            return this.f10140d.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f10140d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private b.C0041b f10142f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f10140d.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f10140d.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f10140d.overridesItemVisibility();
        }

        public void j(b.C0041b bVar) {
            this.f10142f = bVar;
            this.f10140d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            b.C0041b bVar = this.f10142f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: m.c$c  reason: collision with other inner class name */
    /* compiled from: MenuItemWrapperICS */
    static class C0167c extends FrameLayout implements l.c {

        /* renamed from: h  reason: collision with root package name */
        final CollapsibleActionView f10144h;

        C0167c(View view) {
            super(view.getContext());
            this.f10144h = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f10144h;
        }

        public void c() {
            this.f10144h.onActionViewExpanded();
        }

        public void d() {
            this.f10144h.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f10145a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f10145a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10145a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10145a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f10147a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f10147a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f10147a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, z.b bVar) {
        super(context);
        if (bVar != null) {
            this.f10138d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f10138d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f10138d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        androidx.core.view.b b10 = this.f10138d.b();
        if (b10 instanceof a) {
            return ((a) b10).f10140d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f10138d.getActionView();
        return actionView instanceof C0167c ? ((C0167c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f10138d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f10138d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f10138d.getContentDescription();
    }

    public int getGroupId() {
        return this.f10138d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f10138d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f10138d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10138d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f10138d.getIntent();
    }

    public int getItemId() {
        return this.f10138d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10138d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f10138d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f10138d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f10138d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f10138d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f10138d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f10138d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f10138d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f10139e == null) {
                this.f10139e = this.f10138d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f10139e.invoke(this.f10138d, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception unused) {
        }
    }

    public boolean hasSubMenu() {
        return this.f10138d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f10138d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f10138d.isCheckable();
    }

    public boolean isChecked() {
        return this.f10138d.isChecked();
    }

    public boolean isEnabled() {
        return this.f10138d.isEnabled();
    }

    public boolean isVisible() {
        return this.f10138d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        androidx.core.view.b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new b(this.f10135a, actionProvider);
        } else {
            bVar = new a(this.f10135a, actionProvider);
        }
        z.b bVar2 = this.f10138d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0167c(view);
        }
        this.f10138d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10138d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f10138d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f10138d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f10138d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f10138d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10138d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10138d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10138d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10138d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10138d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10138d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10138d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10138d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f10138d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f10138d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10138d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10138d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f10138d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f10138d.setVisible(z10);
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10138d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10138d.setIcon(i10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10138d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10138d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f10138d.setTitle(i10);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f10138d.setActionView(i10);
        View actionView = this.f10138d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f10138d.setActionView((View) new C0167c(actionView));
        }
        return this;
    }
}
