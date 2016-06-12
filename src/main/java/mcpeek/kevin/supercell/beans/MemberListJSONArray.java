package mcpeek.kevin.supercell.beans;

import org.json.simple.JSONArray;

import java.io.Serializable;
import java.util.List;

public class MemberListJSONArray implements Serializable, MemberList {
    private JSONArray members;

    public MemberListJSONArray() {
        members = new JSONArray();
    }

    public boolean add(ClanMember member) {
        return members.add(member);
    }

    public boolean remove(ClanMember member) {
        return members.remove(member);
    }

    public JSONArray getMembers() {
        return (members == null) ? new JSONArray() : members;
    }

    public void setMembers(List<ClanMember> listToAdd) {
        if (isValidJSONArrayOfClanMembers(listToAdd))
            members.addAll(listToAdd);
        else
            this.members = new JSONArray();
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }

    private boolean isValidJSONArrayOfClanMembers(List<ClanMember> testList) {
        int validElements = 0;
        if(testList != null && testList instanceof JSONArray) {
            for (ClanMember testMember : testList)
                if (isValidClanMember(testMember))
                    validElements += 1;
        }
        return testList != null && validElements == testList.size();
    }

    private boolean isValidClanMember(Object testClanMember) {
        return testClanMember != null && testClanMember instanceof ClanMember;
    }
}