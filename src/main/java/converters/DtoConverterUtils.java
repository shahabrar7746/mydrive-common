package converters;

import base.Entity;
import baseinterfaces.BasicDtoTable;

public final class DtoConverterUtils {
    private DtoConverterUtils(){
        throw new IllegalStateException("Util class");
    }

    public static <DTO extends Entity, ENTITY extends BasicDtoTable<ENTITY, DTO>> DTO convertToDto(ENTITY entity, Class<DTO> dtoClass){
        try {
            DTO dto = dtoClass.getConstructor().newInstance();
            entity.updateDto(dto);
            return dto;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <ENTITY extends BasicDtoTable<ENTITY, DTO>, DTO extends Entity> ENTITY convertToEntity(DTO dto, Class<ENTITY> entityClass){
        try {
            ENTITY entity = entityClass.getConstructor()
                    .newInstance();
            entity.updateEntity(dto);
            return entity;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
