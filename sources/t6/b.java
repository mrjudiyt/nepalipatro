package t6;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: $Gson$Types */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f16476a = new Type[0];

    /* compiled from: $Gson$Types */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: h  reason: collision with root package name */
        private final Type f16477h;

        public a(Type type) {
            this.f16477h = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f16477h;
        }

        public int hashCode() {
            return this.f16477h.hashCode();
        }

        public String toString() {
            return b.u(this.f16477h) + "[]";
        }
    }

    /* renamed from: t6.b$b  reason: collision with other inner class name */
    /* compiled from: $Gson$Types */
    private static final class C0282b implements ParameterizedType, Serializable {

        /* renamed from: h  reason: collision with root package name */
        private final Type f16478h;

        /* renamed from: i  reason: collision with root package name */
        private final Type f16479i;

        /* renamed from: j  reason: collision with root package name */
        private final Type[] f16480j;

        public C0282b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                a.a(z10);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = b.b(type);
            }
            this.f16478h = type3;
            this.f16479i = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f16480j = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                a.b(this.f16480j[i10]);
                b.c(this.f16480j[i10]);
                Type[] typeArr3 = this.f16480j;
                typeArr3[i10] = b.b(typeArr3[i10]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f16480j.clone();
        }

        public Type getOwnerType() {
            return this.f16478h;
        }

        public Type getRawType() {
            return this.f16479i;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f16480j) ^ this.f16479i.hashCode()) ^ b.m(this.f16478h);
        }

        public String toString() {
            int length = this.f16480j.length;
            if (length == 0) {
                return b.u(this.f16479i);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.u(this.f16479i));
            sb.append("<");
            sb.append(b.u(this.f16480j[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb.append(", ");
                sb.append(b.u(this.f16480j[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: $Gson$Types */
    private static final class c implements WildcardType, Serializable {

        /* renamed from: h  reason: collision with root package name */
        private final Type f16481h;

        /* renamed from: i  reason: collision with root package name */
        private final Type f16482i;

        public c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z10 = true;
            a.a(typeArr2.length <= 1);
            a.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                a.b(typeArr2[0]);
                b.c(typeArr2[0]);
                a.a(typeArr[0] != cls ? false : z10);
                this.f16482i = b.b(typeArr2[0]);
                this.f16481h = cls;
                return;
            }
            a.b(typeArr[0]);
            b.c(typeArr[0]);
            this.f16482i = null;
            this.f16481h = b.b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f16482i;
            if (type == null) {
                return b.f16476a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f16481h};
        }

        public int hashCode() {
            Type type = this.f16482i;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16481h.hashCode() + 31);
        }

        public String toString() {
            if (this.f16482i != null) {
                return "? super " + b.u(this.f16482i);
            } else if (this.f16481h == Object.class) {
                return "?";
            } else {
                return "? extends " + b.u(this.f16481h);
            }
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0282b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void c(Type type) {
        a.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l10 = l(type, cls, Collection.class);
        if (l10 instanceof WildcardType) {
            l10 = ((WildcardType) l10).getUpperBounds()[0];
        }
        if (l10 instanceof ParameterizedType) {
            return ((ParameterizedType) l10).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (interfaces[i10] == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(interfaces[i10])) {
                    return i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type l10 = l(type, cls, Map.class);
        if (l10 instanceof ParameterizedType) {
            return ((ParameterizedType) l10).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    public static Class<?> k(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            a.a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return k(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        a.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    static int m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType o(Type type, Type type2, Type... typeArr) {
        return new C0282b(type, type2, typeArr);
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = r(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = q(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = a(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = q(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = a(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = q(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008a
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = o(r3, r8, r4)
        L_0x008a:
            return r10
        L_0x008b:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bd
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ab
            r1 = r0[r2]
            java.lang.reflect.Type r8 = q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = t(r8)
            return r8
        L_0x00ab:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = q(r8, r9, r0, r11)     // Catch:{ all -> 0x00be }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = s(r8)
            return r8
        L_0x00bd:
            return r10
        L_0x00be:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d10 = d(typeVariable);
        if (d10 == null) {
            return typeVariable;
        }
        Type i10 = i(type, cls, d10);
        if (!(i10 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i10).getActualTypeArguments()[n(d10.getTypeParameters(), typeVariable)];
    }

    public static WildcardType s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f16476a);
    }

    public static WildcardType t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
