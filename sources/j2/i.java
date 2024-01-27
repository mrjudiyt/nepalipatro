package j2;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f9416a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9417b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9418c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9419d;

    /* compiled from: MemorySizeCalculator */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f9420i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a  reason: collision with root package name */
        final Context f9421a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f9422b;

        /* renamed from: c  reason: collision with root package name */
        c f9423c;

        /* renamed from: d  reason: collision with root package name */
        float f9424d = 2.0f;

        /* renamed from: e  reason: collision with root package name */
        float f9425e = ((float) f9420i);

        /* renamed from: f  reason: collision with root package name */
        float f9426f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f9427g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f9428h = 4194304;

        public a(Context context) {
            this.f9421a = context;
            this.f9422b = (ActivityManager) context.getSystemService("activity");
            this.f9423c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && i.e(this.f9422b)) {
                this.f9425e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f9429a;

        b(DisplayMetrics displayMetrics) {
            this.f9429a = displayMetrics;
        }

        public int a() {
            return this.f9429a.heightPixels;
        }

        public int b() {
            return this.f9429a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i10;
        this.f9418c = aVar.f9421a;
        if (e(aVar.f9422b)) {
            i10 = aVar.f9428h / 2;
        } else {
            i10 = aVar.f9428h;
        }
        this.f9419d = i10;
        int c10 = c(aVar.f9422b, aVar.f9426f, aVar.f9427g);
        float b10 = (float) (aVar.f9423c.b() * aVar.f9423c.a() * 4);
        int round = Math.round(aVar.f9425e * b10);
        int round2 = Math.round(b10 * aVar.f9424d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f9417b = round2;
            this.f9416a = round;
        } else {
            float f10 = (float) i11;
            float f11 = aVar.f9425e;
            float f12 = aVar.f9424d;
            float f13 = f10 / (f11 + f12);
            this.f9417b = Math.round(f12 * f13);
            this.f9416a = Math.round(f13 * aVar.f9425e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f9417b));
            sb.append(", pool size: ");
            sb.append(f(this.f9416a));
            sb.append(", byte array size: ");
            sb.append(f(i10));
            sb.append(", memory class limited? ");
            sb.append(i12 > c10);
            sb.append(", max size: ");
            sb.append(f(c10));
            sb.append(", memoryClass: ");
            sb.append(aVar.f9422b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f9422b));
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        boolean e10 = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e10) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f9418c, (long) i10);
    }

    public int a() {
        return this.f9419d;
    }

    public int b() {
        return this.f9416a;
    }

    public int d() {
        return this.f9417b;
    }
}
