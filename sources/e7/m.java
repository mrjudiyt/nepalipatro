package e7;

/* compiled from: TextEncoder */
final class m extends c {
    m() {
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb) {
        if (c10 == ' ') {
            sb.append(3);
            return 1;
        } else if (c10 >= '0' && c10 <= '9') {
            sb.append((char) ((c10 - '0') + 4));
            return 1;
        } else if (c10 >= 'a' && c10 <= 'z') {
            sb.append((char) ((c10 - 'a') + 14));
            return 1;
        } else if (c10 < ' ') {
            sb.append(0);
            sb.append(c10);
            return 2;
        } else if (c10 >= '!' && c10 <= '/') {
            sb.append(1);
            sb.append((char) (c10 - '!'));
            return 2;
        } else if (c10 >= ':' && c10 <= '@') {
            sb.append(1);
            sb.append((char) ((c10 - ':') + 15));
            return 2;
        } else if (c10 >= '[' && c10 <= '_') {
            sb.append(1);
            sb.append((char) ((c10 - '[') + 22));
            return 2;
        } else if (c10 == '`') {
            sb.append(2);
            sb.append((char) (c10 - '`'));
            return 2;
        } else if (c10 >= 'A' && c10 <= 'Z') {
            sb.append(2);
            sb.append((char) ((c10 - 'A') + 1));
            return 2;
        } else if (c10 < '{' || c10 > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c10 - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) ((c10 - '{') + 27));
            return 2;
        }
    }

    public int e() {
        return 2;
    }
}
