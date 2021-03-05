package org.wecancodeit.reviews;
import org.springframework.data.repository.CrudRepository;
public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    Hashtag findByName(String hashtagName);
}