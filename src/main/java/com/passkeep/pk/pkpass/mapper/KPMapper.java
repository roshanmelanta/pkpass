package com.passkeep.pk.pkpass.mapper;

import com.passkeep.pk.pkpass.dto.KRecordDTO;
import com.passkeep.pk.pkpass.model.KRecord;
import org.mapstruct.Mapper;

@Mapper
public interface KPMapper {

  KRecordDTO getDtoFromEntity(KRecord source);

  KRecord getEntityFromDto(KRecordDTO source);

}
