package org.wecancodeit.reviews;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HashtagStorage {
    private HashtagRepository hashtags;
    public HashtagStorage(HashtagRepository hashtags){
        this.hashtags = hashtags;
    }
    public void addHashtag(Hashtag hashtag){
        hashtags.save(hashtag);
    }

    public Hashtag getHashtagById(Long id) {
        if (hashtags.findById(id).isPresent()) {
            return hashtags.findById(id).get();
        }
        else{
            return null;
        }
    }
    public Hashtag getHashtagByName(String hashtagName){
        return hashtags.findByName(hashtagName);
    }

    public Iterable<Hashtag> getAllHashtags() {
        return hashtags.findAll();
    }
}