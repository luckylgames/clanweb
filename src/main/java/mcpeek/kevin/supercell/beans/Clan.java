package mcpeek.kevin.supercell.beans;

import java.io.Serializable;

public class Clan implements Serializable {
	private String tag;
	private String name;
	private Location location;
	private UrlContainer badgeUrls;
	private Integer	clanLevel;
	private Integer clanPoints;
	private Integer numberOfMembers;
	private String entranceType;
	private Integer requiredTrophies;
	private String warFrequency;
	private Integer	warWinStreak;
	private Integer warWins;
	private	Integer warTies;
	private Integer warLosses;
	private Boolean isWarLogPublic;
	private String description;
	private MemberList memberList;
	
	public Clan() {}

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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public UrlContainer getBadgeUrls() {
		return badgeUrls;
	}

	public void setBadgeUrls(UrlContainer badgeUrls) {
		this.badgeUrls = badgeUrls;
	}

	public Integer getClanLevel() {
		return clanLevel;
	}

	public void setClanLevel(Integer clanLevel) {
		this.clanLevel = clanLevel;
	}

	public Integer getClanPoints() {
		return clanPoints;
	}

	public void setClanPoints(Integer clanPoints) {
		this.clanPoints = clanPoints;
	}

	public Integer getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(Integer numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public String getEntranceType() {
		return entranceType;
	}

	public void setEntranceType(String entranceType) {
		this.entranceType = entranceType;
	}

	public Integer getRequiredTrophies() {
		return requiredTrophies;
	}

	public void setRequiredTrophies(Integer requiredTrophies) {
		this.requiredTrophies = requiredTrophies;
	}

	public String getWarFrequency() {
		return warFrequency;
	}

	public void setWarFrequency(String warFrequency) {
		this.warFrequency = warFrequency;
	}

	public Integer getWarWinStreak() {
		return warWinStreak;
	}

	public void setWarWinStreak(Integer warWinStreak) {
		this.warWinStreak = warWinStreak;
	}

	public Integer getWarWins() {
		return warWins;
	}

	public void setWarWins(Integer warWins) {
		this.warWins = warWins;
	}

	public Integer getWarTies() {
		return warTies;
	}

	public void setWarTies(Integer warTies) {
		this.warTies = warTies;
	}

	public Integer getWarLosses() {
		return warLosses;
	}

	public void setWarLosses(Integer warLosses) {
		this.warLosses = warLosses;
	}

	public Boolean getWarLogPublic() {
		return isWarLogPublic;
	}

	public void setWarLogPublic(Boolean warLogPublic) {
		isWarLogPublic = warLogPublic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}
}
