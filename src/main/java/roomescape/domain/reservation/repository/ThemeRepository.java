package roomescape.domain.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roomescape.domain.reservation.model.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
}
