package test_String_Processing;

import java.util.regex.Pattern;

class Go {
    class GoAway {
        String goAway;

        public void setGoAway(String s) {
            this.goAway = "Уходи прочь, " .concat(s);
        }
    }
    static class GoHome {
        String goHome;

        public void setGoHome(String s) {
            this.goHome = "Уходи домой, " + s;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Go myGo = new Go();
        Go.GoHome gHome = new Go.GoHome();
        gHome.setGoHome("Вася");
        System.out.println(gHome.goHome);
        Go.GoAway gAway = myGo.new GoAway();
        gAway.setGoAway("Петя");
        System.out.println(gAway.goAway);
        StringBuilder sb = new StringBuilder("A0");
        for (int i=1; i<7;i++ ){
            sb.append("P");
            sb.append(i);
            //sb.append(myGo,);
            sb.insert(3,5);
            System.out.println();

        }
        System.out.println(sb.toString());

        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(text,2);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("---------");
        String[] strings1 = pattern.split(text);
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}