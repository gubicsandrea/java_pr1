package enums;

public enum TrafficLight {
    RED(20){
        public TrafficLight next(){
            return RED_YELLOW;
        }
    }, YELLOW(2){
        public TrafficLight next(){
            return RED;
        }
    }, GREEN(20){
        public TrafficLight next(){
            return YELLOW;
        }
    }, RED_YELLOW(3){
        public TrafficLight next(){
            return GREEN;
        }
    };
    private int time;

    private TrafficLight(int time) {
        this.time = time;
    }

    public abstract TrafficLight next();
}
