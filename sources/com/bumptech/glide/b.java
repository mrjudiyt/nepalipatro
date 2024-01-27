package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.c;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.load.resource.bitmap.y;
import e2.i;
import f2.k;
import f2.m;
import i2.e;
import j2.h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.a;
import l2.b;
import l2.d;
import l2.e;
import l2.f;
import l2.k;
import l2.s;
import l2.t;
import l2.u;
import l2.v;
import l2.w;
import l2.x;
import m2.a;
import m2.b;
import m2.c;
import m2.d;
import m2.e;
import m2.f;
import o2.a;
import t2.d;
import t2.l;
import w2.g;

/* compiled from: Glide */
public class b implements ComponentCallbacks2 {

    /* renamed from: s  reason: collision with root package name */
    private static volatile b f5559s;

    /* renamed from: t  reason: collision with root package name */
    private static volatile boolean f5560t;

    /* renamed from: h  reason: collision with root package name */
    private final j f5561h;

    /* renamed from: i  reason: collision with root package name */
    private final e f5562i;

    /* renamed from: j  reason: collision with root package name */
    private final h f5563j;

    /* renamed from: k  reason: collision with root package name */
    private final d f5564k;

    /* renamed from: l  reason: collision with root package name */
    private final Registry f5565l;

    /* renamed from: m  reason: collision with root package name */
    private final i2.b f5566m;

    /* renamed from: n  reason: collision with root package name */
    private final l f5567n;

    /* renamed from: o  reason: collision with root package name */
    private final d f5568o;

    /* renamed from: p  reason: collision with root package name */
    private final List<h> f5569p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private final a f5570q;

    /* renamed from: r  reason: collision with root package name */
    private e f5571r = e.NORMAL;

    /* compiled from: Glide */
    public interface a {
        w2.h build();
    }

