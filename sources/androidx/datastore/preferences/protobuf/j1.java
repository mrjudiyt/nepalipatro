package androidx.datastore.preferences.protobuf;

/* compiled from: TextFormatEscaper */
final class j1 {

    /* compiled from: TextFormatEscaper */
    static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f2832a;

        a(h hVar) {
            this.f2832a = hVar;
        }

        public byte a(int i10) {
            return this.f2832a.b(i10);
        }

        public int size() {
            return this.f2832a.size();
        }
    }

    /* compiled from: TextFormatEscaper */
    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(h hVar) {
        return b(new a(hVar));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte a10 = bVar.a(i10);
            if (a10 == 34) {
                sb.append("\\\"");
            } else if (a10 == 39) {
                sb.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a10 >= 32 && a10 <= 126) {
                            sb.append((char) a10);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            sb.append((char) ((a10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(h.g(str));
    }
}
