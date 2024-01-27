package com.google.android.gms.internal.play_billing;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class zzdh {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzdf zzdf, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzdf, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i10, str, zzb2);
            }
        } else {
            sb.append(10);
            zzc(i10, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzee.zza(new zzax(((String) obj).getBytes(zzcg.zzb))));
                sb.append('\"');
            } else if (obj instanceof zzba) {
                sb.append(": \"");
                sb.append(zzee.zza((zzba) obj));
                sb.append('\"');
            } else if (obj instanceof zzcb) {
                sb.append(" {");
                zzd((zzcb) obj, sb, i10 + 2);
                sb.append("\n");
                zzc(i10, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                zzb(sb, i12, Constants.KEY, entry.getKey());
                zzb(sb, i12, "value", entry.getValue());
                sb.append("\n");
                zzc(i10, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzdf zzdf, StringBuilder sb, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzdf zzdf2 = zzdf;
        StringBuilder sb2 = sb;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzdf.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i12, substring.substring(0, substring.length() - 4), zzcb.zzl(method2, zzdf2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i12, substring.substring(0, substring.length() - 3), zzcb.zzl(method, zzdf2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzl = zzcb.zzl(method4, zzdf2, new Object[0]);
                    if (method5 == null) {
                        if (zzl instanceof Boolean) {
                            if (!((Boolean) zzl).booleanValue()) {
                            }
                        } else if (zzl instanceof Integer) {
                            if (((Integer) zzl).intValue() == 0) {
                            }
                        } else if (zzl instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzl).floatValue()) == 0) {
                            }
                        } else if (!(zzl instanceof Double)) {
                            if (zzl instanceof String) {
                                z10 = zzl.equals("");
                            } else if (zzl instanceof zzba) {
                                z10 = zzl.equals(zzba.zzb);
                            } else if (zzl instanceof zzdf) {
                                if (zzl == ((zzdf) zzl).zzf()) {
                                }
                            } else if ((zzl instanceof Enum) && ((Enum) zzl).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzl).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzcb.zzl(method5, zzdf2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i12, substring, zzl);
                }
            }
            i11 = 3;
        }
        if (!(zzdf2 instanceof zzby)) {
            zzeh zzeh = ((zzcb) zzdf2).zzc;
            if (zzeh != null) {
                zzeh.zzi(sb2, i12);
                return;
            }
            return;
        }
        zzby zzby = (zzby) zzdf2;
        throw null;
    }
}
