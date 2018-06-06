package controlflow;

public class Main {
    public static void main(String[] args) {
        try {
            Characters[] characters = {new Characters('s', 7),
                                        new Characters('a', 2),
                                        new Characters('b', 4)};
            System.out.println(characters[0].getCount());
            System.out.println(Characters.getCount());
            for (int i = 0; i < characters.length; i++) {
                String eredmeny = characters [i].print();
                System.out.println(eredmeny);
            }
            characters = new Characters[5];
            System.out.println(Characters.getCount());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
