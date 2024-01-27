package a4;

import com.google.auto.value.AutoValue;
import s3.i;
import s3.p;

@AutoValue
/* compiled from: PersistedEvent */
public abstract class k {
    public static k a(long j10, p pVar, i iVar) {
        return new b(j10, pVar, iVar);
    }

    public abstract i b();

    public abstract long c();

    public abstract p d();
}
