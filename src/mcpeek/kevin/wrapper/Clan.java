package mcpeek.kevin.wrapper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Clan {
	private String tag;
	private String name;
	private Location location;
	private JSONArray badgeUrls;
	private Integer	clanLevel;
	private Integer clanPoints;
	private Integer members;
	private String type;
	private Integer requiredTrophies;
	private String warFrequency;
	private Integer	warWinStreak;
	private Integer warWins;
	private	Integer warTies;
	private Integer warLosses;
	private Boolean isWarLogPublic;
	private String description;
	private JSONArray memberList;
	
	public Clan(String clanAsString) {
		JSONParser parser = new JSONParser();
		JSONObject clan = new JSONObject();
		try {
			clan = (JSONObject) parser.parse(clanAsString);
			System.out.println(clan.get("tag"));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}

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

	public JSONObject getLocation() {
		return location;
	}

	public void setLocation(JSONObject location) {
		this.location = location;
	}

	public JSONArray getBadgeUrls() {
		return badgeUrls;
	}

	public void setBadgeUrls(JSONArray badgeUrls) {
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

	public Integer getMembers() {
		return members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Boolean getIsWarLogPublic() {
		return isWarLogPublic;
	}

	public void setIsWarLogPublic(Boolean isWarLogPublic) {
		this.isWarLogPublic = isWarLogPublic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JSONArray getMemberList() {
		return memberList;
	}

	public void setMemberList(JSONArray memberList) {
		this.memberList = memberList;
	}
}
