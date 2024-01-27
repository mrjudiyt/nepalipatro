package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.j;
import f.g;

/* compiled from: MenuDialogHelper */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: h  reason: collision with root package name */
    private e f751h;

    /* renamed from: i  reason: collision with root package name */
    private a f752i;

    /* renamed from: j  reason: collision with root package name */
    c f753j;

    /* renamed from: k  reason: collision with root package name */
    private j.a f754k;

    public f(e eVar) {
        this.f751h = eVar;
    }

    public void a() {
        a aVar = this.f752i;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f751h) {
            a();
        }
        j.a aVar = this.f754k;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public boolean c(e eVar) {
        j.a aVar = this.f754k;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f751h;
        a.C0010a aVar = new a.C0010a(eVar.u());
        c cVar = new c(aVar.b(), g.f8292j);
        this.f753j = cVar;
        cVar.g(this);
        this.f751h.b(this.f753j);
        aVar.c(this.f753j.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.d(y10);
        } else {
            aVar.e(eVar.w()).h(eVar.x());
        }
        aVar.f(this);
        a a10 = aVar.a();
        this.f752i = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f752i.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f752i.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f751h.L((g) this.f753j.a().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f753j.b(this.f751h, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f752i.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f752i.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f751h.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f751h.performShortcut(i10, keyEvent, 0);
    }
}
