package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class u implements Iterable<Intent> {

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<Intent> f2246h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private final Context f2247i;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent b();
    }

    private u(Context context) {
        this.f2247i = context;
    }

    public static u d(Context context) {
        return new u(context);
    }

    public u a(Intent intent) {
        this.f2246h.add(intent);
        return this;
    }

    public u b(Activity activity) {
        Intent b10 = activity instanceof a ? ((a) activity).b() : null;
        if (b10 == null) {
            b10 = j.a(activity);
        }
        if (b10 != null) {
            ComponentName component = b10.getComponent();
            if (component == null) {
                component = b10.resolveActivity(this.f2247i.getPackageManager());
            }
            c(component);
            a(b10);
        }
        return this;
    }

    public u c(ComponentName componentName) {
        int size = this.f2246h.size();
        try {
            Intent b10 = j.b(this.f2247i, componentName);
            while (b10 != null) {
                this.f2246h.add(size, b10);
                b10 = j.b(this.f2247i, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public void e() {
        f((Bundle) null);
    }

    public void f(Bundle bundle) {
        if (!this.f2246h.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2246h.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.n(this.f2247i, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2247i.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2246h.iterator();
    }
}
