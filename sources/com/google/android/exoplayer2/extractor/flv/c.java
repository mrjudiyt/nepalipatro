package com.google.android.exoplayer2.extractor.flv;

import a6.y;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.h;

/* compiled from: ScriptTagPayloadReader */
final class c extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    private long f6646b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f6647c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f6648d = new long[0];

    public c() {
        super(new h());
    }

    private static Boolean g(y yVar) {
        boolean z10 = true;
        if (yVar.C() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Object h(y yVar, int i10) {
        if (i10 == 0) {
            return j(yVar);
        }
        if (i10 == 1) {
            return g(yVar);
        }
        if (i10 == 2) {
            return n(yVar);
        }
        if (i10 == 3) {
            return l(yVar);
        }
        if (i10 == 8) {
            return k(yVar);
        }
        if (i10 == 10) {
            return m(yVar);
        }
        if (i10 != 11) {
            return null;
        }
        return i(yVar);
    }

    private static Date i(y yVar) {
        Date date = new Date((long) j(yVar).doubleValue());
        yVar.P(2);
        return date;
    }

    private static Double j(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.v()));
    }

    private static HashMap<String, Object> k(y yVar) {
        int G = yVar.G();
        HashMap<String, Object> hashMap = new HashMap<>(G);
        for (int i10 = 0; i10 < G; i10++) {
            String n10 = n(yVar);
            Object h10 = h(yVar, o(yVar));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(y yVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(yVar);
            int o10 = o(yVar);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(yVar, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList<Object> m(y yVar) {
        int G = yVar.G();
        ArrayList<Object> arrayList = new ArrayList<>(G);
        for (int i10 = 0; i10 < G; i10++) {
            Object h10 = h(yVar, o(yVar));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(y yVar) {
        int I = yVar.I();
        int e10 = yVar.e();
        yVar.P(I);
        return new String(yVar.d(), e10, I);
    }

    private static int o(y yVar) {
        return yVar.C();
    }

    /* access modifiers changed from: protected */
    public boolean b(y yVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(y yVar, long j10) {
        if (o(yVar) != 2 || !"onMetaData".equals(n(yVar)) || o(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> k10 = k(yVar);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f6646b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6647c = new long[size];
                this.f6648d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6647c = new long[0];
                        this.f6648d = new long[0];
                    } else {
                        this.f6647c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f6648d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f6647c = new long[0];
                this.f6648d = new long[0];
            }
        }
        return false;
    }

    public long d() {
        return this.f6646b;
    }

    public long[] e() {
        return this.f6648d;
    }

    public long[] f() {
        return this.f6647c;
    }
}
