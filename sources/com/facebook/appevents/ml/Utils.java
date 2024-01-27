package com.facebook.appevents.ml;

import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import g9.d;
import g9.f;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Utils.kt */
public final class Utils {
    private static final String DIR_NAME = "facebook_ml/";
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final File getMlDir() {
        Class<Utils> cls = Utils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final Map<String, MTensor> parseModelWeights(File file) {
        Map<String, MTensor> map;
        File file2 = file;
        Class<Utils> cls = Utils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(file2, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i10 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = wrap.getInt();
                int i12 = i11 + 4;
                if (available < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, d.f14759b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i13 = length - 1;
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        strArr[i14] = names.getString(i14);
                        if (i15 > i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                j.j(strArr);
                HashMap hashMap = new HashMap();
                int i16 = 0;
                while (i16 < length) {
                    String str = strArr[i16];
                    i16++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i17 = length2 - 1;
                        int i18 = 1;
                        if (i17 >= 0) {
                            while (true) {
                                int i19 = i10 + 1;
                                try {
                                    iArr[i10] = jSONArray.getInt(i10);
                                    i18 *= iArr[i10];
                                    if (i19 > i17) {
                                        break;
                                    }
                                    i10 = i19;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    map = null;
                                    CrashShieldHandler.handleThrowable(th, cls);
                                    return map;
                                }
                            }
                        }
                        int i20 = i18 * 4;
                        int i21 = i12 + i20;
                        if (i21 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i12, i20);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        wrap2.asFloatBuffer().get(mTensor.getData(), 0, i18);
                        hashMap.put(str, mTensor);
                        i12 = i21;
                        i10 = 0;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
            CrashShieldHandler.handleThrowable(th, cls);
            return map;
        }
    }

    public final String normalizeString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i10 > length) {
                    break;
                }
                boolean z11 = m.h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new f("\\s+").c(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                m.e(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int[] vectorize(String str, int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(str, "texts");
            int[] iArr = new int[i10];
            String normalizeString = normalizeString(str);
            Charset forName = Charset.forName("UTF-8");
            m.e(forName, "forName(\"UTF-8\")");
            if (normalizeString != null) {
                byte[] bytes = normalizeString.getBytes(forName);
                m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                if (i10 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i11 < bytes.length) {
                            iArr[i11] = bytes[i11] & 255;
                        } else {
                            iArr[i11] = 0;
                        }
                        if (i12 >= i10) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