    b(Context context, j jVar, h hVar, e eVar, i2.b bVar, l lVar, d dVar, int i10, a aVar, Map<Class<?>, i<?, ?>> map, List<g<Object>> list, boolean z10, boolean z11) {
        i iVar;
        i iVar2;
        Context context2 = context;
        e eVar2 = eVar;
        i2.b bVar2 = bVar;
        Class<d2.a> cls = d2.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f5561h = jVar;
        this.f5562i = eVar2;
        this.f5566m = bVar2;
        this.f5563j = hVar;
        this.f5567n = lVar;
        this.f5568o = dVar;
        this.f5570q = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f5565l = registry;
        registry.o(new DefaultImageHeaderParser());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            registry.o(new n());
        }
        List<ImageHeaderParser> g10 = registry.g();
        r2.a aVar2 = new r2.a(context2, g10, eVar2, bVar2);
        i<ParcelFileDescriptor, Bitmap> h10 = y.h(eVar);
        k kVar = new k(registry.g(), resources.getDisplayMetrics(), eVar2, bVar2);
        if (!z11 || i11 < 28) {
            iVar = new com.bumptech.glide.load.resource.bitmap.g(kVar);
            iVar2 = new v(kVar, bVar2);
        } else {
            iVar2 = new q();
            iVar = new com.bumptech.glide.load.resource.bitmap.h();
        }
        Class<byte[]> cls5 = cls4;
        p2.d dVar2 = new p2.d(context2);
        int i12 = i11;
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        Class<String> cls6 = cls2;
        s.b bVar3 = new s.b(resources);
        s.d dVar4 = dVar3;
        s.a aVar3 = new s.a(resources);
        c cVar2 = new c(bVar2);
        Class<Integer> cls7 = cls3;
        s2.a aVar4 = new s2.a();
        s2.d dVar5 = new s2.d();
        ContentResolver contentResolver = context.getContentResolver();
        s.b bVar4 = bVar3;
        s.c cVar3 = cVar;
        p2.d dVar6 = dVar2;
        registry.a(ByteBuffer.class, new l2.c()).a(InputStream.class, new t(bVar2)).e("Bitmap", ByteBuffer.class, Bitmap.class, iVar).e("Bitmap", InputStream.class, Bitmap.class, iVar2);
        if (m.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new com.bumptech.glide.load.resource.bitmap.s(kVar));
        }
        p2.d dVar7 = dVar6;
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h10).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, y.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.b()).e("Bitmap", Bitmap.class, Bitmap.class, new x()).b(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, iVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, iVar2)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, h10)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar2, cVar2)).e("Gif", InputStream.class, r2.c.class, new r2.j(g10, aVar2, bVar2)).e("Gif", ByteBuffer.class, r2.c.class, aVar2).b(r2.c.class, new r2.d()).d(cls, cls, v.a.b()).e("Bitmap", cls, Bitmap.class, new r2.h(eVar2)).c(Uri.class, Drawable.class, dVar7).c(Uri.class, Bitmap.class, new u(dVar7, eVar2)).p(new a.C0175a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new f.e()).c(File.class, File.class, new q2.a()).d(File.class, ParcelFileDescriptor.class, new f.b()).d(File.class, File.class, v.a.b()).p(new k.a(bVar2));
        if (m.c()) {
            registry.p(new m.a());
        }
        Class cls8 = Integer.TYPE;
        s.c cVar4 = cVar3;
        s.b bVar5 = bVar4;
        Class<Integer> cls9 = cls7;
        s.d dVar8 = dVar4;
        s.a aVar5 = aVar3;
        Class<String> cls10 = cls6;
        Context context3 = context;
        registry.d(cls8, InputStream.class, cVar4).d(cls8, ParcelFileDescriptor.class, bVar5).d(cls9, InputStream.class, cVar4).d(cls9, ParcelFileDescriptor.class, bVar5).d(cls9, Uri.class, dVar8).d(cls8, AssetFileDescriptor.class, aVar5).d(cls9, AssetFileDescriptor.class, aVar5).d(cls8, Uri.class, dVar8).d(cls10, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(cls10, InputStream.class, new u.c()).d(cls10, ParcelFileDescriptor.class, new u.b()).d(cls10, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new b.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new c.a(context3)).d(Uri.class, InputStream.class, new d.a(context3));
        int i13 = i12;
        if (i13 >= 29) {
            registry.d(Uri.class, InputStream.class, new e.c(context3));
            registry.d(Uri.class, ParcelFileDescriptor.class, new e.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        s2.a aVar6 = aVar4;
        s2.d dVar9 = dVar5;
        registry.d(Uri.class, InputStream.class, new w.d(contentResolver2)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver2)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver2)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new f.a()).d(Uri.class, File.class, new k.a(context3)).d(l2.g.class, InputStream.class, new a.C0168a()).d(cls11, ByteBuffer.class, new b.a()).d(cls11, InputStream.class, new b.d()).d(Uri.class, Uri.class, v.a.b()).d(Drawable.class, Drawable.class, v.a.b()).c(Drawable.class, Drawable.class, new p2.e()).q(Bitmap.class, BitmapDrawable.class, new s2.b(resources)).q(Bitmap.class, cls11, aVar6).q(Drawable.class, cls11, new s2.c(eVar2, aVar6, dVar9)).q(r2.c.class, cls11, dVar9);
        if (i13 >= 23) {
            i<ByteBuffer, Bitmap> d10 = y.d(eVar);
            registry.c(ByteBuffer.class, Bitmap.class, d10);
            registry.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, d10));
        }
        this.f5564k = new d(context, bVar, registry, new x2.b(), aVar, map, list, jVar, z10, i10);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f5560t) {
            f5560t = true;
            m(context, generatedAppGlideModule);
            f5560t = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b c(Context context) {
        if (f5559s == null) {
            GeneratedAppGlideModule d10 = d(context.getApplicationContext());
            synchronized (b.class) {
                if (f5559s == null) {
                    a(context, d10);
                }
            }
        }
        return f5559s;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e10) {
            q(e10);
        } catch (IllegalAccessException e11) {
            q(e11);
        } catch (NoSuchMethodException e12) {
            q(e12);
        } catch (InvocationTargetException e13) {
            q(e13);
        }
        return null;
    }

    private static l l(Context context) {
        a3.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<u2.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new u2.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d10 = generatedAppGlideModule.d();
            Iterator<u2.b> it = emptyList.iterator();
            while (it.hasNext()) {
                u2.b next = it.next();
                if (d10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (u2.b bVar : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(bVar.getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (u2.b a10 : emptyList) {
            a10.a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a11 = cVar.a(applicationContext);
        for (u2.b next2 : emptyList) {
            try {
                next2.b(applicationContext, a11, a11.f5565l);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e10);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, a11, a11.f5565l);
        }
        applicationContext.registerComponentCallbacks(a11);
        f5559s = a11;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static h t(Context context) {
        return l(context).e(context);
    }

    public void b() {
        a3.k.b();
        this.f5563j.b();
        this.f5562i.b();
        this.f5566m.b();
    }

    public i2.b e() {
        return this.f5566m;
    }

    public i2.e f() {
        return this.f5562i;
    }

    /* access modifiers changed from: package-private */
    public t2.d g() {
        return this.f5568o;
    }

    public Context h() {
        return this.f5564k.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public d i() {
        return this.f5564k;
    }

    public Registry j() {
        return this.f5565l;
    }

    public l k() {
        return this.f5567n;
    }

    /* access modifiers changed from: package-private */
    public void o(h hVar) {
        synchronized (this.f5569p) {
            if (!this.f5569p.contains(hVar)) {
                this.f5569p.add(hVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        b();
    }

    public void onTrimMemory(int i10) {
        r(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean p(x2.d<?> dVar) {
        synchronized (this.f5569p) {
            for (h u10 : this.f5569p) {
                if (u10.u(dVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i10) {
        a3.k.b();
        for (h onTrimMemory : this.f5569p) {
            onTrimMemory.onTrimMemory(i10);
        }
        this.f5563j.a(i10);
        this.f5562i.a(i10);
        this.f5566m.a(i10);
    }

    /* access modifiers changed from: package-private */
    public void s(h hVar) {
        synchronized (this.f5569p) {
            if (this.f5569p.contains(hVar)) {
                this.f5569p.remove(hVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
