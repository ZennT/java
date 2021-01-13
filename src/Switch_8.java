
public class Switch_8 {
    // Switch evaluates the expression and compares it with values (can be expressions) of each case label
    // If the value matches a certain case label, then all the statements of the matching case label are executed.
    public static void main(String[] args) {

//        int season_number = 4; // int season_number = 6 --> prints "invalid season"
//        String season;
//        // variable I want to compare is written after switch
//        switch (season_number){
//            // after case variable in compare edilmesini istedigim value
//            case 1 :
//                season = "Fall";
//                break; // break used to exit
//            case 2 :
//                season = "Winter";
//                break;
//            case 3 :
//                season = "Spring";
//                break;
//            case 4 :
//                season = "Summer";
//                break;
//            default :
//                season = "Invalid season";
//                break;
//        }
//        System.out.println("The season is " + season);

        // WHY USE SWITCH?
        // - you can follow many different paths with switch
        // - the syntax of switch is shorter
        // - it is easier to read


        int month_number = 1;
        switch(month_number){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            default:  // default is like else. if none of the statements is true then default runs
                System.out.println("not Jan, Feb, Mar, Apr");
                break;

        }

    }
}
