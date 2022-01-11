package com.passkeep.pk.pkpass.repo;

import com.passkeep.pk.pkpass.model.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, UUID> {

}
