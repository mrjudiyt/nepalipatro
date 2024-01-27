package p2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e2.g;
import e2.i;
import h2.c;
import java.util.List;

/* compiled from: ResourceDrawableDecoder */
public class d implements i<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10467a;

    public d(Context context) {
        this.f10467a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f10467a.getPackageName())) {
            return this.f10467a;
        }
        try {
            return this.f10467a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f10467a.getPackageName())) {
                return this.f10467a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public c<Drawable> a(Uri uri, int i10, int i11, g gVar) {
        Context d10 = d(uri, uri.getAuthority());
        return c.e(a.b(this.f10467a, d10, g(d10, uri)));
    }

    /* renamed from: h */
    public boolean b(Uri uri, g gVar) {
        return uri.getScheme().equals("android.resource");
    }
}
