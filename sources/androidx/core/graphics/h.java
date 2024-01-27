package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f2364g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f2365h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f2366i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f2367j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f2368k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f2369l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f2370m;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> z10 = z();
            constructor = A(z10);
            method4 = w(z10);
            method3 = x(z10);
            method2 = B(z10);
            method = v(z10);
            Class<?> cls2 = z10;
            method5 = y(z10);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e10.getClass().getName());
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2364g = cls;
        this.f2365h = constructor;
        this.f2366i = method4;
        this.f2367j = method3;
        this.f2368k = method2;
        this.f2369l = method;
        this.f2370m = method5;
    }

    private Object p() {
        try {
            return this.f2365h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void q(Object obj) {
        try {
            this.f2369l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean r(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2366i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f2367j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t(Object obj) {
        try {
            return ((Boolean) this.f2368k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean u() {
        return this.f2366i != null;
    }

    /* access modifiers changed from: protected */
    public Constructor<?> A(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method B(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        if (!u()) {
            return super.b(context, cVar, resources, i10);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!r(context, p10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                q(p10);
                return null;
            }
        }
        if (!t(p10)) {
            return null;
        }
        return m(p10);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface m10;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!u()) {
            g.b i11 = i(bVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i11.e()).setItalic(i11.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h10 = l.h(context, bVarArr, cancellationSignal);
            Object p10 = p();
            if (p10 == null) {
                return null;
            }
            boolean z10 = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = h10.get(bVar.d());
                if (byteBuffer != null) {
                    if (!s(p10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        q(p10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                q(p10);
                return null;
            } else if (t(p10) && (m10 = m(p10)) != null) {
                return Typeface.create(m10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!u()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        if (!r(context, p10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            q(p10);
            return null;
        } else if (!t(p10)) {
            return null;
        } else {
            return m(p10);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2364g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2370m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method v(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method y(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> z() {
        return Class.forName("android.graphics.FontFamily");
    }
}
