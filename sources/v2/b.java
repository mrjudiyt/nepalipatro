package v2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f12312a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f12312a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f12312a;
    }
}
