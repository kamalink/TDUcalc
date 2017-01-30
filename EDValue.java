
class EDValue {

    static double edValue(Objects o) {
        if (o.getEngineDisplacement() >= 1.4 && o.getEngineDisplacement() <= 2) {
            return edValueFrom1To2(o);
        } else if (o.getEngineDisplacement() > 2 && o.getEngineDisplacement() <= 3) {
            return 20;
        } else if (o.getEngineDisplacement() > 3 && o.getEngineDisplacement() <= 4) {
            return edValueFrom3To4(o);
        } else if (o.getEngineDisplacement() > 4 && o.getEngineDisplacement() < 5) {
            return edValueFrom4To5(o);
        } else if (o.getEngineDisplacement() >= 5 && o.getEngineDisplacement() <= 9) {
            return 0;
        }
        return 0;}
    private static double edValueFrom1To2(Objects o) {
        if (o.getEngineDisplacement() == 1.4) {
            return 60;
        } else if (o.getEngineDisplacement() == 1.5) {
            return 55;
        } else if (o.getEngineDisplacement() == 1.6) {
            return 45;
        } else if (o.getEngineDisplacement() == 1.7) {
            return 38;
        } else if (o.getEngineDisplacement() == 1.8) {
            return 30;
        } else if (o.getEngineDisplacement() == 1.9) {
            return 25;
        } else if (o.getEngineDisplacement() == 2.0) {
            return 20;
        }
        return 0;}
    private static double edValueFrom3To4(Objects o) {
        if (o.getEngineDisplacement() == 3.1) {
            return 19;
        } else if (o.getEngineDisplacement() == 3.2) {
            return 18;
        } else if (o.getEngineDisplacement() == 3.3) {
            return 17;
        } else if (o.getEngineDisplacement() == 3.4) {
            return 16;
        } else if (o.getEngineDisplacement() == 3.5) {
            return 15;
        } else if (o.getEngineDisplacement() == 3.6) {
            return 14;
        } else if (o.getEngineDisplacement() == 3.7) {
            return 13;
        } else if (o.getEngineDisplacement() == 3.8) {
            return 12;
        } else if (o.getEngineDisplacement() == 3.9) {
            return 11;
        } else if (o.getEngineDisplacement() == 4.0) {
            return 10;
        }
        return 0;}
    private static double edValueFrom4To5(Objects o) {
        if (o.getEngineDisplacement() == 4.1) {
            return 9;
        } else if (o.getEngineDisplacement() == 4.2) {
            return 8;
        } else if (o.getEngineDisplacement() == 4.3) {
            return 7;
        } else if (o.getEngineDisplacement() == 4.4) {
            return 6;
        } else if (o.getEngineDisplacement() == 4.5) {
            return 5;
        } else if (o.getEngineDisplacement() == 4.6) {
            return 4;
        } else if (o.getEngineDisplacement() == 4.7) {
            return 3;
        } else if (o.getEngineDisplacement() == 4.8) {
            return 2;
        } else if (o.getEngineDisplacement() == 4.9) {
            return 1;
        }
        return 0;}
}
