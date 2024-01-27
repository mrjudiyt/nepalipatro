package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.i;

/* compiled from: GradientColorInflaterCompat */
final class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s10 = k.s(resources, theme2, attributeSet, i.A);
            float j10 = k.j(s10, xmlPullParser2, "startX", i.J, 0.0f);
            float j11 = k.j(s10, xmlPullParser2, "startY", i.K, 0.0f);
            float j12 = k.j(s10, xmlPullParser2, "endX", i.L, 0.0f);
            float j13 = k.j(s10, xmlPullParser2, "endY", i.M, 0.0f);
            float j14 = k.j(s10, xmlPullParser2, "centerX", i.E, 0.0f);
            float j15 = k.j(s10, xmlPullParser2, "centerY", i.F, 0.0f);
            int k10 = k.k(s10, xmlPullParser2, ShareConstants.MEDIA_TYPE, i.D, 0);
            int f10 = k.f(s10, xmlPullParser2, "startColor", i.B, 0);
            boolean r10 = k.r(xmlPullParser2, "centerColor");
            int f11 = k.f(s10, xmlPullParser2, "centerColor", i.I, 0);
            int f12 = k.f(s10, xmlPullParser2, "endColor", i.C, 0);
            int k11 = k.k(s10, xmlPullParser2, "tileMode", i.H, 0);
            float f13 = j14;
            float j16 = k.j(s10, xmlPullParser2, "gradientRadius", i.G, 0.0f);
            s10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), f10, f12, r10, f11);
            if (k10 == 1) {
                float f14 = f13;
                if (j16 > 0.0f) {
                    int[] iArr = a10.f2287a;
                    return new RadialGradient(f14, j15, j16, iArr, a10.f2288b, d(k11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k10 != 2) {
                return new LinearGradient(j10, j11, j12, j13, a10.f2287a, a10.f2288b, d(k11));
            } else {
                return new SweepGradient(f13, j15, a10.f2287a, a10.f2288b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = y.i.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.s(r9, r12, r11, r3)
            int r5 = y.i.O
            boolean r6 = r3.hasValue(r5)
            int r7 = y.i.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* compiled from: GradientColorInflaterCompat */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2287a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2288b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2287a = new int[size];
            this.f2288b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f2287a[i10] = list.get(i10).intValue();
                this.f2288b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f2287a = new int[]{i10, i11};
            this.f2288b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f2287a = new int[]{i10, i11, i12};
            this.f2288b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
