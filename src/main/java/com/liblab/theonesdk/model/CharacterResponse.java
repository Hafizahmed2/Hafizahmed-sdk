

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

/**
 * This is a model class for CharacterResponse type.
 */
public class CharacterResponse {
    private List<CharacterDoc> docs;
    private int total;
    private int limit;
    private int offset;
    private int page;
    private int pages;

    /**
     * Default constructor.
     */
    public CharacterResponse() {
    }

    /**
     * Initialization constructor.
     * @param  docs  List of CharacterDoc value for docs.
     * @param  total  int value for total.
     * @param  limit  int value for limit.
     * @param  offset  int value for offset.
     * @param  page  int value for page.
     * @param  pages  int value for pages.
     */
    public CharacterResponse(
            List<CharacterDoc> docs,
            int total,
            int limit,
            int offset,
            int page,
            int pages) {
        this.docs = docs;
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.page = page;
        this.pages = pages;
    }

    /**
     * Getter for Docs.
     * @return Returns the List of CharacterDoc
     */
    @JsonGetter("docs")
    public List<CharacterDoc> getDocs() {
        return docs;
    }

    /**
     * Setter for Docs.
     * @param docs Value for List of CharacterDoc
     */
    @JsonSetter("docs")
    public void setDocs(List<CharacterDoc> docs) {
        this.docs = docs;
    }

    /**
     * Getter for Total.
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for Limit.
     * @return Returns the int
     */
    @JsonGetter("limit")
    public int getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * @param limit Value for int
     */
    @JsonSetter("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Getter for Offset.
     * @return Returns the int
     */
    @JsonGetter("offset")
    public int getOffset() {
        return offset;
    }

    /**
     * Setter for Offset.
     * @param offset Value for int
     */
    @JsonSetter("offset")
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Getter for Page.
     * @return Returns the int
     */
    @JsonGetter("page")
    public int getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * @param page Value for int
     */
    @JsonSetter("page")
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Getter for Pages.
     * @return Returns the int
     */
    @JsonGetter("pages")
    public int getPages() {
        return pages;
    }

    /**
     * Setter for Pages.
     * @param pages Value for int
     */
    @JsonSetter("pages")
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Converts this CharacterResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CharacterResponse [" + "docs=" + docs + ", total=" + total + ", limit=" + limit
                + ", offset=" + offset + ", page=" + page + ", pages=" + pages + "]";
    }

    /**
     * Builds a new {@link CharacterResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CharacterResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(docs, total, limit, offset, page, pages);
        return builder;
    }

    /**
     * Class to build instances of {@link CharacterResponse}.
     */
    public static class Builder {
        private List<CharacterDoc> docs;
        private int total;
        private int limit;
        private int offset;
        private int page;
        private int pages;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  docs  List of CharacterDoc value for docs.
         * @param  total  int value for total.
         * @param  limit  int value for limit.
         * @param  offset  int value for offset.
         * @param  page  int value for page.
         * @param  pages  int value for pages.
         */
        public Builder(List<CharacterDoc> docs, int total, int limit, int offset, int page,
                int pages) {
            this.docs = docs;
            this.total = total;
            this.limit = limit;
            this.offset = offset;
            this.page = page;
            this.pages = pages;
        }

        /**
         * Setter for docs.
         * @param  docs  List of CharacterDoc value for docs.
         * @return Builder
         */
        public Builder docs(List<CharacterDoc> docs) {
            this.docs = docs;
            return this;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  int value for limit.
         * @return Builder
         */
        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for offset.
         * @param  offset  int value for offset.
         * @return Builder
         */
        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  int value for page.
         * @return Builder
         */
        public Builder page(int page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for pages.
         * @param  pages  int value for pages.
         * @return Builder
         */
        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }

        /**
         * Builds a new {@link CharacterResponse} object using the set fields.
         * @return {@link CharacterResponse}
         */
        public CharacterResponse build() {
            return new CharacterResponse(docs, total, limit, offset, page, pages);
        }
    }
}
