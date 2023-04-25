package Builder.src;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum HairType {
    BALD("bald"),
    SHORT_HAIR("short_hair"),
    CURLY("curly"),

    SPIKES("spikes");

    private final String result;

    @Override
    public String toString() {
        return result;
    }
}
