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

    int getStrokes() {
        return strokes;
    }

    public String getAlternativeCharacters() {
        return alternativeCharacters;
    }

    String getFullPinyin() {
        return fullPinyin;
    }

    String getRawpinyin() {
        return rawpinyin;
    }

    String getIntpinyin() {
        return intpinyin;
    }

    int getTone() {
        return tone;
    }

    String getEnglish() {
        return english;
    }

    String getGerman() {
        return german;
    }
}
