package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintLayoutStates */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f1709a;

    /* renamed from: b  reason: collision with root package name */
    e f1710b;

    /* renamed from: c  reason: collision with root package name */
    int f1711c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f1712d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f1713e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<e> f1714f = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1715a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f1716b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f1717c = -1;

        /* renamed from: d  reason: collision with root package name */
        e f1718d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.V6) {
                    this.f1715a = obtainStyledAttributes.getResourceId(index, this.f1715a);
                } else if (index == k.W6) {
                    this.f1717c = obtainStyledAttributes.getResourceId(index, this.f1717c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1717c);
                    context.getResources().getResourceName(this.f1717c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1718d = eVar;
                        eVar.e(context, this.f1717c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f1716b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f1716b.size(); i10++) {
                if (this.f1716b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f1719a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f1720b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f1721c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f1722d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f1723e = -1;

        /* renamed from: f  reason: collision with root package name */
        e f1724f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f2010s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2019t7) {
                    this.f1723e = obtainStyledAttributes.getResourceId(index, this.f1723e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1723e);
                    context.getResources().getResourceName(this.f1723e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1724f = eVar;
                        eVar.e(context, this.f1723e);
                    }
                } else if (index == k.f2028u7) {
                    this.f1722d = obtainStyledAttributes.getDimension(index, this.f1722d);
                } else if (index == k.f2037v7) {
                    this.f1720b = obtainStyledAttributes.getDimension(index, this.f1720b);
                } else if (index == k.f2046w7) {
                    this.f1721c = obtainStyledAttributes.getDimension(index, this.f1721c);
                } else if (index == k.f2055x7) {
                    this.f1719a = obtainStyledAttributes.getDimension(index, this.f1719a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f1719a) && f10 < this.f1719a) {
                return false;
            }
            if (!Float.isNaN(this.f1720b) && f11 < this.f1720b) {
                return false;
            }
            if (!Float.isNaN(this.f1721c) && f10 > this.f1721c) {
                return false;
            }
            if (Float.isNaN(this.f1722d) || f11 <= this.f1722d) {
                return true;
            }
            return false;
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f1709a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 3
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 4
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.d$b r1 = new androidx.constraintlayout.widget.d$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.d$a> r1 = r8.f1713e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f1715a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1 && attributeValue.length() > 1) {
                    i10 = Integer.parseInt(attributeValue.substring(1));
                }
                eVar.k(context, xmlPullParser);
                this.f1714f.put(i10, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }

    public void d(int i10, float f10, float f11) {
        e eVar;
        a aVar;
        int b10;
        e eVar2;
        int i11 = this.f1711c;
        if (i11 == i10) {
            if (i10 == -1) {
                aVar = this.f1713e.valueAt(0);
            } else {
                aVar = this.f1713e.get(i11);
            }
            int i12 = this.f1712d;
            if ((i12 == -1 || !aVar.f1716b.get(i12).a(f10, f11)) && this.f1712d != (b10 = aVar.b(f10, f11))) {
                if (b10 == -1) {
                    eVar2 = this.f1710b;
                } else {
                    eVar2 = aVar.f1716b.get(b10).f1724f;
                }
                if (b10 != -1) {
                    int i13 = aVar.f1716b.get(b10).f1723e;
                }
                if (eVar2 != null) {
                    this.f1712d = b10;
                    eVar2.c(this.f1709a);
                    return;
                }
                return;
            }
            return;
        }
        this.f1711c = i10;
        a aVar2 = this.f1713e.get(i10);
        int b11 = aVar2.b(f10, f11);
        if (b11 == -1) {
            eVar = aVar2.f1718d;
        } else {
            eVar = aVar2.f1716b.get(b11).f1724f;
        }
        if (b11 != -1) {
            int i14 = aVar2.f1716b.get(b11).f1723e;
        }
        if (eVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i10);
            sb.append(", dim =");
            sb.append(f10);
            sb.append(", ");
            sb.append(f11);
            return;
        }
        this.f1712d = b11;
        eVar.c(this.f1709a);
    }
}
