

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for QuoteDoc type.
 */
public class QuoteDoc {
    private String dialog;
    private String movie;
    private String character;
    private String id;

    /**
     * Default constructor.
     */
    public QuoteDoc() {
    }

    /**
     * Initialization constructor.
     * @param  dialog  String value for dialog.
     * @param  movie  String value for movie.
     * @param  character  String value for character.
     * @param  id  String value for id.
     */
    public QuoteDoc(
            String dialog,
            String movie,
            String character,
            String id) {
        this.dialog = dialog;
        this.movie = movie;
        this.character = character;
        this.id = id;
    }

    /**
     * Getter for Dialog.
     * @return Returns the String
     */
    @JsonGetter("dialog")
    public String getDialog() {
        return dialog;
    }

    /**
     * Setter for Dialog.
     * @param dialog Value for String
     */
    @JsonSetter("dialog")
    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    /**
     * Getter for Movie.
     * @return Returns the String
     */
    @JsonGetter("movie")
    public String getMovie() {
        return movie;
    }

    /**
     * Setter for Movie.
     * @param movie Value for String
     */
    @JsonSetter("movie")
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * Getter for MCharacter.
     * @return Returns the String
     */
    @JsonGetter("character")
    public String getMCharacter() {
        return character;
    }

    /**
     * Setter for MCharacter.
     * @param character Value for String
     */
    @JsonSetter("character")
    public void setMCharacter(String character) {
        this.character = character;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this QuoteDoc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QuoteDoc [" + "dialog=" + dialog + ", movie=" + movie + ", character=" + character
                + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link QuoteDoc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QuoteDoc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dialog, movie, character, id);
        return builder;
    }

    /**
     * Class to build instances of {@link QuoteDoc}.
     */
    public static class Builder {
        private String dialog;
        private String movie;
        private String character;
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dialog  String value for dialog.
         * @param  movie  String value for movie.
         * @param  character  String value for character.
         * @param  id  String value for id.
         */
        public Builder(String dialog, String movie, String character, String id) {
            this.dialog = dialog;
            this.movie = movie;
            this.character = character;
            this.id = id;
        }

        /**
         * Setter for dialog.
         * @param  dialog  String value for dialog.
         * @return Builder
         */
        public Builder dialog(String dialog) {
            this.dialog = dialog;
            return this;
        }

        /**
         * Setter for movie.
         * @param  movie  String value for movie.
         * @return Builder
         */
        public Builder movie(String movie) {
            this.movie = movie;
            return this;
        }

        /**
         * Setter for character.
         * @param  character  String value for character.
         * @return Builder
         */
        public Builder character(String character) {
            this.character = character;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link QuoteDoc} object using the set fields.
         * @return {@link QuoteDoc}
         */
        public QuoteDoc build() {
            return new QuoteDoc(dialog, movie, character, id);
        }
    }
}
