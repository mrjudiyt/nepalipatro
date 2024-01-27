package androidx.work;

/* compiled from: InputMergerFactory */
public abstract class k {

    /* compiled from: InputMergerFactory */
    class a extends k {
        a() {
        }

        public j a(String str) {
            return null;
        }
    }

    public static k c() {
        return new a();
    }

    public abstract j a(String str);

    public final j b(String str) {
        j a10 = a(str);
        return a10 == null ? j.a(str) : a10;
    }
}
