package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfcr {
    public final String zzA;
    public final String zzB;
    public final zzbxr zzC;
    public final String zzD;
    public final JSONObject zzE;
    public final JSONObject zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final String zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final int zzS;
    public final int zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final String zzW;
    public final zzfdq zzX;
    public final boolean zzY;
    public final boolean zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final int zzac;
    public final String zzad;
    public final boolean zzae;
    public final zzbtb zzaf;
    public final zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final String zzaq;
    public final String zzar;
    public final boolean zzas;
    public final int zzat;
    public final String zzau;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final List zzk;
    public final String zzl;
    public final String zzm;
    public final zzbwi zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final List zzr;
    public final int zzs;
    public final List zzt;
    public final zzfcx zzu;
    public final List zzv;
    public final List zzw;
    public final JSONObject zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x070c, code lost:
        r10 = r81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x087f, code lost:
        r10 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0881, code lost:
        r9 = r79;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfcr(android.util.JsonReader r81) {
        /*
            r80 = this;
            r0 = r80
            r80.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.zzfvs r21 = com.google.android.gms.internal.ads.zzfvs.zzl()
            com.google.android.gms.internal.ads.zzfvs r22 = com.google.android.gms.internal.ads.zzfvs.zzl()
            r81.beginObject()
            r23 = -1
            r24 = 0
            java.lang.String r25 = ""
            r26 = 0
            r27 = r16
            r28 = r17
            r29 = r18
            r30 = r19
            r31 = r20
            r32 = r21
            r33 = r22
            r19 = r24
            r34 = r19
            r35 = r34
            r36 = r35
            r37 = r36
            r39 = r25
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r54 = r43
            r58 = r54
            r60 = r58
            r62 = r60
            r64 = r62
            r65 = r64
            r66 = r65
            r67 = r66
            r68 = r67
            r73 = r68
            r74 = r73
            r75 = r74
            r78 = r75
            r38 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = -1
            r52 = 0
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = -1
            r61 = 0
            r63 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r76 = 0
            r77 = 0
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r15 = r37
            r11 = r78
            r12 = r11
            r13 = 0
            r14 = 0
        L_0x00e9:
            boolean r22 = r81.hasNext()
            if (r22 == 0) goto L_0x0885
            java.lang.String r22 = r81.nextName()
            if (r22 != 0) goto L_0x00f8
            r24 = r25
            goto L_0x00fa
        L_0x00f8:
            r24 = r22
        L_0x00fa:
            int r22 = r24.hashCode()
            switch(r22) {
                case -2138196627: goto L_0x061c;
                case -1980587809: goto L_0x060b;
                case -1965512151: goto L_0x05fa;
                case -1871425831: goto L_0x05e9;
                case -1843156475: goto L_0x05d8;
                case -1812055556: goto L_0x05c7;
                case -1785028569: goto L_0x05b5;
                case -1776946669: goto L_0x05a3;
                case -1662989631: goto L_0x0591;
                case -1620470467: goto L_0x057f;
                case -1550155393: goto L_0x056d;
                case -1440104884: goto L_0x055b;
                case -1439500848: goto L_0x0549;
                case -1428969291: goto L_0x0537;
                case -1406227629: goto L_0x0525;
                case -1403779768: goto L_0x0513;
                case -1375413093: goto L_0x0501;
                case -1360811658: goto L_0x04ef;
                case -1306015996: goto L_0x04dd;
                case -1303332046: goto L_0x04cb;
                case -1289032093: goto L_0x04b9;
                case -1240082064: goto L_0x04a7;
                case -1234181075: goto L_0x0495;
                case -1168140544: goto L_0x0483;
                case -1152230954: goto L_0x0472;
                case -1146534047: goto L_0x0460;
                case -1115838944: goto L_0x044e;
                case -1081936678: goto L_0x043c;
                case -1078050970: goto L_0x042a;
                case -1051269058: goto L_0x0418;
                case -982608540: goto L_0x0406;
                case -972056451: goto L_0x03f4;
                case -776859333: goto L_0x03e3;
                case -570101180: goto L_0x03d2;
                case -544216775: goto L_0x03c0;
                case -437057161: goto L_0x03af;
                case -404433734: goto L_0x039d;
                case -404326515: goto L_0x038b;
                case -397704715: goto L_0x0379;
                case -388807511: goto L_0x0367;
                case -369773488: goto L_0x0355;
                case -213449460: goto L_0x0343;
                case -213424028: goto L_0x0331;
                case -180214626: goto L_0x031f;
                case -154616268: goto L_0x030d;
                case -29338502: goto L_0x02fb;
                case 3107: goto L_0x02e9;
                case 3355: goto L_0x02d7;
                case 3076010: goto L_0x02c5;
                case 37109963: goto L_0x02b3;
                case 63195984: goto L_0x02a1;
                case 107433883: goto L_0x028f;
                case 230323073: goto L_0x027e;
                case 418392395: goto L_0x026c;
                case 542250332: goto L_0x025a;
                case 549176928: goto L_0x0248;
                case 597473788: goto L_0x0236;
                case 754887508: goto L_0x0224;
                case 791122864: goto L_0x0213;
                case 1010584092: goto L_0x0201;
                case 1100650276: goto L_0x01ef;
                case 1141602460: goto L_0x01dd;
                case 1186014765: goto L_0x01cb;
                case 1321720943: goto L_0x01b9;
                case 1437255331: goto L_0x01a7;
                case 1637553475: goto L_0x0195;
                case 1638957285: goto L_0x0184;
                case 1686319423: goto L_0x0172;
                case 1688341040: goto L_0x0160;
                case 1799285870: goto L_0x014e;
                case 1839650832: goto L_0x013d;
                case 1875425491: goto L_0x012b;
                case 2068142375: goto L_0x0119;
                case 2072888499: goto L_0x0107;
                default: goto L_0x0101;
            }
        L_0x0101:
            r79 = r9
            r22 = r10
            goto L_0x062d
        L_0x0107:
            r22 = r10
            java.lang.String r10 = "manual_tracking_urls"
            r79 = r9
            r9 = r24
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 16
            goto L_0x062e
        L_0x0119:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 53
            goto L_0x062e
        L_0x012b:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 43
            goto L_0x062e
        L_0x013d:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 0
            goto L_0x062e
        L_0x014e:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 49
            goto L_0x062e
        L_0x0160:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 8
            goto L_0x062e
        L_0x0172:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 56
            goto L_0x062e
        L_0x0184:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 7
            goto L_0x062e
        L_0x0195:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 41
            goto L_0x062e
        L_0x01a7:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 59
            goto L_0x062e
        L_0x01b9:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 32
            goto L_0x062e
        L_0x01cb:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 67
            goto L_0x062e
        L_0x01dd:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "adapter_response_info_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 57
            goto L_0x062e
        L_0x01ef:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 12
            goto L_0x062e
        L_0x0201:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 10
            goto L_0x062e
        L_0x0213:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 6
            goto L_0x062e
        L_0x0224:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 18
            goto L_0x062e
        L_0x0236:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 28
            goto L_0x062e
        L_0x0248:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 17
            goto L_0x062e
        L_0x025a:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "consent_form_action_identifier"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 72
            goto L_0x062e
        L_0x026c:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 37
            goto L_0x062e
        L_0x027e:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 4
            goto L_0x062e
        L_0x028f:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 25
            goto L_0x062e
        L_0x02a1:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 34
            goto L_0x062e
        L_0x02b3:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 69
            goto L_0x062e
        L_0x02c5:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 23
            goto L_0x062e
        L_0x02d7:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 24
            goto L_0x062e
        L_0x02e9:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 19
            goto L_0x062e
        L_0x02fb:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 33
            goto L_0x062e
        L_0x030d:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 62
            goto L_0x062e
        L_0x031f:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 64
            goto L_0x062e
        L_0x0331:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 47
            goto L_0x062e
        L_0x0343:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 66
            goto L_0x062e
        L_0x0355:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 51
            goto L_0x062e
        L_0x0367:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 65
            goto L_0x062e
        L_0x0379:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 46
            goto L_0x062e
        L_0x038b:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 39
            goto L_0x062e
        L_0x039d:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 63
            goto L_0x062e
        L_0x03af:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 3
            goto L_0x062e
        L_0x03c0:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 27
            goto L_0x062e
        L_0x03d2:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "late_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 5
            goto L_0x062e
        L_0x03e3:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 2
            goto L_0x062e
        L_0x03f4:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 61
            goto L_0x062e
        L_0x0406:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 11
            goto L_0x062e
        L_0x0418:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 26
            goto L_0x062e
        L_0x042a:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 9
            goto L_0x062e
        L_0x043c:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 22
            goto L_0x062e
        L_0x044e:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 13
            goto L_0x062e
        L_0x0460:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 44
            goto L_0x062e
        L_0x0472:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 1
            goto L_0x062e
        L_0x0483:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 15
            goto L_0x062e
        L_0x0495:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 31
            goto L_0x062e
        L_0x04a7:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 52
            goto L_0x062e
        L_0x04b9:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 30
            goto L_0x062e
        L_0x04cb:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 35
            goto L_0x062e
        L_0x04dd:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 21
            goto L_0x062e
        L_0x04ef:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 20
            goto L_0x062e
        L_0x0501:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 55
            goto L_0x062e
        L_0x0513:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 45
            goto L_0x062e
        L_0x0525:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 68
            goto L_0x062e
        L_0x0537:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 40
            goto L_0x062e
        L_0x0549:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 38
            goto L_0x062e
        L_0x055b:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 36
            goto L_0x062e
        L_0x056d:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 14
            goto L_0x062e
        L_0x057f:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 48
            goto L_0x062e
        L_0x0591:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 54
            goto L_0x062e
        L_0x05a3:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 58
            goto L_0x062e
        L_0x05b5:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "parallel_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 73
            goto L_0x062e
        L_0x05c7:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 50
            goto L_0x062e
        L_0x05d8:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "is_consent"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 71
            goto L_0x062e
        L_0x05e9:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "recursive_server_response_data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 70
            goto L_0x062e
        L_0x05fa:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 42
            goto L_0x062e
        L_0x060b:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 29
            goto L_0x062e
        L_0x061c:
            r79 = r9
            r22 = r10
            r9 = r24
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x062d
            r9 = 60
            goto L_0x062e
        L_0x062d:
            r9 = -1
        L_0x062e:
            switch(r9) {
                case 0: goto L_0x0879;
                case 1: goto L_0x086e;
                case 2: goto L_0x0867;
                case 3: goto L_0x0860;
                case 4: goto L_0x0859;
                case 5: goto L_0x0852;
                case 6: goto L_0x0847;
                case 7: goto L_0x0840;
                case 8: goto L_0x0839;
                case 9: goto L_0x0832;
                case 10: goto L_0x082b;
                case 11: goto L_0x0824;
                case 12: goto L_0x0818;
                case 13: goto L_0x0810;
                case 14: goto L_0x0806;
                case 15: goto L_0x07fd;
                case 16: goto L_0x07f5;
                case 17: goto L_0x07ed;
                case 18: goto L_0x07e5;
                case 19: goto L_0x07da;
                case 20: goto L_0x07d4;
                case 21: goto L_0x07ce;
                case 22: goto L_0x07c8;
                case 23: goto L_0x07c2;
                case 24: goto L_0x07bc;
                case 25: goto L_0x07b6;
                case 26: goto L_0x07ac;
                case 27: goto L_0x07a2;
                case 28: goto L_0x079c;
                case 29: goto L_0x0796;
                case 30: goto L_0x0790;
                case 31: goto L_0x078a;
                case 32: goto L_0x0784;
                case 33: goto L_0x077e;
                case 34: goto L_0x0778;
                case 35: goto L_0x0772;
                case 36: goto L_0x076c;
                case 37: goto L_0x0766;
                case 38: goto L_0x075c;
                case 39: goto L_0x0756;
                case 40: goto L_0x0750;
                case 41: goto L_0x074a;
                case 42: goto L_0x0744;
                case 43: goto L_0x073e;
                case 44: goto L_0x0738;
                case 45: goto L_0x0732;
                case 46: goto L_0x072c;
                case 47: goto L_0x0726;
                case 48: goto L_0x0720;
                case 49: goto L_0x071a;
                case 50: goto L_0x0710;
                case 51: goto L_0x0709;
                case 52: goto L_0x06ff;
                case 53: goto L_0x06f9;
                case 54: goto L_0x06f3;
                case 55: goto L_0x06ed;
                case 56: goto L_0x06e7;
                case 57: goto L_0x06e1;
                case 58: goto L_0x06c9;
                case 59: goto L_0x06b1;
                case 60: goto L_0x0699;
                case 61: goto L_0x0680;
                case 62: goto L_0x067a;
                case 63: goto L_0x0674;
                case 64: goto L_0x066e;
                case 65: goto L_0x0668;
                case 66: goto L_0x0662;
                case 67: goto L_0x065c;
                case 68: goto L_0x0656;
                case 69: goto L_0x0650;
                case 70: goto L_0x064a;
                case 71: goto L_0x0644;
                case 72: goto L_0x063e;
                case 73: goto L_0x0638;
                default: goto L_0x0631;
            }
        L_0x0631:
            r10 = r81
            r81.skipValue()
            goto L_0x087f
        L_0x0638:
            java.lang.String r78 = r81.nextString()
            goto L_0x087f
        L_0x063e:
            int r77 = r81.nextInt()
            goto L_0x087f
        L_0x0644:
            boolean r76 = r81.nextBoolean()
            goto L_0x087f
        L_0x064a:
            java.lang.String r74 = r81.nextString()
            goto L_0x087f
        L_0x0650:
            java.lang.String r73 = r81.nextString()
            goto L_0x087f
        L_0x0656:
            boolean r72 = r81.nextBoolean()
            goto L_0x087f
        L_0x065c:
            java.util.List r32 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0662:
            boolean r71 = r81.nextBoolean()
            goto L_0x087f
        L_0x0668:
            java.lang.String r37 = r81.nextString()
            goto L_0x087f
        L_0x066e:
            boolean r70 = r81.nextBoolean()
            goto L_0x087f
        L_0x0674:
            org.json.JSONObject r31 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x067a:
            boolean r69 = r81.nextBoolean()
            goto L_0x087f
        L_0x0680:
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzgK
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0694
            java.lang.String r68 = r81.nextString()
            goto L_0x087f
        L_0x0694:
            r81.skipValue()
            goto L_0x070c
        L_0x0699:
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzgK
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06ad
            java.lang.String r67 = r81.nextString()
            goto L_0x087f
        L_0x06ad:
            r81.skipValue()
            goto L_0x070c
        L_0x06b1:
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzgK
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06c5
            java.lang.String r66 = r81.nextString()
            goto L_0x087f
        L_0x06c5:
            r81.skipValue()
            goto L_0x070c
        L_0x06c9:
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzgK
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06dd
            java.lang.String r65 = r81.nextString()
            goto L_0x087f
        L_0x06dd:
            r81.skipValue()
            goto L_0x070c
        L_0x06e1:
            java.lang.String r75 = r81.nextString()
            goto L_0x087f
        L_0x06e7:
            java.lang.String r64 = r81.nextString()
            goto L_0x087f
        L_0x06ed:
            org.json.JSONObject r30 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x06f3:
            boolean r63 = r81.nextBoolean()
            goto L_0x087f
        L_0x06f9:
            java.lang.String r62 = r81.nextString()
            goto L_0x087f
        L_0x06ff:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            com.google.android.gms.ads.internal.client.zzs r36 = com.google.android.gms.ads.internal.client.zzs.zza(r9)
            goto L_0x087f
        L_0x0709:
            r81.nextBoolean()
        L_0x070c:
            r10 = r81
            goto L_0x087f
        L_0x0710:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            com.google.android.gms.internal.ads.zzbtb r35 = com.google.android.gms.internal.ads.zzbtb.zza(r9)
            goto L_0x087f
        L_0x071a:
            boolean r61 = r81.nextBoolean()
            goto L_0x087f
        L_0x0720:
            java.lang.String r60 = r81.nextString()
            goto L_0x087f
        L_0x0726:
            java.lang.String r58 = r81.nextString()
            goto L_0x087f
        L_0x072c:
            int r59 = r81.nextInt()
            goto L_0x087f
        L_0x0732:
            int r57 = r81.nextInt()
            goto L_0x087f
        L_0x0738:
            boolean r56 = r81.nextBoolean()
            goto L_0x087f
        L_0x073e:
            boolean r55 = r81.nextBoolean()
            goto L_0x087f
        L_0x0744:
            org.json.JSONObject r29 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x074a:
            java.lang.String r54 = r81.nextString()
            goto L_0x087f
        L_0x0750:
            boolean r53 = r81.nextBoolean()
            goto L_0x087f
        L_0x0756:
            int r52 = r81.nextInt()
            goto L_0x087f
        L_0x075c:
            java.lang.String r9 = r81.nextString()
            int r51 = zzd(r9)
            goto L_0x087f
        L_0x0766:
            boolean r50 = r81.nextBoolean()
            goto L_0x087f
        L_0x076c:
            boolean r49 = r81.nextBoolean()
            goto L_0x087f
        L_0x0772:
            boolean r48 = r81.nextBoolean()
            goto L_0x087f
        L_0x0778:
            boolean r47 = r81.nextBoolean()
            goto L_0x087f
        L_0x077e:
            boolean r46 = r81.nextBoolean()
            goto L_0x087f
        L_0x0784:
            boolean r45 = r81.nextBoolean()
            goto L_0x087f
        L_0x078a:
            boolean r44 = r81.nextBoolean()
            goto L_0x087f
        L_0x0790:
            org.json.JSONObject r28 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x0796:
            org.json.JSONObject r27 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x079c:
            java.lang.String r43 = r81.nextString()
            goto L_0x087f
        L_0x07a2:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            com.google.android.gms.internal.ads.zzbxr r34 = com.google.android.gms.internal.ads.zzbxr.zza(r9)
            goto L_0x087f
        L_0x07ac:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            java.lang.String r42 = r9.toString()
            goto L_0x087f
        L_0x07b6:
            java.lang.String r41 = r81.nextString()
            goto L_0x087f
        L_0x07bc:
            java.lang.String r40 = r81.nextString()
            goto L_0x087f
        L_0x07c2:
            org.json.JSONObject r16 = com.google.android.gms.ads.internal.util.zzbw.zzh(r81)
            goto L_0x087f
        L_0x07c8:
            java.lang.String r39 = r81.nextString()
            goto L_0x087f
        L_0x07ce:
            java.util.List r18 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x07d4:
            java.util.List r17 = com.google.android.gms.internal.ads.zzfcs.zza(r81)
            goto L_0x087f
        L_0x07da:
            com.google.android.gms.internal.ads.zzfcx r9 = new com.google.android.gms.internal.ads.zzfcx
            r10 = r81
            r9.<init>(r10)
            r19 = r9
            goto L_0x087f
        L_0x07e5:
            r10 = r81
            java.util.List r20 = com.google.android.gms.internal.ads.zzfcs.zza(r81)
            goto L_0x087f
        L_0x07ed:
            r10 = r81
            int r38 = r81.nextInt()
            goto L_0x087f
        L_0x07f5:
            r10 = r81
            java.util.List r21 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x07fd:
            r10 = r81
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            r10 = r9
            goto L_0x0881
        L_0x0806:
            r10 = r81
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            r10 = r22
            goto L_0x00e9
        L_0x0810:
            r10 = r81
            java.util.List r8 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0818:
            r10 = r81
            org.json.JSONArray r9 = com.google.android.gms.ads.internal.util.zzbw.zze(r81)
            com.google.android.gms.internal.ads.zzbwi r15 = com.google.android.gms.internal.ads.zzbwi.zza(r9)
            goto L_0x087f
        L_0x0824:
            r10 = r81
            java.lang.String r11 = r81.nextString()
            goto L_0x087f
        L_0x082b:
            r10 = r81
            java.lang.String r12 = r81.nextString()
            goto L_0x087f
        L_0x0832:
            r10 = r81
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0839:
            r10 = r81
            java.util.List r6 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0840:
            r10 = r81
            java.util.List r5 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0847:
            r10 = r81
            int r9 = r81.nextInt()
            int r14 = zzc(r9)
            goto L_0x087f
        L_0x0852:
            r10 = r81
            java.util.List r33 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0859:
            r10 = r81
            java.util.List r4 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0860:
            r10 = r81
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x0867:
            r10 = r81
            java.util.List r2 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
            goto L_0x087f
        L_0x086e:
            r10 = r81
            java.lang.String r9 = r81.nextString()
            int r13 = zzb(r9)
            goto L_0x087f
        L_0x0879:
            r10 = r81
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbw.zzd(r81)
        L_0x087f:
            r10 = r22
        L_0x0881:
            r9 = r79
            goto L_0x00e9
        L_0x0885:
            r79 = r9
            r22 = r10
            r10 = r81
            r81.endObject()
            r0.zza = r1
            r0.zzb = r13
            r0.zzc = r2
            r0.zzd = r3
            r0.zzg = r4
            r0.zzf = r14
            r0.zzi = r5
            r0.zzj = r6
            r0.zzk = r7
            r0.zzl = r12
            r0.zzm = r11
            r0.zzn = r15
            r0.zzo = r8
            r0.zzp = r9
            r9 = r22
            r0.zzq = r9
            r11 = r21
            r0.zzr = r11
            r1 = r38
            r0.zzs = r1
            r12 = r20
            r0.zzt = r12
            r9 = r19
            r0.zzu = r9
            r13 = r18
            r0.zzv = r13
            r14 = r17
            r0.zzw = r14
            r1 = r39
            r0.zzy = r1
            r15 = r16
            r0.zzx = r15
            r1 = r40
            r0.zzz = r1
            r1 = r41
            r0.zzA = r1
            r1 = r42
            r0.zzB = r1
            r1 = r34
            r0.zzC = r1
            r1 = r43
            r0.zzD = r1
            r1 = r27
            r0.zzE = r1
            r1 = r28
            r0.zzF = r1
            r1 = r44
            r0.zzL = r1
            r1 = r45
            r0.zzM = r1
            r1 = r46
            r0.zzN = r1
            r1 = r47
            r0.zzO = r1
            r1 = r48
            r0.zzP = r1
            r1 = r49
            r0.zzQ = r1
            r1 = r50
            r0.zzR = r1
            r1 = r51
            r0.zzS = r1
            r1 = r52
            r0.zzT = r1
            r1 = r53
            r0.zzV = r1
            r1 = r54
            r0.zzW = r1
            com.google.android.gms.internal.ads.zzfdq r1 = new com.google.android.gms.internal.ads.zzfdq
            r2 = r29
            r1.<init>(r2)
            r0.zzX = r1
            r1 = r55
            r0.zzY = r1
            r1 = r56
            r0.zzZ = r1
            r1 = r57
            r0.zzaa = r1
            r1 = r58
            r0.zzab = r1
            r1 = r59
            r0.zzac = r1
            r1 = r60
            r0.zzad = r1
            r1 = r61
            r0.zzae = r1
            r1 = r35
            r0.zzaf = r1
            r1 = r36
            r0.zzag = r1
            r1 = r62
            r0.zzah = r1
            r1 = r63
            r0.zzai = r1
            r1 = r30
            r0.zzaj = r1
            r1 = r64
            r0.zzG = r1
            r1 = r65
            r0.zzH = r1
            r1 = r66
            r0.zzI = r1
            r1 = r67
            r0.zzJ = r1
            r1 = r68
            r0.zzK = r1
            r1 = r69
            r0.zzak = r1
            r1 = r31
            r0.zzal = r1
            r1 = r70
            r0.zzam = r1
            r1 = r37
            r0.zzan = r1
            r1 = r71
            r0.zzao = r1
            r1 = r32
            r0.zze = r1
            r1 = r72
            r0.zzU = r1
            r1 = r73
            r0.zzap = r1
            r1 = r74
            r0.zzaq = r1
            r1 = r75
            r0.zzar = r1
            r1 = r76
            r0.zzas = r1
            r1 = r77
            r0.zzat = r1
            r1 = r33
            r0.zzh = r1
            r1 = r78
            r0.zzau = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcr.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
