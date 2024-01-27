package c1;

import android.database.Cursor;
import android.os.Build;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f5157a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f5158b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f5159c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f5160d;

    /* compiled from: TableInfo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5161a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5162b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5163c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5164d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5165e;

        /* renamed from: f  reason: collision with root package name */
        public final String f5166f;

        /* renamed from: g  reason: collision with root package name */
        private final int f5167g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f5161a = str;
            this.f5162b = str2;
            this.f5164d = z10;
            this.f5165e = i10;
            this.f5163c = a(str2);
            this.f5166f = str3;
            this.f5167g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f5165e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f5165e != aVar.f5165e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.f5161a.equals(aVar.f5161a) || this.f5164d != aVar.f5164d) {
                return false;
            }
            if (this.f5167g == 1 && aVar.f5167g == 2 && (str3 = this.f5166f) != null && !str3.equals(aVar.f5166f)) {
                return false;
            }
            if (this.f5167g == 2 && aVar.f5167g == 1 && (str2 = aVar.f5166f) != null && !str2.equals(this.f5166f)) {
                return false;
            }
            int i10 = this.f5167g;
            if ((i10 == 0 || i10 != aVar.f5167g || ((str = this.f5166f) == null ? aVar.f5166f == null : str.equals(aVar.f5166f))) && this.f5163c == aVar.f5163c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f5161a.hashCode() * 31) + this.f5163c) * 31) + (this.f5164d ? 1231 : 1237)) * 31) + this.f5165e;
        }

        public String toString() {
            return "Column{name='" + this.f5161a + '\'' + ", type='" + this.f5162b + '\'' + ", affinity='" + this.f5163c + '\'' + ", notNull=" + this.f5164d + ", primaryKeyPosition=" + this.f5165e + ", defaultValue='" + this.f5166f + '\'' + '}';
        }
    }

    /* compiled from: TableInfo */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f5168a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5169b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5170c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f5171d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f5172e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f5168a = str;
            this.f5169b = str2;
            this.f5170c = str3;
            this.f5171d = Collections.unmodifiableList(list);
            this.f5172e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f5168a.equals(bVar.f5168a) && this.f5169b.equals(bVar.f5169b) && this.f5170c.equals(bVar.f5170c) && this.f5171d.equals(bVar.f5171d)) {
                return this.f5172e.equals(bVar.f5172e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f5168a.hashCode() * 31) + this.f5169b.hashCode()) * 31) + this.f5170c.hashCode()) * 31) + this.f5171d.hashCode()) * 31) + this.f5172e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f5168a + '\'' + ", onDelete='" + this.f5169b + '\'' + ", onUpdate='" + this.f5170c + '\'' + ", columnNames=" + this.f5171d + ", referenceColumnNames=" + this.f5172e + '}';
        }
    }

    /* compiled from: TableInfo */
    static class c implements Comparable<c> {

        /* renamed from: h  reason: collision with root package name */
        final int f5173h;

        /* renamed from: i  reason: collision with root package name */
        final int f5174i;

        /* renamed from: j  reason: collision with root package name */
        final String f5175j;

        /* renamed from: k  reason: collision with root package name */
        final String f5176k;

        c(int i10, int i11, String str, String str2) {
            this.f5173h = i10;
            this.f5174i = i11;
            this.f5175j = str;
            this.f5176k = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f5173h - cVar.f5173h;
            return i10 == 0 ? this.f5174i - cVar.f5174i : i10;
        }
    }

    /* compiled from: TableInfo */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f5177a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5178b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f5179c;

        public d(String str, boolean z10, List<String> list) {
            this.f5177a = str;
            this.f5178b = z10;
            this.f5179c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f5178b != dVar.f5178b || !this.f5179c.equals(dVar.f5179c)) {
                return false;
            }
            if (this.f5177a.startsWith("index_")) {
                return dVar.f5177a.startsWith("index_");
            }
            return this.f5177a.equals(dVar.f5177a);
        }

        public int hashCode() {
            int i10;
            if (this.f5177a.startsWith("index_")) {
                i10 = -1184239155;
            } else {
                i10 = this.f5177a.hashCode();
            }
            return (((i10 * 31) + (this.f5178b ? 1 : 0)) * 31) + this.f5179c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f5177a + '\'' + ", unique=" + this.f5178b + ", columns=" + this.f5179c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.f5157a = str;
        this.f5158b = Collections.unmodifiableMap(map);
        this.f5159c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f5160d = set3;
    }

    public static f a(e1.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(e1.b bVar, String str) {
        Cursor X = bVar.X("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (X.getColumnCount() > 0) {
                int columnIndex = X.getColumnIndex("name");
                int columnIndex2 = X.getColumnIndex(ShareConstants.MEDIA_TYPE);
                int columnIndex3 = X.getColumnIndex("notnull");
                int columnIndex4 = X.getColumnIndex("pk");
                int columnIndex5 = X.getColumnIndex("dflt_value");
                while (X.moveToNext()) {
                    String string = X.getString(columnIndex);
                    hashMap.put(string, new a(string, X.getString(columnIndex2), X.getInt(columnIndex3) != 0, X.getInt(columnIndex4), X.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            X.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(e1.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor X = bVar.X("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("id");
            int columnIndex2 = X.getColumnIndex("seq");
            int columnIndex3 = X.getColumnIndex("table");
            int columnIndex4 = X.getColumnIndex("on_delete");
            int columnIndex5 = X.getColumnIndex("on_update");
            List<c> c10 = c(X);
            int count = X.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                X.moveToPosition(i10);
                if (X.getInt(columnIndex2) == 0) {
                    int i11 = X.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c10) {
                        if (next.f5173h == i11) {
                            arrayList.add(next.f5175j);
                            arrayList2.add(next.f5176k);
                        }
                    }
                    hashSet.add(new b(X.getString(columnIndex3), X.getString(columnIndex4), X.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            X.close();
        }
    }

    private static d e(e1.b bVar, String str, boolean z10) {
        Cursor X = bVar.X("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("seqno");
            int columnIndex2 = X.getColumnIndex("cid");
            int columnIndex3 = X.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (X.moveToNext()) {
                        if (X.getInt(columnIndex2) >= 0) {
                            int i10 = X.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i10), X.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z10, arrayList);
                    X.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            X.close();
        }
    }

    private static Set<d> f(e1.b bVar, String str) {
        Cursor X = bVar.X("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("name");
            int columnIndex2 = X.getColumnIndex("origin");
            int columnIndex3 = X.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (X.moveToNext()) {
                        if ("c".equals(X.getString(columnIndex2))) {
                            String string = X.getString(columnIndex);
                            boolean z10 = true;
                            if (X.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            d e10 = e(bVar, string, z10);
                            if (e10 == null) {
                                X.close();
                                return null;
                            }
                            hashSet.add(e10);
                        }
                    }
                    X.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            X.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f5157a;
        if (str == null ? fVar.f5157a != null : !str.equals(fVar.f5157a)) {
            return false;
        }
        Map<String, a> map = this.f5158b;
        if (map == null ? fVar.f5158b != null : !map.equals(fVar.f5158b)) {
            return false;
        }
        Set<b> set2 = this.f5159c;
        if (set2 == null ? fVar.f5159c != null : !set2.equals(fVar.f5159c)) {
            return false;
        }
        Set<d> set3 = this.f5160d;
        if (set3 == null || (set = fVar.f5160d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f5157a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f5158b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f5159c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f5157a + '\'' + ", columns=" + this.f5158b + ", foreignKeys=" + this.f5159c + ", indices=" + this.f5160d + '}';
    }
}
