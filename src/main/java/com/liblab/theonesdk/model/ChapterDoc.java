

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ChapterDoc type.
 */
public class ChapterDoc {
    private String id;
    private String chapterName;

    /**
     * Default constructor.
     */
    public ChapterDoc() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  chapterName  String value for chapterName.
     */
    public ChapterDoc(
            String id,
            String chapterName) {
        this.id = id;
        this.chapterName = chapterName;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("_id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for ChapterName.
     * @return Returns the String
     */
    @JsonGetter("chapterName")
    public String getChapterName() {
        return chapterName;
    }

    /**
     * Setter for ChapterName.
     * @param chapterName Value for String
     */
    @JsonSetter("chapterName")
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    /**
     * Converts this ChapterDoc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChapterDoc [" + "id=" + id + ", chapterName=" + chapterName + "]";
    }

    /**
     * Builds a new {@link ChapterDoc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChapterDoc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, chapterName);
        return builder;
    }

    /**
     * Class to build instances of {@link ChapterDoc}.
     */
    public static class Builder {
        private String id;
        private String chapterName;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  chapterName  String value for chapterName.
         */
        public Builder(String id, String chapterName) {
            this.id = id;
            this.chapterName = chapterName;
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
         * Setter for chapterName.
         * @param  chapterName  String value for chapterName.
         * @return Builder
         */
        public Builder chapterName(String chapterName) {
            this.chapterName = chapterName;
            return this;
        }

        /**
         * Builds a new {@link ChapterDoc} object using the set fields.
         * @return {@link ChapterDoc}
         */
        public ChapterDoc build() {
            return new ChapterDoc(id, chapterName);
        }
    }
}
