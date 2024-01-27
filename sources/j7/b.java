package j7;

/* compiled from: Mode */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: h  reason: collision with root package name */
    private final int[] f15409h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15410i;

    private b(int[] iArr, int i10) {
        this.f15409h = iArr;
        this.f15410i = i10;
    }

    public int a() {
        return this.f15410i;
    }

    public int d(c cVar) {
        int f10 = cVar.f();
        return this.f15409h[f10 <= 9 ? 0 : f10 <= 26 ? (char) 1 : 2];
    }
}
