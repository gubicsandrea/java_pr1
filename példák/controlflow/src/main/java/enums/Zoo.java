package enums;

public class Zoo {

    public String /*void*/ getOpeningHours(Season season){
//        switch (season){
//            case SPRING:
//            case FALL:
//                System.out.println("9:00-18:00"); break;
//            case SUMMER:
//                System.out.println("08:00-20:00"); break;
//            case WINTER:
//                System.out.println("10:00-17:00"); break;
//        }
        return season.getOpeningHours();
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getOpeningHours(Season.SPRING));
    }
}
