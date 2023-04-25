package Builder.src;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Hero mage_hero = new Hero.Builder(Profession.MAGE, Armour.CLOTHES).
                withHairColor(HairColor.BLOND).withHairType(HairType.CURLY)
                .build();
        System.out.println(mage_hero.toString());
    }




}
