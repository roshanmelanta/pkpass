package com.passkeep.pk.pkpass.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "record")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class KRecord implements Serializable {

  private static final long serialVersionUID = -7340768986615113893L;

  @Id
  @GeneratedValue
  @Column(name = "uuid", nullable = false)
  private UUID uuid;

  @Column(name = "tag", nullable = false)
  private String tag;

  @Column(name = "pass")
  private String pass;

  @Column(name = "created_at")
  @CreationTimestamp
  private Timestamp createdAt;

  @Column(name = "updated_at")
  @UpdateTimestamp
  private Timestamp updatedAt;

  @Column(name = "valid")
  private Boolean valid;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "uuid_user")
  private User user;

}
