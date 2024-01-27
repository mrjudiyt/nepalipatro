package x5;

import a6.m0;
import a6.y;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import o5.a;
import o5.c;
import o5.e;

/* compiled from: Mp4WebvttDecoder */
public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    private final y f12779o = new y();

    public a() {
        super("Mp4WebvttDecoder");
    }

    private static o5.a B(y yVar, int i10) {
        CharSequence charSequence = null;
        a.b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int m10 = yVar.m();
                int m11 = yVar.m();
                int i11 = m10 - 8;
                String E = m0.E(yVar.d(), yVar.e(), i11);
                yVar.P(i11);
                i10 = (i10 - 8) - i11;
                if (m11 == 1937011815) {
                    bVar = f.o(E);
                } else if (m11 == 1885436268) {
                    charSequence = f.q((String) null, E.trim(), Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.n(charSequence).a();
        }
        return f.l(charSequence);
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        this.f12779o.M(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f12779o.a() > 0) {
            if (this.f12779o.a() >= 8) {
                int m10 = this.f12779o.m();
                if (this.f12779o.m() == 1987343459) {
                    arrayList.add(B(this.f12779o, m10 - 8));
                } else {
                    this.f12779o.P(m10 - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
