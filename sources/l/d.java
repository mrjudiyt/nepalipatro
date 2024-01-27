package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import f.i;

/* compiled from: ContextThemeWrapper */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f9736a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f9737b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f9738c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f9739d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f9740e;

    public d() {
        super((Context) null);
    }

    private Resources b() {
        if (this.f9740e == null) {
            Configuration configuration = this.f9739d;
            if (configuration == null) {
                this.f9740e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f9740e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f9739d);
                this.f9740e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f9740e;
    }

    private void d() {
        boolean z10 = this.f9737b == null;
        if (z10) {
            this.f9737b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9737b.setTo(theme);
            }
        }
        e(this.f9737b, this.f9736a, z10);
    }

    public void a(Configuration configuration) {
        if (this.f9740e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f9739d == null) {
            this.f9739d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f9736a;
    }

    /* access modifiers changed from: protected */
    public void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9738c == null) {
            this.f9738c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9738c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9737b;
        if (theme != null) {
            return theme;
        }
        if (this.f9736a == 0) {
            this.f9736a = i.f8318d;
        }
        d();
        return this.f9737b;
    }

    public void setTheme(int i10) {
        if (this.f9736a != i10) {
            this.f9736a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f9736a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f9737b = theme;
    }
}
