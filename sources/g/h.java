package g;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher */
class h {

    /* renamed from: a  reason: collision with root package name */
    private static Field f8620a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8621b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f8622c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f8623d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f8624e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f8625f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f8626g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f8627h;

    static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            if (i10 >= 24) {
                d(resources);
            } else if (i10 >= 23) {
                c(resources);
            } else if (i10 >= 21) {
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        if (!f8621b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f8620a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8621b = true;
        }
        Field field = f8620a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f8621b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f8620a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8621b = true;
        }
        Object obj = null;
        Field field = f8620a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f8627h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f8626g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8627h = true;
        }
        Field field = f8626g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f8621b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f8620a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f8621b = true;
                }
                Field field2 = f8620a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    private static void e(Object obj) {
        if (!f8623d) {
            try {
                f8622c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f8623d = true;
        }
        Class<?> cls = f8622c;
        if (cls != null) {
            if (!f8625f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f8624e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f8625f = true;
            }
            Field field = f8624e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
