package com.passkeep.pk.pkpass.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

  private static final long serialVersionUID = 6736407220402282809L;

  @Id
  @GeneratedValue
  @Column(name = "uuid", nullable = false)
  private UUID uuid;

  @Column(name = "username")
  private String username;

  @Column(name = "service_password")
  private String servicePassword;

  @ToString.Exclude
  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<KRecord> records;

  @Column(name = "created_at")
  @CreationTimestamp
  private Timestamp createdAt;

  @Column(name = "updated_at")
  @UpdateTimestamp
  private Timestamp updatedAt;


}
