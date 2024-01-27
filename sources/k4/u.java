package k4;

import a6.m0;
import c5.e;
import c5.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x4.a;

/* compiled from: GaplessInfoHolder */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f9619c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f9620a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f9621b = -1;

    private boolean b(String str) {
        Matcher matcher = f9619c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) m0.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) m0.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9620a = parseInt;
            this.f9621b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f9620a == -1 || this.f9621b == -1) ? false : true;
    }

    public boolean c(a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof e) {
                e eVar = (e) d10;
                if ("iTunSMPB".equals(eVar.f5242j) && b(eVar.f5243k)) {
                    return true;
                }
            } else if (d10 instanceof j) {
                j jVar = (j) d10;
                if ("com.apple.iTunes".equals(jVar.f5255i) && "iTunSMPB".equals(jVar.f5256j) && b(jVar.f5257k)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f9620a = i11;
        this.f9621b = i12;
        return true;
    }
}
