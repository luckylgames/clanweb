package mcpeek.kevin.supercell.beans;

import org.json.simple.JSONArray;

import java.io.Serializable;
import java.util.List;

public class MemberListJSONArray implements Serializable, MemberList {
    private JSONArray members;

    public MemberListJSONArray() {}

    public boolean add(ClanMember member) {
        return members.add(member);
    }

    public boolean remove(ClanMember member) {
        return members.remove(member);
    }

    public JSONArray getMembers() {
        return members;
    }

    public void setMembers(List<ClanMember> listToAdd) {
        if (isValidJSONArray(listToAdd))
            members.addAll(listToAdd);
        else
            this.members = new JSONArray();
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }

    private boolean isValidJSONArray(List<ClanMember> testList) {
        return testList != null && testList instanceof JSONArray;
    }
}
