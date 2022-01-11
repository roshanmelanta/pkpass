package com.passkeep.pk.pkpass.repo;

import com.passkeep.pk.pkpass.model.KRecord;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<KRecord, UUID> {

}
