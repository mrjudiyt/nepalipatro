package l2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e2.g;
import java.io.InputStream;
import l2.n;

/* compiled from: ResourceLoader */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f9943a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f9944b;

    /* compiled from: ResourceLoader */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f9945a;

        public a(Resources resources) {
            this.f9945a = resources;
        }

        public n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f9945a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f9946a;

        public b(Resources resources) {
            this.f9946a = resources;
        }

        public n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f9946a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f9947a;

        public c(Resources resources) {
            this.f9947a = resources;
        }

        public n<Integer, InputStream> a(r rVar) {
            return new s(this.f9947a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f9948a;

        public d(Resources resources) {
            this.f9948a = resources;
        }

        public n<Integer, Uri> a(r rVar) {
            return new s(this.f9948a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f9944b = resources;
        this.f9943a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f9944b.getResourcePackageName(num.intValue()) + '/' + this.f9944b.getResourceTypeName(num.intValue()) + '/' + this.f9944b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            return null;
        }
    }

    /* renamed from: c */
    public n.a<Data> b(Integer num, int i10, int i11, g gVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f9943a.b(d10, i10, i11, gVar);
    }

    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
