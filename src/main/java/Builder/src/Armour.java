package Builder.src;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public enum Armour {
    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain mail"),
    PLATE_MAIL("plate mail");

    private final String title; // this has the title of the particular cloth which can be directly printed using
                                // tostring, Here all args constructor is defining the necessary parameters

    @Override
    public String toString() {
        return title;
    }
}
