package Builder.src;

public enum WEAPON {
    MACHINE_GUN, TANK, GRANADE, DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString(){
        return name().toString();
    }
}
