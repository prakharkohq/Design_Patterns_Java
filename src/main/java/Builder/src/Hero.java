package Builder.src;

// We dont want to change this class instance variable so we change this to a final class
public final class Hero {
    /**
     * We will create a Builder class inside Hero class which will give APP options to choose from variables
     * */
    private final Profession profession;
    private final WEAPON weapon;
    private final HairColor hairColor;
    private final HairType hairType;
    private final Armour armour;
    public WEAPON getWeapon() {
        return weapon;
    }

    public HairColor getHairColor() {
        return hairColor;
    }
    public HairType getHairType() {
        return hairType;
    }
    public Armour getArmour() {
        return armour;
    }

    public Hero(Builder builder){
        this.profession = builder.profession;
        this.weapon = builder.weapon;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.armour = builder.armour;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ").append(profession);
        if (weapon != null || hairColor != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (weapon != null) {
                sb.append(weapon).append(' ');
            }
        }
        return sb.toString();
    }

    // We create this class as static to make sure this class is accessible from outside
    public static class Builder{
        // here there would be certain variable which will be mandatory jinko constuctor mein bhi rakha jaayega
        private final Profession profession;
        private final Armour armour;
        private HairType hairType;
        private HairColor hairColor;

        private WEAPON weapon;

        public Builder(Profession profession, Armour armour){
            if (profession == null || armour == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.armour = armour;
        }
        public Builder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }
        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withWeapon(WEAPON weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }


}
