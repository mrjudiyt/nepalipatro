package m5;

import f5.a;
import java.util.Collections;
import java.util.List;

/* compiled from: HlsPlaylist */
public abstract class d implements a<d> {

    /* renamed from: a  reason: collision with root package name */
    public final String f10237a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10239c;

    protected d(String str, List<String> list, boolean z10) {
        this.f10237a = str;
        this.f10238b = Collections.unmodifiableList(list);
        this.f10239c = z10;
    }
}
