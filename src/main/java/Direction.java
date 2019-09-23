public enum Direction {
    DOWN("вниз"),
    UP("вверх"),
    STOP("стоп");

    private String translate;

    Direction(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
