package com.stackroute.muzixApplication.repository;

import com.mongodb.Mongo;
import com.stackroute.muzixApplication.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * This is Track object repository interface to implement the track service in repository.
 */
@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

    //@Query("SELECT t FROM Track t WHERE t.trackName = ?1")
//    public List<Track> trackByName(String trackName);
}
