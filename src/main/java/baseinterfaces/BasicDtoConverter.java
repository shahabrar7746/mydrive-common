package baseinterfaces;

import base.Entity;

public interface BasicDtoConverter <ENTITY extends HasId, DTO extends Entity>{

    void updateDto(DTO dto);

    void updateEntity(DTO dto);
}
