package mcpeek.kevin.supercell.beans;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class ClanTest {
    private Clan clanBean;

    @Before
    public void setUp() throws Exception{
        clanBean = new Clan();
        clanBean.setTag("#AA22BB");
        clanBean.setName("Test Name");
        clanBean.setClanLevel(1);
        clanBean.setClanPoints(1000);
        clanBean.setDescription("Test Clan Description");
        clanBean.setEntranceType("Invite Only");
        clanBean.setRequiredTrophies(100);
        clanBean.setNumberOfMembers(40);
        clanBean.setWarFrequency("Weekly");
        clanBean.setWarLogPublic(true);
        clanBean.setWarTies(2);
        clanBean.setWarWinStreak(3);
        clanBean.setWarWins(10);
        clanBean.setWarLosses(5);

        Location location = Mockito.mock(Location.class);
        UrlContainer badgeUrls = Mockito.mock(UrlContainer.class);
        MemberList memberList = Mockito.mock(MemberList.class);

        clanBean.setLocation(location);
        clanBean.setBadgeUrls(badgeUrls);
        clanBean.setMemberList(memberList);

        initializeLocation();
        initializeBadgeUrls();
        initializeMemberList();
    }

    private void initializeLocation() {
        when(clanBean.getLocation().getId()).thenReturn(32000249);
        when(clanBean.getLocation().getName()).thenReturn("United States");
        when(clanBean.getLocation().isCountry()).thenReturn(true);
        when(clanBean.getLocation().getCountryCode()).thenReturn("US");
    }

    private void initializeBadgeUrls() {
    }

    private void initializeMemberList() {
    }

    @Test
    public void getTag() throws Exception {

    }

    @Test
    public void setTag() throws Exception {

    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void setName() throws Exception {

    }

    @Test
    public void getLocation() throws Exception {

    }

    @Test
    public void setLocation() throws Exception {

    }

    @Test
    public void getBadgeUrls() throws Exception {

    }

    @Test
    public void setBadgeUrls() throws Exception {

    }

    @Test
    public void getClanLevel() throws Exception {

    }

    @Test
    public void setClanLevel() throws Exception {

    }

    @Test
    public void getClanPoints() throws Exception {

    }

    @Test
    public void setClanPoints() throws Exception {

    }

    @Test
    public void getNumberOfMembers() throws Exception {

    }

    @Test
    public void setNumberOfMembers() throws Exception {

    }

    @Test
    public void getEntranceType() throws Exception {

    }

    @Test
    public void setEntranceType() throws Exception {

    }

    @Test
    public void getRequiredTrophies() throws Exception {

    }

    @Test
    public void setRequiredTrophies() throws Exception {

    }

    @Test
    public void getWarFrequency() throws Exception {

    }

    @Test
    public void setWarFrequency() throws Exception {

    }

    @Test
    public void getWarWinStreak() throws Exception {

    }

    @Test
    public void setWarWinStreak() throws Exception {

    }

    @Test
    public void getWarWins() throws Exception {

    }

    @Test
    public void setWarWins() throws Exception {

    }

    @Test
    public void getWarTies() throws Exception {

    }

    @Test
    public void setWarTies() throws Exception {

    }

    @Test
    public void getWarLosses() throws Exception {

    }

    @Test
    public void setWarLosses() throws Exception {

    }

    @Test
    public void getWarLogPublic() throws Exception {

    }

    @Test
    public void setWarLogPublic() throws Exception {

    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void setDescription() throws Exception {

    }

    @Test
    public void getMemberList() throws Exception {

    }

    @Test
    public void setMemberList() throws Exception {

    }

}