package hw_3_static_final_and_access_modifiers;

public class GameSettings {
    static int maxPlayers = 11;
    final String GAME_NAME;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.GAME_NAME = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Название: " + GAME_NAME + ", текущее количество игроков: " + currentPlayers +
                ", максимальное количество игроков: " + maxPlayers);
    }
}
