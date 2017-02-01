
public class torqueValue {
    double TorqueValue(Objects o){
        if(o.getTorque()>=102 && o.getTorque()<=138){
            return 4;
        } else if(o.getTorque()>=139 && o.getTorque()<=175){
            return 3.9;
        } else if(o.getTorque()>=176 && o.getTorque()<=212){
            return 3.8;
        } else if(o.getTorque()>=213 && o.getTorque()<=249){
            return 3.7;
        } else if(o.getTorque()>=250 && o.getTorque()<=286){
            return 3.6;
        } else if(o.getTorque()>=287 && o.getTorque()<=323){
            return 3.5;
        } else if(o.getTorque()>=324 && o.getTorque()<=360){
            return 3.4;
        } else if(o.getTorque()>=361 && o.getTorque()<=397){
            return 3.3;
        } else if(o.getTorque()>=398 && o.getTorque()<=434){
            return 3.2;
        } else if(o.getTorque()>=435 && o.getTorque()<=471){
            return 3.1;
        } else if(o.getTorque()>=472 && o.getTorque()<=508){
            return 3;
        } else if(o.getTorque()>=509 && o.getTorque()<=545){
            return 2.9;
        } else if(o.getTorque()>=546 && o.getTorque()<=582){
            return 2.8;
        } else if(o.getTorque()>=583 && o.getTorque()<=619){
            return 2.7;
        } else if(o.getTorque()>=620 && o.getTorque()<=656){
            return 2.6;
        } else if(o.getTorque()>=657 && o.getTorque()<=693){
            return 2.5;
        } else if(o.getTorque()>=694 && o.getTorque()<=730){
            return 2.4;
        } else if(o.getTorque()>=731 && o.getTorque()<=767){
            return 2.3;
        } else if(o.getTorque()>=768 && o.getTorque()<=804){
            return 2.2;
        } else if(o.getTorque()>=805 && o.getTorque()<=841){
            return 2.1;
        } else if(o.getTorque()>=139 && o.getTorque()<=175){
            return 2;
        } else if(o.getTorque()>=842 && o.getTorque()<=878){
            return 1.9;
        } else if(o.getTorque()>=916 && o.getTorque()<=952){
            return 1.8;
        } else if(o.getTorque()>=953 && o.getTorque()<=989){
            return 1.7;
        } else if(o.getTorque()>=990 && o.getTorque()<=1026){
            return 1.6;
        } else if(o.getTorque()>=1027 && o.getTorque()<=1063){
            return 1.5;
        } else if(o.getTorque()>=1064 && o.getTorque()<=1100){
            return 1.4;
        } else if(o.getTorque()>=1101 && o.getTorque()<=1137){
            return 1.3;
        }
        return 0;
    }
}
