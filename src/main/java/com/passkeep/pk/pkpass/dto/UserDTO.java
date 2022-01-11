package com.passkeep.pk.pkpass.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDTO implements Serializable {

  private static final long serialVersionUID = 3231991917507897314L;

  private String username;
}
