

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for MovieDoc type.
 */
public class MovieDoc {
    private String id;
    private String name;
    private int runtimeInMinutes;
    private int budgetInMillions;
    private Object boxOfficeRevenueInMillions;
    private int academyAwardNominations;
    private int academyAwardWins;
    private Object rottenTomatoesScore;

    /**
     * Default constructor.
     */
    public MovieDoc() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  runtimeInMinutes  int value for runtimeInMinutes.
     * @param  budgetInMillions  int value for budgetInMillions.
     * @param  boxOfficeRevenueInMillions  Object value for boxOfficeRevenueInMillions.
     * @param  academyAwardNominations  int value for academyAwardNominations.
     * @param  academyAwardWins  int value for academyAwardWins.
     * @param  rottenTomatoesScore  Object value for rottenTomatoesScore.
     */
    public MovieDoc(
            String id,
            String name,
            int runtimeInMinutes,
            int budgetInMillions,
            Object boxOfficeRevenueInMillions,
            int academyAwardNominations,
            int academyAwardWins,
            Object rottenTomatoesScore) {
        this.id = id;
        this.name = name;
        this.runtimeInMinutes = runtimeInMinutes;
        this.budgetInMillions = budgetInMillions;
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
        this.academyAwardNominations = academyAwardNominations;
        this.academyAwardWins = academyAwardWins;
        this.rottenTomatoesScore = rottenTomatoesScore;
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
     * Getter for RuntimeInMinutes.
     * @return Returns the int
     */
    @JsonGetter("runtimeInMinutes")
    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    /**
     * Setter for RuntimeInMinutes.
     * @param runtimeInMinutes Value for int
     */
    @JsonSetter("runtimeInMinutes")
    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    /**
     * Getter for BudgetInMillions.
     * @return Returns the int
     */
    @JsonGetter("budgetInMillions")
    public int getBudgetInMillions() {
        return budgetInMillions;
    }

    /**
     * Setter for BudgetInMillions.
     * @param budgetInMillions Value for int
     */
    @JsonSetter("budgetInMillions")
    public void setBudgetInMillions(int budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    /**
     * Getter for BoxOfficeRevenueInMillions.
     * @return Returns the Object
     */
    @JsonGetter("boxOfficeRevenueInMillions")
    public Object getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    /**
     * Setter for BoxOfficeRevenueInMillions.
     * @param boxOfficeRevenueInMillions Value for Object
     */
    @JsonSetter("boxOfficeRevenueInMillions")
    public void setBoxOfficeRevenueInMillions(Object boxOfficeRevenueInMillions) {
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
    }

    /**
     * Getter for AcademyAwardNominations.
     * @return Returns the int
     */
    @JsonGetter("academyAwardNominations")
    public int getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    /**
     * Setter for AcademyAwardNominations.
     * @param academyAwardNominations Value for int
     */
    @JsonSetter("academyAwardNominations")
    public void setAcademyAwardNominations(int academyAwardNominations) {
        this.academyAwardNominations = academyAwardNominations;
    }

    /**
     * Getter for AcademyAwardWins.
     * @return Returns the int
     */
    @JsonGetter("academyAwardWins")
    public int getAcademyAwardWins() {
        return academyAwardWins;
    }

    /**
     * Setter for AcademyAwardWins.
     * @param academyAwardWins Value for int
     */
    @JsonSetter("academyAwardWins")
    public void setAcademyAwardWins(int academyAwardWins) {
        this.academyAwardWins = academyAwardWins;
    }

    /**
     * Getter for RottenTomatoesScore.
     * @return Returns the Object
     */
    @JsonGetter("rottenTomatoesScore")
    public Object getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    /**
     * Setter for RottenTomatoesScore.
     * @param rottenTomatoesScore Value for Object
     */
    @JsonSetter("rottenTomatoesScore")
    public void setRottenTomatoesScore(Object rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    /**
     * Converts this MovieDoc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MovieDoc [" + "id=" + id + ", name=" + name + ", runtimeInMinutes="
                + runtimeInMinutes + ", budgetInMillions=" + budgetInMillions
                + ", boxOfficeRevenueInMillions=" + boxOfficeRevenueInMillions
                + ", academyAwardNominations=" + academyAwardNominations + ", academyAwardWins="
                + academyAwardWins + ", rottenTomatoesScore=" + rottenTomatoesScore + "]";
    }

    /**
     * Builds a new {@link MovieDoc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MovieDoc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, runtimeInMinutes, budgetInMillions,
                boxOfficeRevenueInMillions, academyAwardNominations, academyAwardWins,
                rottenTomatoesScore);
        return builder;
    }

    /**
     * Class to build instances of {@link MovieDoc}.
     */
    public static class Builder {
        private String id;
        private String name;
        private int runtimeInMinutes;
        private int budgetInMillions;
        private Object boxOfficeRevenueInMillions;
        private int academyAwardNominations;
        private int academyAwardWins;
        private Object rottenTomatoesScore;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  name  String value for name.
         * @param  runtimeInMinutes  int value for runtimeInMinutes.
         * @param  budgetInMillions  int value for budgetInMillions.
         * @param  boxOfficeRevenueInMillions  Object value for boxOfficeRevenueInMillions.
         * @param  academyAwardNominations  int value for academyAwardNominations.
         * @param  academyAwardWins  int value for academyAwardWins.
         * @param  rottenTomatoesScore  Object value for rottenTomatoesScore.
         */
        public Builder(String id, String name, int runtimeInMinutes, int budgetInMillions,
                Object boxOfficeRevenueInMillions, int academyAwardNominations,
                int academyAwardWins, Object rottenTomatoesScore) {
            this.id = id;
            this.name = name;
            this.runtimeInMinutes = runtimeInMinutes;
            this.budgetInMillions = budgetInMillions;
            this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
            this.academyAwardNominations = academyAwardNominations;
            this.academyAwardWins = academyAwardWins;
            this.rottenTomatoesScore = rottenTomatoesScore;
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
         * Setter for runtimeInMinutes.
         * @param  runtimeInMinutes  int value for runtimeInMinutes.
         * @return Builder
         */
        public Builder runtimeInMinutes(int runtimeInMinutes) {
            this.runtimeInMinutes = runtimeInMinutes;
            return this;
        }

        /**
         * Setter for budgetInMillions.
         * @param  budgetInMillions  int value for budgetInMillions.
         * @return Builder
         */
        public Builder budgetInMillions(int budgetInMillions) {
            this.budgetInMillions = budgetInMillions;
            return this;
        }

        /**
         * Setter for boxOfficeRevenueInMillions.
         * @param  boxOfficeRevenueInMillions  Object value for boxOfficeRevenueInMillions.
         * @return Builder
         */
        public Builder boxOfficeRevenueInMillions(Object boxOfficeRevenueInMillions) {
            this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
            return this;
        }

        /**
         * Setter for academyAwardNominations.
         * @param  academyAwardNominations  int value for academyAwardNominations.
         * @return Builder
         */
        public Builder academyAwardNominations(int academyAwardNominations) {
            this.academyAwardNominations = academyAwardNominations;
            return this;
        }

        /**
         * Setter for academyAwardWins.
         * @param  academyAwardWins  int value for academyAwardWins.
         * @return Builder
         */
        public Builder academyAwardWins(int academyAwardWins) {
            this.academyAwardWins = academyAwardWins;
            return this;
        }

        /**
         * Setter for rottenTomatoesScore.
         * @param  rottenTomatoesScore  Object value for rottenTomatoesScore.
         * @return Builder
         */
        public Builder rottenTomatoesScore(Object rottenTomatoesScore) {
            this.rottenTomatoesScore = rottenTomatoesScore;
            return this;
        }

        /**
         * Builds a new {@link MovieDoc} object using the set fields.
         * @return {@link MovieDoc}
         */
        public MovieDoc build() {
            return new MovieDoc(id, name, runtimeInMinutes, budgetInMillions,
                    boxOfficeRevenueInMillions, academyAwardNominations, academyAwardWins,
                    rottenTomatoesScore);
        }
    }
}
