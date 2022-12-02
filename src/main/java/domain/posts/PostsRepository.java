package domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import web.dto.PostsSaveRequestDto;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
