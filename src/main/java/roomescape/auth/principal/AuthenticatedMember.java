package roomescape.auth.principal;

import roomescape.domain.member.model.Member;
import roomescape.domain.member.model.MemberRole;

public record AuthenticatedMember(
        Long id,
        String name,
        String email,
        MemberRole role
) {
    public static AuthenticatedMember from(final Member member) {
        return new AuthenticatedMember(
                member.getId(),
                member.getName().getValue(),
                member.getEmail().getValue(),
                member.getRole()
        );
    }
}
