package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends j {
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e i10 : list) {
            hashMap.putAll(i10.i());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
