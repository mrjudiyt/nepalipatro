package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import g.f;

/* compiled from: AlertDialog */
public class a extends f {

    /* renamed from: j  reason: collision with root package name */
    final AlertController f635j = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* compiled from: AlertDialog */
    public static class C0010a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f636a;

        /* renamed from: b  reason: collision with root package name */
        private final int f637b;

        public C0010a(Context context) {
            this(context, a.i(context, 0));
        }

        public a a() {
            a aVar = new a(this.f636a.f596a, this.f637b);
            this.f636a.a(aVar.f635j);
            aVar.setCancelable(this.f636a.f613r);
            if (this.f636a.f613r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f636a.f614s);
            aVar.setOnDismissListener(this.f636a.f615t);
            DialogInterface.OnKeyListener onKeyListener = this.f636a.f616u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f636a.f596a;
        }

        public C0010a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f636a;
            fVar.f618w = listAdapter;
            fVar.f619x = onClickListener;
            return this;
        }

        public C0010a d(View view) {
            this.f636a.f602g = view;
            return this;
        }

        public C0010a e(Drawable drawable) {
            this.f636a.f599d = drawable;
            return this;
        }

        public C0010a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f636a.f616u = onKeyListener;
            return this;
        }

        public C0010a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f636a;
            fVar.f618w = listAdapter;
            fVar.f619x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public C0010a h(CharSequence charSequence) {
            this.f636a.f601f = charSequence;
            return this;
        }

        public C0010a(Context context, int i10) {
            this.f636a = new AlertController.f(new ContextThemeWrapper(context, a.i(context, i10)));
            this.f637b = i10;
        }
    }

    protected a(Context context, int i10) {
        super(context, i(context, i10));
    }

    static int i(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f8198o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f635j.d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f635j.e();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f635j.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f635j.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f635j.q(charSequence);
    }
}
