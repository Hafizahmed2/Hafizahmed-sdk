

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BookDoc type.
 */
public class BookDoc {
    private String id;
    private String name;

    /**
     * Default constructor.
     */
    public BookDoc() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     */
    public BookDoc(
            String id,
            String name) {
        this.id = id;
        this.name = name;
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
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this BookDoc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BookDoc [" + "id=" + id + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link BookDoc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BookDoc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name);
        return builder;
    }

    /**
     * Class to build instances of {@link BookDoc}.
     */
    public static class Builder {
        private String id;
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  name  String value for name.
         */
        public Builder(String id, String name) {
            this.id = id;
            this.name = name;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link BookDoc} object using the set fields.
         * @return {@link BookDoc}
         */
        public BookDoc build() {
            return new BookDoc(id, name);
        }
    }
}
