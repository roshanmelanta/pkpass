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
public class KRecordDTO implements Serializable {

  private static final long serialVersionUID = -4124803827803484468L;

  private String tag;
  private String pass;
}
