package k0;

import android.content.res.AssetManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: ExifInterface */
public class a {
    static final String[] A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] B = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] C = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final c[] D;
    private static final c[] E;
    private static final c[] F;
    private static final c[] G;
    private static final c[] H;
    private static final c I = new c("StripOffsets", 273, 3);
    private static final c[] J;
    private static final c[] K;
    private static final c[] L;
    private static final c[] M;
    static final c[][] N;
    private static final c[] O = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    private static final c P = new c("JPEGInterchangeFormat", 513, 4);
    private static final c Q = new c("JPEGInterchangeFormatLength", 514, 4);
    private static final HashMap<Integer, c>[] R;
    private static final HashMap<String, c>[] S;
    private static final HashSet<String> T = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap<Integer, Integer> U = new HashMap<>();
    static final Charset V;
    static final byte[] W;
    private static final Pattern X = Pattern.compile(".*[1-9].*");
    private static final Pattern Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: r  reason: collision with root package name */
    private static final List<Integer> f9446r = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: s  reason: collision with root package name */
    private static final List<Integer> f9447s = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f9448t = {8, 8, 8};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f9449u = {4};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f9450v = {8};

    /* renamed from: w  reason: collision with root package name */
    static final byte[] f9451w = {-1, -40, -1};

    /* renamed from: x  reason: collision with root package name */
    private static final byte[] f9452x = {79, 76, 89, 77, 80, 0};

    /* renamed from: y  reason: collision with root package name */
    private static final byte[] f9453y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: z  reason: collision with root package name */
    private static SimpleDateFormat f9454z;

    /* renamed from: a  reason: collision with root package name */
    private final String f9455a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager.AssetInputStream f9456b;

    /* renamed from: c  reason: collision with root package name */
    private int f9457c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, b>[] f9458d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f9459e;

    /* renamed from: f  reason: collision with root package name */
    private ByteOrder f9460f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9461g;

    /* renamed from: h  reason: collision with root package name */
    private int f9462h;

    /* renamed from: i  reason: collision with root package name */
    private int f9463i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f9464j;

    /* renamed from: k  reason: collision with root package name */
    private int f9465k;

    /* renamed from: l  reason: collision with root package name */
    private int f9466l;

    /* renamed from: m  reason: collision with root package name */
    private int f9467m;

    /* renamed from: n  reason: collision with root package name */
    private int f9468n;

    /* renamed from: o  reason: collision with root package name */
    private int f9469o;

    /* renamed from: p  reason: collision with root package name */
    private int f9470p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9471q;

    /* compiled from: ExifInterface */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9478a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9479b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f9480c;

        b(int i10, int i11, byte[] bArr) {
            this.f9478a = i10;
            this.f9479b = i11;
            this.f9480c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + 0).getBytes(a.V);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static b c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.B[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b d(d dVar, ByteOrder byteOrder) {
            return e(new d[]{dVar}, byteOrder);
        }

        public static b e(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.B[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.f9485a);
                wrap.putInt((int) dVar.f9486b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static b g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.B[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k10 instanceof String) {
                return Double.parseDouble((String) k10);
            } else {
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof double[]) {
                    double[] dArr = (double[]) k10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof d[]) {
                    d[] dVarArr = (d[]) k10;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int i(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k10 instanceof String) {
                return Integer.parseInt((String) k10);
            } else {
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String j(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                return null;
            }
            if (k10 instanceof String) {
                return (String) k10;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (k10 instanceof long[]) {
                long[] jArr = (long[]) k10;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k10 instanceof int[]) {
                int[] iArr = (int[]) k10;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k10 instanceof double[]) {
                double[] dArr = (double[]) k10;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k10 instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) k10;
                while (i10 < dVarArr.length) {
                    sb.append(dVarArr[i10].f9485a);
                    sb.append('/');
                    sb.append(dVarArr[i10].f9486b);
                    i10++;
                    if (i10 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x014b A[SYNTHETIC, Splitter:B:140:0x014b] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0152 A[SYNTHETIC, Splitter:B:148:0x0152] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object k(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                k0.a$a r1 = new k0.a$a     // Catch:{ IOException -> 0x014f, all -> 0x0148 }
                byte[] r2 = r8.f9480c     // Catch:{ IOException -> 0x014f, all -> 0x0148 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x014f, all -> 0x0148 }
                r1.q(r9)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r9 = r8.f9478a     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r2 = 1
                r3 = 0
                switch(r9) {
                    case 1: goto L_0x0117;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0117;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x0012:
                goto L_0x0141
            L_0x0014:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x0018:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x0025
                double r4 = r1.readDouble()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r4     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x002d:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x003b
                float r2 = r1.readFloat()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                double r4 = (double) r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r4     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                k0.a$d[] r9 = new k0.a.d[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x0043:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x005b
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                long r4 = (long) r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                long r6 = (long) r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                k0.a$d r2 = new k0.a$d     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x0063:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x0070
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x0078:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x0085
                short r2 = r1.readShort()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                k0.a$d[] r9 = new k0.a.d[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x008d:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x00a3
                long r4 = r1.h()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                long r6 = r1.h()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                k0.a$d r2 = new k0.a$d     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x00ab:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x00b8
                long r4 = r1.h()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r4     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x00c0:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x00cd
                int r2 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9[r3] = r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r3 = r3 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                byte[] r4 = k0.a.C     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r4 = r4.length     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r9 < r4) goto L_0x00ee
                r9 = 0
            L_0x00d9:
                byte[] r4 = k0.a.C     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r5 = r4.length     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r9 >= r5) goto L_0x00eb
                byte[] r5 = r8.f9480c     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                byte r6 = r4[r9]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r5 == r6) goto L_0x00e8
                r2 = 0
                goto L_0x00eb
            L_0x00e8:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00eb:
                if (r2 == 0) goto L_0x00ee
                int r3 = r4.length     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x00ee:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9.<init>()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x00f3:
                int r2 = r8.f9479b     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r3 >= r2) goto L_0x010f
                byte[] r2 = r8.f9480c     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                byte r2 = r2[r3]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r2 != 0) goto L_0x00fe
                goto L_0x010f
            L_0x00fe:
                r4 = 32
                if (r2 < r4) goto L_0x0107
                char r2 = (char) r2     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r9.append(r2)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                goto L_0x010c
            L_0x0107:
                r2 = 63
                r9.append(r2)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
            L_0x010c:
                int r3 = r3 + 1
                goto L_0x00f3
            L_0x010f:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r1.close()     // Catch:{ IOException -> 0x0116 }
            L_0x0116:
                return r9
            L_0x0117:
                byte[] r9 = r8.f9480c     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r4 = r9.length     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r4 != r2) goto L_0x0136
                byte r4 = r9[r3]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r4 < 0) goto L_0x0136
                byte r4 = r9[r3]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                if (r4 > r2) goto L_0x0136
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                char[] r2 = new char[r2]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                byte r9 = r9[r3]     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                int r9 = r9 + 48
                char r9 = (char) r9     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r2[r3] = r9     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r4.<init>(r2)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r1.close()     // Catch:{ IOException -> 0x0135 }
            L_0x0135:
                return r4
            L_0x0136:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                java.nio.charset.Charset r3 = k0.a.V     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r2.<init>(r9, r3)     // Catch:{ IOException -> 0x0150, all -> 0x0145 }
                r1.close()     // Catch:{ IOException -> 0x0140 }
            L_0x0140:
                return r2
            L_0x0141:
                r1.close()     // Catch:{ IOException -> 0x0144 }
            L_0x0144:
                return r0
            L_0x0145:
                r9 = move-exception
                r0 = r1
                goto L_0x0149
            L_0x0148:
                r9 = move-exception
            L_0x0149:
                if (r0 == 0) goto L_0x014e
                r0.close()     // Catch:{ IOException -> 0x014e }
            L_0x014e:
                throw r9
            L_0x014f:
                r1 = r0
            L_0x0150:
                if (r1 == 0) goto L_0x0155
                r1.close()     // Catch:{ IOException -> 0x0155 }
            L_0x0155:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.a.b.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.A[this.f9478a] + ", data length:" + this.f9480c.length + ")";
        }
    }

    /* compiled from: ExifInterface */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f9485a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9486b;

        d(long j10, long j11) {
            if (j11 == 0) {
                this.f9485a = 0;
                this.f9486b = 1;
                return;
            }
            this.f9485a = j10;
            this.f9486b = j11;
        }

        public double a() {
            return ((double) this.f9485a) / ((double) this.f9486b);
        }

        public String toString() {
            return this.f9485a + RemoteSettings.FORWARD_SLASH_STRING + this.f9486b;
        }
    }

    static {
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        D = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        E = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        F = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        G = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        H = cVarArr5;
        c[] cVarArr6 = {new c("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        J = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        K = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        L = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        M = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        N = cVarArr10;
        R = new HashMap[cVarArr10.length];
        S = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        V = forName;
        W = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f9454z = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            c[][] cVarArr11 = N;
            if (i10 < cVarArr11.length) {
                R[i10] = new HashMap<>();
                S[i10] = new HashMap<>();
                for (c cVar : cVarArr11[i10]) {
                    R[i10].put(Integer.valueOf(cVar.f9481a), cVar);
                    S[i10].put(cVar.f9482b, cVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = U;
                c[] cVarArr12 = O;
                hashMap.put(Integer.valueOf(cVarArr12[0].f9481a), 5);
                hashMap.put(Integer.valueOf(cVarArr12[1].f9481a), 1);
                hashMap.put(Integer.valueOf(cVarArr12[2].f9481a), 2);
                hashMap.put(Integer.valueOf(cVarArr12[3].f9481a), 3);
                hashMap.put(Integer.valueOf(cVarArr12[4].f9481a), 7);
                hashMap.put(Integer.valueOf(cVarArr12[5].f9481a), 8);
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        c[][] cVarArr = N;
        this.f9458d = new HashMap[cVarArr.length];
        this.f9459e = new HashSet(cVarArr.length);
        if (inputStream != null) {
            this.f9455a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f9456b = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f9456b = null;
            }
            t(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    private void A(int i10, int i11) {
        if (!this.f9458d[i10].isEmpty() && !this.f9458d[i11].isEmpty()) {
            b bVar = this.f9458d[i10].get("ImageLength");
            b bVar2 = this.f9458d[i10].get("ImageWidth");
            b bVar3 = this.f9458d[i11].get("ImageLength");
            b bVar4 = this.f9458d[i11].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i12 = bVar.i(this.f9460f);
                int i13 = bVar2.i(this.f9460f);
                int i14 = bVar3.i(this.f9460f);
                int i15 = bVar4.i(this.f9460f);
                if (i12 < i14 && i13 < i15) {
                    HashMap<String, b>[] hashMapArr = this.f9458d;
                    HashMap<String, b> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            }
        }
    }

    private void B(C0155a aVar, int i10) {
        b bVar;
        b bVar2;
        b bVar3 = this.f9458d[i10].get("DefaultCropSize");
        b bVar4 = this.f9458d[i10].get("SensorTopBorder");
        b bVar5 = this.f9458d[i10].get("SensorLeftBorder");
        b bVar6 = this.f9458d[i10].get("SensorBottomBorder");
        b bVar7 = this.f9458d[i10].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f9478a == 5) {
                d[] dVarArr = (d[]) bVar3.k(this.f9460f);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(dVarArr));
                    return;
                }
                bVar2 = b.d(dVarArr[0], this.f9460f);
                bVar = b.d(dVarArr[1], this.f9460f);
            } else {
                int[] iArr = (int[]) bVar3.k(this.f9460f);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(iArr));
                    return;
                }
                bVar2 = b.f(iArr[0], this.f9460f);
                bVar = b.f(iArr[1], this.f9460f);
            }
            this.f9458d[i10].put("ImageWidth", bVar2);
            this.f9458d[i10].put("ImageLength", bVar);
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            y(aVar, i10);
        } else {
            int i11 = bVar4.i(this.f9460f);
            int i12 = bVar6.i(this.f9460f);
            int i13 = bVar7.i(this.f9460f);
            int i14 = bVar5.i(this.f9460f);
            if (i12 > i11 && i13 > i14) {
                b f10 = b.f(i12 - i11, this.f9460f);
                b f11 = b.f(i13 - i14, this.f9460f);
                this.f9458d[i10].put("ImageLength", f10);
                this.f9458d[i10].put("ImageWidth", f11);
            }
        }
    }

    private void C(InputStream inputStream) {
        A(0, 5);
        A(0, 4);
        A(5, 4);
        b bVar = this.f9458d[1].get("PixelXDimension");
        b bVar2 = this.f9458d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f9458d[0].put("ImageWidth", bVar);
            this.f9458d[0].put("ImageLength", bVar2);
        }
        if (this.f9458d[4].isEmpty() && s(this.f9458d[5])) {
            HashMap<String, b>[] hashMapArr = this.f9458d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        s(this.f9458d[4]);
    }

    private void a() {
        String c10 = c("DateTimeOriginal");
        if (c10 != null && c("DateTime") == null) {
            this.f9458d[0].put("DateTime", b.a(c10));
        }
        if (c("ImageWidth") == null) {
            this.f9458d[0].put("ImageWidth", b.b(0, this.f9460f));
        }
        if (c("ImageLength") == null) {
            this.f9458d[0].put("ImageLength", b.b(0, this.f9460f));
        }
        if (c("Orientation") == null) {
            this.f9458d[0].put("Orientation", b.b(0, this.f9460f));
        }
        if (c("LightSource") == null) {
            this.f9458d[1].put("LightSource", b.b(0, this.f9460f));
        }
    }

    private static long[] b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private b e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < N.length; i10++) {
            b bVar = this.f9458d[i10].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(k0.a.C0155a r10, int r11, int r12) {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.q(r0)
            long r0 = (long) r11
            r10.j(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, k0.a$b>[] r0 = r9.f9458d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f9460f
            k0.a$b r5 = k0.a.b.b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, k0.a$b>[] r0 = r9.f9458d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f9460f
            k0.a$b r5 = k0.a.b.b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.c(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, k0.a$b>[] r5 = r9.f9458d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = V
            r7.<init>(r0, r8)
            k0.a$b r0 = k0.a.b.a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = W
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f9466l = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.w(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f9460f
            r10.q(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.f(k0.a$a, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (n(bArr)) {
            return 4;
        }
        if (p(bArr)) {
            return 9;
        }
        if (o(bArr)) {
            return 7;
        }
        return q(bArr) ? 10 : 0;
    }

    private void h(C0155a aVar) {
        j(aVar);
        b bVar = this.f9458d[1].get("MakerNote");
        if (bVar != null) {
            C0155a aVar2 = new C0155a(bVar.f9480c);
            aVar2.q(this.f9460f);
            byte[] bArr = f9452x;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.j(0);
            byte[] bArr3 = f9453y;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.j(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.j(12);
            }
            x(aVar2, 6);
            b bVar2 = this.f9458d[7].get("PreviewImageStart");
            b bVar3 = this.f9458d[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.f9458d[5].put("JPEGInterchangeFormat", bVar2);
                this.f9458d[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.f9458d[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.k(this.f9460f);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    b f10 = b.f(i10, this.f9460f);
                    b f11 = b.f(i11, this.f9460f);
                    this.f9458d[0].put("ImageWidth", f10);
                    this.f9458d[0].put("ImageLength", f11);
                }
            }
        }
    }

    private void i(C0155a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        f(aVar, i10, 5);
        aVar.j((long) i11);
        aVar.q(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == I.f9481a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b f10 = b.f(readShort, this.f9460f);
                b f11 = b.f(readShort2, this.f9460f);
                this.f9458d[0].put("ImageLength", f10);
                this.f9458d[0].put("ImageWidth", f11);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    private void j(C0155a aVar) {
        b bVar;
        u(aVar, aVar.available());
        x(aVar, 0);
        B(aVar, 0);
        B(aVar, 5);
        B(aVar, 4);
        C(aVar);
        if (this.f9457c == 8 && (bVar = this.f9458d[1].get("MakerNote")) != null) {
            C0155a aVar2 = new C0155a(bVar.f9480c);
            aVar2.q(this.f9460f);
            aVar2.j(6);
            x(aVar2, 9);
            b bVar2 = this.f9458d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f9458d[1].put("ColorSpace", bVar2);
            }
        }
    }

    private void k(C0155a aVar) {
        j(aVar);
        if (this.f9458d[0].get("JpgFromRaw") != null) {
            f(aVar, this.f9470p, 5);
        }
        b bVar = this.f9458d[0].get("ISO");
        b bVar2 = this.f9458d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f9458d[1].put("PhotographicSensitivity", bVar);
        }
    }

    private void l(C0155a aVar, HashMap hashMap) {
        int i10;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i11 = bVar.i(this.f9460f);
            int min = Math.min(bVar2.i(this.f9460f), aVar.available() - i11);
            int i12 = this.f9457c;
            if (i12 == 4 || i12 == 9 || i12 == 10) {
                i10 = this.f9466l;
            } else {
                if (i12 == 7) {
                    i10 = this.f9467m;
                }
                if (i11 > 0 && min > 0) {
                    this.f9461g = true;
                    this.f9462h = i11;
                    this.f9463i = min;
                    if (this.f9455a == null && this.f9456b == null) {
                        byte[] bArr = new byte[min];
                        aVar.j((long) i11);
                        aVar.readFully(bArr);
                        this.f9464j = bArr;
                        return;
                    }
                    return;
                }
            }
            i11 += i10;
            if (i11 > 0) {
            }
        }
    }

    private void m(C0155a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] b10 = b(bVar.k(this.f9460f));
            long[] b11 = b(bVar2.k(this.f9460f));
            if (b10 != null && b11 != null) {
                long j10 = 0;
                for (long j11 : b11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < b10.length; i13++) {
                    int i14 = (int) b10[i13];
                    int i15 = (int) b11[i13];
                    int i16 = i14 - i11;
                    aVar.j((long) i16);
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    aVar.read(bArr2);
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                }
                this.f9461g = true;
                this.f9464j = bArr;
                this.f9463i = i10;
            }
        }
    }

    private static boolean n(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f9451w;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean o(byte[] bArr) {
        C0155a aVar = new C0155a(bArr);
        ByteOrder v10 = v(aVar);
        this.f9460f = v10;
        aVar.q(v10);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean p(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean q(byte[] bArr) {
        C0155a aVar = new C0155a(bArr);
        ByteOrder v10 = v(aVar);
        this.f9460f = v10;
        aVar.q(v10);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private boolean r(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.k(this.f9460f);
        int[] iArr2 = f9448t;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f9457c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i10 = bVar.i(this.f9460f);
        if ((i10 != 1 || !Arrays.equals(iArr, f9450v)) && (i10 != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    private boolean s(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.i(this.f9460f) <= 512 && bVar2.i(this.f9460f) <= 512;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f9471q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            k0.a$c[][] r2 = N     // Catch:{ IOException -> 0x0047 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0047 }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, k0.a$b>[] r2 = r4.f9458d     // Catch:{ IOException -> 0x0047 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x0047 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0047 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0047 }
            int r5 = r4.g(r1)     // Catch:{ IOException -> 0x0047 }
            r4.f9457c = r5     // Catch:{ IOException -> 0x0047 }
            k0.a$a r5 = new k0.a$a     // Catch:{ IOException -> 0x0047 }
            r5.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x0047 }
            int r1 = r4.f9457c     // Catch:{ IOException -> 0x0047 }
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0037;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0033;
                case 8: goto L_0x003b;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ IOException -> 0x0047 }
        L_0x002a:
            goto L_0x003e
        L_0x002b:
            r4.k(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x002f:
            r4.i(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0033:
            r4.h(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0037:
            r4.f(r5, r0, r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x003b:
            r4.j(r5)     // Catch:{ IOException -> 0x0047 }
        L_0x003e:
            r4.z(r5)     // Catch:{ IOException -> 0x0047 }
            r5 = 1
            r4.f9471q = r5     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            r4.f9471q = r0     // Catch:{ all -> 0x0045 }
        L_0x0049:
            r4.a()
            return
        L_0x004d:
            r4.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.t(java.io.InputStream):void");
    }

    private void u(C0155a aVar, int i10) {
        ByteOrder v10 = v(aVar);
        this.f9460f = v10;
        aVar.q(v10);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i11 = this.f9457c;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i10) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i12 = readInt - 8;
            if (i12 > 0 && aVar.skipBytes(i12) != i12) {
                throw new IOException("Couldn't jump to first Ifd: " + i12);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private ByteOrder v(C0155a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void w(byte[] bArr, int i10) {
        C0155a aVar = new C0155a(bArr);
        u(aVar, bArr.length);
        x(aVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x(k0.a.C0155a r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.Set<java.lang.Integer> r3 = r0.f9459e
            int r4 = r1.f9477k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f9477k
            int r3 = r3 + 2
            int r4 = r1.f9476j
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            int r4 = r1.f9477k
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f9476j
            if (r4 > r5) goto L_0x02da
            if (r3 > 0) goto L_0x002b
            goto L_0x02da
        L_0x002b:
            r5 = 0
        L_0x002c:
            r6 = 0
            if (r5 >= r3) goto L_0x0279
            int r9 = r25.readUnsignedShort()
            int r10 = r25.readUnsignedShort()
            int r11 = r25.readInt()
            int r12 = r25.a()
            long r12 = (long) r12
            r14 = 4
            long r12 = r12 + r14
            java.util.HashMap<java.lang.Integer, k0.a$c>[] r16 = R
            r4 = r16[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.get(r8)
            k0.a$c r4 = (k0.a.c) r4
            r8 = 7
            if (r4 != 0) goto L_0x0065
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since tag number is not defined: "
            r14.append(r15)
            r14.append(r9)
        L_0x0062:
            r20 = r9
            goto L_0x00c7
        L_0x0065:
            if (r10 <= 0) goto L_0x00b8
            int[] r14 = B
            int r15 = r14.length
            if (r10 < r15) goto L_0x006d
            goto L_0x00b8
        L_0x006d:
            boolean r15 = r4.a(r10)
            if (r15 != 0) goto L_0x008f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since data format ("
            r14.append(r15)
            java.lang.String[] r15 = A
            r15 = r15[r10]
            r14.append(r15)
            java.lang.String r15 = ") is unexpected for tag: "
            r14.append(r15)
            java.lang.String r15 = r4.f9482b
            r14.append(r15)
            goto L_0x0062
        L_0x008f:
            if (r10 != r8) goto L_0x0093
            int r10 = r4.f9483c
        L_0x0093:
            r15 = r9
            long r8 = (long) r11
            r14 = r14[r10]
            r20 = r15
            long r14 = (long) r14
            long r8 = r8 * r14
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x00aa
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r21 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r21 <= 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r14 = 1
            goto L_0x00c9
        L_0x00aa:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since the number of components is invalid: "
            r14.append(r15)
            r14.append(r11)
            goto L_0x00c8
        L_0x00b8:
            r20 = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since data format is invalid: "
            r8.append(r9)
            r8.append(r10)
        L_0x00c7:
            r8 = r6
        L_0x00c8:
            r14 = 0
        L_0x00c9:
            if (r14 != 0) goto L_0x00d4
            r1.j(r12)
            r19 = r3
            r22 = r5
            goto L_0x0270
        L_0x00d4:
            java.lang.String r14 = "Compression"
            r17 = 4
            int r15 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0179
            int r15 = r25.readInt()
            int r6 = r0.f9457c
            r7 = 7
            if (r6 != r7) goto L_0x0142
            java.lang.String r6 = r4.f9482b
            java.lang.String r7 = "MakerNote"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00f2
            r0.f9467m = r15
            goto L_0x013c
        L_0x00f2:
            r6 = 6
            if (r2 != r6) goto L_0x013c
            java.lang.String r7 = r4.f9482b
            java.lang.String r6 = "ThumbnailImage"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x013c
            r0.f9468n = r15
            r0.f9469o = r11
            java.nio.ByteOrder r6 = r0.f9460f
            r7 = 6
            k0.a$b r6 = k0.a.b.f(r7, r6)
            int r7 = r0.f9468n
            r19 = r3
            long r2 = (long) r7
            java.nio.ByteOrder r7 = r0.f9460f
            k0.a$b r2 = k0.a.b.b(r2, r7)
            int r3 = r0.f9469o
            r21 = r10
            r7 = r11
            long r10 = (long) r3
            java.nio.ByteOrder r3 = r0.f9460f
            k0.a$b r3 = k0.a.b.b(r10, r3)
            java.util.HashMap<java.lang.String, k0.a$b>[] r10 = r0.f9458d
            r11 = 4
            r10 = r10[r11]
            r10.put(r14, r6)
            java.util.HashMap<java.lang.String, k0.a$b>[] r6 = r0.f9458d
            r6 = r6[r11]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6.put(r10, r2)
            java.util.HashMap<java.lang.String, k0.a$b>[] r2 = r0.f9458d
            r2 = r2[r11]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r2.put(r6, r3)
            goto L_0x0157
        L_0x013c:
            r19 = r3
            r21 = r10
            r7 = r11
            goto L_0x0157
        L_0x0142:
            r19 = r3
            r21 = r10
            r7 = r11
            r2 = 10
            if (r6 != r2) goto L_0x0157
            java.lang.String r2 = r4.f9482b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0157
            r0.f9470p = r15
        L_0x0157:
            long r2 = (long) r15
            long r10 = r2 + r8
            int r6 = r1.f9476j
            r22 = r5
            long r5 = (long) r6
            int r23 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r23 > 0) goto L_0x0167
            r1.j(r2)
            goto L_0x0180
        L_0x0167:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            r1.j(r12)
            goto L_0x0270
        L_0x0179:
            r19 = r3
            r22 = r5
            r21 = r10
            r7 = r11
        L_0x0180:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = U
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r5 = 3
            if (r2 == 0) goto L_0x020b
            r6 = -1
            r10 = r21
            if (r10 == r5) goto L_0x01b6
            r4 = 4
            if (r10 == r4) goto L_0x01b1
            if (r10 == r3) goto L_0x01ac
            r3 = 9
            if (r10 == r3) goto L_0x01a7
            r3 = 13
            if (r10 == r3) goto L_0x01a7
        L_0x01a4:
            r3 = 0
            goto L_0x01bc
        L_0x01a7:
            int r3 = r25.readInt()
            goto L_0x01ba
        L_0x01ac:
            short r3 = r25.readShort()
            goto L_0x01ba
        L_0x01b1:
            long r6 = r25.h()
            goto L_0x01a4
        L_0x01b6:
            int r3 = r25.readUnsignedShort()
        L_0x01ba:
            long r6 = (long) r3
            goto L_0x01a4
        L_0x01bc:
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01fa
            int r3 = r1.f9476j
            long r3 = (long) r3
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x01fa
            java.util.Set<java.lang.Integer> r3 = r0.f9459e
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x01df
            r1.j(r6)
            int r2 = r2.intValue()
            r0.x(r1, r2)
            goto L_0x0207
        L_0x01df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ")"
            r3.append(r2)
            goto L_0x0207
        L_0x01fa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r6)
        L_0x0207:
            r1.j(r12)
            goto L_0x0270
        L_0x020b:
            r10 = r21
            int r2 = (int) r8
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            k0.a$b r6 = new k0.a$b
            r6.<init>(r10, r7, r2)
            java.util.HashMap<java.lang.String, k0.a$b>[] r2 = r0.f9458d
            r2 = r2[r26]
            java.lang.String r7 = r4.f9482b
            r2.put(r7, r6)
            java.lang.String r2 = r4.f9482b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x022d
            r0.f9457c = r5
        L_0x022d:
            java.lang.String r2 = r4.f9482b
            java.lang.String r5 = "Make"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0241
            java.lang.String r2 = r4.f9482b
            java.lang.String r5 = "Model"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x024f
        L_0x0241:
            java.nio.ByteOrder r2 = r0.f9460f
            java.lang.String r2 = r6.j(r2)
            java.lang.String r5 = "PENTAX"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0262
        L_0x024f:
            java.lang.String r2 = r4.f9482b
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0264
            java.nio.ByteOrder r2 = r0.f9460f
            int r2 = r6.i(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x0264
        L_0x0262:
            r0.f9457c = r3
        L_0x0264:
            int r2 = r25.a()
            long r2 = (long) r2
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0270
            r1.j(r12)
        L_0x0270:
            int r5 = r22 + 1
            short r5 = (short) r5
            r2 = r26
            r3 = r19
            goto L_0x002c
        L_0x0279:
            int r2 = r25.a()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f9476j
            if (r2 > r3) goto L_0x02da
            int r2 = r25.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02cd
            int r5 = r1.f9476j
            if (r2 >= r5) goto L_0x02cd
            java.util.Set<java.lang.Integer> r5 = r0.f9459e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02bf
            r1.j(r3)
            java.util.HashMap<java.lang.String, k0.a$b>[] r2 = r0.f9458d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02b0
            r0.x(r1, r3)
            goto L_0x02da
        L_0x02b0:
            java.util.HashMap<java.lang.String, k0.a$b>[] r2 = r0.f9458d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02da
            r0.x(r1, r3)
            goto L_0x02da
        L_0x02bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            goto L_0x02da
        L_0x02cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
        L_0x02da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.x(k0.a$a, int):void");
    }

    private void y(C0155a aVar, int i10) {
        b bVar;
        b bVar2 = this.f9458d[i10].get("ImageLength");
        b bVar3 = this.f9458d[i10].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f9458d[i10].get("JPEGInterchangeFormat")) != null) {
            f(aVar, bVar.i(this.f9460f), i10);
        }
    }

    private void z(C0155a aVar) {
        HashMap<String, b> hashMap = this.f9458d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i10 = bVar.i(this.f9460f);
            this.f9465k = i10;
            if (i10 != 1) {
                if (i10 == 6) {
                    l(aVar, hashMap);
                    return;
                } else if (i10 != 7) {
                    return;
                }
            }
            if (r(hashMap)) {
                m(aVar, hashMap);
                return;
            }
            return;
        }
        this.f9465k = 6;
        l(aVar, hashMap);
    }

    public String c(String str) {
        b e10 = e(str);
        if (e10 != null) {
            if (!T.contains(str)) {
                return e10.j(this.f9460f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = e10.f9478a;
                if (i10 == 5 || i10 == 10) {
                    d[] dVarArr = (d[]) e10.k(this.f9460f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(dVarArr));
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f9485a) / ((float) dVarArr[0].f9486b))), Integer.valueOf((int) (((float) dVarArr[1].f9485a) / ((float) dVarArr[1].f9486b))), Integer.valueOf((int) (((float) dVarArr[2].f9485a) / ((float) dVarArr[2].f9486b)))});
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(e10.f9478a);
                return null;
            }
            try {
                return Double.toString(e10.h(this.f9460f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int d(String str, int i10) {
        b e10 = e(str);
        if (e10 == null) {
            return i10;
        }
        try {
            return e10.i(this.f9460f);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    private static class C0155a extends InputStream implements DataInput {

        /* renamed from: l  reason: collision with root package name */
        private static final ByteOrder f9472l = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: m  reason: collision with root package name */
        private static final ByteOrder f9473m = ByteOrder.BIG_ENDIAN;

        /* renamed from: h  reason: collision with root package name */
        private DataInputStream f9474h;

        /* renamed from: i  reason: collision with root package name */
        private ByteOrder f9475i;

        /* renamed from: j  reason: collision with root package name */
        final int f9476j;

        /* renamed from: k  reason: collision with root package name */
        int f9477k;

        public C0155a(InputStream inputStream) {
            this.f9475i = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9474h = dataInputStream;
            int available = dataInputStream.available();
            this.f9476j = available;
            this.f9477k = 0;
            this.f9474h.mark(available);
        }

        public int a() {
            return this.f9477k;
        }

        public int available() {
            return this.f9474h.available();
        }

        public long h() {
            return ((long) readInt()) & KeyboardMap.kValueMask;
        }

        public void j(long j10) {
            int i10 = this.f9477k;
            if (((long) i10) > j10) {
                this.f9477k = 0;
                this.f9474h.reset();
                this.f9474h.mark(this.f9476j);
            } else {
                j10 -= (long) i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void q(ByteOrder byteOrder) {
            this.f9475i = byteOrder;
        }

        public int read() {
            this.f9477k++;
            return this.f9474h.read();
        }

        public boolean readBoolean() {
            this.f9477k++;
            return this.f9474h.readBoolean();
        }

        public byte readByte() {
            int i10 = this.f9477k + 1;
            this.f9477k = i10;
            if (i10 <= this.f9476j) {
                int read = this.f9474h.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f9477k += 2;
            return this.f9474h.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f9477k + i11;
            this.f9477k = i12;
            if (i12 > this.f9476j) {
                throw new EOFException();
            } else if (this.f9474h.read(bArr, i10, i11) != i11) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i10 = this.f9477k + 4;
            this.f9477k = i10;
            if (i10 <= this.f9476j) {
                int read = this.f9474h.read();
                int read2 = this.f9474h.read();
                int read3 = this.f9474h.read();
                int read4 = this.f9474h.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f9475i;
                    if (byteOrder == f9472l) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f9473m) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f9475i);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            return null;
        }

        public long readLong() {
            int i10 = this.f9477k + 8;
            this.f9477k = i10;
            if (i10 <= this.f9476j) {
                int read = this.f9474h.read();
                int read2 = this.f9474h.read();
                int read3 = this.f9474h.read();
                int read4 = this.f9474h.read();
                int read5 = this.f9474h.read();
                int read6 = this.f9474h.read();
                int read7 = this.f9474h.read();
                int read8 = this.f9474h.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f9475i;
                    if (byteOrder == f9472l) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i11 = read2;
                    if (byteOrder == f9473m) {
                        return (((long) read) << 56) + (((long) i11) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f9475i);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i10 = this.f9477k + 2;
            this.f9477k = i10;
            if (i10 <= this.f9476j) {
                int read = this.f9474h.read();
                int read2 = this.f9474h.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f9475i;
                    if (byteOrder == f9472l) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f9473m) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f9475i);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f9477k += 2;
            return this.f9474h.readUTF();
        }

        public int readUnsignedByte() {
            this.f9477k++;
            return this.f9474h.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i10 = this.f9477k + 2;
            this.f9477k = i10;
            if (i10 <= this.f9476j) {
                int read = this.f9474h.read();
                int read2 = this.f9474h.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f9475i;
                    if (byteOrder == f9472l) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f9473m) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f9475i);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i10) {
            int min = Math.min(i10, this.f9476j - this.f9477k);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f9474h.skipBytes(min - i11);
            }
            this.f9477k += i11;
            return i11;
        }

        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f9474h.read(bArr, i10, i11);
            this.f9477k += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            int length = this.f9477k + bArr.length;
            this.f9477k = length;
            if (length > this.f9476j) {
                throw new EOFException();
            } else if (this.f9474h.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C0155a(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f9481a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9482b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9483c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9484d;

        c(String str, int i10, int i11) {
            this.f9482b = str;
            this.f9481a = i10;
            this.f9483c = i11;
            this.f9484d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i10) {
            int i11;
            int i12 = this.f9483c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f9484d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            if ((i12 == 12 || i11 == 12) && i10 == 11) {
                return true;
            }
            return false;
        }

        c(String str, int i10, int i11, int i12) {
            this.f9482b = str;
            this.f9481a = i10;
            this.f9483c = i11;
            this.f9484d = i12;
        }
    }
}
