package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookContentProvider.kt */
public final class FacebookContentProvider extends ContentProvider {
    private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
    public static final Companion Companion = new Companion((g) null);
    private static final String INVALID_FILE_NAME = "..";
    private static final String TAG = FacebookContentProvider.class.getName();

    /* compiled from: FacebookContentProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getAttachmentUrl(String str, UUID uuid, String str2) {
            m.f(uuid, "callId");
            b0 b0Var = b0.f15559a;
            String format = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{FacebookContentProvider.ATTACHMENT_URL_BASE, str, uuid.toString(), str2}, 4));
            m.e(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }

    public static final String getAttachmentUrl(String str, UUID uuid, String str2) {
        return Companion.getAttachmentUrl(str, uuid, str2);
    }

    private final Pair<UUID, String> parseCallIdAndAttachmentName(Uri uri) {
        try {
            String path = uri.getPath();
            if (path != null) {
                String substring = path.substring(1);
                m.e(substring, "(this as java.lang.String).substring(startIndex)");
                Object[] array = q.c0(substring, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (!INVALID_FILE_NAME.contentEquals(str) && !INVALID_FILE_NAME.contentEquals(str2)) {
                        return new Pair<>(UUID.fromString(str), str2);
                    }
                    throw new Exception();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return 0;
    }

    public String getType(Uri uri) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        m.f(uri, ShareConstants.MEDIA_URI);
        m.f(str, "mode");
        Pair<UUID, String> parseCallIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (parseCallIdAndAttachmentName != null) {
            try {
                NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
                File openAttachment = NativeAppCallAttachmentStore.openAttachment((UUID) parseCallIdAndAttachmentName.first, (String) parseCallIdAndAttachmentName.second);
                if (openAttachment != null) {
                    return ParcelFileDescriptor.open(openAttachment, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e10) {
                m.o("Got unexpected exception:", e10);
                throw e10;
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return 0;
    }
}
