

package com.liblab.theonesdk.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CharacterDoc type.
 */
public class CharacterDoc {
    private String id;
    private String height;
    private String race;
    private String gender;
    private String birth;
    private String spouse;
    private String death;
    private String realm;
    private String hair;
    private String name;
    private String wikiUrl;

    /**
     * Default constructor.
     */
    public CharacterDoc() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  height  String value for height.
     * @param  race  String value for race.
     * @param  birth  String value for birth.
     * @param  spouse  String value for spouse.
     * @param  death  String value for death.
     * @param  realm  String value for realm.
     * @param  hair  String value for hair.
     * @param  name  String value for name.
     * @param  gender  String value for gender.
     * @param  wikiUrl  String value for wikiUrl.
     */
    public CharacterDoc(
            String id,
            String height,
            String race,
            String birth,
            String spouse,
            String death,
            String realm,
            String hair,
            String name,
            String gender,
            String wikiUrl) {
        this.id = id;
        this.height = height;
        this.race = race;
        this.gender = gender;
        this.birth = birth;
        this.spouse = spouse;
        this.death = death;
        this.realm = realm;
        this.hair = hair;
        this.name = name;
        this.wikiUrl = wikiUrl;
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
     * Getter for Height.
     * @return Returns the String
     */
    @JsonGetter("height")
    public String getHeight() {
        return height;
    }

    /**
     * Setter for Height.
     * @param height Value for String
     */
    @JsonSetter("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Getter for Race.
     * @return Returns the String
     */
    @JsonGetter("race")
    public String getRace() {
        return race;
    }

    /**
     * Setter for Race.
     * @param race Value for String
     */
    @JsonSetter("race")
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Getter for Gender.
     * @return Returns the String
     */
    @JsonGetter("gender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGender() {
        return gender;
    }

    /**
     * Setter for Gender.
     * @param gender Value for String
     */
    @JsonSetter("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for Birth.
     * @return Returns the String
     */
    @JsonGetter("birth")
    public String getBirth() {
        return birth;
    }

    /**
     * Setter for Birth.
     * @param birth Value for String
     */
    @JsonSetter("birth")
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * Getter for Spouse.
     * @return Returns the String
     */
    @JsonGetter("spouse")
    public String getSpouse() {
        return spouse;
    }

    /**
     * Setter for Spouse.
     * @param spouse Value for String
     */
    @JsonSetter("spouse")
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    /**
     * Getter for Death.
     * @return Returns the String
     */
    @JsonGetter("death")
    public String getDeath() {
        return death;
    }

    /**
     * Setter for Death.
     * @param death Value for String
     */
    @JsonSetter("death")
    public void setDeath(String death) {
        this.death = death;
    }

    /**
     * Getter for Realm.
     * @return Returns the String
     */
    @JsonGetter("realm")
    public String getRealm() {
        return realm;
    }

    /**
     * Setter for Realm.
     * @param realm Value for String
     */
    @JsonSetter("realm")
    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * Getter for Hair.
     * @return Returns the String
     */
    @JsonGetter("hair")
    public String getHair() {
        return hair;
    }

    /**
     * Setter for Hair.
     * @param hair Value for String
     */
    @JsonSetter("hair")
    public void setHair(String hair) {
        this.hair = hair;
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
     * Getter for WikiUrl.
     * @return Returns the String
     */
    @JsonGetter("wikiUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWikiUrl() {
        return wikiUrl;
    }

    /**
     * Setter for WikiUrl.
     * @param wikiUrl Value for String
     */
    @JsonSetter("wikiUrl")
    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    /**
     * Converts this CharacterDoc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CharacterDoc [" + "id=" + id + ", height=" + height + ", race=" + race + ", birth="
                + birth + ", spouse=" + spouse + ", death=" + death + ", realm=" + realm + ", hair="
                + hair + ", name=" + name + ", gender=" + gender + ", wikiUrl=" + wikiUrl + "]";
    }

    /**
     * Builds a new {@link CharacterDoc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CharacterDoc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, height, race, birth, spouse, death, realm, hair, name)
                .gender(getGender())
                .wikiUrl(getWikiUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link CharacterDoc}.
     */
    public static class Builder {
        private String id;
        private String height;
        private String race;
        private String birth;
        private String spouse;
        private String death;
        private String realm;
        private String hair;
        private String name;
        private String gender;
        private String wikiUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  height  String value for height.
         * @param  race  String value for race.
         * @param  birth  String value for birth.
         * @param  spouse  String value for spouse.
         * @param  death  String value for death.
         * @param  realm  String value for realm.
         * @param  hair  String value for hair.
         * @param  name  String value for name.
         */
        public Builder(String id, String height, String race, String birth, String spouse,
                String death, String realm, String hair, String name) {
            this.id = id;
            this.height = height;
            this.race = race;
            this.birth = birth;
            this.spouse = spouse;
            this.death = death;
            this.realm = realm;
            this.hair = hair;
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
         * Setter for height.
         * @param  height  String value for height.
         * @return Builder
         */
        public Builder height(String height) {
            this.height = height;
            return this;
        }

        /**
         * Setter for race.
         * @param  race  String value for race.
         * @return Builder
         */
        public Builder race(String race) {
            this.race = race;
            return this;
        }

        /**
         * Setter for birth.
         * @param  birth  String value for birth.
         * @return Builder
         */
        public Builder birth(String birth) {
            this.birth = birth;
            return this;
        }

        /**
         * Setter for spouse.
         * @param  spouse  String value for spouse.
         * @return Builder
         */
        public Builder spouse(String spouse) {
            this.spouse = spouse;
            return this;
        }

        /**
         * Setter for death.
         * @param  death  String value for death.
         * @return Builder
         */
        public Builder death(String death) {
            this.death = death;
            return this;
        }

        /**
         * Setter for realm.
         * @param  realm  String value for realm.
         * @return Builder
         */
        public Builder realm(String realm) {
            this.realm = realm;
            return this;
        }

        /**
         * Setter for hair.
         * @param  hair  String value for hair.
         * @return Builder
         */
        public Builder hair(String hair) {
            this.hair = hair;
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
         * Setter for gender.
         * @param  gender  String value for gender.
         * @return Builder
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Setter for wikiUrl.
         * @param  wikiUrl  String value for wikiUrl.
         * @return Builder
         */
        public Builder wikiUrl(String wikiUrl) {
            this.wikiUrl = wikiUrl;
            return this;
        }

        /**
         * Builds a new {@link CharacterDoc} object using the set fields.
         * @return {@link CharacterDoc}
         */
        public CharacterDoc build() {
            return new CharacterDoc(id, height, race, birth, spouse, death, realm, hair, name,
                    gender, wikiUrl);
        }
    }
}
