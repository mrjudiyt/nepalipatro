package x5;

import a6.y;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import o5.c;
import o5.e;

/* compiled from: WebvttDecoder */
public final class h extends c {

    /* renamed from: o  reason: collision with root package name */
    private final y f12829o = new y();

    /* renamed from: p  reason: collision with root package name */
    private final c f12830p = new c();

    public h() {
        super("WebvttDecoder");
    }

    private static int B(y yVar) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = yVar.e();
            String o10 = yVar.o();
            if (o10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(o10)) {
                i10 = 2;
            } else {
                i10 = o10.startsWith("NOTE") ? 1 : 3;
            }
        }
        yVar.O(i11);
        return i10;
    }

    private static void C(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.o()));
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        e m10;
        this.f12829o.M(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f12829o);
            do {
            } while (!TextUtils.isEmpty(this.f12829o.o()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f12829o);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f12829o);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f12829o.o();
                        arrayList.addAll(this.f12830p.d(this.f12829o));
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (m10 = f.m(this.f12829o, arrayList)) != null) {
                    arrayList2.add(m10);
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException((Throwable) e10);
        }
    }
}
