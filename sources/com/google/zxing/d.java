package com.google.zxing;

import b7.b;
import f7.f;
import f7.h;
import f7.j;
import f7.k;
import f7.l;
import f7.o;
import f7.s;
import java.util.Map;

/* compiled from: MultiFormatWriter */
public final class d implements e {

    /* compiled from: MultiFormatWriter */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14099a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.a[] r0 = com.google.zxing.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14099a = r0
                com.google.zxing.a r1 = com.google.zxing.a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.a r1 = com.google.zxing.a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.a r1 = com.google.zxing.a.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.a r1 = com.google.zxing.a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.a r1 = com.google.zxing.a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.a r1 = com.google.zxing.a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.a r1 = com.google.zxing.a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.a r1 = com.google.zxing.a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.a r1 = com.google.zxing.a.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.a r1 = com.google.zxing.a.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.a r1 = com.google.zxing.a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.a r1 = com.google.zxing.a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f14099a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.a r1 = com.google.zxing.a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.d.a.<clinit>():void");
        }
    }

    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        e eVar;
        switch (a.f14099a[aVar.ordinal()]) {
            case 1:
                eVar = new k();
                break;
            case 2:
                eVar = new s();
                break;
            case 3:
                eVar = new j();
                break;
            case 4:
                eVar = new o();
                break;
            case 5:
                eVar = new i7.a();
                break;
            case 6:
                eVar = new f();
                break;
            case 7:
                eVar = new h();
                break;
            case 8:
                eVar = new f7.d();
                break;
            case 9:
                eVar = new l();
                break;
            case 10:
                eVar = new g7.a();
                break;
            case 11:
                eVar = new f7.b();
                break;
            case 12:
                eVar = new d7.a();
                break;
            case 13:
                eVar = new z6.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return eVar.a(str, aVar, i10, i11, map);
    }
}
