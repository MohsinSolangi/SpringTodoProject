package com.mohsin.Todo.Todo.mapper;


import com.mohsin.Todo.Todo.Entity.StatusValue;
import com.mohsin.Todo.Todo.Entity.Todo;
import com.mohsin.Todo.Todo.dto.StatusValueDto;
import com.mohsin.Todo.Todo.dto.TodoDto;

public class StatusValueMapper {

        //jpa entity to dto
    public static StatusValueDto mapToStatusValueDto(StatusValue statusValue){
        StatusValueDto statusValueDto = new StatusValueDto(
                statusValue.getId(),
                statusValue.getStatus()
        );

        return statusValueDto;
    }

        //dto to Jpa entity
        public static StatusValue mapToStatusValue(StatusValueDto statusValueDto){
            StatusValue statusValue = new StatusValue(
                statusValueDto.getId(),
                    statusValueDto.getStatus()
            );
            return statusValue;
        }


}
