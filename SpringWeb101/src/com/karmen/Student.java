package com.karmen;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private String[] operatingSystems;
    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("JPN", "Japan");
        countryOptions.put("IN", "India");

        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("JAVA", "JAVA");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("RUBY", "RUBY");
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
        this.favoriteLanguageOptions = favoriteLanguageOptions;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }
}
