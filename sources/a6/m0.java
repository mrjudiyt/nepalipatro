package a6;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import e4.j;
import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import l6.c;
import l6.e;

/* compiled from: Util */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f205a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f206b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f207c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f208d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f209e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f210f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f211g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f212h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f213i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f214j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: k  reason: collision with root package name */
    private static HashMap<String, String> f215k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f216l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f217m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f218n;

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f219o;

    static {
        int i10;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i10 = 31;
        } else {
            i10 = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        f205a = i10;
        String str2 = Build.DEVICE;
        f206b = str2;
        String str3 = Build.MANUFACTURER;
        f207c = str3;
        String str4 = Build.MODEL;
        f208d = str4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i10);
        f209e = sb.toString();
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        // fill-array-data instruction
        iArr[0] = 0;
        iArr[1] = 79764919;
        iArr[2] = 159529838;
        iArr[3] = 222504665;
        iArr[4] = 319059676;
        iArr[5] = 398814059;
        iArr[6] = 445009330;
        iArr[7] = 507990021;
        iArr[8] = 638119352;
        iArr[9] = 583659535;
        iArr[10] = 797628118;
        iArr[11] = 726387553;
        iArr[12] = 890018660;
        iArr[13] = 835552979;
        iArr[14] = 1015980042;
        iArr[15] = 944750013;
        iArr[16] = 1276238704;
        iArr[17] = 1221641927;
        iArr[18] = 1167319070;
        iArr[19] = 1095957929;
        iArr[20] = 1595256236;
        iArr[21] = 1540665371;
        iArr[22] = 1452775106;
        iArr[23] = 1381403509;
        iArr[24] = 1780037320;
        iArr[25] = 1859660671;
        iArr[26] = 1671105958;
        iArr[27] = 1733955601;
        iArr[28] = 2031960084;
        iArr[29] = 2111593891;
        iArr[30] = 1889500026;
        iArr[31] = 1952343757;
        iArr[32] = -1742489888;
        iArr[33] = -1662866601;
        iArr[34] = -1851683442;
        iArr[35] = -1788833735;
        iArr[36] = -1960329156;
        iArr[37] = -1880695413;
        iArr[38] = -2103051438;
        iArr[39] = -2040207643;
        iArr[40] = -1104454824;
        iArr[41] = -1159051537;
        iArr[42] = -1213636554;
        iArr[43] = -1284997759;
        iArr[44] = -1389417084;
        iArr[45] = -1444007885;
        iArr[46] = -1532160278;
        iArr[47] = -1603531939;
        iArr[48] = -734892656;
        iArr[49] = -789352409;
        iArr[50] = -575645954;
        iArr[51] = -646886583;
        iArr[52] = -952755380;
        iArr[53] = -1007220997;
        iArr[54] = -827056094;
        iArr[55] = -898286187;
        iArr[56] = -231047128;
        iArr[57] = -151282273;
        iArr[58] = -71779514;
        iArr[59] = -8804623;
        iArr[60] = -515967244;
        iArr[61] = -436212925;
        iArr[62] = -390279782;
        iArr[63] = -327299027;
        iArr[64] = 881225847;
        iArr[65] = 809987520;
        iArr[66] = 1023691545;
        iArr[67] = 969234094;
        iArr[68] = 662832811;
        iArr[69] = 591600412;
        iArr[70] = 771767749;
        iArr[71] = 717299826;
        iArr[72] = 311336399;
        iArr[73] = 374308984;
        iArr[74] = 453813921;
        iArr[75] = 533576470;
        iArr[76] = 25881363;
        iArr[77] = 88864420;
        iArr[78] = 134795389;
        iArr[79] = 214552010;
        iArr[80] = 2023205639;
        iArr[81] = 2086057648;
        iArr[82] = 1897238633;
        iArr[83] = 1976864222;
        iArr[84] = 1804852699;
        iArr[85] = 1867694188;
        iArr[86] = 1645340341;
        iArr[87] = 1724971778;
        iArr[88] = 1587496639;
        iArr[89] = 1516133128;
        iArr[90] = 1461550545;
        iArr[91] = 1406951526;
        iArr[92] = 1302016099;
        iArr[93] = 1230646740;
        iArr[94] = 1142491917;
        iArr[95] = 1087903418;
        iArr[96] = -1398421865;
        iArr[97] = -1469785312;
        iArr[98] = -1524105735;
        iArr[99] = -1578704818;
        iArr[100] = -1079922613;
        iArr[101] = -1151291908;
        iArr[102] = -1239184603;
        iArr[103] = -1293773166;
        iArr[104] = -1968362705;
        iArr[105] = -1905510760;
        iArr[106] = -2094067647;
        iArr[107] = -2014441994;
        iArr[108] = -1716953613;
        iArr[109] = -1654112188;
        iArr[110] = -1876203875;
        iArr[111] = -1796572374;
        iArr[112] = -525066777;
        iArr[113] = -462094256;
        iArr[114] = -382327159;
        iArr[115] = -302564546;
        iArr[116] = -206542021;
        iArr[117] = -143559028;
        iArr[118] = -97365931;
        iArr[119] = -17609246;
        iArr[120] = -960696225;
        iArr[121] = -1031934488;
        iArr[122] = -817968335;
        iArr[123] = -872425850;
        iArr[124] = -709327229;
        iArr[125] = -780559564;
        iArr[126] = -600130067;
        iArr[127] = -654598054;
        iArr[128] = 1762451694;
        iArr[129] = 1842216281;
        iArr[130] = 1619975040;
        iArr[131] = 1682949687;
        iArr[132] = 2047383090;
        iArr[133] = 2127137669;
        iArr[134] = 1938468188;
        iArr[135] = 2001449195;
        iArr[136] = 1325665622;
        iArr[137] = 1271206113;
        iArr[138] = 1183200824;
        iArr[139] = 1111960463;
        iArr[140] = 1543535498;
        iArr[141] = 1489069629;
        iArr[142] = 1434599652;
        iArr[143] = 1363369299;
        iArr[144] = 622672798;
        iArr[145] = 568075817;
        iArr[146] = 748617968;
        iArr[147] = 677256519;
        iArr[148] = 907627842;
        iArr[149] = 853037301;
        iArr[150] = 1067152940;
        iArr[151] = 995781531;
        iArr[152] = 51762726;
        iArr[153] = 131386257;
        iArr[154] = 177728840;
        iArr[155] = 240578815;
        iArr[156] = 269590778;
        iArr[157] = 349224269;
        iArr[158] = 429104020;
        iArr[159] = 491947555;
        iArr[160] = -248556018;
        iArr[161] = -168932423;
        iArr[162] = -122852000;
        iArr[163] = -60002089;
        iArr[164] = -500490030;
        iArr[165] = -420856475;
        iArr[166] = -341238852;
        iArr[167] = -278395381;
        iArr[168] = -685261898;
        iArr[169] = -739858943;
        iArr[170] = -559578920;
        iArr[171] = -630940305;
        iArr[172] = -1004286614;
        iArr[173] = -1058877219;
        iArr[174] = -845023740;
        iArr[175] = -916395085;
        iArr[176] = -1119974018;
        iArr[177] = -1174433591;
        iArr[178] = -1262701040;
        iArr[179] = -1333941337;
        iArr[180] = -1371866206;
        iArr[181] = -1426332139;
        iArr[182] = -1481064244;
        iArr[183] = -1552294533;
        iArr[184] = -1690935098;
        iArr[185] = -1611170447;
        iArr[186] = -1833673816;
        iArr[187] = -1770699233;
        iArr[188] = -2009983462;
        iArr[189] = -1930228819;
        iArr[190] = -2119160460;
        iArr[191] = -2056179517;
        iArr[192] = 1569362073;
        iArr[193] = 1498123566;
        iArr[194] = 1409854455;
        iArr[195] = 1355396672;
        iArr[196] = 1317987909;
        iArr[197] = 1246755826;
        iArr[198] = 1192025387;
        iArr[199] = 1137557660;
        iArr[200] = 2072149281;
        iArr[201] = 2135122070;
        iArr[202] = 1912620623;
        iArr[203] = 1992383480;
        iArr[204] = 1753615357;
        iArr[205] = 1816598090;
        iArr[206] = 1627664531;
        iArr[207] = 1707420964;
        iArr[208] = 295390185;
        iArr[209] = 358241886;
        iArr[210] = 404320391;
        iArr[211] = 483945776;
        iArr[212] = 43990325;
        iArr[213] = 106832002;
        iArr[214] = 186451547;
        iArr[215] = 266083308;
        iArr[216] = 932423249;
        iArr[217] = 861060070;
        iArr[218] = 1041341759;
        iArr[219] = 986742920;
        iArr[220] = 613929101;
        iArr[221] = 542559546;
        iArr[222] = 756411363;
        iArr[223] = 701822548;
        iArr[224] = -978770311;
        iArr[225] = -1050133554;
        iArr[226] = -869589737;
        iArr[227] = -924188512;
        iArr[228] = -693284699;
        iArr[229] = -764654318;
        iArr[230] = -550540341;
        iArr[231] = -605129092;
        iArr[232] = -475935807;
        iArr[233] = -413084042;
        iArr[234] = -366743377;
        iArr[235] = -287118056;
        iArr[236] = -257573603;
        iArr[237] = -194731862;
        iArr[238] = -114850189;
        iArr[239] = -35218492;
        iArr[240] = -1984365303;
        iArr[241] = -1921392450;
        iArr[242] = -2143631769;
        iArr[243] = -2063868976;
        iArr[244] = -1698919467;
        iArr[245] = -1635936670;
        iArr[246] = -1824608069;
        iArr[247] = -1744851700;
        iArr[248] = -1347415887;
        iArr[249] = -1418654458;
        iArr[250] = -1506661409;
        iArr[251] = -1561119128;
        iArr[252] = -1129027987;
        iArr[253] = -1200260134;
        iArr[254] = -1254728445;
        iArr[255] = -1309196108;
        f218n = iArr;
        int[] iArr2 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        // fill-array-data instruction
        iArr2[0] = 0;
        iArr2[1] = 7;
        iArr2[2] = 14;
        iArr2[3] = 9;
        iArr2[4] = 28;
        iArr2[5] = 27;
        iArr2[6] = 18;
        iArr2[7] = 21;
        iArr2[8] = 56;
        iArr2[9] = 63;
        iArr2[10] = 54;
        iArr2[11] = 49;
        iArr2[12] = 36;
        iArr2[13] = 35;
        iArr2[14] = 42;
        iArr2[15] = 45;
        iArr2[16] = 112;
        iArr2[17] = 119;
        iArr2[18] = 126;
        iArr2[19] = 121;
        iArr2[20] = 108;
        iArr2[21] = 107;
        iArr2[22] = 98;
        iArr2[23] = 101;
        iArr2[24] = 72;
        iArr2[25] = 79;
        iArr2[26] = 70;
        iArr2[27] = 65;
        iArr2[28] = 84;
        iArr2[29] = 83;
        iArr2[30] = 90;
        iArr2[31] = 93;
        iArr2[32] = 224;
        iArr2[33] = 231;
        iArr2[34] = 238;
        iArr2[35] = 233;
        iArr2[36] = 252;
        iArr2[37] = 251;
        iArr2[38] = 242;
        iArr2[39] = 245;
        iArr2[40] = 216;
        iArr2[41] = 223;
        iArr2[42] = 214;
        iArr2[43] = 209;
        iArr2[44] = 196;
        iArr2[45] = 195;
        iArr2[46] = 202;
        iArr2[47] = 205;
        iArr2[48] = 144;
        iArr2[49] = 151;
        iArr2[50] = 158;
        iArr2[51] = 153;
        iArr2[52] = 140;
        iArr2[53] = 139;
        iArr2[54] = 130;
        iArr2[55] = 133;
        iArr2[56] = 168;
        iArr2[57] = 175;
        iArr2[58] = 166;
        iArr2[59] = 161;
        iArr2[60] = 180;
        iArr2[61] = 179;
        iArr2[62] = 186;
        iArr2[63] = 189;
        iArr2[64] = 199;
        iArr2[65] = 192;
        iArr2[66] = 201;
        iArr2[67] = 206;
        iArr2[68] = 219;
        iArr2[69] = 220;
        iArr2[70] = 213;
        iArr2[71] = 210;
        iArr2[72] = 255;
        iArr2[73] = 248;
        iArr2[74] = 241;
        iArr2[75] = 246;
        iArr2[76] = 227;
        iArr2[77] = 228;
        iArr2[78] = 237;
        iArr2[79] = 234;
        iArr2[80] = 183;
        iArr2[81] = 176;
        iArr2[82] = 185;
        iArr2[83] = 190;
        iArr2[84] = 171;
        iArr2[85] = 172;
        iArr2[86] = 165;
        iArr2[87] = 162;
        iArr2[88] = 143;
        iArr2[89] = 136;
        iArr2[90] = 129;
        iArr2[91] = 134;
        iArr2[92] = 147;
        iArr2[93] = 148;
        iArr2[94] = 157;
        iArr2[95] = 154;
        iArr2[96] = 39;
        iArr2[97] = 32;
        iArr2[98] = 41;
        iArr2[99] = 46;
        iArr2[100] = 59;
        iArr2[101] = 60;
        iArr2[102] = 53;
        iArr2[103] = 50;
        iArr2[104] = 31;
        iArr2[105] = 24;
        iArr2[106] = 17;
        iArr2[107] = 22;
        iArr2[108] = 3;
        iArr2[109] = 4;
        iArr2[110] = 13;
        iArr2[111] = 10;
        iArr2[112] = 87;
        iArr2[113] = 80;
        iArr2[114] = 89;
        iArr2[115] = 94;
        iArr2[116] = 75;
        iArr2[117] = 76;
        iArr2[118] = 69;
        iArr2[119] = 66;
        iArr2[120] = 111;
        iArr2[121] = 104;
        iArr2[122] = 97;
        iArr2[123] = 102;
        iArr2[124] = 115;
        iArr2[125] = 116;
        iArr2[126] = 125;
        iArr2[127] = 122;
        iArr2[128] = 137;
        iArr2[129] = 142;
        iArr2[130] = 135;
        iArr2[131] = 128;
        iArr2[132] = 149;
        iArr2[133] = 146;
        iArr2[134] = 155;
        iArr2[135] = 156;
        iArr2[136] = 177;
        iArr2[137] = 182;
        iArr2[138] = 191;
        iArr2[139] = 184;
        iArr2[140] = 173;
        iArr2[141] = 170;
        iArr2[142] = 163;
        iArr2[143] = 164;
        iArr2[144] = 249;
        iArr2[145] = 254;
        iArr2[146] = 247;
        iArr2[147] = 240;
        iArr2[148] = 229;
        iArr2[149] = 226;
        iArr2[150] = 235;
        iArr2[151] = 236;
        iArr2[152] = 193;
        iArr2[153] = 198;
        iArr2[154] = 207;
        iArr2[155] = 200;
        iArr2[156] = 221;
        iArr2[157] = 218;
        iArr2[158] = 211;
        iArr2[159] = 212;
        iArr2[160] = 105;
        iArr2[161] = 110;
        iArr2[162] = 103;
        iArr2[163] = 96;
        iArr2[164] = 117;
        iArr2[165] = 114;
        iArr2[166] = 123;
        iArr2[167] = 124;
        iArr2[168] = 81;
        iArr2[169] = 86;
        iArr2[170] = 95;
        iArr2[171] = 88;
        iArr2[172] = 77;
        iArr2[173] = 74;
        iArr2[174] = 67;
        iArr2[175] = 68;
        iArr2[176] = 25;
        iArr2[177] = 30;
        iArr2[178] = 23;
        iArr2[179] = 16;
        iArr2[180] = 5;
        iArr2[181] = 2;
        iArr2[182] = 11;
        iArr2[183] = 12;
        iArr2[184] = 33;
        iArr2[185] = 38;
        iArr2[186] = 47;
        iArr2[187] = 40;
        iArr2[188] = 61;
        iArr2[189] = 58;
        iArr2[190] = 51;
        iArr2[191] = 52;
        iArr2[192] = 78;
        iArr2[193] = 73;
        iArr2[194] = 64;
        iArr2[195] = 71;
        iArr2[196] = 82;
        iArr2[197] = 85;
        iArr2[198] = 92;
        iArr2[199] = 91;
        iArr2[200] = 118;
        iArr2[201] = 113;
        iArr2[202] = 120;
        iArr2[203] = 127;
        iArr2[204] = 106;
        iArr2[205] = 109;
        iArr2[206] = 100;
        iArr2[207] = 99;
        iArr2[208] = 62;
        iArr2[209] = 57;
        iArr2[210] = 48;
        iArr2[211] = 55;
        iArr2[212] = 34;
        iArr2[213] = 37;
        iArr2[214] = 44;
        iArr2[215] = 43;
        iArr2[216] = 6;
        iArr2[217] = 1;
        iArr2[218] = 8;
        iArr2[219] = 15;
        iArr2[220] = 26;
        iArr2[221] = 29;
        iArr2[222] = 20;
        iArr2[223] = 19;
        iArr2[224] = 174;
        iArr2[225] = 169;
        iArr2[226] = 160;
        iArr2[227] = 167;
        iArr2[228] = 178;
        iArr2[229] = 181;
        iArr2[230] = 188;
        iArr2[231] = 187;
        iArr2[232] = 150;
        iArr2[233] = 145;
        iArr2[234] = 152;
        iArr2[235] = 159;
        iArr2[236] = 138;
        iArr2[237] = 141;
        iArr2[238] = 132;
        iArr2[239] = 131;
        iArr2[240] = 222;
        iArr2[241] = 217;
        iArr2[242] = 208;
        iArr2[243] = 215;
        iArr2[244] = 194;
        iArr2[245] = 197;
        iArr2[246] = 204;
        iArr2[247] = 203;
        iArr2[248] = 230;
        iArr2[249] = 225;
        iArr2[250] = 232;
        iArr2[251] = 239;
        iArr2[252] = 250;
        iArr2[253] = 253;
        iArr2[254] = 244;
        iArr2[255] = 243;
        f219o = iArr2;
    }

    public static Handler A(Handler.Callback callback) {
        return w(N(), callback);
    }

    public static boolean A0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private static HashMap<String, String> B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f216l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f216l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static <T> void B0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        } else if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static String C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long C0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (((double) j10) * (((double) j11) / ((double) j12)));
    }

    public static String D(byte[] bArr) {
        return new String(bArr, e.f15604c);
    }

    public static void D0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i10 < jArr.length) {
                jArr[i10] = (long) (((double) jArr[i10]) * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static String E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, e.f15604c);
    }

    public static String[] E0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int F(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f205a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static String[] F0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int G(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static String[] G0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return E0(str.trim(), "(\\s*,\\s*)");
    }

    public static int H(String str, int i10) {
        int i11 = 0;
        for (String n10 : G0(str)) {
            if (i10 == t.n(n10)) {
                i11++;
            }
        }
        return i11;
    }

    public static long H0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static String I(String str, int i10) {
        String[] G0 = G0(str);
        if (G0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : G0) {
            if (i10 == t.n(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static byte[] I0(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String J(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static long J0(int i10, int i11) {
        return K0(i11) | (K0(i10) << 32);
    }

    public static String K(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return c.f(networkCountryIso);
            }
        }
        return c.f(Locale.getDefault().getCountry());
    }

    public static long K0(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (android.hardware.display.DisplayManager) r2.getSystemService("display");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point L(android.content.Context r2) {
        /*
            int r0 = f205a
            r1 = 17
            if (r0 < r1) goto L_0x0016
            java.lang.String r0 = "display"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L_0x0016
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.lang.Object r0 = a6.a.e(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
        L_0x002b:
            android.graphics.Point r2 = M(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.L(android.content.Context):android.graphics.Point");
    }

    public static CharSequence L0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static Point M(Context context, Display display) {
        String str;
        int i10 = f205a;
        if (i10 <= 29 && display.getDisplayId() == 0 && m0(context)) {
            if ("Sony".equals(f207c) && f208d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i10 < 28) {
                str = e0("sys.display-size");
            } else {
                str = e0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] E0 = E0(str.trim(), "x");
                    if (E0.length == 2) {
                        int parseInt = Integer.parseInt(E0[0]);
                        int parseInt2 = Integer.parseInt(E0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                p.c("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i11 = f205a;
        if (i11 >= 23) {
            Q(display, point);
        } else if (i11 >= 17) {
            P(display, point);
        } else {
            O(display, point);
        }
        return point;
    }

    public static void M0(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static Looper N() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    private static void O(Display display, Point point) {
        display.getSize(point);
    }

    private static void P(Display display, Point point) {
        display.getRealSize(point);
    }

    private static void Q(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static int R(String str) {
        String[] E0;
        int length;
        if (str == null || (length = E0.length) < 2) {
            return 0;
        }
        String str2 = (E0 = E0(str, "_"))[length - 1];
        boolean z10 = length >= 3 && "neg".equals(E0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String S(Locale locale) {
        return f205a >= 21 ? T(locale) : locale.toString();
    }

    private static String T(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long U(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) * ((double) f10));
    }

    public static long V(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static int W(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static j X(int i10, int i11, int i12) {
        return new j.b().e0("audio/raw").H(i11).f0(i12).Y(i10).E();
    }

    public static int Y(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long Z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) / ((double) f10));
    }

    public static int a0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static String[] b0() {
        String[] c02 = c0();
        for (int i10 = 0; i10 < c02.length; i10++) {
            c02[i10] = s0(c02[i10]);
        }
        return c02;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String[] c0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f205a >= 24) {
            return d0(configuration);
        }
        return new String[]{S(configuration.locale)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int d(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    private static String[] d0(Configuration configuration) {
        return E0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.e(long[], long, boolean, boolean):int");
    }

    private static String e0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            String valueOf = String.valueOf(str);
            p.d("Util", valueOf.length() != 0 ? "Failed to read system property ".concat(valueOf) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static int f(q qVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = qVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (qVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < qVar.c() && qVar.b(i10) == j10) {
            return i10;
        }
        if (!z11 || c10 != -1) {
            return c10;
        }
        return 0;
    }

    public static String f0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(str3);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.15.0");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int g(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.g(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static byte[] g0(String str) {
        return str.getBytes(e.f15604c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.h(int[], int, boolean, boolean):int");
    }

    public static boolean h0(y yVar, y yVar2, Inflater inflater) {
        if (yVar.a() <= 0) {
            return false;
        }
        if (yVar2.b() < yVar.a()) {
            yVar2.c(yVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(yVar.d(), yVar.e(), yVar.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(yVar2.d(), i10, yVar2.b() - i10);
                if (inflater.finished()) {
                    yVar2.N(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == yVar2.b()) {
                    yVar2.c(yVar2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m0.i(long[], long, boolean, boolean):int");
    }

    public static boolean i0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static <T> T j(T t10) {
        return t10;
    }

    public static boolean j0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static boolean k0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static boolean l0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static boolean m0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void n(a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread n0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static int p(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String p0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f217m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                String valueOf = String.valueOf(strArr[i10 + 1]);
                String valueOf2 = String.valueOf(str.substring(strArr[i10].length()));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            i10 += 2;
        }
    }

    public static float q(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static <T> void q0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static int r(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static ExecutorService r0(String str) {
        return Executors.newSingleThreadExecutor(new l0(str));
    }

    public static long s(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static String s0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = c.e(str);
        String str2 = F0(e10, "-")[0];
        if (f215k == null) {
            f215k = B();
        }
        String str3 = f215k.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(e10.substring(str2.length()));
            e10 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? p0(e10) : e10;
    }

    public static boolean t(Object[] objArr, Object obj) {
        for (Object c10 : objArr) {
            if (c(c10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] t0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return k(copyOf);
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f218n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static <T> T[] u0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    public static int v(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f219o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static <T> T[] v0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return Arrays.copyOf(tArr, i10);
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static <T> T[] w0(T[] tArr, int i10, int i11) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i11 > tArr.length) {
            z10 = false;
        }
        a.a(z10);
        return Arrays.copyOfRange(tArr, i10, i11);
    }

    public static Handler x() {
        return y((Handler.Callback) null);
    }

    public static long x0(String str) {
        Matcher matcher = f211g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw ParserException.a(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "), (Throwable) null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - ((long) (i10 * 60000)) : timeInMillis;
    }

    public static Handler y(Handler.Callback callback) {
        return w((Looper) a.h(Looper.myLooper()), callback);
    }

    public static long y0(String str) {
        Matcher matcher = f212h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d10 = Double.parseDouble(group6);
        }
        long j10 = (long) ((parseDouble5 + d10) * 1000.0d);
        return isEmpty ? -j10 : j10;
    }

    public static Handler z() {
        return A((Handler.Callback) null);
    }

    public static boolean z0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }
}
