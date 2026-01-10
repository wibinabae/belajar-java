package com.relearner.model;

public enum BookType {
    SELF_DEVELOPMENT("Pengembangan Diri"),
    NOVEL("Novel"),
    FILSAFAT("Filsafat");

    public static BookType from (String input){
        if (input == null || input.isBlank()){
            throw new IllegalArgumentException("Type Buku Wajib Diisi");
        }
        return  BookType.valueOf(input.trim().toUpperCase().replace(" ","_"));
    }
    private final String displayName;
    BookType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
