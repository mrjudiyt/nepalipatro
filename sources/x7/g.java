package x7;

/* compiled from: HeadersMode */
public enum g {
    SPDY_SYN_STREAM,
    SPDY_REPLY,
    SPDY_HEADERS,
    HTTP_20_HEADERS;

    public boolean a() {
        return this == SPDY_HEADERS;
    }

    public boolean d() {
        return this == SPDY_REPLY;
    }

    public boolean e() {
        return this == SPDY_REPLY || this == SPDY_HEADERS;
    }

    public boolean f() {
        return this == SPDY_SYN_STREAM;
    }
}
