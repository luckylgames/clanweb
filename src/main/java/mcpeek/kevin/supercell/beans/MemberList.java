package mcpeek.kevin.supercell.beans;

import java.util.List;

interface MemberList {
    List getMembers();
    boolean add(ClanMember member);
    boolean remove(ClanMember member);
    boolean isEmpty();
    void setMembers(List<ClanMember> members);
}
