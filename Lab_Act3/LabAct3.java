public class LabAct3 {

    public static void main(String[] args){

        //Number 1
        System.out.print("Number 1: ");
        System.out.println("Sum Digits: " + sumItDigits(1449));
        //Number 2
        System.out.print("Number 2: ");
        System.out.println("Insert : " + asteris("LuisaAce"));
        //Number 3
        System.out.print("Number 3: ");
        System.out.println("Bunny Ears: " + bunnyEars(2,15));
        //Number 4
        System.out.print("Number 4: ");
        System.out.println("Replaced: " + replace("xxxHHxxxxLxOxOxOx"));
    }

    // Labotory Act# 3 - Number 1
     public static int sumItDigits(int i) {
        if (i == 0) {
                return 0;
            } else {
                return (i % 10) + sumItDigits(i / 10);
            }
        }

    // Labotory Act# 3 - Number 2
    public static String asteris(String s) {
       if (s.length() <= 1) {
            return s;
        } else {
            return s.charAt(0) + "" + asteris(s.substring(1));
        }

    }
    // Laboratory Act# 3 - Number 3
    public static int bunnyEars(int ears, int bunny) {
        if (bunny == 0) {
            return 0;
        }
        return ears + bunnyEars(ears, bunny - 1);
    }

    // Laboratory Act# 3 - Number 4
    public static String replace(String s){
        if(s.equals("")){
            return ""; 
        }
        if(s.charAt(0) == 'x'){
            return "y" + replace(s.substring(1));
        }
        return s.charAt(0) + replace(s.substring(1));

    }

}
