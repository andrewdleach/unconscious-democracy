package dev.redwoodlabs.undem.db;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface GovernmentRepository extends CrudRepository<Government, UUID> {
    
}
