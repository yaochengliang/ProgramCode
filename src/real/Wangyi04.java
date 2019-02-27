package real;

import java.util.Scanner;

/**
 * 题目描述
 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 1、将a_i放入b序列的末尾
 2、逆置b序列
 小易需要你计算输出操作n次之后的b序列。
 输入描述:
 输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
 第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。
 输出描述:
 在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
 示例1
 输入
 复制
 4
 1 2 3 4
 输出
 复制
 4 2 1 3
 */

public class Wangyi04 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.nextLine());
//        String line = in.nextLine();
        int n = 727;
        String line = "1000 93169736 388174289 137439284 835599172 519716071 844991526 256198449 15598686 967089246 712717026 764251594 676847651 557592198 980919925 882200034 908872550 369766739 999391602 98030205 59655342 338427001 51403482 649895880 698226518 242440818 719328345 211540383 273781296 177764929 545408726 224252486 970710295 294661806 283683460 454215880 849413722 418118976 759136648 609296109 237675067 78246227 617323803 660636942 627607782 557296588 307569949 127973092 5605175 302852913 305643979 970450007 214968684 911177734 458288581 579822725 592727567 943063783 289180952 508767103 716301414 877518594 684805409 952623368 43336169 939993206 221600841 708690789 21784461 852194615 59431040 863550581 793107019 111649982 393518574 764524105 754951312 926292886 888556477 160406279 649332746 616546546 689201847 36134258 156559261 417010630 104013180 97827602 363516859 829852076 565037714 209150742 558769233 288510700 128743621 716479127 923878760 323551510 294612944 255438404 333445675 436624702 192723293 488024353 778231556 207846393 465917129 736788719 610270209 222483169 298570534 198660477 697049501 580647500 569819110 113178375 104394539 857855952 927262953 12603370 16937115 194250401 384324745 508157617 62604800 79370217 973849488 160965960 672978147 740326458 146528888 694761154 775105117 348877295 743319333 848633710 193359174 644879507 139907740 82276362 425304622 62183316 876413079 284283980 957220932 5183025 650228804 998712892 428369470 33476124 578457710 273240579 827352545 150588068 990901288 135243509 792935815 381708001 832719218 360969427 171856814 31967683 409936431 674056241 887004562 54196060 340114092 843559577 811751723 147599070 353957205 429042245 810408736 991315256 650352744 579783756 292280653 858812860 623125111 378972736 105760597 987851219 619362776 776939223 316947201 965141225 977561362 269406515 19769729 202848596 219805183 386816419 583533242 678361023 223031638 133775851 748327926 483215450 411893774 358865337 108616761 746759333 682655241 174488144 307058053 114471608 571946522 568391282 945014718 73312214 650250967 16701364 172445569 337238380 549086805 557679054 86203648 859207367 18174741 313172691 803977418 481357402 602957165 73225609 780637888 996362671 582910769 160896969 513446410 904519224 217860655 124410450 464844619 890982325 336465744 655316857 614273783 938558330 875443673 964325092 145715913 708970789 78272098 259159122 383505916 778484143 158108808 897464717 911845738 740992152 390408289 822550216 42223151 413368856 380764747 11834769 338467059 724658288 952084279 779823356 398446651 838852011 355606322 228464253 97939335 93929743 69688634 671262601 971915894 22789954 217141221 917785094 986522104 548742019 412333115 945913514 146991057 872500949 105108127 113711233 470204357 777785717 511586330 854409369 628095872 525195699 599302501 571808455 188361438 192771366 148503617 524293105 668812094 795455460 134213645 663880743 311596367 435008783 951260071 605239960 785455528 362059565 106915582 72331291 989242213 375478817 365522433 177795942 66644217 43353610 85640446 544932432 809113816 702431286 837994821 774178099 800871298 963889737 271155369 347987849 33807362 57628904 639821887 828812858 71748542 577892936 725523618 256278638 215851562 717322751 70281799 110189943 831468287 811408580 822845610 918964237 122520613 560103796 243674571 980178546 513766485 989052455 126678336 926498975 264348428 907847400 112918443 237706131 807360297 502829933 507511564 734788842 565097244 62187805 513386193 685430683 931206673 77217422 151562275 391550583 900754073 361477208 909176071 176076892 884836856 128783317 945176290 434347749 578679868 712082791 49103606 650585594 552831481 69939176 794176123 107233156 321851637 642134844 254996933 149072097 488801877 961175542 898320238 51180234 631207547 136026249 270566535 981851624 508879598 105016163 922577354 718635916 458788062 30160235 96928953 292308645 181790757 635506865 173198455 106091500 461392068 846016137 503987772 846980236 675214136 813371582 248260450 100140676 23119440 666866551 308968964 225919502 277982218 270205701 212281880 851219493 57446184 716330494 573287576 632649390 539740011 232418527 778407974 232441494 371435765 133424173 73105299 906071365 327869256 848525968 884528096 27399869 948097825 351484035 812146995 141463211 100768626 46678277 690270384 667682794 142663183 941345207 469845178 183515205 346511921 643184161 710998576 947033502 436255128 630765438 295434874 184714032 20360840 754738007 843264467 146805247 44559573 26907764 60202256 940476011 893653535 927314205 81017156 943687272 385247409 982985936 452929981 712145699 899376940 483817925 154777933 543001992 221958372 275263365 671599917 405756387 287017084 440838204 142091056 915541306 782399187 740765328 80166037 671315768 718010016 883726419 793021481 28517885 204218492 414305716 887163816 376272969 473428146 479937687 364127277 706234236 329666061 982656545 359306385 931375909 626599580 146819819 727944686 144979221 64806580 429981031 408715862 634789528 1817378 272879566 54774348 469465920 251776940 865224568 10519117 139613874 438237794 386673126 529712860 564321205 51685861 539345948 258874049 94272721 746174008 435032554 557800690 983056253 280242731 607942046 102258343 107526710 167667843 287871015 760470992 560779247 504056224 997453000 728201096 159494797 362440301 63494593 440209148 306965099 699677377 650202845 562419979 162551537 404483375 366340870 48364719 909992245 654106359 596786720 445771550 304975045 819599573 842890131 297791036 337044542 438735186 510910951 33711329 236580851 15110738 1576729 730280539 955976368 769653769 69868280 188584207 641882655 311423704 473523967 735896165 848522082 819216094 840209519 341901739 823771648 95994305 409043816 497240043 47510802 236089686 202551524 521883373 970635663 187805429 437862691 879273015 899566676 525227230 129244018 536716918 169923426 542748850 616873141 528811649 450053457 404025643 908668665 238038838 749694483 828618832 165258629 805422032 138664783 312229464 131030405 495752169 17637670 669533560 829211218 531555543 115018259 169575291 134094846 814709597 261442085 98559411 571107418 143450814 501178964 676962992 141623316 644169714 888297249 98528577 52880380 495295380 782835888 637948094 400744965 811909763 656293703 852255329 139389013 953966261 991018703 168175189 431922071 819520437 867356448 333804278 814192960 168258614 479540977 139073248 941871200 927296363 781146662 164414123 289690150 476923301 240949303 273755857 104716725 977868760 140877407 992579033 415816313 505963831 491844075 758811222 582312268 632287475 899485547 161692127 992765034 601472895 542398414 815041161 746092361 210275072 128030720 33696746 553010861 937295189 327690778 143813516 593134046 184821748 37765074 2901431 958184092 220165391 205402756 197899363 435403316 346746683 293861801 870384954 694297092 772571093 709208867 932165397 803601092 391875839 717859302 498159868 681645470 383136123 212845555 380465561 425866608 770063783 725544059 599830525 856373235 422537029 644404352 743912243 283275267 36167070 122073389 840566038 245970700 916513003 81325137 470451576 992333225 579488551 418716090 850391989 34488338 6178";
