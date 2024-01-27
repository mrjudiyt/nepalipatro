package v7;

import java.io.IOException;

/* compiled from: Protocol */
public enum u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: h  reason: collision with root package name */
    private final String f16924h;

    private u(String str) {
        this.f16924h = str;
    }

    public static u a(String str) {
        u uVar = HTTP_1_0;
        if (str.equals(uVar.f16924h)) {
            return uVar;
        }
        u uVar2 = HTTP_1_1;
        if (str.equals(uVar2.f16924h)) {
            return uVar2;
        }
        u uVar3 = HTTP_2;
        if (str.equals(uVar3.f16924h)) {
            return uVar3;
        }
        u uVar4 = SPDY_3;
        if (str.equals(uVar4.f16924h)) {
            return uVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f16924h;
    }
}
