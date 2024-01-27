package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: MessageLiteToString */
final class r0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof h) {
                return obj.equals(h.f2754i);
            }
            if (obj instanceof p0) {
                if (obj == ((p0) obj).a()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    static final void c(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c10 : (List) obj) {
                c(sb, i10, str, c10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c11 : ((Map) obj).entrySet()) {
                c(sb, i10, str, c11);
            }
        } else {
            sb.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(j1.c((String) obj));
                sb.append('\"');
            } else if (obj instanceof h) {
                sb.append(": \"");
                sb.append(j1.a((h) obj));
                sb.append('\"');
            } else if (obj instanceof x) {
                sb.append(" {");
                d((x) obj, sb, i10 + 2);
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                c(sb, i13, Constants.KEY, entry.getKey());
                c(sb, i13, "value", entry.getValue());
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static void d(p0 p0Var, StringBuilder sb, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : p0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i10, a(str2), x.z(method2, p0Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i10, a(str3), x.z(method3, p0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object z11 = x.z(method4, p0Var, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) x.z(method5, p0Var, new Object[0])).booleanValue();
                    } else if (b(z11)) {
                        z10 = false;
                    }
                    if (z10) {
                        c(sb, i10, a(str4), z11);
                    }
                }
            }
        }
        if (p0Var instanceof x.c) {
            Iterator<Map.Entry<x.d, Object>> s10 = ((x.c) p0Var).extensions.s();
            while (s10.hasNext()) {
                Map.Entry next = s10.next();
                c(sb, i10, "[" + ((x.d) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        l1 l1Var = ((x) p0Var).unknownFields;
        if (l1Var != null) {
            l1Var.m(sb, i10);
        }
    }

    static String e(p0 p0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(p0Var, sb, 0);
        return sb.toString();
    }
}