//时间复杂度过大
        String[] inputs = line.split(" ");
//
//        Point p = new Point(Integer.parseInt(inputs[0]));
//        for (int i=1; i<n; i++){
//            add(p, new Point(Integer.parseInt(inputs[i])));
//            p = reverse(p);
//        }
//
//        StringBuffer sb = new StringBuffer();
//        while (p != null){
//            sb.append(p.value);
//            sb.append(" ");
//            p = p.next;
//        }
//
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb.toString());

        //找数学规律 n n-2 n-4 ... 1 3 n-1 （注意n是奇数还是偶数）
        StringBuffer sb = new StringBuffer();
        if (n%2 == 0){
            for (int i=n-1; i>=0; i-=2){
                sb.append(inputs[i]);
                sb.append(" ");
            }
            for (int i=0; i<n; i+=2){
                sb.append(inputs[i]);
                sb.append(" ");
            }
        } else {
            for (int i=n-1; i>=0; i-=2){
                sb.append(inputs[i]);
                sb.append(" ");
            }
            for (int i=1; i<n; i+=2){
                sb.append(inputs[i]);
                sb.append(" ");
            }
        }

        System.out.println(sb.deleteCharAt(sb.length()-1).toString());
    }

    public static Point reverse(Point p){
        if (p == null){
            return null;
        }
        Point node = p;
        Point newHead = null;
        Point pre = null;
        while (node != null){
            Point next = node.next;
            if (next == null){
                newHead = node;
            }

            node.next = pre;
            pre = node;
            node = next;
        }
        return newHead;
    }

    public static Point add(Point head, Point p){
        Point node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = p;
        return head;
    }
}

class Point{
    int value;
    Point next = null;

    public Point(int value){
        this.value = value;
    }
}
