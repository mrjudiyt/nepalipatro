package c8;

import android.database.Cursor;
import android.os.Build;
import d8.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Utils */
public class e0 {
    public static List<Object> a(Cursor cursor, int i10) {
        String str;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object b10 = b(cursor, i11);
            if (a.f14160c) {
                String str2 = null;
                if (b10 != null) {
                    if (b10.getClass().isArray()) {
                        str2 = "array(" + b10.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = b10.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i11);
                sb.append(" ");
                sb.append(cursor.getType(i11));
                sb.append(": ");
                sb.append(b10);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
            }
            arrayList.add(b10);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    static Locale d(String str) {
        String str2;
        String str3;
        String[] split = str.split("-");
        String str4 = "";
        if (split.length > 0) {
            String str5 = split[0];
            if (split.length > 1) {
                str3 = split[1];
                if (split.length > 2) {
                    str4 = split[split.length - 1];
                }
                str2 = str4;
            } else {
                str2 = str4;
                str3 = str2;
            }
            str4 = str5;
        } else {
            str2 = str4;
            str3 = str2;
        }
        return new Locale(str4, str3, str2);
    }

    static Locale e(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c(str);
        }
        return d(str);
    }
}
