package constants;

import java.util.Map;
import java.util.Optional;

public class GameGenresRegistry {
    private static final Map<String, String> GENRES = Map.of(
            "CASUAL", "Казуальные",
            "MATCH3", "Три в ряд",
            "FARM", "Фермы"
    );

    public static String getGenre(String name){
        return Optional.ofNullable(GENRES.get(name)).orElseThrow(
                () -> new IllegalArgumentException("Unknown genre " + name));
    }
}