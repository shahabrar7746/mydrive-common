package baseinterfaces;

import base.Entity;

public interface BasicDtoTable<ENTITY extends BasicDtoTable<ENTITY, DTO>, DTO extends Entity> extends HasId{

    void updateDto(DTO dto);

    void updateEntity(DTO dto);
}
