package b6;

import a6.y;

/* compiled from: DolbyVisionConfig */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5019a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5020b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5021c;

    private c(int i10, int i11, String str) {
        this.f5019a = i10;
        this.f5020b = i11;
        this.f5021c = str;
    }

    public static c a(y yVar) {
        String str;
        yVar.P(2);
        int C = yVar.C();
        int i10 = C >> 1;
        int C2 = ((yVar.C() >> 3) & 31) | ((C & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = C2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(str2);
        sb.append(C2);
        return new c(i10, C2, sb.toString());
    }
}
