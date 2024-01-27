package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.m;

/* compiled from: NativeAppCallAttachmentStore.kt */
public final class NativeAppCallAttachmentStore {
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();
    private static File attachmentsDirectory;

    /* compiled from: NativeAppCallAttachmentStore.kt */
    public static final class Attachment {
        private final String attachmentName;
        private final String attachmentUrl;
        private final Bitmap bitmap;
        private final UUID callId;
        private boolean isContentUri;
        private final Uri originalUri;
        private boolean shouldCreateFile;

        public Attachment(UUID uuid, Bitmap bitmap2, Uri uri) {
            String str;
            m.f(uuid, "callId");
            this.callId = uuid;
            this.bitmap = bitmap2;
            this.originalUri = uri;
            String str2 = null;
            boolean z10 = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (p.m(FirebaseAnalytics.Param.CONTENT, scheme, true)) {
                    this.isContentUri = true;
                    String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || p.v(authority, ShareConstants.WEB_DIALOG_PARAM_MEDIA, false, 2, (Object) null)) ? false : z10;
                } else if (p.m("file", uri.getScheme(), true)) {
                    this.shouldCreateFile = true;
                } else {
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isWebUri(uri)) {
                        throw new FacebookException(m.o("Unsupported scheme for media Uri : ", scheme));
                    }
                }
            } else if (bitmap2 != null) {
                this.shouldCreateFile = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            str2 = this.shouldCreateFile ? UUID.randomUUID().toString() : str2;
            this.attachmentName = str2;
            if (!this.shouldCreateFile) {
                str = String.valueOf(uri);
            } else {
                FacebookContentProvider.Companion companion = FacebookContentProvider.Companion;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                str = companion.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, str2);
            }
            this.attachmentUrl = str;
        }

        public final String getAttachmentName() {
            return this.attachmentName;
        }

        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final UUID getCallId() {
            return this.callId;
        }

        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final boolean isContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z10) {
            this.isContentUri = z10;
        }

        public final void setShouldCreateFile(boolean z10) {
            this.shouldCreateFile = z10;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    public static final void addAttachments(Collection<Attachment> collection) {
        if (collection != null && !collection.isEmpty()) {
            if (attachmentsDirectory == null) {
                cleanupAllAttachments();
            }
            ensureAttachmentsDirectoryExists();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                for (Attachment next : collection) {
                    if (next.getShouldCreateFile()) {
                        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = INSTANCE;
                        File attachmentFile = getAttachmentFile(next.getCallId(), next.getAttachmentName(), true);
                        if (attachmentFile != null) {
                            arrayList.add(attachmentFile);
                            if (next.getBitmap() != null) {
                                nativeAppCallAttachmentStore.processAttachmentBitmap(next.getBitmap(), attachmentFile);
                            } else if (next.getOriginalUri() != null) {
                                nativeAppCallAttachmentStore.processAttachmentFile(next.getOriginalUri(), next.isContentUri(), attachmentFile);
                            }
                        }
                    }
                }
            } catch (IOException e10) {
                m.o("Got unexpected exception:", e10);
                for (File file : arrayList) {
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                throw new FacebookException((Throwable) e10);
            }
        }
    }

    public static final void cleanupAllAttachments() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            boolean unused = j.g(attachmentsDirectory2);
        }
    }

    public static final void cleanupAttachmentsForCall(UUID uuid) {
        m.f(uuid, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, false);
        if (attachmentsDirectoryForCall != null) {
            boolean unused = j.g(attachmentsDirectoryForCall);
        }
    }

    public static final Attachment createAttachment(UUID uuid, Bitmap bitmap) {
        m.f(uuid, "callId");
        m.f(bitmap, "attachmentBitmap");
        return new Attachment(uuid, bitmap, (Uri) null);
    }

    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    public static final File getAttachmentFile(UUID uuid, String str, boolean z10) {
        m.f(uuid, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, z10);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File getAttachmentsDirectory() {
        File file;
        synchronized (NativeAppCallAttachmentStore.class) {
            if (attachmentsDirectory == null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
            }
            file = attachmentsDirectory;
        }
        return file;
    }

    public static final File getAttachmentsDirectoryForCall(UUID uuid, boolean z10) {
        m.f(uuid, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, uuid.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File openAttachment(UUID uuid, String str) {
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return getAttachmentFile(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void processAttachmentBitmap(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility utility = Utility.INSTANCE;
            Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(Uri uri, boolean z10, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (!z10) {
            try {
                inputStream = new FileInputStream(uri.getPath());
            } catch (Throwable th) {
                Utility utility = Utility.INSTANCE;
                Utility.closeQuietly(fileOutputStream);
                throw th;
            }
        } else {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            inputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
        }
        Utility utility2 = Utility.INSTANCE;
        Utility.copyAndCloseInputStream(inputStream, fileOutputStream);
        Utility.closeQuietly(fileOutputStream);
    }

    public static final Attachment createAttachment(UUID uuid, Uri uri) {
        m.f(uuid, "callId");
        m.f(uri, "attachmentUri");
        return new Attachment(uuid, (Bitmap) null, uri);
    }
}
