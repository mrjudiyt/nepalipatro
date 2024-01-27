package r6;

import java.io.IOException;
import java.io.StringWriter;
import y6.c;

/* compiled from: JsonElement */
public abstract class l {
    public i a() {
        if (d()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n b() {
        if (f()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o c() {
        if (g()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean d() {
        return this instanceof i;
    }

    public boolean e() {
        return this instanceof m;
    }

    public boolean f() {
        return this instanceof n;
    }

    public boolean g() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.v0(true);
            t6.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
