package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import f.b;
import f.d;
import f.j;

/* compiled from: ActionBarPolicy */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f9733a;

    private a(Context context) {
        this.f9733a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f9733a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f9733a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f9733a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f9733a.getResources().getDimensionPixelSize(d.f8220b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f9733a.obtainStyledAttributes((AttributeSet) null, j.f8319a, f.a.f8186c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f8364j, 0);
        Resources resources = this.f9733a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.f8219a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f9733a.getResources().getBoolean(b.f8210a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f9733a).hasPermanentMenuKey();
    }
}
