package com.tripsync.document.repository;

import com.tripsync.document.entity.TripDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TripDocumentRepository extends JpaRepository<TripDocument,Long> {

    List<TripDocument> findAllByTripIdOrderByCreatedAtDesc(Long tripId);

    Optional<TripDocument> findByIdAndTripId(Long id, Long tripId);
}
