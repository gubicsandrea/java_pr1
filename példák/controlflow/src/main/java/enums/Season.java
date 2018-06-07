package enums;

public enum Season {
    SPRING{
        public Season next(){
            return SUMMER;
        }

        @Override
        public Season previous() {
            return WINTER;
        }
    }, SUMMER {
        public Season next(){
            return FALL;
        }

        @Override
        public Season previous() {
            return SPRING;
        }

        @Override
        public String getOpeningHours() {
            return "08:00-20:00";
        }
    }, FALL{
        @Override
        public Season next() {
            return WINTER;
        }

        @Override
        public Season previous() {
            return SUMMER;
        }
    }, WINTER{
        @Override
        public Season next() {
            return SPRING;
        }

        @Override
        public Season previous() {
            return FALL;
        }

        @Override
        public String getOpeningHours() {
            return "10:00-17:00";
        }
    };

    public abstract Season next();
    public abstract Season previous();
    public String getOpeningHours(){
        return "9:00-18:00";
    }
}
