package g;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.z0;
import androidx.core.app.j;
import androidx.core.app.u;
import androidx.fragment.app.e;
import l.b;

/* compiled from: AppCompatActivity */
public class b extends e implements c, u.a {

    /* renamed from: h  reason: collision with root package name */
    private d f8533h;

    /* renamed from: i  reason: collision with root package name */
    private Resources f8534i;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean n(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.n(android.view.KeyEvent):boolean");
    }

    public void a(l.b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(g().f(context));
    }

    public Intent b() {
        return j.a(this);
    }

    public l.b c(b.a aVar) {
        return null;
    }

    public void closeOptionsMenu() {
        a h10 = h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h10 == null || !h10.f()) {
            super.closeOptionsMenu();
        }
    }

    public void d(l.b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a h10 = h();
        if (keyCode != 82 || h10 == null || !h10.o(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i10) {
        return g().i(i10);
    }

    public d g() {
        if (this.f8533h == null) {
            this.f8533h = d.g(this, this);
        }
        return this.f8533h;
    }

    public MenuInflater getMenuInflater() {
        return g().l();
    }

    public Resources getResources() {
        if (this.f8534i == null && z0.b()) {
            this.f8534i = new z0(this, super.getResources());
        }
        Resources resources = this.f8534i;
        return resources == null ? super.getResources() : resources;
    }

    public a h() {
        return g().m();
    }

    public void i(u uVar) {
        uVar.b(this);
    }

    public void invalidateOptionsMenu() {
        g().o();
    }

    /* access modifiers changed from: protected */
    public void j(int i10) {
    }

    public void k(u uVar) {
    }

    @Deprecated
    public void l() {
    }

    public boolean m() {
        Intent b10 = b();
        if (b10 == null) {
            return false;
        }
        if (p(b10)) {
            u d10 = u.d(this);
            i(d10);
            k(d10);
            d10.e();
            try {
                androidx.core.app.b.r(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            o(b10);
            return true;
        }
    }

    public void o(Intent intent) {
        j.e(this, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f8534i != null) {
            this.f8534i.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        g().p(configuration);
    }

    public void onContentChanged() {
        l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        d g10 = g();
        g10.n();
        g10.q(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        g().r();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (n(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a h10 = h();
        if (menuItem.getItemId() != 16908332 || h10 == null || (h10.i() & 4) == 0) {
            return false;
        }
        return m();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        g().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        g().t();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g().u(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        g().v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        g().w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        g().E(charSequence);
    }

    public void openOptionsMenu() {
        a h10 = h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h10 == null || !h10.p()) {
            super.openOptionsMenu();
        }
    }

    public boolean p(Intent intent) {
        return j.f(this, intent);
    }

    public void setContentView(int i10) {
        g().A(i10);
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        g().D(i10);
    }

    public void supportInvalidateOptionsMenu() {
        g().o();
    }

    public void setContentView(View view) {
        g().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().C(view, layoutParams);
    }
}
