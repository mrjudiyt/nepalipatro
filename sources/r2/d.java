package r2;

import a3.a;
import e2.c;
import e2.g;
import e2.j;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder */
public class d implements j<c> {
    public c b(g gVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean a(h2.c<c> cVar, File file, g gVar) {
        try {
            a.e(cVar.get().c(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
