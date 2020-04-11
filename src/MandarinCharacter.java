class MandarinCharacter {

    private String mainCharacter;
    private int strokes;
    private String alternativeCharacters;
    private String fullPinyin;
    private String rawpinyin;
    private String intpinyin;
    private int tone;
    private String english;
    private String german;

    MandarinCharacter(String mainCharacter, int strokes, String alternativeCharacters, String fullPinyin, String rawpinyin, String intpinyin, int tone, String english, String german) {
        this.mainCharacter = mainCharacter;
        this.strokes = strokes;
        this.alternativeCharacters = alternativeCharacters;
        this.fullPinyin = fullPinyin;
        this.rawpinyin = rawpinyin;
        this.intpinyin = intpinyin;
        this.tone = tone;
        this.english = english;
        this.german = german;
    }


    String getMainCharacter() {
        return mainCharacter;
    }

    public int getStrokes() {
        return strokes;
    }

    public String getAlternativeCharacters() {
        return alternativeCharacters;
    }

    public String getFullPinyin() {
        return fullPinyin;
    }

    public String getRawpinyin() {
        return rawpinyin;
    }

    public String getIntpinyin() {
        return intpinyin;
    }

    public int getTone() {
        return tone;
    }

    public String getEnglish() {
        return english;
    }

    public String getGerman() {
        return german;
    }
}
