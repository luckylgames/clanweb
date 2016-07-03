package mcpeek.kevin.supercell.beans;

import org.json.simple.JSONArray;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class MemberListJSONArrayTest {
    private MemberListJSONArray memberListJSONArray = new MemberListJSONArray();;
    @Spy
    private JSONArray spyMembers;
    @Mock
    private ClanMember member1;
    @Mock
    private ClanMember member2;
    @Mock
    private ClanMember member3;

    @Before
    public void setUp() throws Exception {
        member1 = new ClanMember();
        member2 = new ClanMember();
        member3 = new ClanMember();
    }

    @Test
    public void setMembers_emptyJSONArray() throws Exception {
        memberListJSONArray.setMembers(spyMembers);

        assertTrue(memberListJSONArray.getMembers().isEmpty());
        assertTrue(memberListJSONArray.isEmpty());
    }

    @Test
    public void setMembers_nullJSONArray() throws Exception {
        memberListJSONArray.setMembers((List<ClanMember>) null);

        assertTrue(memberListJSONArray.getMembers().isEmpty());
        assertTrue(memberListJSONArray.isEmpty());
    }

    @Test
    public void setMembers_nonJSONArray() throws Exception {
        memberListJSONArray.setMembers(new ArrayList<ClanMember>());

        assertTrue(memberListJSONArray.getMembers().isEmpty());
        assertTrue(memberListJSONArray.isEmpty());
    }

    @Test
    public void setMembers_validJSONArray_WithNulls() throws Exception {
        spyMembers.add(null);
        spyMembers.add(null);
        spyMembers.add(null);
        memberListJSONArray.setMembers(spyMembers);

        JSONArray temp = memberListJSONArray.getMembers();
        assertTrue(temp.isEmpty());
        assertTrue(memberListJSONArray.getMembers().isEmpty());
        assertTrue(memberListJSONArray.isEmpty());
    }

    @Test
    // Expected input
    public void setMembers_validJSONArray_ClanMemberObjects() throws Exception {
        spyMembers.add(member1);
        spyMembers.add(member2);
        spyMembers.add(member3);
        memberListJSONArray.setMembers(spyMembers);

        Mockito.verify(spyMembers).add(member1);
        Mockito.verify(spyMembers).add(member2);
        Mockito.verify(spyMembers).add(member3);
        assertTrue(memberListJSONArray.getMembers().contains(member1));
        assertEquals(3, spyMembers.size());
    }
}