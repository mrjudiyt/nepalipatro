package x7;

/* compiled from: ErrorCode */
public enum a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f17122h;

    /* renamed from: i  reason: collision with root package name */
    public final int f17123i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17124j;

    private a(int i10, int i11, int i12) {
        this.f17122h = i10;
        this.f17123i = i11;
        this.f17124j = i12;
    }

    public static a a(int i10) {
        for (a aVar : values()) {
            if (aVar.f17122h == i10) {
                return aVar;
            }
        }
        return null;
    }

    public static a d(int i10) {
        for (a aVar : values()) {
            if (aVar.f17123i == i10) {
                return aVar;
            }
        }
        return null;
    }

    public static a e(int i10) {
        for (a aVar : values()) {
            if (aVar.f17124j == i10) {
                return aVar;
            }
        }
        return null;
    }
}
