package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class j0 extends h0 implements i0 {
    private static Method R;
    private i0 Q;

    /* compiled from: MenuPopupWindow */
    public static class a extends d0 {

        /* renamed from: v  reason: collision with root package name */
        final int f1132v;

        /* renamed from: w  reason: collision with root package name */
        final int f1133w;

        /* renamed from: x  reason: collision with root package name */
        private i0 f1134x;

        /* renamed from: y  reason: collision with root package name */
        private MenuItem f1135y;

        public a(Context context, boolean z10) {
            super(context, z10);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1132v = 22;
                this.f1133w = 21;
                return;
            }
            this.f1132v = 21;
            this.f1133w = 22;
        }

        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            d dVar;
            int pointToPosition;
            int i11;
            if (this.f1134x != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    dVar = (d) adapter;
                }
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f1135y;
                if (menuItem != gVar) {
                    e b10 = dVar.b();
                    if (menuItem != null) {
                        this.f1134x.f(b10, menuItem);
                    }
                    this.f1135y = gVar;
                    if (gVar != null) {
                        this.f1134x.c(b10, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1132v) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f1133w) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ((d) getAdapter()).b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(i0 i0Var) {
            this.f1134x = i0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                R = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.M.setEnterTransition((Transition) obj);
        }
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.M.setExitTransition((Transition) obj);
        }
    }

    public void O(i0 i0Var) {
        this.Q = i0Var;
    }

    public void P(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = R;
            if (method != null) {
                try {
                    method.invoke(this.M, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.M.setTouchModal(z10);
        }
    }

    public void c(e eVar, MenuItem menuItem) {
        i0 i0Var = this.Q;
        if (i0Var != null) {
            i0Var.c(eVar, menuItem);
        }
    }

    public void f(e eVar, MenuItem menuItem) {
        i0 i0Var = this.Q;
        if (i0Var != null) {
            i0Var.f(eVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public d0 r(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
