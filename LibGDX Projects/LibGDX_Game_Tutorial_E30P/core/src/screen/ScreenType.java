package screen;

public enum ScreenType {
    GAME(GameScreen.class),
    LOAD(LoadingScreen.class);


    private final Class<? extends AbstractScreen> screenClass;

    ScreenType(final Class<? extends AbstractScreen> screenClass) { this.screenClass = screenClass; }

    public Class<? extends AbstractScreen> getScreenClass() {
        return screenClass;
    }
}
