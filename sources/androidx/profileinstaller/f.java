package androidx.profileinstaller;

/* compiled from: FileSectionType */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: h  reason: collision with root package name */
    private final long f3944h;

    private f(long j10) {
        this.f3944h = j10;
    }

    public long d() {
        return this.f3944h;
    }
}
