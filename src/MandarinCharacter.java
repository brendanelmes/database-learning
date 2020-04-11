class MandarinCharacter {

    private String mainCharacter;
    private int strokes;
    private String alternativeCharacters;
    private String fullPinyin;
    private String rawPinyin;
    private String intPinyin;
    private int tone;
    private String english;
    private String german;

    MandarinCharacter(String mainCharacter, int strokes, String alternativeCharacters, String fullPinyin, String rawPinyin, String intPinyin, int tone, String english, String german) {
        this.mainCharacter = mainCharacter;
        this.strokes = strokes;
        this.alternativeCharacters = alternativeCharacters;
        this.fullPinyin = fullPinyin;
        this.rawPinyin = rawPinyin;
        this.intPinyin = intPinyin;
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

    String getAlternativeCharacters() {
        return alternativeCharacters;
    }

    String getFullPinyin() {
        return fullPinyin;
    }

    String getRawPinyin() {
        return rawPinyin;
    }

    String getIntPinyin() {
        return intPinyin;
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
