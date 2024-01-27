package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FileProvider */
public class b extends ContentProvider {

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f2251k = {"_display_name", "_size"};

    /* renamed from: l  reason: collision with root package name */
    private static final File f2252l = new File(RemoteSettings.FORWARD_SLASH_STRING);

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap<String, C0029b> f2253m = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private C0029b f2254h;

    /* renamed from: i  reason: collision with root package name */
    private int f2255i = 0;

    /* renamed from: j  reason: collision with root package name */
    private String f2256j;

    /* compiled from: FileProvider */
    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.b$b  reason: collision with other inner class name */
    /* compiled from: FileProvider */
    interface C0029b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* compiled from: FileProvider */
    static class c implements C0029b {

        /* renamed from: a  reason: collision with root package name */
        private final String f2257a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, File> f2258b = new HashMap<>();

        c(String str) {
            this.f2257a = str;
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2258b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        public Uri b(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f2258b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.f2257a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, RemoteSettings.FORWARD_SLASH_STRING)).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f2258b.put(str, file.getCanonicalFile());
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    static XmlResourceParser d(Context context, String str, ProviderInfo providerInfo, int i10) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i10 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i10);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    private C0029b e() {
        C0029b bVar;
        synchronized (this) {
            if (this.f2254h == null) {
                this.f2254h = f(getContext(), this.f2256j, this.f2255i);
            }
            bVar = this.f2254h;
        }
        return bVar;
    }

    private static C0029b f(Context context, String str, int i10) {
        C0029b bVar;
        HashMap<String, C0029b> hashMap = f2253m;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    bVar = i(context, str, i10);
                    hashMap.put(str, bVar);
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return bVar;
    }

    public static Uri g(Context context, String str, File file) {
        return f(context, str, 0).b(file);
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static C0029b i(Context context, String str, int i10) {
        c cVar = new c(str);
        XmlResourceParser d10 = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = d10.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d10.getName();
                File file = null;
                String attributeValue = d10.getAttributeValue((String) null, "name");
                String attributeValue2 = d10.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f2252l;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] h10 = a.h(context, (String) null);
                    if (h10.length > 0) {
                        file = h10[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] g10 = a.g(context);
                    if (g10.length > 0) {
                        file = g10[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] a10 = a.a(context);
                    if (a10.length > 0) {
                        file = a10[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f2256j = providerInfo.authority.split(";")[0];
            HashMap<String, C0029b> hashMap = f2253m;
            synchronized (hashMap) {
                hashMap.remove(this.f2256j);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return e().a(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.b$b r0 = r2.e()
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0029
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0029
            return r3
        L_0x0029:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.b.getType(android.net.Uri):java.lang.String");
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(e().a(uri), h(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File a10 = e().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f2251k;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? a10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] c10 = c(strArr3, i11);
        Object[] b10 = b(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(c10, 1);
        matrixCursor.addRow(b10);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
