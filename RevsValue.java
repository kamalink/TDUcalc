
class RevsValue {
    static double revsValue(Objects o) {
        if (o.getMaxRevs() > 4 && o.getMaxRevs() < 5) {
            return revsValueFrom4To5(o);
        } else if(o.getMaxRevs() >= 5 && o.getMaxRevs() < 6){
            return revsValueFrom5To6(o);
        } else if(o.getMaxRevs() >= 6 && o.getMaxRevs() < 7){
            return revsValueFrom6To7(o);
        } else if(o.getMaxRevs() >= 7 && o.getMaxRevs() < 8){
            return revsValueFrom7To8(o);
        } else if(o.getMaxRevs() >= 8 && o.getMaxRevs() <= 9){
            return revsValueFrom8To9(o);
        }
        return 0;}
    private static double revsValueFrom4To5(Objects o) {
        if (o.getMaxRevs() == 4.5) {
            return 137;
        } else if (o.getMaxRevs() == 4.6) {
            return 136;
        } else if (o.getMaxRevs() == 4.7) {
            return 135;
        } else if (o.getMaxRevs() == 4.8) {
            return 134;
        } else if (o.getMaxRevs() == 4.9) {
            return 133;
        }
        return 0;}
    private static double revsValueFrom5To6(Objects o) {
        if (o.getMaxRevs() == 5.0) {
            return 132;
        } else if (o.getMaxRevs() == 5.1) {
            return 130;
        } else if (o.getMaxRevs() == 5.2) {
            return 129;
        } else if (o.getMaxRevs() == 5.3) {
            return 127;
        } else if (o.getMaxRevs() == 5.4) {
            return 126;
        } else if (o.getMaxRevs() == 5.5) {
            return 124;
        } else if (o.getMaxRevs() == 5.6) {
            return 123;
        } else if (o.getMaxRevs() == 5.7) {
            return 122;
        } else if (o.getMaxRevs() == 5.8) {
            return 121;
        } else if (o.getMaxRevs() == 5.9) {
            return 120;
        }
        return 0;}private static double revsValueFrom6To7(Objects o) {
        if (o.getMaxRevs() == 6.0) {
            return 119;
        } else if (o.getMaxRevs() == 6.1) {
            return 117;
        } else if (o.getMaxRevs() == 6.2) {
            return 116;
        } else if (o.getMaxRevs() == 6.3) {
            return 114;
        } else if (o.getMaxRevs() == 6.4) {
            return 113;
        } else if (o.getMaxRevs() == 6.5) {
            return 111;
        } else if (o.getMaxRevs() == 6.6) {
            return 110;
        } else if (o.getMaxRevs() == 6.7) {
            return 109;
        } else if (o.getMaxRevs() == 6.8) {
            return 108;
        } else if (o.getMaxRevs() == 6.9) {
            return 107;
        }
        return 0;}
    private static double revsValueFrom7To8(Objects o) {
        if (o.getMaxRevs() == 7.0) {
            return 106;
        } else if (o.getMaxRevs() == 7.1) {
            return 104;
        } else if (o.getMaxRevs() == 7.2) {
            return 103;
        } else if (o.getMaxRevs() == 7.3) {
            return 101;
        } else if (o.getMaxRevs() == 7.4) {
            return 100;
        } else if (o.getMaxRevs() == 7.5) {
            return 98;
        } else if (o.getMaxRevs() == 7.6) {
            return 97;
        } else if (o.getMaxRevs() == 7.7) {
            return 96;
        } else if (o.getMaxRevs() == 7.8) {
            return 95;
        } else if (o.getMaxRevs() == 7.9) {
            return 94;
        }
        return 0;}
    private static double revsValueFrom8To9(Objects o) {
        if (o.getMaxRevs() == 8.0) {
            return 93;
        } else if (o.getMaxRevs() == 8.1) {
            return 91;
        } else if (o.getMaxRevs() == 8.2) {
            return 90;
        } else if (o.getMaxRevs() == 8.3) {
            return 88;
        } else if (o.getMaxRevs() == 8.4) {
            return 87;
        } else if (o.getMaxRevs() == 8.5) {
            return 85;
        } else if (o.getMaxRevs() == 8.6) {
            return 84;
        } else if (o.getMaxRevs() == 8.7) {
            return 83;
        } else if (o.getMaxRevs() == 8.8) {
            return 82;
        } else if (o.getMaxRevs() == 8.9) {
            return 81;
        } else if(o.getMaxRevs() == 9.0){
            return 80;
        }
        return 0;}
}






