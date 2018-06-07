package ennums;

public class EnumMain {

    public static void main(String[] args) {
        TrafficLight light = TrafficLight.GREEN;
        light = TrafficLight.RED;
        light = TrafficLight.valueOf("GREEN");
        System.out.println(light.name() + light.ordinal());
        light = light.next();
        System.out.println(light.name() + light.ordinal());
    }
}
