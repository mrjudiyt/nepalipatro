package r6;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy */
public enum d implements e {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String a(Field field) {
            return d.f(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String a(Field field) {
            return d.f(d.e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return d.e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String a(Field field) {
            return d.e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String a(Field field) {
            return d.e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    private static String d(char c10, String str, int i10) {
        if (i10 >= str.length()) {
            return String.valueOf(c10);
        }
        return c10 + str.substring(i10);
    }

    static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String f(String str) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(d(Character.toUpperCase(charAt), str, i10 + 1));
        return sb.toString();
    }
}
