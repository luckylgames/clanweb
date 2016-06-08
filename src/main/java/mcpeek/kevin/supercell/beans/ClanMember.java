package mcpeek.kevin.supercell.beans;

import java.io.Serializable;

public class ClanMember implements Serializable{
    private String tag;
    private String name;
    private Integer experienceLevel;
    private League league;
    private Integer numberOfTrophies;
    private String role;
    private Integer clanRank;
    private Integer previousClanRank;
    private Integer DonationsGiven;
    private Integer DonationsReceived;

    ClanMember() {}

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(Integer experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getNumberOfTrophies() {
        return numberOfTrophies;
    }

    public void setNumberOfTrophies(Integer numberOfTrophies) {
        this.numberOfTrophies = numberOfTrophies;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getClanRank() {
        return clanRank;
    }

    public void setClanRank(Integer clanRank) {
        this.clanRank = clanRank;
    }

    public Integer getPreviousClanRank() {
        return previousClanRank;
    }

    public void setPreviousClanRank(Integer previousClanRank) {
        this.previousClanRank = previousClanRank;
    }

    public Integer getDonationsGiven() {
        return DonationsGiven;
    }

    public void setDonationsGiven(Integer donationsGiven) {
        DonationsGiven = donationsGiven;
    }

    public Integer getDonationsReceived() {
        return DonationsReceived;
    }

    public void setDonationsReceived(Integer donationsReceived) {
        DonationsReceived = donationsReceived;
    }
}
